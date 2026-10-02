package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import org.jsoup.nodes.TextNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_jsoup_helper_W3CDomTest {
    ///region Test suites for executable org.jsoup.helper.W3CDom.convert
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convert(org.jsoup.nodes.Document, org.w3c.dom.Document)
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !StringUtil.isBlank(in.location())
 *  */
    @Test
    public void testConvert_ThrowNullPointerException() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom.convert(W3CDom.java:61) */
        w3CDom.convert(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_2() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom$W3CBuilder.updateNamespaces(W3CDom.java:137)
            org.jsoup.helper.W3CDom$W3CBuilder.head(W3CDom.java:88)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:66) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_3() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom$W3CBuilder.updateNamespaces(W3CDom.java:137)
            org.jsoup.helper.W3CDom$W3CBuilder.head(W3CDom.java:88)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:66) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_1() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\r";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(null);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom$W3CBuilder.updateNamespaces(W3CDom.java:137)
            org.jsoup.helper.W3CDom$W3CBuilder.head(W3CDom.java:88)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:66) */
        w3CDom.convert(document, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method convert(org.jsoup.nodes.Document, org.w3c.dom.Document)
    
    @Test
    public void testConvert1() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\t\n";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        ArrayList childNodes = new ArrayList();
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:200)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:64) */
        w3CDom.convert(document, null);
    }
    
    @Test
    public void testConvert2() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        ArrayList childNodes = new ArrayList();
        TextNode textNode = ((TextNode) createInstance("org.jsoup.nodes.TextNode"));
        childNodes.add(textNode);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Node", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:200)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:64) */
        w3CDom.convert(document, null);
    }
    
    @Test
    public void testConvert3() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\n\t\u0000";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    @Test
    public void testConvert4() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = " \f ";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.children(Element.java:214)
            org.jsoup.nodes.Element.child(Element.java:200)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:64) */
        w3CDom.convert(document, null);
    }
    ///endregion
    
    ///region Errors report for convert
    
    public void testConvert_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.W3CDom.asString
    
    ///region Errors report for asString
    
    public void testAsString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.W3CDom.fromJsoup
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method fromJsoup(org.jsoup.nodes.Document)
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(in);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoup_ThrowIllegalArgumentException() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        
        w3CDom.fromJsoup(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fromJsoup(org.jsoup.nodes.Document)
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link javax.xml.parsers.DocumentBuilderFactory#setNamespaceAware(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: factory.setNamespaceAware(true);
 *  */
    @Test
    public void testFromJsoup_ThrowNullPointerException() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        
        /* This test fails because method [org.jsoup.helper.W3CDom.fromJsoup] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom.fromJsoup(W3CDom.java:43) */
        w3CDom.fromJsoup(document);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1001671090977900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1001671090977900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1001671090985700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001671090977900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001671090985700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

