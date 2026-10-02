package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import java.text.MessageFormat;
import java.lang.reflect.Method;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.Node;
import java.text.Format;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Map;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import java.util.List;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Set;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.InstanceObjectType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_FunctionTypeBuilderTest {
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.reportError
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportError(com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportError_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionNode errorRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = diagnosticType;
        reportErrorMethodArguments[1] = ((Object) null);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportError_ThrowIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {5};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.IndexOutOfBoundsException: start 0, end 5, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = diagnosticType;
        reportErrorMethodArguments[1] = ((Object) null);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportError_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionNode errorRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {-1};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1279)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = diagnosticType;
        reportErrorMethodArguments[1] = ((Object) stringArray);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportError_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = diagnosticType;
        reportErrorMethodArguments[1] = ((Object) null);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportError_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        java.text.Format[] formats = {};
        format.setFormats(formats);
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {0};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1284)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = diagnosticType;
        reportErrorMethodArguments[1] = ((Object) stringArray);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, error, args));
 *  */
    @Test
    public void testReportError_ThrowNullPointerException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = ((Object) null);
        reportErrorMethodArguments[1] = ((Object) null);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, error, args));
 *  */
    @Test
    public void testReportError_ThrowNullPointerException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = ((Object) null);
        reportErrorMethodArguments[1] = ((Object) null);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, error, args));
 *  */
    @Test
    public void testReportError_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = ((Object) null);
        reportErrorMethodArguments[1] = ((Object) null);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportError(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, error, args));
 *  */
    @Test
    public void testReportError_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:574) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportErrorMethod = functionTypeBuilderClazz.getDeclaredMethod("reportError", diagnosticTypeType, stringArrayType);
        reportErrorMethod.setAccessible(true);
        java.lang.Object[] reportErrorMethodArguments = new java.lang.Object[2];
        reportErrorMethodArguments[0] = diagnosticType;
        reportErrorMethodArguments[1] = ((Object) null);
        try {
            reportErrorMethod.invoke(functionTypeBuilder, reportErrorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOptionalParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isOptionalArg();}
 *  */
    @Test
    public void testIsOptionalParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsOptionalArg() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", stringNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = stringNode;
        isOptionalParameterMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isOptionalArg();}
 *  */
    @Test
    public void testIsOptionalParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsOptionalArg_4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", stringNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = stringNode;
        isOptionalParameterMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isOptionalArg();}
 *  */
    @Test
    public void testIsOptionalParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsOptionalArg_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", stringNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = stringNode;
        isOptionalParameterMethodArguments[1] = jSDocInfo;
        boolean actual = ((Boolean) isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isOptionalArg();}
 *  */
    @Test
    public void testIsOptionalParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsOptionalArg_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", stringNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = stringNode;
        isOptionalParameterMethodArguments[1] = jSDocInfo;
        boolean actual = ((Boolean) isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments));
        
        assertFalse(actual);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoInfoParameters = ((Map) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isOptionalArg();}
 *  */
    @Test
    public void testIsOptionalParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsOptionalArg_3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", stringNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = stringNode;
        isOptionalParameterMethodArguments[1] = jSDocInfo;
        boolean actual = ((Boolean) isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isOptionalParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isOptionalParameter(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String paramName = param.getString();
 *  */
    @Test
    public void testIsOptionalParameter_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter(FunctionTypeBuilder.java:396) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", nodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = ((Object) null);
        isOptionalParameterMethodArguments[1] = ((Object) null);
        try {
            isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: codingConvention.isOptionalParameter(param)
 *  */
    @Test
    public void testIsOptionalParameter_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter(FunctionTypeBuilder.java:392) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", nodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = ((Object) null);
        isOptionalParameterMethodArguments[1] = ((Object) null);
        try {
            isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isOptionalParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: codingConvention.isOptionalParameter(param)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsOptionalParameter_ThrowIllegalStateException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", scriptOrFnNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = scriptOrFnNode;
        isOptionalParameterMethodArguments[1] = ((Object) null);
        try {
            isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: codingConvention.isOptionalParameter(param)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsOptionalParameter_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", scriptOrFnNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = scriptOrFnNode;
        isOptionalParameterMethodArguments[1] = ((Object) null);
        try {
            isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isOptionalParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String paramName = param.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsOptionalParameter_ThrowIllegalStateException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", scriptOrFnNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = scriptOrFnNode;
        isOptionalParameterMethodArguments[1] = ((Object) null);
        try {
            isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferTemplateTypeName_InfoEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferTemplateTypeName(null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getTemplateTypeName()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#setTemplateTypeName(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferTemplateTypeName_InfoNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        String templateTypeName = "";
        typeRegistry.setTemplateTypeName(templateTypeName);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        TemplateType initialFunctionTypeBuilderTypeRegistryTemplateType = ((TemplateType) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferTemplateTypeName(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry1 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry1NativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int functionTypeBuilderTypeRegistry1NativeTypesSize = functionTypeBuilderTypeRegistry1NativeTypes.length;
        assertEquals(functionTypeBuilderTypeRegistry1NativeTypesSize, actualTypeRegistryNativeTypes.length);
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1NativeTypes, actualTypeRegistryNativeTypes));
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType functionTypeBuilderTypeRegistry1TemplateType = ((TemplateType) getFieldValue(functionTypeBuilderTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        String actualTypeRegistryTemplateTypeName1 = ((String) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualTypeRegistryTemplateTypeName1);
        
        ObjectType actualTypeRegistryTemplateTypeReferencedType = ((ObjectType) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualTypeRegistryTemplateTypeReferencedType);
        
        boolean actualTypeRegistryTemplateTypeVisited = ((Boolean) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeRegistryTemplateTypeVisited);
        
        JSDocInfo actualTypeRegistryTemplateTypeDocInfo = ((JSDocInfo) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeRegistryTemplateTypeDocInfo);
        
        boolean actualTypeRegistryTemplateTypeUnknown = ((Boolean) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualTypeRegistryTemplateTypeUnknown);
        
        boolean actualTypeRegistryTemplateTypeResolved = ((Boolean) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualTypeRegistryTemplateTypeResolved);
        
        JSType actualTypeRegistryTemplateTypeResolveResult = ((JSType) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualTypeRegistryTemplateTypeResolveResult);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry1TemplateTypeRegistry = ((JSTypeRegistry) getFieldValue(functionTypeBuilderTypeRegistry1TemplateType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        JSTypeRegistry actualTypeRegistryTemplateTypeRegistry = ((JSTypeRegistry) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateTypeRegistry, actualTypeRegistryTemplateTypeRegistry));
        boolean actualTypeRegistryTemplateTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistryTemplateTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTemplateTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualTypeRegistryTemplateTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistryTemplateTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertNull(actualTypeRegistryTemplateTypeRegistryResolveMode);
        
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1, actualTypeRegistry));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1, actualTypeRegistry));
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry2 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes0 = ((JSType) get(functionTypeBuilderTypeRegistry2TypeRegistryNativeTypes, 0));
        JSTypeRegistry functionTypeBuilderTypeRegistry3 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes1 = ((JSType) get(functionTypeBuilderTypeRegistry3TypeRegistryNativeTypes, 1));
        JSTypeRegistry functionTypeBuilderTypeRegistry4 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes2 = ((JSType) get(functionTypeBuilderTypeRegistry4TypeRegistryNativeTypes, 2));
        JSTypeRegistry functionTypeBuilderTypeRegistry5 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes3 = ((JSType) get(functionTypeBuilderTypeRegistry5TypeRegistryNativeTypes, 3));
        JSTypeRegistry functionTypeBuilderTypeRegistry6 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes4 = ((JSType) get(functionTypeBuilderTypeRegistry6TypeRegistryNativeTypes, 4));
        JSTypeRegistry functionTypeBuilderTypeRegistry7 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes5 = ((JSType) get(functionTypeBuilderTypeRegistry7TypeRegistryNativeTypes, 5));
        JSTypeRegistry functionTypeBuilderTypeRegistry8 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes6 = ((JSType) get(functionTypeBuilderTypeRegistry8TypeRegistryNativeTypes, 6));
        JSTypeRegistry functionTypeBuilderTypeRegistry9 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes7 = ((JSType) get(functionTypeBuilderTypeRegistry9TypeRegistryNativeTypes, 7));
        JSTypeRegistry functionTypeBuilderTypeRegistry10 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes8 = ((JSType) get(functionTypeBuilderTypeRegistry10TypeRegistryNativeTypes, 8));
        JSTypeRegistry functionTypeBuilderTypeRegistry11 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes9 = ((JSType) get(functionTypeBuilderTypeRegistry11TypeRegistryNativeTypes, 9));
        JSTypeRegistry functionTypeBuilderTypeRegistry12 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes10 = ((JSType) get(functionTypeBuilderTypeRegistry12TypeRegistryNativeTypes, 10));
        JSTypeRegistry functionTypeBuilderTypeRegistry13 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes11 = ((JSType) get(functionTypeBuilderTypeRegistry13TypeRegistryNativeTypes, 11));
        JSTypeRegistry functionTypeBuilderTypeRegistry14 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes12 = ((JSType) get(functionTypeBuilderTypeRegistry14TypeRegistryNativeTypes, 12));
        JSTypeRegistry functionTypeBuilderTypeRegistry15 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes13 = ((JSType) get(functionTypeBuilderTypeRegistry15TypeRegistryNativeTypes, 13));
        JSTypeRegistry functionTypeBuilderTypeRegistry16 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes14 = ((JSType) get(functionTypeBuilderTypeRegistry16TypeRegistryNativeTypes, 14));
        JSTypeRegistry functionTypeBuilderTypeRegistry17 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes15 = ((JSType) get(functionTypeBuilderTypeRegistry17TypeRegistryNativeTypes, 15));
        JSTypeRegistry functionTypeBuilderTypeRegistry18 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes16 = ((JSType) get(functionTypeBuilderTypeRegistry18TypeRegistryNativeTypes, 16));
        JSTypeRegistry functionTypeBuilderTypeRegistry19 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes17 = ((JSType) get(functionTypeBuilderTypeRegistry19TypeRegistryNativeTypes, 17));
        JSTypeRegistry functionTypeBuilderTypeRegistry20 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes18 = ((JSType) get(functionTypeBuilderTypeRegistry20TypeRegistryNativeTypes, 18));
        JSTypeRegistry functionTypeBuilderTypeRegistry21 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes19 = ((JSType) get(functionTypeBuilderTypeRegistry21TypeRegistryNativeTypes, 19));
        JSTypeRegistry functionTypeBuilderTypeRegistry22 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes20 = ((JSType) get(functionTypeBuilderTypeRegistry22TypeRegistryNativeTypes, 20));
        JSTypeRegistry functionTypeBuilderTypeRegistry23 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes21 = ((JSType) get(functionTypeBuilderTypeRegistry23TypeRegistryNativeTypes, 21));
        JSTypeRegistry functionTypeBuilderTypeRegistry24 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes22 = ((JSType) get(functionTypeBuilderTypeRegistry24TypeRegistryNativeTypes, 22));
        JSTypeRegistry functionTypeBuilderTypeRegistry25 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes23 = ((JSType) get(functionTypeBuilderTypeRegistry25TypeRegistryNativeTypes, 23));
        JSTypeRegistry functionTypeBuilderTypeRegistry26 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes24 = ((JSType) get(functionTypeBuilderTypeRegistry26TypeRegistryNativeTypes, 24));
        JSTypeRegistry functionTypeBuilderTypeRegistry27 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes25 = ((JSType) get(functionTypeBuilderTypeRegistry27TypeRegistryNativeTypes, 25));
        JSTypeRegistry functionTypeBuilderTypeRegistry28 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes26 = ((JSType) get(functionTypeBuilderTypeRegistry28TypeRegistryNativeTypes, 26));
        JSTypeRegistry functionTypeBuilderTypeRegistry29 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes27 = ((JSType) get(functionTypeBuilderTypeRegistry29TypeRegistryNativeTypes, 27));
        JSTypeRegistry functionTypeBuilderTypeRegistry30 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes28 = ((JSType) get(functionTypeBuilderTypeRegistry30TypeRegistryNativeTypes, 28));
        JSTypeRegistry functionTypeBuilderTypeRegistry31 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes29 = ((JSType) get(functionTypeBuilderTypeRegistry31TypeRegistryNativeTypes, 29));
        JSTypeRegistry functionTypeBuilderTypeRegistry32 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes30 = ((JSType) get(functionTypeBuilderTypeRegistry32TypeRegistryNativeTypes, 30));
        JSTypeRegistry functionTypeBuilderTypeRegistry33 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes31 = ((JSType) get(functionTypeBuilderTypeRegistry33TypeRegistryNativeTypes, 31));
        JSTypeRegistry functionTypeBuilderTypeRegistry34 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes32 = ((JSType) get(functionTypeBuilderTypeRegistry34TypeRegistryNativeTypes, 32));
        JSTypeRegistry functionTypeBuilderTypeRegistry35 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes33 = ((JSType) get(functionTypeBuilderTypeRegistry35TypeRegistryNativeTypes, 33));
        JSTypeRegistry functionTypeBuilderTypeRegistry36 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes34 = ((JSType) get(functionTypeBuilderTypeRegistry36TypeRegistryNativeTypes, 34));
        JSTypeRegistry functionTypeBuilderTypeRegistry37 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry37TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes35 = ((JSType) get(functionTypeBuilderTypeRegistry37TypeRegistryNativeTypes, 35));
        JSTypeRegistry functionTypeBuilderTypeRegistry38 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry38TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes36 = ((JSType) get(functionTypeBuilderTypeRegistry38TypeRegistryNativeTypes, 36));
        JSTypeRegistry functionTypeBuilderTypeRegistry39 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        TemplateType finalFunctionTypeBuilderTypeRegistryTemplateType = ((TemplateType) getFieldValue(functionTypeBuilderTypeRegistry39, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        
        assertFalse(initialFunctionTypeBuilderTypeRegistryTemplateType == finalFunctionTypeBuilderTypeRegistryTemplateType);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes24);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes25);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes26);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes27);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes28);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes29);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes30);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes31);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes32);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes33);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes34);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes35);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes36);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testInferTemplateTypeName_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.TemplateType.<init>(TemplateType.java:55)
            com.google.javascript.rhino.jstype.JSTypeRegistry.setTemplateTypeName(JSTypeRegistry.java:1502)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:422) */
        functionTypeBuilder.inferTemplateTypeName(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testInferTemplateTypeName_ThrowClassCastException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[35] = ((JSType) allType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        String templateTypeName = "";
        typeRegistry.setTemplateTypeName(templateTypeName);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @47f535b6)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.TemplateType.<init>(TemplateType.java:55)
            com.google.javascript.rhino.jstype.JSTypeRegistry.setTemplateTypeName(JSTypeRegistry.java:1502)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:422) */
        functionTypeBuilder.inferTemplateTypeName(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.setTemplateTypeName(templateTypeName);
 *  */
    @Test
    public void testInferTemplateTypeName_ThrowNullPointerException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:422) */
        functionTypeBuilder.inferTemplateTypeName(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.setTemplateTypeName(templateTypeName);
 *  */
    @Test
    public void testInferTemplateTypeName_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:422) */
        functionTypeBuilder.inferTemplateTypeName(jSDocInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferParameterTypes(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferParameterTypes(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (argsParent == null): True}
 * @utbot.executesCondition {@code (info == null): True}
 *  */
    @Test
    public void testInferParameterTypes_InfoEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferParameterTypes(null, null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferParameterTypes(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferParameterTypes(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String name: info.getParameterNames())
 *  */
    @Test
    public void testInferParameterTypes_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes(FunctionTypeBuilder.java:325) */
        functionTypeBuilder.inferParameterTypes(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferFromOverriddenFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parametersNode == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#build()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferFromOverriddenFunction_ParametersNodeEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Node initialFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferFromOverriddenFunction(noObjectType, null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node functionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        int functionTypeBuilderParametersNodeType = functionTypeBuilderParametersNode.getType();
        int actualParametersNodeType = actualParametersNode.getType();
        assertEquals(functionTypeBuilderParametersNodeType, actualParametersNodeType);
        
        Node actualParametersNodeNext = actualParametersNode.getNext();
        assertNull(actualParametersNodeNext);
        
        Node actualParametersNodeFirst = ((Node) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualParametersNodeFirst);
        
        Node actualParametersNodeLast = ((Node) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParametersNodeLast);
        
        Object actualParametersNodePropListHead = getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParametersNodePropListHead);
        
        int functionTypeBuilderParametersNodeSourcePosition = ((Integer) getFieldValue(functionTypeBuilderParametersNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualParametersNodeSourcePosition = ((Integer) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionTypeBuilderParametersNodeSourcePosition, actualParametersNodeSourcePosition);
        
        JSType actualParametersNodeJsType = ((JSType) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParametersNodeJsType);
        
        Node actualParametersNodeParent = actualParametersNode.getParent();
        assertNull(actualParametersNodeParent);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        Node finalFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        assertFalse(initialFunctionTypeBuilderParametersNode == finalFunctionTypeBuilderParametersNode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferFromOverriddenFunction_ParametersNodeNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        FunctionNode parameters = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Node initialFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferFromOverriddenFunction(noObjectType, null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node functionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        String actualParametersNodeFunctionName = (((FunctionNode) actualParametersNode)).getFunctionName();
        assertNull(actualParametersNodeFunctionName);
        
        boolean actualParametersNodeItsNeedsActivation = ((Boolean) getFieldValue(actualParametersNode, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualParametersNodeItsNeedsActivation);
        
        int functionTypeBuilderParametersNodeItsFunctionType = ((Integer) getFieldValue(functionTypeBuilderParametersNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualParametersNodeItsFunctionType = ((Integer) getFieldValue(actualParametersNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionTypeBuilderParametersNodeItsFunctionType, actualParametersNodeItsFunctionType);
        
        boolean actualParametersNodeItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualParametersNode, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualParametersNodeItsIgnoreDynamicScope);
        
        int functionTypeBuilderParametersNodeEncodedSourceStart = (((ScriptOrFnNode) functionTypeBuilderParametersNode)).getEncodedSourceStart();
        int actualParametersNodeEncodedSourceStart = (((ScriptOrFnNode) actualParametersNode)).getEncodedSourceStart();
        assertEquals(functionTypeBuilderParametersNodeEncodedSourceStart, actualParametersNodeEncodedSourceStart);
        
        int functionTypeBuilderParametersNodeEncodedSourceEnd = (((ScriptOrFnNode) functionTypeBuilderParametersNode)).getEncodedSourceEnd();
        int actualParametersNodeEncodedSourceEnd = (((ScriptOrFnNode) actualParametersNode)).getEncodedSourceEnd();
        assertEquals(functionTypeBuilderParametersNodeEncodedSourceEnd, actualParametersNodeEncodedSourceEnd);
        
        String actualParametersNodeSourceName = (((ScriptOrFnNode) actualParametersNode)).getSourceName();
        assertNull(actualParametersNodeSourceName);
        
        int functionTypeBuilderParametersNodeBaseLineno = (((ScriptOrFnNode) functionTypeBuilderParametersNode)).getBaseLineno();
        int actualParametersNodeBaseLineno = (((ScriptOrFnNode) actualParametersNode)).getBaseLineno();
        assertEquals(functionTypeBuilderParametersNodeBaseLineno, actualParametersNodeBaseLineno);
        
        int functionTypeBuilderParametersNodeEndLineno = (((ScriptOrFnNode) functionTypeBuilderParametersNode)).getEndLineno();
        int actualParametersNodeEndLineno = (((ScriptOrFnNode) actualParametersNode)).getEndLineno();
        assertEquals(functionTypeBuilderParametersNodeEndLineno, actualParametersNodeEndLineno);
        
        ObjArray actualParametersNodeFunctions = ((ObjArray) getFieldValue(actualParametersNode, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualParametersNodeFunctions);
        
        ObjArray actualParametersNodeRegexps = ((ObjArray) getFieldValue(actualParametersNode, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualParametersNodeRegexps);
        
        ObjArray actualParametersNodeItsVariables = ((ObjArray) getFieldValue(actualParametersNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualParametersNodeItsVariables);
        
        ObjArray actualParametersNodeItsConst = ((ObjArray) getFieldValue(actualParametersNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualParametersNodeItsConst);
        
        ObjToIntMap actualParametersNodeItsVariableNames = ((ObjToIntMap) getFieldValue(actualParametersNode, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualParametersNodeItsVariableNames);
        
        int functionTypeBuilderParametersNodeVarStart = ((Integer) getFieldValue(functionTypeBuilderParametersNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualParametersNodeVarStart = ((Integer) getFieldValue(actualParametersNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionTypeBuilderParametersNodeVarStart, actualParametersNodeVarStart);
        
        Object actualParametersNodeCompilerData = (((ScriptOrFnNode) actualParametersNode)).getCompilerData();
        assertNull(actualParametersNodeCompilerData);
        
        int functionTypeBuilderParametersNodeType = functionTypeBuilderParametersNode.getType();
        int actualParametersNodeType = actualParametersNode.getType();
        assertEquals(functionTypeBuilderParametersNodeType, actualParametersNodeType);
        
        Node actualParametersNodeNext = actualParametersNode.getNext();
        assertNull(actualParametersNodeNext);
        
        Node actualParametersNodeFirst = ((Node) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualParametersNodeFirst);
        
        Node actualParametersNodeLast = ((Node) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualParametersNodeLast);
        
        Object actualParametersNodePropListHead = getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualParametersNodePropListHead);
        
        int functionTypeBuilderParametersNodeSourcePosition = ((Integer) getFieldValue(functionTypeBuilderParametersNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualParametersNodeSourcePosition = ((Integer) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionTypeBuilderParametersNodeSourcePosition, actualParametersNodeSourcePosition);
        
        JSType actualParametersNodeJsType = ((JSType) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParametersNodeJsType);
        
        Node actualParametersNodeParent = actualParametersNode.getParent();
        assertNull(actualParametersNodeParent);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        Node finalFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        assertFalse(initialFunctionTypeBuilderParametersNode == finalFunctionTypeBuilderParametersNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType = oldType.getReturnType();
 *  */
    @Test
    public void testInferFromOverriddenFunction_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferFromOverriddenFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferFromOverriddenFunction(FunctionTypeBuilder.java:163) */
        functionTypeBuilder.inferFromOverriddenFunction(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.hasReturnType()): False}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_NotInfoHasReturnType_1() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.hasReturnType()): False}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_NotInfoHasReturnType() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoInfoParameters = ((Map) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.hasReturnType()): True}
 * @utbot.executesCondition {@code (info.hasThisType()): False}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_NotInfoHasThisType() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.hasReturnType()): False}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_NotInfoHasReturnType_2() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.hasReturnType()): True}
 * @utbot.executesCondition {@code (info.hasThisType()): True}
 * @utbot.executesCondition {@code (info.isConstructor()): True}
 * @utbot.executesCondition {@code (info.isInterface()): False}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_NotInfoIsInterface() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.hasReturnType()): True}
 * @utbot.executesCondition {@code (info.hasThisType()): True}
 * @utbot.executesCondition {@code (info.isConstructor()): True}
 * @utbot.executesCondition {@code (info.isInterface()): True}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_InfoIsInterface() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 512);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info.hasReturnType()): True}
 * @utbot.executesCondition {@code (info.hasThisType()): True}
 * @utbot.executesCondition {@code (info.isConstructor()): False}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_NotInfoIsConstructor() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -254);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoInfoParameters = ((Map) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();}
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_InfoGetParameterCountGreaterThanZeroOrInfoHasReturnTypeOrInfoHasThisTypeOrInfoIsConstructorOrInfoIsInterface() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        String string = "";
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(string, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getParameterCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return info.getParameterCount() > 0 || info.hasReturnType() || info.hasThisType() || info.isConstructor() || info.isInterface();
 *  */
    @Test
    public void testIsFunctionTypeDeclaration_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(FunctionTypeBuilder.java:581) */
        FunctionTypeBuilder.isFunctionTypeDeclaration(null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)}
     */
    @Test
    public void testIsFunctionTypeDeclarationThrowsNPE() {
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(FunctionTypeBuilder.java:581) */
        FunctionTypeBuilder.isFunctionTypeDeclaration(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testIsFunctionTypeDeclaration1() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionTypeDeclaration2() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertFalse(actual);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoInfoParameters = ((Map) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoInfoParameters);
    }
    
    @Test
    public void testIsFunctionTypeDeclaration3() throws Exception  {
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 512);
        
        boolean actual = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo);
        
        assertTrue(actual);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoInfoParameters = ((Map) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoInfoParameters);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOrCreateConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getOrCreateConstructor()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType fnType = typeRegistry.createConstructorType(fnName, sourceNode, parametersNode, returnType);
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowClassCastException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[13] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        FunctionNode parametersNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @47f535b6)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1207)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:532) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getOrCreateConstructor()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        ScriptOrFnNode parametersNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode", sourceNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:77)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:66)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(JSTypeRegistry.java:888)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1207)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:532) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getOrCreateConstructor()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType fnType = typeRegistry.createConstructorType(fnName, sourceNode, parametersNode, returnType);
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowClassCastException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String fnName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName", fnName);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        ScriptOrFnNode parametersNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        FunctionNode sourceNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode", sourceNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @47f535b6)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1207)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:532) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getOrCreateConstructor()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:74)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:66)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(JSTypeRegistry.java:888)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1207)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:532) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getOrCreateConstructor()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType fnType = typeRegistry.createConstructorType(fnName, sourceNode, parametersNode, returnType);
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:532) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOrCreateConstructor()
    
    @Test
    public void testGetOrCreateConstructor1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        nativeTypes[13] = ((JSType) noObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        FunctionPrototypeType returnType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 14]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.PrototypeObjectType.<init>(PrototypeObjectType.java:113)
            com.google.javascript.rhino.jstype.InstanceObjectType.<init>(InstanceObjectType.java:61)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:137)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1207)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:532) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getOrCreateConstructor()
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetOrCreateConstructor2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[35] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        Object sourceNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode", sourceNode);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetOrCreateConstructor3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        Object unresolvedTypeExpression = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        nativeTypes[35] = ((JSType) unresolvedTypeExpression);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Node sourceNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode", sourceNode);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getOrCreateConstructorMethod = functionTypeBuilderClazz.getDeclaredMethod("getOrCreateConstructor");
        getOrCreateConstructorMethod.setAccessible(true);
        java.lang.Object[] getOrCreateConstructorMethodArguments = new java.lang.Object[0];
        try {
            getOrCreateConstructorMethod.invoke(functionTypeBuilder, getOrCreateConstructorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.setSourceNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSourceNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#setSourceNode(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetSourceNode_Return() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.setSourceNode(null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsVarArgsParameter_ReturnTrue() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", stringNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = stringNode;
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isVarArgs();}
 *  */
    @Test
    public void testIsVarArgsParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsVarArgs_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", stringNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = stringNode;
        isVarArgsParameterMethodArguments[1] = jSDocInfo;
        boolean actual = ((Boolean) isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isVarArgs();}
 *  */
    @Test
    public void testIsVarArgsParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsVarArgs() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", stringNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = stringNode;
        isVarArgsParameterMethodArguments[1] = jSDocInfo;
        boolean actual = ((Boolean) isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments));
        
        assertFalse(actual);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        Map finalJSDocInfoInfoParameters = ((Map) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters"));
        
        assertNull(finalJSDocInfoInfoParameters);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isVarArgs();}
 *  */
    @Test
    public void testIsVarArgsParameter_ReturnInfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsVarArgs_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", stringNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = stringNode;
        isVarArgsParameterMethodArguments[1] = jSDocInfo;
        boolean actual = ((Boolean) isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isVarArgsParameter(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String paramName = param.getString();
 *  */
    @Test
    public void testIsVarArgsParameter_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter(FunctionTypeBuilder.java:411) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", nodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = ((Object) null);
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: codingConvention.isVarArgsParameter(param)
 *  */
    @Test
    public void testIsVarArgsParameter_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter(FunctionTypeBuilder.java:407) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", nodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = ((Object) null);
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: codingConvention.isVarArgsParameter(param)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsVarArgsParameter_ThrowIllegalStateException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", scriptOrFnNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = scriptOrFnNode;
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: codingConvention.isVarArgsParameter(param)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsVarArgsParameter_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", scriptOrFnNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = scriptOrFnNode;
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String paramName = param.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsVarArgsParameter_ThrowIllegalStateException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", scriptOrFnNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = scriptOrFnNode;
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testIsVarArgsParameter1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", stringNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = stringNode;
        isVarArgsParameterMethodArguments[1] = jSDocInfo;
        boolean actual = ((Boolean) isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testIsVarArgsParameter2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        LinkedHashMap parameters = new LinkedHashMap();
        JSTypeExpression jSTypeExpression = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        parameters.put(null, jSTypeExpression);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "parameters", parameters);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.JSTypeExpression.isVarArgs(JSTypeExpression.java:93)
            com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter(FunctionTypeBuilder.java:413) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", stringNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = stringNode;
        isVarArgsParameterMethodArguments[1] = jSDocInfo;
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsVarArgsParameter3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", scriptOrFnNodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = scriptOrFnNode;
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null && info.hasReturnType()): False}
 * @utbot.executesCondition {@code (templateTypeName != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferReturnType_TemplateTypeNameEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int functionTypeBuilderTypeRegistryNativeTypesSize = functionTypeBuilderTypeRegistryNativeTypes.length;
        assertEquals(functionTypeBuilderTypeRegistryNativeTypesSize, actualTypeRegistryNativeTypes.length);
        assertTrue(deepEquals(functionTypeBuilderTypeRegistryNativeTypes, actualTypeRegistryNativeTypes));
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertNull(actualTypeRegistryResolveMode);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry1 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes0 = ((JSType) get(functionTypeBuilderTypeRegistry1TypeRegistryNativeTypes, 0));
        JSTypeRegistry functionTypeBuilderTypeRegistry2 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes1 = ((JSType) get(functionTypeBuilderTypeRegistry2TypeRegistryNativeTypes, 1));
        JSTypeRegistry functionTypeBuilderTypeRegistry3 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes2 = ((JSType) get(functionTypeBuilderTypeRegistry3TypeRegistryNativeTypes, 2));
        JSTypeRegistry functionTypeBuilderTypeRegistry4 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes3 = ((JSType) get(functionTypeBuilderTypeRegistry4TypeRegistryNativeTypes, 3));
        JSTypeRegistry functionTypeBuilderTypeRegistry5 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes4 = ((JSType) get(functionTypeBuilderTypeRegistry5TypeRegistryNativeTypes, 4));
        JSTypeRegistry functionTypeBuilderTypeRegistry6 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes5 = ((JSType) get(functionTypeBuilderTypeRegistry6TypeRegistryNativeTypes, 5));
        JSTypeRegistry functionTypeBuilderTypeRegistry7 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes6 = ((JSType) get(functionTypeBuilderTypeRegistry7TypeRegistryNativeTypes, 6));
        JSTypeRegistry functionTypeBuilderTypeRegistry8 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes7 = ((JSType) get(functionTypeBuilderTypeRegistry8TypeRegistryNativeTypes, 7));
        JSTypeRegistry functionTypeBuilderTypeRegistry9 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes8 = ((JSType) get(functionTypeBuilderTypeRegistry9TypeRegistryNativeTypes, 8));
        JSTypeRegistry functionTypeBuilderTypeRegistry10 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes9 = ((JSType) get(functionTypeBuilderTypeRegistry10TypeRegistryNativeTypes, 9));
        JSTypeRegistry functionTypeBuilderTypeRegistry11 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes10 = ((JSType) get(functionTypeBuilderTypeRegistry11TypeRegistryNativeTypes, 10));
        JSTypeRegistry functionTypeBuilderTypeRegistry12 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes11 = ((JSType) get(functionTypeBuilderTypeRegistry12TypeRegistryNativeTypes, 11));
        JSTypeRegistry functionTypeBuilderTypeRegistry13 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes12 = ((JSType) get(functionTypeBuilderTypeRegistry13TypeRegistryNativeTypes, 12));
        JSTypeRegistry functionTypeBuilderTypeRegistry14 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes13 = ((JSType) get(functionTypeBuilderTypeRegistry14TypeRegistryNativeTypes, 13));
        JSTypeRegistry functionTypeBuilderTypeRegistry15 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes14 = ((JSType) get(functionTypeBuilderTypeRegistry15TypeRegistryNativeTypes, 14));
        JSTypeRegistry functionTypeBuilderTypeRegistry16 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes15 = ((JSType) get(functionTypeBuilderTypeRegistry16TypeRegistryNativeTypes, 15));
        JSTypeRegistry functionTypeBuilderTypeRegistry17 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes16 = ((JSType) get(functionTypeBuilderTypeRegistry17TypeRegistryNativeTypes, 16));
        JSTypeRegistry functionTypeBuilderTypeRegistry18 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes17 = ((JSType) get(functionTypeBuilderTypeRegistry18TypeRegistryNativeTypes, 17));
        JSTypeRegistry functionTypeBuilderTypeRegistry19 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes18 = ((JSType) get(functionTypeBuilderTypeRegistry19TypeRegistryNativeTypes, 18));
        JSTypeRegistry functionTypeBuilderTypeRegistry20 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes19 = ((JSType) get(functionTypeBuilderTypeRegistry20TypeRegistryNativeTypes, 19));
        JSTypeRegistry functionTypeBuilderTypeRegistry21 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes20 = ((JSType) get(functionTypeBuilderTypeRegistry21TypeRegistryNativeTypes, 20));
        JSTypeRegistry functionTypeBuilderTypeRegistry22 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes21 = ((JSType) get(functionTypeBuilderTypeRegistry22TypeRegistryNativeTypes, 21));
        JSTypeRegistry functionTypeBuilderTypeRegistry23 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes22 = ((JSType) get(functionTypeBuilderTypeRegistry23TypeRegistryNativeTypes, 22));
        JSTypeRegistry functionTypeBuilderTypeRegistry24 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes23 = ((JSType) get(functionTypeBuilderTypeRegistry24TypeRegistryNativeTypes, 23));
        JSTypeRegistry functionTypeBuilderTypeRegistry25 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes24 = ((JSType) get(functionTypeBuilderTypeRegistry25TypeRegistryNativeTypes, 24));
        JSTypeRegistry functionTypeBuilderTypeRegistry26 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes25 = ((JSType) get(functionTypeBuilderTypeRegistry26TypeRegistryNativeTypes, 25));
        JSTypeRegistry functionTypeBuilderTypeRegistry27 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes26 = ((JSType) get(functionTypeBuilderTypeRegistry27TypeRegistryNativeTypes, 26));
        JSTypeRegistry functionTypeBuilderTypeRegistry28 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes27 = ((JSType) get(functionTypeBuilderTypeRegistry28TypeRegistryNativeTypes, 27));
        JSTypeRegistry functionTypeBuilderTypeRegistry29 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes28 = ((JSType) get(functionTypeBuilderTypeRegistry29TypeRegistryNativeTypes, 28));
        JSTypeRegistry functionTypeBuilderTypeRegistry30 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes29 = ((JSType) get(functionTypeBuilderTypeRegistry30TypeRegistryNativeTypes, 29));
        JSTypeRegistry functionTypeBuilderTypeRegistry31 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes30 = ((JSType) get(functionTypeBuilderTypeRegistry31TypeRegistryNativeTypes, 30));
        JSTypeRegistry functionTypeBuilderTypeRegistry32 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes31 = ((JSType) get(functionTypeBuilderTypeRegistry32TypeRegistryNativeTypes, 31));
        JSTypeRegistry functionTypeBuilderTypeRegistry33 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes32 = ((JSType) get(functionTypeBuilderTypeRegistry33TypeRegistryNativeTypes, 32));
        JSTypeRegistry functionTypeBuilderTypeRegistry34 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes33 = ((JSType) get(functionTypeBuilderTypeRegistry34TypeRegistryNativeTypes, 33));
        JSTypeRegistry functionTypeBuilderTypeRegistry35 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes34 = ((JSType) get(functionTypeBuilderTypeRegistry35TypeRegistryNativeTypes, 34));
        JSTypeRegistry functionTypeBuilderTypeRegistry36 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes35 = ((JSType) get(functionTypeBuilderTypeRegistry36TypeRegistryNativeTypes, 35));
        JSTypeRegistry functionTypeBuilderTypeRegistry37 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry37TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry37, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes36 = ((JSType) get(functionTypeBuilderTypeRegistry37TypeRegistryNativeTypes, 36));
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes8);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes9);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes10);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes11);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes12);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes13);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes14);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes15);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes16);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes17);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes18);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes19);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes20);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes21);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes22);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes23);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes24);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes25);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes26);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes27);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes28);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes29);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes30);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes31);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes32);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes33);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes34);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes35);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes36);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null && info.hasReturnType()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testInferReturnType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:201) */
        functionTypeBuilder.inferReturnType(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null && info.hasReturnType()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testInferReturnType_ThrowNullPointerException_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:201) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null && info.hasReturnType()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getNativeType(UNKNOWN_TYPE)
 *  */
    @Test
    public void testInferReturnType_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:201) */
        functionTypeBuilder.inferReturnType(null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null && info.hasReturnType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getReturnType()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSTypeExpression#evaluate(com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info.getReturnType().evaluate(scope, typeRegistry)
 *  */
    @Test
    public void testInferReturnType_ThrowNullPointerException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null && info.hasReturnType()): False}
 * @utbot.executesCondition {@code (templateTypeName != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType.restrictByNotNullOrUndefined().isTemplateType()
 *  */
    @Test
    public void testInferReturnType_ThrowNullPointerException_3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:203) */
        functionTypeBuilder.inferReturnType(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testInferReturnType1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(40);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualTypeRegistryNativeTypes);
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode functionTypeBuilderTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertEquals(functionTypeBuilderTypeRegistryResolveMode, actualTypeRegistryResolveMode);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    @Test
    public void testInferReturnType2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(40);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualTypeRegistryNativeTypes);
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode functionTypeBuilderTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertEquals(functionTypeBuilderTypeRegistryResolveMode, actualTypeRegistryResolveMode);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    @Test
    public void testInferReturnType3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(40);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualTypeRegistryNativeTypes);
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode functionTypeBuilderTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertEquals(functionTypeBuilderTypeRegistryResolveMode, actualTypeRegistryResolveMode);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    @Test
    public void testInferReturnType4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(40);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry functionTypeBuilderTypeRegistry = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        ErrorReporter actualTypeRegistryReporter = ((ErrorReporter) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "reporter"));
        assertNull(actualTypeRegistryReporter);
        
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        assertNull(actualTypeRegistryNativeTypes);
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryEnumTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "enumTypeNames"));
        assertNull(actualTypeRegistryEnumTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryGreatestSubtypeByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "greatestSubtypeByProperty"));
        assertNull(actualTypeRegistryGreatestSubtypeByProperty);
        
        Multimap actualTypeRegistryInterfaceToImplementors = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "interfaceToImplementors"));
        assertNull(actualTypeRegistryInterfaceToImplementors);
        
        Multimap actualTypeRegistryUnresolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "unresolvedNamedTypes"));
        assertNull(actualTypeRegistryUnresolvedNamedTypes);
        
        Multimap actualTypeRegistryResolvedNamedTypes = ((Multimap) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolvedNamedTypes"));
        assertNull(actualTypeRegistryResolvedNamedTypes);
        
        boolean actualTypeRegistryLastGeneration = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "lastGeneration"));
        assertFalse(actualTypeRegistryLastGeneration);
        
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertNull(actualTypeRegistryTemplateTypeName);
        
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        assertNull(actualTypeRegistryTemplateType);
        
        boolean actualTypeRegistryTolerateUndefinedValues = ((Boolean) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "tolerateUndefinedValues"));
        assertFalse(actualTypeRegistryTolerateUndefinedValues);
        
        JSTypeRegistry.ResolveMode functionTypeBuilderTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        JSTypeRegistry.ResolveMode actualTypeRegistryResolveMode = ((JSTypeRegistry.ResolveMode) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveMode"));
        assertEquals(functionTypeBuilderTypeRegistryResolveMode, actualTypeRegistryResolveMode);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    @Test(expected = StackOverflowError.class)
    public void testInferReturnType5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testInferReturnType6() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", root);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType7() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[15];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(122);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 15]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1344)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testInferReturnType8() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(304);
        setField(root, "com.google.javascript.rhino.Node", "first", root);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testInferReturnType9() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(105);
        setField(root, "com.google.javascript.rhino.Node", "first", root);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType10() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        InstanceObjectType returnType = ((InstanceObjectType) createInstance("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:218)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:203) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType11() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:218)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:203) */
        functionTypeBuilder.inferReturnType(null);
    }
    
    @Test
    public void testInferReturnType12() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(302);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1325)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType13() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(301);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:169)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1338)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType14() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(301);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:169)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1338)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType15() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(306);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1295)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1301)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType16() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(307);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1295)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1316)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType17() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(40);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getType(JSTypeRegistry.java:737)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getType(JSTypeRegistry.java:769)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1347)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType18() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(81);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createRecordTypeFromNodes(JSTypeRegistry.java:1456)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1297)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType19() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(304);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1308)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType20() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(79);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1329)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType21() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(124);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1341)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType22() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1382)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType23() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(305);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1295)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1321)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1274)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:200) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType24() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(40);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType25() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType26() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType27() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType28() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(304);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 41);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType29() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType30() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(40);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType31() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    @Test(timeout = 1000L)
    public void testInferReturnType32() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildAndRegister()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: parametersNode == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuildAndRegister_ThrowIllegalStateException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        VoidType returnType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: parametersNode == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuildAndRegister_ThrowIllegalStateException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        
        functionTypeBuilder.buildAndRegister();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildAndRegister()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: returnType = typeRegistry.getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testBuildAndRegister_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:474) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): False}
 * @utbot.executesCondition {@code (isInterface): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: fnType = typeRegistry.createInterfaceType(fnName, sourceNode);
 *  */
    @Test
    public void testBuildAndRegister_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        TemplateType returnType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        Node sourceNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode", sourceNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:150)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:163)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createInterfaceType(JSTypeRegistry.java:1218)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:486) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): False}
 * @utbot.executesCondition {@code (isInterface): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fnType = typeRegistry.createInterfaceType(fnName, sourceNode);
 *  */
    @Test
    public void testBuildAndRegister_ThrowClassCastException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[13] = ((JSType) numberType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @47f535b6)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:150)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:163)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createInterfaceType(JSTypeRegistry.java:1218)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:486) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType = typeRegistry.getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:474) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): False}
 * @utbot.executesCondition {@code (isInterface): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createInterfaceType(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnType = typeRegistry.createInterfaceType(fnName, sourceNode);
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        VoidType returnType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:486) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): True}
 * @utbot.invokes com.google.javascript.jscomp.FunctionTypeBuilder#getOrCreateConstructor()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnType = getOrCreateConstructor();
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        VoidType returnType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:532)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:484) */
        functionTypeBuilder.buildAndRegister();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildAndRegister()
    
    @Test(expected = IllegalArgumentException.class)
    public void testBuildAndRegister1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[13] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        functionTypeBuilder.buildAndRegister();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildAndRegister()
    
    @Test
    public void testBuildAndRegister2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        VoidType returnType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:128)
            com.google.javascript.rhino.jstype.FunctionBuilder.build(FunctionBuilder.java:148)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:499) */
        functionTypeBuilder.buildAndRegister();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (owner != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_InfoEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(null, null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (owner != null): True}
 * @utbot.executesCondition {@code (info == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasType()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_InfoNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(jSDocInfo, scriptOrFnNode);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (owner != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_OwnerEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(jSDocInfo, null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getType(scope, ownerTypeName, sourceName, owner.getLineno(), owner.getCharno())
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:308) */
        functionTypeBuilder.inferThisType(null, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getType(scope, ownerTypeName, sourceName, owner.getLineno(), owner.getCharno())
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-254);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:308) */
        functionTypeBuilder.inferThisType(null, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getType(scope, ownerTypeName, sourceName, owner.getLineno(), owner.getCharno())
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:308) */
        functionTypeBuilder.inferThisType(null, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getType(scope, ownerTypeName, sourceName, owner.getLineno(), owner.getCharno())
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException_3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:308) */
        functionTypeBuilder.inferThisType(jSDocInfo, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: typeRegistry.getType(scope, ownerTypeName, sourceName, owner.getLineno(), owner.getCharno())
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException_4() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:308) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferThisTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("inferThisType", jSDocInfoType, stringNodeType);
        inferThisTypeMethod.setAccessible(true);
        java.lang.Object[] inferThisTypeMethodArguments = new java.lang.Object[2];
        inferThisTypeMethodArguments[0] = jSDocInfo;
        inferThisTypeMethodArguments[1] = stringNode;
        try {
            inferThisTypeMethod.invoke(functionTypeBuilder, inferThisTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String ownerTypeName = owner.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInferThisType_ThrowUnsupportedOperationException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        functionTypeBuilder.inferThisType(null, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String ownerTypeName = owner.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testInferThisType_ThrowUnsupportedOperationException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        functionTypeBuilder.inferThisType(null, scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (objType != null): True}
 * @utbot.executesCondition {@code (info == null): False}
 * @utbot.executesCondition {@code (!info.hasType()): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_InfoHasType() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(jSDocInfo, templateType);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (objType != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_ObjTypeEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(null, voidType);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (objType != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_ObjTypeEqualsNull_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(null, null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (objType != null): True}
 * @utbot.executesCondition {@code (info == null): False}
 * @utbot.executesCondition {@code (!info.hasType()): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_NotInfoHasType() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        ObjectType initialFunctionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(jSDocInfo, templateType);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType functionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        String actualThisTypeName = ((String) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualThisTypeName);
        
        ObjectType actualThisTypeReferencedType = ((ObjectType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualThisTypeReferencedType);
        
        boolean actualThisTypeVisited = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualThisTypeVisited);
        
        JSDocInfo actualThisTypeDocInfo = ((JSDocInfo) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualThisTypeDocInfo);
        
        boolean actualThisTypeUnknown = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualThisTypeUnknown);
        
        boolean actualThisTypeResolved = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualThisTypeResolved);
        
        JSType actualThisTypeResolveResult = ((JSType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualThisTypeResolveResult);
        
        JSTypeRegistry actualThisTypeRegistry = ((JSTypeRegistry) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualThisTypeRegistry);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        ObjectType finalFunctionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        
        assertFalse(initialFunctionTypeBuilderThisType == finalFunctionTypeBuilderThisType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (objType != null): True}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_InfoEqualsNull1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        ObjectType initialFunctionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(null, templateType);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType functionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        String actualThisTypeName = ((String) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualThisTypeName);
        
        ObjectType actualThisTypeReferencedType = ((ObjectType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualThisTypeReferencedType);
        
        boolean actualThisTypeVisited = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualThisTypeVisited);
        
        JSDocInfo actualThisTypeDocInfo = ((JSDocInfo) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualThisTypeDocInfo);
        
        boolean actualThisTypeUnknown = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualThisTypeUnknown);
        
        boolean actualThisTypeResolved = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualThisTypeResolved);
        
        JSType actualThisTypeResolveResult = ((JSType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualThisTypeResolveResult);
        
        JSTypeRegistry actualThisTypeRegistry = ((JSTypeRegistry) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualThisTypeRegistry);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        ObjectType finalFunctionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        
        assertFalse(initialFunctionTypeBuilderThisType == finalFunctionTypeBuilderThisType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.addParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): True}
 * @utbot.executesCondition {@code (!builder.addOptionalParams(paramType)): True}
 * @utbot.executesCondition {@code (!warnedAboutArgList): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addOptionalParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.returnsFrom {@code return emittedWarning;}
 *  */
    @Test
    public void testAddParameter_WarnedAboutArgList() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, jSTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = ((Object) null);
        addParameterMethodArguments[2] = true;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): True}
 * @utbot.executesCondition {@code (!builder.addVarArgs(paramType)): True}
 * @utbot.executesCondition {@code (!warnedAboutArgList): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addVarArgs(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return emittedWarning;}
 *  */
    @Test
    public void testAddParameter_WarnedAboutArgList_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, jSTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = ((Object) null);
        addParameterMethodArguments[2] = true;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): False}
 * @utbot.executesCondition {@code (!builder.addRequiredParams(paramType)): True}
 * @utbot.executesCondition {@code (!warnedAboutArgList): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addRequiredParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.returnsFrom {@code return emittedWarning;}
 *  */
    @Test
    public void testAddParameter_WarnedAboutArgList_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        ScriptOrFnNode root = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 36);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, jSTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = ((Object) null);
        addParameterMethodArguments[2] = true;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = false;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addOptionalParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !builder.addOptionalParams(paramType) && !warnedAboutArgList
 *  */
    @Test
    public void testAddParameter_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addOptionalParams(FunctionParamBuilder.java:85)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:445) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, templateTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = templateType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addVarArgs(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !builder.addVarArgs(paramType) && !warnedAboutArgList
 *  */
    @Test
    public void testAddParameter_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:450) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, jSTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = ((Object) null);
        addParameterMethodArguments[1] = ((Object) null);
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addOptionalParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !builder.addOptionalParams(paramType) && !warnedAboutArgList
 *  */
    @Test
    public void testAddParameter_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:445) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, jSTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = ((Object) null);
        addParameterMethodArguments[1] = ((Object) null);
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addRequiredParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !builder.addRequiredParams(paramType) && !warnedAboutArgList
 *  */
    @Test
    public void testAddParameter_ThrowNullPointerException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:455) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, jSTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = ((Object) null);
        addParameterMethodArguments[1] = ((Object) null);
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addRequiredParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !builder.addRequiredParams(paramType) && !warnedAboutArgList
 *  */
    @Test
    public void testAddParameter_ThrowNullPointerException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionParamBuilder.hasOptionalOrVarArgs(FunctionParamBuilder.java:133)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addRequiredParams(FunctionParamBuilder.java:63)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:455) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, jSTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = ((Object) null);
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferInheritance(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferInheritance(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferInheritance_InfoEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferInheritance(null);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferInheritance(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (isConstructor || isInterface): True}
 * @utbot.executesCondition {@code (info.getImplementedInterfaceCount() > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferInheritance_InfoGetImplementedInterfaceCountLessOrEqualZero() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferInheritance(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferInheritance(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (isConstructor || isInterface): True}
 * @utbot.executesCondition {@code (info.getImplementedInterfaceCount() > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferInheritance_InfoGetImplementedInterfaceCountLessOrEqualZero_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferInheritance(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        List finalJSDocInfoInfoImplementedInterfaces = ((List) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces"));
        
        assertNull(finalJSDocInfoInfoImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferInheritance(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (isConstructor || isInterface): True}
 * @utbot.executesCondition {@code (info.getImplementedInterfaceCount() > 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferInheritance_InfoGetImplementedInterfaceCountLessOrEqualZero_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferInheritance(jSDocInfo);
        
        String actualFnName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName"));
        assertNull(actualFnName);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler"));
        assertNull(actualCompiler);
        
        CodingConvention actualCodingConvention = ((CodingConvention) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention"));
        assertNull(actualCodingConvention);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Node actualErrorRoot = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot"));
        assertNull(actualErrorRoot);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName"));
        assertNull(actualSourceName);
        
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        assertNull(actualScope);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        Node actualSourceNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceNode"));
        assertNull(actualSourceNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportWarning(com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportWarning_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionNode errorRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = diagnosticType;
        reportWarningMethodArguments[1] = ((Object) null);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportWarning_ThrowIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {5};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.IndexOutOfBoundsException: start 0, end 5, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = diagnosticType;
        reportWarningMethodArguments[1] = ((Object) null);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportWarning_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionNode errorRoot = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {-1};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = {};
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1279)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = diagnosticType;
        reportWarningMethodArguments[1] = ((Object) stringArray);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportWarning_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = diagnosticType;
        reportWarningMethodArguments[1] = ((Object) null);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportWarning_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        java.text.Format[] formats = {};
        format.setFormats(formats);
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {0};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[1];
        String string = "";
        stringArray[0] = string;
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1284)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = diagnosticType;
        reportWarningMethodArguments[1] = ((Object) stringArray);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, warning, args));
 *  */
    @Test
    public void testReportWarning_ThrowNullPointerException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = ((Object) null);
        reportWarningMethodArguments[1] = ((Object) null);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, warning, args));
 *  */
    @Test
    public void testReportWarning_ThrowNullPointerException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ScriptOrFnNode errorRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = ((Object) null);
        reportWarningMethodArguments[1] = ((Object) null);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, warning, args));
 *  */
    @Test
    public void testReportWarning_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = ((Object) null);
        reportWarningMethodArguments[1] = ((Object) null);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, warning, args));
 *  */
    @Test
    public void testReportWarning_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:141)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:156)
            com.google.javascript.jscomp.JSError.make(JSError.java:110)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:570) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportWarningMethod = functionTypeBuilderClazz.getDeclaredMethod("reportWarning", diagnosticTypeType, stringArrayType);
        reportWarningMethod.setAccessible(true);
        java.lang.Object[] reportWarningMethodArguments = new java.lang.Object[2];
        reportWarningMethodArguments[0] = diagnosticType;
        reportWarningMethodArguments[1] = ((Object) null);
        try {
            reportWarningMethod.invoke(functionTypeBuilder, reportWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): False}
 *  */
    @Test
    public void testMaybeSetBaseType_BaseTypeEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", functionTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = ((Object) null);
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 *  */
    @Test
    public void testMaybeSetBaseType_BaseTypeNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoObjectType baseType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(prototype, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        FunctionPrototypeType noObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        ObjectType initialNoObjectTypePrototypeImplicitPrototype = ((ObjectType) getFieldValue(noObjectTypePrototype, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType noObjectTypePrototype1 = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        ObjectType finalNoObjectTypePrototypeImplicitPrototype = ((ObjectType) getFieldValue(noObjectTypePrototype1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototype"));
        
        assertFalse(initialNoObjectTypePrototypeImplicitPrototype == finalNoObjectTypePrototypeImplicitPrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 *  */
    @Test
    public void testMaybeSetBaseType_BaseTypeNotEqualsNull_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoObjectType baseType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (baseType != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoObjectType baseType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType_4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoObjectType baseType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType_5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionType baseType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType_6() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        UnknownType baseType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        TemplateType baseType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(baseType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        TemplateType baseType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(baseType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType_3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        TemplateType baseType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(baseType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType_7() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        TemplateType baseType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(baseType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        FunctionPrototypeType initialNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        FunctionPrototypeType finalNoObjectTypePrototype = ((FunctionPrototypeType) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype"));
        
        assertFalse(initialNoObjectTypePrototype == finalNoObjectTypePrototype);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnType.setPrototypeBasedOn(baseType);
 *  */
    @Test
    public void testMaybeSetBaseType_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object baseType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType(FunctionTypeBuilder.java:514) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", functionTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = ((Object) null);
        try {
            maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#setPrototypeBasedOn(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: fnType.setPrototypeBasedOn(baseType);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMaybeSetBaseType_ThrowIllegalStateException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoObjectType baseType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        FunctionPrototypeType prototype = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototype", prototype);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        try {
            maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields910826810464900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields910826810464900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass910826810475400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910826810464900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910826810475400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields910826811044100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields910826811044100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass910826811046100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields910826811044100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass910826811046100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

