package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Tag;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.nodes.FormElement (Defects4J: Jsoup-42b)
 *
 * หมายเหตุ:
 * - ใช้การ parse HTML จริงเพื่อทดสอบ submit() (action/method resolution)
 * - ใช้การสร้าง FormElement/Element โดยตรงเพื่อควบคุม branch ของ formData() ให้แม่นยำ
 *   (ไม่พึ่งพาว่า parser จะเก็บ element ประเภทใดลงใน elements() จริง)
 * - สมมติฐานว่า Tag "div" ไม่ถือเป็น form-submittable tag (ตาม domain logic ของ HTML form)
 *   ถ้าไม่ตรงจริง ต้องปรับ tag ที่ใช้ทดสอบ branch "!isFormSubmittable()"
 */
public class FormElementTest {

    // ---------- Helper ----------
    private FormElement parseForm(String html, String baseUri) {
        Document doc = Jsoup.parse(html, baseUri);
        Element el = doc.select("form").first();
        assertTrue("Parsed element should be a FormElement", el instanceof FormElement);
        return (FormElement) el;
    }

    // =========================================================
    // elements() / addElement() tests
    // =========================================================

    @Test
    public void testElementsInitiallyEmpty() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        assertNotNull(form.elements());
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testAddElementAppendsAndChains() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "");
        FormElement returned = form.addElement(input);

        assertSame("addElement should return same FormElement for chaining", form, returned);
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    // =========================================================
    // formData() tests
    // =========================================================

    @Test
    public void testFormDataSkipsNotFormSubmittableTag() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("name", "foo"); // has name, but tag not submittable -> must be skipped
        form.addElement(div);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormDataSkipsEmptyNameAttribute() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("type", "text");
        input.attr("value", "bar"); // no "name" attribute -> name.length() == 0
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormDataDefaultTextInputAdded() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("type", "text");
        input.attr("name", "foo");
        input.attr("value", "bar");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("foo", data.get(0).key());
        assertEquals("bar", data.get(0).value());
    }

    @Test
    public void testFormDataCheckboxCheckedAdded() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "");
        checkbox.attr("type", "CheckBox"); // test case-insensitivity
        checkbox.attr("name", "cb");
        checkbox.attr("checked", "checked");
        form.addElement(checkbox);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("cb", data.get(0).key());
        assertEquals(checkbox.val(), data.get(0).value());
    }

    @Test
    public void testFormDataCheckboxNotCheckedSkipped() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "");
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "cb");
        // no "checked" attribute
        form.addElement(checkbox);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormDataRadioCheckedAdded() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element radio = new Element(Tag.valueOf("input"), "");
        radio.attr("type", "RADIO"); // case-insensitivity
        radio.attr("name", "r");
        radio.attr("checked", "checked");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("r", data.get(0).key());
    }

    @Test
    public void testFormDataRadioNotCheckedSkipped() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element radio = new Element(Tag.valueOf("input"), "");
        radio.attr("type", "radio");
        radio.attr("name", "r");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormDataSelectWithSingleSelectedOption() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "");
        select.attr("name", "sel");

        Element optA = new Element(Tag.valueOf("option"), "");
        optA.attr("value", "a");
        select.appendChild(optA);

        Element optB = new Element(Tag.valueOf("option"), "");
        optB.attr("value", "b");
        optB.attr("selected", "selected");
        select.appendChild(optB);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("sel", data.get(0).key());
        assertEquals("b", data.get(0).value());
    }

    @Test
    public void testFormDataSelectWithMultipleSelectedOptions() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "");
        select.attr("name", "sel");

        Element optA = new Element(Tag.valueOf("option"), "");
        optA.attr("value", "a");
        optA.attr("selected", "selected");
        select.appendChild(optA);

        Element optB = new Element(Tag.valueOf("option"), "");
        optB.attr("value", "b");
        optB.attr("selected", "selected");
        select.appendChild(optB);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("sel", data.get(0).key());
        assertEquals("a", data.get(0).value());
        assertEquals("sel", data.get(1).key());
        assertEquals("b", data.get(1).value());
    }

    @Test
    public void testFormDataSelectNoSelectedUsesFirstOption() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "");
        select.attr("name", "sel");

        Element optA = new Element(Tag.valueOf("option"), "");
        optA.attr("value", "a"); // no selected attribute on any option
        select.appendChild(optA);

        Element optB = new Element(Tag.valueOf("option"), "");
        optB.attr("value", "b");
        select.appendChild(optB);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("sel", data.get(0).key());
        assertEquals("a", data.get(0).value()); // first option used
    }

    @Test
    public void testFormDataSelectNoOptionsAtAllSkipped() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "");
        select.attr("name", "sel");
        // no <option> children at all

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size()); // option == null -> branch not entered
    }

    @Test
    public void testFormDataMultipleElementsMixed() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());

        Element text = new Element(Tag.valueOf("input"), "");
        text.attr("type", "text");
        text.attr("name", "foo");
        text.attr("value", "bar");
        form.addElement(text);

        Element noName = new Element(Tag.valueOf("input"), "");
        noName.attr("type", "text");
        noName.attr("value", "ignored");
        form.addElement(noName);

        Element notSubmittable = new Element(Tag.valueOf("div"), "");
        notSubmittable.attr("name", "ignored2");
        form.addElement(notSubmittable);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("foo", data.get(0).key());
    }

    // =========================================================
    // submit() tests
    // =========================================================

    @Test
    public void testSubmitActionAbsoluteAndMethodPost() {
        FormElement form = parseForm(
                "<form action='http://example.com/action' method='post'>" +
                        "<input type=text name=foo value=bar></form>",
                "http://example.com/");
        Connection con = form.submit();

        assertEquals("http://example.com/action", con.request().url().toString());
        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test
    public void testSubmitActionRelativeResolvedWithBaseUriAndMethodDefaultGet() {
        FormElement form = parseForm(
                "<form action='action.cgi'><input type=text name=foo value=bar></form>",
                "http://example.com/dir/");
        Connection con = form.submit();

        assertEquals("http://example.com/dir/action.cgi", con.request().url().toString());
        assertEquals(Connection.Method.GET, con.request().method()); // no method attr -> default GET
    }

    @Test
    public void testSubmitNoActionUsesBaseUri() {
        FormElement form = parseForm(
                "<form><input type=text name=foo value=bar></form>",
                "http://example.com/dir/");
        Connection con = form.submit();

        assertEquals("http://example.com/dir/", con.request().url().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitNoActionNoBaseUriThrows() {
        FormElement form = parseForm(
                "<form><input type=text name=foo value=bar></form>",
                ""); // no base URI at all -> hasAttr(action) == false branch, baseUri() empty
        form.submit();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitActionAttributePresentButEmptyThrows() {
        FormElement form = parseForm(
                "<form action=''><input type=text name=foo value=bar></form>",
                ""); // hasAttr(action) == true branch, but absUrl resolves to empty
        form.submit();
    }

    @Test
    public void testSubmitMethodCaseInsensitivePost() {
        FormElement form = parseForm(
                "<form action='http://example.com/a' method='PoSt'>" +
                        "<input type=text name=foo value=bar></form>",
                "http://example.com/");
        Connection con = form.submit();

        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test
    public void testSubmitMethodExplicitGet() {
        FormElement form = parseForm(
                "<form action='http://example.com/a' method='get'>" +
                        "<input type=text name=foo value=bar></form>",
                "http://example.com/");
        Connection con = form.submit();

        assertEquals(Connection.Method.GET, con.request().method());
    }

    // =========================================================
    // equals() override test (calls super.equals -> only basic identity tests,
    // ไม่สมมติ behavior เพิ่มเติมที่ไม่ปรากฎในซอร์ส)
    // =========================================================

    @Test
    public void testEqualsReflexive() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        assertTrue(form.equals(form));
    }

    @Test
    public void testEqualsDifferentTypeReturnsFalse() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        assertFalse(form.equals("not a form element"));
    }

    @Test
    public void testEqualsNullReturnsFalse() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        assertFalse(form.equals(null));
    }
}
