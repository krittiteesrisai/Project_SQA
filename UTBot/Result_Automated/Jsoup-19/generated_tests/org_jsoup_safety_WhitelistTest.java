package org.jsoup.safety;

import org.junit.Test;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import org.jsoup.safety.Whitelist.TagName;
import org.jsoup.safety.Whitelist.AttributeKey;
import org.jsoup.safety.Whitelist.AttributeValue;
import org.jsoup.safety.Whitelist.Protocol;
import java.util.LinkedHashMap;
import org.jsoup.nodes.Attributes;
import sun.net.www.http.KeepAliveCache;
import sun.security.provider.VerificationProvider;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import java.util.LinkedHashSet;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_jsoup_safety_WhitelistTest {
    ///region Test suites for executable org.jsoup.safety.Whitelist.none
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method none()
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#none()}
 * @utbot.returnsFrom {@code return new Whitelist();}
 *  */
    @Test
    public void testNone_Return() throws Exception  {
        Whitelist actual = Whitelist.none();
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.basic
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method basic()
    
    @Test
    public void testBasic1() throws Exception  {
        Whitelist actual = Whitelist.basic();
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "a";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        tagNames.add(tagName);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value1 = "b";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value1);
        tagNames.add(tagName1);
        Whitelist.TagName tagName2 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value2 = "small";
        setField(tagName2, "org.jsoup.safety.Whitelist$TypedValue", "value", value2);
        tagNames.add(tagName2);
        Whitelist.TagName tagName3 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value3 = "code";
        setField(tagName3, "org.jsoup.safety.Whitelist$TypedValue", "value", value3);
        tagNames.add(tagName3);
        Whitelist.TagName tagName4 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value4 = "blockquote";
        setField(tagName4, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        tagNames.add(tagName4);
        Whitelist.TagName tagName5 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value5 = "pre";
        setField(tagName5, "org.jsoup.safety.Whitelist$TypedValue", "value", value5);
        tagNames.add(tagName5);
        Whitelist.TagName tagName6 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value6 = "strong";
        setField(tagName6, "org.jsoup.safety.Whitelist$TypedValue", "value", value6);
        tagNames.add(tagName6);
        Whitelist.TagName tagName7 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value7 = "strike";
        setField(tagName7, "org.jsoup.safety.Whitelist$TypedValue", "value", value7);
        tagNames.add(tagName7);
        Whitelist.TagName tagName8 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value8 = "dl";
        setField(tagName8, "org.jsoup.safety.Whitelist$TypedValue", "value", value8);
        tagNames.add(tagName8);
        Whitelist.TagName tagName9 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value9 = "em";
        setField(tagName9, "org.jsoup.safety.Whitelist$TypedValue", "value", value9);
        tagNames.add(tagName9);
        Whitelist.TagName tagName10 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value10 = "i";
        setField(tagName10, "org.jsoup.safety.Whitelist$TypedValue", "value", value10);
        tagNames.add(tagName10);
        Whitelist.TagName tagName11 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value11 = "sup";
        setField(tagName11, "org.jsoup.safety.Whitelist$TypedValue", "value", value11);
        tagNames.add(tagName11);
        Whitelist.TagName tagName12 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value12 = "br";
        setField(tagName12, "org.jsoup.safety.Whitelist$TypedValue", "value", value12);
        tagNames.add(tagName12);
        Whitelist.TagName tagName13 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value13 = "dt";
        setField(tagName13, "org.jsoup.safety.Whitelist$TypedValue", "value", value13);
        tagNames.add(tagName13);
        Whitelist.TagName tagName14 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value14 = "p";
        setField(tagName14, "org.jsoup.safety.Whitelist$TypedValue", "value", value14);
        tagNames.add(tagName14);
        Whitelist.TagName tagName15 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value15 = "q";
        setField(tagName15, "org.jsoup.safety.Whitelist$TypedValue", "value", value15);
        tagNames.add(tagName15);
        Whitelist.TagName tagName16 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value16 = "u";
        setField(tagName16, "org.jsoup.safety.Whitelist$TypedValue", "value", value16);
        tagNames.add(tagName16);
        Whitelist.TagName tagName17 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value17 = "ul";
        setField(tagName17, "org.jsoup.safety.Whitelist$TypedValue", "value", value17);
        tagNames.add(tagName17);
        Whitelist.TagName tagName18 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value18 = "cite";
        setField(tagName18, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        tagNames.add(tagName18);
        Whitelist.TagName tagName19 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value19 = "li";
        setField(tagName19, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        tagNames.add(tagName19);
        Whitelist.TagName tagName20 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value20 = "ol";
        setField(tagName20, "org.jsoup.safety.Whitelist$TypedValue", "value", value20);
        tagNames.add(tagName20);
        Whitelist.TagName tagName21 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value21 = "sub";
        setField(tagName21, "org.jsoup.safety.Whitelist$TypedValue", "value", value21);
        tagNames.add(tagName21);
        Whitelist.TagName tagName22 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value22 = "dd";
        setField(tagName22, "org.jsoup.safety.Whitelist$TypedValue", "value", value22);
        tagNames.add(tagName22);
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        Whitelist.TagName tagName23 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName23, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashSet hashSet = new HashSet();
        Whitelist.AttributeKey attributeKey = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value23 = "href";
        setField(attributeKey, "org.jsoup.safety.Whitelist$TypedValue", "value", value23);
        hashSet.add(attributeKey);
        attributes.put(tagName23, hashSet);
        Whitelist.TagName tagName24 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName24, "org.jsoup.safety.Whitelist$TypedValue", "value", value15);
        HashSet hashSet1 = new HashSet();
        Whitelist.AttributeKey attributeKey1 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey1, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        hashSet1.add(attributeKey1);
        attributes.put(tagName24, hashSet1);
        Whitelist.TagName tagName25 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName25, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        HashSet hashSet2 = new HashSet();
        Whitelist.AttributeKey attributeKey2 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey2, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        hashSet2.add(attributeKey2);
        attributes.put(tagName25, hashSet2);
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        Whitelist.TagName tagName26 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName26, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashMap hashMap = new HashMap();
        Whitelist.AttributeKey attributeKey3 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value24 = "rel";
        setField(attributeKey3, "org.jsoup.safety.Whitelist$TypedValue", "value", value24);
        Whitelist.AttributeValue attributeValue = ((Whitelist.AttributeValue) createInstance("org.jsoup.safety.Whitelist$AttributeValue"));
        String value25 = "nofollow";
        setField(attributeValue, "org.jsoup.safety.Whitelist$TypedValue", "value", value25);
        hashMap.put(attributeKey3, attributeValue);
        enforcedAttributes.put(tagName26, hashMap);
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        Whitelist.TagName tagName27 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName27, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashMap hashMap1 = new HashMap();
        Whitelist.AttributeKey attributeKey4 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey4, "org.jsoup.safety.Whitelist$TypedValue", "value", value23);
        HashSet hashSet3 = new HashSet();
        Whitelist.Protocol protocol = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value26 = "ftp";
        setField(protocol, "org.jsoup.safety.Whitelist$TypedValue", "value", value26);
        hashSet3.add(protocol);
        Whitelist.Protocol protocol1 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value27 = "http";
        setField(protocol1, "org.jsoup.safety.Whitelist$TypedValue", "value", value27);
        hashSet3.add(protocol1);
        Whitelist.Protocol protocol2 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value28 = "mailto";
        setField(protocol2, "org.jsoup.safety.Whitelist$TypedValue", "value", value28);
        hashSet3.add(protocol2);
        Whitelist.Protocol protocol3 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value29 = "https";
        setField(protocol3, "org.jsoup.safety.Whitelist$TypedValue", "value", value29);
        hashSet3.add(protocol3);
        hashMap1.put(attributeKey4, hashSet3);
        protocols.put(tagName27, hashMap1);
        Whitelist.TagName tagName28 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName28, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        HashMap hashMap2 = new HashMap();
        Whitelist.AttributeKey attributeKey5 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey5, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        HashSet hashSet4 = new HashSet();
        Whitelist.Protocol protocol4 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol4, "org.jsoup.safety.Whitelist$TypedValue", "value", value27);
        hashSet4.add(protocol4);
        Whitelist.Protocol protocol5 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol5, "org.jsoup.safety.Whitelist$TypedValue", "value", value29);
        hashSet4.add(protocol5);
        hashMap2.put(attributeKey5, hashSet4);
        protocols.put(tagName28, hashMap2);
        Whitelist.TagName tagName29 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName29, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        HashMap hashMap3 = new HashMap();
        Whitelist.AttributeKey attributeKey6 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey6, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        HashSet hashSet5 = new HashSet();
        Whitelist.Protocol protocol6 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol6, "org.jsoup.safety.Whitelist$TypedValue", "value", value27);
        hashSet5.add(protocol6);
        Whitelist.Protocol protocol7 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol7, "org.jsoup.safety.Whitelist$TypedValue", "value", value29);
        hashSet5.add(protocol7);
        hashMap3.put(attributeKey6, hashSet5);
        protocols.put(tagName29, hashMap3);
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.addAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAttributes(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addAttributes(java.lang.String,java.lang.String[])}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddAttributes_MapPut() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap attributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        Object synchronizedNavigableSet = createInstance("java.util.Collections$SynchronizedNavigableSet");
        attributes.put(tagName, synchronizedNavigableSet);
        setField(whitelist, "org.jsoup.safety.Whitelist", "attributes", attributes);
        String string = " ";
        java.lang.String[] stringArray = {};
        
        Whitelist actual = whitelist.addAttributes(string, stringArray);
        
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertNull(actualTagNames);
        
        Map whitelistAttributes = ((Map) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(whitelistAttributes, actualAttributes));
        
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertNull(actualEnforcedAttributes);
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAttributes(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addAttributes(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_ThrowIllegalArgumentException() {
        Whitelist whitelist = new Whitelist();
        
        whitelist.addAttributes(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addAttributes(java.lang.String,java.lang.String[])}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(keys);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_ThrowIllegalArgumentException_1() {
        Whitelist whitelist = new Whitelist();
        String string = " ";
        
        whitelist.addAttributes(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addAttributes(java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes_ThrowIllegalArgumentException_2() {
        Whitelist whitelist = new Whitelist();
        String string = "";
        
        whitelist.addAttributes(string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAttributes(java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addAttributes(java.lang.String,java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String key: keys)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} when: attributes.containsKey(tagName)
 *  */
    @Test
    public void testAddAttributes_ThrowNullPointerException_1() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        String string = " ";
        java.lang.String[] stringArray = new java.lang.String[2];
        stringArray[0] = string;
        stringArray[1] = string;
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addAttributes] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.addAttributes(Whitelist.java:214) */
        whitelist.addAttributes(string, stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addAttributes(java.lang.String,java.lang.String[])}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this;
 *  */
    @Test
    public void testAddAttributes_ThrowNullPointerException() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap attributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = " ";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        Object synchronizedNavigableSet = createInstance("java.util.Collections$SynchronizedNavigableSet");
        attributes.put(tagName, synchronizedNavigableSet);
        setField(whitelist, "org.jsoup.safety.Whitelist", "attributes", attributes);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addAttributes] produces [java.lang.NullPointerException]
            java.base/java.util.Collections$SynchronizedCollection.addAll(Collections.java:2114)
            org.jsoup.safety.Whitelist.addAttributes(Whitelist.java:216) */
        whitelist.addAttributes(value, stringArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addAttributes(java.lang.String, [Ljava.lang.String;)
    
    @Test
    public void testAddAttributes1() throws Exception  {
        Whitelist whitelist = new Whitelist();
        String string = "\u0000";
        java.lang.String[] stringArray = new java.lang.String[11];
        stringArray[0] = string;
        String string1 = "\u0000";
        stringArray[1] = string1;
        String string2 = "\u0000";
        stringArray[2] = string2;
        stringArray[3] = string1;
        stringArray[4] = string1;
        stringArray[5] = string1;
        stringArray[6] = string1;
        stringArray[7] = string1;
        stringArray[8] = string1;
        stringArray[9] = string1;
        stringArray[10] = string1;
        
        Whitelist actual = whitelist.addAttributes(string, stringArray);
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", string);
        HashSet hashSet = new HashSet();
        Whitelist.AttributeKey attributeKey = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey, "org.jsoup.safety.Whitelist$TypedValue", "value", string);
        hashSet.add(attributeKey);
        attributes.put(tagName, hashSet);
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    
    @Test
    public void testAddAttributes2() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap attributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        Object classSet = createInstance("javax.security.auth.Subject$ClassSet");
        attributes.put(tagName, classSet);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        attributes.put(tagName1, classSet);
        setField(whitelist, "org.jsoup.safety.Whitelist", "attributes", attributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        java.lang.String[] stringArray = {};
        
        Whitelist actual = whitelist.addAttributes(string, stringArray);
        
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertNull(actualTagNames);
        
        Map whitelistAttributes = ((Map) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(whitelistAttributes, actualAttributes));
        
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertNull(actualEnforcedAttributes);
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAttributes(java.lang.String, [Ljava.lang.String;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddAttributes3() {
        Whitelist whitelist = new Whitelist();
        String string = "\u0000\u0000\u0000\u0000";
        java.lang.String[] stringArray = new java.lang.String[11];
        stringArray[0] = string;
        stringArray[1] = string;
        stringArray[2] = string;
        
        whitelist.addAttributes(string, stringArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addAttributes(java.lang.String, [Ljava.lang.String;)
    
    @Test
    public void testAddAttributes4() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap attributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        Object unmodifiableNavigableSet = createInstance("java.util.Collections$UnmodifiableNavigableSet");
        attributes.put(tagName, unmodifiableNavigableSet);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        Object unmodifiableNavigableSet1 = createInstance("java.util.Collections$UnmodifiableNavigableSet");
        attributes.put(tagName1, unmodifiableNavigableSet1);
        setField(whitelist, "org.jsoup.safety.Whitelist", "attributes", attributes);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addAttributes] produces [java.lang.UnsupportedOperationException]
            java.base/java.util.Collections$UnmodifiableCollection.addAll(Collections.java:1077)
            org.jsoup.safety.Whitelist.addAttributes(Whitelist.java:216) */
        whitelist.addAttributes(value, stringArray);
    }
    
    @Test
    public void testAddAttributes5() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap attributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        Object checkedNavigableSet = createInstance("java.util.Collections$CheckedNavigableSet");
        attributes.put(tagName, checkedNavigableSet);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "\u0000";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        attributes.put(tagName1, checkedNavigableSet);
        setField(whitelist, "org.jsoup.safety.Whitelist", "attributes", attributes);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addAttributes] produces [java.lang.NullPointerException]
            java.base/java.lang.reflect.Array.newArray(Native Method)
            java.base/java.lang.reflect.Array.newInstance(Array.java:78)
            java.base/java.util.Collections.zeroLengthArray(Collections.java:3117)
            java.base/java.util.Collections$CheckedCollection.zeroLengthElementArray(Collections.java:3190)
            java.base/java.util.Collections$CheckedCollection.checkedCopyOf(Collections.java:3197)
            java.base/java.util.Collections$CheckedCollection.addAll(Collections.java:3221)
            org.jsoup.safety.Whitelist.addAttributes(Whitelist.java:216) */
        whitelist.addAttributes(value, stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.preserveRelativeLinks
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preserveRelativeLinks(boolean)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#preserveRelativeLinks(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPreserveRelativeLinks_Return() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        
        Whitelist actual = whitelist.preserveRelativeLinks(false);
        
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertNull(actualTagNames);
        
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertNull(actualAttributes);
        
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertNull(actualEnforcedAttributes);
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.getEnforcedAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getEnforcedAttributes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#getEnforcedAttributes(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.returnsFrom {@code return attrs;}
 *  */
    @Test
    public void testGetEnforcedAttributes_MapContainsKey() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "";
        
        Attributes actual = whitelist.getEnforcedAttributes(string);
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getEnforcedAttributes(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.util.Map#containsKey(java.lang.Object)} twice
    /// return from: {@code return attrs;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#getEnforcedAttributes(java.lang.String)}
 * @utbot.returnsFrom {@code return attrs;}
 *  */
    @Test
    public void testGetEnforcedAttributes_ReturnAttrs_2() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        enforcedAttributes.put(null, null);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "";
        
        Attributes actual = whitelist.getEnforcedAttributes(string);
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#getEnforcedAttributes(java.lang.String)}
 * @utbot.returnsFrom {@code return attrs;}
 *  */
    @Test
    public void testGetEnforcedAttributes_ReturnAttrs() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashMap hashMap = new HashMap();
        enforcedAttributes.put(tagName, hashMap);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "";
        
        Attributes actual = whitelist.getEnforcedAttributes(string);
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#getEnforcedAttributes(java.lang.String)}
 * @utbot.returnsFrom {@code return attrs;}
 *  */
    @Test
    public void testGetEnforcedAttributes_ReturnAttrs_1() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        HashMap hashMap = new HashMap();
        enforcedAttributes.put(tagName, hashMap);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "";
        
        Attributes actual = whitelist.getEnforcedAttributes(string);
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEnforcedAttributes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#getEnforcedAttributes(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: enforcedAttributes.containsKey(tag)
 *  */
    @Test
    public void testGetEnforcedAttributes_ThrowNullPointerException() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        String string = "";
        
        /* This test fails because method [org.jsoup.safety.Whitelist.getEnforcedAttributes] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.getEnforcedAttributes(Whitelist.java:357) */
        whitelist.getEnforcedAttributes(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEnforcedAttributes(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#getEnforcedAttributes(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TagName tag = TagName.valueOf(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetEnforcedAttributes_ThrowIllegalArgumentException() {
        Whitelist whitelist = new Whitelist();
        
        whitelist.getEnforcedAttributes(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.addEnforcedAttribute
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addEnforcedAttribute(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_ThrowIllegalArgumentException() {
        Whitelist whitelist = new Whitelist();
        
        whitelist.addEnforcedAttribute(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addEnforcedAttribute(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_ThrowIllegalArgumentException_1() {
        Whitelist whitelist = new Whitelist();
        String string = "";
        
        whitelist.addEnforcedAttribute(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addEnforcedAttribute(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_ThrowIllegalArgumentException_2() {
        Whitelist whitelist = new Whitelist();
        String string = " ";
        
        whitelist.addEnforcedAttribute(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addEnforcedAttribute(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddEnforcedAttribute_ThrowIllegalArgumentException_3() {
        Whitelist whitelist = new Whitelist();
        String string = " ";
        
        whitelist.addEnforcedAttribute(string, string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addEnforcedAttribute(java.lang.String,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: enforcedAttributes.containsKey(tagName)
 *  */
    @Test
    public void testAddEnforcedAttribute_ThrowNullPointerException() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        String string = " ";
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addEnforcedAttribute] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.addEnforcedAttribute(Whitelist.java:244) */
        whitelist.addEnforcedAttribute(string, string, string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)
    
    @Test
    public void testAddEnforcedAttribute1() throws Exception  {
        Whitelist whitelist = new Whitelist();
        String string = "\u0000";
        String string1 = "\u0000";
        String string2 = "\u0000";
        
        Whitelist actual = whitelist.addEnforcedAttribute(string, string1, string2);
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", string);
        HashMap hashMap = new HashMap();
        Whitelist.AttributeKey attributeKey = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey, "org.jsoup.safety.Whitelist$TypedValue", "value", string1);
        Whitelist.AttributeValue attributeValue = ((Whitelist.AttributeValue) createInstance("org.jsoup.safety.Whitelist$AttributeValue"));
        setField(attributeValue, "org.jsoup.safety.Whitelist$TypedValue", "value", string2);
        hashMap.put(attributeKey, attributeValue);
        enforcedAttributes.put(tagName, hashMap);
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    
    @Test
    public void testAddEnforcedAttribute2() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        KeepAliveCache keepAliveCache = ((KeepAliveCache) createInstance("sun.net.www.http.KeepAliveCache"));
        enforcedAttributes.put(tagName, keepAliveCache);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "\u0000";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        enforcedAttributes.put(tagName1, keepAliveCache);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Whitelist actual = whitelist.addEnforcedAttribute(value, string, value);
        
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertNull(actualTagNames);
        
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertNull(actualAttributes);
        
        Map whitelistEnforcedAttributes = ((Map) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(whitelistEnforcedAttributes, actualEnforcedAttributes));
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    
    @Test
    public void testAddEnforcedAttribute3() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        KeepAliveCache keepAliveCache = ((KeepAliveCache) createInstance("sun.net.www.http.KeepAliveCache"));
        enforcedAttributes.put(null, keepAliveCache);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        String string1 = "\u0000";
        
        Whitelist actual = whitelist.addEnforcedAttribute(string, string1, string);
        
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertNull(actualTagNames);
        
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertNull(actualAttributes);
        
        Map whitelistEnforcedAttributes = ((Map) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(whitelistEnforcedAttributes, actualEnforcedAttributes));
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    
    @Test
    public void testAddEnforcedAttribute4() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        VerificationProvider verificationProvider = ((VerificationProvider) createInstance("sun.security.provider.VerificationProvider"));
        enforcedAttributes.put(tagName, verificationProvider);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "\u0000\u0000";
        String string1 = "\u0000";
        
        Whitelist actual = whitelist.addEnforcedAttribute(string, string1, string1);
        
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertNull(actualTagNames);
        
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertNull(actualAttributes);
        
        Map whitelistEnforcedAttributes = ((Map) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(whitelistEnforcedAttributes, actualEnforcedAttributes));
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addEnforcedAttribute(java.lang.String, java.lang.String, java.lang.String)
    
    @Test
    public void testAddEnforcedAttribute5() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        Object dataset = createInstance("org.jsoup.nodes.Attributes$Dataset");
        enforcedAttributes.put(tagName, dataset);
        enforcedAttributes.put(null, dataset);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addEnforcedAttribute] produces [java.lang.ClassCastException: class org.jsoup.safety.Whitelist$AttributeKey cannot be cast to class java.lang.String (org.jsoup.safety.Whitelist$AttributeKey is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b; java.lang.String is in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Attributes$Dataset.put(Attributes.java:191)
            org.jsoup.safety.Whitelist.addEnforcedAttribute(Whitelist.java:245) */
        whitelist.addEnforcedAttribute(value, string, string);
    }
    
    @Test
    public void testAddEnforcedAttribute6() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap enforcedAttributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        VerificationProvider verificationProvider = ((VerificationProvider) createInstance("sun.security.provider.VerificationProvider"));
        enforcedAttributes.put(tagName, verificationProvider);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "\u0000";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        enforcedAttributes.put(tagName1, null);
        setField(whitelist, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addEnforcedAttribute] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.addEnforcedAttribute(Whitelist.java:245) */
        whitelist.addEnforcedAttribute(value, value, value);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.testValidProtocol
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method testValidProtocol(org.jsoup.nodes.Element, org.jsoup.nodes.Attribute, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#testValidProtocol(org.jsoup.nodes.Element,org.jsoup.nodes.Attribute,java.util.Set)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#getKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = el.absUrl(attr.getKey());
 *  */
    @Test
    public void testTestValidProtocol_ThrowNullPointerException() throws Throwable  {
        Whitelist whitelist = new Whitelist();
        
        /* This test fails because method [org.jsoup.safety.Whitelist.testValidProtocol] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.testValidProtocol(Whitelist.java:341) */
        Class whitelistClazz = Class.forName("org.jsoup.safety.Whitelist");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class attributeType = Class.forName("org.jsoup.nodes.Attribute");
        Class setType = Class.forName("java.util.Set");
        Method testValidProtocolMethod = whitelistClazz.getDeclaredMethod("testValidProtocol", elementType, attributeType, setType);
        testValidProtocolMethod.setAccessible(true);
        java.lang.Object[] testValidProtocolMethodArguments = new java.lang.Object[3];
        testValidProtocolMethodArguments[0] = ((Object) null);
        testValidProtocolMethodArguments[1] = ((Object) null);
        testValidProtocolMethodArguments[2] = ((Object) null);
        try {
            testValidProtocolMethod.invoke(whitelist, testValidProtocolMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#testValidProtocol(org.jsoup.nodes.Element,org.jsoup.nodes.Attribute,java.util.Set)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#getKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String value = el.absUrl(attr.getKey());
 *  */
    @Test
    public void testTestValidProtocol_ThrowNullPointerException_1() throws Throwable  {
        Whitelist whitelist = new Whitelist();
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        /* This test fails because method [org.jsoup.safety.Whitelist.testValidProtocol] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.testValidProtocol(Whitelist.java:341) */
        Class whitelistClazz = Class.forName("org.jsoup.safety.Whitelist");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class attributeType = Class.forName("org.jsoup.nodes.Attribute");
        Class setType = Class.forName("java.util.Set");
        Method testValidProtocolMethod = whitelistClazz.getDeclaredMethod("testValidProtocol", elementType, attributeType, setType);
        testValidProtocolMethod.setAccessible(true);
        java.lang.Object[] testValidProtocolMethodArguments = new java.lang.Object[3];
        testValidProtocolMethodArguments[0] = ((Object) null);
        testValidProtocolMethodArguments[1] = attribute;
        testValidProtocolMethodArguments[2] = ((Object) null);
        try {
            testValidProtocolMethod.invoke(whitelist, testValidProtocolMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method testValidProtocol(org.jsoup.nodes.Element, org.jsoup.nodes.Attribute, java.util.Set)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#testValidProtocol(org.jsoup.nodes.Element,org.jsoup.nodes.Attribute,java.util.Set)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: String value = el.absUrl(attr.getKey());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTestValidProtocol_ThrowIllegalArgumentException() throws Throwable  {
        Whitelist whitelist = new Whitelist();
        Element element = ((Element) createInstance("org.jsoup.nodes.Element"));
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        Class whitelistClazz = Class.forName("org.jsoup.safety.Whitelist");
        Class elementType = Class.forName("org.jsoup.nodes.Element");
        Class attributeType = Class.forName("org.jsoup.nodes.Attribute");
        Class setType = Class.forName("java.util.Set");
        Method testValidProtocolMethod = whitelistClazz.getDeclaredMethod("testValidProtocol", elementType, attributeType, setType);
        testValidProtocolMethod.setAccessible(true);
        java.lang.Object[] testValidProtocolMethodArguments = new java.lang.Object[3];
        testValidProtocolMethodArguments[0] = element;
        testValidProtocolMethodArguments[1] = attribute;
        testValidProtocolMethodArguments[2] = ((Object) null);
        try {
            testValidProtocolMethod.invoke(whitelist, testValidProtocolMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#testValidProtocol(org.jsoup.nodes.Element,org.jsoup.nodes.Attribute,java.util.Set)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: String value = el.absUrl(attr.getKey());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTestValidProtocol_ThrowIllegalArgumentException_1() throws Throwable  {
        Whitelist whitelist = new Whitelist();
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        
        Class whitelistClazz = Class.forName("org.jsoup.safety.Whitelist");
        Class documentType = Class.forName("org.jsoup.nodes.Element");
        Class attributeType = Class.forName("org.jsoup.nodes.Attribute");
        Class setType = Class.forName("java.util.Set");
        Method testValidProtocolMethod = whitelistClazz.getDeclaredMethod("testValidProtocol", documentType, attributeType, setType);
        testValidProtocolMethod.setAccessible(true);
        java.lang.Object[] testValidProtocolMethodArguments = new java.lang.Object[3];
        testValidProtocolMethodArguments[0] = document;
        testValidProtocolMethodArguments[1] = attribute;
        testValidProtocolMethodArguments[2] = ((Object) null);
        try {
            testValidProtocolMethod.invoke(whitelist, testValidProtocolMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.addProtocols
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addProtocols(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addProtocols(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_ThrowIllegalArgumentException() {
        Whitelist whitelist = new Whitelist();
        String string = "";
        
        whitelist.addProtocols(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addProtocols(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tag);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_ThrowIllegalArgumentException_1() {
        Whitelist whitelist = new Whitelist();
        
        whitelist.addProtocols(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addProtocols(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_ThrowIllegalArgumentException_2() {
        Whitelist whitelist = new Whitelist();
        String string = " ";
        
        whitelist.addProtocols(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addProtocols(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(protocols);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddProtocols_ThrowIllegalArgumentException_3() {
        Whitelist whitelist = new Whitelist();
        String string = " ";
        
        whitelist.addProtocols(string, string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addProtocols(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addProtocols(java.lang.String,java.lang.String,java.lang.String[])}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.protocols.containsKey(tagName)
 *  */
    @Test
    public void testAddProtocols_ThrowNullPointerException() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        String string = " ";
        java.lang.String[] stringArray = {null};
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addProtocols] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.addProtocols(Whitelist.java:294) */
        whitelist.addProtocols(string, string, stringArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method addProtocols(java.lang.String, java.lang.String, [Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.safety.Whitelist}
     * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addProtocols(java.lang.String,java.lang.String,java.lang.String[])}
     */
    @Test
    public void testAddProtocolsWithNonEmptyStringsAndNonEmptyObjectArray() throws Exception  {
        Whitelist whitelist = new Whitelist();
        java.lang.String[] stringArray = {"XZ", "10"};
        
        Whitelist actual = whitelist.addProtocols("XZ", "10", stringArray);
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "XZ";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashMap hashMap = new HashMap();
        Whitelist.AttributeKey attributeKey = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value1 = "10";
        setField(attributeKey, "org.jsoup.safety.Whitelist$TypedValue", "value", value1);
        HashSet hashSet = new HashSet();
        Whitelist.Protocol protocol = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        hashSet.add(protocol);
        Whitelist.Protocol protocol1 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol1, "org.jsoup.safety.Whitelist$TypedValue", "value", value1);
        hashSet.add(protocol1);
        hashMap.put(attributeKey, hashSet);
        protocols.put(tagName, hashMap);
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.simpleText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method simpleText()
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#simpleText()}
 * @utbot.invokes {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.returnsFrom {@code return new Whitelist().addTags("b", "em", "i", "strong", "u");}
 *  */
    @Test
    public void testSimpleText_WhitelistAddTags() throws Exception  {
        Whitelist actual = Whitelist.simpleText();
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "b";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        tagNames.add(tagName);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value1 = "strong";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value1);
        tagNames.add(tagName1);
        Whitelist.TagName tagName2 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value2 = "u";
        setField(tagName2, "org.jsoup.safety.Whitelist$TypedValue", "value", value2);
        tagNames.add(tagName2);
        Whitelist.TagName tagName3 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value3 = "em";
        setField(tagName3, "org.jsoup.safety.Whitelist$TypedValue", "value", value3);
        tagNames.add(tagName3);
        Whitelist.TagName tagName4 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value4 = "i";
        setField(tagName4, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        tagNames.add(tagName4);
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.relaxed
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method relaxed()
    
    @Test
    public void testRelaxed1() throws Exception  {
        Whitelist actual = Whitelist.relaxed();
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "a";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        tagNames.add(tagName);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value1 = "b";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value1);
        tagNames.add(tagName1);
        Whitelist.TagName tagName2 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value2 = "blockquote";
        setField(tagName2, "org.jsoup.safety.Whitelist$TypedValue", "value", value2);
        tagNames.add(tagName2);
        Whitelist.TagName tagName3 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value3 = "pre";
        setField(tagName3, "org.jsoup.safety.Whitelist$TypedValue", "value", value3);
        tagNames.add(tagName3);
        Whitelist.TagName tagName4 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value4 = "strike";
        setField(tagName4, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        tagNames.add(tagName4);
        Whitelist.TagName tagName5 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value5 = "em";
        setField(tagName5, "org.jsoup.safety.Whitelist$TypedValue", "value", value5);
        tagNames.add(tagName5);
        Whitelist.TagName tagName6 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value6 = "i";
        setField(tagName6, "org.jsoup.safety.Whitelist$TypedValue", "value", value6);
        tagNames.add(tagName6);
        Whitelist.TagName tagName7 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value7 = "colgroup";
        setField(tagName7, "org.jsoup.safety.Whitelist$TypedValue", "value", value7);
        tagNames.add(tagName7);
        Whitelist.TagName tagName8 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value8 = "p";
        setField(tagName8, "org.jsoup.safety.Whitelist$TypedValue", "value", value8);
        tagNames.add(tagName8);
        Whitelist.TagName tagName9 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value9 = "td";
        setField(tagName9, "org.jsoup.safety.Whitelist$TypedValue", "value", value9);
        tagNames.add(tagName9);
        Whitelist.TagName tagName10 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value10 = "q";
        setField(tagName10, "org.jsoup.safety.Whitelist$TypedValue", "value", value10);
        tagNames.add(tagName10);
        Whitelist.TagName tagName11 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value11 = "tfoot";
        setField(tagName11, "org.jsoup.safety.Whitelist$TypedValue", "value", value11);
        tagNames.add(tagName11);
        Whitelist.TagName tagName12 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value12 = "th";
        setField(tagName12, "org.jsoup.safety.Whitelist$TypedValue", "value", value12);
        tagNames.add(tagName12);
        Whitelist.TagName tagName13 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value13 = "u";
        setField(tagName13, "org.jsoup.safety.Whitelist$TypedValue", "value", value13);
        tagNames.add(tagName13);
        Whitelist.TagName tagName14 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value14 = "cite";
        setField(tagName14, "org.jsoup.safety.Whitelist$TypedValue", "value", value14);
        tagNames.add(tagName14);
        Whitelist.TagName tagName15 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value15 = "li";
        setField(tagName15, "org.jsoup.safety.Whitelist$TypedValue", "value", value15);
        tagNames.add(tagName15);
        Whitelist.TagName tagName16 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value16 = "tr";
        setField(tagName16, "org.jsoup.safety.Whitelist$TypedValue", "value", value16);
        tagNames.add(tagName16);
        Whitelist.TagName tagName17 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value17 = "col";
        setField(tagName17, "org.jsoup.safety.Whitelist$TypedValue", "value", value17);
        tagNames.add(tagName17);
        Whitelist.TagName tagName18 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value18 = "sub";
        setField(tagName18, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        tagNames.add(tagName18);
        Whitelist.TagName tagName19 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value19 = "dd";
        setField(tagName19, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        tagNames.add(tagName19);
        Whitelist.TagName tagName20 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value20 = "thead";
        setField(tagName20, "org.jsoup.safety.Whitelist$TypedValue", "value", value20);
        tagNames.add(tagName20);
        Whitelist.TagName tagName21 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value21 = "small";
        setField(tagName21, "org.jsoup.safety.Whitelist$TypedValue", "value", value21);
        tagNames.add(tagName21);
        Whitelist.TagName tagName22 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value22 = "code";
        setField(tagName22, "org.jsoup.safety.Whitelist$TypedValue", "value", value22);
        tagNames.add(tagName22);
        Whitelist.TagName tagName23 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value23 = "img";
        setField(tagName23, "org.jsoup.safety.Whitelist$TypedValue", "value", value23);
        tagNames.add(tagName23);
        Whitelist.TagName tagName24 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value24 = "strong";
        setField(tagName24, "org.jsoup.safety.Whitelist$TypedValue", "value", value24);
        tagNames.add(tagName24);
        Whitelist.TagName tagName25 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value25 = "tbody";
        setField(tagName25, "org.jsoup.safety.Whitelist$TypedValue", "value", value25);
        tagNames.add(tagName25);
        Whitelist.TagName tagName26 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value26 = "dl";
        setField(tagName26, "org.jsoup.safety.Whitelist$TypedValue", "value", value26);
        tagNames.add(tagName26);
        Whitelist.TagName tagName27 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value27 = "h1";
        setField(tagName27, "org.jsoup.safety.Whitelist$TypedValue", "value", value27);
        tagNames.add(tagName27);
        Whitelist.TagName tagName28 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value28 = "h2";
        setField(tagName28, "org.jsoup.safety.Whitelist$TypedValue", "value", value28);
        tagNames.add(tagName28);
        Whitelist.TagName tagName29 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value29 = "caption";
        setField(tagName29, "org.jsoup.safety.Whitelist$TypedValue", "value", value29);
        tagNames.add(tagName29);
        Whitelist.TagName tagName30 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value30 = "h3";
        setField(tagName30, "org.jsoup.safety.Whitelist$TypedValue", "value", value30);
        tagNames.add(tagName30);
        Whitelist.TagName tagName31 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value31 = "h4";
        setField(tagName31, "org.jsoup.safety.Whitelist$TypedValue", "value", value31);
        tagNames.add(tagName31);
        Whitelist.TagName tagName32 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value32 = "h5";
        setField(tagName32, "org.jsoup.safety.Whitelist$TypedValue", "value", value32);
        tagNames.add(tagName32);
        Whitelist.TagName tagName33 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value33 = "sup";
        setField(tagName33, "org.jsoup.safety.Whitelist$TypedValue", "value", value33);
        tagNames.add(tagName33);
        Whitelist.TagName tagName34 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value34 = "h6";
        setField(tagName34, "org.jsoup.safety.Whitelist$TypedValue", "value", value34);
        tagNames.add(tagName34);
        Whitelist.TagName tagName35 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value35 = "br";
        setField(tagName35, "org.jsoup.safety.Whitelist$TypedValue", "value", value35);
        tagNames.add(tagName35);
        Whitelist.TagName tagName36 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value36 = "dt";
        setField(tagName36, "org.jsoup.safety.Whitelist$TypedValue", "value", value36);
        tagNames.add(tagName36);
        Whitelist.TagName tagName37 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value37 = "div";
        setField(tagName37, "org.jsoup.safety.Whitelist$TypedValue", "value", value37);
        tagNames.add(tagName37);
        Whitelist.TagName tagName38 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value38 = "ul";
        setField(tagName38, "org.jsoup.safety.Whitelist$TypedValue", "value", value38);
        tagNames.add(tagName38);
        Whitelist.TagName tagName39 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value39 = "ol";
        setField(tagName39, "org.jsoup.safety.Whitelist$TypedValue", "value", value39);
        tagNames.add(tagName39);
        Whitelist.TagName tagName40 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value40 = "table";
        setField(tagName40, "org.jsoup.safety.Whitelist$TypedValue", "value", value40);
        tagNames.add(tagName40);
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        Whitelist.TagName tagName41 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName41, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashSet hashSet = new HashSet();
        Whitelist.AttributeKey attributeKey = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value41 = "title";
        setField(attributeKey, "org.jsoup.safety.Whitelist$TypedValue", "value", value41);
        hashSet.add(attributeKey);
        Whitelist.AttributeKey attributeKey1 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value42 = "href";
        setField(attributeKey1, "org.jsoup.safety.Whitelist$TypedValue", "value", value42);
        hashSet.add(attributeKey1);
        attributes.put(tagName41, hashSet);
        Whitelist.TagName tagName42 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName42, "org.jsoup.safety.Whitelist$TypedValue", "value", value10);
        HashSet hashSet1 = new HashSet();
        Whitelist.AttributeKey attributeKey2 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey2, "org.jsoup.safety.Whitelist$TypedValue", "value", value14);
        hashSet1.add(attributeKey2);
        attributes.put(tagName42, hashSet1);
        Whitelist.TagName tagName43 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName43, "org.jsoup.safety.Whitelist$TypedValue", "value", value2);
        HashSet hashSet2 = new HashSet();
        Whitelist.AttributeKey attributeKey3 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey3, "org.jsoup.safety.Whitelist$TypedValue", "value", value14);
        hashSet2.add(attributeKey3);
        attributes.put(tagName43, hashSet2);
        Whitelist.TagName tagName44 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName44, "org.jsoup.safety.Whitelist$TypedValue", "value", value23);
        HashSet hashSet3 = new HashSet();
        Whitelist.AttributeKey attributeKey4 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value43 = "src";
        setField(attributeKey4, "org.jsoup.safety.Whitelist$TypedValue", "value", value43);
        hashSet3.add(attributeKey4);
        Whitelist.AttributeKey attributeKey5 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey5, "org.jsoup.safety.Whitelist$TypedValue", "value", value41);
        hashSet3.add(attributeKey5);
        Whitelist.AttributeKey attributeKey6 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value44 = "alt";
        setField(attributeKey6, "org.jsoup.safety.Whitelist$TypedValue", "value", value44);
        hashSet3.add(attributeKey6);
        Whitelist.AttributeKey attributeKey7 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value45 = "width";
        setField(attributeKey7, "org.jsoup.safety.Whitelist$TypedValue", "value", value45);
        hashSet3.add(attributeKey7);
        Whitelist.AttributeKey attributeKey8 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value46 = "align";
        setField(attributeKey8, "org.jsoup.safety.Whitelist$TypedValue", "value", value46);
        hashSet3.add(attributeKey8);
        Whitelist.AttributeKey attributeKey9 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value47 = "height";
        setField(attributeKey9, "org.jsoup.safety.Whitelist$TypedValue", "value", value47);
        hashSet3.add(attributeKey9);
        attributes.put(tagName44, hashSet3);
        Whitelist.TagName tagName45 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName45, "org.jsoup.safety.Whitelist$TypedValue", "value", value12);
        HashSet hashSet4 = new HashSet();
        Whitelist.AttributeKey attributeKey10 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value48 = "rowspan";
        setField(attributeKey10, "org.jsoup.safety.Whitelist$TypedValue", "value", value48);
        hashSet4.add(attributeKey10);
        Whitelist.AttributeKey attributeKey11 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value49 = "scope";
        setField(attributeKey11, "org.jsoup.safety.Whitelist$TypedValue", "value", value49);
        hashSet4.add(attributeKey11);
        Whitelist.AttributeKey attributeKey12 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value50 = "colspan";
        setField(attributeKey12, "org.jsoup.safety.Whitelist$TypedValue", "value", value50);
        hashSet4.add(attributeKey12);
        Whitelist.AttributeKey attributeKey13 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey13, "org.jsoup.safety.Whitelist$TypedValue", "value", value45);
        hashSet4.add(attributeKey13);
        Whitelist.AttributeKey attributeKey14 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value51 = "abbr";
        setField(attributeKey14, "org.jsoup.safety.Whitelist$TypedValue", "value", value51);
        hashSet4.add(attributeKey14);
        Whitelist.AttributeKey attributeKey15 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value52 = "axis";
        setField(attributeKey15, "org.jsoup.safety.Whitelist$TypedValue", "value", value52);
        hashSet4.add(attributeKey15);
        attributes.put(tagName45, hashSet4);
        Whitelist.TagName tagName46 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName46, "org.jsoup.safety.Whitelist$TypedValue", "value", value38);
        HashSet hashSet5 = new HashSet();
        Whitelist.AttributeKey attributeKey16 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value53 = "type";
        setField(attributeKey16, "org.jsoup.safety.Whitelist$TypedValue", "value", value53);
        hashSet5.add(attributeKey16);
        attributes.put(tagName46, hashSet5);
        Whitelist.TagName tagName47 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName47, "org.jsoup.safety.Whitelist$TypedValue", "value", value7);
        HashSet hashSet6 = new HashSet();
        Whitelist.AttributeKey attributeKey17 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey17, "org.jsoup.safety.Whitelist$TypedValue", "value", value45);
        hashSet6.add(attributeKey17);
        Whitelist.AttributeKey attributeKey18 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value54 = "span";
        setField(attributeKey18, "org.jsoup.safety.Whitelist$TypedValue", "value", value54);
        hashSet6.add(attributeKey18);
        attributes.put(tagName47, hashSet6);
        Whitelist.TagName tagName48 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName48, "org.jsoup.safety.Whitelist$TypedValue", "value", value39);
        HashSet hashSet7 = new HashSet();
        Whitelist.AttributeKey attributeKey19 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value55 = "start";
        setField(attributeKey19, "org.jsoup.safety.Whitelist$TypedValue", "value", value55);
        hashSet7.add(attributeKey19);
        Whitelist.AttributeKey attributeKey20 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey20, "org.jsoup.safety.Whitelist$TypedValue", "value", value53);
        hashSet7.add(attributeKey20);
        attributes.put(tagName48, hashSet7);
        Whitelist.TagName tagName49 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName49, "org.jsoup.safety.Whitelist$TypedValue", "value", value40);
        HashSet hashSet8 = new HashSet();
        Whitelist.AttributeKey attributeKey21 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value56 = "summary";
        setField(attributeKey21, "org.jsoup.safety.Whitelist$TypedValue", "value", value56);
        hashSet8.add(attributeKey21);
        Whitelist.AttributeKey attributeKey22 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey22, "org.jsoup.safety.Whitelist$TypedValue", "value", value45);
        hashSet8.add(attributeKey22);
        attributes.put(tagName49, hashSet8);
        Whitelist.TagName tagName50 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName50, "org.jsoup.safety.Whitelist$TypedValue", "value", value17);
        HashSet hashSet9 = new HashSet();
        Whitelist.AttributeKey attributeKey23 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey23, "org.jsoup.safety.Whitelist$TypedValue", "value", value45);
        hashSet9.add(attributeKey23);
        Whitelist.AttributeKey attributeKey24 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey24, "org.jsoup.safety.Whitelist$TypedValue", "value", value54);
        hashSet9.add(attributeKey24);
        attributes.put(tagName50, hashSet9);
        Whitelist.TagName tagName51 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName51, "org.jsoup.safety.Whitelist$TypedValue", "value", value9);
        HashSet hashSet10 = new HashSet();
        Whitelist.AttributeKey attributeKey25 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey25, "org.jsoup.safety.Whitelist$TypedValue", "value", value48);
        hashSet10.add(attributeKey25);
        Whitelist.AttributeKey attributeKey26 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey26, "org.jsoup.safety.Whitelist$TypedValue", "value", value50);
        hashSet10.add(attributeKey26);
        Whitelist.AttributeKey attributeKey27 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey27, "org.jsoup.safety.Whitelist$TypedValue", "value", value45);
        hashSet10.add(attributeKey27);
        Whitelist.AttributeKey attributeKey28 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey28, "org.jsoup.safety.Whitelist$TypedValue", "value", value51);
        hashSet10.add(attributeKey28);
        Whitelist.AttributeKey attributeKey29 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey29, "org.jsoup.safety.Whitelist$TypedValue", "value", value52);
        hashSet10.add(attributeKey29);
        attributes.put(tagName51, hashSet10);
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        Whitelist.TagName tagName52 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName52, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashMap hashMap = new HashMap();
        Whitelist.AttributeKey attributeKey30 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey30, "org.jsoup.safety.Whitelist$TypedValue", "value", value42);
        HashSet hashSet11 = new HashSet();
        Whitelist.Protocol protocol = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value57 = "ftp";
        setField(protocol, "org.jsoup.safety.Whitelist$TypedValue", "value", value57);
        hashSet11.add(protocol);
        Whitelist.Protocol protocol1 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value58 = "http";
        setField(protocol1, "org.jsoup.safety.Whitelist$TypedValue", "value", value58);
        hashSet11.add(protocol1);
        Whitelist.Protocol protocol2 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value59 = "mailto";
        setField(protocol2, "org.jsoup.safety.Whitelist$TypedValue", "value", value59);
        hashSet11.add(protocol2);
        Whitelist.Protocol protocol3 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value60 = "https";
        setField(protocol3, "org.jsoup.safety.Whitelist$TypedValue", "value", value60);
        hashSet11.add(protocol3);
        hashMap.put(attributeKey30, hashSet11);
        protocols.put(tagName52, hashMap);
        Whitelist.TagName tagName53 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName53, "org.jsoup.safety.Whitelist$TypedValue", "value", value10);
        HashMap hashMap1 = new HashMap();
        Whitelist.AttributeKey attributeKey31 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey31, "org.jsoup.safety.Whitelist$TypedValue", "value", value14);
        HashSet hashSet12 = new HashSet();
        Whitelist.Protocol protocol4 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol4, "org.jsoup.safety.Whitelist$TypedValue", "value", value58);
        hashSet12.add(protocol4);
        Whitelist.Protocol protocol5 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol5, "org.jsoup.safety.Whitelist$TypedValue", "value", value60);
        hashSet12.add(protocol5);
        hashMap1.put(attributeKey31, hashSet12);
        protocols.put(tagName53, hashMap1);
        Whitelist.TagName tagName54 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName54, "org.jsoup.safety.Whitelist$TypedValue", "value", value2);
        HashMap hashMap2 = new HashMap();
        Whitelist.AttributeKey attributeKey32 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey32, "org.jsoup.safety.Whitelist$TypedValue", "value", value14);
        HashSet hashSet13 = new HashSet();
        Whitelist.Protocol protocol6 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol6, "org.jsoup.safety.Whitelist$TypedValue", "value", value58);
        hashSet13.add(protocol6);
        Whitelist.Protocol protocol7 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol7, "org.jsoup.safety.Whitelist$TypedValue", "value", value60);
        hashSet13.add(protocol7);
        hashMap2.put(attributeKey32, hashSet13);
        protocols.put(tagName54, hashMap2);
        Whitelist.TagName tagName55 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName55, "org.jsoup.safety.Whitelist$TypedValue", "value", value23);
        HashMap hashMap3 = new HashMap();
        Whitelist.AttributeKey attributeKey33 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey33, "org.jsoup.safety.Whitelist$TypedValue", "value", value43);
        HashSet hashSet14 = new HashSet();
        Whitelist.Protocol protocol8 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol8, "org.jsoup.safety.Whitelist$TypedValue", "value", value58);
        hashSet14.add(protocol8);
        Whitelist.Protocol protocol9 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol9, "org.jsoup.safety.Whitelist$TypedValue", "value", value60);
        hashSet14.add(protocol9);
        hashMap3.put(attributeKey33, hashSet14);
        protocols.put(tagName55, hashMap3);
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.basicWithImages
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method basicWithImages()
    
    @Test
    public void testBasicWithImages1() throws Exception  {
        Whitelist actual = Whitelist.basicWithImages();
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "a";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        tagNames.add(tagName);
        Whitelist.TagName tagName1 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value1 = "b";
        setField(tagName1, "org.jsoup.safety.Whitelist$TypedValue", "value", value1);
        tagNames.add(tagName1);
        Whitelist.TagName tagName2 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value2 = "small";
        setField(tagName2, "org.jsoup.safety.Whitelist$TypedValue", "value", value2);
        tagNames.add(tagName2);
        Whitelist.TagName tagName3 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value3 = "code";
        setField(tagName3, "org.jsoup.safety.Whitelist$TypedValue", "value", value3);
        tagNames.add(tagName3);
        Whitelist.TagName tagName4 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value4 = "blockquote";
        setField(tagName4, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        tagNames.add(tagName4);
        Whitelist.TagName tagName5 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value5 = "pre";
        setField(tagName5, "org.jsoup.safety.Whitelist$TypedValue", "value", value5);
        tagNames.add(tagName5);
        Whitelist.TagName tagName6 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value6 = "strong";
        setField(tagName6, "org.jsoup.safety.Whitelist$TypedValue", "value", value6);
        tagNames.add(tagName6);
        Whitelist.TagName tagName7 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value7 = "img";
        setField(tagName7, "org.jsoup.safety.Whitelist$TypedValue", "value", value7);
        tagNames.add(tagName7);
        Whitelist.TagName tagName8 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value8 = "strike";
        setField(tagName8, "org.jsoup.safety.Whitelist$TypedValue", "value", value8);
        tagNames.add(tagName8);
        Whitelist.TagName tagName9 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value9 = "dl";
        setField(tagName9, "org.jsoup.safety.Whitelist$TypedValue", "value", value9);
        tagNames.add(tagName9);
        Whitelist.TagName tagName10 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value10 = "em";
        setField(tagName10, "org.jsoup.safety.Whitelist$TypedValue", "value", value10);
        tagNames.add(tagName10);
        Whitelist.TagName tagName11 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value11 = "i";
        setField(tagName11, "org.jsoup.safety.Whitelist$TypedValue", "value", value11);
        tagNames.add(tagName11);
        Whitelist.TagName tagName12 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value12 = "sup";
        setField(tagName12, "org.jsoup.safety.Whitelist$TypedValue", "value", value12);
        tagNames.add(tagName12);
        Whitelist.TagName tagName13 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value13 = "br";
        setField(tagName13, "org.jsoup.safety.Whitelist$TypedValue", "value", value13);
        tagNames.add(tagName13);
        Whitelist.TagName tagName14 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value14 = "dt";
        setField(tagName14, "org.jsoup.safety.Whitelist$TypedValue", "value", value14);
        tagNames.add(tagName14);
        Whitelist.TagName tagName15 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value15 = "p";
        setField(tagName15, "org.jsoup.safety.Whitelist$TypedValue", "value", value15);
        tagNames.add(tagName15);
        Whitelist.TagName tagName16 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value16 = "q";
        setField(tagName16, "org.jsoup.safety.Whitelist$TypedValue", "value", value16);
        tagNames.add(tagName16);
        Whitelist.TagName tagName17 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value17 = "u";
        setField(tagName17, "org.jsoup.safety.Whitelist$TypedValue", "value", value17);
        tagNames.add(tagName17);
        Whitelist.TagName tagName18 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value18 = "ul";
        setField(tagName18, "org.jsoup.safety.Whitelist$TypedValue", "value", value18);
        tagNames.add(tagName18);
        Whitelist.TagName tagName19 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value19 = "cite";
        setField(tagName19, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        tagNames.add(tagName19);
        Whitelist.TagName tagName20 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value20 = "li";
        setField(tagName20, "org.jsoup.safety.Whitelist$TypedValue", "value", value20);
        tagNames.add(tagName20);
        Whitelist.TagName tagName21 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value21 = "ol";
        setField(tagName21, "org.jsoup.safety.Whitelist$TypedValue", "value", value21);
        tagNames.add(tagName21);
        Whitelist.TagName tagName22 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value22 = "sub";
        setField(tagName22, "org.jsoup.safety.Whitelist$TypedValue", "value", value22);
        tagNames.add(tagName22);
        Whitelist.TagName tagName23 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value23 = "dd";
        setField(tagName23, "org.jsoup.safety.Whitelist$TypedValue", "value", value23);
        tagNames.add(tagName23);
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        Whitelist.TagName tagName24 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName24, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashSet hashSet = new HashSet();
        Whitelist.AttributeKey attributeKey = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value24 = "href";
        setField(attributeKey, "org.jsoup.safety.Whitelist$TypedValue", "value", value24);
        hashSet.add(attributeKey);
        attributes.put(tagName24, hashSet);
        Whitelist.TagName tagName25 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName25, "org.jsoup.safety.Whitelist$TypedValue", "value", value16);
        HashSet hashSet1 = new HashSet();
        Whitelist.AttributeKey attributeKey1 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey1, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        hashSet1.add(attributeKey1);
        attributes.put(tagName25, hashSet1);
        Whitelist.TagName tagName26 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName26, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        HashSet hashSet2 = new HashSet();
        Whitelist.AttributeKey attributeKey2 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey2, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        hashSet2.add(attributeKey2);
        attributes.put(tagName26, hashSet2);
        Whitelist.TagName tagName27 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName27, "org.jsoup.safety.Whitelist$TypedValue", "value", value7);
        HashSet hashSet3 = new HashSet();
        Whitelist.AttributeKey attributeKey3 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value25 = "src";
        setField(attributeKey3, "org.jsoup.safety.Whitelist$TypedValue", "value", value25);
        hashSet3.add(attributeKey3);
        Whitelist.AttributeKey attributeKey4 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value26 = "title";
        setField(attributeKey4, "org.jsoup.safety.Whitelist$TypedValue", "value", value26);
        hashSet3.add(attributeKey4);
        Whitelist.AttributeKey attributeKey5 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value27 = "alt";
        setField(attributeKey5, "org.jsoup.safety.Whitelist$TypedValue", "value", value27);
        hashSet3.add(attributeKey5);
        Whitelist.AttributeKey attributeKey6 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value28 = "width";
        setField(attributeKey6, "org.jsoup.safety.Whitelist$TypedValue", "value", value28);
        hashSet3.add(attributeKey6);
        Whitelist.AttributeKey attributeKey7 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value29 = "align";
        setField(attributeKey7, "org.jsoup.safety.Whitelist$TypedValue", "value", value29);
        hashSet3.add(attributeKey7);
        Whitelist.AttributeKey attributeKey8 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value30 = "height";
        setField(attributeKey8, "org.jsoup.safety.Whitelist$TypedValue", "value", value30);
        hashSet3.add(attributeKey8);
        attributes.put(tagName27, hashSet3);
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        Whitelist.TagName tagName28 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName28, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashMap hashMap = new HashMap();
        Whitelist.AttributeKey attributeKey9 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        String value31 = "rel";
        setField(attributeKey9, "org.jsoup.safety.Whitelist$TypedValue", "value", value31);
        Whitelist.AttributeValue attributeValue = ((Whitelist.AttributeValue) createInstance("org.jsoup.safety.Whitelist$AttributeValue"));
        String value32 = "nofollow";
        setField(attributeValue, "org.jsoup.safety.Whitelist$TypedValue", "value", value32);
        hashMap.put(attributeKey9, attributeValue);
        enforcedAttributes.put(tagName28, hashMap);
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        Whitelist.TagName tagName29 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName29, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        HashMap hashMap1 = new HashMap();
        Whitelist.AttributeKey attributeKey10 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey10, "org.jsoup.safety.Whitelist$TypedValue", "value", value24);
        HashSet hashSet4 = new HashSet();
        Whitelist.Protocol protocol = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value33 = "ftp";
        setField(protocol, "org.jsoup.safety.Whitelist$TypedValue", "value", value33);
        hashSet4.add(protocol);
        Whitelist.Protocol protocol1 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value34 = "http";
        setField(protocol1, "org.jsoup.safety.Whitelist$TypedValue", "value", value34);
        hashSet4.add(protocol1);
        Whitelist.Protocol protocol2 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value35 = "mailto";
        setField(protocol2, "org.jsoup.safety.Whitelist$TypedValue", "value", value35);
        hashSet4.add(protocol2);
        Whitelist.Protocol protocol3 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        String value36 = "https";
        setField(protocol3, "org.jsoup.safety.Whitelist$TypedValue", "value", value36);
        hashSet4.add(protocol3);
        hashMap1.put(attributeKey10, hashSet4);
        protocols.put(tagName29, hashMap1);
        Whitelist.TagName tagName30 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName30, "org.jsoup.safety.Whitelist$TypedValue", "value", value4);
        HashMap hashMap2 = new HashMap();
        Whitelist.AttributeKey attributeKey11 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey11, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        HashSet hashSet5 = new HashSet();
        Whitelist.Protocol protocol4 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol4, "org.jsoup.safety.Whitelist$TypedValue", "value", value34);
        hashSet5.add(protocol4);
        Whitelist.Protocol protocol5 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol5, "org.jsoup.safety.Whitelist$TypedValue", "value", value36);
        hashSet5.add(protocol5);
        hashMap2.put(attributeKey11, hashSet5);
        protocols.put(tagName30, hashMap2);
        Whitelist.TagName tagName31 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName31, "org.jsoup.safety.Whitelist$TypedValue", "value", value7);
        HashMap hashMap3 = new HashMap();
        Whitelist.AttributeKey attributeKey12 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey12, "org.jsoup.safety.Whitelist$TypedValue", "value", value25);
        HashSet hashSet6 = new HashSet();
        Whitelist.Protocol protocol6 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol6, "org.jsoup.safety.Whitelist$TypedValue", "value", value34);
        hashSet6.add(protocol6);
        Whitelist.Protocol protocol7 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol7, "org.jsoup.safety.Whitelist$TypedValue", "value", value36);
        hashSet6.add(protocol7);
        hashMap3.put(attributeKey12, hashSet6);
        protocols.put(tagName31, hashMap3);
        Whitelist.TagName tagName32 = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        setField(tagName32, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        HashMap hashMap4 = new HashMap();
        Whitelist.AttributeKey attributeKey13 = ((Whitelist.AttributeKey) createInstance("org.jsoup.safety.Whitelist$AttributeKey"));
        setField(attributeKey13, "org.jsoup.safety.Whitelist$TypedValue", "value", value19);
        HashSet hashSet7 = new HashSet();
        Whitelist.Protocol protocol8 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol8, "org.jsoup.safety.Whitelist$TypedValue", "value", value34);
        hashSet7.add(protocol8);
        Whitelist.Protocol protocol9 = ((Whitelist.Protocol) createInstance("org.jsoup.safety.Whitelist$Protocol"));
        setField(protocol9, "org.jsoup.safety.Whitelist$TypedValue", "value", value36);
        hashSet7.add(protocol9);
        hashMap4.put(attributeKey13, hashSet7);
        protocols.put(tagName32, hashMap4);
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.isSafeAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSafeAttribute(java.lang.String, org.jsoup.nodes.Element, org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeAttribute(java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute)}
 * @utbot.returnsFrom {@code return !tagName.equals(":all") && isSafeAttribute(":all", el, attr);}
 *  */
    @Test
    public void testIsSafeAttribute_ReturnNotTagNameEqualsAndIsSafeAttribute() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap attributes = new LinkedHashMap();
        setField(whitelist, "org.jsoup.safety.Whitelist", "attributes", attributes);
        String string = ":all";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attribute.setKey(key);
        
        boolean actual = whitelist.isSafeAttribute(string, null, attribute);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeAttribute(java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute)}
 * @utbot.returnsFrom {@code return !tagName.equals(":all") && isSafeAttribute(":all", el, attr);}
 *  */
    @Test
    public void testIsSafeAttribute_ReturnNotTagNameEqualsAndIsSafeAttribute_1() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashMap attributes = new LinkedHashMap();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        Object keySet = createInstance("java.util.IdentityHashMap$KeySet");
        attributes.put(tagName, keySet);
        setField(whitelist, "org.jsoup.safety.Whitelist", "attributes", attributes);
        String string = ":all";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attribute.setKey(key);
        
        boolean actual = whitelist.isSafeAttribute(string, null, attribute);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSafeAttribute(java.lang.String, org.jsoup.nodes.Element, org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeAttribute(java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AttributeKey key = AttributeKey.valueOf(attr.getKey());
 *  */
    @Test
    public void testIsSafeAttribute_ThrowNullPointerException() {
        Whitelist whitelist = new Whitelist();
        String string = "";
        
        /* This test fails because method [org.jsoup.safety.Whitelist.isSafeAttribute] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.isSafeAttribute(Whitelist.java:320) */
        whitelist.isSafeAttribute(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeAttribute(java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#getKey()}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: attributes.containsKey(tag)
 *  */
    @Test
    public void testIsSafeAttribute_ThrowNullPointerException_1() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        
        /* This test fails because method [org.jsoup.safety.Whitelist.isSafeAttribute] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.isSafeAttribute(Whitelist.java:322) */
        whitelist.isSafeAttribute(string, null, attribute);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSafeAttribute(java.lang.String, org.jsoup.nodes.Element, org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeAttribute(java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: TagName tag = TagName.valueOf(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSafeAttribute_ThrowIllegalArgumentException() {
        Whitelist whitelist = new Whitelist();
        
        whitelist.isSafeAttribute(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeAttribute(java.lang.String,org.jsoup.nodes.Element,org.jsoup.nodes.Attribute)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#getKey()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: AttributeKey key = AttributeKey.valueOf(attr.getKey());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSafeAttribute_ThrowIllegalArgumentException_1() throws Exception  {
        Whitelist whitelist = new Whitelist();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        whitelist.isSafeAttribute(string, null, attribute);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.isSafeTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSafeTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeTag(java.lang.String)}
 * @utbot.returnsFrom {@code return tagNames.contains(TagName.valueOf(tag));}
 *  */
    @Test
    public void testIsSafeTag_ReturnTagNamesContains() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        String string = "";
        
        boolean actual = whitelist.isSafeTag(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeTag(java.lang.String)}
 * @utbot.returnsFrom {@code return tagNames.contains(TagName.valueOf(tag));}
 *  */
    @Test
    public void testIsSafeTag_ReturnTagNamesContains_1() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        tagNames.add(tagName);
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        String string = "";
        
        boolean actual = whitelist.isSafeTag(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeTag(java.lang.String)}
 * @utbot.returnsFrom {@code return tagNames.contains(TagName.valueOf(tag));}
 *  */
    @Test
    public void testIsSafeTag_ReturnTagNamesContains_2() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        tagNames.add(tagName);
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        String string = "";
        
        boolean actual = whitelist.isSafeTag(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSafeTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeTag(java.lang.String)}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tagNames.contains(TagName.valueOf(tag));
 *  */
    @Test
    public void testIsSafeTag_ThrowNullPointerException() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        String string = "";
        
        /* This test fails because method [org.jsoup.safety.Whitelist.isSafeTag] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.isSafeTag(Whitelist.java:315) */
        whitelist.isSafeTag(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isSafeTag(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#isSafeTag(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsSafeTag_ThrowIllegalArgumentException() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        
        whitelist.isSafeTag(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.safety.Whitelist.addTags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addTags([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddTags_Return() throws Exception  {
        Whitelist whitelist = new Whitelist();
        java.lang.String[] stringArray = {};
        
        Whitelist actual = whitelist.addTags(stringArray);
        
        Whitelist expected = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        HashSet tagNames = new HashSet();
        setField(expected, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        HashMap attributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "attributes", attributes);
        HashMap enforcedAttributes = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes", enforcedAttributes);
        HashMap protocols = new HashMap();
        setField(expected, "org.jsoup.safety.Whitelist", "protocols", protocols);
        
        Set expectedTagNames = ((Set) getFieldValue(expected, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(expectedTagNames, actualTagNames));
        
        Map expectedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "attributes"));
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertTrue(deepEquals(expectedAttributes, actualAttributes));
        
        Map expectedEnforcedAttributes = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertTrue(deepEquals(expectedEnforcedAttributes, actualEnforcedAttributes));
        
        Map expectedProtocols = ((Map) getFieldValue(expected, "org.jsoup.safety.Whitelist", "protocols"));
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertTrue(deepEquals(expectedProtocols, actualProtocols));
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String tagName: tags)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddTags_IterateForEachLoop() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "\u0000";
        stringArray[0] = string;
        
        Whitelist actual = whitelist.addTags(stringArray);
        
        Set whitelistTagNames = ((Set) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(whitelistTagNames, actualTagNames));
        
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertNull(actualAttributes);
        
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertNull(actualEnforcedAttributes);
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String tagName: tags)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddTags_IterateForEachLoop_1() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        String value = "\u0000";
        setField(tagName, "org.jsoup.safety.Whitelist$TypedValue", "value", value);
        tagNames.add(tagName);
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = value;
        
        Whitelist actual = whitelist.addTags(stringArray);
        
        Set whitelistTagNames = ((Set) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(whitelistTagNames, actualTagNames));
        
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertNull(actualAttributes);
        
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertNull(actualEnforcedAttributes);
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String tagName: tags)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddTags_IterateForEachLoop_2() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        LinkedHashSet tagNames = new LinkedHashSet();
        Whitelist.TagName tagName = ((Whitelist.TagName) createInstance("org.jsoup.safety.Whitelist$TagName"));
        tagNames.add(tagName);
        setField(whitelist, "org.jsoup.safety.Whitelist", "tagNames", tagNames);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "\u0000";
        stringArray[0] = string;
        
        Whitelist actual = whitelist.addTags(stringArray);
        
        Set whitelistTagNames = ((Set) getFieldValue(whitelist, "org.jsoup.safety.Whitelist", "tagNames"));
        Set actualTagNames = ((Set) getFieldValue(actual, "org.jsoup.safety.Whitelist", "tagNames"));
        assertTrue(deepEquals(whitelistTagNames, actualTagNames));
        
        Map actualAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "attributes"));
        assertNull(actualAttributes);
        
        Map actualEnforcedAttributes = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "enforcedAttributes"));
        assertNull(actualEnforcedAttributes);
        
        Map actualProtocols = ((Map) getFieldValue(actual, "org.jsoup.safety.Whitelist", "protocols"));
        assertNull(actualProtocols);
        
        boolean actualPreserveRelativeLinks = ((Boolean) getFieldValue(actual, "org.jsoup.safety.Whitelist", "preserveRelativeLinks"));
        assertFalse(actualPreserveRelativeLinks);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addTags([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String tagName: tags)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddTags_ThrowIllegalArgumentException_1() {
        Whitelist whitelist = new Whitelist();
        java.lang.String[] stringArray = {null};
        
        whitelist.addTags(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(String tagName: tags)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(tagName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddTags_ThrowIllegalArgumentException_2() {
        Whitelist whitelist = new Whitelist();
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        whitelist.addTags(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(tags);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddTags_ThrowIllegalArgumentException() {
        Whitelist whitelist = new Whitelist();
        
        whitelist.addTags(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addTags([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link Whitelist}
 * @utbot.methodUnderTest {@link org.jsoup.safety.Whitelist#addTags(java.lang.String[])}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(String tagName: tags)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tagNames.add(TagName.valueOf(tagName));
 *  */
    @Test
    public void testAddTags_ThrowNullPointerException() throws Exception  {
        Whitelist whitelist = ((Whitelist) createInstance("org.jsoup.safety.Whitelist"));
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "\u0000";
        stringArray[0] = string;
        
        /* This test fails because method [org.jsoup.safety.Whitelist.addTags] produces [java.lang.NullPointerException]
            org.jsoup.safety.Whitelist.addTags(Whitelist.java:189) */
        whitelist.addTags(stringArray);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields995081382370100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields995081382370100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass995081382378800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995081382370100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995081382378800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields995081382939600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields995081382939600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass995081382943700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields995081382939600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass995081382943700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

