package org.jsoup.nodes;

import org.junit.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import org.jsoup.nodes.Document.OutputSettings;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.MalformedInputException;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.charset.CodingErrorAction;
import sun.nio.cs.SingleByte.Encoder;
import sun.nio.cs.SingleByte;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class org_jsoup_nodes_XmlDeclarationTest {
    ///region Test suites for executable org.jsoup.nodes.XmlDeclaration.name
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method name()
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#name()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testName_ReturnName() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        String actual = xmlDeclaration.name();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.XmlDeclaration.toString
    
    ///region FUZZER: ERROR SUITE for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.XmlDeclaration}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#toString()}
     */
    @Test(expected = ExceptionInInitializerError.class)
    public void testToStringThrowsEIIE() {
        XmlDeclaration xmlDeclaration = new XmlDeclaration("10", "10", false);
        
        xmlDeclaration.toString();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString1() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        DataNode parentNode = ((DataNode) createInstance("org.jsoup.nodes.DataNode"));
        DocumentType parentNode1 = ((DocumentType) createInstance("org.jsoup.nodes.DocumentType"));
        parentNode1.setParentNode(parentNode);
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        
        xmlDeclaration.toString();
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToString2() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            
            xmlDeclaration.toString();
        } finally {
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    
    @Test(expected = NoClassDefFoundError.class)
    public void testToString3() throws Exception  {
        Class tagClazz = Class.forName("org.jsoup.parser.Tag");
        Map prevTags = ((Map) getStaticFieldValue(tagClazz, "tags"));
        try {
            LinkedHashMap tags = new LinkedHashMap();
            setStaticField(tagClazz, "tags", tags);
            XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
            xmlDeclaration.setParentNode(parentNode);
            
            xmlDeclaration.toString();
        } finally {
            setStaticField(org.jsoup.parser.Tag.class, "tags", prevTags);
        }
    }
    
    @Test
    public void testToString4() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        setField(xmlDeclaration, "org.jsoup.nodes.XmlDeclaration", "isProcessingInstruction", true);
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(parentNode1, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.XmlDeclaration.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.getWholeDeclaration(XmlDeclaration.java:47)
            org.jsoup.nodes.XmlDeclaration.outerHtmlHead(XmlDeclaration.java:68)
            org.jsoup.nodes.Node$OuterHtmlVisitor.head(Node.java:678)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:31)
            org.jsoup.nodes.Node.outerHtml(Node.java:551)
            org.jsoup.nodes.Node.outerHtml(Node.java:546)
            org.jsoup.nodes.XmlDeclaration.toString(XmlDeclaration.java:76) */
        xmlDeclaration.toString();
    }
    
    @Test
    public void testToString5() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        String name = "";
        setField(xmlDeclaration, "org.jsoup.nodes.XmlDeclaration", "name", name);
        XmlDeclaration parentNode = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        Document parentNode1 = ((Document) createInstance("org.jsoup.nodes.Document"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(parentNode1, "org.jsoup.nodes.Document", "outputSettings", outputSettings);
        parentNode.setParentNode(parentNode1);
        xmlDeclaration.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.XmlDeclaration.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:225)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.nodes.Node.outerHtml(Node.java:551)
            org.jsoup.nodes.Node.outerHtml(Node.java:546)
            org.jsoup.nodes.XmlDeclaration.toString(XmlDeclaration.java:76) */
        xmlDeclaration.toString();
    }
    
    @Test
    public void testToString6() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        String name = "";
        setField(xmlDeclaration, "org.jsoup.nodes.XmlDeclaration", "name", name);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        xmlDeclaration.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.XmlDeclaration.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:225)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.nodes.Node.outerHtml(Node.java:551)
            org.jsoup.nodes.Node.outerHtml(Node.java:546)
            org.jsoup.nodes.XmlDeclaration.toString(XmlDeclaration.java:76) */
        xmlDeclaration.toString();
    }
    
    @Test
    public void testToString7() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        String name = "";
        setField(xmlDeclaration, "org.jsoup.nodes.XmlDeclaration", "name", name);
        setField(xmlDeclaration, "org.jsoup.nodes.XmlDeclaration", "isProcessingInstruction", true);
        Document parentNode = ((Document) createInstance("org.jsoup.nodes.Document"));
        xmlDeclaration.setParentNode(parentNode);
        
        /* This test fails because method [org.jsoup.nodes.XmlDeclaration.toString] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Node.childNodeSize(Node.java:225)
            org.jsoup.select.NodeTraversor.traverse(NodeTraversor.java:32)
            org.jsoup.nodes.Node.outerHtml(Node.java:551)
            org.jsoup.nodes.Node.outerHtml(Node.java:546)
            org.jsoup.nodes.XmlDeclaration.toString(XmlDeclaration.java:76) */
        xmlDeclaration.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.XmlDeclaration.nodeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nodeName()
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#nodeName()}
 * @utbot.returnsFrom {@code return "#declaration";}
 *  */
    @Test
    public void testNodeName_ReturnDeclaration() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        String actual = xmlDeclaration.nodeName();
        
        String expected = "#declaration";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.XmlDeclaration.getWholeDeclaration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWholeDeclaration()
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#getWholeDeclaration()}
 * @utbot.executesCondition {@code (decl.equals("xml")): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this.name;}
 *  */
    @Test
    public void testGetWholeDeclaration_NotDeclEquals() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        String name = "";
        setField(xmlDeclaration, "org.jsoup.nodes.XmlDeclaration", "name", name);
        
        String actual = xmlDeclaration.getWholeDeclaration();
        
        assertEquals(name, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWholeDeclaration()
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#getWholeDeclaration()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: decl.equals("xml") && attributes.size() > 1
 *  */
    @Test
    public void testGetWholeDeclaration_ThrowNullPointerException() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        /* This test fails because method [org.jsoup.nodes.XmlDeclaration.getWholeDeclaration] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.getWholeDeclaration(XmlDeclaration.java:47) */
        xmlDeclaration.getWholeDeclaration();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getWholeDeclaration()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.XmlDeclaration}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#getWholeDeclaration()}
     */
    @Test
    public void testGetWholeDeclaration() {
        XmlDeclaration xmlDeclaration = new XmlDeclaration("xml", "xml", false);
        
        String actual = xmlDeclaration.getWholeDeclaration();
        
        String expected = "xml";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getWholeDeclaration()
    
    @Test
    public void testGetWholeDeclaration1() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        String name = "xml";
        setField(xmlDeclaration, "org.jsoup.nodes.XmlDeclaration", "name", name);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        xmlDeclaration.attributes = attributes;
        
        String actual = xmlDeclaration.getWholeDeclaration();
        
        assertEquals(name, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.XmlDeclaration.outerHtmlHead
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        /* This test fails because method [org.jsoup.nodes.XmlDeclaration.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.XmlDeclaration.outerHtmlHead(XmlDeclaration.java:66) */
        xmlDeclaration.outerHtmlHead(null, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testOuterHtmlHead_ThrowIOException() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.MalformedInputException} 
 *  */
    @Test(expected = MalformedInputException.class)
    public void testOuterHtmlHead_ThrowMalformedInputException() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 8;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException_1() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 2;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 2;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException_2() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        byte[] replacement = {(byte) 0};
        setField(encoder, "java.nio.charset.CharsetEncoder", "replacement", replacement);
        CodingErrorAction unmappableCharacterAction = ((CodingErrorAction) createInstance("java.nio.charset.CodingErrorAction"));
        setField(encoder, "java.nio.charset.CharsetEncoder", "unmappableCharacterAction", unmappableCharacterAction);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 2;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOuterHtmlHead_ThrowIllegalStateException() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_1() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "doneBOM", true);
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 2147483646);
        setField(bb, "java.nio.Buffer", "limit", -2147483646);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 2;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_2() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock1 = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock1);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock2 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock2);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_3() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(out, "java.io.Writer", "lock", lock);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = 1;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_4() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 2147483645);
        setField(bb, "java.nio.Buffer", "limit", -2147483647);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock1 = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock2 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock2);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_5() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", 969932801);
        setField(bb, "java.nio.Buffer", "position", -2039611394);
        setField(bb, "java.nio.Buffer", "limit", 101548032);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock1);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = -240;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_6() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", 554172416);
        setField(bb, "java.nio.Buffer", "position", -545808384);
        setField(bb, "java.nio.Buffer", "limit", 1308892592);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock1);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_7() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 2147483644);
        setField(bb, "java.nio.Buffer", "limit", Integer.MIN_VALUE);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock1 = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock2 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock2);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = 1;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_8() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFC4'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.Buffer", "position", -6);
        setField(bb, "java.nio.Buffer", "limit", -4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock1 = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock2 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock2);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -252;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOuterHtmlHead_ThrowIllegalStateException_1() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = 4;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} 
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testOuterHtmlHead_ThrowCoderMalfunctionError_9() throws Throwable  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out1 = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        
        Class xmlDeclarationClazz = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = xmlDeclarationClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = ((Object) null);
        try {
            outerHtmlHeadMethod.invoke(xmlDeclaration, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for outerHtmlHead
    
    public void testOuterHtmlHead_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 56 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 33 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 22 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 10 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaLangAccess sun.nio.cs.SingleByte.JLA accessible:
        module java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.XmlDeclaration.outerHtmlTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link XmlDeclaration}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.XmlDeclaration#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.returnsFrom {@code void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
 * }}
 *  */
    @Test
    public void testOuterHtmlTail_Return() throws Exception  {
        XmlDeclaration xmlDeclaration = ((XmlDeclaration) createInstance("org.jsoup.nodes.XmlDeclaration"));
        
        xmlDeclaration.outerHtmlTail(null, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1001295758614000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1001295758614000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1001295758624800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001295758614000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001295758624800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1001295760190300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1001295760190300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1001295760196800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001295760190300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001295760196800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1001295761834100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1001295761834100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1001295761837900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1001295761834100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1001295761837900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

