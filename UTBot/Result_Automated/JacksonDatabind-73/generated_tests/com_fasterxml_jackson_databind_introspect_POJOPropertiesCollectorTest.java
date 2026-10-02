package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import com.fasterxml.jackson.databind.PropertyName;
import java.lang.reflect.Method;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.util.Set;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import java.util.LinkedList;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.util.Map;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.HashSet;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.Linked;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_introspect_POJOPropertiesCollectorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._propNameFromSimple
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _propNameFromSimple(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_propNameFromSimple(java.lang.String)}
 * @utbot.returnsFrom {@code return PropertyName.construct(simpleName, null);}
 *  */
    @Test
    public void test_propNameFromSimple_ReturnPropertyNameConstruct() throws Exception  {
        PropertyName prevUSE_DEFAULT = PropertyName.USE_DEFAULT;
        try {
            PropertyName useDefault = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(useDefault, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class propertyNameClazz = Class.forName("com.fasterxml.jackson.databind.PropertyName");
            setStaticField(propertyNameClazz, "USE_DEFAULT", useDefault);
            POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
            
            Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
            Class stringType = Class.forName("java.lang.String");
            Method _propNameFromSimpleMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_propNameFromSimple", stringType);
            _propNameFromSimpleMethod.setAccessible(true);
            java.lang.Object[] _propNameFromSimpleMethodArguments = new java.lang.Object[1];
            _propNameFromSimpleMethodArguments[0] = ((Object) null);
            PropertyName actual = ((PropertyName) _propNameFromSimpleMethod.invoke(pOJOPropertiesCollector, _propNameFromSimpleMethodArguments));
            
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(useDefault, actual);
        } finally {
            setStaticField(PropertyName.class, "USE_DEFAULT", prevUSE_DEFAULT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_propNameFromSimple(java.lang.String)}
 * @utbot.returnsFrom {@code return PropertyName.construct(simpleName, null);}
 *  */
    @Test
    public void test_propNameFromSimple_ReturnPropertyNameConstruct_1() throws Exception  {
        PropertyName prevUSE_DEFAULT = PropertyName.USE_DEFAULT;
        try {
            PropertyName useDefault = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
            String _simpleName = "";
            setField(useDefault, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
            Class propertyNameClazz = Class.forName("com.fasterxml.jackson.databind.PropertyName");
            setStaticField(propertyNameClazz, "USE_DEFAULT", useDefault);
            POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
            String string = "";
            
            Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
            Class stringType = Class.forName("java.lang.String");
            Method _propNameFromSimpleMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_propNameFromSimple", stringType);
            _propNameFromSimpleMethod.setAccessible(true);
            java.lang.Object[] _propNameFromSimpleMethodArguments = new java.lang.Object[1];
            _propNameFromSimpleMethodArguments[0] = string;
            PropertyName actual = ((PropertyName) _propNameFromSimpleMethod.invoke(pOJOPropertiesCollector, _propNameFromSimpleMethodArguments));
            
            // com.fasterxml.jackson.databind.PropertyName has overridden equals method
            assertEquals(useDefault, actual);
        } finally {
            setStaticField(PropertyName.class, "USE_DEFAULT", prevUSE_DEFAULT);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._updateCreatorProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder, java.util.List)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List)}
 * @utbot.executesCondition {@code (creatorProperties != null): False}
 *  */
    @Test
    public void test_updateCreatorProperty_CreatorPropertiesEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        pOJOPropertiesCollector._updateCreatorProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List)}
 * @utbot.executesCondition {@code (creatorProperties != null): True}
 *  */
    @Test
    public void test_updateCreatorProperty_CreatorPropertiesNotEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        ArrayList arrayList = new ArrayList();
        
        pOJOPropertiesCollector._updateCreatorProperty(null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List)}
 * @utbot.executesCondition {@code (creatorProperties != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = creatorProperties.size(); i < len; ++i)} once
 *  */
    @Test
    public void test_updateCreatorProperty_NotCreatorPropertiesGetIGetInternalNameEquals() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, propertyName, null);
        ArrayList arrayList = new ArrayList();
        PropertyName propertyName1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName1, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder pOJOPropertyBuilder1 = new POJOPropertyBuilder(null, null, false, propertyName1, null);
        arrayList.add(pOJOPropertyBuilder1);
        
        pOJOPropertiesCollector._updateCreatorProperty(pOJOPropertyBuilder, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List)}
 * @utbot.executesCondition {@code (creatorProperties != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = creatorProperties.size(); i < len; ++i)} once
 *  */
    @Test
    public void test_updateCreatorProperty_CreatorPropertiesGetIGetInternalNameEquals() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, propertyName, null);
        ArrayList arrayList = new ArrayList();
        POJOPropertyBuilder pOJOPropertyBuilder1 = new POJOPropertyBuilder(null, null, false, propertyName, null);
        arrayList.add(pOJOPropertyBuilder1);
        arrayList.add(null);
        arrayList.add(null);
        
        pOJOPropertiesCollector._updateCreatorProperty(pOJOPropertyBuilder, arrayList);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder, java.util.List)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = creatorProperties.size(); i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: creatorProperties.get(i).getInternalName().equals(prop.getInternalName())
 *  */
    @Test
    public void test_updateCreatorProperty_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._updateCreatorProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._updateCreatorProperty(POJOPropertiesCollector.java:1072) */
        pOJOPropertiesCollector._updateCreatorProperty(null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = creatorProperties.size(); i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: creatorProperties.get(i).getInternalName().equals(prop.getInternalName())
 *  */
    @Test
    public void test_updateCreatorProperty_ThrowNullPointerException_1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        ArrayList arrayList = new ArrayList();
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, propertyName, null);
        arrayList.add(pOJOPropertyBuilder);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._updateCreatorProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._updateCreatorProperty(POJOPropertiesCollector.java:1072) */
        pOJOPropertiesCollector._updateCreatorProperty(null, arrayList);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_updateCreatorProperty(com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder,java.util.List)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = creatorProperties.size(); i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: creatorProperties.get(i).getInternalName().equals(prop.getInternalName())
 *  */
    @Test
    public void test_updateCreatorProperty_ThrowNullPointerException_2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null, false, propertyName, null);
        ArrayList arrayList = new ArrayList();
        PropertyName propertyName1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        POJOPropertyBuilder pOJOPropertyBuilder1 = new POJOPropertyBuilder(null, null, false, propertyName1, null);
        arrayList.add(pOJOPropertyBuilder1);
        arrayList.add(null);
        arrayList.add(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._updateCreatorProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._updateCreatorProperty(POJOPropertiesCollector.java:1072) */
        pOJOPropertiesCollector._updateCreatorProperty(pOJOPropertyBuilder, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnnotationIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotationIntrospector()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnnotationIntrospector()}
 * @utbot.returnsFrom {@code return _annotationIntrospector;}
 *  */
    @Test
    public void testGetAnnotationIntrospector_Return_annotationIntrospector() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        AnnotationIntrospector actual = pOJOPropertiesCollector.getAnnotationIntrospector();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getIgnoredPropertyNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoredPropertyNames()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getIgnoredPropertyNames()}
 * @utbot.returnsFrom {@code return _ignoredPropertyNames;}
 *  */
    @Test
    public void testGetIgnoredPropertyNames_Return_ignoredPropertyNames() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        Set actual = pOJOPropertiesCollector.getIgnoredPropertyNames();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _removeUnwantedProperties(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_removeUnwantedProperties(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 *  */
    @Test
    public void test_removeUnwantedProperties_ItHasNext() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        pOJOPropertiesCollector._removeUnwantedProperties(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _removeUnwantedProperties(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_removeUnwantedProperties(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<POJOPropertyBuilder> it = props.values().iterator();
 *  */
    @Test
    public void test_removeUnwantedProperties_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedProperties(POJOPropertiesCollector.java:692) */
        pOJOPropertiesCollector._removeUnwantedProperties(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_removeUnwantedProperties(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code while(it.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !prop.anyVisible()
 *  */
    @Test
    public void test_removeUnwantedProperties_ThrowNullPointerException_1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        linkedHashMap.put(string, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedProperties(POJOPropertiesCollector.java:697) */
        pOJOPropertiesCollector._removeUnwantedProperties(linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedAccessor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _removeUnwantedAccessor(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_removeUnwantedAccessor(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<POJOPropertyBuilder> it = props.values().iterator();
 *  */
    @Test
    public void test_removeUnwantedAccessor_ThrowNullPointerException_1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -254);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedAccessor(POJOPropertiesCollector.java:726) */
        pOJOPropertiesCollector._removeUnwantedAccessor(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_removeUnwantedAccessor(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<POJOPropertyBuilder> it = props.values().iterator();
 *  */
    @Test
    public void test_removeUnwantedAccessor_ThrowNullPointerException_2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 2);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedAccessor(POJOPropertiesCollector.java:726) */
        pOJOPropertiesCollector._removeUnwantedAccessor(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_removeUnwantedAccessor(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean inferMutators = _config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
 *  */
    @Test
    public void test_removeUnwantedAccessor_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedAccessor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._removeUnwantedAccessor(POJOPropertiesCollector.java:725) */
        pOJOPropertiesCollector._removeUnwantedAccessor(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.findPOJOBuilderClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findPOJOBuilderClass()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#findPOJOBuilderClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.returnsFrom {@code return _annotationIntrospector.findPOJOBuilder(_classDef);}
 *  */
    @Test
    public void testFindPOJOBuilderClass_AnnotationIntrospectorFindPOJOBuilder() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        Class actual = pOJOPropertiesCollector.findPOJOBuilderClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findPOJOBuilderClass()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#findPOJOBuilderClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findPOJOBuilder(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _annotationIntrospector.findPOJOBuilder(_classDef);
 *  */
    @Test
    public void testFindPOJOBuilderClass_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.findPOJOBuilderClass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.findPOJOBuilderClass(POJOPropertiesCollector.java:260) */
        pOJOPropertiesCollector.findPOJOBuilderClass();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameWithWrappers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _renameWithWrappers(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_renameWithWrappers(java.util.Map)}
 * @utbot.executesCondition {@code (renamed != null): False}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void test_renameWithWrappers_RenamedEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        pOJOPropertiesCollector._renameWithWrappers(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _renameWithWrappers(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_renameWithWrappers(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<Map.Entry<String, POJOPropertyBuilder>> it = props.entrySet().iterator();
 *  */
    @Test
    public void test_renameWithWrappers_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameWithWrappers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameWithWrappers(POJOPropertiesCollector.java:871) */
        pOJOPropertiesCollector._renameWithWrappers(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_renameWithWrappers(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code while(it.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedMember member = prop.getPrimaryMember();
 *  */
    @Test
    public void test_renameWithWrappers_ThrowNullPointerException_1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        linkedHashMap.put(string, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameWithWrappers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameWithWrappers(POJOPropertiesCollector.java:876) */
        pOJOPropertiesCollector._renameWithWrappers(linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._findNamingStrategy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findNamingStrategy()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_findNamingStrategy()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.executesCondition {@code (namingDef == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#getPropertyNamingStrategy()}
 * @utbot.returnsFrom {@code return _config.getPropertyNamingStrategy();}
 *  */
    @Test
    public void test_findNamingStrategy_NamingDefEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method _findNamingStrategyMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_findNamingStrategy");
        _findNamingStrategyMethod.setAccessible(true);
        java.lang.Object[] _findNamingStrategyMethodArguments = new java.lang.Object[0];
        PropertyNamingStrategy actual = ((PropertyNamingStrategy) _findNamingStrategyMethod.invoke(pOJOPropertiesCollector, _findNamingStrategyMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findNamingStrategy()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_findNamingStrategy()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getPropertyNamingStrategy();
 *  */
    @Test
    public void test_findNamingStrategy_ThrowNullPointerException() throws Throwable  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._findNamingStrategy] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._findNamingStrategy(POJOPropertiesCollector.java:1036) */
        Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method _findNamingStrategyMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_findNamingStrategy");
        _findNamingStrategyMethod.setAccessible(true);
        java.lang.Object[] _findNamingStrategyMethodArguments = new java.lang.Object[0];
        try {
            _findNamingStrategyMethod.invoke(pOJOPropertiesCollector, _findNamingStrategyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_findNamingStrategy()}
 * @utbot.executesCondition {@code ((_annotationIntrospector == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findNamingStrategy(com.fasterxml.jackson.databind.introspect.AnnotatedClass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _config.getPropertyNamingStrategy();
 *  */
    @Test
    public void test_findNamingStrategy_ThrowNullPointerException_1() throws Throwable  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._findNamingStrategy] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._findNamingStrategy(POJOPropertiesCollector.java:1036) */
        Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Method _findNamingStrategyMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_findNamingStrategy");
        _findNamingStrategyMethod.setAccessible(true);
        java.lang.Object[] _findNamingStrategyMethodArguments = new java.lang.Object[0];
        try {
            _findNamingStrategyMethod.invoke(pOJOPropertiesCollector, _findNamingStrategyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getJsonValueMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJsonValueMethod()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getJsonValueMethod()}
 * @utbot.executesCondition {@code (_jsonValueGetters != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetJsonValueMethod__jsonValueGettersEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        
        AnnotatedMethod actual = pOJOPropertiesCollector.getJsonValueMethod();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getJsonValueMethod()}
 * @utbot.executesCondition {@code (_jsonValueGetters != null): True}
 * @utbot.executesCondition {@code (_jsonValueGetters.size() > 1): False}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.invokes {@link java.util.LinkedList#get(int)}
 * @utbot.returnsFrom {@code return _jsonValueGetters.get(0);}
 *  */
    @Test
    public void testGetJsonValueMethod__jsonValueGettersSizeLessOrEqual1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        LinkedList _jsonValueGetters = new LinkedList();
        _jsonValueGetters.add(null);
        pOJOPropertiesCollector._jsonValueGetters = _jsonValueGetters;
        
        AnnotatedMethod actual = pOJOPropertiesCollector.getJsonValueMethod();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnyGetter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnyGetter()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnyGetter()}
 * @utbot.executesCondition {@code (_anyGetters != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAnyGetter__anyGettersEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        
        AnnotatedMember actual = pOJOPropertiesCollector.getAnyGetter();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnyGetter()}
 * @utbot.executesCondition {@code (_anyGetters != null): True}
 * @utbot.executesCondition {@code (_anyGetters.size() > 1): False}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.invokes {@link java.util.LinkedList#getFirst()}
 * @utbot.returnsFrom {@code return _anyGetters.getFirst();}
 *  */
    @Test
    public void testGetAnyGetter__anyGettersSizeLessOrEqual1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        LinkedList _anyGetters = new LinkedList();
        _anyGetters.add(null);
        pOJOPropertiesCollector._anyGetters = _anyGetters;
        
        AnnotatedMember actual = pOJOPropertiesCollector.getAnyGetter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getClassDef
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassDef()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getClassDef()}
 * @utbot.returnsFrom {@code return _classDef;}
 *  */
    @Test
    public void testGetClassDef_Return_classDef() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        AnnotatedClass actual = pOJOPropertiesCollector.getClassDef();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getConfig
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConfig()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getConfig()}
 * @utbot.returnsFrom {@code return _config;}
 *  */
    @Test
    public void testGetConfig_Return_config() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        MapperConfig actual = pOJOPropertiesCollector.getConfig();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getInjectables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInjectables()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getInjectables()}
 * @utbot.executesCondition {@code (!_collected): False}
 * @utbot.returnsFrom {@code return _injectables;}
 *  */
    @Test
    public void testGetInjectables__collected() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        
        Map actual = pOJOPropertiesCollector.getInjectables();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getObjectIdInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getObjectIdInfo()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getObjectIdInfo()}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetObjectIdInfo__annotationIntrospectorEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        ObjectIdInfo actual = pOJOPropertiesCollector.getObjectIdInfo();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getObjectIdInfo()}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): False}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findObjectIdInfo(com.fasterxml.jackson.databind.introspect.Annotated)}
 * @utbot.returnsFrom {@code return info;}
 *  */
    @Test
    public void testGetObjectIdInfo_InfoEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        ObjectIdInfo actual = pOJOPropertiesCollector.getObjectIdInfo();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnySetterMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnySetterMethod()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnySetterMethod()}
 * @utbot.executesCondition {@code (_anySetters != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAnySetterMethod__anySettersEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        
        AnnotatedMethod actual = pOJOPropertiesCollector.getAnySetterMethod();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnySetterMethod()}
 * @utbot.executesCondition {@code (_anySetters != null): True}
 * @utbot.executesCondition {@code (_anySetters.size() > 1): False}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.invokes {@link java.util.LinkedList#getFirst()}
 * @utbot.returnsFrom {@code return _anySetters.getFirst();}
 *  */
    @Test
    public void testGetAnySetterMethod__anySettersSizeLessOrEqual1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        LinkedList _anySetters = new LinkedList();
        _anySetters.add(null);
        pOJOPropertiesCollector._anySetters = _anySetters;
        
        AnnotatedMethod actual = pOJOPropertiesCollector.getAnySetterMethod();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addFields(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addFields(java.util.Map)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#fields()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 *  */
    @Test
    public void test_addFields_BooleanPruneFinalFieldsInitializedByNot_forSerializationAndNot_configIsEnabled() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        pOJOPropertiesCollector._addFields(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addFields(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addFields(java.util.Map)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean transientAsIgnoral = _config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
 *  */
    @Test
    public void test_addFields_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:368) */
        pOJOPropertiesCollector._addFields(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addFields(java.util.Map)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#isEnabled(com.fasterxml.jackson.databind.MapperFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final boolean pruneFinalFields = !_forSerialization && !_config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);
 *  */
    @Test
    public void test_addFields_ThrowNullPointerException_1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:367) */
        pOJOPropertiesCollector._addFields(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addFields(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedField f: _classDef.fields())
 *  */
    @Test
    public void test_addFields_ThrowNullPointerException_2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370) */
        pOJOPropertiesCollector._addFields(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addFields(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedField f: _classDef.fields())
 *  */
    @Test
    public void test_addFields_ThrowNullPointerException_3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370) */
        pOJOPropertiesCollector._addFields(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addFields(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedField f: _classDef.fields())
 *  */
    @Test
    public void test_addFields_ThrowNullPointerException_5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370) */
        pOJOPropertiesCollector._addFields(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addFields(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedField f: _classDef.fields())
 *  */
    @Test
    public void test_addFields_ThrowNullPointerException_4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 2048);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370) */
        pOJOPropertiesCollector._addFields(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getAnySetterField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnySetterField()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnySetterField()}
 * @utbot.executesCondition {@code (_anySetterField != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetAnySetterField__anySetterFieldEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        
        AnnotatedMember actual = pOJOPropertiesCollector.getAnySetterField();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getAnySetterField()}
 * @utbot.executesCondition {@code (_anySetterField != null): True}
 * @utbot.executesCondition {@code (_anySetterField.size() > 1): False}
 * @utbot.invokes {@link java.util.LinkedList#size()}
 * @utbot.invokes {@link java.util.LinkedList#getFirst()}
 * @utbot.returnsFrom {@code return _anySetterField.getFirst();}
 *  */
    @Test
    public void testGetAnySetterField__anySetterFieldSizeLessOrEqual1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        LinkedList _anySetterField = new LinkedList();
        _anySetterField.add(null);
        pOJOPropertiesCollector._anySetterField = _anySetterField;
        
        AnnotatedMember actual = pOJOPropertiesCollector.getAnySetterField();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyMap()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getPropertyMap()}
 * @utbot.executesCondition {@code (!_collected): False}
 * @utbot.returnsFrom {@code return _properties;}
 *  */
    @Test
    public void testGetPropertyMap__collected() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        
        Map actual = pOJOPropertiesCollector.getPropertyMap();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPropertyMap()
    
    @Test
    public void testGetPropertyMap1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 2048);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields(ClassUtil.java:937)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields(AnnotatedClass.java:837)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveFields(AnnotatedClass.java:603)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.fields(AnnotatedClass.java:361)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap6() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 6144);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields(ClassUtil.java:937)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields(AnnotatedClass.java:837)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveFields(AnnotatedClass.java:603)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.fields(AnnotatedClass.java:361)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap7() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 2048);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapType _type = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap8() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields(ClassUtil.java:937)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields(AnnotatedClass.java:837)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveFields(AnnotatedClass.java:603)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.fields(AnnotatedClass.java:361)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap9() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:373)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap10() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:373)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    
    @Test
    public void testGetPropertyMap11() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        MapType _type = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _superClass = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields(ClassUtil.java:937)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields(AnnotatedClass.java:837)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveFields(AnnotatedClass.java:603)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.fields(AnnotatedClass.java:361)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266) */
        pOJOPropertiesCollector.getPropertyMap();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addCreatorParam(java.util.Map, com.fasterxml.jackson.databind.introspect.AnnotatedParameter)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addCreatorParam(java.util.Map,com.fasterxml.jackson.databind.introspect.AnnotatedParameter)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#findImplicitPropertyName(com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String impl = _annotationIntrospector.findImplicitPropertyName(param);
 *  */
    @Test
    public void test_addCreatorParam_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam(POJOPropertiesCollector.java:470) */
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addCreatorParam(java.util.Map, com.fasterxml.jackson.databind.introspect.AnnotatedParameter)
    
    @Test(expected = StackOverflowError.class)
    public void test_addCreatorParam1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addCreatorParam2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addCreatorParam3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        pOJOPropertiesCollector._addCreatorParam(null, annotatedParameter);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addCreatorParam4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary3 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addCreatorParam5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        pOJOPropertiesCollector._addCreatorParam(null, annotatedParameter);
    }
    
    @Test(expected = StackOverflowError.class)
    public void test_addCreatorParam6() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary3 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        pOJOPropertiesCollector._addCreatorParam(null, annotatedParameter);
    }
    
    @Test
    public void test_addCreatorParam7() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findNameForDeserialization(JacksonAnnotationIntrospector.java:1072)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findNameForDeserialization(AnnotationIntrospectorPair.java:685)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam(POJOPropertiesCollector.java:474) */
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    
    @Test
    public void test_addCreatorParam8() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam] produces [java.lang.NullPointerException] */
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    
    @Test
    public void test_addCreatorParam9() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary2 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam] produces [java.lang.NullPointerException] */
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    
    @Test
    public void test_addCreatorParam10() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary2 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:469)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:468)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam(POJOPropertiesCollector.java:470) */
        pOJOPropertiesCollector._addCreatorParam(null, annotatedParameter);
    }
    
    @Test
    public void test_addCreatorParam11() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam] produces [java.lang.NullPointerException] */
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    
    @Test
    public void test_addCreatorParam12() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary3);
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary4);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:468)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:468)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:469)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:468)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:469)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findImplicitPropertyName(AnnotationIntrospectorPair.java:468)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreatorParam(POJOPropertiesCollector.java:470) */
        pOJOPropertiesCollector._addCreatorParam(null, null);
    }
    ///endregion
    
    ///region Errors report for _addCreatorParam
    
    public void test_addCreatorParam_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addMethods(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addMethods(java.util.Map)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#memberMethods()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 *  */
    @Test
    public void test_addMethods_IterableIterator() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        LinkedHashMap _methods = new LinkedHashMap();
        _memberMethods._methods = _methods;
        _classDef._memberMethods = _memberMethods;
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        pOJOPropertiesCollector._addMethods(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addMethods(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addMethods(java.util.Map)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#memberMethods()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedMethod m: _classDef.memberMethods())
 *  */
    @Test
    public void test_addMethods_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511) */
        pOJOPropertiesCollector._addMethods(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addMethods(java.util.Map)
    
    @Test
    public void test_addMethods1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _class = Object.class;
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511) */
        pOJOPropertiesCollector._addMethods(null);
    }
    
    @Test
    public void test_addMethods2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Class _primaryMixIn = Object.class;
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511) */
        pOJOPropertiesCollector._addMethods(null);
    }
    
    @Test
    public void test_addMethods3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        LinkedHashMap _methods = new LinkedHashMap();
        MemberKey memberKey = ((MemberKey) createInstance("com.fasterxml.jackson.databind.introspect.MemberKey"));
        String _name = "";
        setField(memberKey, "com.fasterxml.jackson.databind.introspect.MemberKey", "_name", _name);
        java.lang.Class[] _argTypes = {null, null, null, null, null, null, null, null, null};
        setField(memberKey, "com.fasterxml.jackson.databind.introspect.MemberKey", "_argTypes", _argTypes);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _methods.put(memberKey, annotatedMethod);
        _memberMethods._methods = _methods;
        _classDef._memberMethods = _memberMethods;
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterTypes(AnnotatedMethod.java:218)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getParameterCount(AnnotatedMethod.java:141)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:517) */
        pOJOPropertiesCollector._addMethods(null);
    }
    
    @Test
    public void test_addMethods4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        LinkedHashMap _methods = new LinkedHashMap();
        MemberKey memberKey = ((MemberKey) createInstance("com.fasterxml.jackson.databind.introspect.MemberKey"));
        String _name = "";
        setField(memberKey, "com.fasterxml.jackson.databind.introspect.MemberKey", "_name", _name);
        java.lang.Class[] _argTypes = new java.lang.Class[16];
        setField(memberKey, "com.fasterxml.jackson.databind.introspect.MemberKey", "_argTypes", _argTypes);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _methods.put(memberKey, annotatedMethod);
        MemberKey memberKey1 = ((MemberKey) createInstance("com.fasterxml.jackson.databind.introspect.MemberKey"));
        setField(memberKey1, "com.fasterxml.jackson.databind.introspect.MemberKey", "_name", _name);
        setField(memberKey1, "com.fasterxml.jackson.databind.introspect.MemberKey", "_argTypes", _argTypes);
        _methods.put(memberKey1, null);
        _memberMethods._methods = _methods;
        _classDef._memberMethods = _memberMethods;
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:517) */
        pOJOPropertiesCollector._addMethods(null);
    }
    
    @Test
    public void test_addMethods5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _superTypes = new ArrayList();
        _superTypes.add(null);
        _superTypes.add(null);
        _superTypes.add(null);
        _superTypes.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_superTypes", _superTypes);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:559)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511) */
        pOJOPropertiesCollector._addMethods(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addInjectables(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addInjectables(java.util.Map)}
 * @utbot.executesCondition {@code (ai == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_addInjectables_AiEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        pOJOPropertiesCollector._addInjectables(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addInjectables(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addInjectables(java.util.Map)}
 * @utbot.executesCondition {@code (ai == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedClass#fields()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedField f: _classDef.fields())
 *  */
    @Test
    public void test_addInjectables_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables(POJOPropertiesCollector.java:645) */
        pOJOPropertiesCollector._addInjectables(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addInjectables(java.util.Map)
    
    @Test
    public void test_addInjectables1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        LinkedHashMap _methods = new LinkedHashMap();
        _memberMethods._methods = _methods;
        _classDef._memberMethods = _memberMethods;
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        pOJOPropertiesCollector._addInjectables(linkedHashMap);
    }
    
    @Test
    public void test_addInjectables2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        _classDef._memberMethods = _memberMethods;
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        pOJOPropertiesCollector._addInjectables(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addInjectables(java.util.Map)
    
    @Test
    public void test_addInjectables3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables(POJOPropertiesCollector.java:649) */
        pOJOPropertiesCollector._addInjectables(null);
    }
    
    @Test
    public void test_addInjectables4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotatedMethodMap _memberMethods = ((AnnotatedMethodMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap"));
        LinkedHashMap _methods = new LinkedHashMap();
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        _methods.put(null, annotatedMethod);
        _memberMethods._methods = _methods;
        _classDef._memberMethods = _memberMethods;
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getRawParameterTypes(AnnotatedMethod.java:218)
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getParameterCount(AnnotatedMethod.java:141)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables(POJOPropertiesCollector.java:653) */
        pOJOPropertiesCollector._addInjectables(linkedHashMap);
    }
    
    @Test
    public void test_addInjectables5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_superClass, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_typeFactory", _typeFactory);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables(POJOPropertiesCollector.java:649) */
        pOJOPropertiesCollector._addInjectables(null);
    }
    
    @Test
    public void test_addInjectables6() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findInjectableValueId(AnnotationIntrospectorPair.java:294)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables(POJOPropertiesCollector.java:646) */
        pOJOPropertiesCollector._addInjectables(null);
    }
    
    @Test
    public void test_addInjectables7() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _superClass1 = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_superClass, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass1);
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.getDeclaredFields(ClassUtil.java:937)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields(AnnotatedClass.java:837)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass._findFields(AnnotatedClass.java:834)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveFields(AnnotatedClass.java:603)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.fields(AnnotatedClass.java:361)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addInjectables(POJOPropertiesCollector.java:645) */
        pOJOPropertiesCollector._addInjectables(null);
    }
    ///endregion
    
    ///region Errors report for _addInjectables
    
    public void test_addInjectables_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Wrong number of type storages is provided, expected 2 arguments,
        but only 1 found */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addSetterMethod
    
    ///region Errors report for _addSetterMethod
    
    public void test_addSetterMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field name is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addGetterMethod
    
    ///region Errors report for _addGetterMethod
    
    public void test_addGetterMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field returnType is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _addCreators(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addCreators(java.util.Map)}
 * @utbot.executesCondition {@code (_annotationIntrospector == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_addCreators__annotationIntrospectorEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        pOJOPropertiesCollector._addCreators(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _addCreators(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addCreators(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedConstructor ctor: _classDef.getConstructors())
 *  */
    @Test
    public void test_addCreators_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators(POJOPropertiesCollector.java:445) */
        pOJOPropertiesCollector._addCreators(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addCreators(java.util.Map)}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedConstructor ctor: _classDef.getConstructors())
 *  */
    @Test
    public void test_addCreators_ThrowNullPointerException_1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        _classDef._creatorsResolved = true;
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators(POJOPropertiesCollector.java:445) */
        pOJOPropertiesCollector._addCreators(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_addCreators(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(AnnotatedConstructor ctor: _classDef.getConstructors())
 *  */
    @Test
    public void test_addCreators_ThrowNullPointerException_2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:462)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getConstructors(AnnotatedClass.java:314)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators(POJOPropertiesCollector.java:445) */
        pOJOPropertiesCollector._addCreators(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _addCreators(java.util.Map)
    
    @Test
    public void test_addCreators1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        JavaType javaType = pOJOPropertiesCollector._classDef._type;
        Class initialPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
        
        pOJOPropertiesCollector._addCreators(null);
        
        JavaType javaType1 = pOJOPropertiesCollector._classDef._type;
        Class finalPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
        boolean finalPOJOPropertiesCollector_classDef_creatorsResolved = pOJOPropertiesCollector._classDef._creatorsResolved;
        
        assertFalse(initialPOJOPropertiesCollector_classDef_type_class == finalPOJOPropertiesCollector_classDef_type_class);
        
        assertFalse(initialPOJOPropertiesCollector_classDef_class == finalPOJOPropertiesCollector_classDef_class);
        
        assertTrue(finalPOJOPropertiesCollector_classDef_creatorsResolved);
    }
    
    @Test
    public void test_addCreators2() throws Exception  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] prevNO_CTORS = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor[]) getStaticFieldValue(classUtilClazz, "NO_CTORS"));
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] noCtors = {};
            setStaticField(classUtilClazz, "NO_CTORS", noCtors);
            POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
            AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _class);
            AnnotatedConstructor _defaultConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
            _classDef._defaultConstructor = _defaultConstructor;
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
            NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
            
            JavaType javaType = pOJOPropertiesCollector._classDef._type;
            Class initialPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            Class initialPOJOPropertiesCollector_classDef_primaryMixIn = pOJOPropertiesCollector._classDef._primaryMixIn;
            
            pOJOPropertiesCollector._addCreators(null);
            
            JavaType javaType1 = pOJOPropertiesCollector._classDef._type;
            Class finalPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            Class finalPOJOPropertiesCollector_classDef_primaryMixIn = pOJOPropertiesCollector._classDef._primaryMixIn;
            boolean finalPOJOPropertiesCollector_classDef_creatorsResolved = pOJOPropertiesCollector._classDef._creatorsResolved;
            
            assertFalse(initialPOJOPropertiesCollector_classDef_type_class == finalPOJOPropertiesCollector_classDef_type_class);
            
            assertFalse(initialPOJOPropertiesCollector_classDef_class == finalPOJOPropertiesCollector_classDef_class);
            
            assertFalse(initialPOJOPropertiesCollector_classDef_primaryMixIn == finalPOJOPropertiesCollector_classDef_primaryMixIn);
            
            assertTrue(finalPOJOPropertiesCollector_classDef_creatorsResolved);
        } finally {
            setStaticField(ClassUtil.class, "NO_CTORS", prevNO_CTORS);
        }
    }
    
    @Test
    public void test_addCreators3() throws Exception  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] prevNO_CTORS = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor[]) getStaticFieldValue(classUtilClazz, "NO_CTORS"));
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] noCtors = {};
            setStaticField(classUtilClazz, "NO_CTORS", noCtors);
            POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
            AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _class);
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
            JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            
            JavaType javaType = pOJOPropertiesCollector._classDef._type;
            Class initialPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            Class initialPOJOPropertiesCollector_classDef_primaryMixIn = pOJOPropertiesCollector._classDef._primaryMixIn;
            
            pOJOPropertiesCollector._addCreators(linkedHashMap);
            
            JavaType javaType1 = pOJOPropertiesCollector._classDef._type;
            Class finalPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            Class finalPOJOPropertiesCollector_classDef_primaryMixIn = pOJOPropertiesCollector._classDef._primaryMixIn;
            boolean finalPOJOPropertiesCollector_classDef_creatorsResolved = pOJOPropertiesCollector._classDef._creatorsResolved;
            
            assertFalse(initialPOJOPropertiesCollector_classDef_type_class == finalPOJOPropertiesCollector_classDef_type_class);
            
            assertFalse(initialPOJOPropertiesCollector_classDef_class == finalPOJOPropertiesCollector_classDef_class);
            
            assertFalse(initialPOJOPropertiesCollector_classDef_primaryMixIn == finalPOJOPropertiesCollector_classDef_primaryMixIn);
            
            assertTrue(finalPOJOPropertiesCollector_classDef_creatorsResolved);
        } finally {
            setStaticField(ClassUtil.class, "NO_CTORS", prevNO_CTORS);
        }
    }
    
    @Test
    public void test_addCreators4() throws Exception  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] prevNO_CTORS = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor[]) getStaticFieldValue(classUtilClazz, "NO_CTORS"));
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] noCtors = {};
            setStaticField(classUtilClazz, "NO_CTORS", noCtors);
            POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
            AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
            NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
            AnnotatedConstructor _defaultConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
            _classDef._defaultConstructor = _defaultConstructor;
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
            JacksonAnnotationIntrospector _annotationIntrospector1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            
            JavaType javaType = pOJOPropertiesCollector._classDef._type;
            Class initialPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            
            pOJOPropertiesCollector._addCreators(linkedHashMap);
            
            JavaType javaType1 = pOJOPropertiesCollector._classDef._type;
            Class finalPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            boolean finalPOJOPropertiesCollector_classDef_creatorsResolved = pOJOPropertiesCollector._classDef._creatorsResolved;
            
            assertFalse(initialPOJOPropertiesCollector_classDef_type_class == finalPOJOPropertiesCollector_classDef_type_class);
            
            assertFalse(initialPOJOPropertiesCollector_classDef_class == finalPOJOPropertiesCollector_classDef_class);
            
            assertTrue(finalPOJOPropertiesCollector_classDef_creatorsResolved);
        } finally {
            setStaticField(ClassUtil.class, "NO_CTORS", prevNO_CTORS);
        }
    }
    
    @Test
    public void test_addCreators5() throws Exception  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] prevNO_CTORS = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor[]) getStaticFieldValue(classUtilClazz, "NO_CTORS"));
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] noCtors = {};
            setStaticField(classUtilClazz, "NO_CTORS", noCtors);
            POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
            AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
            NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
            JacksonAnnotationIntrospector _annotationIntrospector1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            
            JavaType javaType = pOJOPropertiesCollector._classDef._type;
            Class initialPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            
            pOJOPropertiesCollector._addCreators(linkedHashMap);
            
            JavaType javaType1 = pOJOPropertiesCollector._classDef._type;
            Class finalPOJOPropertiesCollector_classDef_type_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalPOJOPropertiesCollector_classDef_class = pOJOPropertiesCollector._classDef._class;
            boolean finalPOJOPropertiesCollector_classDef_creatorsResolved = pOJOPropertiesCollector._classDef._creatorsResolved;
            
            assertFalse(initialPOJOPropertiesCollector_classDef_type_class == finalPOJOPropertiesCollector_classDef_type_class);
            
            assertFalse(initialPOJOPropertiesCollector_classDef_class == finalPOJOPropertiesCollector_classDef_class);
            
            assertTrue(finalPOJOPropertiesCollector_classDef_creatorsResolved);
        } finally {
            setStaticField(ClassUtil.class, "NO_CTORS", prevNO_CTORS);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _addCreators(java.util.Map)
    
    @Test
    public void test_addCreators6() throws Exception  {
        Class classUtilClazz = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] prevNO_CTORS = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor[]) getStaticFieldValue(classUtilClazz, "NO_CTORS"));
        try {
            com.fasterxml.jackson.databind.util.ClassUtil.Ctor[] noCtors = {};
            setStaticField(classUtilClazz, "NO_CTORS", noCtors);
            POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
            AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            CollectionLikeType _type = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_class", _class);
            AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
            AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
            setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
            setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
            AnnotatedConstructor _defaultConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
            _classDef._defaultConstructor = _defaultConstructor;
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
            JacksonAnnotationIntrospector _annotationIntrospector1 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
            setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            
            /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.hasIgnoreMarker(AnnotationIntrospectorPair.java:300)
                com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.hasIgnoreMarker(AnnotationIntrospectorPair.java:300)
                com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:495)
                com.fasterxml.jackson.databind.introspect.AnnotatedClass.getConstructors(AnnotatedClass.java:314)
                com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators(POJOPropertiesCollector.java:445) */
            pOJOPropertiesCollector._addCreators(linkedHashMap);
        } finally {
            setStaticField(ClassUtil.class, "NO_CTORS", prevNO_CTORS);
        }
    }
    
    @Test
    public void test_addCreators7() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        _classDef._creatorsResolved = true;
        ArrayList _constructors = new ArrayList();
        _constructors.add(null);
        _constructors.add(null);
        _constructors.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_constructors", _constructors);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addCreators(POJOPropertiesCollector.java:449) */
        pOJOPropertiesCollector._addCreators(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._doAddInjectable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _doAddInjectable(java.lang.Object, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_doAddInjectable(java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.executesCondition {@code (id == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_doAddInjectable_IdEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        pOJOPropertiesCollector._doAddInjectable(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_doAddInjectable(java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.executesCondition {@code (id == null): False}
 * @utbot.executesCondition {@code (_injectables == null): True}
 * @utbot.executesCondition {@code (prev != null): False}
 *  */
    @Test
    public void test_doAddInjectable__injectablesEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        byte[] byteArray = {};
        
        pOJOPropertiesCollector._doAddInjectable(byteArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_doAddInjectable(java.lang.Object,com.fasterxml.jackson.databind.introspect.AnnotatedMember)}
 * @utbot.executesCondition {@code (id == null): False}
 * @utbot.executesCondition {@code (_injectables == null): False}
 * @utbot.executesCondition {@code (prev != null): False}
 *  */
    @Test
    public void test_doAddInjectable__injectablesNotEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap _injectables = new LinkedHashMap();
        pOJOPropertiesCollector._injectables = _injectables;
        byte[] byteArray = {};
        
        pOJOPropertiesCollector._doAddInjectable(byteArray, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _doAddInjectable(java.lang.Object, com.fasterxml.jackson.databind.introspect.AnnotatedMember)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_doAddInjectable1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap _injectables = new LinkedHashMap();
        Integer integer = 0;
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        _injectables.put(integer, annotatedConstructor);
        pOJOPropertiesCollector._injectables = _injectables;
        
        pOJOPropertiesCollector._doAddInjectable(integer, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.reportProblem
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reportProblem(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#reportProblem(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Problem with definition of " + _classDef + ": " + msg);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReportProblem_ThrowIllegalArgumentException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        pOJOPropertiesCollector.reportProblem(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._collectIgnorals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _collectIgnorals(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_collectIgnorals(java.lang.String)}
 * @utbot.executesCondition {@code (!_forSerialization): False}
 *  */
    @Test
    public void test_collectIgnorals__forSerialization() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        
        Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Class stringType = Class.forName("java.lang.String");
        Method _collectIgnoralsMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_collectIgnorals", stringType);
        _collectIgnoralsMethod.setAccessible(true);
        java.lang.Object[] _collectIgnoralsMethodArguments = new java.lang.Object[1];
        _collectIgnoralsMethodArguments[0] = ((Object) null);
        _collectIgnoralsMethod.invoke(pOJOPropertiesCollector, _collectIgnoralsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_collectIgnorals(java.lang.String)}
 * @utbot.executesCondition {@code (!_forSerialization): True}
 * @utbot.executesCondition {@code (_ignoredPropertyNames == null): True}
 * @utbot.invokes {@link java.util.HashSet#add(java.lang.Object)}
 *  */
    @Test
    public void test_collectIgnorals__ignoredPropertyNamesEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Class stringType = Class.forName("java.lang.String");
        Method _collectIgnoralsMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_collectIgnorals", stringType);
        _collectIgnoralsMethod.setAccessible(true);
        java.lang.Object[] _collectIgnoralsMethodArguments = new java.lang.Object[1];
        _collectIgnoralsMethodArguments[0] = ((Object) null);
        _collectIgnoralsMethod.invoke(pOJOPropertiesCollector, _collectIgnoralsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _collectIgnorals(java.lang.String)
    
    @Test
    public void test_collectIgnorals1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        HashSet _ignoredPropertyNames = new HashSet();
        pOJOPropertiesCollector._ignoredPropertyNames = _ignoredPropertyNames;
        String string = "";
        
        Class pOJOPropertiesCollectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Class stringType = Class.forName("java.lang.String");
        Method _collectIgnoralsMethod = pOJOPropertiesCollectorClazz.getDeclaredMethod("_collectIgnorals", stringType);
        _collectIgnoralsMethod.setAccessible(true);
        java.lang.Object[] _collectIgnoralsMethodArguments = new java.lang.Object[1];
        _collectIgnoralsMethodArguments[0] = string;
        _collectIgnoralsMethod.invoke(pOJOPropertiesCollector, _collectIgnoralsMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _renameProperties(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_renameProperties(java.util.Map)}
 * @utbot.executesCondition {@code (renamed != null): False}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void test_renameProperties_RenamedEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        pOJOPropertiesCollector._renameProperties(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _renameProperties(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_renameProperties(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<Map.Entry<String, POJOPropertyBuilder>> it = props.entrySet().iterator();
 *  */
    @Test
    public void test_renameProperties_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameProperties(POJOPropertiesCollector.java:759) */
        pOJOPropertiesCollector._renameProperties(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _renameProperties(java.util.Map)
    
    @Test
    public void test_renameProperties1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null);
        linkedHashMap.put(string, pOJOPropertyBuilder);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string1, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameProperties(POJOPropertiesCollector.java:765) */
        pOJOPropertiesCollector._renameProperties(linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _sortProperties(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_sortProperties(java.util.Map)}
 * @utbot.executesCondition {@code ((intr == null)): True}
 * @utbot.executesCondition {@code (alpha == null): True}
 * @utbot.executesCondition {@code ((intr == null)): True}
 * @utbot.executesCondition {@code (!sort): True}
 * @utbot.executesCondition {@code (_creatorProperties == null): True}
 * @utbot.executesCondition {@code (propertyOrder == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.cfg.MapperConfig#shouldSortPropertiesAlphabetically()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_sortProperties_PropertyOrderEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        pOJOPropertiesCollector._sortProperties(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _sortProperties(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_sortProperties(java.util.Map)}
 * @utbot.executesCondition {@code ((intr == null)): True}
 * @utbot.executesCondition {@code (!sort): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = props.size();
 *  */
    @Test
    public void test_sortProperties_ThrowNullPointerException_2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", -255);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties(POJOPropertiesCollector.java:937) */
        pOJOPropertiesCollector._sortProperties(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_sortProperties(java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sort = _config.shouldSortPropertiesAlphabetically();
 *  */
    @Test
    public void test_sortProperties_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties(POJOPropertiesCollector.java:927) */
        pOJOPropertiesCollector._sortProperties(null);
    }
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_sortProperties(java.util.Map)}
 * @utbot.executesCondition {@code ((intr == null)): True}
 * @utbot.executesCondition {@code (!sort): True}
 * @utbot.executesCondition {@code (_creatorProperties == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int size = props.size();
 *  */
    @Test
    public void test_sortProperties_ThrowNullPointerException_1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        LinkedList _creatorProperties = new LinkedList();
        pOJOPropertiesCollector._creatorProperties = _creatorProperties;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties(POJOPropertiesCollector.java:937) */
        pOJOPropertiesCollector._sortProperties(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _sortProperties(java.util.Map)
    
    @Test
    public void test_sortProperties1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 32768);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        pOJOPropertiesCollector._sortProperties(linkedHashMap);
    }
    
    @Test
    public void test_sortProperties2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        LinkedList _creatorProperties = new LinkedList();
        pOJOPropertiesCollector._creatorProperties = _creatorProperties;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null);
        linkedHashMap.put(string, pOJOPropertyBuilder);
        
        pOJOPropertiesCollector._sortProperties(linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _sortProperties(java.util.Map)
    
    @Test(expected = StackOverflowError.class)
    public void test_sortProperties3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        pOJOPropertiesCollector._sortProperties(null);
    }
    
    @Test
    public void test_sortProperties4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 32768);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null);
        linkedHashMap.put(string, pOJOPropertyBuilder);
        linkedHashMap.put(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties(POJOPropertiesCollector.java:947) */
        pOJOPropertiesCollector._sortProperties(linkedHashMap);
    }
    
    @Test
    public void test_sortProperties5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        LinkedList _creatorProperties = new LinkedList();
        pOJOPropertiesCollector._creatorProperties = _creatorProperties;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null);
        linkedHashMap.put(string, pOJOPropertyBuilder);
        String string1 = "";
        linkedHashMap.put(string1, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._sortProperties(POJOPropertiesCollector.java:947) */
        pOJOPropertiesCollector._sortProperties(linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._property
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _property(java.util.Map, com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_property(java.util.Map,com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#getSimpleName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _property(props, name.getSimpleName());
 *  */
    @Test
    public void test_property_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._property] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._property(POJOPropertiesCollector.java:1015) */
        pOJOPropertiesCollector._property(((Map) null), ((PropertyName) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _property(java.util.Map, com.fasterxml.jackson.databind.PropertyName)
    
    @Test
    public void test_property1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        POJOPropertyBuilder actual = pOJOPropertiesCollector._property(((Map) linkedHashMap), propertyName);
        
        PropertyName propertyName1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName1, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder expected = new POJOPropertyBuilder(null, null, false, propertyName1, propertyName1);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        MapperConfig actual_config = actual._config;
        assertNull(actual_config);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        PropertyName expected_name = expected._name;
        PropertyName actual_name = actual._name;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_internalName = expected._internalName;
        PropertyName actual_internalName = actual._internalName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_internalName, actual_internalName);
        
        POJOPropertyBuilder.Linked actual_fields = actual._fields;
        assertNull(actual_fields);
        
        POJOPropertyBuilder.Linked actual_ctorParameters = actual._ctorParameters;
        assertNull(actual_ctorParameters);
        
        POJOPropertyBuilder.Linked actual_getters = actual._getters;
        assertNull(actual_getters);
        
        POJOPropertyBuilder.Linked actual_setters = actual._setters;
        assertNull(actual_setters);
        
    }
    
    @Test
    public void test_property2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        POJOPropertyBuilder actual = pOJOPropertiesCollector._property(((Map) linkedHashMap), propertyName);
        
        PropertyName propertyName1 = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName1 = "";
        setField(propertyName1, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName1);
        POJOPropertyBuilder expected = new POJOPropertyBuilder(null, null, false, propertyName1, propertyName1);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        MapperConfig actual_config = actual._config;
        assertNull(actual_config);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        PropertyName expected_name = expected._name;
        PropertyName actual_name = actual._name;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_internalName = expected._internalName;
        PropertyName actual_internalName = actual._internalName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_internalName, actual_internalName);
        
        POJOPropertyBuilder.Linked actual_fields = actual._fields;
        assertNull(actual_fields);
        
        POJOPropertyBuilder.Linked actual_ctorParameters = actual._ctorParameters;
        assertNull(actual_ctorParameters);
        
        POJOPropertyBuilder.Linked actual_getters = actual._getters;
        assertNull(actual_getters);
        
        POJOPropertyBuilder.Linked actual_setters = actual._setters;
        assertNull(actual_setters);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._property
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _property(java.util.Map, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_property(java.util.Map,java.lang.String)}
 * @utbot.executesCondition {@code (prop == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return prop;}
 *  */
    @Test
    public void test_property_PropNotEqualsNull() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null);
        linkedHashMap.put(null, pOJOPropertyBuilder);
        
        POJOPropertyBuilder actual = pOJOPropertiesCollector._property(((Map) linkedHashMap), ((String) null));
        
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder expected = new POJOPropertyBuilder(null, null, false, propertyName, propertyName);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        MapperConfig actual_config = actual._config;
        assertNull(actual_config);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        PropertyName expected_name = expected._name;
        PropertyName actual_name = actual._name;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_internalName = expected._internalName;
        PropertyName actual_internalName = actual._internalName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_internalName, actual_internalName);
        
        POJOPropertyBuilder.Linked actual_fields = actual._fields;
        assertNull(actual_fields);
        
        POJOPropertyBuilder.Linked actual_ctorParameters = actual._ctorParameters;
        assertNull(actual_ctorParameters);
        
        POJOPropertyBuilder.Linked actual_getters = actual._getters;
        assertNull(actual_getters);
        
        POJOPropertyBuilder.Linked actual_setters = actual._setters;
        assertNull(actual_setters);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _property(java.util.Map, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_property(java.util.Map,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: POJOPropertyBuilder prop = props.get(implName);
 *  */
    @Test
    public void test_property_ThrowNullPointerException1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._property] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._property(POJOPropertiesCollector.java:1022) */
        pOJOPropertiesCollector._property(((Map) null), ((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _property(java.util.Map, java.lang.String)
    
    @Test
    public void test_property3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        
        POJOPropertyBuilder actual = pOJOPropertiesCollector._property(((Map) linkedHashMap), string);
        
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder expected = new POJOPropertyBuilder(null, null, false, propertyName, propertyName);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        MapperConfig actual_config = actual._config;
        assertNull(actual_config);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        PropertyName expected_name = expected._name;
        PropertyName actual_name = actual._name;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_internalName = expected._internalName;
        PropertyName actual_internalName = actual._internalName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_internalName, actual_internalName);
        
        POJOPropertyBuilder.Linked actual_fields = actual._fields;
        assertNull(actual_fields);
        
        POJOPropertyBuilder.Linked actual_ctorParameters = actual._ctorParameters;
        assertNull(actual_ctorParameters);
        
        POJOPropertyBuilder.Linked actual_getters = actual._getters;
        assertNull(actual_getters);
        
        POJOPropertyBuilder.Linked actual_setters = actual._setters;
        assertNull(actual_setters);
        
    }
    
    @Test
    public void test_property4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000";
        
        POJOPropertyBuilder actual = pOJOPropertiesCollector._property(((Map) linkedHashMap), string);
        
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", string);
        POJOPropertyBuilder expected = new POJOPropertyBuilder(null, null, false, propertyName, propertyName);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        MapperConfig actual_config = actual._config;
        assertNull(actual_config);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        PropertyName expected_name = expected._name;
        PropertyName actual_name = actual._name;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_internalName = expected._internalName;
        PropertyName actual_internalName = actual._internalName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_internalName, actual_internalName);
        
        POJOPropertyBuilder.Linked actual_fields = actual._fields;
        assertNull(actual_fields);
        
        POJOPropertyBuilder.Linked actual_ctorParameters = actual._ctorParameters;
        assertNull(actual_ctorParameters);
        
        POJOPropertyBuilder.Linked actual_getters = actual._getters;
        assertNull(actual_getters);
        
        POJOPropertyBuilder.Linked actual_setters = actual._setters;
        assertNull(actual_setters);
        
    }
    
    @Test
    public void test_property5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null, null);
        
        POJOPropertyBuilder actual = pOJOPropertiesCollector._property(((Map) linkedHashMap), ((String) null));
        
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder expected = new POJOPropertyBuilder(_config, _annotationIntrospector, false, propertyName, propertyName);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        LinkedNode actual_config_problemHandlers = ((LinkedNode) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_problemHandlers"));
        assertNull(actual_config_problemHandlers);
        
        JsonNodeFactory actual_config_nodeFactory = ((JsonNodeFactory) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory"));
        assertNull(actual_config_nodeFactory);
        
        int expected_config_deserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        int actual_config_deserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        assertEquals(expected_config_deserFeatures, actual_config_deserFeatures);
        
        int expected_config_parserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        int actual_config_parserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        assertEquals(expected_config_parserFeatures, actual_config_parserFeatures);
        
        int expected_config_parserFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        int actual_config_parserFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        assertEquals(expected_config_parserFeaturesToChange, actual_config_parserFeaturesToChange);
        
        int expected_config_formatReadFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        int actual_config_formatReadFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        assertEquals(expected_config_formatReadFeatures, actual_config_formatReadFeatures);
        
        int expected_config_formatReadFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        int actual_config_formatReadFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        assertEquals(expected_config_formatReadFeaturesToChange, actual_config_formatReadFeaturesToChange);
        
        SimpleMixInResolver actual_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
        assertNull(actual_config_mixIns);
        
        SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_config_subtypeResolver);
        
        PropertyName actual_config_rootName = ((PropertyName) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_config_rootName);
        
        Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_config_view);
        
        ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_config_attributes);
        
        RootNameLookup actual_config_rootNames = ((RootNameLookup) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootNames"));
        assertNull(actual_config_rootNames);
        
        ConfigOverrides actual_config_configOverrides = ((ConfigOverrides) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        assertNull(actual_config_configOverrides);
        
        int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
        
        BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        assertNull(actual_config_base);
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        LRUMap actual_annotationIntrospector_annotationsInside = ((LRUMap) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_annotationsInside"));
        assertNull(actual_annotationIntrospector_annotationsInside);
        
        boolean actual_annotationIntrospector_cfgConstructorPropertiesImpliesCreator = ((Boolean) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_cfgConstructorPropertiesImpliesCreator"));
        assertFalse(actual_annotationIntrospector_cfgConstructorPropertiesImpliesCreator);
        
        PropertyName expected_name = expected._name;
        PropertyName actual_name = actual._name;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_internalName = expected._internalName;
        PropertyName actual_internalName = actual._internalName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_internalName, actual_internalName);
        
        POJOPropertyBuilder.Linked actual_fields = actual._fields;
        assertNull(actual_fields);
        
        POJOPropertyBuilder.Linked actual_ctorParameters = actual._ctorParameters;
        assertNull(actual_ctorParameters);
        
        POJOPropertyBuilder.Linked actual_getters = actual._getters;
        assertNull(actual_getters);
        
        POJOPropertyBuilder.Linked actual_setters = actual._setters;
        assertNull(actual_setters);
        
    }
    
    @Test
    public void test_property6() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null);
        linkedHashMap.put(null, pOJOPropertyBuilder);
        String string = "\u0000";
        
        POJOPropertyBuilder actual = pOJOPropertiesCollector._property(((Map) linkedHashMap), string);
        
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(null, null);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "\u0000";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        POJOPropertyBuilder expected = new POJOPropertyBuilder(_config, annotationIntrospectorPair, false, propertyName, propertyName);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        MapperConfig expected_config = expected._config;
        MapperConfig actual_config = actual._config;
        LinkedNode actual_config_problemHandlers = ((LinkedNode) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_problemHandlers"));
        assertNull(actual_config_problemHandlers);
        
        JsonNodeFactory actual_config_nodeFactory = ((JsonNodeFactory) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_nodeFactory"));
        assertNull(actual_config_nodeFactory);
        
        int expected_config_deserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        int actual_config_deserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_deserFeatures"));
        assertEquals(expected_config_deserFeatures, actual_config_deserFeatures);
        
        int expected_config_parserFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        int actual_config_parserFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeatures"));
        assertEquals(expected_config_parserFeatures, actual_config_parserFeatures);
        
        int expected_config_parserFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        int actual_config_parserFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_parserFeaturesToChange"));
        assertEquals(expected_config_parserFeaturesToChange, actual_config_parserFeaturesToChange);
        
        int expected_config_formatReadFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        int actual_config_formatReadFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeatures"));
        assertEquals(expected_config_formatReadFeatures, actual_config_formatReadFeatures);
        
        int expected_config_formatReadFeaturesToChange = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        int actual_config_formatReadFeaturesToChange = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.DeserializationConfig", "_formatReadFeaturesToChange"));
        assertEquals(expected_config_formatReadFeaturesToChange, actual_config_formatReadFeaturesToChange);
        
        SimpleMixInResolver actual_config_mixIns = ((SimpleMixInResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_mixIns"));
        assertNull(actual_config_mixIns);
        
        SubtypeResolver actual_config_subtypeResolver = ((SubtypeResolver) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_subtypeResolver"));
        assertNull(actual_config_subtypeResolver);
        
        PropertyName actual_config_rootName = ((PropertyName) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootName"));
        assertNull(actual_config_rootName);
        
        Class actual_config_view = ((Class) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_view"));
        assertNull(actual_config_view);
        
        ContextAttributes actual_config_attributes = ((ContextAttributes) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_attributes"));
        assertNull(actual_config_attributes);
        
        RootNameLookup actual_config_rootNames = ((RootNameLookup) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_rootNames"));
        assertNull(actual_config_rootNames);
        
        ConfigOverrides actual_config_configOverrides = ((ConfigOverrides) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfigBase", "_configOverrides"));
        assertNull(actual_config_configOverrides);
        
        int expected_config_mapperFeatures = ((Integer) getFieldValue(expected_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        int actual_config_mapperFeatures = ((Integer) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures"));
        assertEquals(expected_config_mapperFeatures, actual_config_mapperFeatures);
        
        BaseSettings actual_config_base = ((BaseSettings) getFieldValue(actual_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base"));
        assertNull(actual_config_base);
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector_primary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary"));
        assertNull(actual_annotationIntrospector_primary);
        
        AnnotationIntrospector actual_annotationIntrospector_secondary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary"));
        assertNull(actual_annotationIntrospector_secondary);
        
        PropertyName expected_name = expected._name;
        PropertyName actual_name = actual._name;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_internalName = expected._internalName;
        PropertyName actual_internalName = actual._internalName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_internalName, actual_internalName);
        
        POJOPropertyBuilder.Linked actual_fields = actual._fields;
        assertNull(actual_fields);
        
        POJOPropertyBuilder.Linked actual_ctorParameters = actual._ctorParameters;
        assertNull(actual_ctorParameters);
        
        POJOPropertyBuilder.Linked actual_getters = actual._getters;
        assertNull(actual_getters);
        
        POJOPropertyBuilder.Linked actual_setters = actual._setters;
        assertNull(actual_setters);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameUsing
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _renameUsing(java.util.Map, com.fasterxml.jackson.databind.PropertyNamingStrategy)
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#_renameUsing(java.util.Map,com.fasterxml.jackson.databind.PropertyNamingStrategy)}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: POJOPropertyBuilder[] props = propMap.values().toArray(new POJOPropertyBuilder[propMap.size()]);
 *  */
    @Test
    public void test_renameUsing_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameUsing] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameUsing(POJOPropertiesCollector.java:816) */
        pOJOPropertiesCollector._renameUsing(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _renameUsing(java.util.Map, com.fasterxml.jackson.databind.PropertyNamingStrategy)
    
    @Test
    public void test_renameUsing1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        pOJOPropertiesCollector._renameUsing(linkedHashMap, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _renameUsing(java.util.Map, com.fasterxml.jackson.databind.PropertyNamingStrategy)
    
    @Test
    public void test_renameUsing2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        POJOPropertyBuilder pOJOPropertyBuilder = new POJOPropertyBuilder(null, null);
        linkedHashMap.put(string, pOJOPropertyBuilder);
        String string1 = "\u0000\b\b\b\b\b\b\b\b\b";
        linkedHashMap.put(string1, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameUsing] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameUsing(POJOPropertiesCollector.java:819) */
        pOJOPropertiesCollector._renameUsing(linkedHashMap, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collect
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method collect()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#collect()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCollect_Return() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        POJOPropertiesCollector actual = pOJOPropertiesCollector.collect();
        
        MapperConfig actual_config = actual._config;
        assertNull(actual_config);
        
        boolean actual_forSerialization = actual._forSerialization;
        assertFalse(actual_forSerialization);
        
        boolean actual_stdBeanNaming = actual._stdBeanNaming;
        assertFalse(actual_stdBeanNaming);
        
        JavaType actual_type = actual._type;
        assertNull(actual_type);
        
        AnnotatedClass actual_classDef = actual._classDef;
        assertNull(actual_classDef);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        String actual_mutatorPrefix = actual._mutatorPrefix;
        assertNull(actual_mutatorPrefix);
        
        boolean actual_collected = actual._collected;
        assertFalse(actual_collected);
        
        LinkedHashMap actual_properties = actual._properties;
        assertNull(actual_properties);
        
        LinkedList actual_creatorProperties = actual._creatorProperties;
        assertNull(actual_creatorProperties);
        
        LinkedList actual_anyGetters = actual._anyGetters;
        assertNull(actual_anyGetters);
        
        LinkedList actual_anySetters = actual._anySetters;
        assertNull(actual_anySetters);
        
        LinkedList actual_anySetterField = actual._anySetterField;
        assertNull(actual_anySetterField);
        
        LinkedList actual_jsonValueGetters = actual._jsonValueGetters;
        assertNull(actual_jsonValueGetters);
        
        HashSet actual_ignoredPropertyNames = actual._ignoredPropertyNames;
        assertNull(actual_ignoredPropertyNames);
        
        LinkedHashMap actual_injectables = actual._injectables;
        assertNull(actual_injectables);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getProperties()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getProperties()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getPropertyMap()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ArrayList<BeanPropertyDefinition>(props.values());
 *  */
    @Test
    public void testGetProperties_ThrowNullPointerException() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:159) */
        pOJOPropertiesCollector.getProperties();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getProperties()
    
    @Test
    public void testGetProperties1() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        pOJOPropertiesCollector._collected = true;
        LinkedHashMap _properties = new LinkedHashMap();
        pOJOPropertiesCollector._properties = _properties;
        
        ArrayList actual = ((ArrayList) pOJOPropertiesCollector.getProperties());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getProperties()
    
    @Test(expected = StackOverflowError.class)
    public void testGetProperties2() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _type);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetProperties3() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_type, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _type);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test
    public void testGetProperties4() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:158) */
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test
    public void testGetProperties5() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 2048);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:370)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:158) */
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test
    public void testGetProperties6() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:158) */
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test
    public void testGetProperties7() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ResolvedRecursiveType _type = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:158) */
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test
    public void testGetProperties8() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        SimpleType _type = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveMemberMethods(AnnotatedClass.java:557)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.memberMethods(AnnotatedClass.java:330)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addMethods(POJOPropertiesCollector.java:511)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:302)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:158) */
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test
    public void testGetProperties9() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException] */
        pOJOPropertiesCollector.getProperties();
    }
    
    @Test
    public void testGetProperties10() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 4096);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_config", _config);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_forSerialization", true);
        AnnotatedClass _classDef = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ArrayList _fields = new ArrayList();
        _fields.add(null);
        _fields.add(null);
        _fields.add(null);
        setField(_classDef, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_fields", _fields);
        setField(pOJOPropertiesCollector, "com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector", "_classDef", _classDef);
        
        /* This test fails because method [com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._addFields(POJOPropertiesCollector.java:373)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.collectAll(POJOPropertiesCollector.java:301)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getPropertyMap(POJOPropertiesCollector.java:266)
            com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getProperties(POJOPropertiesCollector.java:158) */
        pOJOPropertiesCollector.getProperties();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector.getType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getType()
    
    /**
    @utbot.classUnderTest {@link POJOPropertiesCollector}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector#getType()}
 * @utbot.returnsFrom {@code return _type;}
 *  */
    @Test
    public void testGetType_Return_type() throws Exception  {
        POJOPropertiesCollector pOJOPropertiesCollector = ((POJOPropertiesCollector) createInstance("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        
        JavaType actual = pOJOPropertiesCollector.getType();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1082171752310199 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1082171752310199.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1082171752318800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082171752310199.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082171752318800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1082171752874899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082171752874899.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082171752877099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082171752874899.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082171752877099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1082171753676200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082171753676200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082171753678100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082171753676200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082171753678100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1082171754132699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1082171754132699.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1082171754134600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1082171754132699.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1082171754134600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

