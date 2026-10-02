# ExternalTypeHandlerTest

ผมออกแบบชุดทดสอบโดยใช้ **Mockito** จำลอง `SettableBeanProperty`, `TypeDeserializer`, `TypeIdResolver`, `DeserializationContext`, `PropertyValueBuffer`, `PropertyBasedCreator` และใช้ **`JsonFactory` จริง** (จาก jackson-core) สร้าง `JsonParser`/`TokenBuffer` จริง เพื่อให้ผลลัพธ์ของ `handlePropertyValue`, `handleTypePropertyValue`, `complete(...)` เป็นไปตาม logic จริงของคลาส

**หมายเหตุสำคัญเรื่อง assumption ที่ระบุในคอมเมนต์โค้ด:**
- เนื่องจาก mock ของ `DeserializationContext` ไม่ได้ stub เมธอด `mappingException(...)` จึงคืนค่า `null` (ค่า default ของ Mockito) แล้วโค้ดจริงเขียน `throw ctxt.mappingException(...)` ซึ่งเมื่อ throw `null` จะเกิด `NullPointerException` จาก JVM — ใช้พฤติกรรมนี้เป็น "สัญญาณ" ว่าโค้ด**เดินทางไปถึง branch throw exception จริง** โดยไม่ต้องเดา signature ของ `mappingException` ที่ไม่ได้อยู่ใน source ที่ให้มา
- `TypeDeserializer.deserializeIfNatural(...)` เป็น static method จริงจาก jackson-databind (ไม่ได้อยู่ใน source ที่ให้มา) — ใช้พฤติกรรมมาตรฐานที่รู้จักกันทั่วไป (คืนค่า non-null เมื่อ token ตรงกับ type แบบ "natural" เช่น `VALUE_STRING` กับ `String.class`) กำกับด้วยคอมเมนต์ในโค้ด
- `PropertyValueBuffer`/`PropertyBasedCreator` ไม่ได้อยู่ใน source ที่ให้ แต่ทราบ signature จากการเรียกใช้ในซอร์ส (`findCreatorProperty`, `assignParameter`, `build`) เท่านั้น

```java
package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
// Import คลาสเป้าหมายอย่างชัดเจนตามข้อกำหนด (ทดสอบอยู่ในแพ็กเกจเดียวกัน)
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;

public class ExternalTypeHandlerTest
{
    private static final JsonFactory JSON_FACTORY = new JsonFactory();

    // ---------------------------------------------------------------
    // Helpers
    // ---------------------------------------------------------------

    private SettableBeanProperty mockProperty(String name, JavaType type)
    {
        SettableBeanProperty p = mock(SettableBeanProperty.class);
        when(p.getName()).thenReturn(name);
        when(p.getType()).thenReturn(type);
        return p;
    }

    private TypeDeserializer mockTypeDeserializer(String propName, Class<?> defaultImpl)
    {
        TypeDeserializer td = mock(TypeDeserializer.class);
        when(td.getPropertyName()).thenReturn(propName);
        when(td.getDefaultImpl()).thenReturn(defaultImpl);
        if (defaultImpl != null) {
            TypeIdResolver resolver = mock(TypeIdResolver.class);
            when(resolver.idFromValueAndType(isNull(), eq(defaultImpl)))
                    .thenReturn("defaultTypeId");
            when(td.getTypeIdResolver()).thenReturn(resolver);
        }
        return td;
    }

    private JsonParser parserFor(String json) throws IOException
    {
        return JSON_FACTORY.createParser(json);
    }

    // ---------------------------------------------------------------
    // handleTypePropertyValue
    // ---------------------------------------------------------------

    @Test
    public void handleTypePropertyValue_unknownProperty_returnsFalse() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        JsonParser jp = parserFor("\"foo\"");
        jp.nextToken();

        boolean handled = handler.handleTypePropertyValue(
                jp, mock(DeserializationContext.class), "unknown", new Object());
        assertFalse(handled);
    }

    @Test
    public void handleTypePropertyValue_propertyNameButNotTypeProperty_returnsFalse() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        JsonParser jp = parserFor("\"foo\"");
        jp.nextToken();

        // "value" ถูก map ไปที่ index เดียวกัน แต่ hasTypePropertyName("value") == false
        boolean handled = handler.handleTypePropertyValue(
                jp, mock(DeserializationContext.class), "value", new Object());
        assertFalse(handled);
    }

    @Test
    public void handleTypePropertyValue_beanNullBuffersTypeId() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        JsonParser jp = parserFor("\"myType\"");
        jp.nextToken();
        DeserializationContext ctxt = mock(DeserializationContext.class);

        boolean handled = handler.handleTypePropertyValue(jp, ctxt, "@type", null);
        assertTrue(handled);
        verify(prop, never()).deserializeAndSet(any(), any(), any());
    }

    @Test
    public void handleTypePropertyValue_deserializesWhenTokenAlreadyBuffered() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        JsonParser valueParser = parserFor("\"theValue\"");
        valueParser.nextToken();
        assertTrue(handler.handlePropertyValue(valueParser, ctxt, "value", bean));

        JsonParser typeParser = parserFor("\"myType\"");
        typeParser.nextToken();
        assertTrue(handler.handleTypePropertyValue(typeParser, ctxt, "@type", bean));

        verify(prop, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    // ---------------------------------------------------------------
    // handlePropertyValue
    // ---------------------------------------------------------------

    @Test
    public void handlePropertyValue_unknownProperty_returnsFalse() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        JsonParser jp = parserFor("\"foo\"");
        jp.nextToken();

        boolean handled = handler.handlePropertyValue(
                jp, mock(DeserializationContext.class), "unknown", new Object());
        assertFalse(handled);
    }

    @Test
    public void handlePropertyValue_nullPropName_returnsFalse() throws IOException
    {
        // ทดสอบ input ผิดปกติ: propName = null -> HashMap.get(null) คืน null -> ถือว่า unknown
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        JsonParser jp = parserFor("\"foo\"");
        jp.nextToken();

        boolean handled = handler.handlePropertyValue(
                jp, mock(DeserializationContext.class), null, new Object());
        assertFalse(handled);
    }

    @Test
    public void handlePropertyValue_typeProperty_bufferTypeId_beanNull() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        JsonParser jp = parserFor("\"myType\"");
        jp.nextToken();

        boolean handled = handler.handlePropertyValue(
                jp, mock(DeserializationContext.class), "@type", null);
        assertTrue(handled);
        verify(prop, never()).deserializeAndSet(any(), any(), any());
    }

    @Test
    public void handlePropertyValue_normalProperty_thenTypeProperty_triggersDeserialize() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        JsonParser typeParser = parserFor("\"myType\"");
        typeParser.nextToken();
        assertTrue(handler.handlePropertyValue(typeParser, ctxt, "@type", bean));
        verify(prop, never()).deserializeAndSet(any(), any(), any());

        JsonParser valueParser = parserFor("\"theValue\"");
        valueParser.nextToken();
        assertTrue(handler.handlePropertyValue(valueParser, ctxt, "value", bean));

        verify(prop, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    @Test
    public void handlePropertyValue_normalProperty_beanNull_buffersOnly() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        JsonParser jp = parserFor("\"theValue\"");
        jp.nextToken();

        boolean handled = handler.handlePropertyValue(
                jp, mock(DeserializationContext.class), "value", null);
        assertTrue(handled);
        verify(prop, never()).deserializeAndSet(any(), any(), any());
    }

    // ---------------------------------------------------------------
    // complete(JsonParser, ctxt, bean)
    // ---------------------------------------------------------------

    @Test
    public void complete_skipsWhenNoTypeIdNoTokens() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();
        JsonParser jp = parserFor("{}");
        jp.nextToken();

        Object result = handler.complete(jp, ctxt, bean);
        assertSame(bean, result);
        verify(prop, never()).deserializeAndSet(any(), any(), any());
    }

    @Test
    public void complete_noPropertiesConfigured_returnsBeanUnchanged() throws IOException
    {
        // boundary: array ของ properties ยาว 0 -> loop ไม่รันเลย
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();
        JsonParser jp = parserFor("{}");
        jp.nextToken();

        Object result = handler.complete(jp, ctxt, bean);
        assertSame(bean, result);
    }

    @Test
    public void complete_naturalScalarDeserialization_setsDirectly() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        // buffer ค่า (bean = null ตอนนี้เพื่อไม่ให้ deserialize ทันที) ไม่มี type id ให้เลย
        JsonParser valueParser = parserFor("\"naturalValue\"");
        valueParser.nextToken();
        handler.handlePropertyValue(valueParser, ctxt, "value", null);

        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        // อาศัยพฤติกรรมมาตรฐานของ TypeDeserializer.deserializeIfNatural (VALUE_STRING + String.class)
        Object result = handler.complete(completionParser, ctxt, bean);

        assertSame(bean, result);
        verify(prop, times(1)).set(eq(bean), eq("naturalValue"));
        verify(prop, never()).deserializeAndSet(any(), any(), any());
    }

    @Test
    public void complete_scalarNotNatural_noDefaultType_throwsBecauseMappingExceptionNull() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(Integer.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null); // ไม่มี defaultImpl
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        JsonParser valueParser = parserFor("\"abc\"");
        valueParser.nextToken();
        handler.handlePropertyValue(valueParser, ctxt, "value", null);

        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        try {
            handler.complete(completionParser, ctxt, bean);
            fail("คาดว่าจะเกิด NullPointerException เพราะ ctxt.mappingException(...) ไม่ถูก stub "
                    + "(คืน null) แล้วโค้ดจริงเขียน 'throw <null>' -- ใช้เป็นสัญญาณว่า branch "
                    + "'ไม่ใช่ natural + ไม่มี defaultType' ถูก execute จริง");
        } catch (NullPointerException expected) {
            // expected - ดูคอมเมนต์ด้านบน
        }
    }

    @Test
    public void complete_scalarNotNatural_withDefaultType_usesDefaultTypeId() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(Integer.class));
        TypeDeserializer td = mockTypeDeserializer("@type", String.class); // มี defaultImpl
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        JsonParser valueParser = parserFor("\"abc\"");
        valueParser.nextToken();
        handler.handlePropertyValue(valueParser, ctxt, "value", null);

        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        Object result = handler.complete(completionParser, ctxt, bean);
        assertSame(bean, result);
        verify(prop, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    @Test
    public void complete_nonScalarFirstToken_bypassesDefaultTypeCheck() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(Object.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null); // ไม่มี default -- แต่ไม่ควรถูกเช็คในกรณีนี้
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        JsonParser valueParser = parserFor("{\"x\":1}");
        valueParser.nextToken(); // START_OBJECT (ไม่ใช่ scalar)
        handler.handlePropertyValue(valueParser, ctxt, "value", null);

        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        // ตาม source: เมื่อ firstToken() ไม่เป็น scalar โค้ดจะไม่เข้าเช็ค hasDefaultType เลย
        // แล้วเรียก _deserializeAndSet ต่อด้วย typeId == null ทันที (พฤติกรรมจริงของซอร์สที่ให้มา)
        Object result = handler.complete(completionParser, ctxt, bean);
        assertSame(bean, result);
        verify(prop, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    @Test
    public void complete_typeIdPresentButNoTokens_throwsBecauseMappingExceptionNull() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        JsonParser typeParser = parserFor("\"myType\"");
        typeParser.nextToken();
        handler.handlePropertyValue(typeParser, ctxt, "@type", null);
        // ไม่เคยส่งค่า "value" -> _tokens[index] ยังเป็น null

        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        try {
            handler.complete(completionParser, ctxt, bean);
            fail("คาดว่าจะเกิด NullPointerException จาก 'throw ctxt.mappingException(...)' "
                    + "(mock คืน null) -- verify branch 'typeId present แต่ token ยัง missing'");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    @Test
    public void complete_typeIdAndTokenBothPresent_deserializesNormally() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);

        // buffer ทั้งสองด้วย bean == null เพื่อไม่ให้เกิด immediate-deserialize optimization
        // ทำให้ตอนเรียก complete(), typeId != null AND tokens[i] != null พร้อมกัน
        JsonParser typeParser = parserFor("\"myType\"");
        typeParser.nextToken();
        handler.handlePropertyValue(typeParser, ctxt, "@type", null);

        JsonParser valueParser = parserFor("\"actualValue\"");
        valueParser.nextToken();
        handler.handlePropertyValue(valueParser, ctxt, "value", null);

        Object bean = new Object();
        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        Object result = handler.complete(completionParser, ctxt, bean);
        assertSame(bean, result);
        verify(prop, times(1)).deserializeAndSet(any(JsonParser.class), eq(ctxt), eq(bean));
    }

    // ---------------------------------------------------------------
    // complete(JsonParser, ctxt, PropertyValueBuffer, PropertyBasedCreator)
    // ---------------------------------------------------------------

    @Test
    public void complete_creatorBased_assignsCreatorAndNonCreatorProperties() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty creatorProp = mockProperty("creatorValue",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer creatorTd = mockTypeDeserializer("@ctype", null);
        SettableBeanProperty normalProp = mockProperty("normalValue",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer normalTd = mockTypeDeserializer("@ntype", null);

        b.addExternal(creatorProp, creatorTd);
        b.addExternal(normalProp, normalTd);
        ExternalTypeHandler handler = b.build().start();

        DeserializationContext ctxt = mock(DeserializationContext.class);

        JsonParser ctypeParser = parserFor("\"cType\"");
        ctypeParser.nextToken();
        handler.handleTypePropertyValue(ctypeParser, ctxt, "@ctype", null);
        JsonParser cvalParser = parserFor("\"cVal\"");
        cvalParser.nextToken();
        handler.handlePropertyValue(cvalParser, ctxt, "creatorValue", null);

        JsonParser ntypeParser = parserFor("\"nType\"");
        ntypeParser.nextToken();
        handler.handleTypePropertyValue(ntypeParser, ctxt, "@ntype", null);
        JsonParser nvalParser = parserFor("\"nVal\"");
        nvalParser.nextToken();
        handler.handlePropertyValue(nvalParser, ctxt, "normalValue", null);

        // Signature ของ PropertyValueBuffer/PropertyBasedCreator อ้างอิงจากวิธีเรียกใช้ใน source เท่านั้น
        PropertyValueBuffer buffer = mock(PropertyValueBuffer.class);
        PropertyBasedCreator creator = mock(PropertyBasedCreator.class);
        when(creator.findCreatorProperty("creatorValue")).thenReturn(creatorProp);
        when(creator.findCreatorProperty("normalValue")).thenReturn(null);
        Object builtBean = new Object();
        when(creator.build(eq(ctxt), eq(buffer))).thenReturn(builtBean);

        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        Object result = handler.complete(completionParser, ctxt, buffer, creator);

        assertSame(builtBean, result);
        verify(buffer, times(1)).assignParameter(eq(creatorProp), any());
        verify(normalProp, times(1)).set(eq(builtBean), any());
        verify(creatorProp, never()).set(any(), any());
    }

    // ---------------------------------------------------------------
    // Builder / start()
    // ---------------------------------------------------------------

    @Test
    public void start_returnsFreshBufferedInstanceEachTime() throws IOException
    {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler template = b.build();

        ExternalTypeHandler first = template.start();
        ExternalTypeHandler second = template.start();

        DeserializationContext ctxt = mock(DeserializationContext.class);
        JsonParser jp = parserFor("\"typeA\"");
        jp.nextToken();
        first.handleTypePropertyValue(jp, ctxt, "@type", null);

        Object bean = new Object();
        JsonParser completionParser = parserFor("{}");
        completionParser.nextToken();

        Object result = second.complete(completionParser, ctxt, bean);
        assertSame(bean, result); // 'second' ไม่ได้รับผลกระทบจาก 'first' -> buffer อิสระกัน
        verify(prop, never()).deserializeAndSet(any(), any(), any());
    }

    @Test(expected = NullPointerException.class)
    public void usingBuiltHandlerWithoutStart_throwsBecauseBuffersNotInitialized() throws IOException
    {
        // edge case: build() คืน handler ที่ _typeIds/_tokens เป็น null (ยังไม่ start())
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        SettableBeanProperty prop = mockProperty("value",
                TypeFactory.defaultInstance().constructType(String.class));
        TypeDeserializer td = mockTypeDeserializer("@type", null);
        b.addExternal(prop, td);
        ExternalTypeHandler handler = b.build(); // ไม่เรียก start()

        JsonParser jp = parserFor("\"typeA\"");
        jp.nextToken();
        handler.handleTypePropertyValue(jp, mock(DeserializationContext.class), "@type", null);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `handleTypePropertyValue_unknownProperty_returnsFalse` | `I == null` → return false |
| `handleTypePropertyValue_propertyNameButNotTypeProperty_returnsFalse` | `!prop.hasTypePropertyName(propName)` → return false |
| `handleTypePropertyValue_beanNullBuffersTypeId` | `canDeserialize == false` (bean null) → else branch เก็บ `_typeIds[index]` |
| `handleTypePropertyValue_deserializesWhenTokenAlreadyBuffered` | `canDeserialize == true` → เรียก `_deserializeAndSet`, clear token |
| `handlePropertyValue_unknownProperty_returnsFalse` | `I == null` → return false |
| `handlePropertyValue_nullPropName_returnsFalse` | Input ผิดปกติ: propName = null |
| `handlePropertyValue_typeProperty_bufferTypeId_beanNull` | `prop.hasTypePropertyName == true`, `canDeserialize == false` |
| `handlePropertyValue_normalProperty_thenTypeProperty_triggersDeserialize` | ทั้งสอง branch (`hasTypePropertyName` true/false) + `canDeserialize == true` |
| `handlePropertyValue_normalProperty_beanNull_buffersOnly` | `hasTypePropertyName == false`, `canDeserialize == false` |
| `complete_skipsWhenNoTypeIdNoTokens` | `typeId==null && tokens==null` → `continue` |
| `complete_noPropertiesConfigured_returnsBeanUnchanged` | Loop boundary: `len == 0` |
| `complete_naturalScalarDeserialization_setsDirectly` | `t.isScalarValue()==true`, `result != null` → `extProp.set` + `continue` |
| `complete_scalarNotNatural_noDefaultType_throwsBecauseMappingExceptionNull` | scalar, natural=null, `!hasDefaultType()` → throw |
| `complete_scalarNotNatural_withDefaultType_usesDefaultTypeId` | scalar, natural=null, `hasDefaultType()==true` → ใช้ defaultTypeId |
| `complete_nonScalarFirstToken_bypassesDefaultTypeCheck` | `t.isScalarValue()==false` → ข้าม if-block ทั้งหมด |
| `complete_typeIdPresentButNoTokens_throwsBecauseMappingExceptionNull` | `typeId!=null`, `_tokens[i]==null` (else-if) → throw |
| `complete_typeIdAndTokenBothPresent_deserializesNormally` | `typeId!=null`, `_tokens[i]!=null` → เรียก `_deserializeAndSet` ปกติ |
| `complete_creatorBased_assignsCreatorAndNonCreatorProperties` | overload ที่สอง: `findCreatorProperty` true/false, `assignParameter`, `prop.set` |
| `start_returnsFreshBufferedInstanceEachTime` | Constructor `ExternalTypeHandler(ExternalTypeHandler h)` สร้าง buffer ใหม่แยกกัน |
| `usingBuiltHandlerWithoutStart_throwsBecauseBuffersNotInitialized` | Boundary/misuse: เรียกก่อน `start()` |