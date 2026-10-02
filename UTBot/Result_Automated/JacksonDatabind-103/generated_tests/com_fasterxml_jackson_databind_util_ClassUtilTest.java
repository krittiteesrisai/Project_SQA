package com.fasterxml.jackson.databind.util;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.io.IOException;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import java.io.PrintWriter;
import com.fasterxml.jackson.core.io.IOContext;
import java.nio.charset.CharacterCodingException;
import java.util.zip.ZipInputStream;
import java.io.InvalidClassException;
import java.lang.reflect.Method;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.lang.reflect.Field;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import java.lang.annotation.RetentionPolicy;
import java.util.EnumSet;
import java.util.EnumMap;
import java.lang.annotation.Annotation;
import java.nio.file.FileSystemLoopException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import java.nio.file.NoSuchFileException;
import java.io.EOFException;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import java.util.Iterator;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_util_ClassUtilTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.rawClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rawClass(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#rawClass(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (t == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testRawClass_TEqualsNull() {
        Class actual = ClassUtil.rawClass(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#rawClass(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (t == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return t.getRawClass();}
 *  */
    @Test
    public void testRawClass_TNotEqualsNull() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        Class actual = ClassUtil.rawClass(resolvedRecursiveType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: g.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
 *  */
    @Test
    public void testCloseOnFailAndThrowAsIOE_ThrowNullPointerException() throws IOException  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE(ClassUtil.java:485) */
        ClassUtil.closeOnFailAndThrowAsIOE(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#disable(com.fasterxml.jackson.core.JsonGenerator.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#close()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonGeneratorImpl#close()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.WriterBasedJsonGenerator#_flushBuffer()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.WriterBasedJsonGenerator#_releaseBuffers()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#close()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfIOE(java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfIOE(java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: throw new RuntimeException(fail);
 *  */
    @Test(expected = RuntimeException.class)
    public void testCloseOnFailAndThrowAsIOE_ThrowRuntimeException() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -1090519038);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1090519038);
            
            ClassUtil.closeOnFailAndThrowAsIOE(writerBasedJsonGenerator, null);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception)}
     */
    @Test
    public void testCloseOnFailAndThrowAsIOEThrowsNPE() throws IOException  {
        Exception exception = new Exception();
        java.lang.StackTraceElement[] stackTraceElementArray = new java.lang.StackTraceElement[3];
        StackTraceElement stackTraceElement = new StackTraceElement("#$\\\"'", "10", "10", "", "-3", "abc", 0);
        stackTraceElementArray[0] = stackTraceElement;
        StackTraceElement stackTraceElement1 = new StackTraceElement("#$\\\"'", "10", "10", "", "-3", "abc", 0);
        stackTraceElementArray[1] = stackTraceElement1;
        StackTraceElement stackTraceElement2 = new StackTraceElement("#$\\\"'", "10", "10", "", "-3", "abc", 0);
        stackTraceElementArray[2] = stackTraceElement2;
        exception.setStackTrace(stackTraceElementArray);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE(ClassUtil.java:485) */
        ClassUtil.closeOnFailAndThrowAsIOE(null, exception);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    @Test
    public void testCloseOnFailAndThrowAsIOE1() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_managedResource", true);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext", _ioContext);
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE(ClassUtil.java:489) */
            ClassUtil.closeOnFailAndThrowAsIOE(writerBasedJsonGenerator, null);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    @Test
    public void testCloseOnFailAndThrowAsIOE2() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE(ClassUtil.java:489) */
            ClassUtil.closeOnFailAndThrowAsIOE(writerBasedJsonGenerator, null);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    
    @Test
    public void testCloseOnFailAndThrowAsIOE3() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
            char[] _charBuffer = new char[32];
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_charBuffer", _charBuffer);
            IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
            char[] _nameCopyBuffer = {
                '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                '\u0000'
            };
            setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_nameCopyBuffer", _nameCopyBuffer);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_ioContext", _ioContext);
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE(ClassUtil.java:489) */
            ClassUtil.closeOnFailAndThrowAsIOE(writerBasedJsonGenerator, null);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    @Test(expected = NumberFormatException.class)
    public void testCloseOnFailAndThrowAsIOE4() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
            NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
            
            ClassUtil.closeOnFailAndThrowAsIOE(writerBasedJsonGenerator, numberFormatException);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.lang.Exception)
    
    @Test(expected = CharacterCodingException.class)
    public void testCloseOnFailAndThrowAsIOE5() throws Exception  {
        Class generatorBaseClazz = Class.forName("com.fasterxml.jackson.core.base.GeneratorBase");
        int prevDERIVED_FEATURES_MASK = ((Integer) getStaticFieldValue(generatorBaseClazz, "DERIVED_FEATURES_MASK"));
        try {
            setStaticField(generatorBaseClazz, "DERIVED_FEATURES_MASK", 416);
            WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
            setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", Integer.MIN_VALUE);
            CharacterCodingException characterCodingException = ((CharacterCodingException) createInstance("java.nio.charset.CharacterCodingException"));
            
            ClassUtil.closeOnFailAndThrowAsIOE(writerBasedJsonGenerator, characterCodingException);
        } finally {
            setStaticField(com.fasterxml.jackson.core.base.GeneratorBase.class, "DERIVED_FEATURES_MASK", prevDERIVED_FEATURES_MASK);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIOE
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.io.Closeable,java.lang.Exception)}
 * @utbot.executesCondition {@code (toClose != null): True}
 * @utbot.invokes {@link java.io.Closeable#close()}
 * @utbot.throwsException {@link java.io.InvalidClassException} in: throwIfIOE(fail);
 *  */
    @Test(expected = InvalidClassException.class)
    public void testCloseOnFailAndThrowAsIOE_ThrowInvalidClassException() throws Throwable  {
        ZipInputStream zipInputStream = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(zipInputStream, "java.util.zip.ZipInputStream", "closed", true);
        InvalidClassException invalidClassException = ((InvalidClassException) createInstance("java.io.InvalidClassException"));
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class jsonGeneratorType = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        Class zipInputStreamType = Class.forName("java.io.Closeable");
        Class invalidClassExceptionType = Class.forName("java.lang.Exception");
        Method closeOnFailAndThrowAsIOEMethod = classUtilClazz.getDeclaredMethod("closeOnFailAndThrowAsIOE", jsonGeneratorType, zipInputStreamType, invalidClassExceptionType);
        closeOnFailAndThrowAsIOEMethod.setAccessible(true);
        java.lang.Object[] closeOnFailAndThrowAsIOEMethodArguments = new java.lang.Object[3];
        closeOnFailAndThrowAsIOEMethodArguments[0] = ((Object) null);
        closeOnFailAndThrowAsIOEMethodArguments[1] = zipInputStream;
        closeOnFailAndThrowAsIOEMethodArguments[2] = invalidClassException;
        try {
            closeOnFailAndThrowAsIOEMethod.invoke(null, closeOnFailAndThrowAsIOEMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.io.Closeable,java.lang.Exception)}
 * @utbot.executesCondition {@code (toClose != null): False}
 * @utbot.throwsException {@link java.lang.Exception} in: throwIfIOE(fail);
 *  */
    @Test(expected = Exception.class)
    public void testCloseOnFailAndThrowAsIOE_ThrowException() throws Exception  {
        InvalidPropertiesFormatException invalidPropertiesFormatException = ((InvalidPropertiesFormatException) createInstance("java.util.InvalidPropertiesFormatException"));
        
        ClassUtil.closeOnFailAndThrowAsIOE(null, null, invalidPropertiesFormatException);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.Exception)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator,java.io.Closeable,java.lang.Exception)}
 * @utbot.executesCondition {@code (g != null): False}
 * @utbot.executesCondition {@code (toClose != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfIOE(java.lang.Throwable)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: throwIfRTE(fail);
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCloseOnFailAndThrowAsIOE_ThrowNumberFormatException() throws Exception  {
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        ClassUtil.closeOnFailAndThrowAsIOE(null, null, numberFormatException);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method closeOnFailAndThrowAsIOE(com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.Exception)
    
    @Test(expected = RuntimeException.class)
    public void testCloseOnFailAndThrowAsIOE6() throws Exception  {
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        
        ClassUtil.closeOnFailAndThrowAsIOE(tokenBuffer, null, null);
    }
    
    @Test(expected = RuntimeException.class)
    public void testCloseOnFailAndThrowAsIOE7() throws IOException  {
        ClassUtil.closeOnFailAndThrowAsIOE(null, null, null);
    }
    ///endregion
    
    ///region Errors report for closeOnFailAndThrowAsIOE
    
    public void testCloseOnFailAndThrowAsIOE_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.nio.ByteBuffer java.util.zip.ZipUtils.defaultBuf accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findRawSuperTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findRawSuperTypes(java.lang.Class, java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findRawSuperTypes(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.executesCondition {@code (cls == endBefore): True}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testFindRawSuperTypes_ClsEqualsEndBefore() {
        Class class1 = Object.class;
        
        List actual = ClassUtil.findRawSuperTypes(class1, class1, false);
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findRawSuperTypes(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.executesCondition {@code (cls == endBefore): False}
 * @utbot.executesCondition {@code (cls): True}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testFindRawSuperTypes_Cls() {
        Class class1 = Object.class;
        
        List actual = ClassUtil.findRawSuperTypes(class1, null, false);
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findRawSuperTypes(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testFindRawSuperTypes_ClsEqualsNull() {
        List actual = ClassUtil.findRawSuperTypes(null, null, false);
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSuperTypes(java.lang.Class, java.lang.Class, java.util.List)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperTypes(java.lang.Class,java.lang.Class,java.util.List)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindSuperTypes_ReturnResult() {
        Class class1 = Object.class;
        
        List actual = ClassUtil.findSuperTypes(((Class) null), class1, ((List) null));
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperTypes(java.lang.Class,java.lang.Class,java.util.List)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindSuperTypes_ReturnResult_1() {
        Class class1 = Object.class;
        
        List actual = ClassUtil.findSuperTypes(class1, ((Class) null), ((List) null));
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findSuperTypes(java.lang.Class, java.lang.Class, java.util.List)
    
    @Test
    public void testFindSuperTypes1() {
        Class class1 = Object.class;
        ArrayList arrayList = new ArrayList();
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(class1, class1, arrayList));
        
        assertTrue(deepEquals(arrayList, actual));
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSuperTypes(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperTypes(java.lang.Class,java.lang.Class)}
 * @utbot.returnsFrom {@code return findSuperTypes(cls, endBefore, new ArrayList<Class<?>>(8));}
 *  */
    @Test
    public void testFindSuperTypes_ReturnFindSuperTypes() {
        Class class1 = Object.class;
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(null, class1));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperTypes(java.lang.Class,java.lang.Class)}
 * @utbot.returnsFrom {@code return findSuperTypes(cls, endBefore, new ArrayList<Class<?>>(8));}
 *  */
    @Test
    public void testFindSuperTypes_ReturnFindSuperTypes_1() {
        Class class1 = Object.class;
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(class1, null));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findSuperTypes(java.lang.Class, java.lang.Class)
    
    @Test
    public void testFindSuperTypes2() {
        Class class1 = Object.class;
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(class1, class1));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findSuperTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSuperTypes(com.fasterxml.jackson.databind.JavaType, java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperTypes(com.fasterxml.jackson.databind.JavaType,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testFindSuperTypes_TypeEqualsNull() {
        List actual = ClassUtil.findSuperTypes(((JavaType) null), ((Class) null), false);
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperTypes(com.fasterxml.jackson.databind.JavaType,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (type.hasRawClass(endBefore)): True}
 * @utbot.executesCondition {@code (type.hasRawClass(Object.class)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hasRawClass(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hasRawClass(java.lang.Class)}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testFindSuperTypes_TypeHasRawClass() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        List actual = ClassUtil.findSuperTypes(resolvedRecursiveType, ((Class) null), false);
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialResolvedRecursiveType_class == finalResolvedRecursiveType_class);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findSuperTypes(com.fasterxml.jackson.databind.JavaType, java.lang.Class, boolean)
    
    @Test
    public void testFindSuperTypes3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        List actual = ClassUtil.findSuperTypes(simpleType, _class, true);
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        com.fasterxml.jackson.databind.JavaType[] simpleType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalSimpleType_superInterfaces0 = ((JavaType) get(simpleType_superInterfaces, 0));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class final_class = _class;
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
        
        assertNull(finalSimpleType_superInterfaces0);
        
    }
    
    @Test
    public void testFindSuperTypes4() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = new com.fasterxml.jackson.databind.JavaType[1];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _superInterfaces[0] = ((JavaType) resolvedRecursiveType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        
        com.fasterxml.jackson.databind.JavaType[] collectionLikeType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType collectionLikeType_superInterfaces_superInterfaces0 = ((JavaType) get(collectionLikeType_superInterfaces, 0));
        Class initialCollectionLikeType_superInterfaces0_class = ((Class) getFieldValue(collectionLikeType_superInterfaces_superInterfaces0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(collectionLikeType, _class, false));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        com.fasterxml.jackson.databind.JavaType[] collectionLikeType_superInterfaces1 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType collectionLikeType_superInterfaces1_superInterfaces0 = ((JavaType) get(collectionLikeType_superInterfaces1, 0));
        Class finalCollectionLikeType_superInterfaces0_class = ((Class) getFieldValue(collectionLikeType_superInterfaces1_superInterfaces0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class final_class = _class;
        
        assertFalse(initialCollectionLikeType_superInterfaces0_class == finalCollectionLikeType_superInterfaces0_class);
        
    }
    
    @Test
    public void testFindSuperTypes5() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _referencedType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        Class class1 = Object.class;
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(resolvedRecursiveType, class1, false));
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
        
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalResolvedRecursiveType_superInterfaces0 = ((JavaType) get(resolvedRecursiveType_superInterfaces, 0));
        
        Class finalClass1 = class1;
        
        assertNull(finalResolvedRecursiveType_superInterfaces0);
        
    }
    
    @Test
    public void testFindSuperTypes6() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = new com.fasterxml.jackson.databind.JavaType[1];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        _superInterfaces[0] = ((JavaType) resolvedRecursiveType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        Class class1 = Object.class;
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(collectionLikeType, class1, false));
        
        ArrayList expected = new ArrayList();
        expected.add(resolvedRecursiveType);
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testFindSuperTypes7() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        Class class1 = Object.class;
        
        ArrayList actual = ((ArrayList) ClassUtil.findSuperTypes(mapLikeType, class1, true));
        
        ArrayList expected = new ArrayList();
        expected.add(mapLikeType);
        
        assertTrue(deepEquals(expected, actual));
        
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces0 = ((JavaType) get(mapLikeType_superInterfaces, 0));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces1 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces1 = ((JavaType) get(mapLikeType_superInterfaces1, 1));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces2 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces2 = ((JavaType) get(mapLikeType_superInterfaces2, 2));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces3 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces3 = ((JavaType) get(mapLikeType_superInterfaces3, 3));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces4 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces4 = ((JavaType) get(mapLikeType_superInterfaces4, 4));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces5 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces5 = ((JavaType) get(mapLikeType_superInterfaces5, 5));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces6 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces6 = ((JavaType) get(mapLikeType_superInterfaces6, 6));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces7 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces7 = ((JavaType) get(mapLikeType_superInterfaces7, 7));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_superInterfaces8 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_superInterfaces8 = ((JavaType) get(mapLikeType_superInterfaces8, 8));
        
        Class finalClass1 = class1;
        
        assertNull(finalMapLikeType_superInterfaces0);
        
        assertNull(finalMapLikeType_superInterfaces1);
        
        assertNull(finalMapLikeType_superInterfaces2);
        
        assertNull(finalMapLikeType_superInterfaces3);
        
        assertNull(finalMapLikeType_superInterfaces4);
        
        assertNull(finalMapLikeType_superInterfaces5);
        
        assertNull(finalMapLikeType_superInterfaces6);
        
        assertNull(finalMapLikeType_superInterfaces7);
        
        assertNull(finalMapLikeType_superInterfaces8);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.throwIfRTE
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method throwIfRTE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowIfRTE_NotTNotInstanceOfRuntimeException() {
        Throwable actual = ClassUtil.throwIfRTE(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwIfRTE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfRTE(java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void testThrowIfRTE_ThrowNumberFormatException() throws Exception  {
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        ClassUtil.throwIfRTE(numberFormatException);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil._addRawSuperTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addRawSuperTypes(java.lang.Class, java.lang.Class, java.util.Collection, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#_addRawSuperTypes(java.lang.Class,java.lang.Class,java.util.Collection,boolean)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.returnsFrom {@code {
 *     return;
 * }}
 *  */
    @Test
    public void test_addRawSuperTypes_ClsNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class class1Type = Class.forName("java.lang.Class");
        Class collectionType = Class.forName("java.util.Collection");
        Class booleanType = boolean.class;
        Method _addRawSuperTypesMethod = classUtilClazz.getDeclaredMethod("_addRawSuperTypes", class1Type, class1Type, collectionType, booleanType);
        _addRawSuperTypesMethod.setAccessible(true);
        java.lang.Object[] _addRawSuperTypesMethodArguments = new java.lang.Object[4];
        _addRawSuperTypesMethodArguments[0] = class1;
        _addRawSuperTypesMethodArguments[1] = ((Object) null);
        _addRawSuperTypesMethodArguments[2] = ((Object) null);
        _addRawSuperTypesMethodArguments[3] = false;
        _addRawSuperTypesMethod.invoke(null, _addRawSuperTypesMethodArguments);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#_addRawSuperTypes(java.lang.Class,java.lang.Class,java.util.Collection,boolean)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code {
 *     return;
 * }}
 *  */
    @Test
    public void test_addRawSuperTypes_ClsEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class classType = Class.forName("java.lang.Class");
        Class collectionType = Class.forName("java.util.Collection");
        Class booleanType = boolean.class;
        Method _addRawSuperTypesMethod = classUtilClazz.getDeclaredMethod("_addRawSuperTypes", classType, classType, collectionType, booleanType);
        _addRawSuperTypesMethod.setAccessible(true);
        java.lang.Object[] _addRawSuperTypesMethodArguments = new java.lang.Object[4];
        _addRawSuperTypesMethodArguments[0] = ((Object) null);
        _addRawSuperTypesMethodArguments[1] = class1;
        _addRawSuperTypesMethodArguments[2] = ((Object) null);
        _addRawSuperTypesMethodArguments[3] = false;
        _addRawSuperTypesMethod.invoke(null, _addRawSuperTypesMethodArguments);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addRawSuperTypes(java.lang.Class, java.lang.Class, java.util.Collection, boolean)
    
    @Test
    public void test_addRawSuperTypes1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class class1Type = Class.forName("java.lang.Class");
        Class collectionType = Class.forName("java.util.Collection");
        Class booleanType = boolean.class;
        Method _addRawSuperTypesMethod = classUtilClazz.getDeclaredMethod("_addRawSuperTypes", class1Type, class1Type, collectionType, booleanType);
        _addRawSuperTypesMethod.setAccessible(true);
        java.lang.Object[] _addRawSuperTypesMethodArguments = new java.lang.Object[4];
        _addRawSuperTypesMethodArguments[0] = class1;
        _addRawSuperTypesMethodArguments[1] = class1;
        _addRawSuperTypesMethodArguments[2] = ((Object) null);
        _addRawSuperTypesMethodArguments[3] = false;
        _addRawSuperTypesMethod.invoke(null, _addRawSuperTypesMethodArguments);
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isBogusClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBogusClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isBogusClass(java.lang.Class)}
 * @utbot.returnsFrom {@code return (cls == Void.class || cls == Void.TYPE || cls == com.fasterxml.jackson.databind.annotation.NoClass.class);}
 *  */
    @Test
    public void testIsBogusClass_ClsEqualsVoidClassOrClsEqualsVoidTYPEOrClsEqualsComFasterxmlJacksonDatabindAnnotationNoClassClass() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtil.isBogusClass(class1);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.throwIfError
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method throwIfError(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfError(java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowIfError_NotTNotInstanceOfError() {
        Throwable actual = ClassUtil.throwIfError(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwIfError(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfError(java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void testThrowIfError_ThrowError() throws Exception  {
        Error error = ((Error) createInstance("java.lang.Error"));
        
        ClassUtil.throwIfError(error);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findSuperClasses
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findSuperClasses(java.lang.Class, java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperClasses(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (cls != null): True}
 * @utbot.executesCondition {@code (cls != endBefore): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindSuperClasses_ClsEqualsEndBefore() {
        Class class1 = Object.class;
        
        LinkedList actual = ((LinkedList) ClassUtil.findSuperClasses(class1, class1, false));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
        Class finalClass11 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findSuperClasses(java.lang.Class,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (cls != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testFindSuperClasses_ClsEqualsNull() {
        LinkedList actual = ((LinkedList) ClassUtil.findSuperClasses(null, null, false));
        
        LinkedList expected = new LinkedList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isProxyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isProxyType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isProxyType(java.lang.Class)}
 * @utbot.executesCondition {@code (name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.")): True}
 * @utbot.executesCondition {@code (name.startsWith("org.hibernate.proxy.")): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsProxyType_NotNameStartsWith() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtil.isProxyType(class1);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isProxyType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isProxyType(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = type.getName();
 *  */
    @Test
    public void testIsProxyType_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.isProxyType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isProxyType(ClassUtil.java:241) */
        ClassUtil.isProxyType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.hasGetterSignature
    
    ///region Errors report for hasGetterSignature
    
    public void testHasGetterSignature_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.canBeABeanType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBeABeanType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#canBeABeanType(java.lang.Class)}
 * @utbot.executesCondition {@code (type.isAnnotation()): True}
 * @utbot.invokes {@link java.lang.Class#isAnnotation()}
 * @utbot.returnsFrom {@code return "annotation";}
 *  */
    @Test
    public void testCanBeABeanType_TypeIsAnnotation() {
        Class class1 = Object.class;
        
        String actual = ClassUtil.canBeABeanType(class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canBeABeanType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#canBeABeanType(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAnnotation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isAnnotation()
 *  */
    @Test
    public void testCanBeABeanType_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.canBeABeanType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.canBeABeanType(ClassUtil.java:162) */
        ClassUtil.canBeABeanType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.throwAsIAE
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method throwAsIAE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsIAE(java.lang.Throwable)}
 * @utbot.invokes {@link java.lang.Throwable#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throwAsIAE(t, t.getMessage());
 *  */
    @Test
    public void testThrowAsIAE_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.throwAsIAE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.throwAsIAE(ClassUtil.java:422) */
        ClassUtil.throwAsIAE(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwAsIAE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsIAE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: throwAsIAE(t, t.getMessage());
 *  */
    @Test(expected = NumberFormatException.class)
    public void testThrowAsIAE_ThrowNumberFormatException() throws Exception  {
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        ClassUtil.throwAsIAE(numberFormatException);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsIAE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throwAsIAE(t, t.getMessage());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testThrowAsIAE_ThrowIllegalArgumentException() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        ClassUtil.throwAsIAE(cloneNotSupportedException);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsIAE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.AssertionError} in: throwAsIAE(t, t.getMessage());
 *  */
    @Test
    public void testThrowAsIAE_ThrowAssertionError() throws Exception  {
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.throwAsIAE] produces [java.lang.AssertionError] */
        ClassUtil.throwAsIAE(assertionError);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwAsIAE(java.lang.Throwable)
    
    @Test(expected = NullPointerException.class)
    public void testThrowAsIAE1() throws Exception  {
        NullPointerException nullPointerException = ((NullPointerException) createInstance("java.lang.NullPointerException"));
        String detailMessage = "";
        setField(nullPointerException, "java.lang.Throwable", "detailMessage", detailMessage);
        
        ClassUtil.throwAsIAE(nullPointerException);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.throwAsIAE
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwAsIAE(java.lang.Throwable, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsIAE(java.lang.Throwable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: throwIfRTE(t);
 *  */
    @Test(expected = NumberFormatException.class)
    public void testThrowAsIAE_ThrowNumberFormatException1() throws Exception  {
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        
        ClassUtil.throwAsIAE(numberFormatException, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsIAE(java.lang.Throwable,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfError(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException(msg, t);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testThrowAsIAE_ThrowIllegalArgumentException1() {
        ClassUtil.throwAsIAE(null, null);
    }
    ///endregion
    
    ///region Errors report for throwAsIAE
    
    public void testThrowAsIAE_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isLocalType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLocalType(java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isLocalType(java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (!allowNonStatic): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIsLocalType_AllowNonStatic() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            String actual = ClassUtil.isLocalType(clsObject, true);
            
            assertNull(actual);
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isLocalType(java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (!allowNonStatic): True}
 * @utbot.executesCondition {@code (!Modifier.isStatic(type.getModifiers())): False}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.invokes {@link java.lang.reflect.Modifier#isStatic(int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testIsLocalType_ModifierIsStatic() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            String actual = ClassUtil.isLocalType(clsObject, false);
            
            assertNull(actual);
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.throwIfIOE
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method throwIfIOE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfIOE(java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof IOException): False}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testThrowIfIOE_NotTNotInstanceOfIOException() throws IOException  {
        Throwable actual = ClassUtil.throwIfIOE(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method throwIfIOE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwIfIOE(java.lang.Throwable)}
 * @utbot.executesCondition {@code (t instanceof IOException): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonProcessingException} when: t instanceof IOException
 *  */
    @Test(expected = JsonProcessingException.class)
    public void testThrowIfIOE_ThrowJsonProcessingException() throws Exception  {
        JsonProcessingException jsonProcessingException = ((JsonProcessingException) createInstance("com.fasterxml.jackson.core.JsonProcessingException"));
        
        ClassUtil.throwIfIOE(jsonProcessingException);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isConcrete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isConcrete(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isConcrete(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.returnsFrom {@code return (mod & (Modifier.INTERFACE | Modifier.ABSTRACT)) == 0;}
 *  */
    @Test
    public void testIsConcrete_ModBitwiseAndModifierINTERFACEBitwiseOrModifierABSTRACTEqualsZero() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtil.isConcrete(class1);
        
        assertTrue(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isConcrete(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isConcrete(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int mod = type.getModifiers();
 *  */
    @Test
    public void testIsConcrete_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.isConcrete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isConcrete(ClassUtil.java:257) */
        ClassUtil.isConcrete(((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isConcrete
    
    ///region Errors report for isConcrete
    
    public void testIsConcrete_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyMustOverride(java.lang.Class, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#verifyMustOverride(java.lang.Class,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (instance.getClass() != expType): True}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.String#format(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: instance.getClass() != expType
 *  */
    @Test
    public void testVerifyMustOverride_ThrowNullPointerException_1() {
        byte[] byteArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride(ClassUtil.java:310) */
        ClassUtil.verifyMustOverride(null, byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#verifyMustOverride(java.lang.Class,java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: instance.getClass() != expType
 *  */
    @Test
    public void testVerifyMustOverride_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.verifyMustOverride(ClassUtil.java:307) */
        ClassUtil.verifyMustOverride(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyMustOverride(java.lang.Class, java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#verifyMustOverride(java.lang.Class,java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (instance.getClass() != expType): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVerifyMustOverride_ThrowIllegalStateException() {
        Class class1 = Object.class;
        byte[] byteArray = {};
        
        ClassUtil.verifyMustOverride(class1, byteArray, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil._addSuperTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addSuperTypes(com.fasterxml.jackson.databind.JavaType, java.lang.Class, java.util.Collection, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#_addSuperTypes(com.fasterxml.jackson.databind.JavaType,java.lang.Class,java.util.Collection,boolean)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_addSuperTypes_TypeEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class classType = Class.forName("java.lang.Class");
        Class collectionType = Class.forName("java.util.Collection");
        Class booleanType = boolean.class;
        Method _addSuperTypesMethod = classUtilClazz.getDeclaredMethod("_addSuperTypes", javaTypeType, classType, collectionType, booleanType);
        _addSuperTypesMethod.setAccessible(true);
        java.lang.Object[] _addSuperTypesMethodArguments = new java.lang.Object[4];
        _addSuperTypesMethodArguments[0] = ((Object) null);
        _addSuperTypesMethodArguments[1] = ((Object) null);
        _addSuperTypesMethodArguments[2] = ((Object) null);
        _addSuperTypesMethodArguments[3] = false;
        _addSuperTypesMethod.invoke(null, _addSuperTypesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#_addSuperTypes(com.fasterxml.jackson.databind.JavaType,java.lang.Class,java.util.Collection,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (cls == endBefore): False}
 * @utbot.executesCondition {@code (cls): True}
 * @utbot.returnsFrom {@code {
 *     return;
 * }}
 *  */
    @Test
    public void test_addSuperTypes_Cls() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class simpleTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class classType = Class.forName("java.lang.Class");
        Class collectionType = Class.forName("java.util.Collection");
        Class booleanType = boolean.class;
        Method _addSuperTypesMethod = classUtilClazz.getDeclaredMethod("_addSuperTypes", simpleTypeType, classType, collectionType, booleanType);
        _addSuperTypesMethod.setAccessible(true);
        java.lang.Object[] _addSuperTypesMethodArguments = new java.lang.Object[4];
        _addSuperTypesMethodArguments[0] = simpleType;
        _addSuperTypesMethodArguments[1] = ((Object) null);
        _addSuperTypesMethodArguments[2] = ((Object) null);
        _addSuperTypesMethodArguments[3] = false;
        _addSuperTypesMethod.invoke(null, _addSuperTypesMethodArguments);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#_addSuperTypes(com.fasterxml.jackson.databind.JavaType,java.lang.Class,java.util.Collection,boolean)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (cls == endBefore): True}
 * @utbot.returnsFrom {@code {
 *     return;
 * }}
 *  */
    @Test
    public void test_addSuperTypes_ClsEqualsEndBefore() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class simpleTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Class classType = Class.forName("java.lang.Class");
        Class collectionType = Class.forName("java.util.Collection");
        Class booleanType = boolean.class;
        Method _addSuperTypesMethod = classUtilClazz.getDeclaredMethod("_addSuperTypes", simpleTypeType, classType, collectionType, booleanType);
        _addSuperTypesMethod.setAccessible(true);
        java.lang.Object[] _addSuperTypesMethodArguments = new java.lang.Object[4];
        _addSuperTypesMethodArguments[0] = simpleType;
        _addSuperTypesMethodArguments[1] = ((Object) null);
        _addSuperTypesMethodArguments[2] = ((Object) null);
        _addSuperTypesMethodArguments[3] = false;
        _addSuperTypesMethod.invoke(null, _addSuperTypesMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.hasClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasClass(java.lang.Object, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#hasClass(java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return (inst != null) && (inst.getClass() == raw);}
 *  */
    @Test
    public void testHasClass_InstEqualsNullAndInstGetClassEqualsRaw_1() {
        byte[] byteArray = {};
        Class class1 = Object.class;
        
        boolean actual = ClassUtil.hasClass(byteArray, class1);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#hasClass(java.lang.Object,java.lang.Class)}
 * @utbot.returnsFrom {@code return (inst != null) && (inst.getClass() == raw);}
 *  */
    @Test
    public void testHasClass_InstEqualsNullAndInstGetClassEqualsRaw() {
        boolean actual = ClassUtil.hasClass(null, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess
    
    ///region Errors report for checkAndFixAccess
    
    public void testCheckAndFixAccess_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkAndFixAccess(java.lang.reflect.Member)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#checkAndFixAccess(java.lang.reflect.Member)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#checkAndFixAccess(java.lang.reflect.Member,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: checkAndFixAccess(member, false);
 *  */
    @Test
    public void testCheckAndFixAccess_ThrowClassCastException() throws Throwable  {
        Object memberName = createInstance("java.lang.invoke.MemberName");
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess] produces [java.lang.ClassCastException: class java.lang.invoke.MemberName cannot be cast to class java.lang.reflect.AccessibleObject (java.lang.invoke.MemberName and java.lang.reflect.AccessibleObject are in module java.base of loader 'bootstrap')]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:897)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:880) */
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class memberNameType = Class.forName("java.lang.reflect.Member");
        Method checkAndFixAccessMethod = classUtilClazz.getDeclaredMethod("checkAndFixAccess", memberNameType);
        checkAndFixAccessMethod.setAccessible(true);
        java.lang.Object[] checkAndFixAccessMethodArguments = new java.lang.Object[1];
        checkAndFixAccessMethodArguments[0] = memberName;
        try {
            checkAndFixAccessMethod.invoke(null, checkAndFixAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method checkAndFixAccess(java.lang.reflect.Member)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#checkAndFixAccess(java.lang.reflect.Member)}
     */
    @Test
    public void testCheckAndFixAccessThrowsNPE() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:905)
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:880) */
        ClassUtil.checkAndFixAccess(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.nameOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nameOf(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nameOf(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): False}
 * @utbot.iterates iterate the loop {@code while(cls.isArray())} once
 *  */
    @Test
    public void testNameOf_ClsIsArray() {
        Class class1 = Object.class;
        
        String actual = ClassUtil.nameOf(class1);
        
        String expected = "`java.lang.Object`";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nameOf(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == null): True}
 * @utbot.returnsFrom {@code return "[null]";}
 *  */
    @Test
    public void testNameOf_ClsEqualsNull() {
        String actual = ClassUtil.nameOf(((Class) null));
        
        String expected = "[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.nameOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nameOf(com.fasterxml.jackson.databind.util.Named)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nameOf(com.fasterxml.jackson.databind.util.Named)}
 * @utbot.executesCondition {@code (named == null): True}
 * @utbot.returnsFrom {@code return "[null]";}
 *  */
    @Test
    public void testNameOf_NamedEqualsNull() {
        String actual = ClassUtil.nameOf(((Named) null));
        
        String expected = "[null]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nameOf(com.fasterxml.jackson.databind.util.Named)}
 * @utbot.executesCondition {@code (named == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.Named#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#backticked(java.lang.String)}
 * @utbot.returnsFrom {@code return backticked(named.getName());}
 *  */
    @Test
    public void testNameOf_NamedNotEqualsNull() throws Exception  {
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.util.Named");
        Method nameOfMethod = classUtilClazz.getDeclaredMethod("nameOf", singleViewType);
        nameOfMethod.setAccessible(true);
        java.lang.Object[] nameOfMethodArguments = new java.lang.Object[1];
        nameOfMethodArguments[0] = singleView;
        String actual = ((String) nameOfMethod.invoke(null, nameOfMethodArguments));
        
        String expected = "[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nameOf(com.fasterxml.jackson.databind.util.Named)
    
    @Test
    public void testNameOf1() throws Exception  {
        MapProperty mapProperty = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        Integer _key = 177;
        setField(mapProperty, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_key", _key);
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class mapPropertyType = Class.forName("com.fasterxml.jackson.databind.util.Named");
        Method nameOfMethod = classUtilClazz.getDeclaredMethod("nameOf", mapPropertyType);
        nameOfMethod.setAccessible(true);
        java.lang.Object[] nameOfMethodArguments = new java.lang.Object[1];
        nameOfMethodArguments[0] = mapProperty;
        String actual = ((String) nameOfMethod.invoke(null, nameOfMethodArguments));
        
        String expected = "`177`";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNameOf2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class beanPropertyWriterType = Class.forName("com.fasterxml.jackson.databind.util.Named");
        Method nameOfMethod = classUtilClazz.getDeclaredMethod("nameOf", beanPropertyWriterType);
        nameOfMethod.setAccessible(true);
        java.lang.Object[] nameOfMethodArguments = new java.lang.Object[1];
        nameOfMethodArguments[0] = beanPropertyWriter;
        String actual = ((String) nameOfMethod.invoke(null, nameOfMethodArguments));
        
        String expected = "`\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000`";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.hasEnclosingMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasEnclosingMethod(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#hasEnclosingMethod(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isObjectOrPrimitive(java.lang.Class)}
 * @utbot.returnsFrom {@code return !isObjectOrPrimitive(cls) && (cls.getEnclosingMethod() != null);}
 *  */
    @Test
    public void testHasEnclosingMethod_NotIsObjectOrPrimitiveAndClsGetEnclosingMethodNotEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            boolean actual = ClassUtil.hasEnclosingMethod(clsObject);
            
            assertFalse(actual);
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.backticked
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method backticked(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#backticked(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return new StringBuilder(text.length() + 2).append('`').append(text).append('`').toString();}
 *  */
    @Test
    public void testBackticked_TextNotEqualsNull() {
        String string = "  ";
        
        String actual = ClassUtil.backticked(string);
        
        String expected = "`  `";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#backticked(java.lang.String)}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.returnsFrom {@code return "[null]";}
 *  */
    @Test
    public void testBackticked_TextEqualsNull() {
        String actual = ClassUtil.backticked(null);
        
        String expected = "[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.quotedOr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method quotedOr(java.lang.Object, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#quotedOr(java.lang.Object,java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return forNull;}
 *  */
    @Test
    public void testQuotedOr_StrEqualsNull() {
        String actual = ClassUtil.quotedOr(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method quotedOr(java.lang.Object, java.lang.String)
    
    @Test
    public void testQuotedOr1() {
        Object object = new Object();
        
        String actual = ClassUtil.quotedOr(object, null);
        
        String expected = "\"java.lang.Object@70782828\"";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isJacksonStdImpl(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isJacksonStdImpl(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (implClass.getAnnotation(JacksonStdImpl.class) != null);
 *  */
    @Test
    public void testIsJacksonStdImpl_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl(ClassUtil.java:1040) */
        ClassUtil.isJacksonStdImpl(((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isJacksonStdImpl(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isJacksonStdImpl(java.lang.Object)}
 * @utbot.returnsFrom {@code return (impl == null) || isJacksonStdImpl(impl.getClass());}
 *  */
    @Test
    public void testIsJacksonStdImpl_ImplEqualsNullOrIsJacksonStdImpl() {
        boolean actual = ClassUtil.isJacksonStdImpl(((Object) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.classOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method classOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#classOf(java.lang.Object)}
 * @utbot.executesCondition {@code (inst == null): False}
 * @utbot.returnsFrom {@code return inst.getClass();}
 *  */
    @Test
    public void testClassOf_InstNotEqualsNull() {
        byte[] byteArray = {};
        
        Class actual = ClassUtil.classOf(byteArray);
        
        Class expected = byte[].class;
        
        assertEquals(Class.class, actual.getClass());
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#classOf(java.lang.Object)}
 * @utbot.executesCondition {@code (inst == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClassOf_InstEqualsNull() {
        Class actual = ClassUtil.classOf(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getClassMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassMethods(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getClassMethods(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#getDeclaredMethods(java.lang.Class)}
 *  */
    @Test
    public void testGetClassMethods_ClassUtilGetDeclaredMethods() throws Exception  {
        Class class1 = Object.class;
        
        java.lang.reflect.Method[] actual = ClassUtil.getClassMethods(class1);
        
        java.lang.reflect.Method[] expected = new java.lang.reflect.Method[11];
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        expected[0] = method;
        Method method1 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[1] = method1;
        Method method2 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[2] = method2;
        Method method3 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[3] = method3;
        Method method4 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[4] = method4;
        Method method5 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[5] = method5;
        Method method6 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[6] = method6;
        Method method7 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[7] = method7;
        Method method8 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[8] = method8;
        Method method9 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[9] = method9;
        Method method10 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[10] = method10;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.nullOrToString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nullOrToString(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nullOrToString(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNullOrToString_ValueEqualsNull() {
        String actual = ClassUtil.nullOrToString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nullOrToString(java.lang.Object)}
 * @utbot.executesCondition {@code (value == null): False}
 * @utbot.invokes {@link java.lang.Object#toString()}
 * @utbot.returnsFrom {@code return value.toString();}
 *  */
    @Test
    public void testNullOrToString_ValueNotEqualsNull() {
        Integer integer = Integer.MIN_VALUE;
        
        String actual = ClassUtil.nullOrToString(integer);
        
        String expected = "-2147483648";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findEnumType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEnumType(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findEnumType(java.lang.Enum)}
 * @utbot.executesCondition {@code (ec.getSuperclass()): True}
 * @utbot.invokes {@link java.lang.Class#getSuperclass()}
 * @utbot.invokes {@link java.lang.Class#getSuperclass()}
 * @utbot.returnsFrom {@code return (Class<? extends Enum<?>>) ec;}
 *  */
    @Test
    public void testFindEnumType_EcGetSuperclass() {
        RetentionPolicy retentionPolicy = RetentionPolicy.SOURCE;
        
        Class actual = ClassUtil.findEnumType(retentionPolicy);
        
        Class expected = RetentionPolicy.class;
        
        assertEquals(Class.class, actual.getClass());
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnumType(java.lang.Enum)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findEnumType(java.lang.Enum)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> ec = en.getClass();
 *  */
    @Test
    public void testFindEnumType_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.findEnumType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(ClassUtil.java:966) */
        ClassUtil.findEnumType(((Enum) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findEnumType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findEnumType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findEnumType(java.lang.Class)}
 * @utbot.executesCondition {@code (cls.getSuperclass()): True}
 * @utbot.invokes {@link java.lang.Class#getSuperclass()}
 * @utbot.invokes {@link java.lang.Class#getSuperclass()}
 * @utbot.returnsFrom {@code return (Class<? extends Enum<?>>) cls;}
 *  */
    @Test
    public void testFindEnumType_ClsGetSuperclass() {
        Class class1 = Object.class;
        
        Class actual = ClassUtil.findEnumType(class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnumType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findEnumType(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getSuperclass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cls.getSuperclass() != Enum.class
 *  */
    @Test
    public void testFindEnumType_ThrowNullPointerException1() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.findEnumType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(ClassUtil.java:983) */
        ClassUtil.findEnumType(((Class) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findEnumType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnumType(java.util.EnumSet)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findEnumType(java.util.EnumSet)}
 * @utbot.invokes {@link java.util.EnumSet#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !s.isEmpty()
 *  */
    @Test
    public void testFindEnumType_ThrowNullPointerException2() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.findEnumType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(ClassUtil.java:934) */
        ClassUtil.findEnumType(((EnumSet) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findEnumType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findEnumType(java.util.EnumMap)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findEnumType(java.util.EnumMap)}
 * @utbot.invokes {@link java.util.EnumMap#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !m.isEmpty()
 *  */
    @Test
    public void testFindEnumType_ThrowNullPointerException3() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.findEnumType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.findEnumType(ClassUtil.java:949) */
        ClassUtil.findEnumType(((EnumMap) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.classNameOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method classNameOf(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#classNameOf(java.lang.Object)}
 * @utbot.executesCondition {@code (inst == null): False}
 *  */
    @Test
    public void testClassNameOf_InstNotEqualsNull_1() {
        byte[] byteArray = {};
        
        String actual = ClassUtil.classNameOf(byteArray);
        
        String expected = "`byte[]`";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#classNameOf(java.lang.Object)}
 * @utbot.executesCondition {@code (inst == null): True}
 * @utbot.returnsFrom {@code return "[null]";}
 *  */
    @Test
    public void testClassNameOf_InstEqualsNull() {
        String actual = ClassUtil.classNameOf(null);
        
        String expected = "[null]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#classNameOf(java.lang.Object)}
 * @utbot.executesCondition {@code (inst == null): False}
 *  */
    @Test
    public void testClassNameOf_InstNotEqualsNull() {
        Object object = new Object();
        
        String actual = ClassUtil.classNameOf(object);
        
        String expected = "`java.lang.Object`";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil._interfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _interfaces(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#_interfaces(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getInterfaces()}
 * @utbot.returnsFrom {@code return cls.getInterfaces();}
 *  */
    @Test
    public void test_interfaces_ClassGetInterfaces() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class class1 = Object.class;
        
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class class1Type = Class.forName("java.lang.Class");
        Method _interfacesMethod = classUtilClazz.getDeclaredMethod("_interfaces", class1Type);
        _interfacesMethod.setAccessible(true);
        java.lang.Object[] _interfacesMethodArguments = new java.lang.Object[1];
        _interfacesMethodArguments[0] = class1;
        java.lang.Class[] actual = ((java.lang.Class[]) _interfacesMethod.invoke(null, _interfacesMethodArguments));
        
        java.lang.Class[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _interfaces(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#_interfaces(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cls.getInterfaces();
 *  */
    @Test
    public void test_interfaces_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil._interfaces] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil._interfaces(ClassUtil.java:1172) */
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class classType = Class.forName("java.lang.Class");
        Method _interfacesMethod = classUtilClazz.getDeclaredMethod("_interfaces", classType);
        _interfacesMethod.setAccessible(true);
        java.lang.Object[] _interfacesMethodArguments = new java.lang.Object[1];
        _interfacesMethodArguments[0] = ((Object) null);
        try {
            _interfacesMethod.invoke(null, _interfacesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isObjectOrPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isObjectOrPrimitive(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isObjectOrPrimitive(java.lang.Class)}
 * @utbot.returnsFrom {@code return (cls == CLS_OBJECT) || cls.isPrimitive();}
 *  */
    @Test
    public void testIsObjectOrPrimitive_ClsEqualsCLS_OBJECTOrClsIsPrimitive() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            boolean actual = ClassUtil.isObjectOrPrimitive(clsObject);
            
            assertTrue(actual);
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isObjectOrPrimitive(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isObjectOrPrimitive(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (cls == CLS_OBJECT) || cls.isPrimitive();
 *  */
    @Test
    public void testIsObjectOrPrimitive_ThrowNullPointerException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.isObjectOrPrimitive] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.ClassUtil.isObjectOrPrimitive(ClassUtil.java:289) */
            ClassUtil.isObjectOrPrimitive(null);
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isCollectionMapOrArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCollectionMapOrArray(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isCollectionMapOrArray(java.lang.Class)}
 * @utbot.executesCondition {@code (type.isArray()): True}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 *  */
    @Test
    public void testIsCollectionMapOrArray_TypeIsArray() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtil.isCollectionMapOrArray(class1);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isCollectionMapOrArray(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isCollectionMapOrArray(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isArray()
 *  */
    @Test
    public void testIsCollectionMapOrArray_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.isCollectionMapOrArray] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isCollectionMapOrArray(ClassUtil.java:269) */
        ClassUtil.isCollectionMapOrArray(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findClassAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findClassAnnotations(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findClassAnnotations(java.lang.Class)}
 * @utbot.executesCondition {@code (isObjectOrPrimitive(cls)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isObjectOrPrimitive(java.lang.Class)}
 * @utbot.returnsFrom {@code return NO_ANNOTATIONS;}
 *  */
    @Test
    public void testFindClassAnnotations_IsObjectOrPrimitive() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        java.lang.annotation.Annotation[] prevNO_ANNOTATIONS = ((java.lang.annotation.Annotation[]) getStaticFieldValue(classUtilClazz, "NO_ANNOTATIONS"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            java.lang.annotation.Annotation[] noAnnotations = {};
            setStaticField(classUtilClazz, "NO_ANNOTATIONS", noAnnotations);
            
            java.lang.annotation.Annotation[] actual = ClassUtil.findClassAnnotations(clsObject);
            
            int noAnnotationsSize = noAnnotations.length;
            assertEquals(noAnnotationsSize, actual.length);
            assertTrue(deepEquals(noAnnotations, actual));
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
            setStaticField(ClassUtil.class, "NO_ANNOTATIONS", prevNO_ANNOTATIONS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNonStaticInnerClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isNonStaticInnerClass(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.invokes {@link java.lang.reflect.Modifier#isStatic(int)}
 * @utbot.returnsFrom {@code return !Modifier.isStatic(cls.getModifiers()) && (getEnclosingClass(cls) != null);}
 *  */
    @Test
    public void testIsNonStaticInnerClass_NotModifierIsStaticAndGetEnclosingClassNotEqualsNull() {
        Class class1 = Object.class;
        
        boolean actual = ClassUtil.isNonStaticInnerClass(class1);
        
        assertFalse(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNonStaticInnerClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#isNonStaticInnerClass(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !Modifier.isStatic(cls.getModifiers()) && (getEnclosingClass(cls) != null);
 *  */
    @Test
    public void testIsNonStaticInnerClass_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.isNonStaticInnerClass(ClassUtil.java:281) */
        ClassUtil.isNonStaticInnerClass(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unwrapAndThrowAsIAE(java.lang.Throwable, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: throwAsIAE(getRootCause(t), msg);
 *  */
    @Test(expected = NumberFormatException.class)
    public void testUnwrapAndThrowAsIAE_ThrowNumberFormatException() throws Exception  {
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        setField(numberFormatException, "java.lang.Throwable", "cause", numberFormatException);
        
        ClassUtil.unwrapAndThrowAsIAE(numberFormatException, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NoSuchMethodError} in: throwAsIAE(getRootCause(t), msg);
 *  */
    @Test(expected = NoSuchMethodError.class)
    public void testUnwrapAndThrowAsIAE_ThrowNoSuchMethodError() throws Exception  {
        NoSuchMethodError noSuchMethodError = ((NoSuchMethodError) createInstance("java.lang.NoSuchMethodError"));
        setField(noSuchMethodError, "java.lang.Throwable", "cause", noSuchMethodError);
        
        ClassUtil.unwrapAndThrowAsIAE(noSuchMethodError, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throwAsIAE(getRootCause(t), msg);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapAndThrowAsIAE_ThrowIllegalArgumentException() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cloneNotSupportedException);
        
        ClassUtil.unwrapAndThrowAsIAE(cloneNotSupportedException, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method unwrapAndThrowAsIAE(java.lang.Throwable, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable,java.lang.String)}
     */
    @Test
    public void testUnwrapAndThrowAsIAEThrowsNPEWithNonEmptyString() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getRootCause(ClassUtil.java:400)
            com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE(ClassUtil.java:467) */
        ClassUtil.unwrapAndThrowAsIAE(null, "ZX");
    }
    ///endregion
    
    ///region Errors report for unwrapAndThrowAsIAE
    
    public void testUnwrapAndThrowAsIAE_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unwrapAndThrowAsIAE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: throwAsIAE(getRootCause(t));
 *  */
    @Test(expected = NumberFormatException.class)
    public void testUnwrapAndThrowAsIAE_ThrowNumberFormatException1() throws Exception  {
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        setField(numberFormatException, "java.lang.Throwable", "cause", numberFormatException);
        
        ClassUtil.unwrapAndThrowAsIAE(numberFormatException);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throwAsIAE(getRootCause(t));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapAndThrowAsIAE_ThrowIllegalArgumentException1() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cloneNotSupportedException);
        
        ClassUtil.unwrapAndThrowAsIAE(cloneNotSupportedException);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.AssertionError} in: throwAsIAE(getRootCause(t));
 *  */
    @Test
    public void testUnwrapAndThrowAsIAE_ThrowAssertionError() throws Exception  {
        AssertionError assertionError = ((AssertionError) createInstance("java.lang.AssertionError"));
        setField(assertionError, "java.lang.Throwable", "cause", assertionError);
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE] produces [java.lang.AssertionError] */
        ClassUtil.unwrapAndThrowAsIAE(assertionError);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method unwrapAndThrowAsIAE(java.lang.Throwable)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#unwrapAndThrowAsIAE(java.lang.Throwable)}
     */
    @Test
    public void testUnwrapAndThrowAsIAEThrowsNPE() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getRootCause(ClassUtil.java:400)
            com.fasterxml.jackson.databind.util.ClassUtil.unwrapAndThrowAsIAE(ClassUtil.java:457) */
        ClassUtil.unwrapAndThrowAsIAE(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unwrapAndThrowAsIAE(java.lang.Throwable)
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnwrapAndThrowAsIAE1() throws Exception  {
        FileSystemLoopException fileSystemLoopException = ((FileSystemLoopException) createInstance("java.nio.file.FileSystemLoopException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        setField(fileSystemLoopException, "java.lang.Throwable", "cause", cause);
        
        ClassUtil.unwrapAndThrowAsIAE(fileSystemLoopException);
    }
    
    @Test(expected = NullPointerException.class)
    public void testUnwrapAndThrowAsIAE2() throws Exception  {
        NullPointerException nullPointerException = ((NullPointerException) createInstance("java.lang.NullPointerException"));
        String detailMessage = "";
        setField(nullPointerException, "java.lang.Throwable", "detailMessage", detailMessage);
        setField(nullPointerException, "java.lang.Throwable", "cause", nullPointerException);
        
        ClassUtil.unwrapAndThrowAsIAE(nullPointerException);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.throwAsMappingException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method throwAsMappingException(com.fasterxml.jackson.databind.DeserializationContext, java.io.IOException)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsMappingException(com.fasterxml.jackson.databind.DeserializationContext,java.io.IOException)}
 * @utbot.invokes {@link java.io.IOException#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonMappingException e = JsonMappingException.from(ctxt, e0.getMessage());
 *  */
    @Test
    public void testThrowAsMappingException_ThrowNullPointerException_1() throws JsonMappingException  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.throwAsMappingException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.throwAsMappingException(ClassUtil.java:445) */
        ClassUtil.throwAsMappingException(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsMappingException(com.fasterxml.jackson.databind.DeserializationContext,java.io.IOException)}
 * @utbot.invokes {@link java.io.IOException#getMessage()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#from(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#initCause(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw e;
 *  */
    @Test
    public void testThrowAsMappingException_ThrowNullPointerException() throws Exception  {
        InvalidPropertiesFormatException invalidPropertiesFormatException = ((InvalidPropertiesFormatException) createInstance("java.util.InvalidPropertiesFormatException"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.throwAsMappingException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:298)
            com.fasterxml.jackson.databind.util.ClassUtil.throwAsMappingException(ClassUtil.java:445) */
        ClassUtil.throwAsMappingException(null, invalidPropertiesFormatException);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method throwAsMappingException(com.fasterxml.jackson.databind.DeserializationContext, java.io.IOException)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwAsMappingException(com.fasterxml.jackson.databind.DeserializationContext,java.io.IOException)}
 * @utbot.executesCondition {@code (e0 instanceof JsonMappingException): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} when: e0 instanceof JsonMappingException
 *  */
    @Test(expected = JsonMappingException.class)
    public void testThrowAsMappingException_ThrowJsonMappingException() throws Exception  {
        JsonMappingException jsonMappingException = ((JsonMappingException) createInstance("com.fasterxml.jackson.databind.JsonMappingException"));
        
        ClassUtil.throwAsMappingException(null, jsonMappingException);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method throwAsMappingException(com.fasterxml.jackson.databind.DeserializationContext, java.io.IOException)
    
    @Test(expected = JsonMappingException.class)
    public void testThrowAsMappingException1() throws Exception  {
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        NoSuchFileException noSuchFileException = ((NoSuchFileException) createInstance("java.nio.file.NoSuchFileException"));
        
        ClassUtil.throwAsMappingException(impl, noSuchFileException);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.throwRootCauseIfIOE
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method throwRootCauseIfIOE(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwRootCauseIfIOE(java.lang.Throwable)}
 * @utbot.returnsFrom {@code return throwIfIOE(getRootCause(t));}
 *  */
    @Test
    public void testThrowRootCauseIfIOE_ReturnThrowIfIOE() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cloneNotSupportedException);
        
        CloneNotSupportedException actual = ((CloneNotSupportedException) ClassUtil.throwRootCauseIfIOE(cloneNotSupportedException));
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable cloneNotSupportedExceptionCause = cloneNotSupportedException.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(cloneNotSupportedExceptionCause, actualCause));
        assertTrue(deepEquals(cloneNotSupportedExceptionCause, actualCause));
        assertTrue(deepEquals(cloneNotSupportedExceptionCause, actualCause));
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int cloneNotSupportedExceptionCauseDepth = ((Integer) getFieldValue(cloneNotSupportedExceptionCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(cloneNotSupportedExceptionCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        assertTrue(deepEquals(cloneNotSupportedException, actual));
        assertTrue(deepEquals(cloneNotSupportedException, actual));
        assertTrue(deepEquals(cloneNotSupportedException, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwRootCauseIfIOE(java.lang.Throwable)}
 * @utbot.returnsFrom {@code return throwIfIOE(getRootCause(t));}
 *  */
    @Test
    public void testThrowRootCauseIfIOE_ReturnThrowIfIOE_1() throws Exception  {
        InvocationTargetException invocationTargetException = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        CloneNotSupportedException target = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(target, "java.lang.Throwable", "cause", target);
        setField(invocationTargetException, "java.lang.reflect.InvocationTargetException", "target", target);
        
        CloneNotSupportedException actual = ((CloneNotSupportedException) ClassUtil.throwRootCauseIfIOE(invocationTargetException));
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable targetCause = target.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(targetCause, actualCause));
        assertTrue(deepEquals(targetCause, actualCause));
        assertTrue(deepEquals(targetCause, actualCause));
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int targetCauseDepth = ((Integer) getFieldValue(targetCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(targetCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        assertTrue(deepEquals(target, actual));
        assertTrue(deepEquals(target, actual));
        assertTrue(deepEquals(target, actual));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method throwRootCauseIfIOE(java.lang.Throwable)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#throwRootCauseIfIOE(java.lang.Throwable)}
     */
    @Test
    public void testThrowRootCauseIfIOEThrowsNPE() throws IOException  {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.throwRootCauseIfIOE] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getRootCause(ClassUtil.java:400)
            com.fasterxml.jackson.databind.util.ClassUtil.throwRootCauseIfIOE(ClassUtil.java:414) */
        ClassUtil.throwRootCauseIfIOE(null);
    }
    ///endregion
    
    ///region Errors report for throwRootCauseIfIOE
    
    public void testThrowRootCauseIfIOE_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Exception com.sun.org.apache.xerces.internal.impl.XMLEntityScanner$1 is not accessible from package com.fasterxml.jackson.databind.util
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findFirstAnnotatedEnumValue
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findFirstAnnotatedEnumValue(java.lang.Class, java.lang.Class)
    
    @Test
    public void testFindFirstAnnotatedEnumValue1() {
        Class class1 = Object.class;
        
        Enum actual = ClassUtil.findFirstAnnotatedEnumValue(class1, null);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getClassDescription
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassDescription(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getClassDescription(java.lang.Object)}
 * @utbot.executesCondition {@code (classOrInstance == null): False}
 * @utbot.executesCondition {@code ((classOrInstance instanceof Class<?>)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#nameOf(java.lang.Class)}
 *  */
    @Test
    public void testGetClassDescription_NotClassOrInstanceNotInstanceOfClass() {
        byte[][] byteArray = {};
        
        String actual = ClassUtil.getClassDescription(byteArray);
        
        String expected = "`byte[][]`";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getClassDescription(java.lang.Object)}
 * @utbot.executesCondition {@code (classOrInstance == null): True}
 * @utbot.returnsFrom {@code return "unknown";}
 *  */
    @Test
    public void testGetClassDescription_ClassOrInstanceEqualsNull() {
        String actual = ClassUtil.getClassDescription(null);
        
        String expected = "unknown";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getClassDescription(java.lang.Object)
    
    @Test
    public void testGetClassDescription1() {
        Class class1 = Object.class;
        
        String actual = ClassUtil.getClassDescription(class1);
        
        String expected = "`java.lang.Object`";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testGetClassDescription2() {
        Object object = new Object();
        
        String actual = ClassUtil.getClassDescription(object);
        
        String expected = "`java.lang.Object`";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getOuterClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOuterClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getOuterClass(java.lang.Class)}
 * @utbot.executesCondition {@code (hasEnclosingMethod(type)): False}
 * @utbot.executesCondition {@code (!Modifier.isStatic(type.getModifiers())): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#hasEnclosingMethod(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.invokes {@link java.lang.reflect.Modifier#isStatic(int)}
 *  */
    @Test
    public void testGetOuterClass_ModifierIsStatic() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            Class actual = ClassUtil.getOuterClass(clsObject);
            
            assertNull(actual);
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.nonNullString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nonNullString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nonNullString(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testNonNullString_StrNotEqualsNull() {
        String string = "";
        
        String actual = ClassUtil.nonNullString(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nonNullString(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testNonNullString_StrEqualsNull() {
        String actual = ClassUtil.nonNullString(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getRootCause
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRootCause(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getRootCause(java.lang.Throwable)}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} once
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testGetRootCause_TGetCauseNotEqualsNull() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        InterruptedException cause = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        setField(cause, "java.lang.Throwable", "cause", cause);
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cause);
        
        InterruptedException actual = ((InterruptedException) ClassUtil.getRootCause(cloneNotSupportedException));
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable causeCause = cause.getCause();
        Throwable actualCause = actual.getCause();
        assertTrue(deepEquals(causeCause, actualCause));
        assertTrue(deepEquals(causeCause, actualCause));
        assertTrue(deepEquals(causeCause, actualCause));
        java.lang.StackTraceElement[] actualCauseStackTrace = actualCause.getStackTrace();
        assertNull(actualCauseStackTrace);
        
        int causeCauseDepth = ((Integer) getFieldValue(causeCause, "java.lang.Throwable", "depth"));
        int actualCauseDepth = ((Integer) getFieldValue(actualCause, "java.lang.Throwable", "depth"));
        assertEquals(causeCauseDepth, actualCauseDepth);
        
        List actualCauseSuppressedExceptions = ((List) getFieldValue(actualCause, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualCauseSuppressedExceptions);
        
        assertTrue(deepEquals(cause, actual));
        assertTrue(deepEquals(cause, actual));
        assertTrue(deepEquals(cause, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getRootCause(java.lang.Throwable)}
 * @utbot.returnsFrom {@code return t;}
 *  */
    @Test
    public void testGetRootCause_ReturnT() throws Exception  {
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        
        CloneNotSupportedException actual = ((CloneNotSupportedException) ClassUtil.getRootCause(cloneNotSupportedException));
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int cloneNotSupportedExceptionDepth = ((Integer) getFieldValue(cloneNotSupportedException, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(cloneNotSupportedExceptionDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRootCause(java.lang.Throwable)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getRootCause(java.lang.Throwable)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(t.getCause() != null)
 *  */
    @Test
    public void testGetRootCause_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.getRootCause] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getRootCause(ClassUtil.java:400) */
        ClassUtil.getRootCause(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getRootCause(java.lang.Throwable)
    
    @Test
    public void testGetRootCause1() throws Exception  {
        StreamCorruptedException streamCorruptedException = ((StreamCorruptedException) createInstance("java.io.StreamCorruptedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        UnsupportedEncodingException target = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        setField(cause, "java.lang.reflect.InvocationTargetException", "target", target);
        setField(streamCorruptedException, "java.lang.Throwable", "cause", cause);
        
        UnsupportedEncodingException actual = ((UnsupportedEncodingException) ClassUtil.getRootCause(streamCorruptedException));
        
        Object actualBacktrace = getFieldValue(actual, "java.lang.Throwable", "backtrace");
        assertNull(actualBacktrace);
        
        String actualDetailMessage = ((String) getFieldValue(actual, "java.lang.Throwable", "detailMessage"));
        assertNull(actualDetailMessage);
        
        Throwable actualCause = actual.getCause();
        assertNull(actualCause);
        
        java.lang.StackTraceElement[] actualStackTrace = actual.getStackTrace();
        assertNull(actualStackTrace);
        
        int targetDepth = ((Integer) getFieldValue(target, "java.lang.Throwable", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "java.lang.Throwable", "depth"));
        assertEquals(targetDepth, actualDepth);
        
        List actualSuppressedExceptions = ((List) getFieldValue(actual, "java.lang.Throwable", "suppressedExceptions"));
        assertNull(actualSuppressedExceptions);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getEnclosingClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEnclosingClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getEnclosingClass(java.lang.Class)}
 * @utbot.executesCondition {@code (isObjectOrPrimitive(cls)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isObjectOrPrimitive(java.lang.Class)}
 * @utbot.returnsFrom {@code return isObjectOrPrimitive(cls) ? null : cls.getEnclosingClass();}
 *  */
    @Test
    public void testGetEnclosingClass_IsObjectOrPrimitive() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            Class actual = ClassUtil.getEnclosingClass(clsObject);
            
            assertNull(actual);
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getPackageName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPackageName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getPackageName(java.lang.Class)}
 * @utbot.executesCondition {@code ((pkg == null)): True}
 * @utbot.invokes {@link java.lang.Class#getPackage()}
 * @utbot.returnsFrom {@code return (pkg == null) ? null : pkg.getName();}
 *  */
    @Test
    public void testGetPackageName_PkgEqualsNull() {
        Class class1 = Object.class;
        
        String actual = ClassUtil.getPackageName(class1);
        
        String expected = "java.lang";
        
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPackageName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getPackageName(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getPackage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Package pkg = cls.getPackage();
 *  */
    @Test
    public void testGetPackageName_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.getPackageName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getPackageName(ClassUtil.java:1056) */
        ClassUtil.getPackageName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getGenericSuperclass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGenericSuperclass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getGenericSuperclass(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getGenericSuperclass()}
 * @utbot.returnsFrom {@code return cls.getGenericSuperclass();}
 *  */
    @Test
    public void testGetGenericSuperclass_ClassGetGenericSuperclass() {
        Class class1 = Object.class;
        
        Type actual = ClassUtil.getGenericSuperclass(class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSuperclass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getGenericSuperclass(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getGenericSuperclass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cls.getGenericSuperclass();
 *  */
    @Test
    public void testGetGenericSuperclass_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.getGenericSuperclass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getGenericSuperclass(ClassUtil.java:1153) */
        ClassUtil.getGenericSuperclass(null);
    }
    ///endregion
    
    ///region Errors report for getGenericSuperclass
    
    public void testGetGenericSuperclass_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getGenericInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGenericInterfaces(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getGenericInterfaces(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getGenericInterfaces()}
 * @utbot.returnsFrom {@code return cls.getGenericInterfaces();}
 *  */
    @Test
    public void testGetGenericInterfaces_ClassGetGenericInterfaces() {
        Class class1 = Object.class;
        
        java.lang.Class[] actual = ((java.lang.Class[]) ClassUtil.getGenericInterfaces(class1));
        
        java.lang.Class[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericInterfaces(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getGenericInterfaces(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getGenericInterfaces()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cls.getGenericInterfaces();
 *  */
    @Test
    public void testGetGenericInterfaces_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.getGenericInterfaces] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getGenericInterfaces(ClassUtil.java:1160) */
        ClassUtil.getGenericInterfaces(null);
    }
    ///endregion
    
    ///region Errors report for getGenericInterfaces
    
    public void testGetGenericInterfaces_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getDeclaringClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeclaringClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getDeclaringClass(java.lang.Class)}
 * @utbot.executesCondition {@code (isObjectOrPrimitive(cls)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isObjectOrPrimitive(java.lang.Class)}
 * @utbot.returnsFrom {@code return isObjectOrPrimitive(cls) ? null : cls.getDeclaringClass();}
 *  */
    @Test
    public void testGetDeclaringClass_IsObjectOrPrimitive() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class prevCLS_OBJECT = ((Class) getStaticFieldValue(classUtilClazz, "CLS_OBJECT"));
        try {
            Class clsObject = Object.class;
            setStaticField(classUtilClazz, "CLS_OBJECT", clsObject);
            
            Class actual = ClassUtil.getDeclaringClass(clsObject);
            
            assertNull(actual);
            
            Class finalClsObject = clsObject;
            
        } finally {
            setStaticField(ClassUtil.class, "CLS_OBJECT", prevCLS_OBJECT);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getConstructors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConstructors(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getConstructors(java.lang.Class)}
 * @utbot.executesCondition {@code (cls.isInterface() || isObjectOrPrimitive(cls)): False}
 * @utbot.invokes {@link java.lang.Class#isInterface()}
 * @utbot.returnsFrom {@code return NO_CTORS;}
 *  */
    @Test
    public void testGetConstructors_ClsIsInterfaceOrIsObjectOrPrimitive() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] prevNO_CTORS = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor[]) getStaticFieldValue(classUtilClazz, "NO_CTORS"));
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] noCtors = {};
            setStaticField(classUtilClazz, "NO_CTORS", noCtors);
            Class class1 = Object.class;
            
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] actual = ClassUtil.getConstructors(class1);
            
            int noCtorsSize = noCtors.length;
            assertEquals(noCtorsSize, actual.length);
            assertTrue(deepEquals(noCtors, actual));
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(ClassUtil.class, "NO_CTORS", prevNO_CTORS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getConstructors(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getConstructors(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isInterface()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cls.isInterface() || isObjectOrPrimitive(cls)
 *  */
    @Test
    public void testGetConstructors_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.getConstructors] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getConstructors(ClassUtil.java:1127) */
        ClassUtil.getConstructors(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeclaredFields(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getDeclaredFields(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredFields()}
 * @utbot.returnsFrom {@code return cls.getDeclaredFields();}
 *  */
    @Test
    public void testGetDeclaredFields_ClassGetDeclaredFields() {
        Class class1 = Object.class;
        
        java.lang.reflect.Field[] actual = ClassUtil.getDeclaredFields(class1);
        
        java.lang.reflect.Field[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeclaredFields(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getDeclaredFields(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredFields()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cls.getDeclaredFields();
 *  */
    @Test
    public void testGetDeclaredFields_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields(ClassUtil.java:1071) */
        ClassUtil.getDeclaredFields(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeclaredMethods(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getDeclaredMethods(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredMethods()}
 * @utbot.returnsFrom {@code return cls.getDeclaredMethods();}
 *  */
    @Test
    public void testGetDeclaredMethods_ClassGetDeclaredMethods() throws Exception  {
        Class class1 = Object.class;
        
        java.lang.reflect.Method[] actual = ClassUtil.getDeclaredMethods(class1);
        
        java.lang.reflect.Method[] expected = new java.lang.reflect.Method[11];
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        expected[0] = method;
        Method method1 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[1] = method1;
        Method method2 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[2] = method2;
        Method method3 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[3] = method3;
        Method method4 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[4] = method4;
        Method method5 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[5] = method5;
        Method method6 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[6] = method6;
        Method method7 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[7] = method7;
        Method method8 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[8] = method8;
        Method method9 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[9] = method9;
        Method method10 = ((Method) createInstance("java.lang.reflect.Method"));
        expected[10] = method10;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeclaredMethods(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#getDeclaredMethods(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredMethods()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return cls.getDeclaredMethods();
 *  */
    @Test
    public void testGetDeclaredMethods_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredMethods(ClassUtil.java:1078) */
        ClassUtil.getDeclaredMethods(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.defaultValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method defaultValue(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#defaultValue(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == Integer.TYPE): True}
 * @utbot.returnsFrom {@code return Integer.valueOf(0);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Integer.valueOf(0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDefaultValue_ThrowIllegalArgumentException() {
        Class class1 = Object.class;
        
        ClassUtil.defaultValue(class1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method defaultValue(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#defaultValue(java.lang.Class)}
 * @utbot.executesCondition {@code (cls == Integer.TYPE): False}
 * @utbot.executesCondition {@code (cls == Long.TYPE): False}
 * @utbot.executesCondition {@code (cls == Boolean.TYPE): False}
 * @utbot.executesCondition {@code (cls == Double.TYPE): False}
 * @utbot.executesCondition {@code (cls == Float.TYPE): False}
 * @utbot.executesCondition {@code (cls == Byte.TYPE): False}
 * @utbot.executesCondition {@code (cls == Short.TYPE): False}
 * @utbot.executesCondition {@code (cls == Character.TYPE): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
 *  */
    @Test
    public void testDefaultValue_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.defaultValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.defaultValue(ClassUtil.java:789) */
        ClassUtil.defaultValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.emptyIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyIterator()
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#emptyIterator()}
 * @utbot.returnsFrom {@code return (Iterator<T>) EMPTY_ITERATOR;}
 *  */
    @Test
    public void testEmptyIterator_ReturnEMPTY_ITERATOR() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Iterator prevEMPTY_ITERATOR = ((Iterator) getStaticFieldValue(classUtilClazz, "EMPTY_ITERATOR"));
        try {
            setStaticField(classUtilClazz, "EMPTY_ITERATOR", null);
            
            Iterator actual = ClassUtil.emptyIterator();
            
            assertNull(actual);
        } finally {
            setStaticField(ClassUtil.class, "EMPTY_ITERATOR", prevEMPTY_ITERATOR);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.primitiveType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method primitiveType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#primitiveType(java.lang.Class)}
 * @utbot.executesCondition {@code (type.isPrimitive()): True}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testPrimitiveType_TypeIsPrimitive() {
        Class class1 = Object.class;
        
        Class actual = ClassUtil.primitiveType(class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method primitiveType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#primitiveType(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: type.isPrimitive()
 *  */
    @Test
    public void testPrimitiveType_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.primitiveType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.primitiveType(ClassUtil.java:833) */
        ClassUtil.primitiveType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.wrapperType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method wrapperType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#wrapperType(java.lang.Class)}
 * @utbot.executesCondition {@code (primitiveType == Integer.TYPE): True}
 * @utbot.returnsFrom {@code return Integer.class;}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Integer.class;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWrapperType_ThrowIllegalArgumentException() {
        Class class1 = Object.class;
        
        ClassUtil.wrapperType(class1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wrapperType(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#wrapperType(java.lang.Class)}
 * @utbot.executesCondition {@code (primitiveType == Integer.TYPE): False}
 * @utbot.executesCondition {@code (primitiveType == Long.TYPE): False}
 * @utbot.executesCondition {@code (primitiveType == Boolean.TYPE): False}
 * @utbot.executesCondition {@code (primitiveType == Double.TYPE): False}
 * @utbot.executesCondition {@code (primitiveType == Float.TYPE): False}
 * @utbot.executesCondition {@code (primitiveType == Byte.TYPE): False}
 * @utbot.executesCondition {@code (primitiveType == Short.TYPE): False}
 * @utbot.executesCondition {@code (primitiveType == Character.TYPE): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalArgumentException("Class " + primitiveType.getName() + " is not a primitive type");
 *  */
    @Test
    public void testWrapperType_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.util.ClassUtil.wrapperType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.wrapperType(ClassUtil.java:822) */
        ClassUtil.wrapperType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.nonNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nonNull(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nonNull(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code ((valueOrNull == null)): False}
 * @utbot.returnsFrom {@code return (valueOrNull == null) ? defaultValue : valueOrNull;}
 *  */
    @Test
    public void testNonNull_ValueOrNullNotEqualsNull() {
        byte[] byteArray = {};
        
        byte[] actual = ((byte[]) ClassUtil.nonNull(byteArray, null));
        
        assertArrayEquals(byteArray, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#nonNull(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code ((valueOrNull == null)): True}
 * @utbot.returnsFrom {@code return (valueOrNull == null) ? defaultValue : valueOrNull;}
 *  */
    @Test
    public void testNonNull_ValueOrNullEqualsNull() {
        Object actual = ClassUtil.nonNull(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.findConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConstructor(java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link ClassUtil}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.util.ClassUtil#findConstructor(java.lang.Class,boolean)}
 * @utbot.invokes {@link java.lang.Class#getDeclaredConstructor(java.lang.Class[])}
 *  */
    @Test
    public void testFindConstructor_ClassGetDeclaredConstructor() throws Exception  {
        Class class1 = Object.class;
        
        Constructor actual = ClassUtil.findConstructor(class1, false);
        
        Constructor expected = ((Constructor) createInstance("java.lang.reflect.Constructor"));
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.util.ClassUtil.createInstance
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createInstance(java.lang.Class, boolean)
    
    @Test
    public void testCreateInstance1() {
        Class class1 = Object.class;
        
        Object actual = ClassUtil.createInstance(class1, false);
        
        Object expected = new Object();
        
        Class finalClass1 = class1;
        
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1092418007328799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092418007328799.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092418007337700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092418007328799.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092418007337700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1092418008176100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092418008176100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092418008177600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092418008176100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092418008177600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1092418008808499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1092418008808499.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1092418008809499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092418008808499.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092418008809499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1092418014302400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1092418014302400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1092418014303900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1092418014302400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1092418014303900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

