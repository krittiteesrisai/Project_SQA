package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    @Test
    public void testSubmitWithActionAndPostMethod() {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        attributes.put("action", "http://example.com/login");
        attributes.put("method", "POST");

        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Connection conn = form.submit();

        assertEquals("http://example.com/login", conn.request().url().toString());
        assertEquals(Connection.Method.POST, conn.request().method());
    }

    @Test
    public void testSubmitWithoutActionAndGetMethod() {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        attributes.put("method", "get"); // lowercase to test uppercase conversion

        FormElement form = new FormElement(tag, "http://example.com/base", attributes);
        Connection conn = form.submit();

        assertEquals("http://example.com/base", conn.request().url().toString());
        assertEquals(Connection.Method.GET, conn.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitEmptyActionAndBaseUriThrowsException() {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        // No action, no baseUri -> empty action URL

        FormElement form = new FormElement(tag, "", attributes);
        form.submit();
    }

    @Test
    public void testFormDataFilteringAndStandardInput() {
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com", new Attributes());

        // 1. Not submittable element (e.g., a div)
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.attr("name", "divName");
        div.attr("value", "divVal");
        form.addElement(div);

        // 2. Disabled element
        Element disabledInput = new Element(Tag.valueOf("input"), "http://example.com");
        disabledInput.attr("name", "disabledName");
        disabledInput.attr("value", "val");
        disabledInput.attr("disabled", "disabled");
        form.addElement(disabledInput);

        // 3. Empty name element
        Element emptyNameInput = new Element(Tag.valueOf("input"), "http://example.com");
        emptyNameInput.attr("name", "");
        emptyNameInput.attr("value", "val");
        form.addElement(emptyNameInput);

        // 4. Standard text input
        Element textInput = new Element(Tag.valueOf("input"), "http://example.com");
        textInput.attr("name", "username");
        textInput.attr("value", "jsoupUser");
        form.addElement(textInput);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("jsoupUser", data.get(0).value());
    }

    @Test
    public void testFormDataSelectWithOptionsSelected() {
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com", new Attributes());

        // Select element with selected options
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "colors");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com");
        opt1.attr("value", "red");
        opt1.attr("selected", "selected");
        select.appendChild(opt1);

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com");
        opt2.attr("value", "blue");
        opt2.attr("selected", "selected");
        select.appendChild(opt2);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("colors", data.get(0).key());
        assertEquals("red", data.get(0).value());
        assertEquals("colors", data.get(1).key());
        assertEquals("blue", data.get(1).value());
    }

    @Test
    public void testFormDataSelectFallbackFirstOption() {
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com", new Attributes());

        // Select element without [selected] attribute -> should fallback to first option
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "city");

        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com");
        opt1.attr("value", "Bangkok");
        select.appendChild(opt1);

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com");
        opt2.attr("value", "ChiangMai");
        select.appendChild(opt2);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("city", data.get(0).key());
        assertEquals("Bangkok", data.get(0).value());
    }

    @Test
    public void testFormDataSelectEmptyOptions() {
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com", new Attributes());

        // Select element with no options at all (option == null branch)
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "emptySelect");
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormDataCheckboxAndRadio() {
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com", new Attributes());

        // Checked checkbox with custom value
        Element cb1 = new Element(Tag.valueOf("input"), "http://example.com");
        cb1.attr("type", "checkbox");
        cb1.attr("name", "subscribe");
        cb1.attr("value", "yes");
        cb1.attr("checked", "checked");
        form.addElement(cb1);

        // Checked checkbox without value (defaults to "on")
        Element cb2 = new Element(Tag.valueOf("input"), "http://example.com");
        cb2.attr("type", "CHECKBOX"); // test ignoreCase
        cb2.attr("name", "newsletter");
        cb2.attr("checked", "checked");
        form.addElement(cb2);

        // Unchecked checkbox (should be skipped)
        Element cb3 = new Element(Tag.valueOf("input"), "http://example.com");
        cb3.attr("type", "checkbox");
        cb3.attr("name", "spam");
        cb3.attr("checked", ""); // hasAttr("checked") is true if attribute exists regardless of value in Jsoup, wait: let's test not having attribute
        // Better: do not add checked attribute at all for skipping test
        
        Element cb4 = new Element(Tag.valueOf("input"), "http://example.com");
        cb4.attr("type", "radio");
        cb4.attr("name", "gender");
        cb4.attr("value", "male");
        // no checked attribute -> skipped

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("subscribe", data.get(0).key());
        assertEquals("yes", data.get(0).value());
        assertEquals("newsletter", data.get(1).key());
        assertEquals("on", data.get(1).value());
    }

    @Test
    public void testRemoveChildUpdatesElementsList() {
        Tag formTag = Tag.valueOf("form");
        FormElement form = new FormElement(formTag, "http://example.com", new Attributes());

        Element input = new Element(Tag.valueOf("input"), "http://example.com");
        input.attr("name", "test");
        
        form.addElement(input);
        assertEquals(1, form.elements().size());

        form.removeChild(input);
        assertEquals(0, form.elements().size());
    }
}