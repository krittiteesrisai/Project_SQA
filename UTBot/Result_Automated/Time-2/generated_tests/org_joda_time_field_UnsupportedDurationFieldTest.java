package org.joda.time.field;

import org.junit.Test;
import org.joda.time.DurationField;
import java.util.HashMap;
import java.lang.reflect.Method;
import org.joda.time.DurationFieldType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_joda_time_field_UnsupportedDurationFieldTest {
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getName()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getName()}
 * @utbot.returnsFrom {@code return iType.getName();}
 *  */
    @Test
    public void testGetName_DurationFieldTypeGetName() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        
        String actual = unsupportedDurationField.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getName()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iType.getName();
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        /* This test fails because method [org.joda.time.field.UnsupportedDurationField.getName] produces [java.lang.NullPointerException]
            org.joda.time.field.UnsupportedDurationField.getName(UnsupportedDurationField.java:83) */
        unsupportedDurationField.getName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(long, long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#add(long,long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_ThrowUnsupportedOperationException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.add(-255L, -255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(long, int)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#add(long,int)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAdd_ThrowUnsupportedOperationException1() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.add(-255L, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        boolean actual = unsupportedDurationField.equals(unsupportedDurationField);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof UnsupportedDurationField): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjNotInstanceOfUnsupportedDurationField() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        boolean actual = unsupportedDurationField.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof UnsupportedDurationField): True}
 * @utbot.executesCondition {@code (other.getName() == null): True}
 * @utbot.returnsFrom {@code return (getName() == null);}
 *  */
    @Test
    public void testEquals_GetNameNotEqualsNull() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        String iName = "";
        setField(iType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", iType1);
        
        boolean actual = unsupportedDurationField.equals(unsupportedDurationField1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof UnsupportedDurationField): True}
 * @utbot.executesCondition {@code (other.getName() == null): True}
 * @utbot.returnsFrom {@code return (getName() == null);}
 *  */
    @Test
    public void testEquals_GetNameEqualsNull() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        
        boolean actual = unsupportedDurationField.equals(unsupportedDurationField1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof UnsupportedDurationField): True}
 * @utbot.executesCondition {@code (other.getName() == null): False}
 * @utbot.invokes {@link org.joda.time.field.UnsupportedDurationField#getName()}
 * @utbot.invokes {@link org.joda.time.field.UnsupportedDurationField#getName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (other.getName().equals(getName()));}
 *  */
    @Test
    public void testEquals_OtherGetNameNotEqualsNull() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        String iName = "";
        setField(iType1, "org.joda.time.DurationFieldType", "iName", iName);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", iType1);
        
        boolean actual = unsupportedDurationField.equals(unsupportedDurationField1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.field.UnsupportedDurationField#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "UnsupportedDurationField[" + getName() + ']';}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        
        String actual = unsupportedDurationField.toString();
        
        String expected = "UnsupportedDurationField[null]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#hashCode()}
 * @utbot.invokes {@link org.joda.time.field.UnsupportedDurationField#getName()}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return getName().hashCode();}
 *  */
    @Test
    public void testHashCode_StringHashCode() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        String iName = " ";
        setField(iType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        
        int actual = unsupportedDurationField.hashCode();
        
        assertEquals(32, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#hashCode()}
 * @utbot.invokes {@link org.joda.time.field.UnsupportedDurationField#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getName().hashCode();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.UnsupportedDurationField.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.field.UnsupportedDurationField.hashCode(UnsupportedDurationField.java:256) */
        unsupportedDurationField.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.compareTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareTo(org.joda.time.DurationField)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#compareTo(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testCompareTo_ReturnZero() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        int actual = unsupportedDurationField.compareTo(((DurationField) null));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(long, long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getValue(long,long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_ThrowUnsupportedOperationException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getValue(-255L, -255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getValue(long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetValue_ThrowUnsupportedOperationException1() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getValue(-255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(org.joda.time.DurationFieldType)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getInstance(org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (cCache == null): True}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.invokes {@link java.util.HashMap#put(java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testGetInstance_FieldEqualsNull() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            setStaticField(unsupportedDurationFieldClazz, "cCache", null);
            
            UnsupportedDurationField actual = UnsupportedDurationField.getInstance(null);
            
            UnsupportedDurationField expected = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            HashMap cCache = new HashMap();
            cCache.put(null, expected);
            setField(expected, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getInstance(org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (cCache == null): False}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testGetInstance_FieldNotEqualsNull_1() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            HashMap cCache = new HashMap();
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(standardDurationFieldType, unsupportedDurationField);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            
            Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
            Method getInstanceMethod = unsupportedDurationFieldClazz.getDeclaredMethod("getInstance", standardDurationFieldTypeType);
            getInstanceMethod.setAccessible(true);
            java.lang.Object[] getInstanceMethodArguments = new java.lang.Object[1];
            getInstanceMethodArguments[0] = standardDurationFieldType;
            UnsupportedDurationField actual = ((UnsupportedDurationField) getInstanceMethod.invoke(null, getInstanceMethodArguments));
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(unsupportedDurationField, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getInstance(org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (cCache == null): False}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testGetInstance_FieldNotEqualsNull_2() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            HashMap cCache = new HashMap();
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(standardDurationFieldType, unsupportedDurationField);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            
            Class standardDurationFieldType1Type = Class.forName("org.joda.time.DurationFieldType");
            Method getInstanceMethod = unsupportedDurationFieldClazz.getDeclaredMethod("getInstance", standardDurationFieldType1Type);
            getInstanceMethod.setAccessible(true);
            java.lang.Object[] getInstanceMethodArguments = new java.lang.Object[1];
            getInstanceMethodArguments[0] = standardDurationFieldType1;
            UnsupportedDurationField actual = ((UnsupportedDurationField) getInstanceMethod.invoke(null, getInstanceMethodArguments));
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(unsupportedDurationField, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getInstance(org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (cCache == null): False}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testGetInstance_FieldNotEqualsNull() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            HashMap cCache = new HashMap();
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(null, unsupportedDurationField);
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            cCache.put(standardDurationFieldType, unsupportedDurationField);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            
            UnsupportedDurationField actual = UnsupportedDurationField.getInstance(null);
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(unsupportedDurationField, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getType()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getType()}
 * @utbot.returnsFrom {@code return iType;}
 *  */
    @Test
    public void testGetType_ReturnIType() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        DurationFieldType actual = unsupportedDurationField.getType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.unsupported
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unsupported()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#unsupported()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return new UnsupportedOperationException(iType + " field is unsupported");}
 *  */
    @Test
    public void testUnsupported_StringBuilderToString() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Method unsupportedMethod = unsupportedDurationFieldClazz.getDeclaredMethod("unsupported");
        unsupportedMethod.setAccessible(true);
        java.lang.Object[] unsupportedMethodArguments = new java.lang.Object[0];
        UnsupportedOperationException actual = ((UnsupportedOperationException) unsupportedMethod.invoke(unsupportedDurationField, unsupportedMethodArguments));
        
        UnsupportedOperationException expected = ((UnsupportedOperationException) createInstance("java.lang.UnsupportedOperationException"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#readResolve()}
 * @utbot.returnsFrom {@code return getInstance(iType);}
 *  */
    @Test
    public void testReadResolve_ReturnGetInstance() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            setStaticField(unsupportedDurationFieldClazz, "cCache", null);
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
            
            Method readResolveMethod = unsupportedDurationFieldClazz.getDeclaredMethod("readResolve");
            readResolveMethod.setAccessible(true);
            java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
            UnsupportedDurationField actual = ((UnsupportedDurationField) readResolveMethod.invoke(unsupportedDurationField, readResolveMethodArguments));
            
            UnsupportedDurationField expected = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            HashMap cCache = new HashMap();
            cCache.put(iType, expected);
            setField(expected, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
            setField(expected, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#readResolve()}
 * @utbot.returnsFrom {@code return getInstance(iType);}
 *  */
    @Test
    public void testReadResolve_ReturnGetInstance_1() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            HashMap cCache = new HashMap();
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(standardDurationFieldType, unsupportedDurationField);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
            
            Method readResolveMethod = unsupportedDurationFieldClazz.getDeclaredMethod("readResolve");
            readResolveMethod.setAccessible(true);
            java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
            UnsupportedDurationField actual = ((UnsupportedDurationField) readResolveMethod.invoke(unsupportedDurationField1, readResolveMethodArguments));
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(unsupportedDurationField, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#readResolve()}
 * @utbot.returnsFrom {@code return getInstance(iType);}
 *  */
    @Test
    public void testReadResolve_ReturnGetInstance_2() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            HashMap cCache = new HashMap();
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(standardDurationFieldType, unsupportedDurationField);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(iType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
            
            Method readResolveMethod = unsupportedDurationFieldClazz.getDeclaredMethod("readResolve");
            readResolveMethod.setAccessible(true);
            java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
            UnsupportedDurationField actual = ((UnsupportedDurationField) readResolveMethod.invoke(unsupportedDurationField1, readResolveMethodArguments));
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(unsupportedDurationField, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#readResolve()}
 * @utbot.returnsFrom {@code return getInstance(iType);}
 *  */
    @Test
    public void testReadResolve_ReturnGetInstance_3() throws Exception  {
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            HashMap cCache = new HashMap();
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(null, unsupportedDurationField);
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            cCache.put(standardDurationFieldType, unsupportedDurationField);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            
            Method readResolveMethod = unsupportedDurationFieldClazz.getDeclaredMethod("readResolve");
            readResolveMethod.setAccessible(true);
            java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
            UnsupportedDurationField actual = ((UnsupportedDurationField) readResolveMethod.invoke(unsupportedDurationField1, readResolveMethodArguments));
            
            // org.joda.time.field.UnsupportedDurationField has overridden equals method
            assertEquals(unsupportedDurationField, actual);
        } finally {
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.isSupported
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupported()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#isSupported()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsSupported_ReturnFalse() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        boolean actual = unsupportedDurationField.isSupported();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getMillis
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMillis(long, long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getMillis(long,long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_ThrowUnsupportedOperationException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getMillis(-255L, -255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getMillis
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMillis(int)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getMillis(int)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_ThrowUnsupportedOperationException1() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getMillis(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getMillis
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMillis(long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getMillis(long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_ThrowUnsupportedOperationException2() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getMillis(-255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getMillis
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMillis(int, long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getMillis(int,long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillis_ThrowUnsupportedOperationException3() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getMillis(-255, -255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValueAsLong(long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getValueAsLong(long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_ThrowUnsupportedOperationException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getValueAsLong(-255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getValueAsLong
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValueAsLong(long, long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getValueAsLong(long,long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong_ThrowUnsupportedOperationException1() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getValueAsLong(-255L, -255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.isPrecise
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPrecise()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#isPrecise()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsPrecise_ReturnTrue() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        boolean actual = unsupportedDurationField.isPrecise();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getDifference
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDifference(long, long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getDifference(long,long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference_ThrowUnsupportedOperationException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getDifference(-255L, -255L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getUnitMillis
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUnitMillis()
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getUnitMillis()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetUnitMillis_ReturnZero() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        long actual = unsupportedDurationField.getUnitMillis();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.UnsupportedDurationField.getDifferenceAsLong
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDifferenceAsLong(long, long)
    
    /**
    @utbot.classUnderTest {@link UnsupportedDurationField}
 * @utbot.methodUnderTest {@link org.joda.time.field.UnsupportedDurationField#getDifferenceAsLong(long,long)}
 * @utbot.invokes org.joda.time.field.UnsupportedDurationField#unsupported()
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw unsupported();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong_ThrowUnsupportedOperationException() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        unsupportedDurationField.getDifferenceAsLong(-255L, -255L);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1050194218879299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1050194218879299.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1050194218894100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050194218879299.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050194218894100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1050194219684799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050194219684799.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050194219690900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050194219684799.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050194219690900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1050194220564500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050194220564500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050194220571799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050194220564500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050194220571799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

