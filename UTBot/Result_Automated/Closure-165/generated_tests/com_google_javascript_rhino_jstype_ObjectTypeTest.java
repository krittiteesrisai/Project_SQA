package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.JSDocInfo;
import java.lang.reflect.Method;
import java.util.SortedMap;
import java.util.Map;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import com.google.javascript.rhino.Node;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSTypeExpression;
import java.util.TreeSet;
import java.util.ArrayList;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.reflect.InvocationTargetException;
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

public final class com_google_javascript_rhino_jstype_ObjectTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.cast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cast(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return type == null ? null : type.toObjectType();}
 *  */
    @Test
    public void testCast_ReturnTypeNotEqualsNull_1() {
        StringType stringType = new StringType(null);
        
        ObjectType actual = ObjectType.cast(stringType);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return type == null ? null : type.toObjectType();}
 *  */
    @Test
    public void testCast_ReturnTypeNotEqualsNull() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        EnumElementType actual = ((EnumElementType) ObjectType.cast(enumElementType));
        
        JSType actualPrimitiveType = actual.getPrimitiveType();
        assertNull(actualPrimitiveType);
        
        ObjectType actualPrimitiveObjectType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType"));
        assertNull(actualPrimitiveObjectType);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.EnumElementType", "name"));
        assertNull(actualName);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cast(com.google.javascript.rhino.jstype.JSType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.ObjectType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
     */
    @Test
    public void testCast() {
        ObjectType actual = ObjectType.cast(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.testForEquality
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testTestForEquality_ReturnResult_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        templateType.setReferencedType(referencedType);
        
        TernaryValue actual = functionType.testForEquality(templateType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testTestForEquality_ReturnResult_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType1 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        TernaryValue actual = functionType.testForEquality(templateType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testTestForEquality_ReturnResult() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        AllType allType = new AllType(null);
        
        TernaryValue actual = functionType.testForEquality(allType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#testForEquality(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testTestForEquality_ReturnResult_3() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType8 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        TernaryValue actual = functionType.testForEquality(templateType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testTestForEquality1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType5 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType7 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        TernaryValue actual = prototypeObjectType.testForEquality(templateType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTestForEquality2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType7 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        AllType referencedType8 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        TernaryValue actual = prototypeObjectType.testForEquality(templateType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTestForEquality3() throws Exception  {
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType9 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        TernaryValue actual = unresolvedTypeExpression.testForEquality(templateType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTestForEquality4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        AllType referencedType10 = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        TernaryValue actual = prototypeObjectType.testForEquality(templateType);
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method testForEquality(com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testTestForEquality5() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType1.setReferencedType(referencedType1);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        prototypeObjectType.testForEquality(templateType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTestForEquality6() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        referencedType3.setReferencedType(referencedType1);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        prototypeObjectType.testForEquality(templateType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTestForEquality7() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType7 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        referencedType7.setReferencedType(referencedType5);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        prototypeObjectType.testForEquality(templateType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTestForEquality8() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
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
        IndexedType referencedType9 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        referencedType9.setReferencedType(referencedType8);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        anonymousFunctionType.testForEquality(templateType);
    }
    
    @Test
    public void testTestForEquality9() throws Exception  {
        IndexedType indexedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType3.setReferencedType(referencedType2);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.testForEquality] produces [java.lang.NullPointerException] */
        indexedType.testForEquality(templateType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.visit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#visit(com.google.javascript.rhino.jstype.Visitor)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.Visitor#caseObjectType(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return visitor.caseObjectType(this);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.visit] produces [java.lang.NullPointerException] */
        parameterizedType.visit(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    @Test
    public void testVisit1() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType7 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        RecordType actual = ((RecordType) visitMethod.invoke(recordType, visitMethodArguments));
        
        SortedMap actualProperties = ((SortedMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        assertNull(actualProperties);
        
        boolean actualIsFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "isFrozen"));
        assertFalse(actualIsFrozen);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties1 = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties1);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType9 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        RecordType actual = ((RecordType) visitMethod.invoke(recordType, visitMethodArguments));
        
        SortedMap actualProperties = ((SortedMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        assertNull(actualProperties);
        
        boolean actualIsFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "isFrozen"));
        assertFalse(actualIsFrozen);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties1 = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties1);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit3() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType6 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType9 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        RecordType actual = ((RecordType) visitMethod.invoke(recordType, visitMethodArguments));
        
        SortedMap actualProperties = ((SortedMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        assertNull(actualProperties);
        
        boolean actualIsFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "isFrozen"));
        assertFalse(actualIsFrozen);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties1 = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties1);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit4() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnresolvedTypeExpression referencedType10 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        RecordType actual = ((RecordType) visitMethod.invoke(recordType, visitMethodArguments));
        
        SortedMap actualProperties = ((SortedMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        assertNull(actualProperties);
        
        boolean actualIsFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "isFrozen"));
        assertFalse(actualIsFrozen);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties1 = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties1);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit5() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType11 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        RecordType actual = ((RecordType) visitMethod.invoke(recordType, visitMethodArguments));
        
        SortedMap actualProperties = ((SortedMap) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "properties"));
        assertNull(actualProperties);
        
        boolean actualIsFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.RecordType", "isFrozen"));
        assertFalse(actualIsFrozen);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties1 = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties1);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit6() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType10 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        ErrorFunctionType actual = ((ErrorFunctionType) visitMethod.invoke(errorFunctionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit7() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
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
        UnknownType referencedType11 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        ErrorFunctionType actual = ((ErrorFunctionType) visitMethod.invoke(errorFunctionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit8() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType6 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType9 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        FunctionType actual = ((FunctionType) visitMethod.invoke(anonymousFunctionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testVisit9() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
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
        IndexedType referencedType10 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType12 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType11.setReferencedType(referencedType12);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        ErrorFunctionType actual = ((ErrorFunctionType) visitMethod.invoke(errorFunctionType, visitMethodArguments));
        
        ArrowType actualCall = ((ArrowType) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call"));
        assertNull(actualCall);
        
        ObjectType.Property actualPrototypeSlot = ((ObjectType.Property) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot"));
        assertNull(actualPrototypeSlot);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualExtendedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        assertNull(actualExtendedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        FunctionType actualOwnerFunction = actual.getOwnerFunction();
        assertNull(actualOwnerFunction);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.rhino.jstype.Visitor)
    
    @Test(expected = StackOverflowError.class)
    public void testVisit10() throws Throwable  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType2.setReferencedType(referencedType2);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(recordType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit11() throws Throwable  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType6 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType8.setReferencedType(referencedType8);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(recordType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit12() throws Throwable  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType6 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType8 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        referencedType8.setReferencedType(referencedType5);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(errorFunctionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit13() throws Throwable  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType8 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType9.setReferencedType(referencedType9);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(recordType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisit14() throws Throwable  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType2 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        IndexedType referencedType3 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType10 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType11.setReferencedType(referencedType11);
        referencedType10.setReferencedType(referencedType11);
        referencedType9.setReferencedType(referencedType10);
        referencedType8.setReferencedType(referencedType9);
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(errorFunctionType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit15() throws Throwable  {
        NoResolvedType noResolvedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object restrictByTrueInstanceOfResultVisitor = createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor");
        TemplateType target = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedType1 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType8 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        target.setReferencedType(referencedType);
        setField(restrictByTrueInstanceOfResultVisitor, "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$RestrictByTrueInstanceOfResultVisitor", "target", target);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.visit] produces [java.lang.NullPointerException] */
        Class objectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class restrictByTrueInstanceOfResultVisitorType = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Method visitMethod = objectTypeClazz.getDeclaredMethod("visit", restrictByTrueInstanceOfResultVisitorType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[1];
        visitMethodArguments[0] = restrictByTrueInstanceOfResultVisitor;
        try {
            visitMethod.invoke(noResolvedType, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getDisplayName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDisplayName()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getDisplayName()}
 * @utbot.returnsFrom {@code return getNormalizedReferenceName();}
 *  */
    @Test
    public void testGetDisplayName_ReturnGetNormalizedReferenceName_3() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        String actual = noType.getDisplayName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getDisplayName()}
 * @utbot.returnsFrom {@code return getNormalizedReferenceName();}
 *  */
    @Test
    public void testGetDisplayName_ReturnGetNormalizedReferenceName_1() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        String actual = errorFunctionType.getDisplayName();
        
        assertEquals(className, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getDisplayName()}
 * @utbot.returnsFrom {@code return getNormalizedReferenceName();}
 *  */
    @Test
    public void testGetDisplayName_ReturnGetNormalizedReferenceName_2() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        String className = "(";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        String actual = errorFunctionType.getDisplayName();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getDisplayName()}
 * @utbot.returnsFrom {@code return getNormalizedReferenceName();}
 *  */
    @Test
    public void testGetDisplayName_ReturnGetNormalizedReferenceName() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        String actual = errorFunctionType.getDisplayName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDisplayName()
    
    @Test
    public void testGetDisplayName1() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        String actual = enumElementType.getDisplayName();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetDisplayName2() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ErrorFunctionType ownerFunction1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType ownerFunction2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        NoResolvedType ownerFunction3 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        ownerFunction2.setOwnerFunction(ownerFunction3);
        ownerFunction1.setOwnerFunction(ownerFunction2);
        ownerFunction.setOwnerFunction(ownerFunction1);
        anonymousFunctionType.setOwnerFunction(ownerFunction);
        
        String actual = anonymousFunctionType.getDisplayName();
        
        String expected = "null.prototype.prototype.prototype.prototype";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetDisplayName3() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ErrorFunctionType ownerFunction = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType ownerFunction1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        String className = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(ownerFunction3, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        ownerFunction2.setOwnerFunction(ownerFunction3);
        ownerFunction1.setOwnerFunction(ownerFunction2);
        ownerFunction.setOwnerFunction(ownerFunction1);
        errorFunctionType.setOwnerFunction(ownerFunction);
        
        String actual = errorFunctionType.getDisplayName();
        
        String expected = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000.prototype.prototype.prototype.prototype";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetDisplayName4() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ErrorFunctionType ownerFunction1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType ownerFunction2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType ownerFunction3 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ownerFunction2.setOwnerFunction(ownerFunction3);
        ownerFunction1.setOwnerFunction(ownerFunction2);
        ownerFunction.setOwnerFunction(ownerFunction1);
        anonymousFunctionType.setOwnerFunction(ownerFunction);
        
        String actual = anonymousFunctionType.getDisplayName();
        
        String expected = "null.prototype.prototype.prototype.prototype";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getRootNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRootNode()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getRootNode()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetRootNode_Return() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Node actual = enumElementType.getRootNode();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.isObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isObject()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isObject()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsObject_ReturnTrue() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        boolean actual = templateType.isObject();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDelegateSuffix(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#createDelegateSuffix(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "(" + suffix + ")";}
 *  */
    @Test
    public void testCreateDelegateSuffix_StringBuilderToString() {
        String actual = ObjectType.createDelegateSuffix(null);
        
        String expected = "(null)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.detectImplicitPrototypeCycle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method detectImplicitPrototypeCycle()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_8() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = noType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_9() throws Exception  {
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        boolean actual = unknownType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_10() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        boolean actual = enumElementType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ObjectType", "visited", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = errorFunctionType.detectImplicitPrototypeCycle();
        
        assertTrue(actual);
        
        boolean finalErrorFunctionTypeVisited = ((Boolean) getFieldValue(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        
        assertTrue(finalErrorFunctionTypeVisited);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = anonymousFunctionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_1() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = anonymousFunctionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = functionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_7() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        boolean actual = anonymousFunctionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_2() throws Exception  {
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        ErrorFunctionType referencedObjType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ObjectType", "visited", true);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = proxyObjectType.detectImplicitPrototypeCycle();
        
        assertTrue(actual);
        
        boolean finalProxyObjectTypeVisited = ((Boolean) getFieldValue(proxyObjectType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        
        assertTrue(finalProxyObjectTypeVisited);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_3() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ProxyObjectType implicitPrototypeFallback1 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedObjType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = anonymousFunctionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_4() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ProxyObjectType implicitPrototypeFallback1 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = anonymousFunctionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_6() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ProxyObjectType implicitPrototypeFallback1 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        NoResolvedType referencedObjType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = functionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_1() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NamedType implicitPrototypeFallback1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        EnumElementType implicitPrototypeFallback2 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback2, "com.google.javascript.rhino.jstype.ObjectType", "visited", true);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback2);
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = functionType.detectImplicitPrototypeCycle();
        
        assertTrue(actual);
        
        ObjectType functionTypeImplicitPrototypeFallback = ((ObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        ObjectType functionTypeImplicitPrototypeFallbackImplicitPrototypeFallbackImplicitPrototypeFallback = ((ObjectType) getFieldValue(functionTypeImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        boolean finalFunctionTypeImplicitPrototypeFallbackImplicitPrototypeFallbackVisited = ((Boolean) getFieldValue(functionTypeImplicitPrototypeFallbackImplicitPrototypeFallbackImplicitPrototypeFallback, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        ObjectType functionTypeImplicitPrototypeFallback1 = ((ObjectType) getFieldValue(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        boolean finalFunctionTypeImplicitPrototypeFallbackVisited = ((Boolean) getFieldValue(functionTypeImplicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        boolean finalFunctionTypeVisited = ((Boolean) getFieldValue(functionType, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        
        assertTrue(finalFunctionTypeImplicitPrototypeFallbackImplicitPrototypeFallbackVisited);
        
        assertTrue(finalFunctionTypeImplicitPrototypeFallbackVisited);
        
        assertTrue(finalFunctionTypeVisited);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#detectImplicitPrototypeCycle()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testDetectImplicitPrototypeCycle_PEqualsNull_5() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ProxyObjectType implicitPrototypeFallback1 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(implicitPrototypeFallback1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        boolean actual = anonymousFunctionType.detectImplicitPrototypeCycle();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method defineDeclaredProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#defineDeclaredProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#registerPropertyOnType(java.lang.String,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.registerPropertyOnType(propertyName, this);
 *  */
    @Test
    public void testDefineDeclaredProperty_ThrowNullPointerException() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty(ObjectType.java:280) */
        noType.defineDeclaredProperty(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method defineDeclaredProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)
    
    @Test
    public void testDefineDeclaredProperty1() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "\u0000";
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.defineDeclaredProperty(ObjectType.java:280) */
        anonymousFunctionType.defineDeclaredProperty(string, noType, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnPropertyJSDocInfo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetOwnPropertyJSDocInfo_ReturnNull() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        JSDocInfo actual = enumElementType.getOwnPropertyJSDocInfo(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.setPropertyJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#setPropertyJSDocInfo(java.lang.String,com.google.javascript.rhino.JSDocInfo)}
 *  */
    @Test
    public void testSetPropertyJSDocInfo() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        enumElementType.setPropertyJSDocInfo(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnPropertyNames()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getOwnPropertyNames()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableSet#of()}
 * @utbot.returnsFrom {@code return ImmutableSet.of();}
 *  */
    @Test
    public void testGetOwnPropertyNames_ImmutableSetOf() throws Exception  {
        Class emptyImmutableSetClazz = Class.forName("com.google.common.collect.EmptyImmutableSet");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableSetClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableSet");
            setStaticField(emptyImmutableSetClazz, "INSTANCE", instance);
            EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
            
            Set actual = enumElementType.getOwnPropertyNames();
            
            Set expected = new LinkedHashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(emptyImmutableSetClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.hasOwnDeclaredProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOwnDeclaredProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#hasOwnDeclaredProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return hasOwnProperty(name) && isPropertyTypeDeclared(name);}
 *  */
    @Test
    public void testHasOwnDeclaredProperty_ReturnHasOwnPropertyAndIsPropertyTypeDeclared() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = noType.hasOwnDeclaredProperty(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#hasOwnDeclaredProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return hasOwnProperty(name) && isPropertyTypeDeclared(name);}
 *  */
    @Test
    public void testHasOwnDeclaredProperty_ReturnHasOwnPropertyAndIsPropertyTypeDeclared_1() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        boolean actual = templateType.hasOwnDeclaredProperty(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.isPropertyInExterns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPropertyInExterns(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isPropertyInExterns(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsPropertyInExterns_ReturnFalse() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        boolean actual = enumElementType.isPropertyInExterns(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.isImplicitPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnTrue_1() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = noType.isImplicitPrototype(noType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_10() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = noType.isImplicitPrototype(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnTrue() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isImplicitPrototype(functionType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_11() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = errorFunctionType.isImplicitPrototype(noType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        
        boolean actual = errorFunctionType.isImplicitPrototype(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_1() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = anonymousFunctionType.isImplicitPrototype(errorFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_2() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = functionType.isImplicitPrototype(errorFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_3() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ErrorFunctionType errorFunctionType1 = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        
        boolean actual = errorFunctionType.isImplicitPrototype(errorFunctionType1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_4() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = errorFunctionType.isImplicitPrototype(functionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_6() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        boolean actual = errorFunctionType.isImplicitPrototype(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_5() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        ErrorFunctionType returnType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Object kind1 = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.isImplicitPrototype(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_7() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = functionType.isImplicitPrototype(anonymousFunctionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_8() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        boolean actual = anonymousFunctionType.isImplicitPrototype(functionType);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.iterates iterate the loop {@code for(ObjectType current = this; current != null; current = current.getImplicitPrototype())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsImplicitPrototype_ReturnFalse_9() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrowType call = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoType returnType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        ArrowType call1 = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        Object parameters1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parameters1, "com.google.javascript.rhino.Node", "first", parameters);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters1);
        setField(call1, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call1);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        
        boolean actual = functionType.isImplicitPrototype(errorFunctionType);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getPossibleToBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPossibleToBooleanOutcomes()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getPossibleToBooleanOutcomes()}
 * @utbot.returnsFrom {@code return BooleanLiteralSet.TRUE;}
 *  */
    @Test
    public void testGetPossibleToBooleanOutcomes_ReturnBooleanLiteralSetTRUE() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        BooleanLiteralSet actual = enumElementType.getPossibleToBooleanOutcomes();
        
        BooleanLiteralSet expected = BooleanLiteralSet.TRUE;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getNormalizedReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNormalizedReferenceName()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getNormalizedReferenceName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetNormalizedReferenceName_ReturnName_1() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        String actual = noType.getNormalizedReferenceName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getNormalizedReferenceName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetNormalizedReferenceName_ReturnName_2() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        String className = "";
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        String actual = errorFunctionType.getNormalizedReferenceName();
        
        assertEquals(className, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getNormalizedReferenceName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetNormalizedReferenceName_ReturnName_3() {
        UnknownType unknownType = new UnknownType(null, false);
        
        String actual = unknownType.getNormalizedReferenceName();
        
        String expected = "?";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getNormalizedReferenceName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetNormalizedReferenceName_ReturnName_4() {
        UnknownType unknownType = new UnknownType(null, true);
        
        String actual = unknownType.getNormalizedReferenceName();
        
        String expected = "??";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getNormalizedReferenceName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetNormalizedReferenceName_ReturnName() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        String actual = anonymousFunctionType.getNormalizedReferenceName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.isFunctionPrototypeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFunctionPrototypeType()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isFunctionPrototypeType()}
 * @utbot.returnsFrom {@code return getOwnerFunction() != null;}
 *  */
    @Test
    public void testIsFunctionPrototypeType_ReturnGetOwnerFunctionEqualsNull_1() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        noType.setOwnerFunction(ownerFunction);
        
        boolean actual = noType.isFunctionPrototypeType();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isFunctionPrototypeType()}
 * @utbot.returnsFrom {@code return getOwnerFunction() != null;}
 *  */
    @Test
    public void testIsFunctionPrototypeType_ReturnGetOwnerFunctionEqualsNull() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = noType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isFunctionPrototypeType()}
 * @utbot.returnsFrom {@code return getOwnerFunction() != null;}
 *  */
    @Test
    public void testIsFunctionPrototypeType_ReturnGetOwnerFunctionEqualsNull_2() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isFunctionPrototypeType()}
 * @utbot.returnsFrom {@code return getOwnerFunction() != null;}
 *  */
    @Test
    public void testIsFunctionPrototypeType_ReturnGetOwnerFunctionEqualsNull_3() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isFunctionPrototypeType()}
 * @utbot.returnsFrom {@code return getOwnerFunction() != null;}
 *  */
    @Test
    public void testIsFunctionPrototypeType_ReturnGetOwnerFunctionEqualsNull_4() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isFunctionPrototypeType()}
 * @utbot.returnsFrom {@code return getOwnerFunction() != null;}
 *  */
    @Test
    public void testIsFunctionPrototypeType_ReturnGetOwnerFunctionEqualsNull_5() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isFunctionPrototypeType()
    
    @Test
    public void testIsFunctionPrototypeType1() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        boolean actual = enumElementType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType2() throws Exception  {
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        boolean actual = recordType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType3() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType4() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedObjType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType5() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        referencedObjType.setOwnerFunction(ownerFunction);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType6() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedObjType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        EnumElementType referencedObjType12 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedObjType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType12);
        setField(referencedObjType10, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType11);
        setField(referencedObjType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType10);
        setField(referencedObjType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType9);
        setField(referencedObjType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType8);
        setField(referencedObjType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType7);
        setField(referencedObjType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType6);
        setField(referencedObjType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType5);
        setField(referencedObjType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType4);
        setField(referencedObjType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType3);
        setField(referencedObjType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType2);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType7() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedObjType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedObjType12 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(referencedObjType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType12);
        setField(referencedObjType10, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType11);
        setField(referencedObjType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType10);
        setField(referencedObjType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType9);
        setField(referencedObjType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType8);
        setField(referencedObjType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType7);
        setField(referencedObjType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType6);
        setField(referencedObjType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType5);
        setField(referencedObjType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType4);
        setField(referencedObjType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType3);
        setField(referencedObjType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType2);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType8() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType12 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        EnumElementType referencedObjType13 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedObjType12, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType13);
        setField(referencedObjType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType12);
        setField(referencedObjType10, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType11);
        setField(referencedObjType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType10);
        setField(referencedObjType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType9);
        setField(referencedObjType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType8);
        setField(referencedObjType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType7);
        setField(referencedObjType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType6);
        setField(referencedObjType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType5);
        setField(referencedObjType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType4);
        setField(referencedObjType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType3);
        setField(referencedObjType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType2);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsFunctionPrototypeType9() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        IndexedType referencedObjType11 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        TemplateType referencedObjType12 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedObjType13 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        setField(referencedObjType12, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType13);
        setField(referencedObjType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType12);
        setField(referencedObjType10, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType11);
        setField(referencedObjType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType10);
        setField(referencedObjType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType9);
        setField(referencedObjType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType8);
        setField(referencedObjType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType7);
        setField(referencedObjType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType6);
        setField(referencedObjType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType5);
        setField(referencedObjType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType4);
        setField(referencedObjType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType3);
        setField(referencedObjType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType2);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        boolean actual = templateType.isFunctionPrototypeType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getCtorImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCtorImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getCtorImplementedInterfaces()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableSet#of()}
 * @utbot.returnsFrom {@code return ImmutableSet.of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ImmutableSetOf() throws Exception  {
        Class emptyImmutableSetClazz = Class.forName("com.google.common.collect.EmptyImmutableSet");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableSetClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableSet");
            setStaticField(emptyImmutableSetClazz, "INSTANCE", instance);
            EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
            
            Set actual = ((Set) enumElementType.getCtorImplementedInterfaces());
            
            Set expected = new LinkedHashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(emptyImmutableSetClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getCtorExtendedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCtorExtendedInterfaces()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getCtorExtendedInterfaces()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableSet#of()}
 * @utbot.returnsFrom {@code return ImmutableSet.of();}
 *  */
    @Test
    public void testGetCtorExtendedInterfaces_ImmutableSetOf() throws Exception  {
        Class emptyImmutableSetClazz = Class.forName("com.google.common.collect.EmptyImmutableSet");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableSetClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableSet");
            setStaticField(emptyImmutableSetClazz, "INSTANCE", instance);
            TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
            
            Set actual = ((Set) templateType.getCtorExtendedInterfaces());
            
            Set expected = new LinkedHashSet();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(emptyImmutableSetClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.hasOwnProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasOwnProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#hasOwnProperty(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return hasProperty(propertyName);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return hasProperty(propertyName);
 *  */
    @Test
    public void testHasOwnProperty_ThrowNullPointerException() throws Exception  {
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.hasOwnProperty] produces [java.lang.NullPointerException] */
        noObjectType.hasOwnProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getTypeOfThis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeOfThis()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getTypeOfThis()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetTypeOfThis_ReturnNull() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        ObjectType actual = enumElementType.getTypeOfThis();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.removeProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#removeProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testRemoveProperty_ReturnFalse() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        boolean actual = enumElementType.removeProperty(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getParameterType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParameterType()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParameterType()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetParameterType_ReturnNull() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        JSType actual = enumElementType.getParameterType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getPropertyNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getPropertyNode(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPropertyNode_ReturnNull() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Node actual = enumElementType.getPropertyNode(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getOwnSlot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getOwnSlot(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetOwnSlot_ReturnNull() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(noType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        ObjectType.Property actual = noType.getOwnSlot(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getOwnSlot(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetOwnSlot_ReturnNull_1() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        ObjectType.Property actual = templateType.getOwnSlot(((String) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.setJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setJSDocInfo(com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#setJSDocInfo(com.google.javascript.rhino.JSDocInfo)}
 *  */
    @Test
    public void testSetJSDocInfo() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        enumElementType.setJSDocInfo(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getParentScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getParentScope()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        ObjectType actual = noType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_2() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        ObjectType actual = enumElementType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_1() {
        UnknownType unknownType = new UnknownType(null, false);
        
        ObjectType actual = unknownType.getParentScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getParentScope()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_6() throws Exception  {
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        NoResolvedType referencedObjType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        ObjectType actual = proxyObjectType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_7() throws Exception  {
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedObjType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        ObjectType actual = proxyObjectType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_8() throws Exception  {
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        ObjectType actual = proxyObjectType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_3() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        ObjectType actual = anonymousFunctionType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_4() throws Exception  {
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        
        ObjectType actual = proxyObjectType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_5() throws Exception  {
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        ObjectType actual = proxyObjectType.getParentScope();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getParentScope()}
 * @utbot.returnsFrom {@code return getImplicitPrototype();}
 *  */
    @Test
    public void testGetParentScope_ReturnGetImplicitPrototype_9() throws Exception  {
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        ObjectType actual = proxyObjectType.getParentScope();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.hasReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasReferenceName()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasReferenceName_ReturnFalse() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        boolean actual = noType.hasReferenceName();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getIndexType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIndexType()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getIndexType()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetIndexType_ReturnNull() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        JSType actual = enumElementType.getIndexType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSDocInfo()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getJSDocInfo()}
 * @utbot.executesCondition {@code (docInfo != null): False}
 * @utbot.executesCondition {@code (getImplicitPrototype() != null): False}
 * @utbot.returnsFrom {@code return super.getJSDocInfo();}
 *  */
    @Test
    public void testGetJSDocInfo_GetImplicitPrototypeEqualsNull_1() throws Exception  {
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        JSDocInfo actual = noObjectType.getJSDocInfo();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getJSDocInfo()}
 * @utbot.executesCondition {@code (docInfo != null): False}
 * @utbot.executesCondition {@code (getImplicitPrototype() != null): False}
 * @utbot.returnsFrom {@code return super.getJSDocInfo();}
 *  */
    @Test
    public void testGetJSDocInfo_GetImplicitPrototypeEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        JSDocInfo actual = functionType.getJSDocInfo();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getJSDocInfo()}
 * @utbot.executesCondition {@code (docInfo != null): True}
 * @utbot.returnsFrom {@code return docInfo;}
 *  */
    @Test
    public void testGetJSDocInfo_ReturnDocInfo() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        
        JSDocInfo actual = enumElementType.getJSDocInfo();
        
        Object actualInfo = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "info");
        assertNull(actualInfo);
        
        Object actualDocumentation = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "documentation");
        assertNull(actualDocumentation);
        
        Node actualAssociatedNode = actual.getAssociatedNode();
        assertNull(actualAssociatedNode);
        
        JSDocInfo.Visibility actualVisibility = actual.getVisibility();
        assertNull(actualVisibility);
        
        int docInfoBitset = ((Integer) getFieldValue(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        int actualBitset = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        assertEquals(docInfoBitset, actualBitset);
        
        JSTypeExpression actualType = actual.getType();
        assertNull(actualType);
        
        JSTypeExpression actualThisType = actual.getThisType();
        assertNull(actualThisType);
        
        boolean actualIncludeDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation"));
        assertFalse(actualIncludeDocumentation);
        
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getJSDocInfo()}
 * @utbot.executesCondition {@code (docInfo != null): False}
 * @utbot.executesCondition {@code (getImplicitPrototype() != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getImplicitPrototype()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getJSDocInfo()}
 * @utbot.triggersRecursion getJSDocInfo, where the test execute conditions:
 *     {@code (docInfo != null): True}
 * return from: {@code return docInfo;}
 * @utbot.returnsFrom {@code return getImplicitPrototype().getJSDocInfo();}
 *  */
    @Test
    public void testGetJSDocInfo_GetImplicitPrototypeNotEqualsNull() throws Exception  {
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        EnumElementType referencedType2 = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        JSDocInfo actual = functionType.getJSDocInfo();
        
        Object actualInfo = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "info");
        assertNull(actualInfo);
        
        Object actualDocumentation = getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "documentation");
        assertNull(actualDocumentation);
        
        Node actualAssociatedNode = actual.getAssociatedNode();
        assertNull(actualAssociatedNode);
        
        JSDocInfo.Visibility actualVisibility = actual.getVisibility();
        assertNull(actualVisibility);
        
        int docInfoBitset = ((Integer) getFieldValue(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        int actualBitset = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "bitset"));
        assertEquals(docInfoBitset, actualBitset);
        
        JSTypeExpression actualType = actual.getType();
        assertNull(actualType);
        
        JSTypeExpression actualThisType = actual.getThisType();
        assertNull(actualThisType);
        
        boolean actualIncludeDocumentation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.JSDocInfo", "includeDocumentation"));
        assertFalse(actualIncludeDocumentation);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.hasCachedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCachedValues()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#hasCachedValues()}
 * @utbot.returnsFrom {@code return !unknown;}
 *  */
    @Test
    public void testHasCachedValues_NotUnknown() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = enumElementType.hasCachedValues();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#hasCachedValues()}
 * @utbot.returnsFrom {@code return !unknown;}
 *  */
    @Test
    public void testHasCachedValues_NotUnknown_1() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        boolean actual = templateType.hasCachedValues();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.isNativeObjectType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNativeObjectType()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isNativeObjectType()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNativeObjectType_ReturnFalse() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        boolean actual = enumElementType.isNativeObjectType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.setOwnerFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code /**
 *  * Sets the owner function. By default, does nothing.
 *  */
 * void setOwnerFunction(FunctionType type) {
 * }}
 *  */
    @Test
    public void testSetOwnerFunction_Return() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        enumElementType.setOwnerFunction(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getPropertyNames()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getPropertyNames()}
 * @utbot.invokes {@link com.google.common.collect.Sets#newTreeSet()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#collectPropertyNames(java.util.Set)}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testGetPropertyNames_ObjectTypeCollectPropertyNames() {
        UnknownType unknownType = new UnknownType(null, false);
        
        TreeSet actual = ((TreeSet) unknownType.getPropertyNames());
        
        TreeSet expected = new TreeSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getPropertyNames()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.common.collect.Sets#newTreeSet()} twice,
    ///     {@link com.google.javascript.rhino.jstype.ObjectType#collectPropertyNames(java.util.Set)} twice
    /// return from: {@code return props;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getPropertyNames()}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testGetPropertyNames_ReturnProps_1() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        UnknownType primitiveObjectType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        TreeSet actual = ((TreeSet) enumElementType.getPropertyNames());
        
        TreeSet expected = new TreeSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getPropertyNames()}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testGetPropertyNames_ReturnProps() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        TreeSet actual = ((TreeSet) enumElementType.getPropertyNames());
        
        TreeSet expected = new TreeSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getPropertyNames()}
 * @utbot.returnsFrom {@code return props;}
 *  */
    @Test
    public void testGetPropertyNames_ReturnProps_2() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        EnumElementType primitiveObjectType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType", primitiveObjectType);
        
        TreeSet actual = ((TreeSet) enumElementType.getPropertyNames());
        
        TreeSet expected = new TreeSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.clearCachedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clearCachedValues()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#clearCachedValues()}
 *  */
    @Test
    public void testClearCachedValues() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        enumElementType.clearCachedValues();
        
        boolean finalEnumElementTypeUnknown = ((Boolean) getFieldValue(enumElementType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertTrue(finalEnumElementTypeUnknown);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.getOwnerFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnerFunction()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#getOwnerFunction()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetOwnerFunction_ReturnNull() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        FunctionType actual = enumElementType.getOwnerFunction();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.ObjectType.isUnknownType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUnknownType()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.executesCondition {@code (unknown): False}
 * @utbot.returnsFrom {@code return unknown;}
 *  */
    @Test
    public void testIsUnknownType_NotUnknown() throws Exception  {
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        boolean actual = enumElementType.isUnknownType();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.executesCondition {@code (unknown): True}
 * @utbot.returnsFrom {@code return unknown;}
 *  */
    @Test
    public void testIsUnknownType_Unknown() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList extendedInterfaces = new ArrayList();
        ownerFunction.setExtendedInterfaces(extendedInterfaces);
        errorFunctionType.setOwnerFunction(ownerFunction);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = errorFunctionType.isUnknownType();
        
        assertFalse(actual);
        
        boolean finalErrorFunctionTypeUnknown = ((Boolean) getFieldValue(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalErrorFunctionTypeUnknown);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.executesCondition {@code (unknown): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isNativeObjectType()}
 * @utbot.invokes {@link com.google.common.collect.EmptyImmutableList#iterator()}
 * @utbot.invokes {@link com.google.common.collect.EmptyImmutableList#iterator()}
 * @utbot.returnsFrom {@code return unknown;}
 *  */
    @Test
    public void testIsUnknownType_ObjectTypeIsNativeObjectType() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        Class iteratorsClazz = Class.forName("com.google.common.collect.Iterators");
        UnmodifiableIterator prevEMPTY_ITERATOR = ((UnmodifiableIterator) getStaticFieldValue(iteratorsClazz, "EMPTY_ITERATOR"));
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            UnmodifiableIterator emptyIterator = ((UnmodifiableIterator) createInstance("com.google.common.collect.Iterators$1"));
            setStaticField(iteratorsClazz, "EMPTY_ITERATOR", emptyIterator);
            ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
            FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
            setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
            setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
            
            boolean actual = errorFunctionType.isUnknownType();
            
            assertFalse(actual);
            
            boolean finalErrorFunctionTypeUnknown = ((Boolean) getFieldValue(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
            
            assertFalse(finalErrorFunctionTypeUnknown);
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
            setStaticField(com.google.common.collect.Iterators.class, "EMPTY_ITERATOR", prevEMPTY_ITERATOR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.executesCondition {@code (unknown): True}
 * @utbot.returnsFrom {@code return unknown;}
 *  */
    @Test
    public void testIsUnknownType_Unknown_1() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrayList extendedInterfaces = new ArrayList();
        UnresolvedTypeExpression unresolvedTypeExpression = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        extendedInterfaces.add(unresolvedTypeExpression);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        ownerFunction.setExtendedInterfaces(extendedInterfaces);
        errorFunctionType.setOwnerFunction(ownerFunction);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = errorFunctionType.isUnknownType();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.executesCondition {@code (unknown): True}
 * @utbot.returnsFrom {@code return unknown;}
 *  */
    @Test
    public void testIsUnknownType_Unknown_2() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrayList extendedInterfaces = new ArrayList();
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        templateType.setReferencedType(referencedType);
        extendedInterfaces.add(templateType);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        ownerFunction.setExtendedInterfaces(extendedInterfaces);
        errorFunctionType.setOwnerFunction(ownerFunction);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = errorFunctionType.isUnknownType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isUnknownType()
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType interfaceType: getCtorExtendedInterfaces())
 *  */
    @Test
    public void testIsUnknownType_ThrowNullPointerException_3() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        noType.setOwnerFunction(ownerFunction);
        setField(noType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:504) */
        noType.isUnknownType();
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isNativeObjectType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType interfaceType: getCtorExtendedInterfaces())
 *  */
    @Test
    public void testIsUnknownType_ThrowNullPointerException_2() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        errorFunctionType.setOwnerFunction(ownerFunction);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:504) */
        errorFunctionType.isUnknownType();
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType interfaceType: getCtorExtendedInterfaces())
 *  */
    @Test
    public void testIsUnknownType_ThrowNullPointerException() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        errorFunctionType.setOwnerFunction(ownerFunction);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:504) */
        errorFunctionType.isUnknownType();
    }
    
    /**
    @utbot.classUnderTest {@link ObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.ObjectType#isUnknownType()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: interfaceType.isUnknownType()
 *  */
    @Test
    public void testIsUnknownType_ThrowNullPointerException_1() throws Exception  {
        ErrorFunctionType errorFunctionType = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ArrayList extendedInterfaces = new ArrayList();
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        ownerFunction.setExtendedInterfaces(extendedInterfaces);
        errorFunctionType.setOwnerFunction(ownerFunction);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:505) */
        errorFunctionType.isUnknownType();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isUnknownType()
    
    @Test
    public void testIsUnknownType1() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoResolvedType referencedObjType1 = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(referencedObjType1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = anonymousFunctionType.isUnknownType();
        
        assertFalse(actual);
        
        boolean finalAnonymousFunctionTypeUnknown = ((Boolean) getFieldValue(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        
        assertFalse(finalAnonymousFunctionTypeUnknown);
    }
    
    @Test
    public void testIsUnknownType2() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = anonymousFunctionType.isUnknownType();
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsUnknownType3() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnresolvedTypeExpression referencedType1 = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        referencedType.setReferencedType(referencedType1);
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = anonymousFunctionType.isUnknownType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isUnknownType()
    
    @Test
    public void testIsUnknownType4() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedObjType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedObjType2 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(referencedObjType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType2);
        setField(referencedObjType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.ObjectType.isUnknownType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:142)
            com.google.javascript.rhino.jstype.TemplateType.isUnknownType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:511) */
        anonymousFunctionType.isUnknownType();
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields916828766188200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields916828766188200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass916828766193300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916828766188200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916828766193300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields916828766973200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields916828766973200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass916828766974900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916828766973200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916828766974900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields916828767168800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields916828767168800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass916828767170700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916828767168800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916828767170700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields916828767588800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields916828767588800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass916828767589800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916828767588800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916828767589800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

