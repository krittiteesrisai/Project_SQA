package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import java.lang.reflect.Method;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument;
import com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_jsoup_helper_W3CDomTest {
    ///region Test suites for executable org.jsoup.helper.W3CDom.convert
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convert(org.jsoup.nodes.Document, org.w3c.dom.Document)
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.invokes {@link org.jsoup.nodes.Document#location()}
 * @utbot.invokes {@link org.jsoup.helper.StringUtil#isBlank(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Document#child(int)}
 * @utbot.invokes {@link org.jsoup.select.NodeTraversor#traverse(org.jsoup.select.NodeVisitor,org.jsoup.nodes.Node)}
 *  */
    @Test
    public void testConvert_NodeTraversorTraverse() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        WeakReference shadowChildrenRef = ((WeakReference) createInstance("java.lang.ref.WeakReference"));
        ArrayList referent = new ArrayList();
        referent.add(null);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(document, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        w3CDom.convert(document, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convert(org.jsoup.nodes.Document, org.w3c.dom.Document)
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowClassCastException() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(document, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.ClassCastException: class [B cannot be cast to class java.util.List ([B and java.util.List are in module java.base of loader 'bootstrap')]
            org.jsoup.nodes.Element.childElementsList(Element.java:275)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowIndexOutOfBoundsException() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        ArrayList referent = new ArrayList();
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(document, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowClassCastException_2() throws Throwable  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\uD800";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        byte[] referent = {};
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(document, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        DocumentImpl documentImpl = ((DocumentImpl) createInstance("com.sun.org.apache.xerces.internal.dom.DocumentImpl"));
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.util.List] */
        Class w3CDomClazz = Class.forName("org.jsoup.helper.W3CDom");
        Class documentType = Class.forName("org.jsoup.nodes.Document");
        Class documentImplType = Class.forName("org.w3c.dom.Document");
        Method convertMethod = w3CDomClazz.getDeclaredMethod("convert", documentType, documentImplType);
        convertMethod.setAccessible(true);
        java.lang.Object[] convertMethodArguments = new java.lang.Object[2];
        convertMethodArguments[0] = document;
        convertMethodArguments[1] = documentImpl;
        try {
            convertMethod.invoke(w3CDom, convertMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowClassCastException_1() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        ArrayList referent = new ArrayList();
        Object object = createInstance("java.lang.Object");
        referent.add(object);
        setField(shadowChildrenRef, "java.lang.ref.Reference", "referent", referent);
        setField(document, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.jsoup.nodes.Element (java.lang.Object is in module java.base of loader 'bootstrap'; org.jsoup.nodes.Element is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @5f07604f)]
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !StringUtil.isBlank(in.location())
 *  */
    @Test
    public void testConvert_ThrowNullPointerException() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom.convert(W3CDom.java:59) */
        w3CDom.convert(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.setDocumentURI(in.location());
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_4() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\uD800";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.helper.W3CDom.convert(W3CDom.java:60) */
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
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:276)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
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
        String location = "";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:276)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_5() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\n";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:276)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_6() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\f";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:276)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_7() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\t";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:276)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_8() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = " ";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:276)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_9() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\r";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.childElementsList(Element.java:276)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62) */
        w3CDom.convert(document, null);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_10() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\u8000";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        DefaultDocument defaultDocument = ((DefaultDocument) createInstance("com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument"));
        setField(defaultDocument, "com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument", "fDocumentURI", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException] */
        w3CDom.convert(document, defaultDocument);
    }
    
    /**
    @utbot.classUnderTest {@link W3CDom}
 * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#convert(org.jsoup.nodes.Document,org.w3c.dom.Document)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: org.jsoup.nodes.Element rootEl = in.child(0);
 *  */
    @Test
    public void testConvert_ThrowNullPointerException_11() throws Exception  {
        W3CDom w3CDom = ((W3CDom) createInstance("org.jsoup.helper.W3CDom"));
        Document document = ((Document) createInstance("org.jsoup.nodes.Document"));
        String location = "\f\uD800\uDC10";
        setField(document, "org.jsoup.nodes.Document", "location", location);
        DTMNodeProxy dTMNodeProxy = ((DTMNodeProxy) createInstance("com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy"));
        setField(dTMNodeProxy, "com.sun.org.apache.xml.internal.dtm.ref.DTMNodeProxy", "fDocumentURI", location);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException] */
        w3CDom.convert(document, dTMNodeProxy);
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
        Object shadowChildrenRef = createInstance("java.lang.WeakPairMap$Pair$Weak");
        setField(document, "org.jsoup.nodes.Element", "shadowChildrenRef", shadowChildrenRef);
        ArrayList childNodes = new ArrayList();
        Document document1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        childNodes.add(document1);
        childNodes.add(null);
        setField(document, "org.jsoup.nodes.Element", "childNodes", childNodes);
        
        /* This test fails because method [org.jsoup.helper.W3CDom.convert] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Element.tagName(Element.java:131)
            org.jsoup.helper.W3CDom$W3CBuilder.updateNamespaces(W3CDom.java:154)
            org.jsoup.helper.W3CDom$W3CBuilder.head(W3CDom.java:87)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:45)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:63) */
        w3CDom.convert(document, null);
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
            org.jsoup.helper.W3CDom.fromJsoup(W3CDom.java:41) */
        w3CDom.fromJsoup(document);
    }
    ///endregion
    
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
    
    ///region FUZZER: ERROR SUITE for method fromJsoup(org.jsoup.nodes.Document)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.W3CDom}
     * @utbot.methodUnderTest {@link org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)}
     */
    @Test
    public void testFromJsoupThrowsIOOBE() {
        W3CDom w3CDom = new W3CDom();
        Document document = new Document("\u009F");
        
        /* This test fails because method [org.jsoup.helper.W3CDom.fromJsoup] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.helper.W3CDom.convert(W3CDom.java:62)
            org.jsoup.helper.W3CDom.fromJsoup(W3CDom.java:44) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1007867834426500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1007867834426500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1007867834432300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1007867834426500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1007867834432300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

