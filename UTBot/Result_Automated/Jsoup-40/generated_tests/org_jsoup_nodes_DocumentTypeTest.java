package org.jsoup.nodes;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_jsoup_nodes_DocumentTypeTest {
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlHead(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append("<!DOCTYPE");
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        
        /* This test fails because method [org.jsoup.nodes.DocumentType.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.DocumentType.outerHtmlHead(DocumentType.java:35) */
        documentType.outerHtmlHead(null, -255, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testOuterHtmlHead1() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        documentType.outerHtmlHead(stringBuilder, 0, null);
    }
    
    @Test
    public void testOuterHtmlHead2() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        documentType.attributes = attributes;
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000");
        
        documentType.outerHtmlHead(stringBuilder, 0, null);
    }
    
    @Test
    public void testOuterHtmlHead3() throws Exception  {
        DocumentType documentType = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "name";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        documentType.attributes = attributes;
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000");
        
        documentType.outerHtmlHead(stringBuilder, 0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.DocumentType.outerHtmlTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link DocumentType}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.DocumentType#outerHtmlTail(java.lang.StringBuilder,int,org.jsoup.nodes.Document.OutputSettings)}
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
        
                java.lang.reflect.Method methodForGetDeclaredFields998761191162500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields998761191162500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass998761191167600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields998761191162500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass998761191167600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

