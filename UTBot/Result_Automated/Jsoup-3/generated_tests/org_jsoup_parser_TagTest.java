package org.jsoup.parser;

import org.junit.Test;
import java.util.ArrayList;
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
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsOGetClass() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        int[] intArray = {};
        
        boolean actual = tag.equals(intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.equals(null);
        
        assertFalse(actual);
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
 * @utbot.executesCondition {@code (tagName != null): False}
 * @utbot.executesCondition {@code (isBlock): True}
 * @utbot.executesCondition {@code (canContainBlock): False}
 * @utbot.executesCondition {@code (canContainInline): False}
 * @utbot.executesCondition {@code (optionalClosing): False}
 * @utbot.executesCondition {@code (empty): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_NotEmpty() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        
        int actual = tag.hashCode();
        
        assertEquals(923521, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (tagName != null): False}
 * @utbot.executesCondition {@code (isBlock): True}
 * @utbot.executesCondition {@code (canContainBlock): False}
 * @utbot.executesCondition {@code (canContainInline): True}
 * @utbot.executesCondition {@code (optionalClosing): True}
 * @utbot.executesCondition {@code (empty): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_OptionalClosing() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        int actual = tag.hashCode();
        
        assertEquals(924513, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (tagName != null): False}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (canContainBlock): True}
 * @utbot.executesCondition {@code (canContainInline): False}
 * @utbot.executesCondition {@code (optionalClosing): False}
 * @utbot.executesCondition {@code (empty): True}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_Empty() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        int actual = tag.hashCode();
        
        assertEquals(29792, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#hashCode()}
 * @utbot.executesCondition {@code (tagName != null): True}
 * @utbot.executesCondition {@code (isBlock): False}
 * @utbot.executesCondition {@code (canContainBlock): True}
 * @utbot.executesCondition {@code (canContainInline): False}
 * @utbot.executesCondition {@code (optionalClosing): False}
 * @utbot.executesCondition {@code (empty): True}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_TagNameNotEqualsNull() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        int actual = tag.hashCode();
        
        assertEquals(29792, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.valueOf
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method valueOf(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link java.lang.String#toLowerCase()}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_ThrowIllegalArgumentException() {
        String string = "";
        
        Tag.valueOf(string);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_ThrowIllegalArgumentException_1() {
        Tag.valueOf(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method valueOf(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tag}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String)}
     */
    @Test
    public void testValueOfWithNonEmptyString() throws Exception  {
        Tag actual = Tag.valueOf("\u008A");
        
        Tag expected = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u008A";
        setField(expected, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(expected, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(expected, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag);
        setField(expected, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expected, actual);
    }
    
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
        setField(expected, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag);
        setField(expected, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method valueOf(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.parser.Tag}
     * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#valueOf(java.lang.String)}
     */
    @Test(timeout = 1000L)
    public void testValueOfWithNonEmptyString2() {
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Tag.valueOf("\u008A\u00B4");
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
    
    ///region OTHER: ERROR SUITE for method register(org.jsoup.parser.Tag)
    
    @Test
    public void testRegister1() throws Throwable  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        Tag prevDefaultAncestor = ((Tag) getStaticFieldValue(tagClazz, "defaultAncestor"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            Tag defaultAncestor = ((Tag) createInstance("org.jsoup.parser.Tag"));
            String tagName = "BODY";
            setField(defaultAncestor, "org.jsoup.parser.Tag", "tagName", tagName);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "isBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainBlock", true);
            setField(defaultAncestor, "org.jsoup.parser.Tag", "canContainInline", true);
            setStaticField(tagClazz, "defaultAncestor", defaultAncestor);
            
            /* This test fails because method [org.jsoup.parser.Tag.register] produces [java.lang.NullPointerException]
                org.jsoup.parser.Tag.register(Tag.java:330) */
            Method registerMethod = tagClazz.getDeclaredMethod("register", tagClazz);
            registerMethod.setAccessible(true);
            java.lang.Object[] registerMethodArguments = new java.lang.Object[1];
            registerMethodArguments[0] = ((Object) null);
            try {
                registerMethod.invoke(null, registerMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(Tag.class, "tags", prevTags);
            setStaticField(Tag.class, "defaultAncestor", prevDefaultAncestor);
        }
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
    
    ///region Test suites for executable org.jsoup.parser.Tag.canContain
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method canContain(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainBlock): True}
 *  */
    @Test
    public void testCanContain_NotThisCanContainBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        
        boolean actual = tag.canContain(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainInline): True}
 *  */
    @Test
    public void testCanContain_NotThisCanContainInline() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.canContain(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): False}
 * @utbot.executesCondition {@code (this.empty || this.isData()): False}
 *  */
    @Test
    public void testCanContain_ThisEmptyOrThisIsData() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.canContain(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): False}
 * @utbot.executesCondition {@code (this.empty || this.isData()): True}
 *  */
    @Test
    public void testCanContain_ThisEmptyOrThisIsData_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        
        boolean actual = tag.canContain(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        boolean actual = tag.canContain(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainInline): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): False}
 * @utbot.executesCondition {@code (this.empty || this.isData()): True}
 * @utbot.executesCondition {@code (this.tagName.equals("head")): False}
 * @utbot.executesCondition {@code (this.tagName.equals("dt") && child.tagName.equals("dd")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testCanContain_ThisTagNameEqualsAndChildTagNameEquals() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "\u0000\u0000\u0000\u0000";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.canContain(tag1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): False}
 * @utbot.executesCondition {@code (this.empty || this.isData()): True}
 * @utbot.executesCondition {@code (this.tagName.equals("head")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testCanContain_ThisTagNameEquals() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainInline): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainInline): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_2() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainInline): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 * @utbot.executesCondition {@code (this.empty || this.isData()): True}
 * @utbot.executesCondition {@code (this.tagName.equals("head")): False}
 * @utbot.executesCondition {@code (this.tagName.equals("dt") && child.tagName.equals("dd")): False}
 * @utbot.executesCondition {@code (this.tagName.equals("dd") && child.tagName.equals("dt")): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testCanContain_ThisTagNameEqualsAndChildTagNameEquals_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.canContain(tag1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method canContain(org.jsoup.parser.Tag)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (child.isBlock): False},
    ///     {@code (!child.isBlock): True},
    ///     {@code (!this.canContainInline): False},
    ///     {@code (this.empty || this.isData()): False}
    /// return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): False}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_3() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.canContain(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_4() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_5() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_6() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_8() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_7() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): True}
 *  */
    @Test
    public void testCanContain_ThisOptionalClosingAndThisEquals_9() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        setField(tag1, "org.jsoup.parser.Tag", "optionalClosing", true);
        setField(tag1, "org.jsoup.parser.Tag", "empty", true);
        
        boolean actual = tag.canContain(tag1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canContain(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.executesCondition {@code (child.isBlock): False}
 * @utbot.executesCondition {@code (!child.isBlock): True}
 * @utbot.executesCondition {@code (!this.canContainInline): False}
 * @utbot.executesCondition {@code (this.optionalClosing && this.equals(child)): False}
 * @utbot.executesCondition {@code (this.empty || this.isData()): True}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link org.jsoup.parser.Tag#isData()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.tagName.equals("head")
 *  */
    @Test
    public void testCanContain_ThrowNullPointerException() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        
        /* This test fails because method [org.jsoup.parser.Tag.canContain] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.canContain(Tag.java:84) */
        tag.canContain(tag);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method canContain(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContain(org.jsoup.parser.Tag)}
 * @utbot.invokes {@link org.apache.commons.lang.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(child);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCanContain_ThrowIllegalArgumentException() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        tag.canContain(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.createBlock
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBlock(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#createBlock(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return register(new Tag(tagName));
 *  */
    @Test
    public void testCreateBlock_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.Tag.createBlock] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.<init>(Tag.java:30)
            org.jsoup.parser.Tag.createBlock(Tag.java:319) */
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringType = Class.forName("java.lang.String");
        Method createBlockMethod = tagClazz.getDeclaredMethod("createBlock", stringType);
        createBlockMethod.setAccessible(true);
        java.lang.Object[] createBlockMethodArguments = new java.lang.Object[1];
        createBlockMethodArguments[0] = ((Object) null);
        try {
            createBlockMethod.invoke(null, createBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createBlock(java.lang.String)
    
    @Test
    public void testCreateBlock1() throws Exception  {
        String string = "[K[[A";
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringType = Class.forName("java.lang.String");
        Method createBlockMethod = tagClazz.getDeclaredMethod("createBlock", stringType);
        createBlockMethod.setAccessible(true);
        java.lang.Object[] createBlockMethodArguments = new java.lang.Object[1];
        createBlockMethodArguments[0] = string;
        Tag actual = ((Tag) createBlockMethod.invoke(null, createBlockMethodArguments));
        
        Tag expected = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "[k[[a";
        setField(expected, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(expected, "org.jsoup.parser.Tag", "isBlock", true);
        setField(expected, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(expected, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "body";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName2 = "html";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName2);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag);
        setField(expected, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.setOptionalClosing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOptionalClosing()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setOptionalClosing()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetOptionalClosing_Return() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Method setOptionalClosingMethod = tagClazz.getDeclaredMethod("setOptionalClosing");
        setOptionalClosingMethod.setAccessible(true);
        java.lang.Object[] setOptionalClosingMethodArguments = new java.lang.Object[0];
        Tag actual = ((Tag) setOptionalClosingMethod.invoke(tag, setOptionalClosingMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
        
        boolean finalTagOptionalClosing = ((Boolean) getFieldValue(tag, "org.jsoup.parser.Tag", "optionalClosing"));
        
        assertTrue(finalTagOptionalClosing);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.createInline
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInline(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#createInline(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Tag inline = new Tag(tagName);
 *  */
    @Test
    public void testCreateInline_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.parser.Tag.createInline] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.<init>(Tag.java:30)
            org.jsoup.parser.Tag.createInline(Tag.java:323) */
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringType = Class.forName("java.lang.String");
        Method createInlineMethod = tagClazz.getDeclaredMethod("createInline", stringType);
        createInlineMethod.setAccessible(true);
        java.lang.Object[] createInlineMethodArguments = new java.lang.Object[1];
        createInlineMethodArguments[0] = ((Object) null);
        try {
            createInlineMethod.invoke(null, createInlineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createInline(java.lang.String)
    
    @Test
    public void testCreateInline1() throws Exception  {
        String string = "@@@[ ";
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringType = Class.forName("java.lang.String");
        Method createInlineMethod = tagClazz.getDeclaredMethod("createInline", stringType);
        createInlineMethod.setAccessible(true);
        java.lang.Object[] createInlineMethodArguments = new java.lang.Object[1];
        createInlineMethodArguments[0] = string;
        Tag actual = ((Tag) createInlineMethod.invoke(null, createInlineMethodArguments));
        
        Tag expected = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(expected, "org.jsoup.parser.Tag", "tagName", string);
        setField(expected, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "body";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors1 = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName1 = "html";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName1);
        setField(tag1, "org.jsoup.parser.Tag", "isBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainBlock", true);
        setField(tag1, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors2 = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors2);
        ancestors1.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors1);
        ancestors.add(tag);
        setField(expected, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(expected, actual);
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
    
    ///region Test suites for executable org.jsoup.parser.Tag.getImplicitParent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImplicitParent()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#getImplicitParent()}
 * @utbot.executesCondition {@code ((!ancestors.isEmpty())): False}
 * @utbot.returnsFrom {@code return (!ancestors.isEmpty()) ? ancestors.get(0) : null;}
 *  */
    @Test
    public void testGetImplicitParent_AncestorsIsEmpty() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        Tag actual = tag.getImplicitParent();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#getImplicitParent()}
 * @utbot.executesCondition {@code ((!ancestors.isEmpty())): True}
 * @utbot.invokes {@link java.util.List#get(int)}
 * @utbot.returnsFrom {@code return (!ancestors.isEmpty()) ? ancestors.get(0) : null;}
 *  */
    @Test
    public void testGetImplicitParent_NotAncestorsIsEmpty() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        Tag actual = tag.getImplicitParent();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getImplicitParent()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#getImplicitParent()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (!ancestors.isEmpty())
 *  */
    @Test
    public void testGetImplicitParent_ThrowNullPointerException() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Tag.getImplicitParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.getImplicitParent(Tag.java:152) */
        tag.getImplicitParent();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.setAncestor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAncestor([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setAncestor(java.lang.String[])}
 * @utbot.executesCondition {@code (tagNames == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetAncestor_TagNamesNotEqualsNull() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = {};
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        Tag actual = ((Tag) setAncestorMethod.invoke(tag, setAncestorMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setAncestor(java.lang.String[])}
 * @utbot.executesCondition {@code (tagNames == null): True}
 * @utbot.invokes {@link java.util.Collections#emptyList()}
 *  */
    @Test
    public void testSetAncestor_TagNamesEqualsNull() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) null);
        Tag actual = ((Tag) setAncestorMethod.invoke(tag, setAncestorMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAncestor([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setAncestor(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String name: tagNames)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ancestors.add(Tag.valueOf(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAncestor_ThrowIllegalArgumentException() throws Throwable  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = {null};
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        try {
            setAncestorMethod.invoke(tag, setAncestorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setAncestor(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String name: tagNames)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ancestors.add(Tag.valueOf(name));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAncestor_ThrowIllegalArgumentException_1() throws Throwable  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        try {
            setAncestorMethod.invoke(tag, setAncestorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setAncestor([Ljava.lang.String;)
    
    @Test
    public void testSetAncestor1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = " A";
        stringArray[0] = string;
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        Tag actual = ((Tag) setAncestorMethod.invoke(tag, setAncestorMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
    }
    
    @Test
    public void testSetAncestor2() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "   ! ";
        stringArray[0] = string;
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        Tag actual = ((Tag) setAncestorMethod.invoke(tag, setAncestorMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAncestor([Ljava.lang.String;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetAncestor3() throws Throwable  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "[\u0000[\u0000\u0000\u0000!";
        stringArray[0] = string;
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        try {
            setAncestorMethod.invoke(tag, setAncestorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetAncestor4() throws Throwable  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        stringArray[2] = string1;
        stringArray[3] = string1;
        stringArray[4] = string1;
        stringArray[5] = string1;
        stringArray[6] = string1;
        stringArray[7] = string1;
        stringArray[8] = string1;
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        try {
            setAncestorMethod.invoke(tag, setAncestorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetAncestor5() throws Throwable  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "A\u0001\u0001";
        stringArray[0] = string;
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        try {
            setAncestorMethod.invoke(tag, setAncestorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetAncestor6() throws Throwable  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        java.lang.String[] stringArray = new java.lang.String[9];
        String string = "\u0001\u0001\u0001[\u0001";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        stringArray[2] = string1;
        stringArray[3] = string1;
        stringArray[4] = string1;
        stringArray[5] = string1;
        stringArray[6] = string1;
        stringArray[7] = string1;
        stringArray[8] = string1;
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method setAncestorMethod = tagClazz.getDeclaredMethod("setAncestor", stringArrayType);
        setAncestorMethod.setAccessible(true);
        java.lang.Object[] setAncestorMethodArguments = new java.lang.Object[1];
        setAncestorMethodArguments[0] = ((Object) stringArray);
        try {
            setAncestorMethod.invoke(tag, setAncestorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.setEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEmpty()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setEmpty()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetEmpty_Return() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Method setEmptyMethod = tagClazz.getDeclaredMethod("setEmpty");
        setEmptyMethod.setAccessible(true);
        java.lang.Object[] setEmptyMethodArguments = new java.lang.Object[0];
        Tag actual = ((Tag) setEmptyMethod.invoke(tag, setEmptyMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
        
        boolean finalTagEmpty = ((Boolean) getFieldValue(tag, "org.jsoup.parser.Tag", "empty"));
        
        assertTrue(finalTagEmpty);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.isValidParent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidParent(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 *  */
    @Test
    public void testIsValidParent_ReturnTrue() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse_3() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "empty", true);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag2);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse_7() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag1);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainInline", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse_4() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "optionalClosing", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse_5() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "isBlock", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse_6() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag, "org.jsoup.parser.Tag", "canContainBlock", true);
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsValidParent_ReturnFalse_2() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag1, "org.jsoup.parser.Tag", "tagName", tagName);
        ancestors.add(tag1);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 *  */
    @Test
    public void testIsValidParent_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ancestors.add(tag2);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 *  */
    @Test
    public void testIsValidParent_2() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        String tagName = "";
        setField(tag, "org.jsoup.parser.Tag", "tagName", tagName);
        Tag tag1 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        Tag tag2 = ((Tag) createInstance("org.jsoup.parser.Tag"));
        setField(tag2, "org.jsoup.parser.Tag", "tagName", tagName);
        ancestors.add(tag2);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag1, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 *  */
    @Test
    public void testIsValidParent() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        ArrayList ancestors = new ArrayList();
        ancestors.add(tag);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        ancestors.add(null);
        setField(tag, "org.jsoup.parser.Tag", "ancestors", ancestors);
        
        boolean actual = tag.isValidParent(tag);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isValidParent(org.jsoup.parser.Tag)
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: child.ancestors.isEmpty()
 *  */
    @Test
    public void testIsValidParent_ThrowNullPointerException() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Tag.isValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidParent(Tag.java:158) */
        tag.isValidParent(null);
    }
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#isValidParent(org.jsoup.parser.Tag)}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: child.ancestors.isEmpty()
 *  */
    @Test
    public void testIsValidParent_ThrowNullPointerException_1() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        /* This test fails because method [org.jsoup.parser.Tag.isValidParent] produces [java.lang.NullPointerException]
            org.jsoup.parser.Tag.isValidParent(Tag.java:158) */
        tag.isValidParent(tag);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.setContainDataOnly
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setContainDataOnly()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setContainDataOnly()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetContainDataOnly_Return() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Method setContainDataOnlyMethod = tagClazz.getDeclaredMethod("setContainDataOnly");
        setContainDataOnlyMethod.setAccessible(true);
        java.lang.Object[] setContainDataOnlyMethodArguments = new java.lang.Object[0];
        Tag actual = ((Tag) setContainDataOnlyMethod.invoke(tag, setContainDataOnlyMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
        
        boolean finalTagPreserveWhitespace = ((Boolean) getFieldValue(tag, "org.jsoup.parser.Tag", "preserveWhitespace"));
        
        assertTrue(finalTagPreserveWhitespace);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.canContainBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canContainBlock()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#canContainBlock()}
 * @utbot.returnsFrom {@code return canContainBlock;}
 *  */
    @Test
    public void testCanContainBlock_ReturnCanContainBlock() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        boolean actual = tag.canContainBlock();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.setContainInlineOnly
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setContainInlineOnly()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setContainInlineOnly()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetContainInlineOnly_Return() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Method setContainInlineOnlyMethod = tagClazz.getDeclaredMethod("setContainInlineOnly");
        setContainInlineOnlyMethod.setAccessible(true);
        java.lang.Object[] setContainInlineOnlyMethodArguments = new java.lang.Object[0];
        Tag actual = ((Tag) setContainInlineOnlyMethod.invoke(tag, setContainInlineOnlyMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
        
        boolean finalTagCanContainInline = ((Boolean) getFieldValue(tag, "org.jsoup.parser.Tag", "canContainInline"));
        
        assertTrue(finalTagCanContainInline);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.parser.Tag.setPreserveWhitespace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPreserveWhitespace()
    
    /**
    @utbot.classUnderTest {@link Tag}
 * @utbot.methodUnderTest {@link org.jsoup.parser.Tag#setPreserveWhitespace()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetPreserveWhitespace_Return() throws Exception  {
        Tag tag = ((Tag) createInstance("org.jsoup.parser.Tag"));
        
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Method setPreserveWhitespaceMethod = tagClazz.getDeclaredMethod("setPreserveWhitespace");
        setPreserveWhitespaceMethod.setAccessible(true);
        java.lang.Object[] setPreserveWhitespaceMethodArguments = new java.lang.Object[0];
        Tag actual = ((Tag) setPreserveWhitespaceMethod.invoke(tag, setPreserveWhitespaceMethodArguments));
        
        // org.jsoup.parser.Tag has overridden equals method
        assertEquals(tag, actual);
        
        boolean finalTagPreserveWhitespace = ((Boolean) getFieldValue(tag, "org.jsoup.parser.Tag", "preserveWhitespace"));
        
        assertTrue(finalTagPreserveWhitespace);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields992271451929900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields992271451929900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass992271451942500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992271451929900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992271451942500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields992271453150900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields992271453150900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass992271453153300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992271453150900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992271453153300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields992271453908700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields992271453908700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass992271453910500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992271453908700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992271453910500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields992271454543100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields992271454543100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass992271454546300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields992271454543100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass992271454546300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

