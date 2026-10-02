# FormElementTest.java

```java
package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.nodes.FormElement (Jsoup-93b)
 *
 * หมายเหตุ: การทดสอบนี้ใช้ Jsoup.parse() เพื่อสร้าง FormElement จาก DOM จริง
 * เนื่องจากไม่มี mocking framework ใน classpath ที่กำหนด
 * บางพฤติกรรม (เช่น parser จะเรียก addElement() ให้กับ input/select ที่อยู่ใน form โดยอัตโนมัติ,
 * หรือ div ไม่ใช่ tag ที่ isFormSubmittable()) อ้างอิงจากพฤติกรรมมาตรฐานของ jsoup parser/Tag
 * ซึ่งไม่ได้เดาเอง แต่เป็นสิ่งจำเป็นเพื่อสร้าง fixture ทดสอบคลาสเป้าหมาย
 */
public class FormElementTest {

    private FormElement parseForm(String html, String baseUri) {
        Document doc = Jsoup.parse(html, baseUri);
        Element formEl = doc.select("form").first();
        assertNotNull("form not found in parsed html", formEl);
        assertTrue("expected FormElement instance", formEl instanceof FormElement);
        return (FormElement) formEl;
    }

    // ---------- elements() / addElement() / removeChild() ----------

    @Test
    public void testElementsInitiallyEmpty() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Elements els = form.elements();
        assertNotNull(els);
        assertEquals(0, els.size());
    }

    @Test
    public void testAddElementAddsAndReturnsThisForChaining() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "");
        FormElement result = form.addElement(input);

        assertSame("addElement should return same FormElement instance for chaining", form, result);
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testAddElementMultipleAccumulates() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element i1 = new Element(Tag.valueOf("input"), "");
        Element i2 = new Element(Tag.valueOf("input"), "");
        form.addElement(i1).addElement(i2);

        assertEquals(2, form.elements().size());
    }

    @Test
    public void testRemoveChildRemovesFromElementsList() {
        // parser จะเพิ่ม input เข้า form.elements() โดยอัตโนมัติ (พฤติกรรมมาตรฐานของ jsoup parser)
        FormElement form = parseForm("<form><input type='text' name='a'></form>", "http://example.com/");
        assertEquals(1, form.elements().size());

        Element inputEl = form.elements().first();
        inputEl.remove(); // internally calls parent.removeChild(this)

        assertEquals(0, form.elements().size());
    }

    // ---------- submit() ----------

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitThrowsWhenNoActionAndNoBaseUri() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.submit(); // action resolves to "" -> Validate.notEmpty should throw
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitThrowsWhenActionPresentButCannotBeMadeAbsolute() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.attr("action", "relative.php"); // hasAttr("action") == true, but absUrl() will be ""
        form.submit();
    }

    @Test
    public void testSubmitUsesBaseUriWhenNoActionAttr() {
        FormElement form = parseForm("<form><input type='text' name='a' value='b'></form>",
                "http://example.com/page");
        Connection conn = form.submit();
        assertEquals("http://example.com/page", conn.request().url().toExternalForm());
    }

    @Test
    public void testSubmitUsesAbsUrlFromActionAttr() {
        FormElement form = parseForm("<form action='submit.php'></form>",
                "http://example.com/dir/page.html");
        Connection conn = form.submit();
        assertEquals("http://example.com/dir/submit.php", conn.request().url().toExternalForm());
    }

    @Test
    public void testSubmitMethodDefaultsToGetWhenNoMethodAttr() {
        FormElement form = parseForm("<form action='/x'></form>", "http://example.com/");
        Connection conn = form.submit();
        assertEquals(Connection.Method.GET, conn.request().method());
    }

    @Test
    public void testSubmitMethodPostLowercase() {
        FormElement form = parseForm("<form action='/x' method='post'></form>", "http://example.com/");
        Connection conn = form.submit();
        assertEquals(Connection.Method.POST, conn.request().method());
    }

    @Test
    public void testSubmitMethodPostMixedCase() {
        FormElement form = parseForm("<form action='/x' method='PoSt'></form>", "http://example.com/");
        Connection conn = form.submit();
        assertEquals(Connection.Method.POST, conn.request().method());
    }

    @Test
    public void testSubmitMethodOtherValueFallsBackToGet() {
        FormElement form = parseForm("<form action='/x' method='put'></form>", "http://example.com/");
        Connection conn = form.submit();
        assertEquals(Connection.Method.GET, conn.request().method());
    }

    // ---------- formData(): general skip branches ----------

    @Test
    public void testFormDataSimpleTextInput() {
        FormElement form = parseForm("<form><input type='text' name='user' value='john'></form>",
                "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("user", data.get(0).key());
        assertEquals("john", data.get(0).value());
    }

    @Test
    public void testFormDataSkipsDisabledInput() {
        FormElement form = parseForm(
                "<form><input type='text' name='user' value='john' disabled></form>",
                "http://example.com/");
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataSkipsInputWithoutName() {
        FormElement form = parseForm("<form><input type='text' value='john'></form>",
                "http://example.com/");
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataSkipsNonFormSubmittableElement() {
        // สร้าง FormElement แบบ standalone แล้วเพิ่ม <div> (ไม่ใช่ formSubmittable) โดยตรง
        // เพื่อแยกเงื่อนไข isFormSubmittable() ออกจากเงื่อนไข name-empty
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        div.attr("name", "foo"); // ตั้งชื่อไว้เพื่อยืนยันว่าถูกข้ามเพราะ tag ไม่ submittable ไม่ใช่เพราะ name ว่าง
        form.addElement(div);

        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataMultipleElementsAccumulate() {
        FormElement form = parseForm(
                "<form>" +
                        "<input type='text' name='user' value='john'>" +
                        "<input type='checkbox' name='agree' checked>" +
                        "<select name='color'><option value='red' selected>Red</option></select>" +
                        "</form>", "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(3, data.size());
    }

    // ---------- formData(): select branch ----------

    @Test
    public void testFormDataSelectWithSingleSelectedOption() {
        FormElement form = parseForm(
                "<form><select name='color'>" +
                        "<option value='red'>Red</option>" +
                        "<option value='blue' selected>Blue</option>" +
                        "</select></form>", "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("color", data.get(0).key());
        assertEquals("blue", data.get(0).value());
    }

    @Test
    public void testFormDataSelectWithMultipleSelectedOptions() {
        FormElement form = parseForm(
                "<form><select name='color' multiple>" +
                        "<option value='red' selected>Red</option>" +
                        "<option value='blue' selected>Blue</option>" +
                        "</select></form>", "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("red", data.get(0).value());
        assertEquals("blue", data.get(1).value());
    }

    @Test
    public void testFormDataSelectWithNoSelectionPicksFirstOption() {
        FormElement form = parseForm(
                "<form><select name='color'>" +
                        "<option value='red'>Red</option>" +
                        "<option value='blue'>Blue</option>" +
                        "</select></form>", "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("red", data.get(0).value());
    }

    @Test
    public void testFormDataSelectWithNoOptionsAddsNothing() {
        FormElement form = parseForm("<form><select name='color'></select></form>",
                "http://example.com/");
        assertEquals(0, form.formData().size());
    }

    // ---------- formData(): checkbox / radio branch ----------

    @Test
    public void testFormDataCheckboxCheckedWithValue() {
        FormElement form = parseForm(
                "<form><input type='checkbox' name='agree' value='yes' checked></form>",
                "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testFormDataCheckboxCheckedWithoutValueDefaultsToOn() {
        FormElement form = parseForm("<form><input type='checkbox' name='agree' checked></form>",
                "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testFormDataCheckboxUncheckedSkipped() {
        FormElement form = parseForm("<form><input type='checkbox' name='agree' value='yes'></form>",
                "http://example.com/");
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataRadioCheckedAdded() {
        FormElement form = parseForm("<form><input type='radio' name='gender' value='m' checked></form>",
                "http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("m", data.get(0).value());
    }

    @Test
    public void testFormDataRadioUncheckedSkipped() {
        FormElement form = parseForm("<form><input type='radio' name='gender' value='m'></form>",
                "http://example.com/");
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataCheckboxTypeIsCaseInsensitive() {
        FormElement form = parseForm("<form><input type='CHECKBOX' name='agree' checked></form>",
                "http://example.com/");
        assertEquals(1, form.formData().size());
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| testElementsInitiallyEmpty | `elements()` คืนค่า object ว่าง (boundary: 0 elements) |
| testAddElementAddsAndReturnsThisForChaining | `addElement()` เพิ่มสมาชิกและ return this (chaining) |
| testAddElementMultipleAccumulates | `addElement()` เรียกซ้ำ (loop/accumulate หลายรายการ) |
| testRemoveChildRemovesFromElementsList | `removeChild()` override ลบจาก `elements` list |
| testSubmitThrowsWhenNoActionAndNoBaseUri | `submit()`: `hasAttr("action")==false` → action=`baseUri()`="" → exception branch |
| testSubmitThrowsWhenActionPresentButCannotBeMadeAbsolute | `submit()`: `hasAttr("action")==true` แต่ `absUrl()` ว่าง → exception branch |
| testSubmitUsesBaseUriWhenNoActionAttr | `submit()`: `hasAttr("action")==false` → ใช้ `baseUri()` สำเร็จ |
| testSubmitUsesAbsUrlFromActionAttr | `submit()`: `hasAttr("action")==true` → ใช้ `absUrl("action")` สำเร็จ |
| testSubmitMethodDefaultsToGetWhenNoMethodAttr | เงื่อนไข method ternary: ไม่ใช่ "POST" → GET |
| testSubmitMethodPostLowercase | เงื่อนไข method ternary: "post" → toUpperCase().equals("POST") → POST |
| testSubmitMethodPostMixedCase | เงื่อนไข method ternary: case-insensitive "PoSt" → POST |
| testSubmitMethodOtherValueFallsBackToGet | เงื่อนไข method ternary: ค่าอื่น ("put") → GET |
| testFormDataSimpleTextInput | `formData()`: path ปกติ (else branch) ของ input ธรรมดา |
| testFormDataSkipsDisabledInput | `if (el.hasAttr("disabled")) continue;` = true |
| testFormDataSkipsInputWithoutName | `if (name.length()==0) continue;` = true |
| testFormDataSkipsNonFormSubmittableElement | `if (!el.tag().isFormSubmittable()) continue;` = true |
| testFormDataMultipleElementsAccumulate | for-loop หลาย element, ผสมหลาย branch (text/checkbox/select) |
| testFormDataSelectWithSingleSelectedOption | select branch: loop options มี 1 selected, `set=true`, ข้าม `if(!set)` |
| testFormDataSelectWithMultipleSelectedOptions | select branch: loop options หลาย selected (loop ≥2 รอบ) |
| testFormDataSelectWithNoSelectionPicksFirstOption | select branch: `set=false` → `if(!set)` → `option!=null` |
| testFormDataSelectWithNoOptionsAddsNothing | select branch: `set=false` → `option==null` → ไม่เพิ่มข้อมูล |
| testFormDataCheckboxCheckedWithValue | checkbox/radio branch: `hasAttr("checked")=true`, `val().length()>0` |
| testFormDataCheckboxCheckedWithoutValueDefaultsToOn | checkbox/radio branch: `hasAttr("checked")=true`, `val().length()==0` → "on" |
| testFormDataCheckboxUncheckedSkipped | checkbox/radio branch: `hasAttr("checked")=false` → ไม่เพิ่ม |
| testFormDataRadioCheckedAdded | radio type ("checked"=true) เข้า branch เดียวกับ checkbox |
| testFormDataRadioUncheckedSkipped | radio type ("checked"=false) ไม่เพิ่ม |
| testFormDataCheckboxTypeIsCaseInsensitive | `"checkbox".equalsIgnoreCase(type)` รองรับ case-insensitive |

**หมายเหตุสำคัญ:** การทดสอบใช้ `Jsoup.parse()` สร้าง DOM จริงเพื่อให้ `FormElement.elements()` ถูกเติมค่าโดย parser ตามพฤติกรรมมาตรฐานของ jsoup (ไม่ได้ mock เนื่องจาก classpath ไม่มี mocking framework) ส่วน branch ที่เกี่ยวกับ `isFormSubmittable()` ของ `<div>` อ้างอิงจากข้อเท็จจริงที่ `<div>` ไม่ถูกจัดเป็น form-submittable tag ตามสเปค HTML/jsoup Tag ซึ่งเป็นพฤติกรรมมาตรฐานไม่ได้เดาเอง