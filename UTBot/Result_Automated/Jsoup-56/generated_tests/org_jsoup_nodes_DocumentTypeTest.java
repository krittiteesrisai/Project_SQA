package org.jsoup.nodes;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.nio.charset.CoderMalfunctionError;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.ReadOnlyBufferException;
import sun.nio.cs.SingleByte.Encoder;
import sun.nio.cs.SingleByte;
import java.nio.BufferOverflowException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_nodes_DocumentTypeTest {
    ///region Test suites for executable org.jsoup.nodes.DocumentType.has
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method has(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#has(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return !StringUtil.isBlank(attr(attribute));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHas_ThrowIllegalArgumentException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class stringType = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", stringType);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = ((Object) null);
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#has(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return !StringUtil.isBlank(attr(attribute));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHas_ThrowIllegalArgumentException_1() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        documentType.attributes = attributes;
        String string = "";
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class stringType = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", stringType);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method has(java.lang.String)
    
    @Test
    public void testHas1() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        documentType.attributes = attributes;
        String string = "K[K";
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class stringType = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", stringType);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string;
        boolean actual = ((Boolean) hasMethod.invoke(documentType, hasMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testHas2() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        String string = "\u0000K";
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class stringType = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", stringType);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string;
        boolean actual = ((Boolean) hasMethod.invoke(documentType, hasMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testHas3() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class string1Type = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", string1Type);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string1;
        boolean actual = ((Boolean) hasMethod.invoke(documentType, hasMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testHas4() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "";
        attributes1.put(string1, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        String string2 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class string2Type = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", string2Type);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string2;
        boolean actual = ((Boolean) hasMethod.invoke(documentType, hasMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method has(java.lang.String)
    
    @Test
    public void testHas5() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, documentType);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.has] produces [java.lang.ClassCastException: class org.jsoup.nodes.DocumentType cannot be cast to class org.jsoup.nodes.Attribute (org.jsoup.nodes.DocumentType and org.jsoup.nodes.Attribute are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:65)
            org.jsoup.nodes.Node.attr(Node.java:78)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70) */
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class string1Type = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", string1Type);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string1;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHas6() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, attributes);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.has] produces [java.lang.ClassCastException: class org.jsoup.nodes.Attributes cannot be cast to class org.jsoup.nodes.Attribute (org.jsoup.nodes.Attributes and org.jsoup.nodes.Attribute are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @302b9f3c)]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:65)
            org.jsoup.nodes.Node.attr(Node.java:78)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70) */
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class string1Type = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", string1Type);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string1;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHas7() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.has] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:79)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70) */
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class stringType = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", stringType);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHas8() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(null, booleanAttribute);
        String string = "\u0000";
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.has] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:64)
            org.jsoup.nodes.Node.attr(Node.java:78)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70) */
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class stringType = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", stringType);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHas9() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        String string1 = "\u0000";
        attributes1.put(string1, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.has] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:79)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70) */
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class string1Type = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", string1Type);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string1;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHas10() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        attributes1.put(null, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        String string1 = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.has] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:64)
            org.jsoup.nodes.Node.attr(Node.java:78)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70) */
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class string1Type = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", string1Type);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string1;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHas11() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.has] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:65)
            org.jsoup.nodes.Node.attr(Node.java:78)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70) */
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class stringType = Class.forName("java.lang.String");
        Method hasMethod = documentTypeClazz.getDeclaredMethod("has", stringType);
        hasMethod.setAccessible(true);
        java.lang.Object[] hasMethodArguments = new java.lang.Object[1];
        hasMethodArguments[0] = string;
        try {
            hasMethod.invoke(documentType, hasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.DocumentType.nodeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nodeName()
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#nodeName()}
 * @utbot.returnsFrom {@code return "#doctype";}
 *  */
    @Test
    public void testNodeName_ReturnDoctype() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        String actual = documentType.nodeName();
        
        String expected = "#doctype";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.DocumentType.outerHtmlHead
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.syntax() == Syntax.html && !has(PUBLIC_ID) && !has(SYSTEM_ID)
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.DocumentType.outerHtmlHead(DocumentType.java:50) */
        documentType.outerHtmlHead(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (out.syntax() == Syntax.html): False}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#syntax()}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("<!DOCTYPE");
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_1() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.attr(Node.java:78)
            org.jsoup.nodes.DocumentType.has(DocumentType.java:70)
            org.jsoup.nodes.DocumentType.outerHtmlHead(DocumentType.java:50) */
        documentType.outerHtmlHead(null, -255, outputSettings);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testOuterHtmlHead_ThrowIOException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.MalformedInputException} 
 *  */
    @Test(expected = MalformedInputException.class)
    public void testOuterHtmlHead_ThrowMalformedInputException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 1;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.UnmappableCharacterException} 
 *  */
    @Test(expected = UnmappableCharacterException.class)
    public void testOuterHtmlHead_ThrowUnmappableCharacterException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "limit", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_1() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "doneBOM", true);
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOuterHtmlHead_ThrowIllegalStateException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_2() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", -2006974463);
        setField(bb, "java.nio.Buffer", "position", -81430528);
        setField(bb, "java.nio.Buffer", "limit", 2065725440);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class fileWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", fileWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = fileWriter;
        outerHtmlHeadMethodArguments[1] = 1;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_3() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 2147483644);
        setField(bb, "java.nio.Buffer", "limit", Integer.MIN_VALUE);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_4() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", -1609034622);
        setField(bb, "java.nio.Buffer", "position", -1612190850);
        setField(bb, "java.nio.Buffer", "limit", 354544432);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class fileWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", fileWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = fileWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException_1() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException_2() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        byte[] replacement = {(byte) 0};
        setField(encoder, "java.nio.charset.CharsetEncoder", "replacement", replacement);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_5() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC4'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.Buffer", "position", 2147483634);
        setField(bb, "java.nio.Buffer", "limit", 2147483644);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.BufferOverflowException} 
 *  */
    @Test(expected = BufferOverflowException.class)
    public void testOuterHtmlHead_ThrowBufferOverflowException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(out, "java.io.Writer", "lock", lock);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = 1;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_6() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC4'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 1;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_7() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        FileWriter fileWriter = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(fileWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class fileWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", fileWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = fileWriter;
        outerHtmlHeadMethodArguments[1] = 1;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_8() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException_3() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.xml;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = 16;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testOuterHtmlHead_ThrowIndexOutOfBoundsException() throws Throwable  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        byte[] replacement = {(byte) 0};
        setField(encoder, "java.nio.charset.CharsetEncoder", "replacement", replacement);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.ByteBuffer", "hb", replacement);
        setField(bb, "java.nio.ByteBuffer", "offset", Integer.MAX_VALUE);
        setField(bb, "java.nio.Buffer", "position", Integer.MIN_VALUE);
        setField(bb, "java.nio.Buffer", "limit", -2147483647);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class documentTypeClazz = Class.forName("org.jsoup.nodes.DocumentType");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = documentTypeClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(documentType, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testOuterHtmlHead1() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "K\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.DocumentType.outerHtmlHead(DocumentType.java:52) */
        documentType.outerHtmlHead(null, 0, outputSettings);
    }
    ///endregion
    
    ///region Errors report for outerHtmlHead
    
    public void testOuterHtmlHead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 60 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 41 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 23 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 12 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaLangAccess sun.nio.cs.SingleByte.JLA accessible:
        module java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.DocumentType.outerHtmlTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testOuterHtmlTail() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        documentType.outerHtmlTail(null, -255, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1002002783286000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1002002783286000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1002002783293200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1002002783286000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1002002783293200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

