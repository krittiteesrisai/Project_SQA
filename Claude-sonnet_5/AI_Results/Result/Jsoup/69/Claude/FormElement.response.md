# FormElementTest.java

วิเคราะห์ branch ที่ต้องครอบคลุมจาก source:

**`submit()`**
1. `hasAttr("action")` → true / false
2. `Validate.notEmpty(action, ...)` → ไม่ throw / throw `IllegalArgumentException`
3. `attr("method").toUpperCase().equals("POST")` → true (POST, case-insensitive) / false (GET หรือค่าว่าง)

**`formData()`**
4. loop over `elements` → ว่าง / มีหลาย element
5. `!el.tag().isFormSubmittable()` → true (skip) / false
6. `el.hasAttr("disabled")` → true (skip) / false
7. `name.length() == 0` → true (skip) / false
8. `"select".equals(el.tagName())`
   - 8a. มี `option[selected]` → loop เพิ่มหลายตัว, `set = true`
   - 8b. ไม่มี selected, มี option แรก → เพิ่ม option แรก
   - 8c. ไม่มี selected, ไม่มี option เลย (`option == null`) → ไม่เพิ่ม
9. `"checkbox".equalsIgnoreCase(type) || "radio".equalsIgnoreCase(type)`
   - 9a. `hasAttr("checked")` true → เพิ่ม (val().length()>0 → ใช้ val() / ==0 → ใช้ "on")
   - 9b. ไม่ checked → skip
10. else (text/other input) → เพิ่ม `el.val()`

```java
package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    // ---------- Helper factory methods ----------

    private FormElement newForm(String baseUri) {
        return new FormElement(Tag.valueOf("form"), baseUri, new Attributes());
    }

    private Element newInput(String type, String name, String value) {
        Element el = new Element(Tag.valueOf("input"), "");
        if (type != null) el.attr("type", type);
        if (name != null) el.attr("name", name);
        if (value != null) el.attr("value", value);
        return el;
    }

    // ===========================================================
    // elements() / addElement()
    // ===========================================================

    @Test
    public void testAddElementAndElements_emptyInitially() {
        FormElement form = newForm("http://example.com/");
        assertNotNull(form.elements());
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testAddElement_chainingAndMultipleAdds() {
        FormElement form = newForm("http://example.com/");
        Element e1 = newInput("text", "a", "1");
        Element e2 = newInput("text", "b", "2");

        FormElement returned = form.addElement(e1).addElement(e2);

        assertSame(form, returned); // addElement returns this for chaining
        assertEquals(2, form.elements().size());
        assertSame(e1, form.elements().get(0));
        assertSame(e2, form.elements().get(1));
    }

    // ===========================================================
    // formData() - loop over empty list (branch 4: ว่าง)
    // ===========================================================

    @Test
    public void testFormData_emptyForm_returnsEmptyList() {
        FormElement form = newForm("http://example.com/");
        List<Connection.KeyVal> data = form.formData();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    // ===========================================================
    // formData() - branch 5: tag ไม่ formSubmittable (skip)
    // NOTE: ไม่มี source ของ Tag.isFormSubmittable() ให้ดู
    // อาศัยสมมติฐานจาก jsoup ว่า <div> ไม่ถือเป็น form-submittable element
    // ===========================================================

    @Test
    public void testFormData_skipsNonFormSubmittableTag() {
        FormElement form = newForm("http://example.com/");
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("name", "notReal");
        form.addElement(div);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    // ===========================================================
    // formData() - branch 6: disabled (skip)
    // ===========================================================

    @Test
    public void testFormData_skipsDisabledElement() {
        FormElement form = newForm("http://example.com/");
        Element input = newInput("text", "username", "joe");
        input.attr("disabled", "disabled");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    // ===========================================================
    // formData() - branch 7: name length == 0 (skip)
    // ===========================================================

    @Test
    public void testFormData_skipsElementWithoutName() {
        FormElement form = newForm("http://example.com/");
        Element input = newInput("text", null, "value-no-name");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    // ===========================================================
    // formData() - branch 8a: select with selected option(s)
    // ===========================================================

    @Test
    public void testFormData_selectWithSelectedOptions_addsAllSelected() {
        FormElement form = newForm("http://example.com/");

        Element select = new Element(Tag.valueOf("select"), "");
        select.attr("name", "color");

        Element option1 = new Element(Tag.valueOf("option"), "");
        option1.attr("value", "red");
        option1.attr("selected", "selected");

        Element option2 = new Element(Tag.valueOf("option"), "");
        option2.attr("value", "blue");
        option2.attr("selected", "selected");

        Element option3 = new Element(Tag.valueOf("option"), "");
        option3.attr("value", "green"); // not selected

        select.appendChild(option1);
        select.appendChild(option2);
        select.appendChild(option3);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("color", data.get(0).key());
        assertEquals("red", data.get(0).value());
        assertEquals("color", data.get(1).key());
        assertEquals("blue", data.get(1).value());
    }

    // ===========================================================
    // formData() - branch 8b: select ไม่มี selected -> ใช้ option แรก
    // ===========================================================

    @Test
    public void testFormData_selectWithoutSelected_usesFirstOption() {
        FormElement form = newForm("http://example.com/");

        Element select = new Element(Tag.valueOf("select"), "");
        select.attr("name", "color");

        Element option1 = new Element(Tag.valueOf("option"), "");
        option1.attr("value", "red");

        Element option2 = new Element(Tag.valueOf("option"), "");
        option2.attr("value", "blue");

        select.appendChild(option1);
        select.appendChild(option2);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("red", data.get(0).value());
    }

    // ===========================================================
    // formData() - branch 8c: select ไม่มี option เลย (option == null)
    // ===========================================================

    @Test
    public void testFormData_selectWithNoOptions_addsNothing() {
        FormElement form = newForm("http://example.com/");

        Element select = new Element(Tag.valueOf("select"), "");
        select.attr("name", "color");
        // no children at all

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    // ===========================================================
    // formData() - branch 9a: checkbox checked, val().length() > 0
    // ===========================================================

    @Test
    public void testFormData_checkboxChecked_withValue() {
        FormElement form = newForm("http://example.com/");
        Element cb = newInput("checkbox", "sub", "yes");
        cb.attr("checked", "checked");
        form.addElement(cb);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("sub", data.get(0).key());
        assertEquals("yes", data.get(0).value());
    }

    // ===========================================================
    // formData() - branch 9a: checkbox checked, val() ว่าง -> "on"
    // ===========================================================

    @Test
    public void testFormData_checkboxChecked_noValue_defaultsToOn() {
        FormElement form = newForm("http://example.com/");
        Element cb = newInput("checkbox", "sub", null); // no value attr
        cb.attr("checked", "checked");
        form.addElement(cb);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("on", data.get(0).value());
    }

    // ===========================================================
    // formData() - branch 9a type ตรวจแบบ case-insensitive (CheckBox)
    // ===========================================================

    @Test
    public void testFormData_checkboxTypeCaseInsensitive() {
        FormElement form = newForm("http://example.com/");
        Element cb = newInput("CheckBox", "sub", "v1");
        cb.attr("checked", "checked");
        form.addElement(cb);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("v1", data.get(0).value());
    }

    // ===========================================================
    // formData() - branch 9b: checkbox ไม่ checked -> skip
    // ===========================================================

    @Test
    public void testFormData_checkboxNotChecked_skipped() {
        FormElement form = newForm("http://example.com/");
        Element cb = newInput("checkbox", "sub", "yes");
        // no 'checked' attr
        form.addElement(cb);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    // ===========================================================
    // formData() - radio checked (similar branch to checkbox)
    // ===========================================================

    @Test
    public void testFormData_radioChecked_withValue() {
        FormElement form = newForm("http://example.com/");
        Element radio = newInput("radio", "gender", "m");
        radio.attr("checked", "checked");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("m", data.get(0).value());
    }

    // ===========================================================
    // formData() - branch 10: else (ปุ่มธรรมดา/text input)
    // ===========================================================

    @Test
    public void testFormData_plainTextInput_addsValue() {
        FormElement form = newForm("http://example.com/");
        Element input = newInput("text", "username", "joe");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("joe", data.get(0).value());
    }

    // ===========================================================
    // formData() - multiple elements, mixed branches together
    // ===========================================================

    @Test
    public void testFormData_multipleMixedElements() {
        FormElement form = newForm("http://example.com/");

        Element text = newInput("text", "username", "joe");

        Element disabled = newInput("text", "x", "y");
        disabled.attr("disabled", "disabled");

        Element noName = newInput("text", null, "z");

        Element cbChecked = newInput("checkbox", "agree", "1");
        cbChecked.attr("checked", "checked");

        Element cbUnchecked = newInput("checkbox", "spam", "1");

        form.addElement(text)
            .addElement(disabled)
            .addElement(noName)
            .addElement(cbChecked)
            .addElement(cbUnchecked);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("agree", data.get(1).key());
    }

    // ===========================================================
    // submit() - branch 1: hasAttr("action") == true, branch 3 GET
    // ===========================================================

    @Test
    public void testSubmit_actionAttributePresent_resolvesAbsoluteUrl_methodGet() {
        FormElement form = newForm("http://example.com/");
        form.attr("action", "submit.php");

        Connection conn = form.submit();

        assertEquals("http://example.com/submit.php", conn.request().url().toString());
        assertEquals(Connection.Method.GET, conn.request().method());
    }

    // ===========================================================
    // submit() - branch 3: method POST (uppercase attr value)
    // ===========================================================

    @Test
    public void testSubmit_methodPost_uppercaseAttrValue() {
        FormElement form = newForm("http://example.com/");
        form.attr("action", "submit.php");
        form.attr("method", "POST");

        Connection conn = form.submit();

        assertEquals(Connection.Method.POST, conn.request().method());
    }

    // ===========================================================
    // submit() - branch 3: method post (lowercase attr -> toUpperCase)
    // ===========================================================

    @Test
    public void testSubmit_methodPost_lowercaseAttrValue() {
        FormElement form = newForm("http://example.com/");
        form.attr("action", "submit.php");
        form.attr("method", "post");

        Connection conn = form.submit();

        assertEquals(Connection.Method.POST, conn.request().method());
    }

    // ===========================================================
    // submit() - branch 1: hasAttr("action") == false -> ใช้ baseUri()
    // ===========================================================

    @Test
    public void testSubmit_noActionAttribute_usesBaseUri() {
        FormElement form = newForm("http://example.com/page.html");
        // no action attr set

        Connection conn = form.submit();

        assertEquals("http://example.com/page.html", conn.request().url().toString());
        assertEquals(Connection.Method.GET, conn.request().method());
    }

    // ===========================================================
    // submit() - branch 2: Validate.notEmpty throws เมื่อไม่มี action และ baseUri ว่าง
    // ===========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_noActionNoBaseUri_throwsIllegalArgumentException() {
        FormElement form = newForm(""); // empty baseUri, no action attr
        form.submit();
    }
}
```

## สรุปตาราง Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testAddElementAndElements_emptyInitially | `elements()` เริ่มต้นว่าง |
| testAddElement_chainingAndMultipleAdds | `addElement()` คืนค่า `this`, เพิ่มหลาย element |
| testFormData_emptyForm_returnsEmptyList | loop ว่าง (branch 4: list ว่าง) |
| testFormData_skipsNonFormSubmittableTag | branch 5: `!isFormSubmittable()` = true → continue |
| testFormData_skipsDisabledElement | branch 6: `hasAttr("disabled")` = true → continue |
| testFormData_skipsElementWithoutName | branch 7: `name.length()==0` = true → continue |
| testFormData_selectWithSelectedOptions_addsAllSelected | branch 8a: loop `option[selected]`, `set=true` |
| testFormData_selectWithoutSelected_usesFirstOption | branch 8b: ไม่มี selected, เลือก option แรก |
| testFormData_selectWithNoOptions_addsNothing | branch 8c: `option==null` |
| testFormData_checkboxChecked_withValue | branch 9a: checked, `val().length()>0` |
| testFormData_checkboxChecked_noValue_defaultsToOn | branch 9a: checked, val ว่าง → "on" |
| testFormData_checkboxTypeCaseInsensitive | branch 9: `equalsIgnoreCase` ของ type |
| testFormData_checkboxNotChecked_skipped | branch 9b: ไม่ checked → skip |
| testFormData_radioChecked_withValue | branch 9a สำหรับ type="radio" |
| testFormData_plainTextInput_addsValue | branch 10: else (ไม่ select/checkbox/radio) |
| testFormData_multipleMixedElements | รวมหลาย branch ใน loop เดียว |
| testSubmit_actionAttributePresent_resolvesAbsoluteUrl_methodGet | branch 1: `hasAttr("action")`=true, branch 3 false→GET |
| testSubmit_methodPost_uppercaseAttrValue | branch 3: true (POST ตรง) |
| testSubmit_methodPost_lowercaseAttrValue | branch 3: true ผ่าน `toUpperCase()` |
| testSubmit_noActionAttribute_usesBaseUri | branch 1: `hasAttr("action")`=false → ใช้ `baseUri()` |
| testSubmit_noActionNoBaseUri_throwsIllegalArgumentException | branch 2: `Validate.notEmpty` throw exception |

**หมายเหตุสำคัญ:** โค้ด `Tag.isFormSubmittable()`, `Element.val()`, `hasAttr()`, และ `Connection.Request.url()/method()` ไม่ได้อยู่ใน source ที่ให้มาโดยตรง (เป็นส่วนของคลาสอื่นในไลบรารี jsoup) — การทดสอบอ้างอิงพฤติกรรมจริงของไลบรารี jsoup ที่อยู่ใน classpath ไม่ได้เดา behavior ของ `FormElement` เอง