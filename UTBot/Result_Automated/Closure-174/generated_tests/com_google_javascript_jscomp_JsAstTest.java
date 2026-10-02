package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.SourceFile.OnDisk;
import com.google.javascript.jscomp.SourceFile.Generated;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import java.util.Set;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.InputId;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_JsAstTest {
    ///region Test suites for executable com.google.javascript.jscomp.JsAst.parse
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parse(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#parse(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ParserRunner.ParseResult result = ParserRunner.parse(sourceFile, sourceFile.getCode(), compiler.getParserConfig(), compiler.getDefaultErrorReporter(), logger_);
 *  */
    @Test
    public void testParse_ThrowNullPointerException() throws Throwable  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:83) */
        Class jsAstClazz = Class.forName("com.google.javascript.jscomp.JsAst");
        Class abstractCompilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Method parseMethod = jsAstClazz.getDeclaredMethod("parse", abstractCompilerType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = ((Object) null);
        try {
            parseMethod.invoke(jsAst, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#parse(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getParserConfig()
 *  */
    @Test
    public void testParse_ThrowNullPointerException_2() throws Throwable  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.Preloaded sourceFile = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        jsAst.setSourceFile(sourceFile);
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84) */
        Class jsAstClazz = Class.forName("com.google.javascript.jscomp.JsAst");
        Class abstractCompilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Method parseMethod = jsAstClazz.getDeclaredMethod("parse", abstractCompilerType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = ((Object) null);
        try {
            parseMethod.invoke(jsAst, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#parse(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getParserConfig()
 *  */
    @Test
    public void testParse_ThrowNullPointerException_1() throws Throwable  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Preloaded referenced = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84) */
        Class jsAstClazz = Class.forName("com.google.javascript.jscomp.JsAst");
        Class abstractCompilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Method parseMethod = jsAstClazz.getDeclaredMethod("parse", abstractCompilerType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = ((Object) null);
        try {
            parseMethod.invoke(jsAst, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#parse(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getParserConfig()
 *  */
    @Test
    public void testParse_ThrowNullPointerException_3() throws Throwable  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Preloaded referenced1 = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.parse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84) */
        Class jsAstClazz = Class.forName("com.google.javascript.jscomp.JsAst");
        Class abstractCompilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Method parseMethod = jsAstClazz.getDeclaredMethod("parse", abstractCompilerType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = ((Object) null);
        try {
            parseMethod.invoke(jsAst, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parse(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#parse(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: compiler.getParserConfig()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException() throws Throwable  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.Preloaded sourceFile = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        jsAst.setSourceFile(sourceFile);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        Class jsAstClazz = Class.forName("com.google.javascript.jscomp.JsAst");
        Class compilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Method parseMethod = jsAstClazz.getDeclaredMethod("parse", compilerType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = compiler;
        try {
            parseMethod.invoke(jsAst, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#parse(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: compiler.getParserConfig()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParse_ThrowIllegalArgumentException_1() throws Throwable  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.Preloaded sourceFile = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        jsAst.setSourceFile(sourceFile);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        Class jsAstClazz = Class.forName("com.google.javascript.jscomp.JsAst");
        Class compilerType = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Method parseMethod = jsAstClazz.getDeclaredMethod("parse", compilerType);
        parseMethod.setAccessible(true);
        java.lang.Object[] parseMethodArguments = new java.lang.Object[1];
        parseMethodArguments[0] = compiler;
        try {
            parseMethod.invoke(jsAst, parseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for parse
    
    public void testParse_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.JsAst.getSourceFile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSourceFile()
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getSourceFile()}
 * @utbot.returnsFrom {@code return sourceFile;}
 *  */
    @Test
    public void testGetSourceFile_ReturnSourceFile() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        SourceFile actual = jsAst.getSourceFile();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.JsAst.setSourceFile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSourceFile(com.google.javascript.jscomp.SourceFile)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#setSourceFile(com.google.javascript.jscomp.SourceFile)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#getName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 *  */
    @Test
    public void testSetSourceFile_PreconditionsCheckState() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        String fileName = " ";
        setField(jsAst, "com.google.javascript.jscomp.JsAst", "fileName", fileName);
        SourceFile.Preloaded preloaded = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(preloaded, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        
        SourceFile initialJsAstSourceFile = ((SourceFile) getFieldValue(jsAst, "com.google.javascript.jscomp.JsAst", "sourceFile"));
        
        jsAst.setSourceFile(preloaded);
        
        SourceFile finalJsAstSourceFile = ((SourceFile) getFieldValue(jsAst, "com.google.javascript.jscomp.JsAst", "sourceFile"));
        
        assertFalse(initialJsAstSourceFile == finalJsAstSourceFile);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSourceFile(com.google.javascript.jscomp.SourceFile)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#setSourceFile(com.google.javascript.jscomp.SourceFile)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(fileName.equals(file.getName()));
 *  */
    @Test
    public void testSetSourceFile_ThrowNullPointerException() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.setSourceFile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.setSourceFile(JsAst.java:77) */
        jsAst.setSourceFile(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#setSourceFile(com.google.javascript.jscomp.SourceFile)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(fileName.equals(file.getName()));
 *  */
    @Test
    public void testSetSourceFile_ThrowNullPointerException_1() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.Preloaded preloaded = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.setSourceFile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.setSourceFile(JsAst.java:77) */
        jsAst.setSourceFile(preloaded);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSourceFile(com.google.javascript.jscomp.SourceFile)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#setSourceFile(com.google.javascript.jscomp.SourceFile)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#getName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(fileName.equals(file.getName()));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetSourceFile_ThrowIllegalStateException() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        String fileName = "  ";
        setField(jsAst, "com.google.javascript.jscomp.JsAst", "fileName", fileName);
        SourceFile.Preloaded preloaded = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName1 = " ";
        setField(preloaded, "com.google.javascript.jscomp.SourceFile", "fileName", fileName1);
        
        jsAst.setSourceFile(preloaded);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.JsAst.clearAst
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearAst()
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#clearAst()}
 *  */
    @Test
    public void testClearAst() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#clearAst()}
 *  */
    @Test
    public void testClearAst_1() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#clearAst()}
 *  */
    @Test
    public void testClearAst_2() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced1 = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#clearAst()}
 *  */
    @Test
    public void testClearAst_5() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.OnDisk sourceFile = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#clearAst()}
 *  */
    @Test
    public void testClearAst_3() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced2 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.OnDisk referenced3 = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(referenced2, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced3);
        setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#clearAst()}
 *  */
    @Test
    public void testClearAst_4() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced2 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced3 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced4 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced5 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced6 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced7 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced8 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced9 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced10 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced11 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced12 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced13 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced14 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced15 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Generated referenced16 = ((SourceFile.Generated) createInstance("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(referenced15, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced16);
        setField(referenced14, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced15);
        setField(referenced13, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced14);
        setField(referenced12, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced13);
        setField(referenced11, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced12);
        setField(referenced10, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced11);
        setField(referenced9, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced10);
        setField(referenced8, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced9);
        setField(referenced7, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced8);
        setField(referenced6, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced7);
        setField(referenced5, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced6);
        setField(referenced4, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced5);
        setField(referenced3, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced4);
        setField(referenced2, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced3);
        setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(jsAst, "com.google.javascript.jscomp.JsAst", "root", root);
        
        jsAst.clearAst();
        
        Node finalJsAstRoot = ((Node) getFieldValue(jsAst, "com.google.javascript.jscomp.JsAst", "root"));
        
        assertNull(finalJsAstRoot);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method clearAst()
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#clearAst()}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceFile#clearCachedSource()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sourceFile.clearCachedSource();
 *  */
    @Test
    public void testClearAst_ThrowNullPointerException() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.clearAst] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.clearAst(JsAst.java:62) */
        jsAst.clearAst();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method clearAst()
    
    @Test
    public void testClearAst1() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.Generated sourceFile = ((SourceFile.Generated) createInstance("com.google.javascript.jscomp.SourceFile$Generated"));
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    @Test
    public void testClearAst2() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Generated referenced = ((SourceFile.Generated) createInstance("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    @Test
    public void testClearAst3() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Generated referenced1 = ((SourceFile.Generated) createInstance("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    
    @Test
    public void testClearAst4() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.Generated referenced2 = ((SourceFile.Generated) createInstance("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        jsAst.clearAst();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.JsAst.getAstRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAstRoot(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.executesCondition {@code (root == null): False}
 * @utbot.returnsFrom {@code return root;}
 *  */
    @Test
    public void testGetAstRoot_RootNotEqualsNull() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(jsAst, "com.google.javascript.jscomp.JsAst", "root", root);
        
        Object actual = jsAst.getAstRoot(null);
        
        double rootNumber = ((Double) getFieldValue(root, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        assertEquals(rootNumber, actualNumber, 1.0E-6);
        
        int rootType = (((Node) root)).getType();
        int actualType = (((Node) actual)).getType();
        org.junit.Assert.assertEquals(rootType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int rootSourcePosition = (((Node) root)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        org.junit.Assert.assertEquals(rootSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAstRoot(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parse(compiler);
 *  */
    @Test
    public void testGetAstRoot_ThrowNullPointerException_1() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.getAstRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:83)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50) */
        jsAst.getAstRoot(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parse(compiler);
 *  */
    @Test
    public void testGetAstRoot_ThrowNullPointerException() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        jsAst.setSourceFile(sourceFile);
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.getAstRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50) */
        jsAst.getAstRoot(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parse(compiler);
 *  */
    @Test
    public void testGetAstRoot_ThrowNullPointerException_2() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.getAstRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50) */
        jsAst.getAstRoot(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parse(compiler);
 *  */
    @Test
    public void testGetAstRoot_ThrowNullPointerException_3() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced1 = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.getAstRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50) */
        jsAst.getAstRoot(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getAstRoot(com.google.javascript.jscomp.AbstractCompiler)
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parse(compiler);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot_ThrowIllegalArgumentException_1() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        jsAst.setSourceFile(sourceFile);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        jsAst.getAstRoot(compiler);
    }
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getAstRoot(com.google.javascript.jscomp.AbstractCompiler)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: parse(compiler);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot_ThrowIllegalArgumentException() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        String code = "";
        setField(referenced, "com.google.javascript.jscomp.SourceFile", "code", code);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        jsAst.getAstRoot(compiler);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getAstRoot(com.google.javascript.jscomp.AbstractCompiler)
    
    @Test(expected = StackOverflowError.class)
    public void testGetAstRoot1() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", sourceFile);
        jsAst.setSourceFile(sourceFile);
        
        jsAst.getAstRoot(null);
    }
    
    @Test
    public void testGetAstRoot2() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced1 = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.getAstRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.getParserConfig(Compiler.java:2087)
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50) */
        jsAst.getAstRoot(compiler);
    }
    
    @Test
    public void testGetAstRoot3() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced2 = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        
        /* This test fails because method [com.google.javascript.jscomp.JsAst.getAstRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:84)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50) */
        jsAst.getAstRoot(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getAstRoot(com.google.javascript.jscomp.AbstractCompiler)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot4() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        jsAst.setSourceFile(sourceFile);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        jsAst.getAstRoot(compiler);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot5() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        jsAst.setSourceFile(sourceFile);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
        options.setLanguageIn(languageIn);
        compiler.options = options;
        
        jsAst.getAstRoot(compiler);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot6() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
            options.setLanguageIn(languageIn);
            LinkedHashSet extraAnnotationNames = new LinkedHashSet();
            setField(options, "com.google.javascript.jscomp.CompilerOptions", "extraAnnotationNames", extraAnnotationNames);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot7() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            setStaticField(parserRunnerClazz, "annotationNames", null);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
            options.setLanguageIn(languageIn);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot8() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            setStaticField(parserRunnerClazz, "annotationNames", null);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
            options.setLanguageIn(languageIn);
            LinkedHashSet extraAnnotationNames = new LinkedHashSet();
            setField(options, "com.google.javascript.jscomp.CompilerOptions", "extraAnnotationNames", extraAnnotationNames);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot9() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            setStaticField(parserRunnerClazz, "annotationNames", null);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            String code = "";
            setField(referenced, "com.google.javascript.jscomp.SourceFile", "code", code);
            setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
            options.setLanguageIn(languageIn);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot10() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        Set prevSuppressionNames = ((Set) getStaticFieldValue(parserRunnerClazz, "suppressionNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            setStaticField(parserRunnerClazz, "suppressionNames", null);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile.Preloaded sourceFile = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
            String code = "";
            setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5;
            options.setLanguageIn(languageIn);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "suppressionNames", prevSuppressionNames);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetAstRoot11() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        Set prevSuppressionNames = ((Set) getStaticFieldValue(parserRunnerClazz, "suppressionNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            setStaticField(parserRunnerClazz, "suppressionNames", null);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
            options.setLanguageIn(languageIn);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "suppressionNames", prevSuppressionNames);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testGetAstRoot12() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            annotationNames.add(null);
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
            options.setLanguageIn(languageIn);
            LinkedHashSet extraAnnotationNames = new LinkedHashSet();
            setField(options, "com.google.javascript.jscomp.CompilerOptions", "extraAnnotationNames", extraAnnotationNames);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testGetAstRoot13() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            annotationNames.add(null);
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            SourceFile referenced = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            String code = "";
            setField(referenced, "com.google.javascript.jscomp.SourceFile", "code", code);
            setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
            options.setLanguageIn(languageIn);
            LinkedHashSet extraAnnotationNames = new LinkedHashSet();
            setField(options, "com.google.javascript.jscomp.CompilerOptions", "extraAnnotationNames", extraAnnotationNames);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testGetAstRoot14() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT;
            options.setLanguageIn(languageIn);
            LinkedHashSet extraAnnotationNames = new LinkedHashSet();
            setField(options, "com.google.javascript.jscomp.CompilerOptions", "extraAnnotationNames", extraAnnotationNames);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testGetAstRoot15() throws Exception  {
        Class parserRunnerClazz = Class.forName("com.google.javascript.jscomp.parsing.ParserRunner");
        Set prevAnnotationNames = ((Set) getStaticFieldValue(parserRunnerClazz, "annotationNames"));
        try {
            LinkedHashSet annotationNames = new LinkedHashSet();
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            annotationNames.add(null);
            setStaticField(parserRunnerClazz, "annotationNames", annotationNames);
            JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile sourceFile = ((SourceFile) createInstance("com.google.javascript.jscomp.SourceFile"));
            jsAst.setSourceFile(sourceFile);
            Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
            CompilerOptions.LanguageMode languageIn = CompilerOptions.LanguageMode.ECMASCRIPT3;
            options.setLanguageIn(languageIn);
            LinkedHashSet extraAnnotationNames = new LinkedHashSet();
            setField(options, "com.google.javascript.jscomp.CompilerOptions", "extraAnnotationNames", extraAnnotationNames);
            compiler.options = options;
            
            jsAst.getAstRoot(compiler);
        } finally {
            setStaticField(com.google.javascript.jscomp.parsing.ParserRunner.class, "annotationNames", prevAnnotationNames);
        }
    }
    ///endregion
    
    ///region Errors report for getAstRoot
    
    public void testGetAstRoot_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.JsAst.getInputId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInputId()
    
    /**
    @utbot.classUnderTest {@link JsAst}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.JsAst#getInputId()}
 * @utbot.returnsFrom {@code return inputId;}
 *  */
    @Test
    public void testGetInputId_ReturnInputId() throws Exception  {
        JsAst jsAst = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        
        InputId actual = jsAst.getInputId();
        
        assertNull(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields920314868900000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields920314868900000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass920314868914200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields920314868900000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass920314868914200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields920314869407700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields920314869407700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass920314869413700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields920314869407700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass920314869413700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields920314870265000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields920314870265000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass920314870269300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields920314870265000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass920314870269300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields920314870940700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields920314870940700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass920314870944700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields920314870940700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass920314870944700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

