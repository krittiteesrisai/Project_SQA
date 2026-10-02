package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.CodePrinter.Format;
import com.google.javascript.jscomp.SourceMap.DetailLevel;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_CodePrinterTest {
    ///region Test suites for executable com.google.javascript.jscomp.CodePrinter.toSource
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodePrinter$Format, boolean, boolean, int, com.google.javascript.jscomp.SourceMap, com.google.javascript.jscomp.SourceMap$DetailLevel, java.nio.charset.Charset, boolean)
    
    /**
    @utbot.classUnderTest {@link CodePrinter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CodePrinter#toSource(com.google.javascript.rhino.Node,com.google.javascript.jscomp.CodePrinter.Format,boolean,boolean,int,com.google.javascript.jscomp.SourceMap,com.google.javascript.jscomp.SourceMap.DetailLevel,java.nio.charset.Charset,boolean)}
 * @utbot.executesCondition {@code (Preconditions.checkState(sourceMapDetailLevel != null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(sourceMapDetailLevel != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testToSource_ThrowIllegalStateException() throws Throwable  {
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = ((Object) null);
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -255;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = ((Object) null);
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodePrinter$Format, boolean, boolean, int, com.google.javascript.jscomp.SourceMap, com.google.javascript.jscomp.SourceMap$DetailLevel, java.nio.charset.Charset, boolean)
    
    @Test
    public void testToSource1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(42);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "this";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(83);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "()";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(63);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "[]";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(117);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "continue";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(44);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "true";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource6() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(116);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "break";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(41);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "null";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource8() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(118);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource9() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(43);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "false";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    
    @Test
    public void testToSource10() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.SYMBOLS;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        String actual = ((String) toSourceMethod.invoke(null, toSourceMethodArguments));
        
        String expected = "{}";
        
        assertEquals(expected, actual);
        
        SourceMap.DetailLevel finalDetailLevel = detailLevel;
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodePrinter$Format, boolean, boolean, int, com.google.javascript.jscomp.SourceMap, com.google.javascript.jscomp.SourceMap$DetailLevel, java.nio.charset.Charset, boolean)
    /// Actual number of generated tests (91) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test(expected = IllegalStateException.class)
    public void testToSource11() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        CodePrinter.Format format = CodePrinter.Format.TYPED;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", numberNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = numberNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource12() throws Throwable  {
        Node node = new Node(46);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource13() throws Throwable  {
        Node node = new Node(52);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource14() throws Throwable  {
        Node node = new Node(20);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource15() throws Throwable  {
        Node node = new Node(19);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource16() throws Throwable  {
        Node node = new Node(113);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource17() throws Throwable  {
        Node node = new Node(93);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource18() throws Throwable  {
        Node node = new Node(24);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource19() throws Throwable  {
        Node node = new Node(96);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource20() throws Throwable  {
        Node node = new Node(40);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource21() throws Throwable  {
        Node node = new Node(45);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource22() throws Throwable  {
        Node node = new Node(92);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource23() throws Throwable  {
        Node node = new Node(15);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource24() throws Throwable  {
        Node node = new Node(32);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource25() throws Throwable  {
        Node node = new Node(115);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource26() throws Throwable  {
        Node node = new Node(27);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource27() throws Throwable  {
        Node node = new Node(21);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource28() throws Throwable  {
        Node node = new Node(120);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource29() throws Throwable  {
        Node node = new Node(86);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource30() throws Throwable  {
        Node node = new Node(25);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource31() throws Throwable  {
        Node node = new Node(11);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource32() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(42);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource33() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(39);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource34() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(35);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource35() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(112);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource36() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(110);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource37() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(83);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource38() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource39() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource40() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource41() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(119);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource42() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(117);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource43() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(111);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource44() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(44);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource45() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(43);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource46() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource47() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource48() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource49() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource50() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource51() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(88);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource52() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource53() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(102);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource54() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource55() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(41);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource56() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.SYMBOLS;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource57() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(31);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.SYMBOLS;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource58() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(49);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.SYMBOLS;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testToSource59() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.SYMBOLS;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testToSource60() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodePrinter$Format, boolean, boolean, int, com.google.javascript.jscomp.SourceMap, com.google.javascript.jscomp.SourceMap$DetailLevel, java.nio.charset.Charset, boolean)
    
    @Test(timeout = 1000L)
    public void testToSource61() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(13);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testToSource62() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(71);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodePrinter$Format, boolean, boolean, int, com.google.javascript.jscomp.SourceMap, com.google.javascript.jscomp.SourceMap$DetailLevel, java.nio.charset.Charset, boolean)
    
    @Test
    public void testToSource63() throws Throwable  {
        Node node = new Node(108);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:90)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:534)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource64() throws Throwable  {
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:90)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = true;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource65() throws Throwable  {
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:90)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 1;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource66() throws Throwable  {
        Node node = new Node(77);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:133)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource67() throws Throwable  {
        Node node = new Node(110);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:90)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:696)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource68() throws Throwable  {
        Node node = new Node(47);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:273)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource69() throws Throwable  {
        Node node = new Node(30);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2581)
            com.google.javascript.jscomp.NodeUtil$MatchNodeType.apply(NodeUtil.java:2572)
            com.google.javascript.jscomp.NodeUtil.has(NodeUtil.java:2660)
            com.google.javascript.jscomp.NodeUtil.containsType(NodeUtil.java:2193)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:618)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource70() throws Throwable  {
        CodePrinter.Format format = CodePrinter.Format.TYPED;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypedCodeGenerator.add(TypedCodeGenerator.java:41)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 1;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource71() throws Throwable  {
        SourceMap sourceMap = ((SourceMap) createInstance("com.google.javascript.jscomp.SourceMap"));
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:90)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = ((Object) null);
        toSourceMethodArguments[1] = ((Object) null);
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = sourceMap;
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource72() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource73() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(25);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource74() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(28);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource75() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(18);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource76() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(96);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource77() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(16);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource78() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource79() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(90);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource80() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:451)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource81() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(93);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource82() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(9);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource83() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(24);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource84() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource85() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(97);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource86() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(10);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource87() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(27);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource88() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(88);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource89() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:638)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource90() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:133)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource91() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource92() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(20);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource93() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(23);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource94() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(14);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource95() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(17);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource96() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.SYMBOLS;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLatin(NodeUtil.java:2401)
            com.google.javascript.jscomp.CodeGenerator.identifierEscape(CodeGenerator.java:1099)
            com.google.javascript.jscomp.CodeGenerator.addIdentifier(CodeGenerator.java:78)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:196)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource97() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.SYMBOLS;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.isIndirectEval(CodeGenerator.java:788)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:512)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", stringNodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = stringNode;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource98() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(95);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource99() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(52);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource100() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(22);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource101() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(19);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource102() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(11);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = 0;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testToSource103() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(13);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        CodePrinter.Format format = CodePrinter.Format.COMPACT;
        SourceMap.DetailLevel detailLevel = SourceMap.DetailLevel.ALL;
        
        /* This test fails because method [com.google.javascript.jscomp.CodePrinter.toSource] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:111)
            com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:82)
            com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:710) */
        Class codePrinterClazz = Class.forName("com.google.javascript.jscomp.CodePrinter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class formatType = Class.forName("com.google.javascript.jscomp.CodePrinter$Format");
        Class booleanType = boolean.class;
        Class intType = int.class;
        Class sourceMapType = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class detailLevelType = Class.forName("com.google.javascript.jscomp.SourceMap$DetailLevel");
        Class charsetType = Class.forName("java.nio.charset.Charset");
        Method toSourceMethod = codePrinterClazz.getDeclaredMethod("toSource", nodeType, formatType, booleanType, booleanType, intType, sourceMapType, detailLevelType, charsetType, booleanType);
        toSourceMethod.setAccessible(true);
        java.lang.Object[] toSourceMethodArguments = new java.lang.Object[9];
        toSourceMethodArguments[0] = node;
        toSourceMethodArguments[1] = format;
        toSourceMethodArguments[2] = false;
        toSourceMethodArguments[3] = false;
        toSourceMethodArguments[4] = -2147483647;
        toSourceMethodArguments[5] = ((Object) null);
        toSourceMethodArguments[6] = detailLevel;
        toSourceMethodArguments[7] = ((Object) null);
        toSourceMethodArguments[8] = false;
        try {
            toSourceMethod.invoke(null, toSourceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for toSource
    
    public void testToSource_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields887595292159300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields887595292159300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass887595292164800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields887595292159300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass887595292164800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

