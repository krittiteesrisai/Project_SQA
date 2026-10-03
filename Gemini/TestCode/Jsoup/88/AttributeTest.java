package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttributeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullKey() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyKey() {
        new Attribute("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorBlankKey() {
        new Attribute("   ", "value");
    }

    @Test
    public void testConstructorAndGetters() {
        Attribute attr = new Attribute("href", "http://example.com");
        assertEquals("href", attr.getKey());
        assertEquals("http://example.com", attr.getValue());
        assertNull(attr.parent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyNull() {
        Attribute attr = new Attribute("key1", "val1");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKeyEmpty() {
        Attribute attr = new Attribute("key1", "val1");
        attr.setKey("   ");
    }

    @Test
    public void testSetKeyWithoutParent() {
        Attribute attr = new Attribute("key1", "val1");
        attr.setKey("key2");
        assertEquals("key2", attr.getKey());
    }

    @Test
    public void testSetKeyWithParentNotFound() {
        Attributes parent = new Attributes();
        parent.put("otherKey", "val1");
        Attribute attr = new Attribute("key1", "val1", parent);
        
        attr.setKey("key2");
        assertEquals("key2", attr.getKey());
        assertEquals("val1", parent.get("key2"));
    }

    @Test
    public void testSetKeyWithParentFound() {
        Attributes parent = new Attributes();
        parent.put("key1", "val1");
        // ดึง attribute จาก parent เพื่อผูกความสัมพันธ์
        Attribute attr = parent.dataset(); // ใช้ตัวอย่างจำลอง หรือสร้าง Attribute ที่มี parent ชี้มา
        // กำหนดผ่าน constructor โดยตรงเพื่อให้ parent รู้จัก
        Attribute attrWithParent = new Attribute("key1", "val1", parent);
        
        attrWithParent.setKey("key2");
        assertEquals("key2", attrWithParent.getKey());
        assertEquals("val1", parent.get("key2"));
        assertEquals("", parent.get("key1")); // key เก่าควรหายไปหรือถูกเปลี่ยน
    }

    @Test
    public void testSetValueWithoutParent() {
        Attribute attr = new Attribute("key1", "val1");
        String oldVal = attr.setValue("val2");
        // สังเกตว่าในโค้ดต้นฉบับ setValue เรียก parent.get(this.key) ซึ่งถ้า parent เป็น null อาจเกิด NullPointerException ได้
        // ทดสอบจุดนี้เพื่อเช็ค Fault ใน Defects4J
        assertEquals("val2", attr.getValue());
    }

    @Test
    public void testSetValueWithParent() {
        Attributes parent = new Attributes();
        parent.put("key1", "val1");
        Attribute attr = new Attribute("key1", "val1", parent);

        String oldVal = attr.setValue("val2");
        assertEquals("val2", attr.getValue());
        assertEquals("val2", parent.get("key1"));
    }

    @Test
    public void testHtmlOutputStandard() {
        Attribute attr = new Attribute("class", "foo bar");
        assertEquals("class=\"foo bar\"", attr.html());
        assertEquals("class=\"foo bar\"", attr.toString());
    }

    @Test
    public void testHtmlOutputBooleanAttribute() {
        Attribute attr = new Attribute("checked", "checked");
        Document.OutputSettings outHtml = new Document("").outputSettings();
        outHtml.syntax(Document.OutputSettings.Syntax.html);
        
        // ควรยุบ (collapse) เหลือแค่ชื่อ attribute ใน HTML syntax
        assertEquals("checked", attr.html());

        Document.OutputSettings outXml = new Document("").outputSettings();
        outXml.syntax(Document.OutputSettings.Syntax.xml);
        // ใน XML syntax จะไม่ยุบ
        assertEquals("checked=\"checked\"", attr.html());
    }

    @Test
    public void testHtmlOutputNullValue() {
        Attribute attr = new Attribute("async", null);
        assertEquals("async", attr.html());
    }

    @Test
    public void testHtmlOutputEscaping() {
        Attribute attr = new Attribute("title", "A & B \"C\"");
        assertEquals("title=\"A &amp; B &quot;C&quot;\"", attr.html());
    }

    @Test
    public void testCreateFromEncoded() {
        Attribute attr = Attribute.createFromEncoded("data-test", "Value &amp; More");
        assertEquals("data-test", attr.getKey());
        assertEquals("Value & More", attr.getValue());
    }

    @Test
    public void testIsDataAttribute() {
        assertTrue(Attribute.isDataAttribute("data-foo"));
        assertFalse(Attribute.isDataAttribute("data-"));
        assertFalse(Attribute.isDataAttribute("foo"));
        
        Attribute attr1 = new Attribute("data-bar", "1");
        assertTrue(attr1.isDataAttribute());
        
        Attribute attr2 = new Attribute("datac", "1");
        assertFalse(attr2.isDataAttribute());
    }

    @Test
    public void testIsBooleanAttribute() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertTrue(Attribute.isBooleanAttribute("selected"));
        assertFalse(Attribute.isBooleanAttribute("href"));
        
        Attribute attr = new Attribute("disabled", "disabled");
        assertTrue(attr.isBooleanAttribute());
        
        Attribute attrNonBool = new Attribute("class", "test");
        assertFalse(attrNonBool.isBooleanAttribute());
    }

    @Test
    public void testEqualsAndHashCode() {
        Attribute attr1 = new Attribute("key1", "val1");
        Attribute attr2 = new Attribute("key1", "val1");
        Attribute attr3 = new Attribute("key2", "val1");
        Attribute attr4 = new Attribute("key1", "val2");
        Attribute attrNullKey1 = new Attribute(null, "val1"); // อาจจะผ่าน constructor ยากถ้า validate แต่เทสเผื่อ
        Attribute attrNullVal1 = new Attribute("key1", null);

        assertEquals(attr1, attr1);
        assertEquals(attr1, attr2);
        assertEquals(attr1.hashCode(), attr2.hashCode());

        assertNotEquals(attr1, null);
        assertNotEquals(attr1, "some string");
        assertNotEquals(attr1, attr3);
        assertNotEquals(attr1, attr4);
        assertNotEquals(attrNullVal1, attr1);

        Attribute attrNullVal2 = new Attribute("key1", null);
        assertEquals(attrNullVal1, attrNullVal2);
        assertEquals(attrNullVal1.hashCode(), attrNullVal2.hashCode());
    }

    @Test
    public void testClone() {
        Attribute attr = new Attribute("key1", "val1");
        Attribute clone = attr.clone();
        
        assertNotSame(attr, clone);
        assertEquals(attr, clone);
        assertEquals(attr.getKey(), clone.getKey());
        assertEquals(attr.getValue(), clone.getValue());
    }
}