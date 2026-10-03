package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    @Test
    public void testSubmitWithExplicitActionAndPostMethod() {
        // Branch: hasAttr("action") = true, method = "POST"
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/login");
        attrs.put("method", "POST");

        FormElement form = new FormElement(tag, "http://example.com/base", attrs);
        Connection con = form.submit();

        assertEquals("http://example.com/login", con.request().url().toString());
        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test
    public void testSubmitWithBaseUriActionAndGetMethod() {
        // Branch: hasAttr("action") = false (falls back to baseUri), method = "GET" (or default)
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes(); // No action, no method

        FormElement form = new FormElement(tag, "http://example.com/base", attrs);
        Connection con = form.submit();

        assertEquals("http://example.com/base", con.request().url().toString());
        assertEquals(Connection.Method.GET, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitEmptyActionThrowsException() {
        // Edge Case / Branch: action and baseUri are both empty/missing -> Validate.notEmpty throws exception
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes();

        FormElement form = new FormElement(tag, "", attrs);
        form.submit();
    }

    @Test
    public void testFormDataWithSelectHavingSelectedOptions() {
        // Branch: select tag with selected options
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "dropdown");
        
        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com");
        opt1.attr("value", "1");
        opt1.attr("selected", "selected");
        select.appendChild(opt1);

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com");
        opt2.attr("value", "2");
        select.appendChild(opt2);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("dropdown", data.get(0).key());
        assertEquals("1", data.get(0).value());
    }

    @Test
    public void testFormDataWithSelectHavingNoSelectedOptionDefaultsToFirst() {
        // Branch: select tag with NO selected options -> falls back to first option
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "dropdown");
        
        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com");
        opt1.attr("value", "defaultVal");
        select.appendChild(opt1);

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("dropdown", data.get(0).key());
        assertEquals("defaultVal", data.get(0).value());
    }

    @Test
    public void testFormDataWithEmptySelectDoesNothing() {
        // Edge Case: select tag with NO options at all (option == null)
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        
        Element select = new Element(Tag.valueOf("select"), "http://example.com");
        select.attr("name", "dropdown");

        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormDataWithCheckboxAndRadioCheckedAndUnchecked() {
        // Branch: checkbox/radio with and without 'checked' attribute
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());

        Element cbChecked = new Element(Tag.valueOf("input"), "http://example.com");
        cbChecked.attr("type", "checkbox");
        cbChecked.attr("name", "cb1");
        cbChecked.attr("value", "yes");
        cbChecked.attr("checked", "checked");

        Element cbUnchecked = new Element(Tag.valueOf("input"), "http://example.com");
        cbUnchecked.attr("type", "checkbox");
        cbUnchecked.attr("name", "cb2");
        cbUnchecked.attr("value", "no");
        // No checked attribute

        Element radioChecked = new Element(Tag.valueOf("input"), "http://example.com");
        radioChecked.attr("type", "radio");
        radioChecked.attr("name", "rd1");
        radioChecked.attr("value", "male");
        radioChecked.attr("checked", "checked");

        form.addElement(cbChecked);
        form.addElement(cbUnchecked);
        form.addElement(radioChecked);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("cb1", data.get(0).key());
        assertEquals("yes", data.get(0).value());
        assertEquals("rd1", data.get(1).key());
        assertEquals("male", data.get(1).value());
    }

    @Test
    public void testFormDataFiltersOutUnsubmittableAndUnnamedElements() {
        // Branch: !el.tag().isFormSubmittable() and name.length() == 0
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());

        // Unsubmittable element (e.g., a div)
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.attr("name", "notSubmittable");

        // Submittable element but missing name
        Element unnamedInput = new Element(Tag.valueOf("input"), "http://example.com");
        unnamedInput.attr("type", "text");
        unnamedInput.attr("value", "val");
        // name is empty

        // Valid standard input
        Element validInput = new Element(Tag.valueOf("input"), "http://example.com");
        validInput.attr("type", "text");
        validInput.attr("name", "username");
        validInput.attr("value", "john");

        form.addElement(div);
        form.addElement(unnamedInput);
        form.addElement(validInput);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("john", data.get(0).value());
    }
}