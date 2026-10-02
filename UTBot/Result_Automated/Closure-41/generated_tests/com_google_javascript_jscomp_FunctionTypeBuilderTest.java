package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.text.MessageFormat;
import java.lang.reflect.Method;
import java.text.Format;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents;
import com.google.javascript.rhino.jstype.JSType;
import java.util.List;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import com.google.javascript.rhino.jstype.FunctionType;
import java.util.Map;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.ErrorReporter;
import java.util.Set;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.NullType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.rhino.jstype.StringType;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.jstype.NumberType;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
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
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        String sourceName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {-1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.IndexOutOfBoundsException: start 0, end -1, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = " ";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
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
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
    public void testReportError_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler", compiler);
        Object errorRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = " ";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        java.text.Format[] formats = {};
        format.setFormats(formats);
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {0};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = pattern;
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1284)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
        String pattern = " ";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, error, args));
 *  */
    @Test
    public void testReportError_ThrowNullPointerException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object errorRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
    public void testReportError_ThrowNullPointerException_4() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object errorRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, error, args));
 *  */
    @Test
    public void testReportError_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#report(com.google.javascript.jscomp.JSError)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, error, args));
 *  */
    @Test
    public void testReportError_ThrowNullPointerException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object errorRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        String pattern = "";
        setField(format, "java.text.MessageFormat", "pattern", pattern);
        setField(format, "java.text.MessageFormat", "maxOffset", -1);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportError] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.reportError(FunctionTypeBuilder.java:694) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (thisType == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_ThisTypeEqualsNull_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(null, allType);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (thisType == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_ThisTypeEqualsNull() throws Exception  {
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (thisType == null): True}
 * @utbot.executesCondition {@code (info == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_InfoEqualsNull() throws Exception  {
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType functionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        String actualThisTypeName = ((String) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualThisTypeName);
        
        JSType actualThisTypeReferencedType = ((JSType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualThisTypeReferencedType);
        
        ObjectType actualThisTypeReferencedObjType = ((ObjectType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualThisTypeReferencedObjType);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        ObjectType finalFunctionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        
        assertFalse(initialFunctionTypeBuilderThisType == finalFunctionTypeBuilderThisType);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (thisType == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_ThisTypeNotEqualsNull_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object thisType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType", thisType);
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType functionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        JSType actualThisTypeParameterType = ((JSType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType"));
        assertNull(actualThisTypeParameterType);
        
        JSType actualThisTypeReferencedType = ((JSType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualThisTypeReferencedType);
        
        ObjectType actualThisTypeReferencedObjType = ((ObjectType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualThisTypeReferencedObjType);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (thisType == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_ThisTypeNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType thisType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType", thisType);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType functionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        Object actualThisTypeCall = getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualThisTypeCall);
        
        ObjectType.Property actualThisTypePrototypeSlot = ((ObjectType.Property) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualThisTypePrototypeSlot);
        
        Object actualThisTypeKind = getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualThisTypeKind);
        
        ObjectType actualThisTypeTypeOfThis = (((FunctionType) actualThisType)).getTypeOfThis();
        assertNull(actualThisTypeTypeOfThis);
        
        Node actualThisTypeSource = (((FunctionType) actualThisType)).getSource();
        assertNull(actualThisTypeSource);
        
        List actualThisTypeImplementedInterfaces = ((List) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualThisTypeImplementedInterfaces);
        
        List actualThisTypeExtendedInterfaces = ((List) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualThisTypeExtendedInterfaces);
        
        List actualThisTypeSubTypes = (((FunctionType) actualThisType)).getSubTypes();
        assertNull(actualThisTypeSubTypes);
        
        String actualThisTypeTemplateTypeName = (((FunctionType) actualThisType)).getTemplateTypeName();
        assertNull(actualThisTypeTemplateTypeName);
        
        String actualThisTypeClassName = ((String) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualThisTypeClassName);
        
        Map actualThisTypeProperties = ((Map) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualThisTypeProperties);
        
        boolean actualThisTypeNativeType = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualThisTypeNativeType);
        
        ObjectType actualThisTypeImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualThisTypeImplicitPrototypeFallback);
        
        FunctionType actualThisTypeOwnerFunction = ((FunctionType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualThisTypeOwnerFunction);
        
        boolean actualThisTypePrettyPrint = ((Boolean) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualThisTypePrettyPrint);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (thisType == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_ThisTypeNotEqualsNull_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Object thisType = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType", thisType);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType1 = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(122);
        setField(thisType1, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType1);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(jSDocInfo, null);
        
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
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType functionTypeBuilderThisType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        JSType actualThisTypeParameterType = ((JSType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ParameterizedType", "parameterType"));
        assertNull(actualThisTypeParameterType);
        
        JSType actualThisTypeReferencedType = ((JSType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualThisTypeReferencedType);
        
        ObjectType actualThisTypeReferencedObjType = ((ObjectType) getFieldValue(actualThisType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualThisTypeReferencedObjType);
        
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
        JSTypeRegistry functionTypeBuilderTypeRegistry38 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry38TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes37 = ((JSType) get(functionTypeBuilderTypeRegistry38TypeRegistryNativeTypes, 37));
        JSTypeRegistry functionTypeBuilderTypeRegistry39 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistry39TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry39, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes38 = ((JSType) get(functionTypeBuilderTypeRegistry39TypeRegistryNativeTypes, 38));
        
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
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes37);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes38);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInferThisType_ThrowIllegalStateException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        functionTypeBuilder.inferThisType(jSDocInfo, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testInferThisType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(302);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1484)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:374) */
        functionTypeBuilder.inferThisType(jSDocInfo, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testInferThisType_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(304);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1467)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:374) */
        functionTypeBuilder.inferThisType(jSDocInfo, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        String sourceName = "";
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.hasTypeName(JSTypeRegistry.java:1437)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1428)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:374) */
        functionTypeBuilder.inferThisType(jSDocInfo, null);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(40);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.FunctionTypeBuilder$ThisTypeValidator.apply(FunctionTypeBuilder.java:193)
            com.google.javascript.jscomp.FunctionTypeBuilder$ThisTypeValidator.apply(FunctionTypeBuilder.java:183)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1130)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:398)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:374) */
        functionTypeBuilder.inferThisType(jSDocInfo, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferThisType(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_InfoEqualsNull1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_InfoNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(jSDocInfo);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getThisType()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSTypeExpression#evaluate(com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferThisType_JSTypeExpressionEvaluate() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(124);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferThisType(jSDocInfo);
        
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
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        Scope functionTypeBuilderScope = ((Scope) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        Map actualScopeVars = ((Map) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "vars"));
        assertNull(actualScopeVars);
        
        Scope actualScopeParent = actualScope.getParent();
        assertNull(actualScopeParent);
        
        int functionTypeBuilderScopeDepth = functionTypeBuilderScope.getDepth();
        int actualScopeDepth = actualScope.getDepth();
        assertEquals(functionTypeBuilderScopeDepth, actualScopeDepth);
        
        Node actualScopeRootNode = actualScope.getRootNode();
        assertNull(actualScopeRootNode);
        
        ObjectType actualScopeThisType = ((ObjectType) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualScopeThisType);
        
        boolean actualScopeIsBottom = ((Boolean) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualScopeIsBottom);
        
        Scope.Var actualScopeArguments = ((Scope.Var) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "arguments"));
        assertNull(actualScopeArguments);
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferThisType(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: info.getThisType().evaluate(scope, typeRegistry)
 *  */
    @Test
    public void testInferThisType_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(124);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1500)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: info.getThisType().evaluate(scope, typeRegistry)
 *  */
    @Test
    public void testInferThisType_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(308);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1488)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: info.getThisType().evaluate(scope, typeRegistry)
 *  */
    @Test
    public void testInferThisType_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(122);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1503)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info.getThisType().evaluate(scope, typeRegistry)
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException_11() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.hasTypeName(JSTypeRegistry.java:1437)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1428)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info.getThisType().evaluate(scope, typeRegistry)
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1454)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: info.getThisType().evaluate(scope, typeRegistry)
 *  */
    @Test
    public void testInferThisType_ThrowNullPointerException_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(105);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1539)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inferThisType(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferThisType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasThisType()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getThisType()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSTypeExpression#evaluate(com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: info.getThisType().evaluate(scope, typeRegistry)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testInferThisType_ThrowIllegalStateException1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.IMMEDIATE;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferThisType(com.google.javascript.rhino.JSDocInfo)
    
    @Test(expected = StackOverflowError.class)
    public void testInferThisType1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(105);
        setField(root, "com.google.javascript.rhino.Node", "first", root);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    @Test
    public void testInferThisType2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(305);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(301);
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:237)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:249)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1497)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1480)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    @Test
    public void testInferThisType3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_NAMES;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(305);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(309);
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createRecordTypeFromNodes(JSTypeRegistry.java:1620)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1456)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1480)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    @Test
    public void testInferThisType4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(305);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1503)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1480)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    
    @Test
    public void testInferThisType5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        JSTypeExpression thisType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(302);
        setField(thisType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "thisType", thisType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1484)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(FunctionTypeBuilder.java:394) */
        functionTypeBuilder.inferThisType(jSDocInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.setContents
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setContents(com.google.javascript.jscomp.FunctionTypeBuilder$FunctionContents)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#setContents(com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)}
 * @utbot.executesCondition {@code (contents != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetContents_ContentsEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.setContents(null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#setContents(com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)}
 * @utbot.executesCondition {@code (contents != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSetContents_ContentsNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.UnknownFunctionContents unknownFunctionContents = new FunctionTypeBuilder.UnknownFunctionContents();
        
        FunctionTypeBuilder.FunctionContents initialFunctionTypeBuilderContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.setContents(unknownFunctionContents);
        
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
        
        FunctionTypeBuilder.FunctionContents functionTypeBuilderContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        FunctionTypeBuilder.FunctionContents finalFunctionTypeBuilderContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        
        assertFalse(initialFunctionTypeBuilderContents == finalFunctionTypeBuilderContents);
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferInheritance(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (isConstructor || isInterface): True}
 * @utbot.executesCondition {@code (info.getImplementedInterfaceCount() > 0): False}
 * @utbot.executesCondition {@code (isInterface): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferInheritance_NotIsInterface() throws Exception  {
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferInheritance(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (isConstructor || isInterface): True}
 * @utbot.executesCondition {@code (info.getImplementedInterfaceCount() > 0): False}
 * @utbot.executesCondition {@code (isInterface): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferInheritance_NotIsInterface_1() throws Exception  {
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferInheritance(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (isConstructor || isInterface): True}
 * @utbot.executesCondition {@code (info.getImplementedInterfaceCount() > 0): False}
 * @utbot.executesCondition {@code (isInterface): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferInheritance_NotIsInterface_2() throws Exception  {
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        List finalJSDocInfoInfoImplementedInterfaces = ((List) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces"));
        
        assertNull(finalJSDocInfoInfoImplementedInterfaces);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inferInheritance(com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testInferInheritance1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 514);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List functionTypeBuilderExtendedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderExtendedInterfaces, actualExtendedInterfaces));
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertTrue(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsConstructor = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        boolean finalFunctionTypeBuilderIsInterface = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        
        assertTrue(finalFunctionTypeBuilderIsConstructor);
        
        assertTrue(finalFunctionTypeBuilderIsInterface);
    }
    
    @Test
    public void testInferInheritance2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsConstructor = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        
        assertTrue(finalFunctionTypeBuilderIsConstructor);
    }
    
    @Test
    public void testInferInheritance3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 512);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List functionTypeBuilderExtendedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderExtendedInterfaces, actualExtendedInterfaces));
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertTrue(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsInterface = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        
        assertTrue(finalFunctionTypeBuilderIsInterface);
    }
    
    @Test
    public void testInferInheritance4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 514);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List functionTypeBuilderExtendedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderExtendedInterfaces, actualExtendedInterfaces));
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertTrue(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsConstructor = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        boolean finalFunctionTypeBuilderIsInterface = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        List finalJSDocInfoInfoImplementedInterfaces = ((List) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces"));
        
        assertTrue(finalFunctionTypeBuilderIsConstructor);
        
        assertTrue(finalFunctionTypeBuilderIsInterface);
        
        assertNull(finalJSDocInfoInfoImplementedInterfaces);
    }
    
    @Test
    public void testInferInheritance5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 514);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List functionTypeBuilderExtendedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderExtendedInterfaces, actualExtendedInterfaces));
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertTrue(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsConstructor = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        boolean finalFunctionTypeBuilderIsInterface = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        
        assertTrue(finalFunctionTypeBuilderIsConstructor);
        
        assertTrue(finalFunctionTypeBuilderIsInterface);
    }
    
    @Test
    public void testInferInheritance6() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertTrue(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertFalse(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsConstructor = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        
        assertTrue(finalFunctionTypeBuilderIsConstructor);
    }
    
    @Test
    public void testInferInheritance7() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 512);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List functionTypeBuilderExtendedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderExtendedInterfaces, actualExtendedInterfaces));
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertTrue(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsInterface = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        
        Object jSDocInfoInfo = getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info");
        List finalJSDocInfoInfoImplementedInterfaces = ((List) getFieldValue(jSDocInfoInfo, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces"));
        
        assertTrue(finalFunctionTypeBuilderIsInterface);
        
        assertNull(finalJSDocInfoInfoImplementedInterfaces);
    }
    
    @Test
    public void testInferInheritance8() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 512);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List functionTypeBuilderImplementedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderImplementedInterfaces, actualImplementedInterfaces));
        
        List functionTypeBuilderExtendedInterfaces = ((List) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertTrue(deepEquals(functionTypeBuilderExtendedInterfaces, actualExtendedInterfaces));
        
        ObjectType actualBaseType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        assertNull(actualBaseType);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsConstructor = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor"));
        assertFalse(actualIsConstructor);
        
        boolean actualIsInterface = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        assertTrue(actualIsInterface);
        
        Node actualParametersNode = ((Node) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        assertNull(actualParametersNode);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        boolean finalFunctionTypeBuilderIsInterface = ((Boolean) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface"));
        
        assertTrue(finalFunctionTypeBuilderIsInterface);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inferInheritance(com.google.javascript.rhino.JSDocInfo)
    
    @Test(expected = IllegalStateException.class)
    public void testInferInheritance9() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(baseType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 514);
        
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferInheritance10() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(baseType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferInheritance11() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(baseType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 514);
        
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferInheritance12() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(baseType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferInheritance(com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testInferInheritance13() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(FunctionTypeBuilder.java:334) */
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test
    public void testInferInheritance14() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(40);
        setField(baseType, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeFunctionType(JSTypeRegistry.java:883)
            com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:158)
            com.google.javascript.jscomp.FunctionTypeBuilder$ExtendedTypeValidator.apply(FunctionTypeBuilder.java:144)
            com.google.javascript.jscomp.FunctionTypeBuilder$ExtendedTypeValidator.apply(FunctionTypeBuilder.java:137)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1130)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(FunctionTypeBuilder.java:330) */
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test
    public void testInferInheritance15() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.hasTypeName(JSTypeRegistry.java:1437)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1428)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(FunctionTypeBuilder.java:328) */
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test
    public void testInferInheritance16() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 514);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.hasTypeName(JSTypeRegistry.java:1437)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1428)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(FunctionTypeBuilder.java:328) */
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test
    public void testInferInheritance17() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 2);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1454)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(FunctionTypeBuilder.java:328) */
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test
    public void testInferInheritance18() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        JSTypeExpression baseType = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "baseType", baseType);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 514);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1454)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(FunctionTypeBuilder.java:328) */
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    
    @Test
    public void testInferInheritance19() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        ArrayList implementedInterfaces = new ArrayList();
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        implementedInterfaces.add(null);
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "implementedInterfaces", implementedInterfaces);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(FunctionTypeBuilder.java:349) */
        functionTypeBuilder.inferInheritance(jSDocInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (templateTypeName != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferReturnType_TemplateTypeNameEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (templateTypeName != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasReturnType()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferReturnType_InfoNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(jSDocInfo);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String functionTypeBuilderTemplateTypeName = ((String) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertEquals(functionTypeBuilderTemplateTypeName, actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (templateTypeName != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferReturnType_ReturnTypeEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String functionTypeBuilderTemplateTypeName = ((String) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertEquals(functionTypeBuilderTemplateTypeName, actualTemplateTypeName);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: returnType = info.getReturnType().evaluate(scope, typeRegistry);
 *  */
    @Test
    public void testInferReturnType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(302);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1484)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType = info.getReturnType().evaluate(scope, typeRegistry);
 *  */
    @Test
    public void testInferReturnType_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferReturnType(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType = info.getReturnType().evaluate(scope, typeRegistry);
 *  */
    @Test
    public void testInferReturnType_ThrowNullPointerException_1() throws Exception  {
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
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.hasTypeName(JSTypeRegistry.java:1437)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1428)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testInferReturnType1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(jSDocInfo);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    @Test
    public void testInferReturnType2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(jSDocInfo);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String functionTypeBuilderTemplateTypeName = ((String) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertEquals(functionTypeBuilderTemplateTypeName, actualTemplateTypeName);
        
    }
    
    @Test
    public void testInferReturnType3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        BooleanType returnType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferReturnType(null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String functionTypeBuilderTemplateTypeName = ((String) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertEquals(functionTypeBuilderTemplateTypeName, actualTemplateTypeName);
        
    }
    
    @Test
    public void testInferReturnType4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(308);
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
        
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int functionTypeBuilderTypeRegistryNativeTypesSize = functionTypeBuilderTypeRegistryNativeTypes.length;
        assertEquals(functionTypeBuilderTypeRegistryNativeTypesSize, actualTypeRegistryNativeTypes.length);
        assertTrue(deepEquals(functionTypeBuilderTypeRegistryNativeTypes, actualTypeRegistryNativeTypes));
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes0);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes1);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes2);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes3);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes4);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes5);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes6);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes7);
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes8);
    }
    
    @Test
    public void testInferReturnType5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        nativeTypes[35] = ((JSType) nullType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(304);
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
        
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int functionTypeBuilderTypeRegistryNativeTypesSize = functionTypeBuilderTypeRegistryNativeTypes.length;
        assertEquals(functionTypeBuilderTypeRegistryNativeTypesSize, actualTypeRegistryNativeTypes.length);
        assertTrue(deepEquals(functionTypeBuilderTypeRegistryNativeTypes, actualTypeRegistryNativeTypes));
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes36 = ((JSType) get(functionTypeBuilderTypeRegistry36TypeRegistryNativeTypes, 36));
        
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
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes36);
    }
    
    @Test
    public void testInferReturnType6() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[35] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(124);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        JSTypeExpression jSDocInfoType = ((JSTypeExpression) getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type"));
        Node jSDocInfoTypeTypeRoot = ((Node) getFieldValue(jSDocInfoType, "com.google.javascript.rhino.JSTypeExpression", "root"));
        JSType initialJSDocInfoTypeRootJsType = ((JSType) getFieldValue(jSDocInfoTypeTypeRoot, "com.google.javascript.rhino.Node", "jsType"));
        
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
        
        com.google.javascript.rhino.jstype.JSType[] functionTypeBuilderTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(functionTypeBuilderTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        com.google.javascript.rhino.jstype.JSType[] actualTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        int functionTypeBuilderTypeRegistryNativeTypesSize = functionTypeBuilderTypeRegistryNativeTypes.length;
        assertEquals(functionTypeBuilderTypeRegistryNativeTypesSize, actualTypeRegistryNativeTypes.length);
        assertTrue(deepEquals(functionTypeBuilderTypeRegistryNativeTypes, actualTypeRegistryNativeTypes));
        
        Map actualTypeRegistryNamesToTypes = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes"));
        assertNull(actualTypeRegistryNamesToTypes);
        
        Set actualTypeRegistryNamespaces = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namespaces"));
        assertNull(actualTypeRegistryNamespaces);
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String functionTypeBuilderTemplateTypeName = ((String) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertEquals(functionTypeBuilderTemplateTypeName, actualTemplateTypeName);
        
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
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes36 = ((JSType) get(functionTypeBuilderTypeRegistry36TypeRegistryNativeTypes, 36));
        
        JSTypeExpression jSDocInfoType1 = ((JSTypeExpression) getFieldValue(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type"));
        Node jSDocInfoType1TypeRoot = ((Node) getFieldValue(jSDocInfoType1, "com.google.javascript.rhino.JSTypeExpression", "root"));
        JSType finalJSDocInfoTypeRootJsType = ((JSType) getFieldValue(jSDocInfoType1TypeRoot, "com.google.javascript.rhino.Node", "jsType"));
        
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
        
        assertNull(finalFunctionTypeBuilderTypeRegistryNativeTypes36);
        
        assertFalse(initialJSDocInfoTypeRootJsType == finalJSDocInfoTypeRootJsType);
    }
    
    @Test
    public void testInferReturnType7() throws Exception  {
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
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(40);
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
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        Scope functionTypeBuilderScope = ((Scope) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        Scope actualScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope"));
        Map actualScopeVars = ((Map) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "vars"));
        assertNull(actualScopeVars);
        
        Scope actualScopeParent = actualScope.getParent();
        assertNull(actualScopeParent);
        
        int functionTypeBuilderScopeDepth = functionTypeBuilderScope.getDepth();
        int actualScopeDepth = actualScope.getDepth();
        assertEquals(functionTypeBuilderScopeDepth, actualScopeDepth);
        
        Node actualScopeRootNode = actualScope.getRootNode();
        assertNull(actualScopeRootNode);
        
        ObjectType actualScopeThisType = ((ObjectType) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualScopeThisType);
        
        boolean actualScopeIsBottom = ((Boolean) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualScopeIsBottom);
        
        Scope.Var actualScopeArguments = ((Scope.Var) getFieldValue(actualScope, "com.google.javascript.jscomp.Scope", "arguments"));
        assertNull(actualScopeArguments);
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType functionTypeBuilderReturnType = ((JSType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderReturnType, actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    @Test
    public void testInferReturnType8() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(308);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1488)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType9() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(304);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1467)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType10() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        UnionType returnType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:221)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:309) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType11() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        VoidType returnType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(returnType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:309) */
        functionTypeBuilder.inferReturnType(null);
    }
    
    @Test
    public void testInferReturnType12() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(301);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:237)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:249)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1497)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
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
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(122);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1503)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType14() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(307);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1454)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1475)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType15() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(305);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1454)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1480)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType16() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(306);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1454)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1460)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
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
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(105);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1539)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
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
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(309);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        String sourceName = "";
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "sourceName", sourceName);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.createRecordTypeFromNodes(JSTypeRegistry.java:1620)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodesInternal(JSTypeRegistry.java:1456)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createFromTypeNodes(JSTypeRegistry.java:1433)
            com.google.javascript.rhino.JSTypeExpression.evaluate(JSTypeExpression.java:100)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:303) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test
    public void testInferReturnType19() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        String templateTypeName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName", templateTypeName);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) root)).setType(124);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:221)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(FunctionTypeBuilder.java:309) */
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inferReturnType(com.google.javascript.rhino.JSDocInfo)
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType20() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType21() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        typeRegistry.setResolveMode(resolveMode);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType22() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType23() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(306);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType24() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(307);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testInferReturnType25() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1073741824);
        JSTypeExpression type = ((JSTypeExpression) createInstance("com.google.javascript.rhino.JSTypeExpression"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(304);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        setField(type, "com.google.javascript.rhino.JSTypeExpression", "root", root);
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "type", type);
        
        functionTypeBuilder.inferReturnType(jSDocInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 *  */
    @Test
    public void testMaybeSetBaseType() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): False}
 *  */
    @Test
    public void testMaybeSetBaseType_BaseTypeEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 *  */
    @Test
    public void testMaybeSetBaseType_BaseTypeNotEqualsNull_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        ObjectType functionTypeBuilderBaseType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        FunctionType initialFunctionTypeBuilderBaseTypeOwnerFunction = ((FunctionType) getFieldValue(functionTypeBuilderBaseType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        ObjectType.Property initialNoTypePrototypeSlot = ((ObjectType.Property) getFieldValue(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        ObjectType functionTypeBuilderBaseType1 = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        FunctionType finalFunctionTypeBuilderBaseTypeOwnerFunction = ((FunctionType) getFieldValue(functionTypeBuilderBaseType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        ObjectType.Property finalNoTypePrototypeSlot = ((ObjectType.Property) getFieldValue(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        
        assertFalse(initialFunctionTypeBuilderBaseTypeOwnerFunction == finalFunctionTypeBuilderBaseTypeOwnerFunction);
        
        assertFalse(initialNoTypePrototypeSlot == finalNoTypePrototypeSlot);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 *  */
    @Test
    public void testMaybeSetBaseType_BaseTypeNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", baseType);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fnType.setPrototypeBasedOn(baseType);
 *  */
    @Test
    public void testMaybeSetBaseType_ThrowClassCastException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        TemplateType type = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "type", type);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.PrototypeObjectType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.PrototypeObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:375)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:357)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:328)
            com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType(FunctionTypeBuilder.java:634) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noType;
        try {
            maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (baseType != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fnType.setPrototypeBasedOn(baseType);
 *  */
    @Test
    public void testMaybeSetBaseType_ThrowClassCastException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        TemplateType type = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "type", type);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.PrototypeObjectType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.PrototypeObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:375)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:357)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:328)
            com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType(FunctionTypeBuilder.java:634) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noType;
        try {
            maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !fnType.isInterface() && baseType != null
 *  */
    @Test
    public void testMaybeSetBaseType_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType(FunctionTypeBuilder.java:633) */
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testMaybeSetBaseType1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        String className = "";
        setField(baseType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noResolvedTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noResolvedType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    
    @Test
    public void testMaybeSetBaseType2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        EnumElementType baseType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", functionTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = functionType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    
    @Test
    public void testMaybeSetBaseType3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionType baseType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(baseType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object ownerFunction1 = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction1);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", anonymousFunctionTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = anonymousFunctionType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    
    @Test
    public void testMaybeSetBaseType4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        String className = "";
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", functionTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = functionType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
    }
    
    @Test
    public void testMaybeSetBaseType5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object type = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "type", type);
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        ArrayList subTypes = new ArrayList();
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "subTypes", subTypes);
        
        ObjectType functionTypeBuilderBaseType = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        FunctionType initialFunctionTypeBuilderBaseTypeOwnerFunction = ((FunctionType) getFieldValue(functionTypeBuilderBaseType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        ObjectType.Property initialNoObjectTypePrototypeSlot = ((ObjectType.Property) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noObjectTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noObjectType;
        maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        
        ObjectType functionTypeBuilderBaseType1 = ((ObjectType) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType"));
        FunctionType finalFunctionTypeBuilderBaseTypeOwnerFunction = ((FunctionType) getFieldValue(functionTypeBuilderBaseType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        ObjectType.Property finalNoObjectTypePrototypeSlot = ((ObjectType.Property) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        boolean finalNoObjectTypeUnknown = ((Boolean) getFieldValue(noObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(initialFunctionTypeBuilderBaseTypeOwnerFunction == finalFunctionTypeBuilderBaseTypeOwnerFunction);
        
        assertFalse(initialNoObjectTypePrototypeSlot == finalNoObjectTypePrototypeSlot);
        
        assertTrue(finalNoObjectTypeUnknown);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testMaybeSetBaseType6() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType baseType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "baseType", baseType);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        EnumType type = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.ObjectType$Property", "type", type);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.clearCachedValues(FunctionType.java:1058)
            com.google.javascript.rhino.jstype.FunctionType.setPrototype(FunctionType.java:404)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:357)
            com.google.javascript.rhino.jstype.FunctionType.setPrototypeBasedOn(FunctionType.java:328)
            com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType(FunctionTypeBuilder.java:634) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method maybeSetBaseTypeMethod = functionTypeBuilderClazz.getDeclaredMethod("maybeSetBaseType", noResolvedTypeType);
        maybeSetBaseTypeMethod.setAccessible(true);
        java.lang.Object[] maybeSetBaseTypeMethodArguments = new java.lang.Object[1];
        maybeSetBaseTypeMethodArguments[0] = noResolvedType;
        try {
            maybeSetBaseTypeMethod.invoke(functionTypeBuilder, maybeSetBaseTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.addParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): True}
 * @utbot.executesCondition {@code (!warnedAboutArgList): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addOptionalParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.returnsFrom {@code return emittedWarning;}
 *  */
    @Test
    public void testAddParameter_WarnedAboutArgList() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
 * @utbot.executesCondition {@code (isVarArgs): False}
 * @utbot.executesCondition {@code (!warnedAboutArgList): False}
 * @utbot.returnsFrom {@code return emittedWarning;}
 *  */
    @Test
    public void testAddParameter_WarnedAboutArgList_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 37);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): True}
 * @utbot.executesCondition {@code (!warnedAboutArgList): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addVarArgs(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return emittedWarning;}
 *  */
    @Test
    public void testAddParameter_WarnedAboutArgList_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
 * @utbot.returnsFrom {@code return emittedWarning;}
 *  */
    @Test
    public void testAddParameter_NotIsVarArgs() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootFirst = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "first"));
        
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
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootFirst = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionParamBuilderRootFirst == finalFunctionParamBuilderRootFirst);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
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
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:559) */
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
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:554) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !builder.addRequiredParams(paramType) && !warnedAboutArgList
 *  */
    @Test
    public void testAddParameter_ThrowNullPointerException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:564) */
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
            com.google.javascript.rhino.jstype.FunctionParamBuilder.hasOptionalOrVarArgs(FunctionParamBuilder.java:134)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addRequiredParams(FunctionParamBuilder.java:63)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:564) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder,com.google.javascript.rhino.jstype.JSType,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addVarArgs(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddParameter_ThrowUnsupportedOperationException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
 * @utbot.executesCondition {@code (isOptional): False}
 * @utbot.executesCondition {@code (isVarArgs): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addRequiredParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddParameter_ThrowUnsupportedOperationException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 37);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
 * @utbot.executesCondition {@code (isOptional): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#addOptionalParams(com.google.javascript.rhino.jstype.JSType[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddParameter_ThrowUnsupportedOperationException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
    @Test
    public void testAddParameter1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootNext = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "next"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, noTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = noType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootNext = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialFunctionParamBuilderRootNext == finalFunctionParamBuilderRootNext);
    }
    
    @Test
    public void testAddParameter2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootNext = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "next"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, unknownTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = unknownType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootNext = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialFunctionParamBuilderRootNext == finalFunctionParamBuilderRootNext);
    }
    
    @Test
    public void testAddParameter3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "last"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class allTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, allTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = allType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "last"));
        
        assertFalse(initialFunctionParamBuilderRootLast == finalFunctionParamBuilderRootLast);
    }
    
    @Test
    public void testAddParameter4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 37);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
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
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = false;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAddParameter5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAddParameter6() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootFirst = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "first"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, unknownTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = unknownType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootFirst = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialFunctionParamBuilderRootFirst == finalFunctionParamBuilderRootFirst);
    }
    
    @Test
    public void testAddParameter7() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testAddParameter8() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootNext = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "next"));
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class allTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, allTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = allType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootNext = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialFunctionParamBuilderRootNext == finalFunctionParamBuilderRootNext);
    }
    
    @Test
    public void testAddParameter9() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "last"));
        
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
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "last"));
        
        assertFalse(initialFunctionParamBuilderRootLast == finalFunctionParamBuilderRootLast);
    }
    
    @Test
    public void testAddParameter10() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType2 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "last"));
        
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
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "last"));
        
        assertFalse(initialFunctionParamBuilderRootLast == finalFunctionParamBuilderRootLast);
    }
    
    @Test
    public void testAddParameter11() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Node functionParamBuilderRoot = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node initialFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot, "com.google.javascript.rhino.Node", "last"));
        
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
        boolean actual = ((Boolean) addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments));
        
        assertFalse(actual);
        
        Node functionParamBuilderRoot1 = ((Node) getFieldValue(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root"));
        Node finalFunctionParamBuilderRootLast = ((Node) getFieldValue(functionParamBuilderRoot1, "com.google.javascript.rhino.Node", "last"));
        
        assertFalse(initialFunctionParamBuilderRootLast == finalFunctionParamBuilderRootLast);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testAddParameter12() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAddParameter13() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
    
    @Test(expected = StackOverflowError.class)
    public void testAddParameter14() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
    
    @Test(expected = StackOverflowError.class)
    public void testAddParameter15() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAddParameter16() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testAddParameter17() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
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
    
    @Test
    public void testAddParameter18() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:560) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, noResolvedTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = noResolvedType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddParameter19() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:555) */
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
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddParameter20() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:127)
            com.google.javascript.rhino.jstype.TemplateType.isNoType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isNoType(ProxyObjectType.java:127)
            com.google.javascript.rhino.jstype.TemplateType.isNoType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:157)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addVarArgs(FunctionParamBuilder.java:104)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:559) */
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
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddParameter21() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addOptionalParams(FunctionParamBuilder.java:85)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:554) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class proxyObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, proxyObjectTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = proxyObjectType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddParameter22() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 37);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:570) */
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
    
    @Test
    public void testAddParameter23() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 30);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isAllType(ProxyObjectType.java:187)
            com.google.javascript.rhino.jstype.TemplateType.isAllType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isAllType(ProxyObjectType.java:187)
            com.google.javascript.rhino.jstype.TemplateType.isAllType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isAllType(ProxyObjectType.java:187)
            com.google.javascript.rhino.jstype.TemplateType.isAllType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createOptionalType(JSTypeRegistry.java:956)
            com.google.javascript.rhino.jstype.FunctionParamBuilder.addOptionalParams(FunctionParamBuilder.java:85)
            com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(FunctionTypeBuilder.java:554) */
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
    
    @Test
    public void testAddParameter24() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "registry", registry);
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.addParameter] produces [java.lang.NullPointerException] */
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
    ///endregion
    
    ///region OTHER: TIMEOUTS for method addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)
    
    @Test(timeout = 1000L)
    public void testAddParameter25() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(root, "com.google.javascript.rhino.Node", "last", root);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        Object indexedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class indexedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, indexedTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = indexedType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = false;
        addParameterMethodArguments[4] = true;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testAddParameter26() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionParamBuilder functionParamBuilder = ((FunctionParamBuilder) createInstance("com.google.javascript.rhino.jstype.FunctionParamBuilder"));
        Object root = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(functionParamBuilder, "com.google.javascript.rhino.jstype.FunctionParamBuilder", "root", root);
        Object arrowType = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class functionParamBuilderType = Class.forName("com.google.javascript.rhino.jstype.FunctionParamBuilder");
        Class arrowTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Method addParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("addParameter", functionParamBuilderType, arrowTypeType, booleanType, booleanType, booleanType);
        addParameterMethod.setAccessible(true);
        java.lang.Object[] addParameterMethodArguments = new java.lang.Object[5];
        addParameterMethodArguments[0] = functionParamBuilder;
        addParameterMethodArguments[1] = arrowType;
        addParameterMethodArguments[2] = false;
        addParameterMethodArguments[3] = true;
        addParameterMethodArguments[4] = false;
        try {
            addParameterMethod.invoke(functionTypeBuilder, addParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportWarning(com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#reportWarning(com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testReportWarning_ThrowIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler", compiler);
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {-1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.IndexOutOfBoundsException: start 0, end -1, length 4]
            java.base/java.lang.AbstractStringBuilder.checkRange(AbstractStringBuilder.java:1802)
            java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:680)
            java.base/java.lang.StringBuffer.append(StringBuffer.java:393)
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
    public void testReportWarning_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        int[] offsets = {};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1267)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        String sourceName = " ";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(format, "java.text.MessageFormat", "pattern", sourceName);
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
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
    public void testReportWarning_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "compiler", compiler);
        Object errorRoot = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        String sourceName = " ";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(format, "java.text.MessageFormat", "pattern", sourceName);
        java.text.Format[] formats = {};
        format.setFormats(formats);
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {0};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        java.lang.String[] stringArray = new java.lang.String[1];
        stringArray[0] = sourceName;
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1284)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
        String sourceName = " ";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "sourceName", sourceName);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        MessageFormat format = ((MessageFormat) createInstance("java.text.MessageFormat"));
        setField(format, "java.text.MessageFormat", "pattern", sourceName);
        int[] offsets = {1};
        setField(format, "java.text.MessageFormat", "offsets", offsets);
        int[] argumentNumbers = {};
        setField(format, "java.text.MessageFormat", "argumentNumbers", argumentNumbers);
        setField(diagnosticType, "com.google.javascript.jscomp.DiagnosticType", "format", format);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.text.MessageFormat.subformat(MessageFormat.java:1269)
            java.base/java.text.MessageFormat.format(MessageFormat.java:886)
            java.base/java.text.Format.format(Format.java:159)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, warning, args));
 *  */
    @Test
    public void testReportWarning_ThrowNullPointerException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
        Node errorRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(errorRoot, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "errorRoot", errorRoot);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.report(JSError.make(sourceName, errorRoot, warning, args));
 *  */
    @Test
    public void testReportWarning_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:144)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.make(JSError.java:113)
            com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(FunctionTypeBuilder.java:690) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildAndRegister()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: returnType = typeRegistry.getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testBuildAndRegister_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(contents, "com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents", "hasNonEmptyReturns", true);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:589) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): False}
 * @utbot.executesCondition {@code (isInterface): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createInterfaceType(java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: fnType = typeRegistry.createInterfaceType(fnName, contents.getSourceNode());
 *  */
    @Test
    public void testBuildAndRegister_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String fnName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName", fnName);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        StringType returnType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface", true);
        Object parametersNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:158)
            com.google.javascript.rhino.jstype.FunctionType.forInterface(FunctionType.java:173)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createInterfaceType(JSTypeRegistry.java:1389)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:601) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.invokes {@link com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents#mayHaveNonEmptyReturns()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !contents.mayHaveNonEmptyReturns()
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:583) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType = typeRegistry.getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_4() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(contents, "com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents", "hasNonEmptyReturns", true);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:589) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnType = getOrCreateConstructor();
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_9() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.UnknownFunctionContents contents = ((FunctionTypeBuilder.UnknownFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:599) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): False}
 * @utbot.executesCondition {@code (isInterface): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents#getSourceNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnName
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:602) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnType = getOrCreateConstructor();
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:653)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:599) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): False}
 * @utbot.executesCondition {@code (isInterface): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionBuilder#withName(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents#getSourceNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: withSourceNode
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_6() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:610) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): True}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType = typeRegistry.getNativeType(VOID_TYPE);
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_7() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        Node n = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(contents, "com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents", "n", n);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:584) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): False}
 * @utbot.executesCondition {@code (isInterface): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnType = typeRegistry.createInterfaceType(fnName, contents.getSourceNode());
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isInterface", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:601) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 * @utbot.executesCondition {@code (isConstructor): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnType = getOrCreateConstructor();
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_5() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "isConstructor", true);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652)
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:599) */
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): True}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: returnType = typeRegistry.getNativeType(VOID_TYPE);
 *  */
    @Test
    public void testBuildAndRegister_ThrowNullPointerException_8() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        Node n = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(n, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(contents, "com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents", "n", n);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister(FunctionTypeBuilder.java:584) */
        functionTypeBuilder.buildAndRegister();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method buildAndRegister()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (parametersNode == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: parametersNode == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuildAndRegister_ThrowIllegalStateException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object returnType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: !contents.mayHaveNonEmptyReturns()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testBuildAndRegister_ThrowUnsupportedOperationException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        Object n = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(n, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(contents, "com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents", "n", n);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): False}
 * @utbot.executesCondition {@code (parametersNode == null): True}
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
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(contents, "com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents", "hasNonEmptyReturns", true);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        functionTypeBuilder.buildAndRegister();
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#buildAndRegister()}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): True}
 * @utbot.executesCondition {@code (!contents.mayHaveNonEmptyReturns()): True}
 * @utbot.executesCondition {@code (parametersNode == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: parametersNode == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBuildAndRegister_ThrowIllegalStateException_2() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[39];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[38] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        Node n = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(n, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(contents, "com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents", "n", n);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        functionTypeBuilder.buildAndRegister();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.getScopeDeclaredIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScopeDeclaredIn()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getScopeDeclaredIn()}
 * @utbot.executesCondition {@code (dotIndex != -1): False}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testGetScopeDeclaredIn_DotIndexEqualsNegative1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String fnName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName", fnName);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getScopeDeclaredInMethod = functionTypeBuilderClazz.getDeclaredMethod("getScopeDeclaredIn");
        getScopeDeclaredInMethod.setAccessible(true);
        java.lang.Object[] getScopeDeclaredInMethodArguments = new java.lang.Object[0];
        Scope actual = ((Scope) getScopeDeclaredInMethod.invoke(functionTypeBuilder, getScopeDeclaredInMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getScopeDeclaredIn()}
 * @utbot.executesCondition {@code (dotIndex != -1): True}
 * @utbot.executesCondition {@code (rootVar != null): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testGetScopeDeclaredIn_RootVarEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String fnName = ".";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName", fnName);
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "scope", scope);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getScopeDeclaredInMethod = functionTypeBuilderClazz.getDeclaredMethod("getScopeDeclaredIn");
        getScopeDeclaredInMethod.setAccessible(true);
        java.lang.Object[] getScopeDeclaredInMethodArguments = new java.lang.Object[0];
        Scope actual = ((Scope) getScopeDeclaredInMethod.invoke(functionTypeBuilder, getScopeDeclaredInMethodArguments));
        
        Map scopeVars = ((Map) getFieldValue(scope, "com.google.javascript.jscomp.Scope", "vars"));
        Map actualVars = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "vars"));
        assertTrue(deepEquals(scopeVars, actualVars));
        
        Scope actualParent = actual.getParent();
        assertNull(actualParent);
        
        int scopeDepth = scope.getDepth();
        int actualDepth = actual.getDepth();
        assertEquals(scopeDepth, actualDepth);
        
        Node actualRootNode = actual.getRootNode();
        assertNull(actualRootNode);
        
        ObjectType actualThisType = ((ObjectType) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "thisType"));
        assertNull(actualThisType);
        
        boolean actualIsBottom = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "isBottom"));
        assertFalse(actualIsBottom);
        
        Scope.Var actualArguments = ((Scope.Var) getFieldValue(actual, "com.google.javascript.jscomp.Scope", "arguments"));
        assertNull(actualArguments);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getScopeDeclaredIn()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getScopeDeclaredIn()}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int dotIndex = fnName.indexOf(".");
 *  */
    @Test
    public void testGetScopeDeclaredIn_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getScopeDeclaredIn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getScopeDeclaredIn(FunctionTypeBuilder.java:714) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getScopeDeclaredInMethod = functionTypeBuilderClazz.getDeclaredMethod("getScopeDeclaredIn");
        getScopeDeclaredInMethod.setAccessible(true);
        java.lang.Object[] getScopeDeclaredInMethodArguments = new java.lang.Object[0];
        try {
            getScopeDeclaredInMethod.invoke(functionTypeBuilder, getScopeDeclaredInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getScopeDeclaredIn()}
 * @utbot.executesCondition {@code (dotIndex != -1): True}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var rootVar = scope.getVar(rootVarName);
 *  */
    @Test
    public void testGetScopeDeclaredIn_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String fnName = ".";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName", fnName);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getScopeDeclaredIn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getScopeDeclaredIn(FunctionTypeBuilder.java:717) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Method getScopeDeclaredInMethod = functionTypeBuilderClazz.getDeclaredMethod("getScopeDeclaredIn");
        getScopeDeclaredInMethod.setAccessible(true);
        java.lang.Object[] getScopeDeclaredInMethodArguments = new java.lang.Object[0];
        try {
            getScopeDeclaredInMethod.invoke(functionTypeBuilder, getScopeDeclaredInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (codingConvention.isVarArgsParameter(param)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isVarArgsParameter(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsVarArgsParameter_CodingConventionIsVarArgsParameter() throws Exception  {
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.CodingConvention#isVarArgsParameter(com.google.javascript.rhino.Node)} once
    /// execute conditions:
    ///     {@code (codingConvention.isVarArgsParameter(param)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getString()} once
    /// return from: {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isVarArgs();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#isVarArgsParameter(com.google.javascript.rhino.Node,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.returnsFrom {@code return info != null && info.hasParameterType(paramName) && info.getParameterType(paramName).isVarArgs();}
 *  */
    @Test
    public void testIsVarArgsParameter_InfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsVarArgs() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
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
    public void testIsVarArgsParameter_InfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsVarArgs_3() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
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
    public void testIsVarArgsParameter_InfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsVarArgs_1() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
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
    public void testIsVarArgsParameter_InfoEqualsNullAndInfoHasParameterTypeAndInfoGetParameterTypeParamNameIsVarArgs_2() throws Exception  {
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
 * @utbot.executesCondition {@code (codingConvention.isVarArgsParameter(param)): False}
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
            com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter(FunctionTypeBuilder.java:520) */
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
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isVarArgsParameter(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: codingConvention.isVarArgsParameter(param)
 *  */
    @Test
    public void testIsVarArgsParameter_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter(FunctionTypeBuilder.java:516) */
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
 * @utbot.executesCondition {@code (codingConvention.isVarArgsParameter(param)): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String paramName = param.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsVarArgsParameter_ThrowIllegalStateException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Node node = new Node(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", nodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = node;
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
 * @utbot.executesCondition {@code (codingConvention.isVarArgsParameter(param)): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String paramName = param.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsVarArgsParameter_ThrowIllegalStateException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Node node = new Node(0);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", nodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = node;
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: codingConvention.isVarArgsParameter(param)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsVarArgsParameter_ThrowIllegalStateException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Node node = new Node(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isVarArgsParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isVarArgsParameter", nodeType, jSDocInfoType);
        isVarArgsParameterMethod.setAccessible(true);
        java.lang.Object[] isVarArgsParameterMethodArguments = new java.lang.Object[2];
        isVarArgsParameterMethodArguments[0] = node;
        isVarArgsParameterMethodArguments[1] = ((Object) null);
        try {
            isVarArgsParameterMethod.invoke(functionTypeBuilder, isVarArgsParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.inferFromOverriddenFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (oldType == null): True}
 *  */
    @Test
    public void testInferFromOverriddenFunction_OldTypeEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferFromOverriddenFunction(null, null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (oldType == null): False}
 * @utbot.executesCondition {@code (paramsParent == null): True}
 * @utbot.executesCondition {@code (parametersNode == null): False}
 *  */
    @Test
    public void testInferFromOverriddenFunction_ParametersNodeNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Node initialFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferFromOverriddenFunction(noType, null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        String actualParametersNodeStr = ((String) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualParametersNodeStr);
        
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
        
        int functionTypeBuilderParametersNodeSourcePosition = functionTypeBuilderParametersNode.getSourcePosition();
        int actualParametersNodeSourcePosition = actualParametersNode.getSourcePosition();
        assertEquals(functionTypeBuilderParametersNodeSourcePosition, actualParametersNodeSourcePosition);
        
        JSType actualParametersNodeJsType = ((JSType) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParametersNodeJsType);
        
        Node actualParametersNodeParent = actualParametersNode.getParent();
        assertNull(actualParametersNodeParent);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        Node finalFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        assertFalse(initialFunctionTypeBuilderParametersNode == finalFunctionTypeBuilderParametersNode);
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (oldType == null): False}
 * @utbot.executesCondition {@code (paramsParent == null): True}
 * @utbot.executesCondition {@code (parametersNode == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionParamBuilder#build()}
 *  */
    @Test
    public void testInferFromOverriddenFunction_ParametersNodeEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Node initialFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        FunctionTypeBuilder actual = functionTypeBuilder.inferFromOverriddenFunction(functionType, null);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        int functionTypeBuilderParametersNodeSourcePosition = functionTypeBuilderParametersNode.getSourcePosition();
        int actualParametersNodeSourcePosition = actualParametersNode.getSourcePosition();
        assertEquals(functionTypeBuilderParametersNodeSourcePosition, actualParametersNodeSourcePosition);
        
        JSType actualParametersNodeJsType = ((JSType) getFieldValue(actualParametersNode, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualParametersNodeJsType);
        
        Node actualParametersNodeParent = actualParametersNode.getParent();
        assertNull(actualParametersNodeParent);
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
        Node finalFunctionTypeBuilderParametersNode = ((Node) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode"));
        
        assertFalse(initialFunctionTypeBuilderParametersNode == finalFunctionTypeBuilderParametersNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOrCreateConstructor()
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#getOrCreateConstructor()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType fnType = typeRegistry.createConstructorType(fnName, contents.getSourceNode(), parametersNode, returnType);
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowClassCastException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[14];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[13] = ((JSType) allType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        FunctionTypeBuilder.UnknownFunctionContents contents = ((FunctionTypeBuilder.UnknownFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        EnumElementType returnType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        Object parametersNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:134)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1378)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: FunctionType fnType = typeRegistry.createConstructorType(fnName, contents.getSourceNode(), parametersNode, returnType);
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        FunctionTypeBuilder.UnknownFunctionContents contents = ((FunctionTypeBuilder.UnknownFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        Object parametersNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.FunctionType.<init>(FunctionType.java:134)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1378)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652) */
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
        FunctionTypeBuilder.UnknownFunctionContents contents = ((FunctionTypeBuilder.UnknownFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType", returnType);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:72)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:64)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(JSTypeRegistry.java:1030)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1378)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652) */
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
    public void testGetOrCreateConstructor_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String fnName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName", fnName);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        FunctionTypeBuilder.UnknownFunctionContents contents = ((FunctionTypeBuilder.UnknownFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        Node parametersNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "parametersNode", parametersNode);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSType.getNativeType(JSType.java:111)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:75)
            com.google.javascript.rhino.jstype.ArrowType.<init>(ArrowType.java:64)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createArrowType(JSTypeRegistry.java:1030)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createConstructorType(JSTypeRegistry.java:1378)
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fnName
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowNullPointerException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:653) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType fnType = typeRegistry.createConstructorType(fnName, contents.getSourceNode(), parametersNode, returnType);
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowNullPointerException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        FunctionTypeBuilder.UnknownFunctionContents contents = ((FunctionTypeBuilder.UnknownFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$UnknownFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType fnType = typeRegistry.createConstructorType(fnName, contents.getSourceNode(), parametersNode, returnType);
 *  */
    @Test
    public void testGetOrCreateConstructor_ThrowNullPointerException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        String fnName = "";
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "fnName", fnName);
        FunctionTypeBuilder.AstFunctionContents contents = ((FunctionTypeBuilder.AstFunctionContents) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder$AstFunctionContents"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents", contents);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor(FunctionTypeBuilder.java:652) */
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
            com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter(FunctionTypeBuilder.java:505) */
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
            com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter(FunctionTypeBuilder.java:501) */
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String paramName = param.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsOptionalParameter_ThrowIllegalStateException() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", numberNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = numberNode;
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: codingConvention.isOptionalParameter(param)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsOptionalParameter_ThrowIllegalStateException_1() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", numberNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = numberNode;
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String paramName = param.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsOptionalParameter_ThrowIllegalStateException_2() throws Throwable  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "codingConvention", codingConvention);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Method isOptionalParameterMethod = functionTypeBuilderClazz.getDeclaredMethod("isOptionalParameter", numberNodeType, jSDocInfoType);
        isOptionalParameterMethod.setAccessible(true);
        java.lang.Object[] isOptionalParameterMethodArguments = new java.lang.Object[2];
        isOptionalParameterMethodArguments[0] = numberNode;
        isOptionalParameterMethodArguments[1] = ((Object) null);
        try {
            isOptionalParameterMethod.invoke(functionTypeBuilder, isOptionalParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(objectType.isUnknownType());
 *  */
    @Test
    public void testHasMoreTagsToResolve_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve(FunctionTypeBuilder.java:733) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method hasMoreTagsToResolveMethod = functionTypeBuilderClazz.getDeclaredMethod("hasMoreTagsToResolve", objectTypeType);
        hasMoreTagsToResolveMethod.setAccessible(true);
        java.lang.Object[] hasMoreTagsToResolveMethodArguments = new java.lang.Object[1];
        hasMoreTagsToResolveMethodArguments[0] = ((Object) null);
        try {
            hasMoreTagsToResolveMethod.invoke(null, hasMoreTagsToResolveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType)}
     */
    @Test
    public void testHasMoreTagsToResolveThrowsNPE() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve(FunctionTypeBuilder.java:733) */
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method hasMoreTagsToResolveMethod = functionTypeBuilderClazz.getDeclaredMethod("hasMoreTagsToResolve", objectTypeType);
        hasMoreTagsToResolveMethod.setAccessible(true);
        java.lang.Object[] hasMoreTagsToResolveMethodArguments = new java.lang.Object[1];
        hasMoreTagsToResolveMethodArguments[0] = ((Object) null);
        try {
            hasMoreTagsToResolveMethod.invoke(null, hasMoreTagsToResolveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType)
    
    @Test(expected = IllegalArgumentException.class)
    public void testHasMoreTagsToResolve1() throws Throwable  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType12 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType13 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType14 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType15 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType16 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType17 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        VoidType referencedType18 = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(referencedType17, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType18);
        setField(referencedType16, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType17);
        setField(referencedType15, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType16);
        setField(referencedType14, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType15);
        setField(referencedType13, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType14);
        setField(referencedType12, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType13);
        setField(referencedType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType12);
        setField(referencedType10, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType11);
        setField(referencedType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType10);
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType9);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class functionTypeBuilderClazz = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method hasMoreTagsToResolveMethod = functionTypeBuilderClazz.getDeclaredMethod("hasMoreTagsToResolve", templateTypeType);
        hasMoreTagsToResolveMethod.setAccessible(true);
        java.lang.Object[] hasMoreTagsToResolveMethodArguments = new java.lang.Object[1];
        hasMoreTagsToResolveMethodArguments[0] = templateType;
        try {
            hasMoreTagsToResolveMethod.invoke(null, hasMoreTagsToResolveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
 * @utbot.invokes {@link com.google.javascript.rhino.IR#paramList()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String name: info.getParameterNames())
 *  */
    @Test
    public void testInferParameterTypes_ThrowNullPointerException() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes(FunctionTypeBuilder.java:410) */
        functionTypeBuilder.inferParameterTypes(null);
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
            com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(FunctionTypeBuilder.java:701) */
        FunctionTypeBuilder.isFunctionTypeDeclaration(null);
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertNull(actualTemplateTypeName);
        
    }
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferTemplateTypeName_InfoNotEqualsNull_1() throws Exception  {
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
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        JSType actualTypeRegistryTemplateTypeReferencedType = ((JSType) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualTypeRegistryTemplateTypeReferencedType);
        
        ObjectType actualTypeRegistryTemplateTypeReferencedObjType = ((ObjectType) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjType);
        
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
    
    /**
    @utbot.classUnderTest {@link FunctionTypeBuilder}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FunctionTypeBuilder#inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testInferTemplateTypeName_InfoNotEqualsNull() throws Exception  {
        FunctionTypeBuilder functionTypeBuilder = ((FunctionTypeBuilder) createInstance("com.google.javascript.jscomp.FunctionTypeBuilder"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        nativeTypes[35] = ((JSType) noType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        String templateTypeName = "";
        typeRegistry.setTemplateTypeName(templateTypeName);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String templateTypeName1 = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "templateTypeName", templateTypeName1);
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
        
        Set actualTypeRegistryNonNullableTypeNames = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nonNullableTypeNames"));
        assertNull(actualTypeRegistryNonNullableTypeNames);
        
        Set actualTypeRegistryForwardDeclaredTypes = ((Set) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes"));
        assertNull(actualTypeRegistryForwardDeclaredTypes);
        
        Map actualTypeRegistryTypesIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "typesIndexedByProperty"));
        assertNull(actualTypeRegistryTypesIndexedByProperty);
        
        Map actualTypeRegistryEachRefTypeIndexedByProperty = ((Map) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "eachRefTypeIndexedByProperty"));
        assertNull(actualTypeRegistryEachRefTypeIndexedByProperty);
        
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
        
        String functionTypeBuilderTypeRegistry1TemplateTypeName = ((String) getFieldValue(functionTypeBuilderTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        String actualTypeRegistryTemplateTypeName = ((String) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypeName"));
        assertEquals(functionTypeBuilderTypeRegistry1TemplateTypeName, actualTypeRegistryTemplateTypeName);
        
        TemplateType functionTypeBuilderTypeRegistry1TemplateType = ((TemplateType) getFieldValue(functionTypeBuilderTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        TemplateType actualTypeRegistryTemplateType = ((TemplateType) getFieldValue(actualTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        String functionTypeBuilderTypeRegistry1TemplateTypeName1 = ((String) getFieldValue(functionTypeBuilderTypeRegistry1TemplateType, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        String actualTypeRegistryTemplateTypeName1 = ((String) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertEquals(functionTypeBuilderTypeRegistry1TemplateTypeName1, actualTypeRegistryTemplateTypeName1);
        
        JSType functionTypeBuilderTypeRegistry1TemplateTypeReferencedType = ((JSType) getFieldValue(functionTypeBuilderTypeRegistry1TemplateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualTypeRegistryTemplateTypeReferencedType = ((JSType) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeBuilderTypeRegistry1TemplateTypeReferencedType, actualTypeRegistryTemplateTypeReferencedType);
        
        ObjectType functionTypeBuilderTypeRegistry1TemplateTypeReferencedObjType = ((ObjectType) getFieldValue(functionTypeBuilderTypeRegistry1TemplateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        ObjectType actualTypeRegistryTemplateTypeReferencedObjType = ((ObjectType) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        Object actualTypeRegistryTemplateTypeReferencedObjTypeCall = getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeCall);
        
        ObjectType.Property actualTypeRegistryTemplateTypeReferencedObjTypePrototypeSlot = ((ObjectType.Property) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypePrototypeSlot);
        
        Object actualTypeRegistryTemplateTypeReferencedObjTypeKind = getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeKind);
        
        ObjectType actualTypeRegistryTemplateTypeReferencedObjTypeTypeOfThis = (((FunctionType) actualTypeRegistryTemplateTypeReferencedObjType)).getTypeOfThis();
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeTypeOfThis);
        
        Node actualTypeRegistryTemplateTypeReferencedObjTypeSource = (((FunctionType) actualTypeRegistryTemplateTypeReferencedObjType)).getSource();
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeSource);
        
        List actualTypeRegistryTemplateTypeReferencedObjTypeImplementedInterfaces = ((List) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeImplementedInterfaces);
        
        List actualTypeRegistryTemplateTypeReferencedObjTypeExtendedInterfaces = ((List) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeExtendedInterfaces);
        
        List actualTypeRegistryTemplateTypeReferencedObjTypeSubTypes = (((FunctionType) actualTypeRegistryTemplateTypeReferencedObjType)).getSubTypes();
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeSubTypes);
        
        String actualTypeRegistryTemplateTypeReferencedObjTypeTemplateTypeName = (((FunctionType) actualTypeRegistryTemplateTypeReferencedObjType)).getTemplateTypeName();
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeTemplateTypeName);
        
        String actualTypeRegistryTemplateTypeReferencedObjTypeClassName = ((String) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeClassName);
        
        Map actualTypeRegistryTemplateTypeReferencedObjTypeProperties = ((Map) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeProperties);
        
        boolean actualTypeRegistryTemplateTypeReferencedObjTypeNativeType = ((Boolean) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualTypeRegistryTemplateTypeReferencedObjTypeNativeType);
        
        ObjectType actualTypeRegistryTemplateTypeReferencedObjTypeImplicitPrototypeFallback = ((ObjectType) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeImplicitPrototypeFallback);
        
        FunctionType actualTypeRegistryTemplateTypeReferencedObjTypeOwnerFunction = ((FunctionType) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeOwnerFunction);
        
        boolean actualTypeRegistryTemplateTypeReferencedObjTypePrettyPrint = ((Boolean) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualTypeRegistryTemplateTypeReferencedObjTypePrettyPrint);
        
        boolean actualTypeRegistryTemplateTypeReferencedObjTypeVisited = ((Boolean) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualTypeRegistryTemplateTypeReferencedObjTypeVisited);
        
        JSDocInfo actualTypeRegistryTemplateTypeReferencedObjTypeDocInfo = ((JSDocInfo) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeDocInfo);
        
        boolean actualTypeRegistryTemplateTypeReferencedObjTypeUnknown = ((Boolean) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualTypeRegistryTemplateTypeReferencedObjTypeUnknown);
        
        boolean actualTypeRegistryTemplateTypeReferencedObjTypeResolved = ((Boolean) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualTypeRegistryTemplateTypeReferencedObjTypeResolved);
        
        JSType actualTypeRegistryTemplateTypeReferencedObjTypeResolveResult = ((JSType) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeResolveResult);
        
        JSTypeRegistry actualTypeRegistryTemplateTypeReferencedObjTypeRegistry = ((JSTypeRegistry) getFieldValue(actualTypeRegistryTemplateTypeReferencedObjType, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualTypeRegistryTemplateTypeReferencedObjTypeRegistry);
        
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateType, actualTypeRegistryTemplateType));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateType, actualTypeRegistryTemplateType));
        boolean actualTypeRegistryTemplateTypeUnknown = ((Boolean) getFieldValue(actualTypeRegistryTemplateType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertTrue(actualTypeRegistryTemplateTypeUnknown);
        
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateType, actualTypeRegistryTemplateType));
        assertTrue(deepEquals(functionTypeBuilderTypeRegistry1TemplateType, actualTypeRegistryTemplateType));
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
        
        FunctionTypeBuilder.FunctionContents actualContents = ((FunctionTypeBuilder.FunctionContents) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "contents"));
        assertNull(actualContents);
        
        JSType actualReturnType = ((JSType) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnType"));
        assertNull(actualReturnType);
        
        boolean actualReturnTypeInferred = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "returnTypeInferred"));
        assertFalse(actualReturnTypeInferred);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
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
        
        String functionTypeBuilderTemplateTypeName = ((String) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        String actualTemplateTypeName = ((String) getFieldValue(actual, "com.google.javascript.jscomp.FunctionTypeBuilder", "templateTypeName"));
        assertEquals(functionTypeBuilderTemplateTypeName, actualTemplateTypeName);
        
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
        JSType finalFunctionTypeBuilderTypeRegistryNativeTypes36 = ((JSType) get(functionTypeBuilderTypeRegistry37TypeRegistryNativeTypes, 36));
        JSTypeRegistry functionTypeBuilderTypeRegistry38 = ((JSTypeRegistry) getFieldValue(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry"));
        TemplateType finalFunctionTypeBuilderTypeRegistryTemplateType = ((TemplateType) getFieldValue(functionTypeBuilderTypeRegistry38, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateType"));
        
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
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.TemplateType.<init>(TemplateType.java:54)
            com.google.javascript.rhino.jstype.JSTypeRegistry.setTemplateTypeName(JSTypeRegistry.java:1672)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:531) */
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
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[35] = ((JSType) numberType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        String templateTypeName = "";
        typeRegistry.setTemplateTypeName(templateTypeName);
        setField(functionTypeBuilder, "com.google.javascript.jscomp.FunctionTypeBuilder", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        
        /* This test fails because method [com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.TemplateType.<init>(TemplateType.java:54)
            com.google.javascript.rhino.jstype.JSTypeRegistry.setTemplateTypeName(JSTypeRegistry.java:1672)
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:531) */
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
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:531) */
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
            com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(FunctionTypeBuilder.java:531) */
        functionTypeBuilder.inferTemplateTypeName(jSDocInfo);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields889359922291400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields889359922291400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass889359922301800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields889359922291400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass889359922301800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields889359922582400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields889359922582400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass889359922584400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields889359922582400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass889359922584400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

