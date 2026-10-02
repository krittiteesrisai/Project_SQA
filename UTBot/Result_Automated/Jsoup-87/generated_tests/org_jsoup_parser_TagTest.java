package org.jsoup.parser;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_parser_TagTest {
    ///region Test suites for executable org.jsoup.parser.Tag.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#getName()}
 * @utbot.returnsFrom {@code return tagName;}
 *  */
    @Test
    public void testGetName_ReturnTagName() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        String actual = tag.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.equals(tag);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): True}
 *  */
    @Test
    public void testEquals_NotOInstanceOfTag() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): True}
 *  */
    @Test
    public void testEquals_CanContainInlineNotEqualsTagCanContainInline() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): True}
 *  */
    @Test
    public void testEquals_EmptyNotEqualsTagEmpty() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): False}
 * @utbot.executesCondition {@code (formatAsBlock != tag.formatAsBlock): True}
 *  */
    @Test
    public void testEquals_FormatAsBlockNotEqualsTagFormatAsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): False}
 * @utbot.executesCondition {@code (formatAsBlock != tag.formatAsBlock): False}
 * @utbot.executesCondition {@code (isBlock != tag.isBlock): True}
 *  */
    @Test
    public void testEquals_IsBlockNotEqualsTagIsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): False}
 * @utbot.executesCondition {@code (formatAsBlock != tag.formatAsBlock): False}
 * @utbot.executesCondition {@code (isBlock != tag.isBlock): False}
 * @utbot.executesCondition {@code (preserveWhitespace != tag.preserveWhitespace): True}
 *  */
    @Test
    public void testEquals_PreserveWhitespaceNotEqualsTagPreserveWhitespace() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): False}
 * @utbot.executesCondition {@code (formatAsBlock != tag.formatAsBlock): False}
 * @utbot.executesCondition {@code (isBlock != tag.isBlock): False}
 * @utbot.executesCondition {@code (preserveWhitespace != tag.preserveWhitespace): False}
 * @utbot.executesCondition {@code (selfClosing != tag.selfClosing): True}
 *  */
    @Test
    public void testEquals_SelfClosingNotEqualsTagSelfClosing() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): False}
 * @utbot.executesCondition {@code (formatAsBlock != tag.formatAsBlock): False}
 * @utbot.executesCondition {@code (isBlock != tag.isBlock): False}
 * @utbot.executesCondition {@code (preserveWhitespace != tag.preserveWhitespace): False}
 * @utbot.executesCondition {@code (selfClosing != tag.selfClosing): False}
 * @utbot.executesCondition {@code (formList != tag.formList): True}
 *  */
    @Test
    public void testEquals_FormListNotEqualsTagFormList() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "@";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "formList", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): False}
 * @utbot.executesCondition {@code (formatAsBlock != tag.formatAsBlock): False}
 * @utbot.executesCondition {@code (isBlock != tag.isBlock): False}
 * @utbot.executesCondition {@code (preserveWhitespace != tag.preserveWhitespace): False}
 * @utbot.executesCondition {@code (selfClosing != tag.selfClosing): False}
 * @utbot.executesCondition {@code (formList != tag.formList): False}
 * @utbot.returnsFrom {@code return formSubmit == tag.formSubmit;}
 *  */
    @Test
    public void testEquals_FormSubmitNotEqualsTagFormSubmit() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "formSubmit", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): False}
 * @utbot.executesCondition {@code (canContainInline != tag.canContainInline): False}
 * @utbot.executesCondition {@code (empty != tag.empty): False}
 * @utbot.executesCondition {@code (formatAsBlock != tag.formatAsBlock): False}
 * @utbot.executesCondition {@code (isBlock != tag.isBlock): False}
 * @utbot.executesCondition {@code (preserveWhitespace != tag.preserveWhitespace): False}
 * @utbot.executesCondition {@code (selfClosing != tag.selfClosing): False}
 * @utbot.executesCondition {@code (formList != tag.formList): False}
 * @utbot.returnsFrom {@code return formSubmit == tag.formSubmit;}
 *  */
    @Test
    public void testEquals_FormSubmitEqualsTagFormSubmit() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        
        boolean actual = tag.equals(tag1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.executesCondition {@code (!tagName.equals(tag.tagName)): True}
 *  */
    @Test
    public void testEquals_NotTagNameEquals() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.equals(tag1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Tag)): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !tagName.equals(tag.tagName)
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Tag.equals] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.equals(Tag.java:205) */
        tag.equals(tag1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#toString()}
 * @utbot.returnsFrom {@code return tagName;}
 *  */
    @Test
    public void testToString_ReturnTagName() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        String actual = tag.toString();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (formatAsBlock): False}
 * @utbot.executesCondition {@code (canContainInline): True}
 * @utbot.executesCondition {@code (empty): False}
 * @utbot.executesCondition {@code (selfClosing): False}
 * @utbot.executesCondition {@code (preserveWhitespace): False}
 * @utbot.executesCondition {@code (formList): False}
 * @utbot.executesCondition {@code (formSubmit): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_FormSubmit() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "formSubmit", true);
        
        int actual = tag.hashCode();
        
        assertEquals(28629152, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (formatAsBlock): False}
 * @utbot.executesCondition {@code (canContainInline): True}
 * @utbot.executesCondition {@code (empty): False}
 * @utbot.executesCondition {@code (selfClosing): False}
 * @utbot.executesCondition {@code (preserveWhitespace): False}
 * @utbot.executesCondition {@code (formList): True}
 * @utbot.executesCondition {@code (formSubmit): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotFormSubmit() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "formList", true);
        
        int actual = tag.hashCode();
        
        assertEquals(-1975338786, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (formatAsBlock): False}
 * @utbot.executesCondition {@code (canContainInline): True}
 * @utbot.executesCondition {@code (empty): True}
 * @utbot.executesCondition {@code (selfClosing): False}
 * @utbot.executesCondition {@code (preserveWhitespace): False}
 * @utbot.executesCondition {@code (formList): False}
 * @utbot.executesCondition {@code (formSubmit): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotFormSubmit_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        int actual = tag.hashCode();
        
        assertEquals(-1974415296, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (formatAsBlock): False}
 * @utbot.executesCondition {@code (canContainInline): True}
 * @utbot.executesCondition {@code (empty): True}
 * @utbot.executesCondition {@code (selfClosing): True}
 * @utbot.executesCondition {@code (preserveWhitespace): True}
 * @utbot.executesCondition {@code (formList): False}
 * @utbot.executesCondition {@code (formSubmit): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotFormSubmit_2() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        
        int actual = tag.hashCode();
        
        assertEquals(-1974384544, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (formatAsBlock): False}
 * @utbot.executesCondition {@code (canContainInline): False}
 * @utbot.executesCondition {@code (empty): True}
 * @utbot.executesCondition {@code (selfClosing): True}
 * @utbot.executesCondition {@code (preserveWhitespace): True}
 * @utbot.executesCondition {@code (formList): True}
 * @utbot.executesCondition {@code (formSubmit): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotFormSubmit_3() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "preserveWhitespace", true);
        setField(tag, "org.jsoup.parser.Tag", "formList", true);
        
        int actual = tag.hashCode();
        
        assertEquals(-2003013664, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (formatAsBlock): True}
 * @utbot.executesCondition {@code (canContainInline): True}
 * @utbot.executesCondition {@code (empty): False}
 * @utbot.executesCondition {@code (selfClosing): True}
 * @utbot.executesCondition {@code (preserveWhitespace): False}
 * @utbot.executesCondition {@code (formList): False}
 * @utbot.executesCondition {@code (formSubmit): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_FormatAsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        
        int actual = tag.hashCode();
        
        assertEquals(-1087805345, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (isBlock): True}
 * @utbot.executesCondition {@code (formatAsBlock): False}
 * @utbot.executesCondition {@code (canContainInline): False}
 * @utbot.executesCondition {@code (empty): True}
 * @utbot.executesCondition {@code (selfClosing): False}
 * @utbot.executesCondition {@code (preserveWhitespace): False}
 * @utbot.executesCondition {@code (formList): False}
 * @utbot.executesCondition {@code (formSubmit): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_IsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = " ";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        int actual = tag.hashCode();
        
        assertEquals(-260234112, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int result = tagName.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Tag.hashCode] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.hashCode(Tag.java:218) */
        tag.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.valueOf
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method valueOf(java.lang.String, org.jsoup.parser.ParseSettings)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String,org.jsoup.parser.ParseSettings)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_ThrowIllegalArgumentException() {
        Tag.valueOf(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method valueOf(java.lang.String, org.jsoup.parser.ParseSettings)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tag}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String,org.jsoup.parser.ParseSettings)}
     */
    @Test
    public void testValueOfWithNonEmptyString() throws Exception  {
        ParseSettings parseSettings = new ParseSettings(false, false);
        
        Tag actual = Tag.valueOf("\n\t\r?", parseSettings);
        
        Tag expected = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "?";
        setField(expected, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(expected, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(expected, "org.jsoup.parser.Tag", "canContainInline", true);
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method valueOf(java.lang.String, org.jsoup.parser.ParseSettings)
    
    @Test
    public void testValueOf1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            String string = "";
            
            /* This test fails because method [org.jsoup.parser.Tag.valueOf] produces [java.lang.NullPointerException]
                org.jsoup.parser.Tag.valueOf(Tag.java:59) */
            Tag.valueOf(string, null);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.valueOf
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method valueOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return valueOf(tagName, ParseSettings.preserveCase);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_ThrowIllegalArgumentException1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ParseSettings prevPreserveCase = ParseSettings.preserveCase;
        try {
            ParseSettings preserveCase = new ParseSettings(true, true);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "preserveCase", preserveCase);
            
            Tag.valueOf(null);
        } finally {
            setStaticField(ParseSettings.class, "preserveCase", prevPreserveCase);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method valueOf(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tag}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String)}
     */
    @Test
    public void testValueOfWithNonEmptyString1() throws Exception  {
        Tag actual = Tag.valueOf("\u008A");
        
        Tag expected = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u008A";
        setField(expected, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(expected, "org.jsoup.parser.Tag", "formatAsBlock", true);
        setField(expected, "org.jsoup.parser.Tag", "canContainInline", true);
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method valueOf(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tag}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOfThrowsIAEWithNonEmptyString() {
        Tag.valueOf("\u0014\n\t\r");
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isEmpty()}
 * @utbot.returnsFrom {@code return empty;}
 *  */
    @Test
    public void testIsEmpty_ReturnEmpty() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.isEmpty();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.register
    
    ///region FUZZER: ERROR SUITE for method register(org.jsoup.parser.Tag)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tag}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#register(org.jsoup.parser.Tag)}
     */
    @Test
    public void testRegisterThrowsNPE() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.Tag.register] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.register(Tag.java:320) */
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Method registerMethod = tagClazz.getDeclaredMethod("register", tagClazz);
        registerMethod.setAccessible(true);
        java.lang.Object[] registerMethodArguments = new java.lang.Object[1];
        registerMethodArguments[0] = ((Object) null);
        try {
            registerMethod.invoke(null, registerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBlock()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isBlock()}
 * @utbot.returnsFrom {@code return isBlock;}
 *  */
    @Test
    public void testIsBlock_ReturnIsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.isBlock();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.formatAsBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatAsBlock()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#formatAsBlock()}
 * @utbot.returnsFrom {@code return formatAsBlock;}
 *  */
    @Test
    public void testFormatAsBlock_ReturnFormatAsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.formatAsBlock();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.canContainBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canContainBlock()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContainBlock()}
 * @utbot.returnsFrom {@code return isBlock;}
 *  */
    @Test
    public void testCanContainBlock_ReturnIsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.canContainBlock();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isSelfClosing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSelfClosing()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isSelfClosing()}
 * @utbot.returnsFrom {@code return empty || selfClosing;}
 *  */
    @Test
    public void testIsSelfClosing_EmptyOrSelfClosing() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.isSelfClosing();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isSelfClosing()}
 * @utbot.returnsFrom {@code return empty || selfClosing;}
 *  */
    @Test
    public void testIsSelfClosing_EmptyOrSelfClosing_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "selfClosing", true);
        
        boolean actual = tag.isSelfClosing();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isSelfClosing()}
 * @utbot.returnsFrom {@code return empty || selfClosing;}
 *  */
    @Test
    public void testIsSelfClosing_EmptyOrSelfClosing_2() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.isSelfClosing();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.preserveWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preserveWhitespace()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#preserveWhitespace()}
 * @utbot.returnsFrom {@code return preserveWhitespace;}
 *  */
    @Test
    public void testPreserveWhitespace_ReturnPreserveWhitespace() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.preserveWhitespace();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isFormListed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFormListed()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isFormListed()}
 * @utbot.returnsFrom {@code return formList;}
 *  */
    @Test
    public void testIsFormListed_ReturnFormList() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.isFormListed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isKnownTag
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isKnownTag()
    
    @Test
    public void testIsKnownTag1() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
            
            boolean actual = tag.isKnownTag();
            
            assertFalse(actual);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isKnownTag
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isKnownTag(java.lang.String)
    
    @Test
    public void testIsKnownTag2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            
            boolean actual = Tag.isKnownTag(null);
            
            assertFalse(actual);
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isFormSubmittable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFormSubmittable()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isFormSubmittable()}
 * @utbot.returnsFrom {@code return formSubmit;}
 *  */
    @Test
    public void testIsFormSubmittable_ReturnFormSubmit() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.isFormSubmittable();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.setSelfClosing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSelfClosing()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setSelfClosing()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetSelfClosing_Return() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Tag actual = tag.setSelfClosing();
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
        
        boolean finalTagSelfClosing = ((Boolean) getFieldValue(tag, "org.jsoup.parser.Tag", "selfClosing"));
        
        assertTrue(finalTagSelfClosing);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isInline
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInline()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isInline()}
 * @utbot.returnsFrom {@code return !isBlock;}
 *  */
    @Test
    public void testIsInline_NotIsBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        
        boolean actual = tag.isInline();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isInline()}
 * @utbot.returnsFrom {@code return !isBlock;}
 *  */
    @Test
    public void testIsInline_NotIsBlock_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.isInline();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isData()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isData()}
 * @utbot.returnsFrom {@code return !canContainInline && !isEmpty();}
 *  */
    @Test
    public void testIsData_NotCanContainInlineAndNotIsEmpty() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        
        boolean actual = tag.isData();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isData()}
 * @utbot.returnsFrom {@code return !canContainInline && !isEmpty();}
 *  */
    @Test
    public void testIsData_NotCanContainInlineAndNotIsEmpty_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.isData();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isData()}
 * @utbot.returnsFrom {@code return !canContainInline && !isEmpty();}
 *  */
    @Test
    public void testIsData_NotCanContainInlineAndNotIsEmpty_2() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.isData();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1008734319208900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1008734319208900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1008734319216000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008734319208900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008734319216000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1008734320017600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1008734320017600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1008734320020100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008734320017600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008734320020100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1008734321224300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1008734321224300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1008734321227000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008734321224300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008734321227000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1008734321934000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1008734321934000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1008734321936700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008734321934000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008734321936700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

