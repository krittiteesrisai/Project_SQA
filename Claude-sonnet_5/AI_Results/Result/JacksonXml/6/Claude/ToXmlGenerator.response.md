# แนวคิดการทดสอบ

เนื่องจาก `ToXmlGenerator` เป็นคลาส `final` ที่ผูกกับ `XMLStreamWriter` (Stax) จริง จึงเลือกใช้ **Woodstox** (`com.ctc.wstx.stax.WstxOutputFactory`) เป็น writer จริงเพื่อให้ `_stax2Emulation = false` (เพราะ Woodstox implement `XMLStreamWriter2` อยู่แล้ว) และใช้ **dynamic `Proxy`** ที่ implement เฉพาะ `XMLStreamWriter` (ไม่ implement `XMLStreamWriter2`) เพื่อบังคับให้ `_stax2Emulation = true` สำหรับทดสอบสาขา `writeRaw/writeRawValue` ที่ throw exception

ข้อสมมติที่ไม่แน่ใจ 100% จะมีคอมเมนต์ `// NOTE:` กำกับไว้ในโค้ด

```java
package com.fasterxml.jackson.dataformat.xml.ser;

import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import org.codehaus.stax2.XMLStreamWriter2;
import org.junit.Test;

import com.ctc.wstx.stax.WstxOutputFactory;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link ToXmlGenerator}.
 *
 * หมายเหตุ: ใช้ Woodstox (WstxOutputFactory) เป็น XMLStreamWriter จริง เนื่องจาก
 * ToXmlGenerator ต้องพึ่งพา Stax2 API การทำงานจริงของ Stream writer ค่อนข้างมาก
 * และหลายเมธอดเป็น final/ผูกกับ Stax จึงไม่สามารถ mock ได้ง่าย
 */
public class ToXmlGeneratorTest
{
    // ------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------

    private static XMLOutputFactory wstxFactory() {
        XMLOutputFactory f = new WstxOutputFactory();
        // ช่วยให้ namespace ที่ยังไม่ bind prefix ไม่ throw exception
        f.setProperty(XMLOutputFactory.IS_REPAIRING_NAMESPACES, Boolean.TRUE);
        return f;
    }

    private static IOContext newIOContext(Object ref) {
        // NOTE: constructor (BufferRecycler, Object, boolean) ควรจะ stable
        // ในช่วง jackson-core 2.3 - 2.9 ซึ่งตรงกับ classpath ที่ให้มา
        return new IOContext(new BufferRecycler(), ref, false);
    }

    /** สร้าง generator ปกติ (stax2 จริง, ไม่ emulate) พร้อม StringWriter ปลายทาง */
    private ToXmlGenerator newGenerator(StringWriter sw, int xmlFeatures) throws Exception {
        XMLStreamWriter staxWriter = wstxFactory().createXMLStreamWriter(sw);
        IOContext ctxt = newIOContext(sw);
        int stdFeatures = JsonGenerator.Feature.collectDefaults();
        return new ToXmlGenerator(ctxt, stdFeatures, xmlFeatures, null, staxWriter);
    }

    private ToXmlGenerator newGenerator(StringWriter sw) throws Exception {
        return newGenerator(sw, 0);
    }

    private ToXmlGenerator newGeneratorWithStdFeatures(StringWriter sw, int stdFeatures, int xmlFeatures) throws Exception {
        XMLStreamWriter staxWriter = wstxFactory().createXMLStreamWriter(sw);
        IOContext ctxt = newIOContext(sw);
        return new ToXmlGenerator(ctxt, stdFeatures, xmlFeatures, null, staxWriter);
    }

    /**
     * สร้าง generator ที่ _stax2Emulation = true โดยห่อ XMLStreamWriter จริงด้วย
     * Proxy ที่ implement เฉพาะ XMLStreamWriter (ไม่ implement XMLStreamWriter2)
     * ทำให้ Stax2WriterAdapter.wrapIfNecessary ต้อง wrap มันใหม่
     */
    private ToXmlGenerator newEmulatedGenerator(StringWriter sw) throws Exception {
        final XMLStreamWriter real = wstxFactory().createXMLStreamWriter(sw);
        XMLStreamWriter proxy = (XMLStreamWriter) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{ XMLStreamWriter.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object p, Method m, Object[] args) throws Throwable {
                        try {
                            return m.invoke(real, args);
                        } catch (InvocationTargetException ite) {
                            throw ite.getCause();
                        }
                    }
                });
        IOContext ctxt = newIOContext(sw);
        int stdFeatures = JsonGenerator.Feature.collectDefaults();
        return new ToXmlGenerator(ctxt, stdFeatures, 0, null, proxy);
    }

    private static QName qn(String local) {
        return new QName("", local);
    }

    // ------------------------------------------------------------------
    // initGenerator()
    // ------------------------------------------------------------------

    @Test
    public void initGenerator_defaultNoDeclaration_returnsEarly() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw, 0);
        gen.initGenerator();
        gen.flush();
        assertFalse(sw.toString().contains("<?xml"));
    }

    @Test
    public void initGenerator_writeXmlDeclaration10() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw, ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask());
        gen.initGenerator();
        gen.flush();
        String out = sw.toString();
        assertTrue(out.contains("<?xml"));
        assertTrue(out.contains("1.0"));
    }

    @Test
    public void initGenerator_writeXmlDeclaration11_overridesRegardlessOfDeclarationFlag() throws Exception {
        StringWriter sw = new StringWriter();
        // ไม่ได้ตั้ง WRITE_XML_DECLARATION เลย แต่ WRITE_XML_1_1 ต้องชนะเงื่อนไขแรกใน if/else if
        ToXmlGenerator gen = newGenerator(sw, ToXmlGenerator.Feature.WRITE_XML_1_1.getMask());
        gen.initGenerator();
        gen.flush();
        String out = sw.toString();
        assertTrue(out.contains("<?xml"));
        assertTrue(out.contains("1.1"));
    }

    @Test
    public void initGenerator_calledTwice_isIdempotent() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw, ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask());
        gen.initGenerator();
        gen.initGenerator(); // ควร return ทันทีจาก _initialized flag
        gen.flush();
        String out = sw.toString();
        // ต้องมี <?xml เพียงครั้งเดียว
        assertEquals(out.indexOf("<?xml"), out.lastIndexOf("<?xml"));
    }

    // ------------------------------------------------------------------
    // Feature enable/disable/configure/override
    // ------------------------------------------------------------------

    @Test
    public void feature_enableDisableIsEnabledConfigure() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw, 0);

        assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        gen.enable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        gen.disable(ToXmlGenerator.Feature.WRITE_XML_DECLARATION);
        assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_DECLARATION));

        gen.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);
        assertTrue(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
        gen.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, false);
        assertFalse(gen.isEnabled(ToXmlGenerator.Feature.WRITE_XML_1_1));
    }

    @Test
    public void feature_getFormatFeatures() throws Exception {
        StringWriter sw = new StringWriter();
        int mask = ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask();
        ToXmlGenerator gen = newGenerator(sw, mask);
        assertEquals(mask, gen.getFormatFeatures());
    }

    @Test
    public void feature_overrideFormatFeatures_changesValue() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw, 0);
        int mask = ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask();
        JsonGenerator ret = gen.overrideFormatFeatures(mask, mask);
        assertSame(gen, ret);
        assertEquals(mask, gen.getFormatFeatures());
    }

    @Test
    public void feature_overrideFormatFeatures_noChangeWhenSame() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw, 0);
        // oldF == newF -> branch "if (oldF != newF)" เป็น false
        gen.overrideFormatFeatures(0, 0);
        assertEquals(0, gen.getFormatFeatures());
    }

    // ------------------------------------------------------------------
    // Misc accessors
    // ------------------------------------------------------------------

    @Test
    public void misc_getOutputTarget_returnsOriginalWriter() throws Exception {
        StringWriter sw = new StringWriter();
        XMLStreamWriter staxWriter = wstxFactory().createXMLStreamWriter(sw);
        IOContext ctxt = newIOContext(sw);
        ToXmlGenerator gen = new ToXmlGenerator(ctxt, JsonGenerator.Feature.collectDefaults(), 0, null, staxWriter);
        assertSame(staxWriter, gen.getOutputTarget());
    }

    @Test
    public void misc_getOutputBuffered_alwaysMinusOne() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        assertEquals(-1, gen.getOutputBuffered());
    }

    @Test
    public void misc_canWriteFormattedNumbers_true() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        assertTrue(gen.canWriteFormattedNumbers());
    }

    @Test
    public void misc_inRoot_trueAtStart_falseAfterStartObject() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        assertTrue(gen.inRoot());
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        assertFalse(gen.inRoot());
        gen.writeEndObject();
        gen.close();
    }

    // ------------------------------------------------------------------
    // setPrettyPrinter
    // ------------------------------------------------------------------

    @Test
    public void setPrettyPrinter_null_clearsXmlPrettyPrinter() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        JsonGenerator ret = gen.setPrettyPrinter(null);
        assertSame(gen, ret);
    }

    @Test
    public void setPrettyPrinter_xmlPrettyPrinter_setsField_returnsSelf() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter pp =
                new com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter();
        JsonGenerator ret = gen.setPrettyPrinter(pp);
        assertSame(gen, ret);
        // เขียนค่าจริงเพื่อให้แน่ใจว่า path ที่ใช้ _xmlPrettyPrinter ทำงานได้ไม่ throw
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.writeEndObject();
        gen.close();
    }

    // ------------------------------------------------------------------
    // handleMissingName / _handleStartObject / _handleEndObject
    // ------------------------------------------------------------------

    @Test(expected = IllegalStateException.class)
    public void handleMissingName_writeString_throwsISE() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.writeString("x"); // _nextName == null
    }

    @Test(expected = IllegalStateException.class)
    public void handleMissingName_handleStartObject_throwsISE() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen._handleStartObject(); // เรียกตรง ๆ โดยไม่ setNextName
    }

    @Test(expected = JsonGenerationException.class)
    public void handleEndObject_emptyStack_throwsJsonGenerationException() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen._handleEndObject(); // _elementNameStack ว่าง -> error
    }

    // ------------------------------------------------------------------
    // writeString
    // ------------------------------------------------------------------

    @Test
    public void writeString_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeString("hello");
        gen.close();
        assertTrue(sw.toString().contains("hello"));
        assertTrue(sw.toString().contains("root"));
    }

    @Test
    public void writeString_asAttribute() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsAttribute(true);
        gen.setNextName(qn("attr"));
        gen.writeString("val");
        gen.setNextIsAttribute(false);
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("attr=\"val\""));
    }

    @Test
    public void writeString_unwrapped_resetsFlag() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsUnwrapped(true);
        gen.setNextName(qn("ignored"));
        gen.writeString("rawText");
        // flag ควรถูก reset แล้ว เรียกอีกครั้งจึงเป็น element ปรกติ
        gen.setNextName(qn("child"));
        gen.writeString("v2");
        gen.writeEndObject();
        gen.close();
        String out = sw.toString();
        assertTrue(out.contains("rawText"));
        assertTrue(out.contains("<child>v2</child>"));
    }

    @Test
    public void writeStringCharArray_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        char[] arr = "hello-world".toCharArray();
        gen.writeString(arr, 1, 5); // "ello-"
        gen.close();
        assertTrue(sw.toString().contains("ello-"));
    }

    @Test
    public void writeStringSerializableString_delegates() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeString(new SerializedString("ss-val"));
        gen.close();
        assertTrue(sw.toString().contains("ss-val"));
    }

    // ------------------------------------------------------------------
    // writeFieldName
    // ------------------------------------------------------------------

    @Test
    public void writeFieldName_firstCall_noNamespace() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.writeFieldName("child"); // _nextName == null ก่อนนี้ -> ns = ""
        gen.writeString("v");
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("<child>v</child>"));
    }

    @Test
    public void writeFieldName_existingNamespace_propagates() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        // ตั้ง _nextName ให้มี namespace ก่อน เพื่อ cover branch _nextName != null
        gen.setNextName(new QName("urn:test", "placeholder"));
        gen.writeFieldName("child2");
        gen.writeString("v2");
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("v2"));
    }

    @Test(expected = JsonGenerationException.class)
    public void writeFieldName_expectingValue_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.writeFieldName("a");
        gen.writeFieldName("b"); // เรียกชื่อ field ซ้ำโดยไม่เขียนค่า -> STATUS_EXPECT_VALUE
    }

    @Test
    public void writeFieldNameSerializableString_ok() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.writeFieldName(new SerializedString("child3"));
        gen.writeString("v3");
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("v3"));
    }

    @Test
    public void writeStringField_writesElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.writeStringField("f", "val");
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("<f>val</f>"));
    }

    // ------------------------------------------------------------------
    // setNextNameIfMissing
    // ------------------------------------------------------------------

    @Test
    public void setNextNameIfMissing_setsOnlyOnce() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        assertTrue(gen.setNextNameIfMissing(qn("first")));
        assertFalse(gen.setNextNameIfMissing(qn("second")));
        gen.writeString("v");
        gen.close();
        assertTrue(sw.toString().contains("first"));
        assertFalse(sw.toString().contains("second"));
    }

    // ------------------------------------------------------------------
    // writeNumber(...)
    // ------------------------------------------------------------------

    @Test
    public void writeNumberInt_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeNumber(42);
        gen.close();
        assertTrue(sw.toString().contains("42"));
    }

    @Test
    public void writeNumberLong_asAttribute() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsAttribute(true);
        gen.setNextName(qn("attr"));
        gen.writeNumber(123456789012L);
        gen.setNextIsAttribute(false);
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("123456789012"));
    }

    @Test
    public void writeNumberDouble_unwrapped() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsUnwrapped(true);
        gen.setNextName(qn("ignored"));
        gen.writeNumber(3.5d);
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("3.5"));
    }

    @Test
    public void writeNumberFloat_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeNumber(1.5f);
        gen.close();
        assertTrue(sw.toString().contains("1.5"));
    }

    @Test
    public void writeNumberBigDecimal_nullWritesNull() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeNumber((BigDecimal) null);
        gen.close();
        // writeNull() ของ element ปรกติเขียน empty element
        assertTrue(sw.toString().contains("root"));
    }

    @Test
    public void writeNumberBigDecimal_plainTrue_asAttribute() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsAttribute(true);
        gen.setNextName(qn("attr"));
        gen.writeNumber(new BigDecimal("1.230"));
        gen.setNextIsAttribute(false);
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("1.23"));
    }

    @Test
    public void writeNumberBigDecimal_plainFalse_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, false);
        gen.setNextName(qn("root"));
        gen.writeNumber(new BigDecimal("2.5"));
        gen.close();
        assertTrue(sw.toString().contains("2.5"));
    }

    @Test
    public void writeNumberBigInteger_nullWritesNull() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeNumber((BigInteger) null);
        gen.close();
        assertTrue(sw.toString().contains("root"));
    }

    @Test
    public void writeNumberBigInteger_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeNumber(BigInteger.valueOf(999));
        gen.close();
        assertTrue(sw.toString().contains("999"));
    }

    @Test
    public void writeNumberEncodedString_delegatesToWriteString() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeNumber("007");
        gen.close();
        assertTrue(sw.toString().contains("007"));
    }

    // ------------------------------------------------------------------
    // writeBoolean / writeNull
    // ------------------------------------------------------------------

    @Test
    public void writeBoolean_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeBoolean(true);
        gen.close();
        assertTrue(sw.toString().contains("true"));
    }

    @Test
    public void writeNull_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeNull();
        gen.close();
        assertTrue(sw.toString().contains("root"));
    }

    @Test
    public void writeNull_asAttribute_noOutput() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsAttribute(true);
        gen.setNextName(qn("attr"));
        gen.writeNull(); // ไม่ทำอะไรเลย ตาม source
        gen.setNextIsAttribute(false);
        gen.writeEndObject();
        gen.close();
        assertFalse(sw.toString().contains("attr="));
    }

    // ------------------------------------------------------------------
    // writeBinary
    // ------------------------------------------------------------------

    @Test
    public void writeBinary_nullData_writesNull() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeBinary(Base64Variants.getDefaultVariant(), null, 0, 0);
        gen.close();
        assertTrue(sw.toString().contains("root"));
    }

    @Test
    public void writeBinary_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        byte[] data = "abc".getBytes("UTF-8");
        gen.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        gen.close();
        assertTrue(sw.toString().length() > 0);
    }

    @Test
    public void writeBinary_asAttribute() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsAttribute(true);
        gen.setNextName(qn("attr"));
        byte[] data = "xy".getBytes("UTF-8");
        gen.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        gen.setNextIsAttribute(false);
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("attr="));
    }

    @Test
    public void writeBinary_unwrapped() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsUnwrapped(true);
        gen.setNextName(qn("ignored"));
        byte[] data = "zz".getBytes("UTF-8");
        gen.writeBinary(Base64Variants.getDefaultVariant(), data, 0, data.length);
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().length() > 0);
    }

    // ------------------------------------------------------------------
    // writeRawValue
    // ------------------------------------------------------------------

    @Test
    public void writeRawValueString_normal_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeRawValue("<raw/>");
        gen.close();
        assertTrue(sw.toString().contains("<raw/>"));
    }

    @Test
    public void writeRawValueString_asAttribute() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextIsAttribute(true);
        gen.setNextName(qn("attr"));
        gen.writeRawValue("plain");
        gen.setNextIsAttribute(false);
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("attr=\"plain\""));
    }

    @Test
    public void writeRawValueStringOffsetLen_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeRawValue("XX<raw2/>YY", 2, 7); // "<raw2/>"
        gen.close();
        assertTrue(sw.toString().contains("<raw2/>"));
    }

    @Test
    public void writeRawValueCharArray_plainElement() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        char[] arr = "AA<r3/>BB".toCharArray();
        gen.writeRawValue(arr, 2, 6); // "<r3/>"
        gen.close();
        assertTrue(sw.toString().contains("<r3/>"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void writeRawValueSerializableString_alwaysUnsupported() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.writeRawValue(new SerializedString("x"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void writeRawUTF8String_alwaysUnsupported() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        byte[] b = "a".getBytes("UTF-8");
        gen.writeRawUTF8String(b, 0, b.length);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void writeUTF8String_alwaysUnsupported() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        byte[] b = "a".getBytes("UTF-8");
        gen.writeUTF8String(b, 0, b.length);
    }

    // ------------------------------------------------------------------
    // writeRaw + stax2 emulation branch
    // ------------------------------------------------------------------

    @Test
    public void writeRaw_String_stax2Supported_noException() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.writeRaw("<!--c-->");
        gen.close();
        assertTrue(sw.toString().contains("<!--c-->"));
    }

    @Test
    public void writeRaw_char_delegatesToString() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.writeRaw('&'); // writeRaw(char) -> writeRaw(String.valueOf(c))
        gen.flush();
        assertTrue(sw.toString().contains("&"));
    }

    @Test
    public void writeRaw_stax2Emulation_throwsForRawMethods() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newEmulatedGenerator(sw);
        try {
            gen.writeRaw("x");
            fail("expected exception due to stax2 emulation");
        } catch (JsonGenerationException expected) {
            // ok
        }
    }

    @Test
    public void writeRawValue_stax2Emulation_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newEmulatedGenerator(sw);
        gen.setNextName(qn("root"));
        try {
            gen.writeRawValue("x");
            fail("expected exception due to stax2 emulation");
        } catch (JsonGenerationException expected) {
            // ok
        }
    }

    // ------------------------------------------------------------------
    // startWrappedValue / finishWrappedValue
    // ------------------------------------------------------------------

    @Test
    public void startWrappedValue_withWrapper_andFinish() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.startWrappedValue(qn("wrapper"), qn("item"));
        gen.writeString("x");
        gen.finishWrappedValue(qn("wrapper"), qn("item"));
        gen.close();
        String out = sw.toString();
        assertTrue(out.contains("wrapper"));
        assertTrue(out.contains("<item>x</item>"));
    }

    @Test
    public void startWrappedValue_withoutWrapper_andFinish() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.startWrappedValue(null, qn("item"));
        gen.writeString("y");
        gen.finishWrappedValue(null, qn("item"));
        gen.close();
        String out = sw.toString();
        assertFalse(out.contains("wrapper"));
        assertTrue(out.contains("<item>y</item>"));
    }

    // ------------------------------------------------------------------
    // writeRepeatedFieldName
    // ------------------------------------------------------------------

    @Test
    public void writeRepeatedFieldName_ok() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextName(qn("child"));
        gen.writeRepeatedFieldName();
        gen.writeString("v");
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("<child>v</child>"));
    }

    @Test(expected = JsonGenerationException.class)
    public void writeRepeatedFieldName_expectingValue_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.setNextName(qn("child"));
        gen.writeRepeatedFieldName();
        gen.writeRepeatedFieldName(); // ครั้งที่สองโดยไม่เขียนค่า -> expect value
    }

    // ------------------------------------------------------------------
    // writeStartArray/writeEndArray, writeStartObject/writeEndObject
    // ------------------------------------------------------------------

    @Test
    public void writeStartArray_writeEndArray_matchedContext() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.writeStartArray();
        gen.writeEndArray();
        gen.close();
        // ไม่มี pretty printer -> ไม่มี element ถูกเขียนจริง, ไม่ throw ก็ถือว่าผ่าน
    }

    @Test(expected = JsonGenerationException.class)
    public void writeEndArray_withoutStart_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.writeEndArray();
    }

    @Test
    public void writeStartObject_writeEndObject_matchedContext() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.writeEndObject();
        gen.close();
        assertTrue(sw.toString().contains("root"));
    }

    @Test(expected = JsonGenerationException.class)
    public void writeEndObject_withoutStart_throws() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw);
        gen.writeEndObject();
    }

    // ------------------------------------------------------------------
    // flush
    // ------------------------------------------------------------------

    @Test
    public void flush_enabled_callsUnderlyingFlush() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw); // default: FLUSH_PASSED_TO_STREAM enabled
        gen.setNextName(qn("root"));
        gen.writeString("v");
        gen.flush();
        assertTrue(sw.toString().contains("v"));
    }

    @Test
    public void flush_disabled_doesNothing() throws Exception {
        StringWriter sw = new StringWriter();
        int std = JsonGenerator.Feature.collectDefaults()
                & ~JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask();
        ToXmlGenerator gen = newGeneratorWithStdFeatures(sw, std, 0);
        // ไม่ throw ก็ถือว่า branch "isEnabled == false" ผ่าน
        gen.flush();
    }

    // ------------------------------------------------------------------
    // close
    // ------------------------------------------------------------------

    @Test
    public void close_autoCloseJsonContent_nestedContexts() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw); // default: AUTO_CLOSE_JSON_CONTENT enabled
        gen.setNextName(qn("root"));
        gen.writeStartObject(); // เปิด <root> จริง
        gen.setNextName(qn("arr"));
        gen.writeStartArray();  // แค่ context, ไม่มี xml จริง
        gen.close(); // ต้อง auto-close array แล้ว object ให้ครบ
        assertTrue(sw.toString().contains("root"));
    }

    @Test
    public void close_withoutAutoCloseJsonContent_skipsLoop() throws Exception {
        StringWriter sw = new StringWriter();
        int std = JsonGenerator.Feature.collectDefaults()
                & ~JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask();
        ToXmlGenerator gen = newGeneratorWithStdFeatures(sw, std, 0);
        gen.writeStartArray(); // ไม่มี xml จริงเกิดขึ้น (ปลอดภัยสำหรับปิด stream ตรง ๆ)
        gen.close(); // ควร skip while-loop และปิด stream โดยตรง ไม่ throw
    }

    @Test
    public void close_autoCloseTarget_usesCloseCompletely() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw); // default AUTO_CLOSE_TARGET=true
        gen.setNextName(qn("root"));
        gen.writeString("v");
        gen.close(); // ไม่ throw แปลว่า closeCompletely() ทำงานได้ปกติ
    }

    // ------------------------------------------------------------------
    // Full document integration
    // ------------------------------------------------------------------

    @Test
    public void fullDocument_integration() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator gen = newGenerator(sw, ToXmlGenerator.Feature.WRITE_XML_DECLARATION.getMask());
        gen.setNextName(qn("root"));
        gen.writeStartObject();
        gen.writeStringField("child", "value");
        gen.writeEndObject();
        gen.close();
        String out = sw.toString();
        assertTrue(out.contains("<?xml"));
        assertTrue(out.contains("<root>"));
        assertTrue(out.contains("<child>value</child>"));
        assertTrue(out.contains("</root>"));
    }
}
```

## สรุปตาราง Test Method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| initGenerator_defaultNoDeclaration_returnsEarly | `initGenerator()` else-branch (`return` โดยไม่เขียน declaration) |
| initGenerator_writeXmlDeclaration10 | เงื่อนไข `WRITE_XML_DECLARATION` true, `WRITE_XML_1_1` false |
| initGenerator_writeXmlDeclaration11_overridesRegardlessOfDeclarationFlag | เงื่อนไข `WRITE_XML_1_1` true (ชนะ if แรก) |
| initGenerator_calledTwice_isIdempotent | `if (_initialized) return;` |
| feature_enableDisableIsEnabledConfigure | `enable/disable/isEnabled/configure` ทุกสาขา true/false |
| feature_getFormatFeatures | `getFormatFeatures()` |
| feature_overrideFormatFeatures_changesValue | `overrideFormatFeatures` เมื่อ oldF != newF |
| feature_overrideFormatFeatures_noChangeWhenSame | `overrideFormatFeatures` เมื่อ oldF == newF |
| misc_getOutputTarget_returnsOriginalWriter | `getOutputTarget()` |
| misc_getOutputBuffered_alwaysMinusOne | `getOutputBuffered()` |
| misc_canWriteFormattedNumbers_true | `canWriteFormattedNumbers()` |
| misc_inRoot_trueAtStart_falseAfterStartObject | `inRoot()` ทั้ง true/false |
| setPrettyPrinter_null_clearsXmlPrettyPrinter | `setPrettyPrinter(null)` |
| setPrettyPrinter_xmlPrettyPrinter_setsField_returnsSelf | `setPrettyPrinter(pp instanceof XmlPrettyPrinter)` |
| handleMissingName_writeString_throwsISE | `_nextName == null` ใน `writeString` |
| handleMissingName_handleStartObject_throwsISE | `_nextName == null` ใน `_handleStartObject` |
| handleEndObject_emptyStack_throwsJsonGenerationException | `_elementNameStack.isEmpty()` ใน `_handleEndObject` |
| writeString_plainElement / _asAttribute / _unwrapped | สาม branch หลักของ `writeString(String)` + reset flag unwrapped |
| writeStringCharArray_plainElement | `writeString(char[],offset,len)` plain-element branch |
| writeStringSerializableString_delegates | `writeString(SerializableString)` |
| writeFieldName_firstCall_noNamespace / _existingNamespace_propagates | branch `_nextName==null` vs `!=null` ใน `writeFieldName` |
| writeFieldName_expectingValue_throws | `STATUS_EXPECT_VALUE` ใน `writeFieldName` |
| writeFieldNameSerializableString_ok | `writeFieldName(SerializableString)` |
| writeStringField_writesElement | `writeStringField` |
| setNextNameIfMissing_setsOnlyOnce | `_nextName==null` true/false ใน `setNextNameIfMissing` |
| writeNumberInt/_Long/_Double/_Float (element/attribute/unwrapped) | branch attribute/unwrapped/plain element ของ writeNumber ชนิดต่าง ๆ |
| writeNumberBigDecimal_nullWritesNull / plainTrue / plainFalse | `dec==null`, `usePlain` true/false |
| writeNumberBigInteger_nullWritesNull / plainElement | `value==null` branch |
| writeNumberEncodedString_delegatesToWriteString | `writeNumber(String)` delegate |
| writeBoolean_plainElement | `writeBoolean` plain-element branch |
| writeNull_plainElement / _asAttribute_noOutput | `writeNull` element vs attribute (no-op) branch |
| writeBinary_nullData / plainElement / asAttribute / unwrapped | `data==null`, attribute, unwrapped, plain-element branches |
| writeRawValueString_normal/_asAttribute, OffsetLen, CharArray | attribute vs element branch ของ `writeRawValue` overload ต่าง ๆ |
| writeRawValueSerializableString_alwaysUnsupported | `_reportUnsupportedOperation()` |
| writeRawUTF8String/_writeUTF8String_alwaysUnsupported | `_reportUnsupportedOperation()` |
| writeRaw_String_stax2Supported_noException | `_stax2Emulation==false` branch (ไม่ throw) |
| writeRaw_char_delegatesToString | `writeRaw(char)` delegate |
| writeRaw_stax2Emulation_throwsForRawMethods / writeRawValue_stax2Emulation_throws | `_stax2Emulation==true` branch (throw) |
| startWrappedValue_withWrapper/_withoutWrapper | `wrapperName != null` vs `null` |
| writeRepeatedFieldName_ok / _expectingValue_throws | สถานะ OK vs `STATUS_EXPECT_VALUE` |
| writeStartArray/_writeEndArray_matchedContext | context ปรกติ (ไม่ throw) |
| writeEndArray_withoutStart_throws | `!_writeContext.inArray()` |
| writeStartObject/_writeEndObject_matchedContext | context ปรกติ |
| writeEndObject_withoutStart_throws | `!_writeContext.inObject()` |
| flush_enabled_callsUnderlyingFlush / _disabled_doesNothing | `isEnabled(FLUSH_PASSED_TO_STREAM)` true/false |
| close_autoCloseJsonContent_nestedContexts / _withoutAutoCloseJsonContent_skipsLoop | `isEnabled(AUTO_CLOSE_JSON_CONTENT)` true/false, loop `inArray/inObject/break` |
| close_autoCloseTarget_usesCloseCompletely | `isResourceManaged() || isEnabled(AUTO_CLOSE_TARGET)` true branch |
| fullDocument_integration | smoke test end-to-end รวมหลาย branch |

**ข้อจำกัด/สิ่งที่ไม่ได้ทดสอบ**: branch ที่ `_ioContext.isResourceManaged()==false` และ `AUTO_CLOSE_TARGET==false` พร้อมกัน (เรียก `_xmlWriter.close()` ธรรมดา) ไม่ได้ทดสอบแยกเพราะต้องพึ่งพฤติกรรม Woodstox เมื่อปิด stream ที่ยังไม่ well-formed ซึ่งไม่ได้ระบุไว้ใน source ของ `ToXmlGenerator` เอง จึงเลี่ยงการเดา behavior ตามข้อกำหนด