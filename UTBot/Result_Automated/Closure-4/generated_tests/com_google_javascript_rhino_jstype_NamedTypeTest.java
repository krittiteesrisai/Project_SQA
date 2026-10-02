package com.google.javascript.rhino.jstype;

import org.junit.Test;
import java.util.ArrayList;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import java.util.LinkedHashMap;
import java.lang.reflect.Method;
import com.google.common.base.Predicate;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.JSDocInfo;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashSet;
import com.google.javascript.jscomp.SymbolTable.Symbol;
import com.google.javascript.jscomp.SymbolTable;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_rhino_jstype_NamedTypeTest {
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#hashCode()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return reference.hashCode();}
 *  */
    @Test
    public void testHashCode_StringHashCode() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = " ";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        
        int actual = namedType.hashCode();
        
        assertEquals(32, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#hashCode()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return reference.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.hashCode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.hashCode(NamedType.java:177) */
        namedType.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.defineProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isResolved()): False}
 * @utbot.returnsFrom {@code return super.defineProperty(propertyName, type, inferred, propertyNode);}
 *  */
    @Test
    public void testDefineProperty_IsResolved_1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NoObjectType referencedObjType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        
        boolean actual = namedType.defineProperty(null, null, false, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isResolved()): False}
 * @utbot.returnsFrom {@code return super.defineProperty(propertyName, type, inferred, propertyNode);}
 *  */
    @Test
    public void testDefineProperty_IsResolved() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        
        boolean actual = namedType.defineProperty(null, null, false, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isResolved()): True}
 * @utbot.executesCondition {@code (propertyContinuations == null): True}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testDefineProperty_PropertyContinuationsEqualsNull() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        boolean actual = namedType.defineProperty(null, null, false, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#defineProperty(java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!isResolved()): True}
 * @utbot.executesCondition {@code (propertyContinuations == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testDefineProperty_PropertyContinuationsNotEqualsNull() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ArrayList propertyContinuations = new ArrayList();
        propertyContinuations.add(null);
        propertyContinuations.add(null);
        propertyContinuations.add(null);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations", propertyContinuations);
        
        boolean actual = namedType.defineProperty(null, null, false, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.isNominalType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNominalType()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#isNominalType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNominalType_ReturnTrue() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        boolean actual = namedType.isNominalType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.resolveInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes com.google.javascript.rhino.jstype.NamedType#resolveViaRegistry(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean resolved = resolveViaRegistry(t, enclosing);
 *  */
    @Test
    public void testResolveInternal_ThrowNullPointerException() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.resolveViaRegistry(NamedType.java:220)
            com.google.javascript.rhino.jstype.NamedType.resolveInternal(NamedType.java:189) */
        namedType.resolveInternal(null, null);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.NamedType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#resolveInternal(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
     */
    @Test
    public void testResolveInternalThrowsNPE() {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        NamedType namedType = new NamedType(jSTypeRegistry, "\n\t\r", "#$\\\"'", Integer.MAX_VALUE, 1);
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.resolveInternal] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.lookupViaProperties(NamedType.java:272)
            com.google.javascript.rhino.jstype.NamedType.resolveViaProperties(NamedType.java:235)
            com.google.javascript.rhino.jstype.NamedType.resolveInternal(NamedType.java:201) */
        namedType.resolveInternal(simpleErrorReporter1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.toStringHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringHelper(boolean)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#toStringHelper(boolean)}
 * @utbot.returnsFrom {@code return reference;}
 *  */
    @Test
    public void testToStringHelper_ReturnReference() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        String actual = namedType.toStringHelper(false);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.getReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferenceName()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getReferenceName()}
 * @utbot.returnsFrom {@code return reference;}
 *  */
    @Test
    public void testGetReferenceName_ReturnReference() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        String actual = namedType.getReferenceName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.hasReferenceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasReferenceName()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#hasReferenceName()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasReferenceName_ReturnTrue() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        boolean actual = namedType.hasReferenceName();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.isNamedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNamedType()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#isNamedType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNamedType_ReturnTrue() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        boolean actual = namedType.isNamedType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.resolveViaRegistry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveViaRegistry(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#resolveViaRegistry(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testResolveViaRegistry_ReturnTrue() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        namedType.setReferencedType(referencedType);
        ProxyObjectType referencedObjType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", referencedType);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashMap templateTypes = new LinkedHashMap();
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        templateTypes.put(null, templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaRegistryMethod = namedTypeClazz.getDeclaredMethod("resolveViaRegistry", errorReporterType, staticScopeType);
        resolveViaRegistryMethod.setAccessible(true);
        java.lang.Object[] resolveViaRegistryMethodArguments = new java.lang.Object[2];
        resolveViaRegistryMethodArguments[0] = ((Object) null);
        resolveViaRegistryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) resolveViaRegistryMethod.invoke(namedType, resolveViaRegistryMethodArguments));
        
        assertTrue(actual);
        
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        boolean finalNamedTypeResolved = ((Boolean) getFieldValue(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
        
        assertTrue(finalNamedTypeResolved);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#resolveViaRegistry(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testResolveViaRegistry_ReturnTrue_1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(validator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        namedType.setReferencedType(referencedType);
        FunctionType referencedObjType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolveResult", referencedType);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashMap templateTypes = new LinkedHashMap();
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        templateTypes.put(null, templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Predicate namedTypeValidator = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class initialNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaRegistryMethod = namedTypeClazz.getDeclaredMethod("resolveViaRegistry", errorReporterType, staticScopeType);
        resolveViaRegistryMethod.setAccessible(true);
        java.lang.Object[] resolveViaRegistryMethodArguments = new java.lang.Object[2];
        resolveViaRegistryMethodArguments[0] = ((Object) null);
        resolveViaRegistryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) resolveViaRegistryMethod.invoke(namedType, resolveViaRegistryMethodArguments));
        
        assertTrue(actual);
        
        Predicate namedTypeValidator1 = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class finalNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator1, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        boolean finalNamedTypeResolved = ((Boolean) getFieldValue(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertFalse(initialNamedTypeValidatorClazz == finalNamedTypeValidatorClazz);
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
        
        assertTrue(finalNamedTypeResolved);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveViaRegistry(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#resolveViaRegistry(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getType(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = registry.getType(reference);
 *  */
    @Test
    public void testResolveViaRegistry_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.resolveViaRegistry] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.resolveViaRegistry(NamedType.java:220) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaRegistryMethod = namedTypeClazz.getDeclaredMethod("resolveViaRegistry", errorReporterType, staticScopeType);
        resolveViaRegistryMethod.setAccessible(true);
        java.lang.Object[] resolveViaRegistryMethodArguments = new java.lang.Object[2];
        resolveViaRegistryMethodArguments[0] = ((Object) null);
        resolveViaRegistryMethodArguments[1] = ((Object) null);
        try {
            resolveViaRegistryMethod.invoke(namedType, resolveViaRegistryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method resolveViaRegistry(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testResolveViaRegistry1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashMap namesToTypes = new LinkedHashMap();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "namesToTypes", namesToTypes);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", namesToTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        Object oldRhinoNullReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class oldRhinoNullReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaRegistryMethod = namedTypeClazz.getDeclaredMethod("resolveViaRegistry", oldRhinoNullReporterType, enumElementTypeType);
        resolveViaRegistryMethod.setAccessible(true);
        java.lang.Object[] resolveViaRegistryMethodArguments = new java.lang.Object[2];
        resolveViaRegistryMethodArguments[0] = oldRhinoNullReporter;
        resolveViaRegistryMethodArguments[1] = enumElementType;
        boolean actual = ((Boolean) resolveViaRegistryMethod.invoke(namedType, resolveViaRegistryMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testResolveViaRegistry2() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = "";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        Object validator = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Integer target = 0;
        setField(validator, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashMap templateTypes = new LinkedHashMap();
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        templateTypes.put(reference, templateType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "templateTypes", templateTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaRegistryMethod = namedTypeClazz.getDeclaredMethod("resolveViaRegistry", errorReporterType, staticScopeType);
        resolveViaRegistryMethod.setAccessible(true);
        java.lang.Object[] resolveViaRegistryMethodArguments = new java.lang.Object[2];
        resolveViaRegistryMethodArguments[0] = ((Object) null);
        resolveViaRegistryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) resolveViaRegistryMethod.invoke(namedType, resolveViaRegistryMethodArguments));
        
        assertTrue(actual);
        
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.handleTypeCycle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleTypeCycle(com.google.javascript.rhino.ErrorReporter)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleTypeCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE)
 *  */
    @Test
    public void testHandleTypeCycle_ThrowClassCastException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.handleTypeCycle] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method handleTypeCycleMethod = namedTypeClazz.getDeclaredMethod("handleTypeCycle", errorReporterType);
        handleTypeCycleMethod.setAccessible(true);
        java.lang.Object[] handleTypeCycleMethodArguments = new java.lang.Object[1];
        handleTypeCycleMethodArguments[0] = ((Object) null);
        try {
            handleTypeCycleMethod.invoke(namedType, handleTypeCycleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleTypeCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE)
 *  */
    @Test
    public void testHandleTypeCycle_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.handleTypeCycle] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method handleTypeCycleMethod = namedTypeClazz.getDeclaredMethod("handleTypeCycle", errorReporterType);
        handleTypeCycleMethod.setAccessible(true);
        java.lang.Object[] handleTypeCycleMethodArguments = new java.lang.Object[1];
        handleTypeCycleMethodArguments[0] = ((Object) null);
        try {
            handleTypeCycleMethod.invoke(namedType, handleTypeCycleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleTypeCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE)
 *  */
    @Test
    public void testHandleTypeCycle_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.handleTypeCycle] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method handleTypeCycleMethod = namedTypeClazz.getDeclaredMethod("handleTypeCycle", errorReporterType);
        handleTypeCycleMethod.setAccessible(true);
        java.lang.Object[] handleTypeCycleMethodArguments = new java.lang.Object[1];
        handleTypeCycleMethodArguments[0] = ((Object) null);
        try {
            handleTypeCycleMethod.invoke(namedType, handleTypeCycleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method handleTypeCycle(com.google.javascript.rhino.ErrorReporter)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.NamedType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleTypeCycle(com.google.javascript.rhino.ErrorReporter)}
     */
    @Test
    public void testHandleTypeCycle() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        NamedType namedType = new NamedType(jSTypeRegistry, "", "", Integer.MAX_VALUE, 1);
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class simpleErrorReporter1Type = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method handleTypeCycleMethod = namedTypeClazz.getDeclaredMethod("handleTypeCycle", simpleErrorReporter1Type);
        handleTypeCycleMethod.setAccessible(true);
        java.lang.Object[] handleTypeCycleMethodArguments = new java.lang.Object[1];
        handleTypeCycleMethodArguments[0] = simpleErrorReporter1;
        handleTypeCycleMethod.invoke(namedType, handleTypeCycleMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.getReferencedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferencedType()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getReferencedType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.NamedType#getReferencedTypeInternal()}
 * @utbot.returnsFrom {@code return getReferencedTypeInternal();}
 *  */
    @Test
    public void testGetReferencedType_NamedTypeGetReferencedTypeInternal() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        JSType actual = namedType.getReferencedType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.getTypedefType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypedefType(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticSlot, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getTypedefType(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticSlot,java.lang.String)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.invokes com.google.javascript.rhino.jstype.NamedType#handleUnresolvedType(com.google.javascript.rhino.ErrorReporter,boolean)
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetTypedefType_TypeEqualsNull() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        SimpleSlot simpleSlot = new SimpleSlot(null, null, false);
        
        JSType actual = namedType.getTypedefType(null, simpleSlot, null);
        
        assertNull(actual);
        
        boolean finalNamedTypeResolved = ((Boolean) getFieldValue(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertTrue(finalNamedTypeResolved);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getTypedefType(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticSlot,java.lang.String)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testGetTypedefType_TypeNotEqualsNull() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        SimpleSlot simpleSlot = new SimpleSlot(null, enumElementType, false);
        
        EnumElementType actual = ((EnumElementType) namedType.getTypedefType(null, simpleSlot, null));
        
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
        
        ImmutableList actualTemplateKeys = actual.getTemplateKeys();
        assertNull(actualTemplateKeys);
        
        ImmutableList actualTemplatizedTypes = actual.getTemplatizedTypes();
        assertNull(actualTemplatizedTypes);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getTypedefType(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticSlot,java.lang.String)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testGetTypedefType_TypeNotEqualsNull_1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        Property property = new Property(null, enumElementType, false, null);
        
        EnumElementType actual = ((EnumElementType) namedType.getTypedefType(null, property, null));
        
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
        
        ImmutableList actualTemplateKeys = actual.getTemplateKeys();
        assertNull(actualTemplateKeys);
        
        ImmutableList actualTemplatizedTypes = actual.getTemplatizedTypes();
        assertNull(actualTemplatizedTypes);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = actual.registry;
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypedefType(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticSlot, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getTypedefType(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticSlot,java.lang.String)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetTypedefType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = "";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        LinkedHashSet forwardDeclaredTypes = new LinkedHashSet();
        forwardDeclaredTypes.add(reference);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        registry.setLastGeneration(true);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        SimpleSlot simpleSlot = new SimpleSlot(null, null, false);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.getTypedefType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 45 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:341)
            com.google.javascript.rhino.jstype.NamedType.getTypedefType(NamedType.java:360) */
        namedType.getTypedefType(null, simpleSlot, null);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getTypedefType(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticSlot,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = slot.getType();
 *  */
    @Test
    public void testGetTypedefType_ThrowNullPointerException() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.getTypedefType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.getTypedefType(NamedType.java:356) */
        namedType.getTypedefType(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#getTypedefType(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticSlot,java.lang.String)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleUnresolvedType(t, true);
 *  */
    @Test
    public void testGetTypedefType_ThrowNullPointerException_1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        SimpleSlot simpleSlot = new SimpleSlot(null, null, false);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.getTypedefType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:332)
            com.google.javascript.rhino.jstype.NamedType.getTypedefType(NamedType.java:360) */
        namedType.getTypedefType(null, simpleSlot, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTypedefType(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticSlot, java.lang.String)
    
    @Test
    public void testGetTypedefType1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = "";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet forwardDeclaredTypes = new LinkedHashSet();
        String string = "\u0000";
        forwardDeclaredTypes.add(string);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        registry.setLastGeneration(true);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        Object oldRhinoNullReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        SymbolTable.Symbol symbol = ((SymbolTable.Symbol) createInstance("com.google.javascript.jscomp.SymbolTable$Symbol"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class oldRhinoNullReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class symbolType = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        Class stringType = Class.forName("java.lang.String");
        Method getTypedefTypeMethod = namedTypeClazz.getDeclaredMethod("getTypedefType", oldRhinoNullReporterType, symbolType, stringType);
        getTypedefTypeMethod.setAccessible(true);
        java.lang.Object[] getTypedefTypeMethodArguments = new java.lang.Object[3];
        getTypedefTypeMethodArguments[0] = oldRhinoNullReporter;
        getTypedefTypeMethodArguments[1] = symbol;
        getTypedefTypeMethodArguments[2] = ((Object) null);
        JSType actual = ((JSType) getTypedefTypeMethod.invoke(namedType, getTypedefTypeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetTypedefType2() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet forwardDeclaredTypes = new LinkedHashSet();
        String string = "";
        forwardDeclaredTypes.add(string);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        registry.setLastGeneration(true);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        SymbolTable.Symbol symbol = ((SymbolTable.Symbol) createInstance("com.google.javascript.jscomp.SymbolTable$Symbol"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class simpleErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class symbolType = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        Class stringType = Class.forName("java.lang.String");
        Method getTypedefTypeMethod = namedTypeClazz.getDeclaredMethod("getTypedefType", simpleErrorReporterType, symbolType, stringType);
        getTypedefTypeMethod.setAccessible(true);
        java.lang.Object[] getTypedefTypeMethodArguments = new java.lang.Object[3];
        getTypedefTypeMethodArguments[0] = simpleErrorReporter;
        getTypedefTypeMethodArguments[1] = symbol;
        getTypedefTypeMethodArguments[2] = string;
        JSType actual = ((JSType) getTypedefTypeMethod.invoke(namedType, getTypedefTypeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTypedefType(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticSlot, java.lang.String)
    
    @Test
    public void testGetTypedefType3() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Property property = new Property(null, null, false, null);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.getTypedefType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:332)
            com.google.javascript.rhino.jstype.NamedType.getTypedefType(NamedType.java:360) */
        namedType.getTypedefType(null, property, null);
    }
    
    @Test
    public void testGetTypedefType4() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = "";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet forwardDeclaredTypes = new LinkedHashSet();
        String string = "";
        forwardDeclaredTypes.add(string);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        registry.setLastGeneration(true);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        Object oldRhinoNullReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        SymbolTable.Symbol symbol = ((SymbolTable.Symbol) createInstance("com.google.javascript.jscomp.SymbolTable$Symbol"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.getTypedefType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:341)
            com.google.javascript.rhino.jstype.NamedType.getTypedefType(NamedType.java:360) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class oldRhinoNullReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class symbolType = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        Class stringType = Class.forName("java.lang.String");
        Method getTypedefTypeMethod = namedTypeClazz.getDeclaredMethod("getTypedefType", oldRhinoNullReporterType, symbolType, stringType);
        getTypedefTypeMethod.setAccessible(true);
        java.lang.Object[] getTypedefTypeMethodArguments = new java.lang.Object[3];
        getTypedefTypeMethodArguments[0] = oldRhinoNullReporter;
        getTypedefTypeMethodArguments[1] = symbol;
        getTypedefTypeMethodArguments[2] = ((Object) null);
        try {
            getTypedefTypeMethod.invoke(namedType, getTypedefTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetTypedefType5() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet forwardDeclaredTypes = new LinkedHashSet();
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        registry.setLastGeneration(true);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        Object oldRhinoErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
        SimpleSlot simpleSlot = new SimpleSlot(null, null, false);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.getTypedefType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RhinoErrorReporter.makeError(RhinoErrorReporter.java:129)
            com.google.javascript.jscomp.RhinoErrorReporter.warningAtLine(RhinoErrorReporter.java:115)
            com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter.warning(RhinoErrorReporter.java:156)
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:337)
            com.google.javascript.rhino.jstype.NamedType.getTypedefType(NamedType.java:360) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class oldRhinoErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class simpleSlotType = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        Class stringType = Class.forName("java.lang.String");
        Method getTypedefTypeMethod = namedTypeClazz.getDeclaredMethod("getTypedefType", oldRhinoErrorReporterType, simpleSlotType, stringType);
        getTypedefTypeMethod.setAccessible(true);
        java.lang.Object[] getTypedefTypeMethodArguments = new java.lang.Object[3];
        getTypedefTypeMethodArguments[0] = oldRhinoErrorReporter;
        getTypedefTypeMethodArguments[1] = simpleSlot;
        getTypedefTypeMethodArguments[2] = ((Object) null);
        try {
            getTypedefTypeMethod.invoke(namedType, getTypedefTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetTypedefType6() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        LinkedHashSet forwardDeclaredTypes = new LinkedHashSet();
        String string = "\u0000";
        forwardDeclaredTypes.add(string);
        String string1 = "";
        forwardDeclaredTypes.add(string1);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        registry.setLastGeneration(true);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        SymbolTable.Symbol symbol = ((SymbolTable.Symbol) createInstance("com.google.javascript.jscomp.SymbolTable$Symbol"));
        String string2 = "";
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.getTypedefType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:337)
            com.google.javascript.rhino.jstype.NamedType.getTypedefType(NamedType.java:360) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class symbolType = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        Class string2Type = Class.forName("java.lang.String");
        Method getTypedefTypeMethod = namedTypeClazz.getDeclaredMethod("getTypedefType", errorReporterType, symbolType, string2Type);
        getTypedefTypeMethod.setAccessible(true);
        java.lang.Object[] getTypedefTypeMethodArguments = new java.lang.Object[3];
        getTypedefTypeMethodArguments[0] = ((Object) null);
        getTypedefTypeMethodArguments[1] = symbol;
        getTypedefTypeMethodArguments[2] = string2;
        try {
            getTypedefTypeMethod.invoke(namedType, getTypedefTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.setValidator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValidator(com.google.common.base.Predicate)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return super.setValidator(validator);}
 *  */
    @Test
    public void testSetValidator_ReturnSuperSetValidator() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        
        Class initialInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class instanceOfPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", instanceOfPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = instanceOfPredicate;
        boolean actual = ((Boolean) setValidatorMethod.invoke(namedType, setValidatorMethodArguments));
        
        assertTrue(actual);
        
        Class finalInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        assertFalse(initialInstanceOfPredicateClazz == finalInstanceOfPredicateClazz);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return super.setValidator(validator);}
 *  */
    @Test
    public void testSetValidator_ReturnSuperSetValidator_1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Integer target = 0;
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class isEqualToPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", isEqualToPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = isEqualToPredicate;
        boolean actual = ((Boolean) setValidatorMethod.invoke(namedType, setValidatorMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return super.setValidator(validator);}
 *  */
    @Test
    public void testSetValidator_ReturnSuperSetValidator_2() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        boolean actual = ((Boolean) setValidatorMethod.invoke(namedType, setValidatorMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testSetValidator_ReturnTrue() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        boolean actual = namedType.setValidator(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return super.setValidator(validator);}
 *  */
    @Test
    public void testSetValidator_ReturnSuperSetValidator_3() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Integer target = 0;
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        components.add(isEqualToPredicate);
        components.add(null);
        components.add(null);
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        boolean actual = ((Boolean) setValidatorMethod.invoke(namedType, setValidatorMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValidator(com.google.common.base.Predicate)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.setValidator(validator);
 *  */
    @Test
    public void testSetValidator_ThrowClassCastException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object assignableFromPredicate = createInstance("com.google.common.base.Predicates$AssignableFromPredicate");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setValidator] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NamedType cannot be cast to class java.lang.Class (com.google.javascript.rhino.jstype.NamedType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.lang.Class is in module java.base of loader 'bootstrap')]
            com.google.common.base.Predicates$AssignableFromPredicate.apply(Predicates.java:458)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1471)
            com.google.javascript.rhino.jstype.NamedType.setValidator(NamedType.java:370) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class assignableFromPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", assignableFromPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = assignableFromPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.setValidator(validator);
 *  */
    @Test
    public void testSetValidator_ThrowClassCastException_1() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object containsPatternPredicate = createInstance("com.google.common.base.Predicates$ContainsPatternPredicate");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setValidator] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NamedType cannot be cast to class java.lang.CharSequence (com.google.javascript.rhino.jstype.NamedType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.lang.CharSequence is in module java.base of loader 'bootstrap')]
            com.google.common.base.Predicates$ContainsPatternPredicate.apply(Predicates.java:562)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1471)
            com.google.javascript.rhino.jstype.NamedType.setValidator(NamedType.java:370) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class containsPatternPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", containsPatternPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = containsPatternPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.setValidator(validator);
 *  */
    @Test
    public void testSetValidator_ThrowClassCastException_2() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        java.lang.Object[] assignableFromPredicateArray = createArray("com.google.common.base.Predicates$AssignableFromPredicate", 0);
        components.add(assignableFromPredicateArray);
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setValidator] produces [java.lang.ClassCastException: class [Lcom.google.common.base.Predicates$AssignableFromPredicate; cannot be cast to class com.google.common.base.Predicate ([Lcom.google.common.base.Predicates$AssignableFromPredicate; and com.google.common.base.Predicate are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.common.base.Predicates$AndPredicate.apply(Predicates.java:343)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1471)
            com.google.javascript.rhino.jstype.NamedType.setValidator(NamedType.java:370) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.setValidator(validator);
 *  */
    @Test
    public void testSetValidator_ThrowClassCastException_3() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        Object assignableFromPredicate = createInstance("com.google.common.base.Predicates$AssignableFromPredicate");
        components.add(assignableFromPredicate);
        components.add(null);
        components.add(null);
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setValidator] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NamedType cannot be cast to class java.lang.Class (com.google.javascript.rhino.jstype.NamedType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.lang.Class is in module java.base of loader 'bootstrap')]
            com.google.common.base.Predicates$AssignableFromPredicate.apply(Predicates.java:458)
            com.google.common.base.Predicates$AndPredicate.apply(Predicates.java:343)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1471)
            com.google.javascript.rhino.jstype.NamedType.setValidator(NamedType.java:370) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return super.setValidator(validator);
 *  */
    @Test
    public void testSetValidator_ThrowClassCastException_4() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        Object containsPatternPredicate = createInstance("com.google.common.base.Predicates$ContainsPatternPredicate");
        components.add(containsPatternPredicate);
        components.add(null);
        components.add(null);
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setValidator] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NamedType cannot be cast to class java.lang.CharSequence (com.google.javascript.rhino.jstype.NamedType is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db; java.lang.CharSequence is in module java.base of loader 'bootstrap')]
            com.google.common.base.Predicates$ContainsPatternPredicate.apply(Predicates.java:562)
            com.google.common.base.Predicates$AndPredicate.apply(Predicates.java:343)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1471)
            com.google.javascript.rhino.jstype.NamedType.setValidator(NamedType.java:370) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setValidator(com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return super.setValidator(validator);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.setValidator(validator);
 *  */
    @Test
    public void testSetValidator_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        components.add(instanceOfPredicate);
        components.add(null);
        components.add(null);
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setValidator] produces [java.lang.NullPointerException]
            com.google.common.base.Predicates$AndPredicate.apply(Predicates.java:343)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1471)
            com.google.javascript.rhino.jstype.NamedType.setValidator(NamedType.java:370) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setValidator(com.google.common.base.Predicate)
    
    @Test(expected = StackOverflowError.class)
    public void testSetValidator1() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        components.add(andPredicate);
        Object object = createInstance("java.lang.Object");
        components.add(object);
        components.add(object);
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetValidator2() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved", true);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components = new ArrayList();
        Object andPredicate1 = createInstance("com.google.common.base.Predicates$AndPredicate");
        ArrayList components1 = new ArrayList();
        setField(andPredicate1, "com.google.common.base.Predicates$AndPredicate", "components", components1);
        components.add(andPredicate1);
        components.add(null);
        components.add(null);
        setField(andPredicate, "com.google.common.base.Predicates$AndPredicate", "components", components);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setValidator] produces [java.lang.NullPointerException]
            com.google.common.base.Predicates$AndPredicate.apply(Predicates.java:343)
            com.google.javascript.rhino.jstype.JSType.setValidator(JSType.java:1471)
            com.google.javascript.rhino.jstype.NamedType.setValidator(NamedType.java:370) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method setValidatorMethod = namedTypeClazz.getDeclaredMethod("setValidator", andPredicateType);
        setValidatorMethod.setAccessible(true);
        java.lang.Object[] setValidatorMethodArguments = new java.lang.Object[1];
        setValidatorMethodArguments[0] = andPredicate;
        try {
            setValidatorMethod.invoke(namedType, setValidatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.executesCondition {@code (referencedType instanceof EnumElementType): False}
 *  */
    @Test
    public void testCheckEnumElementCycle_NotReferencedTypeNotInstanceOfEnumElementType() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method checkEnumElementCycleMethod = namedTypeClazz.getDeclaredMethod("checkEnumElementCycle", errorReporterType);
        checkEnumElementCycleMethod.setAccessible(true);
        java.lang.Object[] checkEnumElementCycleMethodArguments = new java.lang.Object[1];
        checkEnumElementCycleMethodArguments[0] = ((Object) null);
        checkEnumElementCycleMethod.invoke(namedType, checkEnumElementCycleMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.executesCondition {@code (referencedType instanceof EnumElementType): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.EnumElementType#getPrimitiveType()}
 *  */
    @Test
    public void testCheckEnumElementCycle_ReferencedTypeInstanceOfEnumElementType() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        namedType.setReferencedType(referencedType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method checkEnumElementCycleMethod = namedTypeClazz.getDeclaredMethod("checkEnumElementCycle", errorReporterType);
        checkEnumElementCycleMethod.setAccessible(true);
        java.lang.Object[] checkEnumElementCycleMethodArguments = new java.lang.Object[1];
        checkEnumElementCycleMethodArguments[0] = ((Object) null);
        checkEnumElementCycleMethod.invoke(namedType, checkEnumElementCycleMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: handleTypeCycle(t);
 *  */
    @Test
    public void testCheckEnumElementCycle_ThrowClassCastException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        namedType.setReferencedType(referencedType);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[35] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method checkEnumElementCycleMethod = namedTypeClazz.getDeclaredMethod("checkEnumElementCycle", errorReporterType);
        checkEnumElementCycleMethod.setAccessible(true);
        java.lang.Object[] checkEnumElementCycleMethodArguments = new java.lang.Object[1];
        checkEnumElementCycleMethodArguments[0] = ((Object) null);
        try {
            checkEnumElementCycleMethod.invoke(namedType, checkEnumElementCycleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCheckEnumElementCycle_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        namedType.setReferencedType(referencedType);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method checkEnumElementCycleMethod = namedTypeClazz.getDeclaredMethod("checkEnumElementCycle", errorReporterType);
        checkEnumElementCycleMethod.setAccessible(true);
        java.lang.Object[] checkEnumElementCycleMethodArguments = new java.lang.Object[1];
        checkEnumElementCycleMethodArguments[0] = ((Object) null);
        try {
            checkEnumElementCycleMethod.invoke(namedType, checkEnumElementCycleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#checkEnumElementCycle(com.google.javascript.rhino.ErrorReporter)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleTypeCycle(t);
 *  */
    @Test
    public void testCheckEnumElementCycle_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType referencedType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        namedType.setReferencedType(referencedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Method checkEnumElementCycleMethod = namedTypeClazz.getDeclaredMethod("checkEnumElementCycle", errorReporterType);
        checkEnumElementCycleMethod.setAccessible(true);
        java.lang.Object[] checkEnumElementCycleMethodArguments = new java.lang.Object[1];
        checkEnumElementCycleMethodArguments[0] = ((Object) null);
        try {
            checkEnumElementCycleMethod.invoke(namedType, checkEnumElementCycleMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.finishPropertyContinuations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method finishPropertyContinuations()
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#finishPropertyContinuations()}
 *  */
    @Test
    public void testFinishPropertyContinuations() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnresolvedTypeExpression referencedObjType = ((UnresolvedTypeExpression) createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
        
        List finalNamedTypePropertyContinuations = ((List) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        
        assertNull(finalNamedTypePropertyContinuations);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#finishPropertyContinuations()}
 *  */
    @Test
    public void testFinishPropertyContinuations_1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
        
        List finalNamedTypePropertyContinuations = ((List) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        
        assertNull(finalNamedTypePropertyContinuations);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#finishPropertyContinuations()}
 *  */
    @Test
    public void testFinishPropertyContinuations_2() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
        
        List finalNamedTypePropertyContinuations = ((List) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        
        assertNull(finalNamedTypePropertyContinuations);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#finishPropertyContinuations()}
 *  */
    @Test
    public void testFinishPropertyContinuations_5() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
        
        List finalNamedTypePropertyContinuations = ((List) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        
        assertNull(finalNamedTypePropertyContinuations);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#finishPropertyContinuations()}
 *  */
    @Test
    public void testFinishPropertyContinuations_3() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
        
        List finalNamedTypePropertyContinuations = ((List) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        
        assertNull(finalNamedTypePropertyContinuations);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#finishPropertyContinuations()}
 *  */
    @Test
    public void testFinishPropertyContinuations_4() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType5 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType7 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
        
        List finalNamedTypePropertyContinuations = ((List) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        
        assertNull(finalNamedTypePropertyContinuations);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method finishPropertyContinuations()
    
    @Test
    public void testFinishPropertyContinuations1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations2() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ArrowType referencedType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations3() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ArrowType referencedType = ((ArrowType) createInstance("com.google.javascript.rhino.jstype.ArrowType"));
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations4() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        BooleanType referencedType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations5() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ProxyObjectType referencedType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        BooleanType referencedType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations6() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        BooleanType referencedType1 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations7() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ProxyObjectType referencedType = ((ProxyObjectType) createInstance("com.google.javascript.rhino.jstype.ProxyObjectType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        BooleanType referencedType2 = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations8() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType referencedType7 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations9() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType5 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NumberType referencedType8 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations10() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NumberType referencedType8 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations11() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedObjType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType referencedType8 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        referencedType7.setReferencedType(referencedType8);
        referencedType6.setReferencedType(referencedType7);
        referencedType5.setReferencedType(referencedType6);
        referencedType4.setReferencedType(referencedType5);
        referencedType3.setReferencedType(referencedType4);
        referencedType2.setReferencedType(referencedType3);
        referencedType1.setReferencedType(referencedType2);
        referencedType.setReferencedType(referencedType1);
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations12() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType4 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType10 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
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
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations13() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType1 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        IndexedType referencedType4 = ((IndexedType) createInstance("com.google.javascript.rhino.jstype.IndexedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType7 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType referencedType10 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations14() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType7 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        StringType referencedType10 = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
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
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    
    @Test
    public void testFinishPropertyContinuations15() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        TemplateType referencedObjType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType4 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType5 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType6 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        NamedType referencedType7 = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType referencedType8 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType9 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        FunctionType referencedType10 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
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
        referencedObjType.setReferencedType(referencedType);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Method finishPropertyContinuationsMethod = namedTypeClazz.getDeclaredMethod("finishPropertyContinuations");
        finishPropertyContinuationsMethod.setAccessible(true);
        java.lang.Object[] finishPropertyContinuationsMethodArguments = new java.lang.Object[0];
        finishPropertyContinuationsMethod.invoke(namedType, finishPropertyContinuationsMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 *  */
    @Test
    public void testSetReferencedAndResolvedType() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", jSTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        boolean finalNamedTypeResolved = ((Boolean) getFieldValue(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertTrue(finalNamedTypeResolved);
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 *  */
    @Test
    public void testSetReferencedAndResolvedType_1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        boolean finalNamedTypeResolved = ((Boolean) getFieldValue(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
        
        assertTrue(finalNamedTypeResolved);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (validator != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkEnumElementCycle(t);
 *  */
    @Test
    public void testSetReferencedAndResolvedType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        namedType.setReferencedType(referencedType);
        EnumElementType referencedObjType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (validator != null): False}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: checkEnumElementCycle(t);
 *  */
    @Test
    public void testSetReferencedAndResolvedType_ThrowClassCastException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        NoResolvedType referencedType = ((NoResolvedType) createInstance("com.google.javascript.rhino.jstype.NoResolvedType"));
        namedType.setReferencedType(referencedType);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[35] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (validator != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkEnumElementCycle(t);
 *  */
    @Test
    public void testSetReferencedAndResolvedType_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(validator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.executesCondition {@code (validator != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkEnumElementCycle(t);
 *  */
    @Test
    public void testSetReferencedAndResolvedType_ThrowNullPointerException_1() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Integer target = 0;
        setField(validator, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testSetReferencedAndResolvedType1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(validator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        
        Predicate namedTypeValidator = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class initialNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class nullTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", nullTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = nullType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        Predicate namedTypeValidator1 = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class finalNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator1, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeValidatorClazz == finalNamedTypeValidatorClazz);
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    
    @Test
    public void testSetReferencedAndResolvedType2() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", parameterizedTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = parameterizedType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    
    @Test
    public void testSetReferencedAndResolvedType3() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(validator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        
        Predicate namedTypeValidator = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class initialNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", parameterizedTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = parameterizedType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        Predicate namedTypeValidator1 = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class finalNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator1, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeValidatorClazz == finalNamedTypeValidatorClazz);
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    
    @Test
    public void testSetReferencedAndResolvedType4() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Character target = '\u0000';
        setField(validator, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", parameterizedTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = parameterizedType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    
    @Test
    public void testSetReferencedAndResolvedType5() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Character target = '\u0000';
        setField(validator, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class nullTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", nullTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = nullType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    
    @Test
    public void testSetReferencedAndResolvedType6() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(validator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Predicate namedTypeValidator = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class initialNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        Predicate namedTypeValidator1 = ((Predicate) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        Class finalNamedTypeValidatorClazz = ((Class) getFieldValue(namedTypeValidator1, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeValidatorClazz == finalNamedTypeValidatorClazz);
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    
    @Test
    public void testSetReferencedAndResolvedType7() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Character target = '\u0000';
        setField(validator, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        JSType initialNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        
        JSType finalNamedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        
        assertFalse(initialNamedTypeReferencedType == finalNamedTypeReferencedType);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setReferencedAndResolvedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testSetReferencedAndResolvedType8() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(validator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        PrototypeObjectType referencedObjType = ((PrototypeObjectType) createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", referencedObjType);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        NumberType numberType = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        nativeTypes[35] = ((JSType) numberType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, errorReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = ((Object) null);
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetReferencedAndResolvedType9() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(validator, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        Object oldRhinoNullReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class oldRhinoNullReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, oldRhinoNullReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = oldRhinoNullReporter;
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetReferencedAndResolvedType10() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        Object oldRhinoErrorReporter = createInstance("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter");
        RecordType recordType = ((RecordType) createInstance("com.google.javascript.rhino.jstype.RecordType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class oldRhinoErrorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class recordTypeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, oldRhinoErrorReporterType, recordTypeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = oldRhinoErrorReporter;
        setReferencedAndResolvedTypeMethodArguments[2] = recordType;
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetReferencedAndResolvedType11() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        Object validator = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Character target = '\u0000';
        setField(validator, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "validator", validator);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(enumElementType, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveType", namedType);
        Object oldRhinoNullReporter = createInstance("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter");
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleTypeCycle(NamedType.java:314)
            com.google.javascript.rhino.jstype.NamedType.checkEnumElementCycle(NamedType.java:324)
            com.google.javascript.rhino.jstype.NamedType.setReferencedAndResolvedType(NamedType.java:308) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class oldRhinoNullReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method setReferencedAndResolvedTypeMethod = namedTypeClazz.getDeclaredMethod("setReferencedAndResolvedType", enumElementTypeType, oldRhinoNullReporterType, staticScopeType);
        setReferencedAndResolvedTypeMethod.setAccessible(true);
        java.lang.Object[] setReferencedAndResolvedTypeMethodArguments = new java.lang.Object[3];
        setReferencedAndResolvedTypeMethodArguments[0] = enumElementType;
        setReferencedAndResolvedTypeMethodArguments[1] = oldRhinoNullReporter;
        setReferencedAndResolvedTypeMethodArguments[2] = ((Object) null);
        try {
            setReferencedAndResolvedTypeMethod.invoke(namedType, setReferencedAndResolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.lookupViaProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lookupViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#lookupViaProperties(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes {@link java.lang.String#split(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String[] componentNames = reference.split("\\.", -1);
 *  */
    @Test
    public void testLookupViaProperties_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.lookupViaProperties] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.lookupViaProperties(NamedType.java:268) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method lookupViaPropertiesMethod = namedTypeClazz.getDeclaredMethod("lookupViaProperties", errorReporterType, staticScopeType);
        lookupViaPropertiesMethod.setAccessible(true);
        java.lang.Object[] lookupViaPropertiesMethodArguments = new java.lang.Object[2];
        lookupViaPropertiesMethodArguments[0] = ((Object) null);
        lookupViaPropertiesMethodArguments[1] = ((Object) null);
        try {
            lookupViaPropertiesMethod.invoke(namedType, lookupViaPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method lookupViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.NamedType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#lookupViaProperties(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
     */
    @Test
    public void testLookupViaPropertiesThrowsNPE() throws Throwable  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        NamedType namedType = new NamedType(jSTypeRegistry, "10", "10", -1, 1);
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.lookupViaProperties] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.lookupViaProperties(NamedType.java:272) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class simpleErrorReporter1Type = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method lookupViaPropertiesMethod = namedTypeClazz.getDeclaredMethod("lookupViaProperties", simpleErrorReporter1Type, staticScopeType);
        lookupViaPropertiesMethod.setAccessible(true);
        java.lang.Object[] lookupViaPropertiesMethodArguments = new java.lang.Object[2];
        lookupViaPropertiesMethodArguments[0] = simpleErrorReporter1;
        lookupViaPropertiesMethodArguments[1] = ((Object) null);
        try {
            lookupViaPropertiesMethod.invoke(namedType, lookupViaPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lookupViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testLookupViaProperties1() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = "";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method lookupViaPropertiesMethod = namedTypeClazz.getDeclaredMethod("lookupViaProperties", errorReporterType, staticScopeType);
        lookupViaPropertiesMethod.setAccessible(true);
        java.lang.Object[] lookupViaPropertiesMethodArguments = new java.lang.Object[2];
        lookupViaPropertiesMethodArguments[0] = ((Object) null);
        lookupViaPropertiesMethodArguments[1] = ((Object) null);
        JSType actual = ((JSType) lookupViaPropertiesMethod.invoke(namedType, lookupViaPropertiesMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleUnresolvedType(com.google.javascript.rhino.ErrorReporter, boolean)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleUnresolvedType(com.google.javascript.rhino.ErrorReporter,boolean)}
 * @utbot.executesCondition {@code (registry.isLastGeneration()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#isLastGeneration()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.NamedType#setResolvedTypeInternal(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testHandleUnresolvedType_NotRegistryIsLastGeneration() throws Exception  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class booleanType = boolean.class;
        Method handleUnresolvedTypeMethod = namedTypeClazz.getDeclaredMethod("handleUnresolvedType", errorReporterType, booleanType);
        handleUnresolvedTypeMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedTypeMethodArguments = new java.lang.Object[2];
        handleUnresolvedTypeMethodArguments[0] = ((Object) null);
        handleUnresolvedTypeMethodArguments[1] = false;
        handleUnresolvedTypeMethod.invoke(namedType, handleUnresolvedTypeMethodArguments);
        
        boolean finalNamedTypeResolved = ((Boolean) getFieldValue(namedType, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        
        assertTrue(finalNamedTypeResolved);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleUnresolvedType(com.google.javascript.rhino.ErrorReporter, boolean)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleUnresolvedType(com.google.javascript.rhino.ErrorReporter,boolean)}
 * @utbot.executesCondition {@code (registry.isLastGeneration()): True}
 * @utbot.executesCondition {@code (registry.isForwardDeclaredType(reference)): True}
 * @utbot.executesCondition {@code (!isForwardDeclared): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#isLastGeneration()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#isForwardDeclaredType(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE)
 *  */
    @Test
    public void testHandleUnresolvedType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = "";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        LinkedHashSet forwardDeclaredTypes = new LinkedHashSet();
        forwardDeclaredTypes.add(reference);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclaredTypes", forwardDeclaredTypes);
        registry.setLastGeneration(true);
        setField(namedType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 45 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:341) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class booleanType = boolean.class;
        Method handleUnresolvedTypeMethod = namedTypeClazz.getDeclaredMethod("handleUnresolvedType", errorReporterType, booleanType);
        handleUnresolvedTypeMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedTypeMethodArguments = new java.lang.Object[2];
        handleUnresolvedTypeMethodArguments[0] = ((Object) null);
        handleUnresolvedTypeMethodArguments[1] = true;
        try {
            handleUnresolvedTypeMethod.invoke(namedType, handleUnresolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleUnresolvedType(com.google.javascript.rhino.ErrorReporter,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#isLastGeneration()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: registry.isLastGeneration()
 *  */
    @Test
    public void testHandleUnresolvedType_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:332) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class booleanType = boolean.class;
        Method handleUnresolvedTypeMethod = namedTypeClazz.getDeclaredMethod("handleUnresolvedType", errorReporterType, booleanType);
        handleUnresolvedTypeMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedTypeMethodArguments = new java.lang.Object[2];
        handleUnresolvedTypeMethodArguments[0] = ((Object) null);
        handleUnresolvedTypeMethodArguments[1] = false;
        try {
            handleUnresolvedTypeMethod.invoke(namedType, handleUnresolvedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method handleUnresolvedType(com.google.javascript.rhino.ErrorReporter, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.NamedType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#handleUnresolvedType(com.google.javascript.rhino.ErrorReporter,boolean)}
     */
    @Test
    public void testHandleUnresolvedType() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        NamedType namedType = new NamedType(jSTypeRegistry, "", "", 0, 0);
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class simpleErrorReporter1Type = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class booleanType = boolean.class;
        Method handleUnresolvedTypeMethod = namedTypeClazz.getDeclaredMethod("handleUnresolvedType", simpleErrorReporter1Type, booleanType);
        handleUnresolvedTypeMethod.setAccessible(true);
        java.lang.Object[] handleUnresolvedTypeMethodArguments = new java.lang.Object[2];
        handleUnresolvedTypeMethodArguments[0] = simpleErrorReporter1;
        handleUnresolvedTypeMethodArguments[1] = false;
        handleUnresolvedTypeMethod.invoke(namedType, handleUnresolvedTypeMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.jstype.NamedType.resolveViaProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolveViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
    @utbot.classUnderTest {@link NamedType}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#resolveViaProperties(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
 * @utbot.invokes com.google.javascript.rhino.jstype.NamedType#lookupViaProperties(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType value = lookupViaProperties(t, enclosing);
 *  */
    @Test
    public void testResolveViaProperties_ThrowNullPointerException() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.resolveViaProperties] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.lookupViaProperties(NamedType.java:268)
            com.google.javascript.rhino.jstype.NamedType.resolveViaProperties(NamedType.java:235) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaPropertiesMethod = namedTypeClazz.getDeclaredMethod("resolveViaProperties", errorReporterType, staticScopeType);
        resolveViaPropertiesMethod.setAccessible(true);
        java.lang.Object[] resolveViaPropertiesMethodArguments = new java.lang.Object[2];
        resolveViaPropertiesMethodArguments[0] = ((Object) null);
        resolveViaPropertiesMethodArguments[1] = ((Object) null);
        try {
            resolveViaPropertiesMethod.invoke(namedType, resolveViaPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method resolveViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.rhino.jstype.NamedType}
     * @utbot.methodUnderTest {@link com.google.javascript.rhino.jstype.NamedType#resolveViaProperties(com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope)}
     */
    @Test
    public void testResolveViaPropertiesThrowsNPE() throws Throwable  {
        SimpleErrorReporter simpleErrorReporter = new SimpleErrorReporter();
        JSTypeRegistry jSTypeRegistry = new JSTypeRegistry(simpleErrorReporter);
        JSTypeRegistry.ResolveMode resolveMode = JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry.setResolveMode(resolveMode);
        NamedType namedType = new NamedType(jSTypeRegistry, "\n\t\r", "#$\\\"'", 0, 0);
        SimpleErrorReporter simpleErrorReporter1 = new SimpleErrorReporter();
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.resolveViaProperties] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.lookupViaProperties(NamedType.java:272)
            com.google.javascript.rhino.jstype.NamedType.resolveViaProperties(NamedType.java:235) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class simpleErrorReporter1Type = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaPropertiesMethod = namedTypeClazz.getDeclaredMethod("resolveViaProperties", simpleErrorReporter1Type, staticScopeType);
        resolveViaPropertiesMethod.setAccessible(true);
        java.lang.Object[] resolveViaPropertiesMethodArguments = new java.lang.Object[2];
        resolveViaPropertiesMethodArguments[0] = simpleErrorReporter1;
        resolveViaPropertiesMethodArguments[1] = ((Object) null);
        try {
            resolveViaPropertiesMethod.invoke(namedType, resolveViaPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolveViaProperties(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope)
    
    @Test
    public void testResolveViaProperties1() throws Throwable  {
        NamedType namedType = ((NamedType) createInstance("com.google.javascript.rhino.jstype.NamedType"));
        String reference = "";
        setField(namedType, "com.google.javascript.rhino.jstype.NamedType", "reference", reference);
        
        /* This test fails because method [com.google.javascript.rhino.jstype.NamedType.resolveViaProperties] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NamedType.handleUnresolvedType(NamedType.java:332)
            com.google.javascript.rhino.jstype.NamedType.resolveViaProperties(NamedType.java:256) */
        Class namedTypeClazz = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class errorReporterType = Class.forName("com.google.javascript.rhino.ErrorReporter");
        Class staticScopeType = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Method resolveViaPropertiesMethod = namedTypeClazz.getDeclaredMethod("resolveViaProperties", errorReporterType, staticScopeType);
        resolveViaPropertiesMethod.setAccessible(true);
        java.lang.Object[] resolveViaPropertiesMethodArguments = new java.lang.Object[2];
        resolveViaPropertiesMethodArguments[0] = ((Object) null);
        resolveViaPropertiesMethodArguments[1] = ((Object) null);
        try {
            resolveViaPropertiesMethod.invoke(namedType, resolveViaPropertiesMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields880212765602400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields880212765602400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass880212765609300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields880212765602400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass880212765609300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields880212766245700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields880212766245700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass880212766247600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields880212766245700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass880212766247600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

