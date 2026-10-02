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
