package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Unit tests for {@link JsonWriteContext}.
 *
 * หมายเหตุ:
 * - DupDetector, JsonStreamContext, JsonGenerationException เป็นคลาสที่ JsonWriteContext
 *   พึ่งพาโดยตรง (import อยู่ใน source ที่ให้มา) จึงถือว่าอยู่ใน classpath ของโปรเจกต์เป้าหมายแล้ว
 * - getCurrentIndex() เป็น method ที่ถูกเรียกใช้ภายใน appendDesc() ของคลาสเป้าหมาย
 *   ดังนั้นจึงสันนิษฐานว่าเป็น public method ที่ inherited มาจาก JsonStreamContext (ใช้เพื่อ verify state เท่านั้น)
 * - ใช้ package เดียวกับคลาสเป้าหมาย เพื่อลดปัญหาการเข้าถึง constructor / method ที่เป็น protected
 */
public class JsonWriteContextTest {

    // ---------- Root context ----------

    @Test
    public void testCreateRootContext_withNullDupDetector() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertNull("root ไม่มี parent", root.getParent());
        assertNull("ไม่มี dup detector", root.getDupDetector());
        assertEquals("appendDesc ของ ROOT ต้องเป็น '/'", "/", root.toString());
        assertNull("currentName เริ่มต้นต้องเป็น null", root.getCurrentName());
        assertNull("currentValue เริ่มต้นต้องเป็น null", root.getCurrentValue());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testCreateRootContext_deprecatedNoArg() {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertNull(root.getParent());
        assertNull(root.getDupDetector());
        assertEquals("/", root.toString());
    }

    @Test
    public void testWriteValue_rootContext_firstCallOkAsIs_secondCallAfterSpace() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        // _index เริ่มที่ -1 -> ++_index = 0 -> STATUS_OK_AS_IS (branch: _index==0 true)
        int status1 = root.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        // ครั้งที่สอง _index = 1 -> branch _index==0 false -> STATUS_OK_AFTER_SPACE
        int status2 = root.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, status2);
    }

    // ---------- Array child context ----------

    @Test
    public void testCreateChildArrayContext_firstTime_childNullBranch() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext arr = root.createChildArrayContext();

        assertSame("parent ของ array context ต้องเป็น root", root, arr.getParent());
        assertNull("dup detector ควรเป็น null เพราะ parent ไม่มี dup detector", arr.getDupDetector());
        assertEquals("[-1]", arr.toString()); // appendDesc: '[' + index(-1) + ']'
    }

    @Test
    public void testCreateChildArrayContext_reuseBranch() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext arr1 = root.createChildArrayContext();
        arr1.writeValue(); // ทำให้ index เปลี่ยนจาก -1 เป็น 0 เพื่อพิสูจน์ reset()

        // เรียกซ้ำ -> ต้องเข้า branch ctxt != null -> ctxt.reset(TYPE_ARRAY)
        JsonWriteContext arr2 = root.createChildArrayContext();

        assertSame("ต้อง reuse instance เดิม (_child)", arr1, arr2);
        assertEquals("หลัง reset index ต้องกลับเป็น -1", "[-1]", arr2.toString());
        assertNull("หลัง reset currentName ต้องเป็น null", arr2.getCurrentName());
    }

    @Test
    public void testWriteValue_arrayContext_firstAsIs_secondAfterComma() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext arr = root.createChildArrayContext();

        // ix = -1 (<0) -> STATUS_OK_AS_IS, index กลายเป็น 0
        int status1 = arr.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);

        // ix = 0 (ไม่ < 0) -> STATUS_OK_AFTER_COMMA
        int status2 = arr.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status2);
    }

    @Test
    public void testCreateChildArrayContext_withParentDupDetector() {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext arr = root.createChildArrayContext();

        // branch: (_dups == null) ? null : _dups.child()  -> ต้องได้ dup detector ที่ไม่ null
        assertNotNull("ต้องมี dup detector เพราะ parent มี", arr.getDupDetector());
    }

    // ---------- Object child context ----------

    @Test
    public void testCreateChildObjectContext_firstTime_noCurrentName() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        assertSame(root, obj.getParent());
        assertNull(obj.getDupDetector());
        // appendDesc OBJECT branch เมื่อ _currentName == null -> "{?}"
        assertEquals("{?}", obj.toString());
    }

    @Test
    public void testCreateChildObjectContext_reuseBranch() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj1 = root.createChildObjectContext();
        obj1.writeFieldName("a");
        obj1.writeValue();

        JsonWriteContext obj2 = root.createChildObjectContext();

        assertSame("ต้อง reuse instance เดิม", obj1, obj2);
        assertEquals("หลัง reset ต้องกลับเป็น {?}", "{?}", obj2.toString());
        assertNull(obj2.getCurrentName());
    }

    @Test
    public void testAppendDesc_objectContext_withCurrentName() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();
        obj.writeFieldName("field1");

        // appendDesc OBJECT branch เมื่อ _currentName != null -> "{\"field1\"}"
        assertEquals("{\"field1\"}", obj.toString());
    }

    @Test
    public void testWriteValue_objectContext_alwaysAfterColon() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        obj.writeFieldName("a");
        int status = obj.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, status);
        // gotName ต้องถูก reset เป็น false หลัง writeValue()
        // (ตรวจสอบทางอ้อมผ่านผลลัพธ์ของ writeFieldName ครั้งถัดไป)
        int nextFieldStatus = obj.writeFieldName("b");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, nextFieldStatus);
    }

    // ---------- writeFieldName branches ----------

    @Test
    public void testWriteFieldName_firstCall_indexLessThanZero_okAsIs() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        int status = obj.writeFieldName("name1");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertEquals("name1", obj.getCurrentName());
    }

    @Test
    public void testWriteFieldName_gotNameAlreadyTrue_expectValue() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        obj.writeFieldName("name1"); // gotName -> true
        // เรียกซ้ำโดยไม่ writeValue() ก่อน -> branch _gotName == true
        int status = obj.writeFieldName("name2");
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, status);
        // currentName ต้องไม่ถูกเปลี่ยนเพราะ return ก่อนตั้งชื่อใหม่
        assertEquals("name1", obj.getCurrentName());
    }

    @Test
    public void testWriteFieldName_afterValue_indexNotNegative_afterComma() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        obj.writeFieldName("name1");
        obj.writeValue(); // index -> 0, gotName -> false

        int status = obj.writeFieldName("name2");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
    }

    @Test
    public void testWriteFieldName_noDupDetector_duplicateNameAllowed() throws JsonProcessingException {
        // branch: _dups == null -> ไม่มีการเช็ค dup เลย
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        obj.writeFieldName("dup");
        obj.writeValue();
        // เขียนชื่อซ้ำอีกครั้งโดยไม่มี dup detector -> ต้องไม่ throw exception
        int status = obj.writeFieldName("dup");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_withDupDetector_duplicateThrows() throws JsonProcessingException {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext obj = root.createChildObjectContext(); // dup detector = dd.child()

        obj.writeFieldName("dupName");
        obj.writeValue(); // reset gotName เพื่อให้เขียนชื่อใหม่ได้อีกครั้ง

        // ชื่อซ้ำ -> _checkDup ต้อง throw JsonGenerationException
        obj.writeFieldName("dupName");
    }

    @Test
    public void testWriteFieldName_withDupDetector_differentNamesNoException() throws JsonProcessingException {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext obj = root.createChildObjectContext();

        obj.writeFieldName("nameA");
        obj.writeValue();
        // ชื่อไม่ซ้ำ -> ไม่ควร throw
        int status = obj.writeFieldName("nameB");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
    }

    // ---------- Null/empty boundary ----------

    @Test
    public void testWriteFieldName_nullName_noDupDetector_noNPE() throws JsonProcessingException {
        // ค่า null ไม่ได้ระบุ behavior พิเศษใน source (ไม่มี null-check)
        // จึงทดสอบเพียงว่า flow ทำงานได้ตามเงื่อนไข index/gotName โดยไม่ throw
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        int status = obj.writeFieldName(null);
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertNull(obj.getCurrentName());
    }

    @Test
    public void testWriteFieldName_emptyStringName() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        int status = obj.writeFieldName("");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertEquals("", obj.getCurrentName());
    }

    // ---------- withDupDetector / getCurrentValue / setCurrentValue ----------

    @Test
    public void testWithDupDetector_setsAndReturnsSelf() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);

        JsonWriteContext result = root.withDupDetector(dd);
        assertSame("withDupDetector ต้อง return this", root, result);
        assertSame(dd, root.getDupDetector());
    }

    @Test
    public void testGetSetCurrentValue() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertNull(root.getCurrentValue());

        Object value = "hello";
        root.setCurrentValue(value);
        assertEquals("hello", root.getCurrentValue());
    }

    // ---------- appendDesc / toString for ARRAY with non-default index ----------

    @Test
    public void testAppendDesc_arrayContext_afterWriteValue() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext arr = root.createChildArrayContext();

        arr.writeValue(); // index -> 0
        assertEquals("[0]", arr.toString());

        arr.writeValue(); // index -> 1
        assertEquals("[1]", arr.toString());
    }
}
