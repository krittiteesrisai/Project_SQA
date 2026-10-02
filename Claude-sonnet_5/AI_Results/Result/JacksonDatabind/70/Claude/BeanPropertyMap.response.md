# วิเคราะห์และออกแบบ Test Suite

จากการวิเคราะห์ source code ของ `BeanPropertyMap` ผมพบ logic ที่ซับซ้อนเรื่อง custom hash table (primary/secondary/spill slots), boundary ของ `findSize()`, และจุดที่น่าสงสัยว่าอาจมี fault คือ `withProperty()` ที่ไม่ได้ update field `_size` ตอน append property ใหม่ (ไม่มี `_size++` ในเมธอดนี้) ซึ่งขัดกับ contract ของ `size()` — ผมเขียน test ดักจับจุดนี้ไว้โดยเฉพาะพร้อม comment อธิบาย

**หมายเหตุสำคัญ:** เพื่อให้ทดสอบ branch การ "ชน" ของ hash slot (primary/secondary/spill) ได้แน่นอน ผมเลือกใช้ property name เป็น single character ที่คำนวณแล้วว่า `hashCode() & 7 == 1` ทั้งหมด (คือ `"a"(97)`, `"i"(105)`, `"q"(113)`, `"y"(121)`) เพื่อบังคับให้ตกใน slot เดียวกันตาม logic `_hashCode()` เมื่อ collection size ≤ 5 (`findSize` คืนค่า 8)

```java
package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;

/**
 * Unit tests สำหรับ {@link BeanPropertyMap}
 *
 * หมายเหตุ: คลาสทดสอบอยู่ package เดียวกับ target class เพื่อให้เข้าถึง
 * protected method (wrapAndThrow, _rename) ได้โดยตรง สำหรับทดสอบ branch
 * แบบละเอียด โดยไม่ต้อง mock ผ่าน public API ทั้งหมด
 */
public class BeanPropertyMapTest {

    // ---------- Helpers ----------

    private SettableBeanProperty mockProp(String name) {
        SettableBeanProperty p = mock(SettableBeanProperty.class);
        when(p.getName()).thenReturn(name);
        return p;
    }

    private BeanPropertyMap buildMap(boolean ci, SettableBeanProperty... props) {
        return new BeanPropertyMap(ci, Arrays.asList(props));
    }

    // ==================================================================
    // 1. Constructor / size()
    // ==================================================================

    @Test
    public void size_emptyCollection_returnsZero() {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        assertEquals(0, map.size());
        assertFalse(map.iterator().hasNext());
    }

    @Test
    public void size_afterConstruction_matchesInputCount() {
        SettableBeanProperty p1 = mockProp("foo");
        SettableBeanProperty p2 = mockProp("bar");
        BeanPropertyMap map = buildMap(false, p1, p2);
        assertEquals(2, map.size());
    }

    @Test
    public void construct_staticFactory_worksSameAsConstructor() {
        SettableBeanProperty p1 = mockProp("foo");
        BeanPropertyMap map = BeanPropertyMap.construct(
                Collections.singletonList(p1), false);
        assertEquals(1, map.size());
        assertSame(p1, map.find("foo"));
    }

    // ==================================================================
    // 2. find(String) - branch ต่าง ๆ ของ primary/secondary/spill
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void find_withNullKey_throwsIllegalArgumentException() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        map.find((String) null);
    }

    @Test
    public void find_notFound_primarySlotNull_returnsNull() {
        // "a" -> slot 1 (hashCode&7==1); "b"(98) -> slot 2 (ไม่ตรงกัน primary ว่าง)
        BeanPropertyMap map = buildMap(false, mockProp("a"));
        assertNull(map.find("b"));
    }

    @Test
    public void find_primaryMatch_returnsProperty_usingDifferentStringRef() {
        SettableBeanProperty pa = mockProp("a");
        BeanPropertyMap map = buildMap(false, pa);
        // ใช้ new String เพื่อบังคับให้ (match==key) false แล้วให้ path
        // key.equals(match) เป็นตัวตัดสิน (บังคับ branch ที่สองของ || )
        String lookupKey = new String("a");
        assertSame(pa, map.find(lookupKey));
    }

    @Test
    public void find_secondaryMatch_returnsProperty() {
        // "a" ไปอยู่ primary, "i" ชน slot เดียวกันจึงไปอยู่ secondary
        SettableBeanProperty pa = mockProp("a");
        SettableBeanProperty pi = mockProp("i");
        BeanPropertyMap map = buildMap(false, pa, pi);
        assertSame(pi, map.find("i"));
    }

    @Test
    public void find_secondaryEmpty_noMatch_returnsNull() {
        // มีแค่ "a" อยู่ primary, secondary ยังว่าง -> query "i" (ชน slot เดียวกัน)
        // จะเข้า branch match==null ของ secondary check ใน _find2
        BeanPropertyMap map = buildMap(false, mockProp("a"));
        assertNull(map.find("i"));
    }

    @Test
    public void find_spillMatch_returnsProperty() {
        // a=primary, i=secondary, q=spill (ชน slot เดียวกันหมด)
        SettableBeanProperty pa = mockProp("a");
        SettableBeanProperty pi = mockProp("i");
        SettableBeanProperty pq = mockProp("q");
        BeanPropertyMap map = buildMap(false, pa, pi, pq);
        assertSame(pq, map.find("q"));
        // sanity ของ entry อื่น ๆ ยังหาได้ถูกต้อง
        assertSame(pa, map.find("a"));
        assertSame(pi, map.find("i"));
    }

    @Test
    public void find_spillLoop_noMatch_returnsNull() {
        // "y" ชน slot เดียวกันกับ a/i/q แต่ไม่ถูก insert -> ต้อง loop จน
        // ผ่านทุก spill entry แล้ว return null
        SettableBeanProperty pa = mockProp("a");
        SettableBeanProperty pi = mockProp("i");
        SettableBeanProperty pq = mockProp("q");
        BeanPropertyMap map = buildMap(false, pa, pi, pq);
        assertNull(map.find("y"));
    }

    @Test
    public void find_caseInsensitive_matchesRegardlessOfCase() {
        SettableBeanProperty pFoo = mockProp("Foo");
        BeanPropertyMap map = buildMap(true, pFoo);
        assertSame(pFoo, map.find("foo"));
        assertSame(pFoo, map.find("FOO"));
    }

    @Test
    public void duplicateNamedProperties_bothCountedButFindReturnsFirstInserted() {
        SettableBeanProperty dup1 = mockProp("dup");
        SettableBeanProperty dup2 = mockProp("dup");
        BeanPropertyMap map = buildMap(false, dup1, dup2);
        assertEquals(2, map.size());
        assertSame(dup1, map.find("dup")); // primary slot ถูก insert ก่อน

        Set<SettableBeanProperty> all = new HashSet<SettableBeanProperty>();
        Iterator<SettableBeanProperty> it = map.iterator();
        while (it.hasNext()) all.add(it.next());
        assertEquals(2, all.size());
        assertTrue(all.contains(dup1));
        assertTrue(all.contains(dup2));
    }

    // ==================================================================
    // 3. find(int)
    // ==================================================================

    @Test
    public void findByIndex_foundAndNotFound() {
        SettableBeanProperty p1 = mockProp("foo");
        when(p1.getPropertyIndex()).thenReturn(5);
        SettableBeanProperty p2 = mockProp("bar");
        when(p2.getPropertyIndex()).thenReturn(-1);

        BeanPropertyMap map = buildMap(false, p1, p2);
        assertSame(p1, map.find(5));
        assertNull(map.find(999));
    }

    // ==================================================================
    // 4. iterator / toString / getPropertiesInInsertionOrder
    // ==================================================================

    @Test
    public void iterator_returnsAllNonNullProperties() {
        SettableBeanProperty p1 = mockProp("foo");
        SettableBeanProperty p2 = mockProp("bar");
        BeanPropertyMap map = buildMap(false, p1, p2);

        Set<String> names = new HashSet<String>();
        for (SettableBeanProperty p : map) {
            names.add(p.getName());
        }
        assertEquals(new HashSet<String>(Arrays.asList("foo", "bar")), names);
    }

    @Test
    public void toString_containsAllPropertyNames() {
        SettableBeanProperty p1 = mockProp("foo");
        SettableBeanProperty p2 = mockProp("bar");
        BeanPropertyMap map = buildMap(false, p1, p2);
        String s = map.toString();
        assertTrue(s.startsWith("Properties=["));
        assertTrue(s.contains("foo"));
        assertTrue(s.contains("bar"));
    }

    @Test
    public void toString_emptyMap_producesEmptyBrackets() {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        assertEquals("Properties=[]", map.toString());
    }

    @Test
    public void getPropertiesInInsertionOrder_preservesGivenOrder() {
        SettableBeanProperty p1 = mockProp("foo");
        SettableBeanProperty p2 = mockProp("bar");
        SettableBeanProperty p3 = mockProp("baz");
        BeanPropertyMap map = buildMap(false, p1, p2, p3);

        SettableBeanProperty[] order = map.getPropertiesInInsertionOrder();
        assertArrayEquals(new SettableBeanProperty[]{p1, p2, p3}, order);
    }

    // ==================================================================
    // 5. assignIndexes
    // ==================================================================

    @Test
    public void assignIndexes_assignsUniqueSequentialIndexesToAllProps() {
        SettableBeanProperty p1 = mockProp("foo");
        SettableBeanProperty p2 = mockProp("bar");
        SettableBeanProperty p3 = mockProp("baz");
        BeanPropertyMap map = buildMap(false, p1, p2, p3);

        map.assignIndexes();

        ArgumentCaptor<Integer> cap1 = ArgumentCaptor.forClass(Integer.class);
        ArgumentCaptor<Integer> cap2 = ArgumentCaptor.forClass(Integer.class);
        ArgumentCaptor<Integer> cap3 = ArgumentCaptor.forClass(Integer.class);
        verify(p1, times(1)).assignIndex(cap1.capture());
        verify(p2, times(1)).assignIndex(cap2.capture());
        verify(p3, times(1)).assignIndex(cap3.capture());

        Set<Integer> assigned = new HashSet<Integer>(
                Arrays.asList(cap1.getValue(), cap2.getValue(), cap3.getValue()));
        assertEquals(new HashSet<Integer>(Arrays.asList(0, 1, 2)), assigned);
    }

    // ==================================================================
    // 6. withCaseInsensitivity
    // ==================================================================

    @Test
    public void withCaseInsensitivity_sameState_returnsSameInstance() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        assertSame(map, map.withCaseInsensitivity(false));
    }

    @Test
    public void withCaseInsensitivity_differentState_returnsNewInstanceWithSameData() {
        SettableBeanProperty p1 = mockProp("Foo");
        BeanPropertyMap map = buildMap(false, p1);
        BeanPropertyMap ciMap = map.withCaseInsensitivity(true);

        assertNotSame(map, ciMap);
        assertEquals(1, ciMap.size());
        assertSame(p1, ciMap.find("foo")); // case-insensitive ตอนนี้ใช้งานได้
        assertNull(map.find("foo"));       // map เดิมยังเป็น case-sensitive
    }

    // ==================================================================
    // 7. withProperty - replace / append / growth
    // ==================================================================

    @Test
    public void withProperty_replaceExisting_updatesValueAndKeepsSize() {
        SettableBeanProperty oldFoo = mockProp("foo");
        SettableBeanProperty bar = mockProp("bar");
        BeanPropertyMap map = buildMap(false, oldFoo, bar);

        SettableBeanProperty newFoo = mockProp("foo");
        BeanPropertyMap result = map.withProperty(newFoo);

        assertSame(map, result); // replace คืน this instance เดิม
        assertSame(newFoo, map.find("foo"));
        assertEquals(2, map.size());
        assertArrayEquals(new SettableBeanProperty[]{newFoo, bar},
                map.getPropertiesInInsertionOrder());
    }

    @Test
    public void withProperty_appendNew_triggersSpillGrowth_andIsFindable() {
        // "a"->primary, "i"->secondary; เติม "q" (ชน slot เดียวกัน) จะต้อง
        // เข้า branch spill และ trigger การขยาย _hashArea (ix >= length)
        SettableBeanProperty pa = mockProp("a");
        SettableBeanProperty pi = mockProp("i");
        BeanPropertyMap map = buildMap(false, pa, pi);

        SettableBeanProperty pq = mockProp("q");
        BeanPropertyMap result = map.withProperty(pq);

        assertSame(map, result);
        assertSame(pq, map.find("q"));
        assertEquals(3, map.getPropertiesInInsertionOrder().length);
    }

    /**
     * FAULT-DETECTION TEST:
     * ตาม source code เมธอด withProperty() ไม่มีการ update field _size
     * เมื่อเพิ่ม property ใหม่ (ไม่มี _size++ ที่ branch "append") ซึ่งขัดกับ
     * contract ของ size() ("Number of entries stored"). Test นี้ยืนยัน
     * ค่าที่ "ถูกต้องตามสัญญา" — หาก source มี defect ตามที่วิเคราะห์ไว้ ค่า
     * size() จะยังเป็นค่าเดิม (ไม่ +1) และ test นี้จะ FAIL บ่งชี้ fault ได้จริง
     */
    @Test
    public void withProperty_appendNew_sizeShouldReflectNewCount() {
        SettableBeanProperty p1 = mockProp("foo");
        BeanPropertyMap map = buildMap(false, p1);
        int before = map.size();

        map.withProperty(mockProp("bar"));

        assertEquals("size() ควรสะท้อนจำนวน property ที่แท้จริงหลัง withProperty",
                before + 1, map.size());
    }

    // ==================================================================
    // 8. replace(SettableBeanProperty)
    // ==================================================================

    @Test
    public void replace_existingProperty_updatesHashAndOrderedArray() {
        SettableBeanProperty oldFoo = mockProp("foo");
        SettableBeanProperty bar = mockProp("bar");
        BeanPropertyMap map = buildMap(false, oldFoo, bar);

        SettableBeanProperty newFoo = mockProp("foo");
        map.replace(newFoo);

        assertSame(newFoo, map.find("foo"));
        assertArrayEquals(new SettableBeanProperty[]{newFoo, bar},
                map.getPropertiesInInsertionOrder());
    }

    @Test(expected = NoSuchElementException.class)
    public void replace_nonExistingProperty_throwsNoSuchElementException() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        map.replace(mockProp("doesNotExist"));
    }

    // ==================================================================
    // 9. remove(SettableBeanProperty)
    // ==================================================================

    @Test
    public void remove_existingProperty_removesAndLeavesHoleInOrder() {
        SettableBeanProperty p1 = mockProp("foo");
        SettableBeanProperty p2 = mockProp("bar");
        BeanPropertyMap map = buildMap(false, p1, p2);

        map.remove(p1);

        assertEquals(1, map.size());
        assertNull(map.find("foo"));
        assertSame(p2, map.find("bar"));
        // hole ที่ index 0 ของ _propsInOrder (ก่อน reinit หลุดไปแล้ว เพราะ
        // remove() เรียก init(props) ใหม่โดยไม่รวม null -> ตรวจผ่าน size แทน)
    }

    @Test(expected = NoSuchElementException.class)
    public void remove_nonExistingProperty_throwsNoSuchElementException() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        map.remove(mockProp("notThere"));
    }

    // ==================================================================
    // 10. renameAll(NameTransformer)
    // ==================================================================

    @Test
    public void renameAll_nullTransformer_returnsSameInstance() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        assertSame(map, map.renameAll(null));
    }

    @Test
    public void renameAll_nopTransformer_returnsSameInstance() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        assertSame(map, map.renameAll(NameTransformer.NOP));
    }

    @Test
    public void renameAll_withTransformer_renamesPropertiesAndKeepsHoles() {
        SettableBeanProperty orig = mockProp("foo");
        SettableBeanProperty renamed = mockProp("pre_foo");
        when(orig.withSimpleName("pre_foo")).thenReturn(renamed);
        // renamed.getValueDeserializer() default (unstubbed) -> null
        // -> ข้าม branch deser!=null ใน _rename

        SettableBeanProperty p2 = mockProp("bar");
        BeanPropertyMap map = buildMap(false, orig, p2);

        // ลบ p2 ก่อนเพื่อสร้าง hole ใน _propsInOrder แล้วดูว่า renameAll
        // คง hole ไว้ (branch prop==null -> newProps.add(prop) โดยไม่ rename)
        map.remove(p2);

        NameTransformer xf = new NameTransformer() {
            @Override public String transform(String name) { return "pre_" + name; }
            @Override public String reverse(String transformed) { return transformed; }
        };

        BeanPropertyMap renamedMap = map.renameAll(xf);

        assertNotSame(map, renamedMap);
        assertSame(renamed, renamedMap.find("pre_foo"));
        assertEquals(1, renamedMap.size());
    }

    @Test
    public void renameAll_withDeserializerThatChanges_wrapsNewDeserializer() {
        SettableBeanProperty orig = mockProp("foo");
        SettableBeanProperty renamed = mockProp("pre_foo");
        when(orig.withSimpleName("pre_foo")).thenReturn(renamed);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> oldDeser = mock(JsonDeserializer.class);
        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> newDeser = mock(JsonDeserializer.class);
        when(renamed.getValueDeserializer()).thenReturn(oldDeser);

        NameTransformer xf = new NameTransformer() {
            @Override public String transform(String name) { return "pre_" + name; }
            @Override public String reverse(String transformed) { return transformed; }
        };
        when(oldDeser.unwrappingDeserializer(xf)).thenReturn(newDeser);

        SettableBeanProperty finalProp = mockProp("pre_foo");
        when(renamed.withValueDeserializer(newDeser)).thenReturn(finalProp);

        BeanPropertyMap map = buildMap(false, orig);
        BeanPropertyMap result = map.renameAll(xf);

        assertSame(finalProp, result.find("pre_foo"));
        verify(renamed, times(1)).withValueDeserializer(newDeser);
    }

    @Test
    public void renameAll_whenNewDeserializerSameAsOld_doesNotCallWithValueDeserializer() {
        SettableBeanProperty orig = mockProp("foo");
        SettableBeanProperty renamed = mockProp("pre_foo");
        when(orig.withSimpleName("pre_foo")).thenReturn(renamed);

        @SuppressWarnings("unchecked")
        JsonDeserializer<Object> sameDeser = mock(JsonDeserializer.class);
        when(renamed.getValueDeserializer()).thenReturn(sameDeser);

        NameTransformer xf = new NameTransformer() {
            @Override public String transform(String name) { return "pre_" + name; }
            @Override public String reverse(String transformed) { return transformed; }
        };
        // unwrappingDeserializer คืนตัวเดิม -> newDeser == deser -> ไม่เรียก withValueDeserializer
        when(sameDeser.unwrappingDeserializer(xf)).thenReturn(sameDeser);

        BeanPropertyMap map = buildMap(false, orig);
        BeanPropertyMap result = map.renameAll(xf);

        assertSame(renamed, result.find("pre_foo"));
        verify(renamed, never()).withValueDeserializer(any());
    }

    // ==================================================================
    // 11. withoutProperties(Collection<String>)
    // ==================================================================

    @Test
    public void withoutProperties_emptyCollection_returnsSameInstance() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        assertSame(map, map.withoutProperties(Collections.<String>emptyList()));
    }

    @Test
    public void withoutProperties_excludesMatchingAndDropsHoles() {
        SettableBeanProperty p1 = mockProp("foo");
        SettableBeanProperty p2 = mockProp("bar");
        SettableBeanProperty p3 = mockProp("baz");
        BeanPropertyMap map = buildMap(false, p1, p2, p3);

        // สร้าง hole โดย remove p2 ก่อน
        map.remove(p2);

        BeanPropertyMap result = map.withoutProperties(Arrays.asList("foo"));

        assertNotSame(map, result);
        assertEquals(1, result.size()); // เหลือแค่ baz (foo ถูก exclude, bar เป็น hole ถูก prune)
        assertNull(result.find("foo"));
        assertNull(result.find("bar"));
        assertSame(p3, result.find("baz"));
    }

    @Test
    public void withoutProperties_nonEmptyButNoMatch_stillCreatesNewInstance() {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        BeanPropertyMap result = map.withoutProperties(Arrays.asList("notPresent"));
        assertNotSame(map, result);
        assertEquals(1, result.size());
    }

    // ==================================================================
    // 12. findDeserializeAndSet
    // ==================================================================

    @Test
    public void findDeserializeAndSet_propertyFound_callsDeserializeAndReturnsTrue()
            throws Exception {
        SettableBeanProperty p1 = mockProp("foo");
        BeanPropertyMap map = buildMap(false, p1);

        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        Object bean = new Object();

        boolean found = map.findDeserializeAndSet(parser, ctxt, bean, "foo");

        assertTrue(found);
        verify(p1, times(1)).deserializeAndSet(parser, ctxt, bean);
    }

    @Test
    public void findDeserializeAndSet_propertyNotFound_returnsFalse() throws Exception {
        BeanPropertyMap map = buildMap(false, mockProp("foo"));
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);

        boolean found = map.findDeserializeAndSet(parser, ctxt, new Object(), "missing");
        assertFalse(found);
    }

    @Test
    public void findDeserializeAndSet_exceptionFromProperty_isWrapped() throws Exception {
        SettableBeanProperty p1 = mockProp("foo");
        doAnswer(new org.mockito.stubbing.Answer<Object>() {
            @Override public Object answer(org.mockito.invocation.InvocationOnMock inv) {
                throw new RuntimeException("boom");
            }
        }).when(p1).deserializeAndSet(any(JsonParser.class),
                any(DeserializationContext.class), any());

        BeanPropertyMap map = buildMap(false, p1);
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);

        try {
            map.findDeserializeAndSet(parser, ctxt, new Object(), "foo");
            fail("ควร throw exception");
        } catch (JsonMappingException expected) {
            // ok: wrap=true -> RuntimeException ถูก wrap เป็น JsonMappingException
        }
    }

    // ==================================================================
    // 13. wrapAndThrow (protected) - เข้าถึงตรงเพราะอยู่ package เดียวกัน
    // ==================================================================

    @Test
    public void wrapAndThrow_error_propagatesDirectly() {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        Error err = new Error("fatal");
        try {
            map.wrapAndThrow(err, new Object(), "field", null);
            fail("should throw");
        } catch (Error e) {
            assertSame(err, e);
        } catch (IOException e) {
            fail("ไม่ควรเข้า branch นี้");
        }
    }

    @Test
    public void wrapAndThrow_ioException_rethrownAsIs_whenWrapDisabled() throws Exception {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);

        IOException io = new IOException("io-fail");
        try {
            map.wrapAndThrow(io, new Object(), "field", ctxt);
            fail("should throw IOException");
        } catch (IOException e) {
            assertSame(io, e);
        }
    }

    @Test
    public void wrapAndThrow_plainIOException_rethrownAsIs_evenWhenWrapEnabled()
            throws Exception {
        // plain IOException (ไม่ใช่ JsonProcessingException) -> เงื่อนไข
        // !(t instanceof JsonProcessingException) เป็น true เสมอ ทำให้
        // throw ตรง ๆ แม้ wrap=true
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);

        IOException io = new IOException("io-fail");
        try {
            map.wrapAndThrow(io, new Object(), "field", ctxt);
            fail("should throw IOException");
        } catch (IOException e) {
            assertSame(io, e);
        }
    }

    @Test
    public void wrapAndThrow_runtimeException_rethrownAsIs_whenWrapDisabled()
            throws Exception {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);

        RuntimeException rte = new RuntimeException("rte-fail");
        try {
            map.wrapAndThrow(rte, new Object(), "field", ctxt);
            fail("should throw RuntimeException");
        } catch (RuntimeException e) {
            assertSame(rte, e);
        }
    }

    @Test
    public void wrapAndThrow_runtimeException_wrapped_whenWrapEnabled() throws Exception {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(true);

        RuntimeException rte = new RuntimeException("rte-fail");
        try {
            map.wrapAndThrow(rte, new Object(), "field", ctxt);
            fail("should throw JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void wrapAndThrow_nullContext_defaultsToWrapTrue() throws Exception {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        RuntimeException rte = new RuntimeException("rte-fail");
        try {
            map.wrapAndThrow(rte, new Object(), "field", null);
            fail("should throw JsonMappingException because ctxt==null => wrap=true");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void wrapAndThrow_invocationTargetException_unwrapsCause() throws Exception {
        BeanPropertyMap map = new BeanPropertyMap(false,
                Collections.<SettableBeanProperty>emptyList());
        DeserializationContext ctxt = mock(DeserializationContext.class);
        when(ctxt.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)).thenReturn(false);

        RuntimeException cause = new RuntimeException("actual-cause");
        InvocationTargetException ite = new InvocationTargetException(cause);

        try {
            map.wrapAndThrow(ite, new Object(), "field", ctxt);
            fail("should throw unwrapped RuntimeException cause");
        } catch (RuntimeException e) {
            assertSame(cause, e); // ยืนยันว่า unwrap ITE -> cause แล้ว rethrow ตรง ๆ
        }
    }

    // ==================================================================
    // 14. findSize() boundaries - ทดสอบทางอ้อมผ่านพฤติกรรม size()/find()
    // ==================================================================

    @Test
    public void findSize_boundaries_viaConstructionAndLookup() {
        // ครอบคลุม branch: size<=5 -> 8, size<=12 -> 16,
        // size>12 (needed<=32 ครั้งเดียว) และ size>12 ที่ต้อง loop เพิ่ม
        // หลายรอบ (while doubling มากกว่า 1 ครั้ง)
        int[] sizes = {1, 5, 6, 12, 13, 20, 100};
        for (int n : sizes) {
            List<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>();
            for (int i = 0; i < n; i++) {
                props.add(mockProp("p" + i));
            }
            BeanPropertyMap map = new BeanPropertyMap(false, props);
            assertEquals("size mismatch for n=" + n, n, map.size());
            for (int i = 0; i < n; i++) {
                assertNotNull("p" + i + " ควรหาได้ (n=" + n + ")", map.find("p" + i));
            }
            assertNull(map.find("not-present-xyz"));
        }
    }
}
```

## ตารางสรุป Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `size_emptyCollection_returnsZero` | constructor/init กับ collection ว่าง, `findSize(0)<=5` |
| `size_afterConstruction_matchesInputCount` | constructor ปกติ |
| `construct_staticFactory_worksSameAsConstructor` | static factory `construct()` |
| `find_withNullKey_throwsIllegalArgumentException` | `find(String)`: `key==null` → throw |
| `find_notFound_primarySlotNull_returnsNull` | `find()`: primary match==null (direct false) |
| `find_primaryMatch_returnsProperty_usingDifferentStringRef` | `find()`: primary hit ผ่าน `.equals()` (ไม่ใช่ `==`) |
| `find_secondaryMatch_returnsProperty` | `_find2`: secondary hit |
| `find_secondaryEmpty_noMatch_returnsNull` | `_find2`: secondary match==null |
| `find_spillMatch_returnsProperty` | `_find2`: spill loop hit + init() growth branch |
| `find_spillLoop_noMatch_returnsNull` | `_find2`: spill loop วนจนหมดแล้ว return null |
| `find_caseInsensitive_matchesRegardlessOfCase` | `_caseInsensitive==true` branch ของ `find`/`getPropertyName` |
| `duplicateNamedProperties_...` | init(): duplicate key ตกไป secondary slot (ไม่ dedupe) |
| `findByIndex_foundAndNotFound` | `find(int)`: matched/unmatched loop |
| `iterator_returnsAllNonNullProperties` | `properties()`/`iterator()` |
| `toString_containsAllPropertyNames` / `toString_emptyMap_...` | `toString()`: loop มี/ไม่มี element, comma separator (`count++>0`) |
| `getPropertiesInInsertionOrder_preservesGivenOrder` | `getPropertiesInInsertionOrder()` |
| `assignIndexes_...` | `assignIndexes()`: `prop!=null` branch, loop หลายรอบ |
| `withCaseInsensitivity_sameState_...` | `withCaseInsensitivity`: state เท่ากัน → return this |
| `withCaseInsensitivity_differentState_...` | `withCaseInsensitivity`: state ต่าง → new instance + re-init |
| `withProperty_replaceExisting_...` | `withProperty()`: branch replace (early return) |
| `withProperty_appendNew_triggersSpillGrowth_...` | `withProperty()`: append + primary/secondary/spill + growth (`ix>=length`) |
| `withProperty_appendNew_sizeShouldReflectNewCount` | **Fault-detection**: `_size` ไม่ถูก update ใน `withProperty()` |
| `replace_existingProperty_...` | `replace()`: found branch |
| `replace_nonExistingProperty_throws...` | `replace()`: not found → `NoSuchElementException` |
| `remove_existingProperty_...` | `remove()`: found branch, hole creation |
| `remove_nonExistingProperty_throws...` | `remove()`: `!found` → `NoSuchElementException` |
| `renameAll_nullTransformer_...` / `renameAll_nopTransformer_...` | `renameAll()`: early return conditions |
| `renameAll_withTransformer_...` | `renameAll()`: loop, `prop==null` (hole) branch, `_rename` deser==null branch |
| `renameAll_withDeserializerThatChanges_...` | `_rename()`: `deser!=null` และ `newDeser!=deser` branch |
| `renameAll_whenNewDeserializerSameAsOld_...` | `_rename()`: `newDeser==deser` branch (ไม่เรียก withValueDeserializer) |
| `withoutProperties_emptyCollection_...` | `withoutProperties()`: `toExclude.isEmpty()` → return this |
| `withoutProperties_excludesMatchingAndDropsHoles` | `withoutProperties()`: `prop!=null` + `contains()` true/false, hole pruning |
| `withoutProperties_nonEmptyButNoMatch_...` | `withoutProperties()`: non-empty แต่ไม่ match |
| `findDeserializeAndSet_propertyFound_...` | `findDeserializeAndSet()`: found → call deserializeAndSet |
| `findDeserializeAndSet_propertyNotFound_...` | `findDeserializeAndSet()`: not found → false |
| `findDeserializeAndSet_exceptionFromProperty_isWrapped` | integration: exception → `wrapAndThrow` ผ่าน public path |
| `wrapAndThrow_error_propagatesDirectly` | `wrapAndThrow`: `t instanceof Error` |
| `wrapAndThrow_ioException_rethrownAsIs_whenWrapDisabled` | `wrapAndThrow`: IOException, `!wrap` true |
| `wrapAndThrow_plainIOException_rethrownAsIs_evenWhenWrapEnabled` | `wrapAndThrow`: IOException, `!(instanceof JsonProcessingException)` true |
| `wrapAndThrow_runtimeException_rethrownAsIs_whenWrapDisabled` | `wrapAndThrow`: `!wrap` branch สำหรับ RuntimeException |
| `wrapAndThrow_runtimeException_wrapped_whenWrapEnabled` | `wrapAndThrow`: wrap=true → `JsonMappingException.wrapWithPath` |
| `wrapAndThrow_nullContext_defaultsToWrapTrue` | `wrapAndThrow`: `ctxt==null` → wrap=true |
| `wrapAndThrow_invocationTargetException_unwrapsCause` | `wrapAndThrow`: while-loop unwrap `InvocationTargetException` |
| `findSize_boundaries_viaConstructionAndLookup` | `findSize()`: `<=5`, `<=12`, `>12` (single & multi-loop doubling) — ทดสอบทางอ้อมผ่านพฤติกรรมจริง |

**ข้อจำกัดที่ระบุไว้ (ไม่เดา behavior):**
- ไม่ได้เขียน test บังคับ `IllegalStateException` ใน `_findFromOrdered()` เพราะ invariant นี้ไม่สามารถ trigger ผ่าน public API ตามปกติได้ (ต้องมี state ที่ขัดแย้งภายในซึ่งไม่เกิดขึ้นจาก usage ปกติ)
- `findSize()` เป็น private method จึงทดสอบทางอ้อมผ่านพฤติกรรมจริง (size/find) เท่านั้น ไม่ได้ assert ขนาด array ภายในตรง ๆ