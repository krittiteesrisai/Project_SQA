package org.jsoup.nodes;

import org.junit.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.PrintWriter;
import org.jsoup.nodes.Document.OutputSettings;
import java.lang.reflect.Method;
import java.io.IOException;
import java.io.PrintStream;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.nio.ReadOnlyBufferException;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_jsoup_nodes_CommentTest {
    ///region Test suites for executable org.jsoup.nodes.Comment.nodeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nodeName()
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#nodeName()}
 * @utbot.returnsFrom {@code return "#comment";}
 *  */
    @Test
    public void testNodeName_ReturnComment() {
        Comment comment = new Comment(null);
        
        String actual = comment.nodeName();
        
        String expected = "#comment";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Comment.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Comment}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#toString()}
     */
    @Test
    public void testToString() {
        Comment comment = new Comment("XZ");
        
        String actual = comment.toString();
        
        String expected = "\n<!--XZ-->";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Concrete execution failed
        
        // 4 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Comment.getData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getData()
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.returnsFrom {@code return coreValue();}
 *  */
    @Test
    public void testGetData_ReturnCoreValue_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        String actual = comment.getData();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.returnsFrom {@code return coreValue();}
 *  */
    @Test
    public void testGetData_ReturnCoreValue() {
        Comment comment = new Comment(null, null);
        
        String actual = comment.getData();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getData()
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return coreValue();
 *  */
    @Test
    public void testGetData_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(byteArrayType, byteArrayType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = ((Object) byteArray);
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.getData] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        comment.getData();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetData_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.getData] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.getData();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetData_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.getData] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.getData();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetData_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "[\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.getData] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.getData();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetData_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.getData] produces [java.lang.NullPointerException] */
        comment.getData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Comment.outerHtmlTail
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlTail(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.returnsFrom {@code void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
 * }}
 *  */
    @Test
    public void testOuterHtmlTail_Return() {
        Comment comment = new Comment(null);
        
        comment.outerHtmlTail(null, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Comment.outerHtmlHead
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testOuterHtmlHead_ThrowIndexOutOfBoundsException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Comment.outerHtmlHead] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testOuterHtmlHead_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Comment.outerHtmlHead] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testOuterHtmlHead_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Comment.outerHtmlHead] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: append
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException_1() throws Exception  {
        Comment comment = new Comment(null);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Comment.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.outerHtmlHead(Comment.java:49) */
        comment.outerHtmlHead(null, -255, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: out.prettyPrint()
 *  */
    @Test
    public void testOuterHtmlHead_ThrowNullPointerException() throws IOException  {
        Comment comment = new Comment(null);
        
        /* This test fails because method [org.jsoup.nodes.Comment.outerHtmlHead] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.outerHtmlHead(Comment.java:46) */
        comment.outerHtmlHead(null, -255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: indent(accum, depth, out);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testOuterHtmlHead_ThrowIllegalArgumentException() throws Exception  {
        Comment comment = new Comment(null);
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", -2023406815);
        
        comment.outerHtmlHead(printStream, -225, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException() throws Throwable  {
        Comment comment = new Comment(null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -254;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOuterHtmlHead_ThrowIllegalStateException() throws Throwable  {
        Comment comment = new Comment(null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = 0;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testOuterHtmlHead_ThrowReadOnlyBufferException_1() throws Throwable  {
        Comment comment = new Comment(null);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", printWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = printWriter;
        outerHtmlHeadMethodArguments[1] = 2;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: indent(accum, depth, out);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testOuterHtmlHead_ThrowIllegalArgumentException_1() throws Throwable  {
        Comment comment = new Comment(null);
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out1 = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out1, "java.io.OutputStreamWriter", "se", se);
        setField(out, "java.io.PrintWriter", "out", out1);
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock1);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "prettyPrint", true);
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "indentAmount", -1047552999);
        
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", anonymousPrintWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = anonymousPrintWriter;
        outerHtmlHeadMethodArguments[1] = -41;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#outerHtmlHead(java.lang.Appendable,int,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#prettyPrint()}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testOuterHtmlHead_ThrowIOException() throws Throwable  {
        Comment comment = new Comment(null);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class intType = int.class;
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method outerHtmlHeadMethod = commentClazz.getDeclaredMethod("outerHtmlHead", outputStreamWriterType, intType, outputSettingsType);
        outerHtmlHeadMethod.setAccessible(true);
        java.lang.Object[] outerHtmlHeadMethodArguments = new java.lang.Object[3];
        outerHtmlHeadMethodArguments[0] = outputStreamWriter;
        outerHtmlHeadMethodArguments[1] = -255;
        outerHtmlHeadMethodArguments[2] = outputSettings;
        try {
            outerHtmlHeadMethod.invoke(comment, outerHtmlHeadMethodArguments);
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
        // 22 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 18 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 14 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaLangAccess sun.nio.cs.SingleByte.JLA accessible:
        module java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Comment.isXmlDeclaration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isXmlDeclaration()
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
 * @utbot.invokes {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return (data.length() > 1 && (data.startsWith("!") || data.startsWith("?")));}
 *  */
    @Test
    public void testIsXmlDeclaration_StringLength() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        boolean actual = comment.isXmlDeclaration();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isXmlDeclaration()
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String data = getData();
 *  */
    @Test
    public void testIsXmlDeclaration_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(byteArrayType, byteArrayType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = ((Object) byteArray);
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.isXmlDeclaration] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        comment.isXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsXmlDeclaration_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.isXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.isXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsXmlDeclaration_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.isXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.isXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsXmlDeclaration_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.isXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.isXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (data.length() > 1 && (data.startsWith("!") || data.startsWith("?")));
 *  */
    @Test
    public void testIsXmlDeclaration_ThrowNullPointerException_1() {
        Comment comment = new Comment(null, null);
        
        /* This test fails because method [org.jsoup.nodes.Comment.isXmlDeclaration] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.isXmlDeclaration(Comment.java:67) */
        comment.isXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIsXmlDeclaration_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.isXmlDeclaration] produces [java.lang.NullPointerException] */
        comment.isXmlDeclaration();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isXmlDeclaration()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Comment}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#isXmlDeclaration()}
     */
    @Test
    public void testIsXmlDeclarationReturnsFalse() {
        Comment comment = new Comment("?");
        
        boolean actual = comment.isXmlDeclaration();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isXmlDeclaration()
    
    @Test
    public void testIsXmlDeclaration1() {
        String string = "\u0000\u0000";
        Comment comment = new Comment(string, null);
        
        boolean actual = comment.isXmlDeclaration();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Comment.asXmlDeclaration
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asXmlDeclaration()
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: String data = getData();
 *  */
    @Test
    public void testAsXmlDeclaration_ThrowClassCastException() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        byte[] byteArray = {};
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class byteArrayType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(byteArrayType, byteArrayType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = ((Object) byteArray);
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.String] */
        comment.asXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAsXmlDeclaration_ThrowIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.asXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAsXmlDeclaration_ThrowIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.asXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAsXmlDeclaration_ThrowIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        comment.asXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Document doc = Jsoup.parse("<" + data.substring(1, data.length() - 1) + ">", baseUri(), Parser.xmlParser());
 *  */
    @Test
    public void testAsXmlDeclaration_ThrowNullPointerException_1() {
        Comment comment = new Comment(null, null);
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Comment.asXmlDeclaration(Comment.java:76) */
        comment.asXmlDeclaration();
    }
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAsXmlDeclaration_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.NullPointerException] */
        comment.asXmlDeclaration();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asXmlDeclaration()
    
    /**
    @utbot.classUnderTest {@link Comment}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
 * @utbot.invokes {@link org.jsoup.nodes.Comment#getData()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: Document doc = Jsoup.parse("<" + data.substring(1, data.length() - 1) + ">", baseUri(), Parser.xmlParser());
 *  */
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAsXmlDeclaration_ThrowStringIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Class commentClazz = Class.forName("org.jsoup.nodes.Comment");
        Class attributesType = Class.forName("java.lang.String");
        Constructor commentConstructor = commentClazz.getDeclaredConstructor(attributesType, attributesType);
        commentConstructor.setAccessible(true);
        java.lang.Object[] commentConstructorArguments = new java.lang.Object[2];
        commentConstructorArguments[0] = attributes;
        commentConstructorArguments[1] = ((Object) null);
        Comment comment = ((Comment) commentConstructor.newInstance(commentConstructorArguments));
        
        comment.asXmlDeclaration();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method asXmlDeclaration()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Comment}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Comment#asXmlDeclaration()}
     */
    @Test
    public void testAsXmlDeclarationThrowsSIOOBE() {
        Comment comment = new Comment("<");
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.StringIndexOutOfBoundsException: begin 1, end 0, length 1]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            org.jsoup.nodes.Comment.asXmlDeclaration(Comment.java:76) */
        comment.asXmlDeclaration();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method asXmlDeclaration()
    
    @Test
    public void testAsXmlDeclaration1() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Comment comment = new Comment(string, null);
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.nodes.Comment.asXmlDeclaration(Comment.java:79) */
        comment.asXmlDeclaration();
    }
    
    @Test
    public void testAsXmlDeclaration2() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        Comment comment = new Comment(string, null);
        
        /* This test fails because method [org.jsoup.nodes.Comment.asXmlDeclaration] produces [java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            org.jsoup.nodes.Element.child(Element.java:253)
            org.jsoup.nodes.Comment.asXmlDeclaration(Comment.java:79) */
        comment.asXmlDeclaration();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1008198470577800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1008198470577800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1008198470582700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1008198470577800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1008198470582700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

