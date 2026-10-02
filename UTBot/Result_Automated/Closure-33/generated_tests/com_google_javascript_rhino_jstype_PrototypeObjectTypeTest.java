package com.google.javascript.rhino.jstype;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.ObjectType.Property;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.JSDocInfo.Visibility;
import com.google.javascript.rhino.JSTypeExpression;
import java.util.Set;
import java.util.LinkedHashSet;
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_rhino_jstype_PrototypeObjectTypeTest {
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
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
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
    public void testGetCtorImplementedInterfaces_ReturnIsFunctionPrototypeType_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        NoType ownerFunction = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        FunctionType type = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
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
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        NumberType type = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        prototypeSlot.setType(type);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20d5bdb1)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:329)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:766)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:453)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces(PrototypeObjectType.java:528) */
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
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[35] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20d5bdb1)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:317)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:766)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:453)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces(PrototypeObjectType.java:528) */
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
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(ownerFunction, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        prototypeObjectType.setOwnerFunction(ownerFunction);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:879)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:317)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:766)
            com.google.javascript.rhino.jstype.FunctionType.getImplementedInterfaces(FunctionType.java:453)
            com.google.javascript.rhino.jstype.PrototypeObjectType.getCtorImplementedInterfaces(PrototypeObjectType.java:528) */
        prototypeObjectType.getCtorImplementedInterfaces();
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyJSDocInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnPropertyJSDocInfo(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): False}
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
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.executesCondition {@code (p != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType.Property#getJSDocInfo()}
 * @utbot.returnsFrom {@code return p.getJSDocInfo();}
 *  */
    @Test
    public void testGetOwnPropertyJSDocInfo_PNotEqualsNull() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(property, "com.google.javascript.rhino.jstype.ObjectType$Property", "docInfo", docInfo);
        properties.put(string, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        JSDocInfo actual = prototypeObjectType.getOwnPropertyJSDocInfo(string);
        
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
    public void testImplicitPrototypeChainIsUnknown_3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        ProxyObjectType implicitPrototypeFallback = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
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
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
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
        ProxyObjectType implicitPrototypeFallback = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType4 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOwnPropertyNames()
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#getOwnPropertyNames()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.returnsFrom {@code return properties.keySet();}
 *  */
    @Test
    public void testGetOwnPropertyNames_MapKeySet() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        LinkedHashMap properties = new LinkedHashMap();
        String string = "";
        ObjectType.Property property = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        properties.put(string, property);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        Set actual = prototypeObjectType.getOwnPropertyNames();
        
        Set expected = new LinkedHashSet();
        expected.add(string);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.isSubtype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSubtype(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#isSubtype(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testIsSubtype_ReturnTrue_1() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        templateType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(templateType);
        
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
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        templateType.setReferencedType(referencedType);
        
        boolean actual = prototypeObjectType.isSubtype(templateType);
        
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
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NamedType referencedType3 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
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
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
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
        NoResolvedType ownerFunction = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
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
        NoResolvedType ownerFunction = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
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
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchConstraint(com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link PrototypeObjectType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.PrototypeObjectType#matchConstraint(com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#isRecordType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: constraintObj.isRecordType()
 *  */
    @Test
    public void testMatchConstraint_ThrowNullPointerException() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:567) */
        prototypeObjectType.matchConstraint(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method matchConstraint(com.google.javascript.rhino.jstype.ObjectType)
    
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
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        proxyObjectType.setReferencedType(referencedType);
        
        prototypeObjectType.matchConstraint(proxyObjectType);
    }
    
    @Test
    public void testMatchConstraint3() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        templateType.setReferencedType(referencedType);
        NamedType referencedObjType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        prototypeObjectType.matchConstraint(templateType);
    }
    
    @Test
    public void testMatchConstraint4() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        templateType.setReferencedType(referencedType);
        
        prototypeObjectType.matchConstraint(templateType);
    }
    
    @Test
    public void testMatchConstraint5() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        templateType.setReferencedType(referencedType);
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(referencedObjType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        prototypeObjectType.matchConstraint(templateType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method matchConstraint(com.google.javascript.rhino.jstype.ObjectType)
    
    @Test(expected = StackOverflowError.class)
    public void testMatchConstraint6() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        referencedType.setReferencedType(referencedType);
        templateType.setReferencedType(referencedType);
        
        prototypeObjectType.matchConstraint(templateType);
    }
    
    @Test
    public void testMatchConstraint7() throws Exception  {
        PrototypeObjectType prototypeObjectType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        RecordType referencedType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        templateType.setReferencedType(referencedType);
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        ObjectType.Property prototypeSlot = ((ObjectType.Property) createInstance("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(referencedObjType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getOwnPropertyNames(PrototypeObjectType.java:179)
            com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames(FunctionType.java:299)
            com.google.javascript.rhino.jstype.ProxyObjectType.getOwnPropertyNames(ProxyObjectType.java:370)
            com.google.javascript.rhino.jstype.TemplateType.getOwnPropertyNames(TemplateType.java:48)
            com.google.javascript.rhino.jstype.PrototypeObjectType.matchConstraint(PrototypeObjectType.java:568) */
        prototypeObjectType.matchConstraint(templateType);
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
        NumberType resolveResult = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", resolveResult);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20d5bdb1)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:546) */
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
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[35] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20d5bdb1)]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:546) */
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
        TemplateType implicitPrototypeFallback = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:875)
            com.google.javascript.rhino.jstype.JSType.resolve(JSType.java:1083)
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:546) */
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
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.JSType", "resolveResult", implicitPrototypeFallback);
        setField(prototypeObjectType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:548) */
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
            com.google.javascript.rhino.jstype.PrototypeObjectType.resolveInternal(PrototypeObjectType.java:548) */
        prototypeObjectType.resolveInternal(null, null);
    }
    ///endregion
    
    ///endregion
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields887259911620500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields887259911620500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass887259911628600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields887259911620500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass887259911628600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields887259912024000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields887259912024000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass887259912028300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields887259912024000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass887259912028300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields887259912575600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields887259912575600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass887259912579500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields887259912575600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass887259912579500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields887259917811900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields887259917811900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass887259917824600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields887259917811900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass887259917824600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

