package com.google.javascript.rhino.jstype;

import org.junit.Test;
import com.google.javascript.rhino.JSDocInfo;
import java.util.List;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_rhino_jstype_PrototypeObjectTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConstructor()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getConstructor()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetConstructor_ReturnNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        FunctionType actual = prototypeObjectType.getConstructor();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSlot(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getSlot(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: properties.containsKey(name)
 *  */
    @Test
    public void testGetSlot_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129) */
        prototypeObjectType.getSlot(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setPropertyJSDocInfo(java.lang.String,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): False}
 *  */
    @Test
    public void testSetPropertyJSDocInfo_InfoEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setPropertyJSDocInfo(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setPropertyJSDocInfo(java.lang.String,com.google.javascript.rhino.JSDocInfo)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !properties.containsKey(propertyName)
 *  */
    @Test
    public void testSetPropertyJSDocInfo_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        JSDocInfo jSDocInfo = new JSDocInfo();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.setPropertyJSDocInfo(PrototypeObjectType.java:281) */
        prototypeObjectType.setPropertyJSDocInfo(null, jSDocInfo);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchesObjectContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesObjectContext()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesObjectContext()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testMatchesObjectContext_ReturnTrue() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.matchesObjectContext();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCtorImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ImmutableListOf() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
            
            List actual = ((List) prototypeObjectType.getCtorImplementedInterfaces());
            
            List expected = new ArrayList();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        NoType type = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getImplementedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType_2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        ErrorFunctionType type = ((ErrorFunctionType) createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorImplementedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionImplementedInterfaces);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCtorImplementedInterfaces()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getOwnerFunction().getImplementedInterfaces()
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ThrowClassCastException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        AllType type = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2599dd0b)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:333)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:774)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:461)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces(PrototypeObjectType.java:529) */
        prototypeObjectType.getCtorImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getOwnerFunction().getImplementedInterfaces()
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ThrowClassCastException_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2599dd0b)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:890)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:321)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:774)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:461)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces(PrototypeObjectType.java:529) */
        prototypeObjectType.getCtorImplementedInterfaces();
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorImplementedInterfaces()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCtorImplementedInterfaces_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:890)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:321)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:774)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:461)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces(PrototypeObjectType.java:529) */
        prototypeObjectType.getCtorImplementedInterfaces();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchesNumberContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesNumberContext()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesNumberContext()}
 * @utbot.executesCondition {@code (isStringObjectType()): True}
 * @utbot.executesCondition {@code (isStringObjectType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNumberObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isDateType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isBooleanObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isStringObjectType()}
 * @utbot.invokes com.google.javascript.rhino.jstype.PrototypeObjectType#hasOverridenNativeProperty(java.lang.String)
 * @utbot.returnsFrom {@code return isNumberObjectType() || isDateType() || isBooleanObjectType() || isStringObjectType() || hasOverridenNativeProperty("valueOf");}
 *  */
    @Test
    public void testMatchesNumberContext_NotIsStringObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        boolean actual = prototypeObjectType.matchesNumberContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorExtendedInterfaces
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCtorExtendedInterfaces()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorExtendedInterfaces()}
 * @utbot.executesCondition {@code (isFunctionPrototypeType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnerFunction()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getExtendedInterfaces()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getExtendedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorExtendedInterfaces_IsFunctionPrototypeType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        Iterable actual = prototypeObjectType.getCtorExtendedInterfaces();
        
        assertNull(actual);
        
        FunctionType prototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        List finalPrototypeObjectTypeOwnerFunctionExtendedInterfaces = ((List) getFieldValue(prototypeObjectTypeOwnerFunction, "com.google.javascript.rhino.jstype.FunctionType", "extendedInterfaces"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunctionExtendedInterfaces);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getCtorExtendedInterfaces()}
 * @utbot.executesCondition {@code (isFunctionPrototypeType()): False}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#of()}
 * @utbot.returnsFrom {@code return isFunctionPrototypeType() ? getOwnerFunction().getExtendedInterfaces() : ImmutableList.<ObjectType>of();}
 *  */
    @Test
    public void testGetCtorExtendedInterfaces_NotIsFunctionPrototypeType() throws Exception  {
        Class emptyImmutableListClazz = Class.forName("com.google.common.collect.EmptyImmutableList");
        Object prevINSTANCE = getStaticFieldValue(emptyImmutableListClazz, "INSTANCE");
        try {
            Object instance = createInstance("com.google.common.collect.EmptyImmutableList");
            setStaticField(emptyImmutableListClazz, "INSTANCE", instance);
            PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
            
            List actual = ((List) prototypeObjectType.getCtorExtendedInterfaces());
            
            List expected = new ArrayList();
            
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(emptyImmutableListClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchesStringContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchesStringContext()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchesStringContext()}
 * @utbot.executesCondition {@code (isRegexpType()): True}
 * @utbot.executesCondition {@code (isRegexpType()): True}
 * @utbot.executesCondition {@code (isRegexpType()): True}
 * @utbot.executesCondition {@code (isBooleanObjectType()): True}
 * @utbot.executesCondition {@code (isBooleanObjectType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isTheObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isStringObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isDateType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isRegexpType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isArrayType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNumberObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isBooleanObjectType()}
 * @utbot.invokes com.google.javascript.rhino.jstype.PrototypeObjectType#hasOverridenNativeProperty(java.lang.String)
 * @utbot.returnsFrom {@code return isTheObjectType() || isStringObjectType() || isDateType() || isRegexpType() || isArrayType() || isNumberObjectType() || isBooleanObjectType() || hasOverridenNativeProperty("toString");}
 *  */
    @Test
    public void testMatchesStringContext_NotIsBooleanObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        boolean actual = prototypeObjectType.matchesStringContext();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchRecordTypeConstraint(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchRecordTypeConstraint(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getOwnPropertyNames()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String prop: constraintObj.getOwnPropertyNames())
 *  */
    @Test
    public void testMatchRecordTypeConstraint_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:577) */
        prototypeObjectType.matchRecordTypeConstraint(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchRecordTypeConstraint(com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testMatchRecordTypeConstraint1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:179)
            com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames(FunctionType.java:303)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:577) */
        prototypeObjectType.matchRecordTypeConstraint(noType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOwnPropertyNames()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyNames()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return properties.keySet();
 *  */
    @Test
    public void testGetOwnPropertyNames_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:179) */
        prototypeObjectType.getOwnPropertyNames();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOwnPropertyNames()
    
    @Test
    public void testGetOwnPropertyNames1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        Set actual = prototypeObjectType.getOwnPropertyNames();
        
        Set expected = new LinkedHashSet();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method collectPropertyNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#collectPropertyNames(java.util.Set)}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String prop: properties.keySet())
 *  */
    @Test
    public void testCollectPropertyNames_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames(PrototypeObjectType.java:193) */
        prototypeObjectType.collectPropertyNames(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method collectPropertyNames(java.util.Set)
    
    @Test
    public void testCollectPropertyNames1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        prototypeObjectType.collectPropertyNames(linkedHashSet);
    }
    
    @Test
    public void testCollectPropertyNames2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        prototypeObjectType.collectPropertyNames(linkedHashSet);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method collectPropertyNames(java.util.Set)
    
    @Test
    public void testCollectPropertyNames3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        properties.put(string, null);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames(PrototypeObjectType.java:194) */
        prototypeObjectType.collectPropertyNames(null);
    }
    
    @Test
    public void testCollectPropertyNames4() throws Throwable  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        properties.put(null, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        Object synchronizedSortedSet = createInstance("com.google.common.collect.Synchronized$SynchronizedSortedSet");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames] produces [java.lang.NullPointerException]
            com.google.common.collect.Synchronized$SynchronizedCollection.add(Synchronized.java:114)
            com.google.javascript.rhino.jstype.PrototypeObjectType.collectPropertyNames(PrototypeObjectType.java:194) */
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class synchronizedSortedSetType = Class.forName("java.util.Set");
        Method collectPropertyNamesMethod = prototypeObjectTypeClazz.getDeclaredMethod("collectPropertyNames", synchronizedSortedSetType);
        collectPropertyNamesMethod.setAccessible(true);
        java.lang.Object[] collectPropertyNamesMethodArguments = new java.lang.Object[1];
        collectPropertyNamesMethodArguments[0] = synchronizedSortedSet;
        try {
            collectPropertyNamesMethod.invoke(prototypeObjectType, collectPropertyNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnPropertyJSDocInfo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetOwnPropertyJSDocInfo_PEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        JSDocInfo actual = prototypeObjectType.getOwnPropertyJSDocInfo(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getOwnPropertyJSDocInfo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Property p = properties.get(propertyName);
 *  */
    @Test
    public void testGetOwnPropertyJSDocInfo_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo(PrototypeObjectType.java:271) */
        prototypeObjectType.getOwnPropertyJSDocInfo(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getOwnPropertyJSDocInfo(java.lang.String)
    
    @Test
    public void testGetOwnPropertyJSDocInfo1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(string, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        JSDocInfo actual = prototypeObjectType.getOwnPropertyJSDocInfo(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getOwnPropertyJSDocInfo(java.lang.String)
    
    @Test
    public void testGetOwnPropertyJSDocInfo2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        String string = "";
        java.lang.Object[] objectArray = new java.lang.Object[2];
        objectArray[1] = ((Object) string);
        properties.put(string, objectArray);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string1 = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class com.google.javascript.rhino.jstype.ObjectType$Property ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.ObjectType$Property is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2599dd0b)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo(PrototypeObjectType.java:271) */
        prototypeObjectType.getOwnPropertyJSDocInfo(string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setImplicitPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (checkState(!hasCachedValues());): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 *  */
    @Test
    public void testSetImplicitPrototype_CheckState() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        prototypeObjectType.setImplicitPrototype(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setImplicitPrototype(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (checkState(!hasCachedValues());): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: checkState(!hasCachedValues());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetImplicitPrototype_ThrowIllegalStateException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setImplicitPrototype(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isPropertyTypeDeclared(java.lang.String)
    
    @Test
    public void testIsPropertyTypeDeclared1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyTypeDeclared(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyTypeDeclared2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyTypeDeclared(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyTypeDeclared3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        boolean actual = prototypeObjectType.isPropertyTypeDeclared(null);
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsPropertyTypeDeclared4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        String string = "";
        properties.put(string, null);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string1 = "";
        
        boolean actual = prototypeObjectType.isPropertyTypeDeclared(string1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isPropertyTypeDeclared(java.lang.String)
    
    @Test
    public void testIsPropertyTypeDeclared5() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        NoObjectType implicitPrototypeFallback = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.FunctionType.getSlot(FunctionType.java:289)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:134)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared(PrototypeObjectType.java:184) */
        prototypeObjectType.isPropertyTypeDeclared(string);
    }
    
    @Test
    public void testIsPropertyTypeDeclared6() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        PrototypeObjectType implicitPrototypeFallback = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:134)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared(PrototypeObjectType.java:184) */
        prototypeObjectType.isPropertyTypeDeclared(null);
    }
    
    @Test
    public void testIsPropertyTypeDeclared7() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:139)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeDeclared(PrototypeObjectType.java:184) */
        prototypeObjectType.isPropertyTypeDeclared(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isPropertyTypeInferred(java.lang.String)
    
    @Test
    public void testIsPropertyTypeInferred1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyTypeInferred(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyTypeInferred2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyTypeInferred(string);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyTypeInferred3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        boolean actual = prototypeObjectType.isPropertyTypeInferred(null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsPropertyTypeInferred4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(null, property);
        String string = "";
        properties.put(string, null);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string1 = "";
        
        boolean actual = prototypeObjectType.isPropertyTypeInferred(string1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isPropertyTypeInferred(java.lang.String)
    
    @Test
    public void testIsPropertyTypeInferred5() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        NoObjectType implicitPrototypeFallback = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.FunctionType.getSlot(FunctionType.java:289)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:134)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred(PrototypeObjectType.java:204) */
        prototypeObjectType.isPropertyTypeInferred(string);
    }
    
    @Test
    public void testIsPropertyTypeInferred6() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        PrototypeObjectType implicitPrototypeFallback = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:134)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred(PrototypeObjectType.java:204) */
        prototypeObjectType.isPropertyTypeInferred(null);
    }
    
    @Test
    public void testIsPropertyTypeInferred7() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:139)
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyTypeInferred(PrototypeObjectType.java:204) */
        prototypeObjectType.isPropertyTypeInferred(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getImplicitPrototype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImplicitPrototype()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getImplicitPrototype()}
 * @utbot.returnsFrom {@code return implicitPrototypeFallback;}
 *  */
    @Test
    public void testGetImplicitPrototype_ReturnImplicitPrototypeFallback() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        ObjectType actual = prototypeObjectType.getImplicitPrototype();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOverridenNativeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasOverridenNativeProperty(java.lang.String)}
 * @utbot.executesCondition {@code (isNativeObjectType()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNativeObjectType()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasOverridenNativeProperty_IsNativeObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method hasOverridenNativePropertyMethod = prototypeObjectTypeClazz.getDeclaredMethod("hasOverridenNativeProperty", stringType);
        hasOverridenNativePropertyMethod.setAccessible(true);
        java.lang.Object[] hasOverridenNativePropertyMethodArguments = new java.lang.Object[1];
        hasOverridenNativePropertyMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) hasOverridenNativePropertyMethod.invoke(prototypeObjectType, hasOverridenNativePropertyMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasOverridenNativeProperty(java.lang.String)
    
    @Test
    public void testHasOverridenNativeProperty1() throws Throwable  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        String string = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.FunctionType.getSlot(FunctionType.java:289)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:134)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyType(PrototypeObjectType.java:213)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOverridenNativeProperty(PrototypeObjectType.java:320) */
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method hasOverridenNativePropertyMethod = prototypeObjectTypeClazz.getDeclaredMethod("hasOverridenNativeProperty", stringType);
        hasOverridenNativePropertyMethod.setAccessible(true);
        java.lang.Object[] hasOverridenNativePropertyMethodArguments = new java.lang.Object[1];
        hasOverridenNativePropertyMethodArguments[0] = string;
        try {
            hasOverridenNativePropertyMethod.invoke(prototypeObjectType, hasOverridenNativePropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.implicitPrototypeChainIsUnknown
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method implicitPrototypeChainIsUnknown()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        UnknownType implicitPrototypeFallback = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_ReturnFalse() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType implicitPrototypeFallback = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType implicitPrototypeFallback = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#implicitPrototypeChainIsUnknown()}
 *  */
    @Test
    public void testImplicitPrototypeChainIsUnknown_4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType implicitPrototypeFallback = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ProxyObjectType referencedType4 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        implicitPrototypeFallback.setReferencedType(referencedType);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Method implicitPrototypeChainIsUnknownMethod = prototypeObjectTypeClazz.getDeclaredMethod("implicitPrototypeChainIsUnknown");
        implicitPrototypeChainIsUnknownMethod.setAccessible(true);
        java.lang.Object[] implicitPrototypeChainIsUnknownMethodArguments = new java.lang.Object[0];
        boolean actual = ((Boolean) implicitPrototypeChainIsUnknownMethod.invoke(prototypeObjectType, implicitPrototypeChainIsUnknownMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyInExterns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPropertyInExterns(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPropertyInExterns(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): False}
 * @utbot.executesCondition {@code (implicitPrototype != null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getImplicitPrototype()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsPropertyInExterns_ImplicitPrototypeEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.isPropertyInExterns(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPropertyInExterns(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPropertyInExterns(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Property p = properties.get(propertyName);
 *  */
    @Test
    public void testIsPropertyInExterns_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyInExterns] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.isPropertyInExterns(PrototypeObjectType.java:222) */
        prototypeObjectType.isPropertyInExterns(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasOwnProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasOwnProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return properties.get(propertyName) != null;}
 *  */
    @Test
    public void testHasOwnProperty_PropertiesGetEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.hasOwnProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasOwnProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasOwnProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return properties.get(propertyName) != null;
 *  */
    @Test
    public void testHasOwnProperty_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasOwnProperty(PrototypeObjectType.java:174) */
        prototypeObjectType.hasOwnProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertiesCount()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertiesCount()}
 * @utbot.executesCondition {@code (implicitPrototype == null): False}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String property: properties.keySet())
 *  */
    @Test
    public void testGetPropertiesCount_ThrowNullPointerException_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount(PrototypeObjectType.java:158) */
        prototypeObjectType.getPropertiesCount();
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertiesCount()}
 * @utbot.executesCondition {@code (implicitPrototype == null): True}
 * @utbot.invokes {@link java.util.Map#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return this.properties.size();
 *  */
    @Test
    public void testGetPropertiesCount_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertiesCount(PrototypeObjectType.java:155) */
        prototypeObjectType.getPropertiesCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.canBeCalled
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canBeCalled()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#canBeCalled()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isRegexpType()}
 * @utbot.returnsFrom {@code return isRegexpType();}
 *  */
    @Test
    public void testCanBeCalled_PrototypeObjectTypeIsRegexpType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.canBeCalled();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferenceName()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (className != null): True}
 * @utbot.returnsFrom {@code return className;}
 *  */
    @Test
    public void testGetReferenceName_ClassNameNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        String actual = prototypeObjectType.getReferenceName();
        
        assertEquals(className, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (className != null): False}
 * @utbot.executesCondition {@code (ownerFunction != null): True}
 * @utbot.returnsFrom {@code return ownerFunction.getReferenceName() + ".prototype";}
 *  */
    @Test
    public void testGetReferenceName_OwnerFunctionNotEqualsNull_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        String actual = prototypeObjectType.getReferenceName();
        
        String expected = "null.prototype";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (className != null): False}
 * @utbot.executesCondition {@code (ownerFunction != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetReferenceName_ReturnNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        String actual = prototypeObjectType.getReferenceName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.executesCondition {@code (ownerFunction != null): True}
 * @utbot.returnsFrom {@code return ownerFunction.getReferenceName() + ".prototype";}
 *  */
    @Test
    public void testGetReferenceName_OwnerFunctionNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        String actual = prototypeObjectType.getReferenceName();
        
        String expected = "null.prototype";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasReferenceName()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return className != null || ownerFunction != null;}
 *  */
    @Test
    public void testHasReferenceName_ClassNameNotEqualsNullOrOwnerFunctionNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        boolean actual = prototypeObjectType.hasReferenceName();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return className != null || ownerFunction != null;}
 *  */
    @Test
    public void testHasReferenceName_ClassNameNotEqualsNullOrOwnerFunctionNotEqualsNull_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        boolean actual = prototypeObjectType.hasReferenceName();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasReferenceName()}
 * @utbot.returnsFrom {@code return className != null || ownerFunction != null;}
 *  */
    @Test
    public void testHasReferenceName_ClassNameEqualsNullOrOwnerFunctionEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.hasReferenceName();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        proxyObjectType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        parameterizedType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(parameterizedType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        UnknownType unknownType = new UnknownType(null, false);
        
        boolean actual = prototypeObjectType.isSubtype(unknownType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ProxyObjectType referencedType3 = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        proxyObjectType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(proxyObjectType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.defineProperty
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)
    
    @Test
    public void testDefineProperty1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class prototypeObjectTypeClazz = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class stringType = Class.forName("java.lang.String");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class booleanType = boolean.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method definePropertyMethod = prototypeObjectTypeClazz.getDeclaredMethod("defineProperty", stringType, jSTypeType, booleanType, numberNodeType);
        definePropertyMethod.setAccessible(true);
        java.lang.Object[] definePropertyMethodArguments = new java.lang.Object[4];
        definePropertyMethodArguments[0] = string;
        definePropertyMethodArguments[1] = ((Object) null);
        definePropertyMethodArguments[2] = false;
        definePropertyMethodArguments[3] = numberNode;
        boolean actual = ((Boolean) definePropertyMethod.invoke(prototypeObjectType, definePropertyMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.unboxesTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unboxesTo()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#unboxesTo()}
 * @utbot.executesCondition {@code (isStringObjectType()): False}
 * @utbot.executesCondition {@code (isBooleanObjectType()): False}
 * @utbot.executesCondition {@code (isNumberObjectType()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isStringObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isBooleanObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNumberObjectType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#unboxesTo()}
 * @utbot.returnsFrom {@code return super.unboxesTo();}
 *  */
    @Test
    public void testUnboxesTo_NotIsNumberObjectType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        JSType actual = prototypeObjectType.unboxesTo();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#removeProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.returnsFrom {@code return properties.remove(name) != null;}
 *  */
    @Test
    public void testRemoveProperty_PropertiesRemoveEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        boolean actual = prototypeObjectType.removeProperty(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeProperty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#removeProperty(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#remove(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return properties.remove(name) != null;
 *  */
    @Test
    public void testRemoveProperty_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.removeProperty(PrototypeObjectType.java:253) */
        prototypeObjectType.removeProperty(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertyNode(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): False}
 * @utbot.executesCondition {@code (implicitPrototype != null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getImplicitPrototype()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPropertyNode_ImplicitPrototypeEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        String string = "";
        
        Node actual = prototypeObjectType.getPropertyNode(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyNode(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getPropertyNode(java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Property p = properties.get(propertyName);
 *  */
    @Test
    public void testGetPropertyNode_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getPropertyNode(PrototypeObjectType.java:258) */
        prototypeObjectType.getPropertyNode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isPrettyPrint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPrettyPrint()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isPrettyPrint()}
 * @utbot.returnsFrom {@code return prettyPrint;}
 *  */
    @Test
    public void testIsPrettyPrint_ReturnPrettyPrint() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.isPrettyPrint();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.toStringHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringHelper(boolean)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#toStringHelper(boolean)}
 * @utbot.executesCondition {@code (hasReferenceName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getReferenceName()}
 * @utbot.returnsFrom {@code return getReferenceName();}
 *  */
    @Test
    public void testToStringHelper_HasReferenceName() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        String actual = prototypeObjectType.toStringHelper(false);
        
        assertEquals(className, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#toStringHelper(boolean)}
 * @utbot.executesCondition {@code (hasReferenceName()): False}
 * @utbot.executesCondition {@code (prettyPrint): False}
 * @utbot.executesCondition {@code (forAnnotations): True}
 * @utbot.returnsFrom {@code return forAnnotations ? "?" : "{...}";}
 *  */
    @Test
    public void testToStringHelper_ForAnnotations() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        String actual = prototypeObjectType.toStringHelper(true);
        
        String expected = "?";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#toStringHelper(boolean)}
 * @utbot.executesCondition {@code (hasReferenceName()): False}
 * @utbot.executesCondition {@code (prettyPrint): False}
 * @utbot.executesCondition {@code (forAnnotations): False}
 * @utbot.returnsFrom {@code return forAnnotations ? "?" : "{...}";}
 *  */
    @Test
    public void testToStringHelper_NotForAnnotations() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        String actual = prototypeObjectType.toStringHelper(false);
        
        String expected = "{...}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setPrettyPrint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPrettyPrint(boolean)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setPrettyPrint(boolean)}
 *  */
    @Test
    public void testSetPrettyPrint() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setPrettyPrint(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnerFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnerFunction()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnerFunction()}
 * @utbot.returnsFrom {@code return ownerFunction;}
 *  */
    @Test
    public void testGetOwnerFunction_ReturnOwnerFunction() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        FunctionType actual = prototypeObjectType.getOwnerFunction();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.setOwnerFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): True}
 *  */
    @Test
    public void testSetOwnerFunction_PreconditionsCheckState() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        prototypeObjectType.setOwnerFunction(null);
        
        FunctionType finalPrototypeObjectTypeOwnerFunction = ((FunctionType) getFieldValue(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction"));
        
        assertNull(finalPrototypeObjectTypeOwnerFunction);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): False}
 *  */
    @Test
    public void testSetOwnerFunction_PreconditionsCheckState_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        prototypeObjectType.setOwnerFunction(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#setOwnerFunction(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(ownerFunction == null || type == null);): False}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(ownerFunction == null || type == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSetOwnerFunction_ThrowIllegalStateException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        prototypeObjectType.setOwnerFunction(noObjectType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.hasCachedValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasCachedValues()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.returnsFrom {@code return super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_ReturnSuperHasCachedValues() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        boolean actual = prototypeObjectType.hasCachedValues();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasCachedValues()}
 * @utbot.returnsFrom {@code return super.hasCachedValues();}
 *  */
    @Test
    public void testHasCachedValues_ReturnSuperHasCachedValues_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.hasCachedValues();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isNativeObjectType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNativeObjectType()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isNativeObjectType()}
 * @utbot.returnsFrom {@code return nativeType;}
 *  */
    @Test
    public void testIsNativeObjectType_ReturnNativeType() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        boolean actual = prototypeObjectType.isNativeObjectType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (ObjectType) implicitPrototype.resolve(t, scope)
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        UnionType resolveResult = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2599dd0b)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:547) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: (ObjectType) implicitPrototype.resolve(t, scope)
 *  */
    @Test
    public void testResolveInternal_ThrowClassCastException_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        FunctionType resolveResult = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @2599dd0b)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:547) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: (ObjectType) implicitPrototype.resolve(t, scope)
 *  */
    @Test
    public void testResolveInternal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        EnumElementType implicitPrototypeFallback = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1145)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:547) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property prop: properties.values())
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", implicitPrototypeFallback);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:549) */
        prototypeObjectType.resolveInternal(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (implicitPrototype != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Property prop: properties.values())
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:549) */
        prototypeObjectType.resolveInternal(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchConstraint(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testMatchConstraint_Return() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        String className = "";
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        prototypeObjectType.matchConstraint(null);
    }
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchConstraint(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testMatchConstraint_Return_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        prototypeObjectType.matchConstraint(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchConstraint(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.PrototypeObjectType#hasReferenceName()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isRecordType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: constraint.isRecordType()
 *  */
    @Test
    public void testMatchConstraint_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:571) */
        prototypeObjectType.matchConstraint(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testMatchConstraint1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        prototypeObjectType.matchConstraint(enumElementType);
    }
    
    @Test
    public void testMatchConstraint2() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ProxyObjectType proxyObjectType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        ProxyObjectType referencedType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        RecordType referencedType1 = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        referencedType.setReferencedType(referencedType1);
        proxyObjectType.setReferencedType(referencedType);
        
        prototypeObjectType.matchConstraint(proxyObjectType);
    }
    
    @Test
    public void testMatchConstraint3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        parameterizedType.setReferencedType(referencedType);
        
        prototypeObjectType.matchConstraint(parameterizedType);
    }
    
    @Test
    public void testMatchConstraint4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        parameterizedType.setReferencedType(referencedType);
        NoObjectType referencedObjType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(referencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        prototypeObjectType.matchConstraint(parameterizedType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchConstraint(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testMatchConstraint5() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:179)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:577)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:572) */
        prototypeObjectType.matchConstraint(recordType);
    }
    
    @Test
    public void testMatchConstraint6() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        parameterizedType.setReferencedType(referencedType);
        PrototypeObjectType referencedObjType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:179)
            com.google.javascript.rhino.jstype.ProxyObjectType.getOwnPropertyNames(ProxyObjectType.java:370)
            com.google.javascript.rhino.jstype.ParameterizedType.getOwnPropertyNames(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:577)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:572) */
        prototypeObjectType.matchConstraint(parameterizedType);
    }
    
    @Test
    public void testMatchConstraint7() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        parameterizedType.setReferencedType(referencedType);
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(referencedObjType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:179)
            com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames(FunctionType.java:303)
            com.google.javascript.rhino.jstype.ProxyObjectType.getOwnPropertyNames(ProxyObjectType.java:370)
            com.google.javascript.rhino.jstype.ParameterizedType.getOwnPropertyNames(ParameterizedType.java:50)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchRecordTypeConstraint(PrototypeObjectType.java:577)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:572) */
        prototypeObjectType.matchConstraint(parameterizedType);
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
                
            java.lang.reflect.Method methodForGetDeclaredFields917353422202000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields917353422202000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass917353422209800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917353422202000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917353422209800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields917353422812800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields917353422812800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass917353422816100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917353422812800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917353422816100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields917353426128400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields917353426128400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass917353426131700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917353426128400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917353426131700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields917353426386600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields917353426386600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass917353426389900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917353426386600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917353426389900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

