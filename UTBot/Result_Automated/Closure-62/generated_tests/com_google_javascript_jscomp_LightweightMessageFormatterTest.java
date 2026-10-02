package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter;
import com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter;
import com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.SourceFile.OnDisk;
import java.lang.reflect.Method;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_LightweightMessageFormatterTest {
    ///region Test suites for executable com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatWarning(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatWarning(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(warning, true);
 *  */
    @Test
    public void testFormatWarning_ThrowNullPointerException_1() throws Exception  {
        LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        
        /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:75)
            com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning(LightweightMessageFormatter.java:63) */
        lightweightMessageFormatter.formatWarning(null);
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatWarning(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(warning, true);
 *  */
    @Test
    public void testFormatWarning_ThrowNullPointerException() throws Exception  {
        LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
            com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning(LightweightMessageFormatter.java:63) */
        lightweightMessageFormatter.formatWarning(null);
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatWarning(com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt#get(com.google.javascript.jscomp.SourceExcerptProvider,java.lang.String,int,com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(warning, true);
 *  */
    @Test
    public void testFormatWarning_ThrowNullPointerException_2() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", -255);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
                com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning(LightweightMessageFormatter.java:63) */
            lightweightMessageFormatter.formatWarning(jSError);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatWarning(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(warning, true);
 *  */
    @Test
    public void testFormatWarning_ThrowNullPointerException_3() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1816)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
                com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning(LightweightMessageFormatter.java:63) */
            lightweightMessageFormatter.formatWarning(jSError);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatWarning(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(warning, true);
 *  */
    @Test
    public void testFormatWarning_ThrowNullPointerException_4() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            inputsByName.put(null, null);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1817)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
                com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning(LightweightMessageFormatter.java:63) */
            lightweightMessageFormatter.formatWarning(jSError);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    ///endregion
    
    ///region Errors report for formatWarning
    
    public void testFormatWarning_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withoutSource()
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#withoutSource()}
 * @utbot.returnsFrom {@code return new LightweightMessageFormatter();}
 *  */
    @Test
    public void testWithoutSource_Return() throws Exception  {
        LightweightMessageFormatter actual = LightweightMessageFormatter.withoutSource();
        
        LightweightMessageFormatter expected = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Class sourceExcerptClazz = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Object excerpt = getEnumConstantByName(sourceExcerptClazz, "LINE");
        setField(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
        
        SourceExcerptProvider.SourceExcerpt expectedExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        SourceExcerptProvider.SourceExcerpt actualExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(actual, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        assertEquals(expectedExcerpt, actualExcerpt);
        
        SourceExcerptProvider actualSource = actual.getSource();
        assertNull(actualSource);
        
        boolean actualColorize = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AbstractMessageFormatter", "colorize"));
        assertFalse(actualColorize);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withoutSource()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#withoutSource()}
     */
    @Test
    public void testWithoutSource() throws Exception  {
        LightweightMessageFormatter actual = LightweightMessageFormatter.withoutSource();
        
        LightweightMessageFormatter expected = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Class sourceExcerptClazz = Class.forName("com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Object excerpt = getEnumConstantByName(sourceExcerptClazz, "LINE");
        setField(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
        
        SourceExcerptProvider.SourceExcerpt expectedExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(expected, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        SourceExcerptProvider.SourceExcerpt actualExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(actual, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
        assertEquals(expectedExcerpt, actualExcerpt);
        
        SourceExcerptProvider actualSource = actual.getSource();
        assertNull(actualSource);
        
        boolean actualColorize = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AbstractMessageFormatter", "colorize"));
        assertFalse(actualColorize);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.LightweightMessageFormatter.formatError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatError(com.google.javascript.jscomp.JSError)
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatError(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(error, false);
 *  */
    @Test
    public void testFormatError_ThrowNullPointerException_1() throws Exception  {
        LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        
        /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:75)
            com.google.javascript.jscomp.LightweightMessageFormatter.formatError(LightweightMessageFormatter.java:59) */
        lightweightMessageFormatter.formatError(null);
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatError(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(error, false);
 *  */
    @Test
    public void testFormatError_ThrowNullPointerException() throws Exception  {
        LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
            com.google.javascript.jscomp.LightweightMessageFormatter.formatError(LightweightMessageFormatter.java:59) */
        lightweightMessageFormatter.formatError(null);
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatError(com.google.javascript.jscomp.JSError)}
 * @utbot.invokes {@link com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt#get(com.google.javascript.jscomp.SourceExcerptProvider,java.lang.String,int,com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(error, false);
 *  */
    @Test
    public void testFormatError_ThrowNullPointerException_2() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", -255);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatError] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
                com.google.javascript.jscomp.LightweightMessageFormatter.formatError(LightweightMessageFormatter.java:59) */
            lightweightMessageFormatter.formatError(jSError);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatError(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(error, false);
 *  */
    @Test
    public void testFormatError_ThrowNullPointerException_3() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatError] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1816)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
                com.google.javascript.jscomp.LightweightMessageFormatter.formatError(LightweightMessageFormatter.java:59) */
            lightweightMessageFormatter.formatError(jSError);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#formatError(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return format(error, false);
 *  */
    @Test
    public void testFormatError_ThrowNullPointerException_4() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            inputsByName.put(null, null);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.formatError] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1817)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70)
                com.google.javascript.jscomp.LightweightMessageFormatter.formatError(LightweightMessageFormatter.java:59) */
            lightweightMessageFormatter.formatError(jSError);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatError(com.google.javascript.jscomp.JSError)
    
    @Test
    public void testFormatError1() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile.OnDisk sourceFile = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
            String code = "\u0000\u0000";
            setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
            ast.setSourceFile(sourceFile);
            setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
            inputsByName.put(null, compilerInput);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1073741824);
            
            SourceExcerptProvider.SourceExcerpt initialLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            String actual = lightweightMessageFormatter.formatError(jSError);
            
            String expected = "ERROR - null\n";
            
            assertEquals(expected, actual);
            
            SourceExcerptProvider.SourceExcerpt finalLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            assertFalse(initialLightweightMessageFormatterExcerpt == finalLightweightMessageFormatterExcerpt);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    @Test
    public void testFormatError2() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            JsAst ast1 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile.OnDisk sourceFile = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
            String code = "";
            setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
            ast1.setSourceFile(sourceFile);
            setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
            setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
            inputsByName.put(null, compilerInput);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1);
            
            SourceExcerptProvider.SourceExcerpt initialLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            String actual = lightweightMessageFormatter.formatError(jSError);
            
            String expected = "ERROR - null\n";
            
            assertEquals(expected, actual);
            
            SourceExcerptProvider.SourceExcerpt finalLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            assertFalse(initialLightweightMessageFormatterExcerpt == finalLightweightMessageFormatterExcerpt);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    @Test
    public void testFormatError3() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            SourceFile.OnDisk referenced1 = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
            String code = "";
            setField(referenced1, "com.google.javascript.jscomp.SourceFile", "code", code);
            setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
            setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
            ast.setSourceFile(sourceFile);
            setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
            inputsByName.put(null, compilerInput);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1073741824);
            
            SourceExcerptProvider.SourceExcerpt initialLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            String actual = lightweightMessageFormatter.formatError(jSError);
            
            String expected = "ERROR - null\n";
            
            assertEquals(expected, actual);
            
            SourceExcerptProvider.SourceExcerpt finalLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            assertFalse(initialLightweightMessageFormatterExcerpt == finalLightweightMessageFormatterExcerpt);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    ///endregion
    
    ///region Errors report for formatError
    
    public void testFormatError_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 7 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.LightweightMessageFormatter.format
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format(com.google.javascript.jscomp.JSError, boolean)
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#format(com.google.javascript.jscomp.JSError,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: error.sourceName != null
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_1() throws Throwable  {
        LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        
        /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:75) */
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Class booleanType = boolean.class;
        Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
        formatMethod.setAccessible(true);
        java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
        formatMethodArguments[0] = ((Object) null);
        formatMethodArguments[1] = false;
        try {
            formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#format(com.google.javascript.jscomp.JSError,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: excerpt.get(source, error.sourceName, error.lineNumber, excerptFormatter)
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() throws Throwable  {
        LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
        
        /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70) */
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
        Class booleanType = boolean.class;
        Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
        formatMethod.setAccessible(true);
        java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
        formatMethodArguments[0] = ((Object) null);
        formatMethodArguments[1] = false;
        try {
            formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#format(com.google.javascript.jscomp.JSError,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: excerpt.get(source, error.sourceName, error.lineNumber, excerptFormatter)
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_2() throws Throwable  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", -255);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70) */
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            try {
                formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#format(com.google.javascript.jscomp.JSError,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: excerpt.get(source, error.sourceName, error.lineNumber, excerptFormatter)
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_3() throws Throwable  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1816)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70) */
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            try {
                formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    /**
    @utbot.classUnderTest {@link LightweightMessageFormatter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.LightweightMessageFormatter#format(com.google.javascript.jscomp.JSError,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: excerpt.get(source, error.sourceName, error.lineNumber, excerptFormatter)
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_4() throws Throwable  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            inputsByName.put(null, null);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1817)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70) */
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            try {
                formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method format(com.google.javascript.jscomp.JSError, boolean)
    
    @Test
    public void testFormat1() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1073741824);
            
            SourceExcerptProvider.SourceExcerpt initialLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            String actual = ((String) formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments));
            
            String expected = "ERROR - null\n";
            
            assertEquals(expected, actual);
            
            SourceExcerptProvider.SourceExcerpt finalLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            assertFalse(initialLightweightMessageFormatterExcerpt == finalLightweightMessageFormatterExcerpt);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    @Test
    public void testFormat2() throws Exception  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            JsAst ast1 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile.OnDisk sourceFile = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
            String code = "";
            setField(sourceFile, "com.google.javascript.jscomp.SourceFile", "code", code);
            ast1.setSourceFile(sourceFile);
            setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
            setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
            inputsByName.put(null, compilerInput);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1073741824);
            
            SourceExcerptProvider.SourceExcerpt initialLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            String actual = ((String) formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments));
            
            String expected = "ERROR - null\n";
            
            assertEquals(expected, actual);
            
            SourceExcerptProvider.SourceExcerpt finalLightweightMessageFormatterExcerpt = ((SourceExcerptProvider.SourceExcerpt) getFieldValue(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt"));
            
            assertFalse(initialLightweightMessageFormatterExcerpt == finalLightweightMessageFormatterExcerpt);
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method format(com.google.javascript.jscomp.JSError, boolean)
    
    @Test
    public void testFormat3() throws Throwable  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
            SourceFile.OnDisk referenced2 = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
            setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
            setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
            setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
            ast.setSourceFile(sourceFile);
            setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
            inputsByName.put(null, compilerInput);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1073741824);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.lang.IllegalArgumentException: Null charset name]
                java.base/java.nio.charset.Charset.lookup(Charset.java:454)
                java.base/java.nio.charset.Charset.forName(Charset.java:525)
                com.google.javascript.jscomp.SourceFile$OnDisk.getCharset(SourceFile.java:416)
                com.google.javascript.jscomp.SourceFile$OnDisk.getCode(SourceFile.java:373)
                com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
                com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
                com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
                com.google.javascript.jscomp.SourceFile.getLine(SourceFile.java:156)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1828)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70) */
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            try {
                formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    @Test
    public void testFormat4() throws Throwable  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            JsAst ast1 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
            SourceFile.OnDisk sourceFile = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
            File file = ((File) createInstance("java.io.File"));
            setField(sourceFile, "com.google.javascript.jscomp.SourceFile$OnDisk", "file", file);
            String inputCharset = "";
            sourceFile.inputCharset = inputCharset;
            ast1.setSourceFile(sourceFile);
            setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
            setField(compilerInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
            inputsByName.put(null, compilerInput);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1073741824);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.nio.charset.IllegalCharsetNameException: ]
                java.base/java.nio.charset.Charset.checkName(Charset.java:293)
                java.base/java.nio.charset.Charset.lookup2(Charset.java:481)
                java.base/java.nio.charset.Charset.lookup(Charset.java:461)
                java.base/java.nio.charset.Charset.forName(Charset.java:525)
                com.google.javascript.jscomp.SourceFile$OnDisk.getCharset(SourceFile.java:416)
                com.google.javascript.jscomp.SourceFile$OnDisk.getCode(SourceFile.java:373)
                com.google.javascript.jscomp.SourceFile.getLine(SourceFile.java:156)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1828)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70) */
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            try {
                formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    
    @Test
    public void testFormat5() throws Throwable  {
        Class lightweightMessageFormatterClazz = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        SourceExcerptProvider.ExcerptFormatter prevExcerptFormatter = ((SourceExcerptProvider.ExcerptFormatter) getStaticFieldValue(lightweightMessageFormatterClazz, "excerptFormatter"));
        try {
            LightweightMessageFormatter.LineNumberingFormatter excerptFormatter = new LightweightMessageFormatter.LineNumberingFormatter();
            setStaticField(lightweightMessageFormatterClazz, "excerptFormatter", excerptFormatter);
            LightweightMessageFormatter lightweightMessageFormatter = ((LightweightMessageFormatter) createInstance("com.google.javascript.jscomp.LightweightMessageFormatter"));
            SourceExcerptProvider.SourceExcerpt excerpt = SourceExcerptProvider.SourceExcerpt.LINE;
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.LightweightMessageFormatter", "excerpt", excerpt);
            Compiler source = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
            LinkedHashMap inputsByName = new LinkedHashMap();
            String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
            inputsByName.put(string, compilerInput);
            setField(source, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
            setField(lightweightMessageFormatter, "com.google.javascript.jscomp.AbstractMessageFormatter", "source", source);
            JSError jSError = ((JSError) createInstance("com.google.javascript.jscomp.JSError"));
            String sourceName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
            setField(jSError, "com.google.javascript.jscomp.JSError", "sourceName", sourceName);
            setField(jSError, "com.google.javascript.jscomp.JSError", "lineNumber", 1073741824);
            
            /* This test fails because method [com.google.javascript.jscomp.LightweightMessageFormatter.format] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.CompilerInput.getSourceFile(CompilerInput.java:117)
                com.google.javascript.jscomp.Compiler.getSourceFileByName(Compiler.java:1817)
                com.google.javascript.jscomp.Compiler.getSourceLine(Compiler.java:1826)
                com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt$1.get(SourceExcerptProvider.java:37)
                com.google.javascript.jscomp.LightweightMessageFormatter.format(LightweightMessageFormatter.java:70) */
            Class jSErrorType = Class.forName("com.google.javascript.jscomp.JSError");
            Class booleanType = boolean.class;
            Method formatMethod = lightweightMessageFormatterClazz.getDeclaredMethod("format", jSErrorType, booleanType);
            formatMethod.setAccessible(true);
            java.lang.Object[] formatMethodArguments = new java.lang.Object[2];
            formatMethodArguments[0] = jSError;
            formatMethodArguments[1] = false;
            try {
                formatMethod.invoke(lightweightMessageFormatter, formatMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(LightweightMessageFormatter.class, "excerptFormatter", prevExcerptFormatter);
        }
    }
    ///endregion
    
    ///region Errors report for format
    
    public void testFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields894402217694200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields894402217694200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass894402217718100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894402217694200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894402217718100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields894402218125600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields894402218125600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass894402218128100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894402218125600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894402218128100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields894402218908800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields894402218908800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass894402218911500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894402218908800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894402218911500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields894402219847800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields894402219847800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass894402219851200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields894402219847800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass894402219851200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

