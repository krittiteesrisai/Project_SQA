package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    @Test
    public void testSubmitWithActionAndPostMethod() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        form.attr("action", "/submit-path");
        form.attr("method", "POST");

        Connection con = form.submit();
        assertEquals("http://example.com/submit-path", con.request().url().toString());
        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test
    public void testSubmitWithoutActionUseBaseUriAndGetMethod() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/base", new Attributes());
        // No action attribute, method defaults to GET (or non-POST)

        Connection con = form.submit();
        assertEquals("http://example.com/base", con.request().url().toString());
        assertEquals(Connection.Method.GET, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmitFailsWhenActionAndBaseUriEmpty() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.submit();
    }

    @Test
    public void testFormDataFilteringAndStandardInputs() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());

        // 1. Non-submittable element (should be skipped)
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        div.attr("name", "divName");
        div.val("divVal");
        form.addElement(div);

        // 2. Disabled element (should be skipped)
        Element disabledInput = new Element(Tag.valueOf("input"), "http://example.com/");
        disabledInput.attr("name", "disabledName");
        disabledInput.attr("disabled", "disabled");
        disabledInput.val("val");
        form.addElement(disabledInput);

        // 3. Empty name element (should be skipped)
        Element noNameInput = new Element(Tag.valueOf("input"), "http://example.com/");
        noNameInput.attr("name", "");
        noNameInput.val("val");
        form.addElement(noNameInput);

        // 4. Standard text input (should be included)
        Element textInput = new Element(Tag.valueOf("input"), "http://example.com/");
        textInput.attr("name", "username");
        textInput.val("john_doe");
        form.addElement(textInput);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("john_doe", data.get(0).value());
    }

    @Test
    public void testFormDataSelectMultipleAndDefaultOptions() {
        // จำลองเคส Jsoup-69: ทดสอบ Tag select แบบมี selected หลายตัว, ไม่มี selected เลย (เอาตัวแรก), และ select เปล่าๆ
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());

        // Select Case A: มี option ที่ถูกเลือกไว้แล้วหลายตัว (Multiple select)
        Element selectMulti = new Element(Tag.valueOf("select"), "http://example.com/");
        selectMulti.attr("name", "colors");
        
        Element opt1 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt1.attr("value", "red");
        opt1.attr("selected", "selected");
        selectMulti.appendChild(opt1);

        Element opt2 = new Element(Tag.valueOf("option"), "http://example.com/");
        opt2.attr("value", "blue");
        opt2.attr("selected", "selected");
        selectMulti.appendChild(opt2);
        
        form.addElement(selectMulti);

        // Select Case B: ไม่มี option ไหนมี selected เลย -> ต้องเลือก option แรกสุดอัตโนมัติ
        Element selectDefault = new Element(Tag.valueOf("select"), "http://example.com/");
        selectDefault.attr("name", "size");

        Element optDefault1 = new Element(Tag.valueOf("option"), "http://example.com/");
        optDefault1.attr("value", "S");
        selectDefault.appendChild(optDefault1);

        Element optDefault2 = new Element(Tag.valueOf("option"), "http://example.com/");
        optDefault2.attr("value", "M");
        selectDefault.appendChild(optDefault2);

        form.addElement(selectDefault);

        // Select Case C: Select ไม่มี option เลย (Edge Case ป้องกัน NullPointer)
        Element selectEmpty = new Element(Tag.valueOf("select"), "http://example.com/");
        selectEmpty.attr("name", "emptySelect");
        form.addElement(selectEmpty);

        List<Connection.KeyVal> data = form.formData();
        
        assertEquals(3, data.size());
        assertEquals("colors", data.get(0).key());
        assertEquals("red", data.get(0).value());
        
        assertEquals("colors", data.get(1).key());
        assertEquals("blue", data.get(1).value());
        
        assertEquals("size", data.get(2).key());
        assertEquals("S", data.get(2).value()); // เอาตัวแรกเพราะไม่มี selected
    }

    @Test
    public void testFormDataCheckboxAndRadio() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());

        // Checkbox checked with explicit value
        Element cbChecked = new Element(Tag.valueOf("input"), "http://example.com/");
        cbChecked.attr("type", "checkbox");
        cbChecked.attr("name", "subscribe");
        cbChecked.attr("value", "yes");
        cbChecked.attr("checked", "checked");
        form.addElement(cbChecked);

        // Checkbox checked without value (should default to "on")
        Element cbNoVal = new Element(Tag.valueOf("input"), "http://example.com/");
        cbNoVal.attr("type", "checkbox");
        cbNoVal.attr("name", "newsletter");
        cbNoVal.attr("checked", "");
        form.addElement(cbNoVal);

        // Checkbox NOT checked (should be ignored)
        Element cbUnchecked = new Element(Tag.valueOf("input"), "http://example.com/");
        cbUnchecked.attr("type", "checkbox");
        cbUnchecked.attr("name", "promo");
        form.addElement(cbUnchecked);

        // Radio checked
        Element radioChecked = new Element(Tag.valueOf("input"), "http://example.com/");
        radioChecked.attr("type", "radio");
        radioChecked.attr("name", "gender");
        radioChecked.attr("value", "female");
        radioChecked.attr("checked", "checked");
        form.addElement(radioChecked);

        List<Connection.KeyVal> data = form.formData();
        
        assertEquals(3, data.size());
        assertEquals("subscribe", data.get(0).key());
        assertEquals("yes", data.get(0).value());

        assertEquals("newsletter", data.get(1).key());
        assertEquals("on", data.get(1).value()); // ตรวจสอบ Default value "on" เมื่อ value ว่าง

        assertEquals("gender", data.get(2).key());
        assertEquals("female", data.get(2).value());
    }
}