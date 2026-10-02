package org.joda.time.base;

import org.junit.Test;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.DurationFieldType;
import java.lang.reflect.Method;
import org.joda.time.DateMidnight;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.DateTimeUtils;
import org.joda.time.Weeks;
import org.joda.time.Days;
import org.joda.time.Seconds;
import org.joda.time.Minutes;
import org.joda.time.Hours;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public final class org_joda_time_base_BasePeriodTest {
    ///region Test suites for executable org.joda.time.base.BasePeriod.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#getValue(int)}
 * @utbot.returnsFrom {@code return iValues[index];}
 *  */
    @Test
    public void testGetValue_ReturnIndexOfIValues() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        int[] iValues = {-255, -255};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        int actual = mutablePeriod.getValue(1);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iValues[index];
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        int[] iValues = {-255};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335) */
        mutablePeriod.getValue(-256);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iValues[index];
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.getValue] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335) */
        mutablePeriod.getValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#size()}
 * @utbot.invokes {@link org.joda.time.PeriodType#size()}
 * @utbot.returnsFrom {@code return iType.size();}
 *  */
    @Test
    public void testSize_PeriodTypeSize() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        int actual = period.size();
        
        assertEquals(1, actual);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        
        assertNull(finalPeriodITypeITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#size()}
 * @utbot.invokes {@link org.joda.time.PeriodType#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iType.size();
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.size] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.size(BasePeriod.java:313) */
        mutablePeriod.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(int, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setValue(int,int)}
 *  */
    @Test
    public void testSetValue() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        int[] iValues = {-255, -255};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        period.setValue(1, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(int, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setValue(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iValues[index] = value;
 *  */
    @Test
    public void testSetValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        int[] iValues = {-255};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.base.BasePeriod.setValue(BasePeriod.java:608) */
        period.setValue(-256, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setValue(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iValues[index] = value;
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setValue] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.setValue(BasePeriod.java:608) */
        period.setValue(-255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.getFieldType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#getFieldType(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#getFieldType(int)}
 * @utbot.returnsFrom {@code return iType.getFieldType(index);}
 *  */
    @Test
    public void testGetFieldType_PeriodTypeGetFieldType() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        DurationFieldType actual = period.getFieldType(1);
        
        assertNull(actual);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes1 = ((DurationFieldType) get(periodIType1ITypeITypes, 1));
        
        assertNull(finalPeriodITypeITypes0);
        
        assertNull(finalPeriodITypeITypes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#getFieldType(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#getFieldType(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iType.getFieldType(index);
 *  */
    @Test
    public void testGetFieldType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.getFieldType] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.PeriodType.getFieldType(PeriodType.java:628)
            org.joda.time.base.BasePeriod.getFieldType(BasePeriod.java:324) */
        period.getFieldType(-256);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#getFieldType(int)}
 * @utbot.invokes {@link org.joda.time.PeriodType#getFieldType(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iType.getFieldType(index);
 *  */
    @Test
    public void testGetFieldType_ThrowNullPointerException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.getFieldType] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.getFieldType(BasePeriod.java:324) */
        mutablePeriod.getFieldType(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValues([I)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setValues(int[])}
 *  */
    @Test
    public void testSetValues() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        int[] iValues = {-255};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        mutablePeriod.setValues(null);
        
        int[] finalMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertNull(finalMutablePeriodIValues);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setField(org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testSetField() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        period.setField(null, -255);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        
        assertNull(finalPeriodITypeITypes0);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setField(org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testSetField_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method setFieldMethod = basePeriodClazz.getDeclaredMethod("setField", standardDurationFieldTypeType, intType);
        setFieldMethod.setAccessible(true);
        java.lang.Object[] setFieldMethodArguments = new java.lang.Object[2];
        setFieldMethodArguments[0] = standardDurationFieldType;
        setFieldMethodArguments[1] = 0;
        setFieldMethod.invoke(mutablePeriod, setFieldMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setField(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setFieldInto(iValues, field, value);
 *  */
    @Test
    public void testSetField_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.setFieldInto(BasePeriod.java:498)
            org.joda.time.base.BasePeriod.setField(BasePeriod.java:479) */
        mutablePeriod.setField(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setField(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setFieldInto(iValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetField_ThrowIllegalArgumentException_1() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method setFieldMethod = basePeriodClazz.getDeclaredMethod("setField", standardDurationFieldTypeType, intType);
        setFieldMethod.setAccessible(true);
        java.lang.Object[] setFieldMethodArguments = new java.lang.Object[2];
        setFieldMethodArguments[0] = standardDurationFieldType;
        setFieldMethodArguments[1] = -255;
        try {
            setFieldMethod.invoke(mutablePeriod, setFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setField(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setFieldInto(iValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetField_ThrowIllegalArgumentException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        period.setField(null, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.toDurationFrom
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toDurationFrom(org.joda.time.ReadableInstant)
    
    @Test
    public void testToDurationFrom1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        
        Duration actual = mutablePeriod.toDurationFrom(dateMidnight);
        
        Duration expected = new Duration(0L);
        
        long expectedIMillis = ((Long) getFieldValue(expected, "org.joda.time.base.BaseDuration", "iMillis"));
        long actualIMillis = ((Long) getFieldValue(actual, "org.joda.time.base.BaseDuration", "iMillis"));
        assertEquals(expectedIMillis, actualIMillis);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toDurationFrom(org.joda.time.ReadableInstant)
    
    @Test
    public void testToDurationFrom2() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Instant instant = new Instant(0L);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.toDurationFrom] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.size(BasePeriod.java:313)
            org.joda.time.chrono.BaseChronology.add(BaseChronology.java:302)
            org.joda.time.base.BasePeriod.toDurationFrom(BasePeriod.java:358) */
        mutablePeriod.toDurationFrom(instant);
    }
    
    @Test
    public void testToDurationFrom3() throws Exception  {
        Class dateTimeUtilsClazz = Class.forName("org.joda.time.DateTimeUtils");
        DateTimeUtils.MillisProvider prevCMillisProvider = ((DateTimeUtils.MillisProvider) getStaticFieldValue(dateTimeUtilsClazz, "cMillisProvider"));
        try {
            Object cMillisProvider = createInstance("org.joda.time.DateTimeUtils$SystemMillisProvider");
            setStaticField(dateTimeUtilsClazz, "cMillisProvider", cMillisProvider);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            /* This test fails because method [org.joda.time.base.BasePeriod.toDurationFrom] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.size(BasePeriod.java:313)
                org.joda.time.chrono.BaseChronology.add(BaseChronology.java:302)
                org.joda.time.base.BasePeriod.toDurationFrom(BasePeriod.java:358) */
            mutablePeriod.toDurationFrom(null);
        } finally {
            setStaticField(DateTimeUtils.class, "cMillisProvider", prevCMillisProvider);
        }
    }
    
    @Test
    public void testToDurationFrom4() throws Exception  {
        Class dateTimeUtilsClazz = Class.forName("org.joda.time.DateTimeUtils");
        DateTimeUtils.MillisProvider prevCMillisProvider = ((DateTimeUtils.MillisProvider) getStaticFieldValue(dateTimeUtilsClazz, "cMillisProvider"));
        try {
            Object cMillisProvider = createInstance("org.joda.time.DateTimeUtils$OffsetMillisProvider");
            setField(cMillisProvider, "org.joda.time.DateTimeUtils$OffsetMillisProvider", "iMillis", 0L);
            setStaticField(dateTimeUtilsClazz, "cMillisProvider", cMillisProvider);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            /* This test fails because method [org.joda.time.base.BasePeriod.toDurationFrom] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.size(BasePeriod.java:313)
                org.joda.time.chrono.BaseChronology.add(BaseChronology.java:302)
                org.joda.time.base.BasePeriod.toDurationFrom(BasePeriod.java:358) */
            mutablePeriod.toDurationFrom(null);
        } finally {
            setStaticField(DateTimeUtils.class, "cMillisProvider", prevCMillisProvider);
        }
    }
    
    @Test
    public void testToDurationFrom5() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.toDurationFrom] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.chrono.BaseChronology.add(BaseChronology.java:303)
            org.joda.time.base.BasePeriod.toDurationFrom(BasePeriod.java:358) */
        mutablePeriod.toDurationFrom(dateMidnight);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.getPeriodType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPeriodType()
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#getPeriodType()}
 * @utbot.returnsFrom {@code return iType;}
 *  */
    @Test
    public void testGetPeriodType_ReturnIType() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        PeriodType actual = mutablePeriod.getPeriodType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.checkPeriodType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPeriodType(org.joda.time.PeriodType)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkPeriodType(org.joda.time.PeriodType)}
 * @utbot.returnsFrom {@code return DateTimeUtils.getPeriodType(type);}
 *  */
    @Test
    public void testCheckPeriodType_ReturnDateTimeUtilsGetPeriodType_1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            PeriodType actual = mutablePeriod.checkPeriodType(null);
            
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(cStandard, actual);
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkPeriodType(org.joda.time.PeriodType)}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#months()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#weeks()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#days()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#hours()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#minutes()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#seconds()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#millis()}
 * @utbot.returnsFrom {@code return DateTimeUtils.getPeriodType(type);}
 *  */
    @Test
    public void testCheckPeriodType_ReturnDateTimeUtilsGetPeriodType_2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMILLIS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MILLIS_TYPE"));
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            Object millisType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(millisType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName = "millis";
            setField(millisType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MILLIS_TYPE", millisType);
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName1 = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName2 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName3 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName4 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName4);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName5 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName5);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName6 = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName6);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName7 = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName7);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            PeriodType actual = mutablePeriod.checkPeriodType(null);
            
            PeriodType expected = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(expected, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(expected, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(expected, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(expected, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(expected, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(expected, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(expected, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(expected, "org.joda.time.PeriodType", "cStandard", expected);
            String iName8 = "Standard";
            setField(expected, "org.joda.time.PeriodType", "iName", iName8);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[8];
            iTypes[0] = ((DurationFieldType) yearsType);
            iTypes[1] = ((DurationFieldType) monthsType);
            iTypes[2] = ((DurationFieldType) weeksType);
            iTypes[3] = ((DurationFieldType) daysType);
            iTypes[4] = ((DurationFieldType) hoursType);
            iTypes[5] = ((DurationFieldType) minutesType);
            iTypes[6] = ((DurationFieldType) secondsType);
            iTypes[7] = ((DurationFieldType) millisType);
            setField(expected, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {0, 1, 2, 3, 4, 5, 6, 7};
            setField(expected, "org.joda.time.PeriodType", "iIndices", iIndices);
            
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
            setStaticField(DurationFieldType.class, "MILLIS_TYPE", prevMILLIS_TYPE);
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkPeriodType(org.joda.time.PeriodType)}
 * @utbot.returnsFrom {@code return DateTimeUtils.getPeriodType(type);}
 *  */
    @Test
    public void testCheckPeriodType_ReturnDateTimeUtilsGetPeriodType() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType periodType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        
        PeriodType actual = mutablePeriod.checkPeriodType(periodType);
        
        // org.joda.time.PeriodType has overridden equals method
        assertEquals(periodType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.addPeriodInto
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addPeriodInto([I, org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#size()}
 * @utbot.returnsFrom {@code return values;}
 *  */
    @Test
    public void testAddPeriodInto_ReturnValues() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType);
        
        int[] actual = mutablePeriod.addPeriodInto(null, mutablePeriod1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPeriodInto([I, org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: values[index] = FieldUtils.safeAdd(getValue(index), value);
 *  */
    @Test
    public void testAddPeriodInto_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        int[] intArray = {};
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {-1};
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:592) */
        mutablePeriod.addPeriodInto(intArray, mutablePeriod1);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int value = period.getValue(i);
 *  */
    @Test
    public void testAddPeriodInto_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:585) */
        mutablePeriod.addPeriodInto(null, mutablePeriod);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: values[index] = FieldUtils.safeAdd(getValue(index), value);
 *  */
    @Test
    public void testAddPeriodInto_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues1 = {1};
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:592) */
        mutablePeriod.addPeriodInto(null, mutablePeriod1);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, isize = period.size(); i < isize; i++)
 *  */
    @Test
    public void testAddPeriodInto_ThrowNullPointerException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:583) */
        mutablePeriod.addPeriodInto(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values[index] = FieldUtils.safeAdd(getValue(index), value);
 *  */
    @Test
    public void testAddPeriodInto_ThrowNullPointerException_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {277151744};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {1525006534};
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:592) */
        mutablePeriod.addPeriodInto(null, mutablePeriod1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addPeriodInto([I, org.joda.time.ReadablePeriod)
    
    @Test
    public void testAddPeriodInto1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodIntoMethod = basePeriodClazz.getDeclaredMethod("addPeriodInto", intArrayType, weeksType);
        addPeriodIntoMethod.setAccessible(true);
        java.lang.Object[] addPeriodIntoMethodArguments = new java.lang.Object[2];
        addPeriodIntoMethodArguments[0] = ((Object) intArray);
        addPeriodIntoMethodArguments[1] = weeks;
        int[] actual = ((int[]) addPeriodIntoMethod.invoke(mutablePeriod, addPeriodIntoMethodArguments));
        
        assertArrayEquals(intArray, actual);
    }
    
    @Test
    public void testAddPeriodInto2() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodIntoMethod = basePeriodClazz.getDeclaredMethod("addPeriodInto", intArrayType, daysType);
        addPeriodIntoMethod.setAccessible(true);
        java.lang.Object[] addPeriodIntoMethodArguments = new java.lang.Object[2];
        addPeriodIntoMethodArguments[0] = ((Object) intArray);
        addPeriodIntoMethodArguments[1] = days;
        int[] actual = ((int[]) addPeriodIntoMethod.invoke(mutablePeriod, addPeriodIntoMethodArguments));
        
        assertArrayEquals(intArray, actual);
    }
    
    @Test
    public void testAddPeriodInto3() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodIntoMethod = basePeriodClazz.getDeclaredMethod("addPeriodInto", intArrayType, secondsType);
        addPeriodIntoMethod.setAccessible(true);
        java.lang.Object[] addPeriodIntoMethodArguments = new java.lang.Object[2];
        addPeriodIntoMethodArguments[0] = ((Object) null);
        addPeriodIntoMethodArguments[1] = seconds;
        int[] actual = ((int[]) addPeriodIntoMethod.invoke(mutablePeriod, addPeriodIntoMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testAddPeriodInto4() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodIntoMethod = basePeriodClazz.getDeclaredMethod("addPeriodInto", intArrayType, minutesType);
        addPeriodIntoMethod.setAccessible(true);
        java.lang.Object[] addPeriodIntoMethodArguments = new java.lang.Object[2];
        addPeriodIntoMethodArguments[0] = ((Object) null);
        addPeriodIntoMethodArguments[1] = minutes;
        int[] actual = ((int[]) addPeriodIntoMethod.invoke(mutablePeriod, addPeriodIntoMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testAddPeriodInto5() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodIntoMethod = basePeriodClazz.getDeclaredMethod("addPeriodInto", intArrayType, hoursType);
        addPeriodIntoMethod.setAccessible(true);
        java.lang.Object[] addPeriodIntoMethodArguments = new java.lang.Object[2];
        addPeriodIntoMethodArguments[0] = ((Object) null);
        addPeriodIntoMethodArguments[1] = hours;
        int[] actual = ((int[]) addPeriodIntoMethod.invoke(mutablePeriod, addPeriodIntoMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testAddPeriodInto6() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[11];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = new int[11];
        iValues[0] = -2147467264;
        iValues[1] = -2147467264;
        iValues[2] = 537919488;
        iValues[3] = -2147467264;
        iValues[4] = -2147467264;
        iValues[5] = -2147467264;
        iValues[6] = -2147467264;
        iValues[7] = -2147467264;
        iValues[8] = -2147467264;
        iValues[9] = -2147467264;
        iValues[10] = -2147467264;
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = new int[11];
        iValues1[2] = -1076120137;
        iValues1[3] = 3;
        iValues1[4] = 3;
        iValues1[5] = 3;
        iValues1[6] = 3;
        iValues1[7] = 3;
        iValues1[8] = 3;
        iValues1[9] = 3;
        iValues1[10] = 3;
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        int[] actual = mutablePeriod.addPeriodInto(intArray, mutablePeriod1);
        
        assertArrayEquals(intArray, actual);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes2 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 2));
        PeriodType mutablePeriodIType1 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes3 = ((DurationFieldType) get(mutablePeriodIType1ITypeITypes, 3));
        PeriodType mutablePeriodIType2 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes4 = ((DurationFieldType) get(mutablePeriodIType2ITypeITypes, 4));
        PeriodType mutablePeriodIType3 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes5 = ((DurationFieldType) get(mutablePeriodIType3ITypeITypes, 5));
        PeriodType mutablePeriodIType4 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes6 = ((DurationFieldType) get(mutablePeriodIType4ITypeITypes, 6));
        PeriodType mutablePeriodIType5 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType5, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes7 = ((DurationFieldType) get(mutablePeriodIType5ITypeITypes, 7));
        PeriodType mutablePeriodIType6 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType6, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes8 = ((DurationFieldType) get(mutablePeriodIType6ITypeITypes, 8));
        PeriodType mutablePeriodIType7 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType7, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes9 = ((DurationFieldType) get(mutablePeriodIType7ITypeITypes, 9));
        PeriodType mutablePeriodIType8 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType8ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType8, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes10 = ((DurationFieldType) get(mutablePeriodIType8ITypeITypes, 10));
        
        int finalIntArray2 = intArray[2];
        
        PeriodType mutablePeriod1IType = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1ITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes0 = ((DurationFieldType) get(mutablePeriod1ITypeITypeITypes, 0));
        PeriodType mutablePeriod1IType1 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes2 = ((DurationFieldType) get(mutablePeriod1IType1ITypeITypes, 2));
        PeriodType mutablePeriod1IType2 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes3 = ((DurationFieldType) get(mutablePeriod1IType2ITypeITypes, 3));
        PeriodType mutablePeriod1IType3 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes4 = ((DurationFieldType) get(mutablePeriod1IType3ITypeITypes, 4));
        PeriodType mutablePeriod1IType4 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes5 = ((DurationFieldType) get(mutablePeriod1IType4ITypeITypes, 5));
        PeriodType mutablePeriod1IType5 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType5, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes6 = ((DurationFieldType) get(mutablePeriod1IType5ITypeITypes, 6));
        PeriodType mutablePeriod1IType6 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType6, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes7 = ((DurationFieldType) get(mutablePeriod1IType6ITypeITypes, 7));
        PeriodType mutablePeriod1IType7 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType7, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes8 = ((DurationFieldType) get(mutablePeriod1IType7ITypeITypes, 8));
        PeriodType mutablePeriod1IType8 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType8ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType8, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes9 = ((DurationFieldType) get(mutablePeriod1IType8ITypeITypes, 9));
        PeriodType mutablePeriod1IType9 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType9ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType9, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes10 = ((DurationFieldType) get(mutablePeriod1IType9ITypeITypes, 10));
        
        assertNull(finalMutablePeriodITypeITypes2);
        
        assertNull(finalMutablePeriodITypeITypes3);
        
        assertNull(finalMutablePeriodITypeITypes4);
        
        assertNull(finalMutablePeriodITypeITypes5);
        
        assertNull(finalMutablePeriodITypeITypes6);
        
        assertNull(finalMutablePeriodITypeITypes7);
        
        assertNull(finalMutablePeriodITypeITypes8);
        
        assertNull(finalMutablePeriodITypeITypes9);
        
        assertNull(finalMutablePeriodITypeITypes10);
        
        assertEquals(537919491, finalIntArray2);
        
        assertNull(finalMutablePeriod1ITypeITypes0);
        
        assertNull(finalMutablePeriod1ITypeITypes2);
        
        assertNull(finalMutablePeriod1ITypeITypes3);
        
        assertNull(finalMutablePeriod1ITypeITypes4);
        
        assertNull(finalMutablePeriod1ITypeITypes5);
        
        assertNull(finalMutablePeriod1ITypeITypes6);
        
        assertNull(finalMutablePeriod1ITypeITypes7);
        
        assertNull(finalMutablePeriod1ITypeITypes8);
        
        assertNull(finalMutablePeriod1ITypeITypes9);
        
        assertNull(finalMutablePeriod1ITypeITypes10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPeriodInto([I, org.joda.time.ReadablePeriod)
    
    @Test
    public void testAddPeriodInto7() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[14];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = new int[14];
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[24];
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {
            0, 1, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.ArrayIndexOutOfBoundsException] */
        mutablePeriod.addPeriodInto(intArray, mutablePeriod1);
    }
    
    @Test
    public void testAddPeriodInto8() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null, null, null, null, null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = new int[11];
        iValues[3] = 3;
        iValues[4] = 3;
        iValues[5] = 3;
        iValues[6] = 3;
        iValues[7] = 3;
        iValues[8] = 3;
        iValues[9] = 3;
        iValues[10] = 3;
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:115)
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:587) */
        mutablePeriod.addPeriodInto(intArray, mutablePeriod1);
    }
    
    @Test
    public void testAddPeriodInto9() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[9];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[4] = ((DurationFieldType) standardDurationFieldType);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType);
        iTypes[8] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        iTypes1[2] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[3] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[4] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[5] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[6] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[7] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[8] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[9] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[10] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = new int[11];
        iValues[2] = 1;
        iValues[3] = 3;
        iValues[4] = 3;
        iValues[5] = 3;
        iValues[6] = 3;
        iValues[7] = 3;
        iValues[8] = 3;
        iValues[9] = 3;
        iValues[10] = 3;
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.NullPointerException] */
        mutablePeriod.addPeriodInto(intArray, period);
    }
    
    @Test
    public void testAddPeriodInto10() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[15];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[7] = ((DurationFieldType) standardDurationFieldType);
        iTypes[8] = ((DurationFieldType) standardDurationFieldType);
        iTypes[9] = ((DurationFieldType) standardDurationFieldType);
        iTypes[10] = ((DurationFieldType) standardDurationFieldType);
        iTypes[11] = ((DurationFieldType) standardDurationFieldType);
        iTypes[12] = ((DurationFieldType) standardDurationFieldType);
        iTypes[13] = ((DurationFieldType) standardDurationFieldType);
        iTypes[14] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[12];
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[2] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[3] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[4] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[5] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[6] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[7] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[8] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[9] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[10] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[11] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {
            0, 1, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:592) */
        mutablePeriod.addPeriodInto(null, period);
    }
    
    @Test
    public void testAddPeriodInto11() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[3];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[2] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = new int[11];
        iValues[0] = 1991245822;
        iValues[1] = 1991245822;
        iValues[2] = 914620415;
        iValues[3] = 1991245822;
        iValues[4] = 1991245822;
        iValues[5] = 1991245822;
        iValues[6] = 1991245822;
        iValues[7] = 1991245822;
        iValues[8] = 1991245822;
        iValues[9] = 1991245822;
        iValues[10] = 1991245822;
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        int[] intArray = new int[11];
        intArray[0] = -255;
        intArray[1] = -255;
        intArray[2] = -255;
        intArray[3] = -255;
        intArray[4] = -255;
        intArray[5] = -255;
        intArray[6] = -255;
        intArray[7] = -255;
        intArray[9] = -255;
        intArray[10] = -255;
        Period period1 = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[6];
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = new int[11];
        iValues1[0] = 162004994;
        iValues1[3] = 536870912;
        iValues1[4] = 536870912;
        iValues1[5] = 536870912;
        iValues1[6] = 536870912;
        iValues1[7] = 536870912;
        iValues1[8] = 536870912;
        iValues1[9] = 536870912;
        iValues1[10] = 536870912;
        setField(period1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:590) */
        period.addPeriodInto(intArray, period1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addPeriodInto([I, org.joda.time.ReadablePeriod)
    
    @Test(expected = ArithmeticException.class)
    public void testAddPeriodInto12() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null, null, null, null, null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            43, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = new int[11];
        iValues1[0] = 1870651306;
        iValues1[1] = -1469938602;
        iValues1[3] = 536870912;
        iValues1[4] = 536870912;
        iValues1[5] = 536870912;
        iValues1[6] = 536870912;
        iValues1[7] = 536870912;
        iValues1[8] = 536870912;
        iValues1[9] = 536870912;
        iValues1[10] = 536870912;
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        mutablePeriod.addPeriodInto(iValues, period);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddPeriodInto13() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[11];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType);
        iTypes[4] = ((DurationFieldType) standardDurationFieldType);
        iTypes[5] = ((DurationFieldType) standardDurationFieldType);
        iTypes[6] = ((DurationFieldType) standardDurationFieldType);
        iTypes[7] = ((DurationFieldType) standardDurationFieldType);
        iTypes[8] = ((DurationFieldType) standardDurationFieldType);
        iTypes[9] = ((DurationFieldType) standardDurationFieldType);
        iTypes[10] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            536870912, -536870911, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912,
            536870912, 536870912
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        int[] intArray = new int[13];
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[10];
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[2] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[3] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[4] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[5] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[6] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[7] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[8] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[9] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {
            1073741822, 1, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912,
            536870912
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        period.addPeriodInto(intArray, mutablePeriod);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.addField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addField(org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testAddField() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        mutablePeriod.addField(null, -1);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        int[] mutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        int finalMutablePeriodIValues0 = ((Integer) get(mutablePeriodIValues, 0));
        
        assertNull(finalMutablePeriodITypeITypes0);
        
        assertEquals(-1, finalMutablePeriodIValues0);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addField(org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testAddField_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method addFieldMethod = basePeriodClazz.getDeclaredMethod("addField", standardDurationFieldTypeType, intType);
        addFieldMethod.setAccessible(true);
        java.lang.Object[] addFieldMethodArguments = new java.lang.Object[2];
        addFieldMethodArguments[0] = standardDurationFieldType;
        addFieldMethodArguments[1] = 0;
        addFieldMethod.invoke(mutablePeriod, addFieldMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addField(org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testAddField_2() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        mutablePeriod.addField(null, 0);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addField(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addFieldInto(iValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddField_ThrowIllegalArgumentException() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method addFieldMethod = basePeriodClazz.getDeclaredMethod("addField", standardDurationFieldTypeType, intType);
        addFieldMethod.setAccessible(true);
        java.lang.Object[] addFieldMethodArguments = new java.lang.Object[2];
        addFieldMethodArguments[0] = standardDurationFieldType;
        addFieldMethodArguments[1] = -255;
        try {
            addFieldMethod.invoke(mutablePeriod, addFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addField(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: addFieldInto(iValues, field, value);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddField_ThrowArithmeticException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {1431655765};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        period.addField(null, 1431655765);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addField(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: addFieldInto(iValues, field, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddField_ThrowIllegalArgumentException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        period.addField(null, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addField(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addField(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: addFieldInto(iValues, field, value);
 *  */
    @Test
    public void testAddField_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.addFieldInto(BasePeriod.java:529)
            org.joda.time.base.BasePeriod.addField(BasePeriod.java:510) */
        mutablePeriod.addField(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.mergePeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mergePeriod(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriod(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period != null): False}
 *  */
    @Test
    public void testMergePeriod_PeriodEqualsNull() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        period.mergePeriod(null);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriod(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period != null): True}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#getValues()}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#mergePeriodInto(int[],org.joda.time.ReadablePeriod)}
 *  */
    @Test
    public void testMergePeriod_PeriodNotEqualsNull() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {0};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        period.mergePeriod(mutablePeriod);
        
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mergePeriod(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriod(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iValues = mergePeriodInto(getValues(), period);
 *  */
    @Test
    public void testMergePeriod_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriod] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:556)
            org.joda.time.base.BasePeriod.mergePeriod(BasePeriod.java:541) */
        period.mergePeriod(mutablePeriod);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriod(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iValues = mergePeriodInto(getValues(), period);
 *  */
    @Test
    public void testMergePeriod_ThrowNullPointerException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {1};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriod] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:400)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557)
            org.joda.time.base.BasePeriod.mergePeriod(BasePeriod.java:541) */
        period.mergePeriod(mutablePeriod);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mergePeriod(org.joda.time.ReadablePeriod)
    
    @Test
    public void testMergePeriod1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", secondsType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = seconds;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
    }
    
    @Test
    public void testMergePeriod2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", minutesType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = minutes;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
    }
    
    @Test
    public void testMergePeriod3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", weeksType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = weeks;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
    }
    
    @Test
    public void testMergePeriod4() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", daysType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = days;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
    }
    
    @Test
    public void testMergePeriod5() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", hoursType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = hours;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
    }
    
    @Test
    public void testMergePeriod6() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", secondsType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = seconds;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalPeriodITypeITypes0);
    }
    
    @Test
    public void testMergePeriod7() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", minutesType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = minutes;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalPeriodITypeITypes0);
    }
    
    @Test
    public void testMergePeriod8() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255, -255};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", hoursType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = hours;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes1 = ((DurationFieldType) get(periodIType1ITypeITypes, 1));
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalPeriodITypeITypes0);
        
        assertNull(finalPeriodITypeITypes1);
    }
    
    @Test
    public void testMergePeriod9() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", daysType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = days;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes1 = ((DurationFieldType) get(periodIType1ITypeITypes, 1));
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalPeriodITypeITypes0);
        
        assertNull(finalPeriodITypeITypes1);
    }
    
    @Test
    public void testMergePeriod10() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodMethod = basePeriodClazz.getDeclaredMethod("mergePeriod", weeksType);
        mergePeriodMethod.setAccessible(true);
        java.lang.Object[] mergePeriodMethodArguments = new java.lang.Object[1];
        mergePeriodMethodArguments[0] = weeks;
        mergePeriodMethod.invoke(period, mergePeriodMethodArguments);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes1 = ((DurationFieldType) get(periodIType1ITypeITypes, 1));
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalPeriodITypeITypes0);
        
        assertNull(finalPeriodITypeITypes1);
    }
    
    @Test
    public void testMergePeriod11() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[9];
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[2] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        period.mergePeriod(mutablePeriod);
        
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        PeriodType mutablePeriodIType1 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes3 = ((DurationFieldType) get(mutablePeriodIType1ITypeITypes, 3));
        PeriodType mutablePeriodIType2 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes4 = ((DurationFieldType) get(mutablePeriodIType2ITypeITypes, 4));
        PeriodType mutablePeriodIType3 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes5 = ((DurationFieldType) get(mutablePeriodIType3ITypeITypes, 5));
        PeriodType mutablePeriodIType4 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes6 = ((DurationFieldType) get(mutablePeriodIType4ITypeITypes, 6));
        PeriodType mutablePeriodIType5 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType5, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes7 = ((DurationFieldType) get(mutablePeriodIType5ITypeITypes, 7));
        PeriodType mutablePeriodIType6 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType6, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes8 = ((DurationFieldType) get(mutablePeriodIType6ITypeITypes, 8));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
        
        assertNull(finalMutablePeriodITypeITypes3);
        
        assertNull(finalMutablePeriodITypeITypes4);
        
        assertNull(finalMutablePeriodITypeITypes5);
        
        assertNull(finalMutablePeriodITypeITypes6);
        
        assertNull(finalMutablePeriodITypeITypes7);
        
        assertNull(finalMutablePeriodITypeITypes8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mergePeriod(org.joda.time.ReadablePeriod)
    
    @Test
    public void testMergePeriod12() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null, null, null, null, null, null, null, null, null, null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriod] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:556)
            org.joda.time.base.BasePeriod.mergePeriod(BasePeriod.java:541) */
        period.mergePeriod(mutablePeriod);
    }
    
    @Test
    public void testMergePeriod13() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriod] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.size(BasePeriod.java:313)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:554)
            org.joda.time.base.BasePeriod.mergePeriod(BasePeriod.java:541) */
        period.mergePeriod(mutablePeriod);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mergePeriod(org.joda.time.ReadablePeriod)
    
    @Test(expected = IllegalArgumentException.class)
    public void testMergePeriod14() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = new int[32];
        iValues[2] = 3;
        iValues[3] = 3;
        iValues[4] = 3;
        iValues[5] = 3;
        iValues[6] = 3;
        iValues[7] = 3;
        iValues[8] = 3;
        iValues[9] = 3;
        iValues[10] = 3;
        iValues[11] = 3;
        iValues[12] = 3;
        iValues[13] = 3;
        iValues[14] = 3;
        iValues[15] = 3;
        iValues[16] = 3;
        iValues[17] = 3;
        iValues[18] = 3;
        iValues[19] = 3;
        iValues[20] = 3;
        iValues[21] = 3;
        iValues[22] = 3;
        iValues[23] = 3;
        iValues[24] = 3;
        iValues[25] = 3;
        iValues[26] = 3;
        iValues[27] = 3;
        iValues[28] = 3;
        iValues[29] = 3;
        iValues[30] = 3;
        iValues[31] = 3;
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[9];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {
            1, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        period.mergePeriod(mutablePeriod);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setPeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setPeriod(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setPeriod(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#size()}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#setValues(int[])}
 *  */
    @Test
    public void testSetPeriod_PeriodEqualsNull() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        period.setPeriod(null);
        
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPeriod(org.joda.time.ReadablePeriod)
    
    @Test
    public void testSetPeriod1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodMethod = basePeriodClazz.getDeclaredMethod("setPeriod", secondsType);
        setPeriodMethod.setAccessible(true);
        java.lang.Object[] setPeriodMethodArguments = new java.lang.Object[1];
        setPeriodMethodArguments[0] = seconds;
        setPeriodMethod.invoke(period, setPeriodMethodArguments);
    }
    
    @Test
    public void testSetPeriod2() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodMethod = basePeriodClazz.getDeclaredMethod("setPeriod", minutesType);
        setPeriodMethod.setAccessible(true);
        java.lang.Object[] setPeriodMethodArguments = new java.lang.Object[1];
        setPeriodMethodArguments[0] = minutes;
        setPeriodMethod.invoke(period, setPeriodMethodArguments);
    }
    
    @Test
    public void testSetPeriod3() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodMethod = basePeriodClazz.getDeclaredMethod("setPeriod", hoursType);
        setPeriodMethod.setAccessible(true);
        java.lang.Object[] setPeriodMethodArguments = new java.lang.Object[1];
        setPeriodMethodArguments[0] = hours;
        setPeriodMethod.invoke(period, setPeriodMethodArguments);
    }
    
    @Test
    public void testSetPeriod4() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodMethod = basePeriodClazz.getDeclaredMethod("setPeriod", daysType);
        setPeriodMethod.setAccessible(true);
        java.lang.Object[] setPeriodMethodArguments = new java.lang.Object[1];
        setPeriodMethodArguments[0] = days;
        setPeriodMethod.invoke(period, setPeriodMethodArguments);
    }
    
    @Test
    public void testSetPeriod5() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodMethod = basePeriodClazz.getDeclaredMethod("setPeriod", weeksType);
        setPeriodMethod.setAccessible(true);
        java.lang.Object[] setPeriodMethodArguments = new java.lang.Object[1];
        setPeriodMethodArguments[0] = weeks;
        setPeriodMethod.invoke(period, setPeriodMethodArguments);
    }
    
    @Test
    public void testSetPeriod6() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[5];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[9];
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        period.setPeriod(mutablePeriod);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes2 = ((DurationFieldType) get(periodITypeITypeITypes, 2));
        PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes3 = ((DurationFieldType) get(periodIType1ITypeITypes, 3));
        PeriodType periodIType2 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes4 = ((DurationFieldType) get(periodIType2ITypeITypes, 4));
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes1 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 1));
        PeriodType mutablePeriodIType1 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes2 = ((DurationFieldType) get(mutablePeriodIType1ITypeITypes, 2));
        PeriodType mutablePeriodIType2 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes3 = ((DurationFieldType) get(mutablePeriodIType2ITypeITypes, 3));
        PeriodType mutablePeriodIType3 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes4 = ((DurationFieldType) get(mutablePeriodIType3ITypeITypes, 4));
        PeriodType mutablePeriodIType4 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes5 = ((DurationFieldType) get(mutablePeriodIType4ITypeITypes, 5));
        PeriodType mutablePeriodIType5 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType5, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes6 = ((DurationFieldType) get(mutablePeriodIType5ITypeITypes, 6));
        PeriodType mutablePeriodIType6 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType6, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes7 = ((DurationFieldType) get(mutablePeriodIType6ITypeITypes, 7));
        PeriodType mutablePeriodIType7 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType7, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes8 = ((DurationFieldType) get(mutablePeriodIType7ITypeITypes, 8));
        
        assertNull(finalPeriodITypeITypes2);
        
        assertNull(finalPeriodITypeITypes3);
        
        assertNull(finalPeriodITypeITypes4);
        
        assertNull(finalMutablePeriodITypeITypes1);
        
        assertNull(finalMutablePeriodITypeITypes2);
        
        assertNull(finalMutablePeriodITypeITypes3);
        
        assertNull(finalMutablePeriodITypeITypes4);
        
        assertNull(finalMutablePeriodITypeITypes5);
        
        assertNull(finalMutablePeriodITypeITypes6);
        
        assertNull(finalMutablePeriodITypeITypes7);
        
        assertNull(finalMutablePeriodITypeITypes8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setPeriod(org.joda.time.ReadablePeriod)
    
    @Test
    public void testSetPeriod7() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[23];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[4] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Period period1 = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setPeriod] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:429)
            org.joda.time.base.BasePeriod.setPeriod(BasePeriod.java:418) */
        period.setPeriod(period1);
    }
    
    @Test
    public void testSetPeriod8() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[4];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null, null, null, null, null, null, null, null, null, null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {
            0, 0, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setPeriod] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:400)
            org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:430)
            org.joda.time.base.BasePeriod.setPeriod(BasePeriod.java:418) */
        period.setPeriod(mutablePeriod);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPeriod(org.joda.time.ReadablePeriod)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod9() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null, null, null, null, null, null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        Period period1 = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[12];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[2] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[3] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[4] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[5] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[6] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[7] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[8] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[9] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[10] = ((DurationFieldType) standardDurationFieldType1);
        iTypes1[11] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(period1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        period.setPeriod(period1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setPeriod
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPeriod(int, int, int, int, int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setPeriod(int,int,int,int,int,int,int,int)}
 * @utbot.invokes org.joda.time.base.BasePeriod#setPeriodInternal(int,int,int,int,int,int,int,int)
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.invokes {@link org.joda.time.DurationFieldType#months()}
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.invokes {@link org.joda.time.DurationFieldType#weeks()}
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.invokes {@link org.joda.time.DurationFieldType#days()}
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.invokes {@link org.joda.time.DurationFieldType#hours()}
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.invokes org.joda.time.base.BasePeriod#setPeriodInternal(int,int,int,int,int,int,int,int)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setPeriodInternal(years, months, weeks, days, hours, minutes, seconds, millis);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod_ThrowIllegalArgumentException() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName3 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName4 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName4);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.setPeriod(0, 0, 0, 0, -255, -255, -255, -255);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPeriod(int, int, int, int, int, int, int, int)
    
    @Test
    public void testSetPeriod10() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[15];
            iTypes[1] = ((DurationFieldType) monthsType);
            iTypes[2] = ((DurationFieldType) yearsType);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.setPeriod(0, 0, 0, 0, 0, 0, 0, 0);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes3 = ((DurationFieldType) get(periodIType1ITypeITypes, 3));
            PeriodType periodIType2 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType2, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes4 = ((DurationFieldType) get(periodIType2ITypeITypes, 4));
            PeriodType periodIType3 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType3, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes5 = ((DurationFieldType) get(periodIType3ITypeITypes, 5));
            PeriodType periodIType4 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType4, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes6 = ((DurationFieldType) get(periodIType4ITypeITypes, 6));
            PeriodType periodIType5 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType5, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes7 = ((DurationFieldType) get(periodIType5ITypeITypes, 7));
            PeriodType periodIType6 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType6, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes8 = ((DurationFieldType) get(periodIType6ITypeITypes, 8));
            PeriodType periodIType7 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType7, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes9 = ((DurationFieldType) get(periodIType7ITypeITypes, 9));
            PeriodType periodIType8 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType8ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType8, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes10 = ((DurationFieldType) get(periodIType8ITypeITypes, 10));
            PeriodType periodIType9 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType9ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType9, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes11 = ((DurationFieldType) get(periodIType9ITypeITypes, 11));
            PeriodType periodIType10 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType10ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType10, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes12 = ((DurationFieldType) get(periodIType10ITypeITypes, 12));
            PeriodType periodIType11 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType11ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType11, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes13 = ((DurationFieldType) get(periodIType11ITypeITypes, 13));
            PeriodType periodIType12 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType12ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType12, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes14 = ((DurationFieldType) get(periodIType12ITypeITypes, 14));
            
            assertNull(finalPeriodITypeITypes0);
            
            assertNull(finalPeriodITypeITypes3);
            
            assertNull(finalPeriodITypeITypes4);
            
            assertNull(finalPeriodITypeITypes5);
            
            assertNull(finalPeriodITypeITypes6);
            
            assertNull(finalPeriodITypeITypes7);
            
            assertNull(finalPeriodITypeITypes8);
            
            assertNull(finalPeriodITypeITypes9);
            
            assertNull(finalPeriodITypeITypes10);
            
            assertNull(finalPeriodITypeITypes11);
            
            assertNull(finalPeriodITypeITypes12);
            
            assertNull(finalPeriodITypeITypes13);
            
            assertNull(finalPeriodITypeITypes14);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    @Test
    public void testSetPeriod11() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[6];
            iTypes[0] = ((DurationFieldType) yearsType);
            iTypes[5] = ((DurationFieldType) monthsType);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.setPeriod(0, 0, 0, 0, 0, 0, 0, 0);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes1 = ((DurationFieldType) get(periodITypeITypeITypes, 1));
            PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes2 = ((DurationFieldType) get(periodIType1ITypeITypes, 2));
            PeriodType periodIType2 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType2, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes3 = ((DurationFieldType) get(periodIType2ITypeITypes, 3));
            PeriodType periodIType3 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType3, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes4 = ((DurationFieldType) get(periodIType3ITypeITypes, 4));
            
            assertNull(finalPeriodITypeITypes1);
            
            assertNull(finalPeriodITypeITypes2);
            
            assertNull(finalPeriodITypeITypes3);
            
            assertNull(finalPeriodITypeITypes4);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    @Test
    public void testSetPeriod12() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName3 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName4 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName4);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName5 = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName5);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.setPeriod(0, 0, 0, 0, 0, 0, 0, 0);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPeriod(int, int, int, int, int, int, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod13() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[25];
            iTypes[1] = ((DurationFieldType) yearsType);
            iTypes[3] = ((DurationFieldType) monthsType);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.setPeriod(-255, -255, -255, -255, -255, -255, -255, -255);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriod14() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[7];
            iTypes[0] = ((DurationFieldType) yearsType);
            iTypes[2] = ((DurationFieldType) monthsType);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            period.setPeriod(-255, -255, -255, -255, -255, -255, -255, -255);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.addFieldInto
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addFieldInto([I, org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): False}
 * @utbot.executesCondition {@code (field == null): False}
 *  */
    @Test
    public void testAddFieldInto_FieldNotEqualsNull() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method addFieldIntoMethod = basePeriodClazz.getDeclaredMethod("addFieldInto", intArrayType, standardDurationFieldTypeType, intType);
        addFieldIntoMethod.setAccessible(true);
        java.lang.Object[] addFieldIntoMethodArguments = new java.lang.Object[3];
        addFieldIntoMethodArguments[0] = ((Object) null);
        addFieldIntoMethodArguments[1] = standardDurationFieldType;
        addFieldIntoMethodArguments[2] = 0;
        addFieldIntoMethod.invoke(mutablePeriod, addFieldIntoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testAddFieldInto() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {25};
        
        mutablePeriod.addFieldInto(intArray, null, 0);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testAddFieldInto_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {0};
        
        period.addFieldInto(intArray, null, -1);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        
        int finalIntArray0 = intArray[0];
        
        assertNull(finalPeriodITypeITypes0);
        
        assertEquals(-1, finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): False}
 * @utbot.executesCondition {@code (field == null): False}
 *  */
    @Test
    public void testAddFieldInto_FieldNotEqualsNull_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method addFieldIntoMethod = basePeriodClazz.getDeclaredMethod("addFieldInto", intArrayType, standardDurationFieldTypeType, intType);
        addFieldIntoMethod.setAccessible(true);
        java.lang.Object[] addFieldIntoMethodArguments = new java.lang.Object[3];
        addFieldIntoMethodArguments[0] = ((Object) null);
        addFieldIntoMethodArguments[1] = standardDurationFieldType;
        addFieldIntoMethodArguments[2] = 0;
        addFieldIntoMethod.invoke(mutablePeriod, addFieldIntoMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addFieldInto([I, org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.field.FieldUtils#safeAdd(int,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: values[index] = FieldUtils.safeAdd(values[index], value);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddFieldInto_ThrowArithmeticException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {1431655765};
        
        period.addFieldInto(intArray, null, 1431655765);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: value != 0 || field == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddFieldInto_ThrowIllegalArgumentException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        mutablePeriod.addFieldInto(null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): False}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: value != 0 || field == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddFieldInto_ThrowIllegalArgumentException_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        mutablePeriod.addFieldInto(null, null, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addFieldInto([I, org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: values[index] = FieldUtils.safeAdd(values[index], value);
 *  */
    @Test
    public void testAddFieldInto_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {};
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addFieldInto] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.addFieldInto(BasePeriod.java:529) */
        mutablePeriod.addFieldInto(intArray, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values[index] = FieldUtils.safeAdd(values[index], value);
 *  */
    @Test
    public void testAddFieldInto_ThrowNullPointerException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addFieldInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.addFieldInto(BasePeriod.java:529) */
        mutablePeriod.addFieldInto(null, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.addPeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addPeriod(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriod(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period != null): False}
 *  */
    @Test
    public void testAddPeriod_PeriodEqualsNull() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        mutablePeriod.addPeriod(null);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriod(org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (period != null): True}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#getValues()}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#addPeriodInto(int[],org.joda.time.ReadablePeriod)}
 *  */
    @Test
    public void testAddPeriod_PeriodNotEqualsNull() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {0};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        period.addPeriod(mutablePeriod);
        
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addPeriod(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriod(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iValues = addPeriodInto(getValues(), period);
 *  */
    @Test
    public void testAddPeriod_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriod] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:585)
            org.joda.time.base.BasePeriod.addPeriod(BasePeriod.java:570) */
        period.addPeriod(mutablePeriod);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriod(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iValues = addPeriodInto(getValues(), period);
 *  */
    @Test
    public void testAddPeriod_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriod] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.AbstractPeriod.getValues(AbstractPeriod.java:75)
            org.joda.time.base.BasePeriod.addPeriod(BasePeriod.java:570) */
        period.addPeriod(period);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#addPeriod(org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iValues = addPeriodInto(getValues(), period);
 *  */
    @Test
    public void testAddPeriod_ThrowNullPointerException() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {1};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriod] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:590)
            org.joda.time.base.BasePeriod.addPeriod(BasePeriod.java:570) */
        period.addPeriod(mutablePeriod);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addPeriod(org.joda.time.ReadablePeriod)
    
    @Test
    public void testAddPeriod1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", secondsType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = seconds;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
    }
    
    @Test
    public void testAddPeriod2() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", minutesType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = minutes;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
    }
    
    @Test
    public void testAddPeriod3() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", hoursType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = hours;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
    }
    
    @Test
    public void testAddPeriod4() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", weeksType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = weeks;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
    }
    
    @Test
    public void testAddPeriod5() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", daysType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = days;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
    }
    
    @Test
    public void testAddPeriod6() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        int[] initialMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", weeksType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = weeks;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        PeriodType mutablePeriodIType1 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes1 = ((DurationFieldType) get(mutablePeriodIType1ITypeITypes, 1));
        PeriodType mutablePeriodIType2 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes2 = ((DurationFieldType) get(mutablePeriodIType2ITypeITypes, 2));
        int[] finalMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialMutablePeriodIValues == finalMutablePeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
        
        assertNull(finalMutablePeriodITypeITypes1);
        
        assertNull(finalMutablePeriodITypeITypes2);
    }
    
    @Test
    public void testAddPeriod7() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        int[] initialMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", secondsType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = seconds;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        int[] finalMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialMutablePeriodIValues == finalMutablePeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    
    @Test
    public void testAddPeriod8() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        int[] initialMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", minutesType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = minutes;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        int[] finalMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialMutablePeriodIValues == finalMutablePeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    
    @Test
    public void testAddPeriod9() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-255, -255};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        int[] initialMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", hoursType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = hours;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        PeriodType mutablePeriodIType1 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes1 = ((DurationFieldType) get(mutablePeriodIType1ITypeITypes, 1));
        int[] finalMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialMutablePeriodIValues == finalMutablePeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
        
        assertNull(finalMutablePeriodITypeITypes1);
    }
    
    @Test
    public void testAddPeriod10() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        int[] initialMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method addPeriodMethod = basePeriodClazz.getDeclaredMethod("addPeriod", daysType);
        addPeriodMethod.setAccessible(true);
        java.lang.Object[] addPeriodMethodArguments = new java.lang.Object[1];
        addPeriodMethodArguments[0] = days;
        addPeriodMethod.invoke(mutablePeriod, addPeriodMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        int[] finalMutablePeriodIValues = ((int[]) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues"));
        
        assertFalse(initialMutablePeriodIValues == finalMutablePeriodIValues);
        
        assertNull(finalMutablePeriodITypeITypes0);
    }
    
    @Test
    public void testAddPeriod11() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[2];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {-69878987, 0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Period period1 = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = new int[11];
        iValues1[1] = 72631499;
        iValues1[2] = 1;
        iValues1[3] = 2752512;
        iValues1[4] = 2752512;
        iValues1[5] = 2752512;
        iValues1[6] = 2752512;
        iValues1[7] = 2752512;
        iValues1[8] = 2752512;
        iValues1[9] = 2752512;
        iValues1[10] = 2752512;
        setField(period1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        int[] initialPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        period.addPeriod(period1);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes1 = ((DurationFieldType) get(periodITypeITypeITypes, 1));
        int[] finalPeriodIValues = ((int[]) getFieldValue(period, "org.joda.time.base.BasePeriod", "iValues"));
        
        PeriodType period1IType = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1ITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes0 = ((DurationFieldType) get(period1ITypeITypeITypes, 0));
        PeriodType period1IType1 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes2 = ((DurationFieldType) get(period1IType1ITypeITypes, 2));
        PeriodType period1IType2 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes3 = ((DurationFieldType) get(period1IType2ITypeITypes, 3));
        PeriodType period1IType3 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes4 = ((DurationFieldType) get(period1IType3ITypeITypes, 4));
        PeriodType period1IType4 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes5 = ((DurationFieldType) get(period1IType4ITypeITypes, 5));
        PeriodType period1IType5 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType5, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes6 = ((DurationFieldType) get(period1IType5ITypeITypes, 6));
        PeriodType period1IType6 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType6, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes7 = ((DurationFieldType) get(period1IType6ITypeITypes, 7));
        PeriodType period1IType7 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType7, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes8 = ((DurationFieldType) get(period1IType7ITypeITypes, 8));
        PeriodType period1IType8 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType8ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType8, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes9 = ((DurationFieldType) get(period1IType8ITypeITypes, 9));
        PeriodType period1IType9 = ((PeriodType) getFieldValue(period1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] period1IType9ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(period1IType9, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriod1ITypeITypes10 = ((DurationFieldType) get(period1IType9ITypeITypes, 10));
        
        assertFalse(initialPeriodIValues == finalPeriodIValues);
        
        assertNull(finalPeriodITypeITypes1);
        
        assertNull(finalPeriod1ITypeITypes0);
        
        assertNull(finalPeriod1ITypeITypes2);
        
        assertNull(finalPeriod1ITypeITypes3);
        
        assertNull(finalPeriod1ITypeITypes4);
        
        assertNull(finalPeriod1ITypeITypes5);
        
        assertNull(finalPeriod1ITypeITypes6);
        
        assertNull(finalPeriod1ITypeITypes7);
        
        assertNull(finalPeriod1ITypeITypes8);
        
        assertNull(finalPeriod1ITypeITypes9);
        
        assertNull(finalPeriod1ITypeITypes10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addPeriod(org.joda.time.ReadablePeriod)
    
    @Test
    public void testAddPeriod12() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[2];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {67101697, 272760834, 3, 3, 3, 3, 3, 3};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[19];
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = {
            -872407140, 1601896442, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriod] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:585)
            org.joda.time.base.BasePeriod.addPeriod(BasePeriod.java:570) */
        mutablePeriod.addPeriod(mutablePeriod1);
    }
    
    @Test
    public void testAddPeriod13() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[2];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[1] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {0, 1431680939, 3, 3, 3, 3, 3, 3};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = new int[11];
        iValues1[1] = -715878230;
        iValues1[2] = 1;
        iValues1[3] = 274;
        iValues1[4] = 274;
        iValues1[5] = 274;
        iValues1[6] = 274;
        iValues1[7] = 274;
        iValues1[8] = 274;
        iValues1[9] = 274;
        iValues1[10] = 274;
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.addPeriod] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.addPeriodInto(BasePeriod.java:590)
            org.joda.time.base.BasePeriod.addPeriod(BasePeriod.java:570) */
        period.addPeriod(mutablePeriod);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addPeriod(org.joda.time.ReadablePeriod)
    
    @Test(expected = ArithmeticException.class)
    public void testAddPeriod14() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {
            2102744407, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = new int[11];
        iValues1[1] = -2058005166;
        iValues1[2] = 1;
        iValues1[3] = 44739241;
        iValues1[4] = 44739241;
        iValues1[5] = 44739241;
        iValues1[6] = 44739241;
        iValues1[7] = 44739241;
        iValues1[8] = 44739241;
        iValues1[9] = 44739241;
        iValues1[10] = 44739241;
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        mutablePeriod.addPeriod(period);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddPeriod15() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = new int[32];
        iValues[0] = -69861578;
        iValues[2] = 3;
        iValues[3] = 3;
        iValues[4] = 3;
        iValues[5] = 3;
        iValues[6] = 3;
        iValues[7] = 3;
        iValues[8] = 3;
        iValues[9] = 3;
        iValues[10] = 3;
        iValues[11] = 3;
        iValues[12] = 3;
        iValues[13] = 3;
        iValues[14] = 3;
        iValues[15] = 3;
        iValues[16] = 3;
        iValues[17] = 3;
        iValues[18] = 3;
        iValues[19] = 3;
        iValues[20] = 3;
        iValues[21] = 3;
        iValues[22] = 3;
        iValues[23] = 3;
        iValues[24] = 3;
        iValues[25] = 3;
        iValues[26] = 3;
        iValues[27] = 3;
        iValues[28] = 3;
        iValues[29] = 3;
        iValues[30] = 3;
        iValues[31] = 3;
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[2] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues1 = new int[11];
        iValues1[1] = 72614091;
        iValues1[2] = 1;
        iValues1[3] = 3;
        iValues1[4] = 3;
        iValues1[5] = 3;
        iValues1[6] = 3;
        iValues1[7] = 3;
        iValues1[8] = 3;
        iValues1[9] = 3;
        iValues1[10] = 3;
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues1);
        
        mutablePeriod.addPeriod(mutablePeriod1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setFieldInto
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFieldInto([I, org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): False}
 * @utbot.executesCondition {@code (field == null): False}
 *  */
    @Test
    public void testSetFieldInto_FieldNotEqualsNull() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method setFieldIntoMethod = basePeriodClazz.getDeclaredMethod("setFieldInto", intArrayType, standardDurationFieldTypeType, intType);
        setFieldIntoMethod.setAccessible(true);
        java.lang.Object[] setFieldIntoMethodArguments = new java.lang.Object[3];
        setFieldIntoMethodArguments[0] = ((Object) null);
        setFieldIntoMethodArguments[1] = standardDurationFieldType;
        setFieldIntoMethodArguments[2] = 0;
        setFieldIntoMethod.invoke(mutablePeriod, setFieldIntoMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 *  */
    @Test
    public void testSetFieldInto() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {-255};
        
        period.setFieldInto(intArray, null, -255);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        
        assertNull(finalPeriodITypeITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setFieldInto([I, org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: value != 0 || field == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetFieldInto_ThrowIllegalArgumentException_2() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intType = int.class;
        Method setFieldIntoMethod = basePeriodClazz.getDeclaredMethod("setFieldInto", intArrayType, standardDurationFieldTypeType, intType);
        setFieldIntoMethod.setAccessible(true);
        java.lang.Object[] setFieldIntoMethodArguments = new java.lang.Object[3];
        setFieldIntoMethodArguments[0] = ((Object) null);
        setFieldIntoMethodArguments[1] = standardDurationFieldType;
        setFieldIntoMethodArguments[2] = -255;
        try {
            setFieldIntoMethod.invoke(mutablePeriod, setFieldIntoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: value != 0 || field == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetFieldInto_ThrowIllegalArgumentException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        mutablePeriod.setFieldInto(null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.executesCondition {@code (value != 0): False}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: value != 0 || field == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetFieldInto_ThrowIllegalArgumentException_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        mutablePeriod.setFieldInto(null, null, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setFieldInto([I, org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: values[index] = value;
 *  */
    @Test
    public void testSetFieldInto_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {};
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setFieldInto] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.setFieldInto(BasePeriod.java:498) */
        mutablePeriod.setFieldInto(intArray, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setFieldInto(int[],org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values[index] = value;
 *  */
    @Test
    public void testSetFieldInto_ThrowNullPointerException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setFieldInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.setFieldInto(BasePeriod.java:498) */
        mutablePeriod.setFieldInto(null, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.toDurationTo
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toDurationTo(org.joda.time.ReadableInstant)
    
    @Test
    public void testToDurationTo1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        
        Duration actual = mutablePeriod.toDurationTo(dateMidnight);
        
        Duration expected = new Duration(0L);
        
        long expectedIMillis = ((Long) getFieldValue(expected, "org.joda.time.base.BaseDuration", "iMillis"));
        long actualIMillis = ((Long) getFieldValue(actual, "org.joda.time.base.BaseDuration", "iMillis"));
        assertEquals(expectedIMillis, actualIMillis);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toDurationTo(org.joda.time.ReadableInstant)
    
    @Test
    public void testToDurationTo2() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Instant instant = new Instant(0L);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.toDurationTo] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.size(BasePeriod.java:313)
            org.joda.time.chrono.BaseChronology.add(BaseChronology.java:302)
            org.joda.time.base.BasePeriod.toDurationTo(BasePeriod.java:382) */
        mutablePeriod.toDurationTo(instant);
    }
    
    @Test
    public void testToDurationTo3() throws Exception  {
        Class dateTimeUtilsClazz = Class.forName("org.joda.time.DateTimeUtils");
        DateTimeUtils.MillisProvider prevCMillisProvider = ((DateTimeUtils.MillisProvider) getStaticFieldValue(dateTimeUtilsClazz, "cMillisProvider"));
        try {
            Object cMillisProvider = createInstance("org.joda.time.DateTimeUtils$SystemMillisProvider");
            setStaticField(dateTimeUtilsClazz, "cMillisProvider", cMillisProvider);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            /* This test fails because method [org.joda.time.base.BasePeriod.toDurationTo] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.size(BasePeriod.java:313)
                org.joda.time.chrono.BaseChronology.add(BaseChronology.java:302)
                org.joda.time.base.BasePeriod.toDurationTo(BasePeriod.java:382) */
            mutablePeriod.toDurationTo(null);
        } finally {
            setStaticField(DateTimeUtils.class, "cMillisProvider", prevCMillisProvider);
        }
    }
    
    @Test
    public void testToDurationTo4() throws Exception  {
        Class dateTimeUtilsClazz = Class.forName("org.joda.time.DateTimeUtils");
        DateTimeUtils.MillisProvider prevCMillisProvider = ((DateTimeUtils.MillisProvider) getStaticFieldValue(dateTimeUtilsClazz, "cMillisProvider"));
        try {
            Object cMillisProvider = createInstance("org.joda.time.DateTimeUtils$OffsetMillisProvider");
            setField(cMillisProvider, "org.joda.time.DateTimeUtils$OffsetMillisProvider", "iMillis", 0L);
            setStaticField(dateTimeUtilsClazz, "cMillisProvider", cMillisProvider);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            /* This test fails because method [org.joda.time.base.BasePeriod.toDurationTo] produces [java.lang.NullPointerException]
                org.joda.time.base.BasePeriod.size(BasePeriod.java:313)
                org.joda.time.chrono.BaseChronology.add(BaseChronology.java:302)
                org.joda.time.base.BasePeriod.toDurationTo(BasePeriod.java:382) */
            mutablePeriod.toDurationTo(null);
        } finally {
            setStaticField(DateTimeUtils.class, "cMillisProvider", prevCMillisProvider);
        }
    }
    
    @Test
    public void testToDurationTo5() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.toDurationTo] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.chrono.BaseChronology.add(BaseChronology.java:303)
            org.joda.time.base.BasePeriod.toDurationTo(BasePeriod.java:382) */
        mutablePeriod.toDurationTo(dateMidnight);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.mergePeriodInto
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mergePeriodInto([I, org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#size()}
 * @utbot.returnsFrom {@code return values;}
 *  */
    @Test
    public void testMergePeriodInto_ReturnValues() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType);
        
        int[] actual = mutablePeriod.mergePeriodInto(null, mutablePeriod1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mergePeriodInto([I, org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkAndUpdate(type, values, value);
 *  */
    @Test
    public void testMergePeriodInto_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {};
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {0};
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:403)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        mutablePeriod.mergePeriodInto(intArray, mutablePeriod1);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int value = period.getValue(i);
 *  */
    @Test
    public void testMergePeriodInto_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] iValues = {};
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:556) */
        mutablePeriod.mergePeriodInto(null, mutablePeriod);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, isize = period.size(); i < isize; i++)
 *  */
    @Test
    public void testMergePeriodInto_ThrowNullPointerException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:554) */
        mutablePeriod.mergePeriodInto(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkAndUpdate(type, values, value);
 *  */
    @Test
    public void testMergePeriodInto_ThrowNullPointerException_1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {0};
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:403)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        mutablePeriod.mergePeriodInto(null, mutablePeriod1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mergePeriodInto([I, org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#mergePeriodInto(int[],org.joda.time.ReadablePeriod)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#size()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkAndUpdate(type, values, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMergePeriodInto_ThrowIllegalArgumentException() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {1};
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        mutablePeriod.mergePeriodInto(null, mutablePeriod1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mergePeriodInto([I, org.joda.time.ReadablePeriod)
    
    @Test
    public void testMergePeriodInto1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = new int[11];
        iValues[2] = 3;
        iValues[3] = 3;
        iValues[4] = 3;
        iValues[5] = 3;
        iValues[6] = 3;
        iValues[7] = 3;
        iValues[8] = 3;
        iValues[9] = 3;
        iValues[10] = 3;
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        int[] actual = mutablePeriod.mergePeriodInto(intArray, mutablePeriod1);
        
        assertArrayEquals(intArray, actual);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes0 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 0));
        
        int finalIntArray0 = intArray[0];
        
        PeriodType mutablePeriod1IType = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1ITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes0 = ((DurationFieldType) get(mutablePeriod1ITypeITypeITypes, 0));
        PeriodType mutablePeriod1IType1 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes2 = ((DurationFieldType) get(mutablePeriod1IType1ITypeITypes, 2));
        PeriodType mutablePeriod1IType2 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes3 = ((DurationFieldType) get(mutablePeriod1IType2ITypeITypes, 3));
        PeriodType mutablePeriod1IType3 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes4 = ((DurationFieldType) get(mutablePeriod1IType3ITypeITypes, 4));
        PeriodType mutablePeriod1IType4 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes5 = ((DurationFieldType) get(mutablePeriod1IType4ITypeITypes, 5));
        PeriodType mutablePeriod1IType5 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType5, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes6 = ((DurationFieldType) get(mutablePeriod1IType5ITypeITypes, 6));
        PeriodType mutablePeriod1IType6 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType6, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes7 = ((DurationFieldType) get(mutablePeriod1IType6ITypeITypes, 7));
        PeriodType mutablePeriod1IType7 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType7, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes8 = ((DurationFieldType) get(mutablePeriod1IType7ITypeITypes, 8));
        PeriodType mutablePeriod1IType8 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType8ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType8, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes9 = ((DurationFieldType) get(mutablePeriod1IType8ITypeITypes, 9));
        PeriodType mutablePeriod1IType9 = ((PeriodType) getFieldValue(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriod1IType9ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriod1IType9, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriod1ITypeITypes10 = ((DurationFieldType) get(mutablePeriod1IType9ITypeITypes, 10));
        
        assertNull(finalMutablePeriodITypeITypes0);
        
        assertEquals(3, finalIntArray0);
        
        assertNull(finalMutablePeriod1ITypeITypes0);
        
        assertNull(finalMutablePeriod1ITypeITypes2);
        
        assertNull(finalMutablePeriod1ITypeITypes3);
        
        assertNull(finalMutablePeriod1ITypeITypes4);
        
        assertNull(finalMutablePeriod1ITypeITypes5);
        
        assertNull(finalMutablePeriod1ITypeITypes6);
        
        assertNull(finalMutablePeriod1ITypeITypes7);
        
        assertNull(finalMutablePeriod1ITypeITypes8);
        
        assertNull(finalMutablePeriod1ITypeITypes9);
        
        assertNull(finalMutablePeriod1ITypeITypes10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mergePeriodInto([I, org.joda.time.ReadablePeriod)
    
    @Test
    public void testMergePeriodInto2() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:115)
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:396)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodIntoMethod = basePeriodClazz.getDeclaredMethod("mergePeriodInto", intArrayType, daysType);
        mergePeriodIntoMethod.setAccessible(true);
        java.lang.Object[] mergePeriodIntoMethodArguments = new java.lang.Object[2];
        mergePeriodIntoMethodArguments[0] = ((Object) intArray);
        mergePeriodIntoMethodArguments[1] = days;
        try {
            mergePeriodIntoMethod.invoke(mutablePeriod, mergePeriodIntoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMergePeriodInto3() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:115)
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:396)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodIntoMethod = basePeriodClazz.getDeclaredMethod("mergePeriodInto", intArrayType, secondsType);
        mergePeriodIntoMethod.setAccessible(true);
        java.lang.Object[] mergePeriodIntoMethodArguments = new java.lang.Object[2];
        mergePeriodIntoMethodArguments[0] = ((Object) null);
        mergePeriodIntoMethodArguments[1] = seconds;
        try {
            mergePeriodIntoMethod.invoke(mutablePeriod, mergePeriodIntoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMergePeriodInto4() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:115)
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:396)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodIntoMethod = basePeriodClazz.getDeclaredMethod("mergePeriodInto", intArrayType, minutesType);
        mergePeriodIntoMethod.setAccessible(true);
        java.lang.Object[] mergePeriodIntoMethodArguments = new java.lang.Object[2];
        mergePeriodIntoMethodArguments[0] = ((Object) null);
        mergePeriodIntoMethodArguments[1] = minutes;
        try {
            mergePeriodIntoMethod.invoke(mutablePeriod, mergePeriodIntoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMergePeriodInto5() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:115)
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:396)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodIntoMethod = basePeriodClazz.getDeclaredMethod("mergePeriodInto", intArrayType, hoursType);
        mergePeriodIntoMethod.setAccessible(true);
        java.lang.Object[] mergePeriodIntoMethodArguments = new java.lang.Object[2];
        mergePeriodIntoMethodArguments[0] = ((Object) null);
        mergePeriodIntoMethodArguments[1] = hours;
        try {
            mergePeriodIntoMethod.invoke(mutablePeriod, mergePeriodIntoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMergePeriodInto6() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.AbstractPeriod.indexOf(AbstractPeriod.java:115)
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:396)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class intArrayType = Class.forName("[I");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method mergePeriodIntoMethod = basePeriodClazz.getDeclaredMethod("mergePeriodInto", intArrayType, weeksType);
        mergePeriodIntoMethod.setAccessible(true);
        java.lang.Object[] mergePeriodIntoMethodArguments = new java.lang.Object[2];
        mergePeriodIntoMethodArguments[0] = ((Object) null);
        mergePeriodIntoMethodArguments[1] = weeks;
        try {
            mergePeriodIntoMethod.invoke(mutablePeriod, mergePeriodIntoMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMergePeriodInto7() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[11];
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = new int[11];
        iValues[3] = 3;
        iValues[4] = 3;
        iValues[5] = 3;
        iValues[6] = 3;
        iValues[7] = 3;
        iValues[8] = 3;
        iValues[9] = 3;
        iValues[10] = 3;
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.mergePeriodInto] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:400)
            org.joda.time.base.BasePeriod.mergePeriodInto(BasePeriod.java:557) */
        mutablePeriod.mergePeriodInto(intArray, mutablePeriod1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method mergePeriodInto([I, org.joda.time.ReadablePeriod)
    
    @Test(expected = IllegalArgumentException.class)
    public void testMergePeriodInto8() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null, null, null, null, null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[2];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes1[1] = ((DurationFieldType) standardDurationFieldType);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {0, 3};
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        mutablePeriod.mergePeriodInto(null, mutablePeriod1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setPeriodInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setPeriodInternal(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setPeriodInternal(org.joda.time.ReadablePeriod)}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#size()}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, isize = period.size(); i < isize; i++)
 *  */
    @Test
    public void testSetPeriodInternal_ThrowNullPointerException() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setPeriodInternal] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:427) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class readablePeriodType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", readablePeriodType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = ((Object) null);
        try {
            setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPeriodInternal(org.joda.time.ReadablePeriod)
    
    @Test
    public void testSetPeriodInternal1() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class secondsType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", secondsType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = seconds;
        setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
    }
    
    @Test
    public void testSetPeriodInternal2() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class minutesType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", minutesType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = minutes;
        setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
    }
    
    @Test
    public void testSetPeriodInternal3() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class hoursType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", hoursType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = hours;
        setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
    }
    
    @Test
    public void testSetPeriodInternal4() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Days days = ((Days) createInstance("org.joda.time.Days"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class daysType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", daysType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = days;
        setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
    }
    
    @Test
    public void testSetPeriodInternal5() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class weeksType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", weeksType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = weeks;
        setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
    }
    
    @Test
    public void testSetPeriodInternal6() throws Exception  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[6];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[10];
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class periodType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", periodType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = period;
        setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
        
        PeriodType mutablePeriodIType = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes1 = ((DurationFieldType) get(mutablePeriodITypeITypeITypes, 1));
        PeriodType mutablePeriodIType1 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes2 = ((DurationFieldType) get(mutablePeriodIType1ITypeITypes, 2));
        PeriodType mutablePeriodIType2 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes3 = ((DurationFieldType) get(mutablePeriodIType2ITypeITypes, 3));
        PeriodType mutablePeriodIType3 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes4 = ((DurationFieldType) get(mutablePeriodIType3ITypeITypes, 4));
        PeriodType mutablePeriodIType4 = ((PeriodType) getFieldValue(mutablePeriod, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] mutablePeriodIType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(mutablePeriodIType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalMutablePeriodITypeITypes5 = ((DurationFieldType) get(mutablePeriodIType4ITypeITypes, 5));
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes1 = ((DurationFieldType) get(periodITypeITypeITypes, 1));
        PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes2 = ((DurationFieldType) get(periodIType1ITypeITypes, 2));
        PeriodType periodIType2 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType2, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes3 = ((DurationFieldType) get(periodIType2ITypeITypes, 3));
        PeriodType periodIType3 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType3, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes4 = ((DurationFieldType) get(periodIType3ITypeITypes, 4));
        PeriodType periodIType4 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType4, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes5 = ((DurationFieldType) get(periodIType4ITypeITypes, 5));
        PeriodType periodIType5 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType5, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes6 = ((DurationFieldType) get(periodIType5ITypeITypes, 6));
        PeriodType periodIType6 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType6, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes7 = ((DurationFieldType) get(periodIType6ITypeITypes, 7));
        PeriodType periodIType7 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType7, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes8 = ((DurationFieldType) get(periodIType7ITypeITypes, 8));
        PeriodType periodIType8 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodIType8ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType8, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes9 = ((DurationFieldType) get(periodIType8ITypeITypes, 9));
        
        assertNull(finalMutablePeriodITypeITypes1);
        
        assertNull(finalMutablePeriodITypeITypes2);
        
        assertNull(finalMutablePeriodITypeITypes3);
        
        assertNull(finalMutablePeriodITypeITypes4);
        
        assertNull(finalMutablePeriodITypeITypes5);
        
        assertNull(finalPeriodITypeITypes1);
        
        assertNull(finalPeriodITypeITypes2);
        
        assertNull(finalPeriodITypeITypes3);
        
        assertNull(finalPeriodITypeITypes4);
        
        assertNull(finalPeriodITypeITypes5);
        
        assertNull(finalPeriodITypeITypes6);
        
        assertNull(finalPeriodITypeITypes7);
        
        assertNull(finalPeriodITypeITypes8);
        
        assertNull(finalPeriodITypeITypes9);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setPeriodInternal(org.joda.time.ReadablePeriod)
    
    @Test
    public void testSetPeriodInternal7() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[4];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[3] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[9];
        iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {0, 0, 0, 0};
        setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setPeriodInternal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4]
            org.joda.time.base.BasePeriod.getValue(BasePeriod.java:335)
            org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:429) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class periodType = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", periodType);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = period;
        try {
            setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetPeriodInternal8() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[4];
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        iTypes[0] = ((DurationFieldType) standardDurationFieldType);
        iTypes[1] = ((DurationFieldType) standardDurationFieldType);
        iTypes[2] = ((DurationFieldType) standardDurationFieldType);
        iTypes[3] = ((DurationFieldType) standardDurationFieldType);
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        MutablePeriod mutablePeriod1 = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes1 = {null, null, null, null, null, null, null, null, null, null};
        setField(iType1, "org.joda.time.PeriodType", "iTypes", iTypes1);
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iType", iType1);
        int[] iValues = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(mutablePeriod1, "org.joda.time.base.BasePeriod", "iValues", iValues);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.setPeriodInternal] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:400)
            org.joda.time.base.BasePeriod.setPeriodInternal(BasePeriod.java:430) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class mutablePeriod1Type = Class.forName("org.joda.time.ReadablePeriod");
        Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", mutablePeriod1Type);
        setPeriodInternalMethod.setAccessible(true);
        java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[1];
        setPeriodInternalMethodArguments[0] = mutablePeriod1;
        try {
            setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.setPeriodInternal
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPeriodInternal(int, int, int, int, int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setPeriodInternal(int,int,int,int,int,int,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkAndUpdate(DurationFieldType.weeks(), newValues, weeks);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriodInternal_ThrowIllegalArgumentException() throws Throwable  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
            
            Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
            Class intType = int.class;
            Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", intType, intType, intType, intType, intType, intType, intType, intType);
            setPeriodInternalMethod.setAccessible(true);
            java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[8];
            setPeriodInternalMethodArguments[0] = 0;
            setPeriodInternalMethodArguments[1] = 0;
            setPeriodInternalMethodArguments[2] = -255;
            setPeriodInternalMethodArguments[3] = -255;
            setPeriodInternalMethodArguments[4] = -255;
            setPeriodInternalMethodArguments[5] = -255;
            setPeriodInternalMethodArguments[6] = -255;
            setPeriodInternalMethodArguments[7] = -255;
            try {
                setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#setPeriodInternal(int,int,int,int,int,int,int,int)}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#days()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#days()}
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.invokes org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkAndUpdate(DurationFieldType.days(), newValues, days);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriodInternal_ThrowIllegalArgumentException_1() throws Throwable  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName3 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            iTypes[0] = ((DurationFieldType) weeksType);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
            
            Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
            Class intType = int.class;
            Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", intType, intType, intType, intType, intType, intType, intType, intType);
            setPeriodInternalMethod.setAccessible(true);
            java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[8];
            setPeriodInternalMethodArguments[0] = 0;
            setPeriodInternalMethodArguments[1] = 0;
            setPeriodInternalMethodArguments[2] = -255;
            setPeriodInternalMethodArguments[3] = -255;
            setPeriodInternalMethodArguments[4] = -255;
            setPeriodInternalMethodArguments[5] = -255;
            setPeriodInternalMethodArguments[6] = -255;
            setPeriodInternalMethodArguments[7] = -255;
            try {
                setPeriodInternalMethod.invoke(mutablePeriod, setPeriodInternalMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setPeriodInternal(int, int, int, int, int, int, int, int)
    
    @Test
    public void testSetPeriodInternal9() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[15];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[1] = ((DurationFieldType) standardDurationFieldType);
            iTypes[2] = ((DurationFieldType) yearsType);
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[3] = ((DurationFieldType) standardDurationFieldType1);
            Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[4] = ((DurationFieldType) standardDurationFieldType2);
            Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[5] = ((DurationFieldType) standardDurationFieldType3);
            Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[6] = ((DurationFieldType) standardDurationFieldType4);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
            Class intType = int.class;
            Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", intType, intType, intType, intType, intType, intType, intType, intType);
            setPeriodInternalMethod.setAccessible(true);
            java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[8];
            setPeriodInternalMethodArguments[0] = 0;
            setPeriodInternalMethodArguments[1] = 0;
            setPeriodInternalMethodArguments[2] = 0;
            setPeriodInternalMethodArguments[3] = 0;
            setPeriodInternalMethodArguments[4] = 0;
            setPeriodInternalMethodArguments[5] = 0;
            setPeriodInternalMethodArguments[6] = 0;
            setPeriodInternalMethodArguments[7] = 0;
            setPeriodInternalMethod.invoke(period, setPeriodInternalMethodArguments);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
            PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes7 = ((DurationFieldType) get(periodIType1ITypeITypes, 7));
            PeriodType periodIType2 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType2, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes8 = ((DurationFieldType) get(periodIType2ITypeITypes, 8));
            PeriodType periodIType3 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType3ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType3, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes9 = ((DurationFieldType) get(periodIType3ITypeITypes, 9));
            PeriodType periodIType4 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType4ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType4, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes10 = ((DurationFieldType) get(periodIType4ITypeITypes, 10));
            PeriodType periodIType5 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType5ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType5, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes11 = ((DurationFieldType) get(periodIType5ITypeITypes, 11));
            PeriodType periodIType6 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType6ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType6, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes12 = ((DurationFieldType) get(periodIType6ITypeITypes, 12));
            PeriodType periodIType7 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType7ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType7, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes13 = ((DurationFieldType) get(periodIType7ITypeITypes, 13));
            PeriodType periodIType8 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType8ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType8, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes14 = ((DurationFieldType) get(periodIType8ITypeITypes, 14));
            
            assertNull(finalPeriodITypeITypes0);
            
            assertNull(finalPeriodITypeITypes7);
            
            assertNull(finalPeriodITypeITypes8);
            
            assertNull(finalPeriodITypeITypes9);
            
            assertNull(finalPeriodITypeITypes10);
            
            assertNull(finalPeriodITypeITypes11);
            
            assertNull(finalPeriodITypeITypes12);
            
            assertNull(finalPeriodITypeITypes13);
            
            assertNull(finalPeriodITypeITypes14);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
        }
    }
    
    @Test
    public void testSetPeriodInternal10() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[11];
            iTypes[0] = ((DurationFieldType) yearsType);
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[1] = ((DurationFieldType) standardDurationFieldType);
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[2] = ((DurationFieldType) standardDurationFieldType1);
            Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[4] = ((DurationFieldType) standardDurationFieldType2);
            iTypes[5] = ((DurationFieldType) standardDurationFieldType2);
            Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[6] = ((DurationFieldType) standardDurationFieldType3);
            Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[7] = ((DurationFieldType) standardDurationFieldType4);
            iTypes[8] = ((DurationFieldType) standardDurationFieldType3);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
            Class intType = int.class;
            Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", intType, intType, intType, intType, intType, intType, intType, intType);
            setPeriodInternalMethod.setAccessible(true);
            java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[8];
            setPeriodInternalMethodArguments[0] = 0;
            setPeriodInternalMethodArguments[1] = 0;
            setPeriodInternalMethodArguments[2] = 0;
            setPeriodInternalMethodArguments[3] = 0;
            setPeriodInternalMethodArguments[4] = 0;
            setPeriodInternalMethodArguments[5] = 0;
            setPeriodInternalMethodArguments[6] = 0;
            setPeriodInternalMethodArguments[7] = 0;
            setPeriodInternalMethod.invoke(period, setPeriodInternalMethodArguments);
            
            PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes3 = ((DurationFieldType) get(periodITypeITypeITypes, 3));
            PeriodType periodIType1 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType1ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType1, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes9 = ((DurationFieldType) get(periodIType1ITypeITypes, 9));
            PeriodType periodIType2 = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
            org.joda.time.DurationFieldType[] periodIType2ITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType2, "org.joda.time.PeriodType", "iTypes"));
            DurationFieldType finalPeriodITypeITypes10 = ((DurationFieldType) get(periodIType2ITypeITypes, 10));
            
            assertNull(finalPeriodITypeITypes3);
            
            assertNull(finalPeriodITypeITypes9);
            
            assertNull(finalPeriodITypeITypes10);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
        }
    }
    
    @Test
    public void testSetPeriodInternal11() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName3 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName4 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName4);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = {};
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
            Class intType = int.class;
            Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", intType, intType, intType, intType, intType, intType, intType, intType);
            setPeriodInternalMethod.setAccessible(true);
            java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[8];
            setPeriodInternalMethodArguments[0] = 0;
            setPeriodInternalMethodArguments[1] = 0;
            setPeriodInternalMethodArguments[2] = 0;
            setPeriodInternalMethodArguments[3] = 0;
            setPeriodInternalMethodArguments[4] = 0;
            setPeriodInternalMethodArguments[5] = 0;
            setPeriodInternalMethodArguments[6] = 0;
            setPeriodInternalMethodArguments[7] = 0;
            setPeriodInternalMethod.invoke(period, setPeriodInternalMethodArguments);
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setPeriodInternal(int, int, int, int, int, int, int, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetPeriodInternal12() throws Throwable  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName = "";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName1 = "";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName2 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Period period = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[5];
            iTypes[0] = ((DurationFieldType) yearsType);
            iTypes[3] = ((DurationFieldType) monthsType);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
            setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
            
            Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
            Class intType = int.class;
            Method setPeriodInternalMethod = basePeriodClazz.getDeclaredMethod("setPeriodInternal", intType, intType, intType, intType, intType, intType, intType, intType);
            setPeriodInternalMethod.setAccessible(true);
            java.lang.Object[] setPeriodInternalMethodArguments = new java.lang.Object[8];
            setPeriodInternalMethodArguments[0] = -255;
            setPeriodInternalMethodArguments[1] = -255;
            setPeriodInternalMethodArguments[2] = -255;
            setPeriodInternalMethodArguments[3] = -255;
            setPeriodInternalMethodArguments[4] = -255;
            setPeriodInternalMethodArguments[5] = -255;
            setPeriodInternalMethodArguments[6] = -255;
            setPeriodInternalMethodArguments[7] = -255;
            try {
                setPeriodInternalMethod.invoke(period, setPeriodInternalMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BasePeriod.checkAndUpdate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkAndUpdate(org.joda.time.DurationFieldType, [I, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)}
 *  */
    @Test
    public void testCheckAndUpdate() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {-255};
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class durationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intArrayType = Class.forName("[I");
        Class intType = int.class;
        Method checkAndUpdateMethod = basePeriodClazz.getDeclaredMethod("checkAndUpdate", durationFieldTypeType, intArrayType, intType);
        checkAndUpdateMethod.setAccessible(true);
        java.lang.Object[] checkAndUpdateMethodArguments = new java.lang.Object[3];
        checkAndUpdateMethodArguments[0] = ((Object) null);
        checkAndUpdateMethodArguments[1] = ((Object) intArray);
        checkAndUpdateMethodArguments[2] = -255;
        checkAndUpdateMethod.invoke(period, checkAndUpdateMethodArguments);
        
        PeriodType periodIType = ((PeriodType) getFieldValue(period, "org.joda.time.base.BasePeriod", "iType"));
        org.joda.time.DurationFieldType[] periodITypeITypeITypes = ((org.joda.time.DurationFieldType[]) getFieldValue(periodIType, "org.joda.time.PeriodType", "iTypes"));
        DurationFieldType finalPeriodITypeITypes0 = ((DurationFieldType) get(periodITypeITypeITypes, 0));
        
        assertNull(finalPeriodITypeITypes0);
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)}
 * @utbot.executesCondition {@code (newValue != 0): False}
 *  */
    @Test
    public void testCheckAndUpdate_NewValueEqualsZero() throws Exception  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class durationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intArrayType = Class.forName("[I");
        Class intType = int.class;
        Method checkAndUpdateMethod = basePeriodClazz.getDeclaredMethod("checkAndUpdate", durationFieldTypeType, intArrayType, intType);
        checkAndUpdateMethod.setAccessible(true);
        java.lang.Object[] checkAndUpdateMethodArguments = new java.lang.Object[3];
        checkAndUpdateMethodArguments[0] = ((Object) null);
        checkAndUpdateMethodArguments[1] = ((Object) null);
        checkAndUpdateMethodArguments[2] = 0;
        checkAndUpdateMethod.invoke(period, checkAndUpdateMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkAndUpdate(org.joda.time.DurationFieldType, [I, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: values[index] = newValue;
 *  */
    @Test
    public void testCheckAndUpdate_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        int[] intArray = {};
        
        /* This test fails because method [org.joda.time.base.BasePeriod.checkAndUpdate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:403) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class durationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intArrayType = Class.forName("[I");
        Class intType = int.class;
        Method checkAndUpdateMethod = basePeriodClazz.getDeclaredMethod("checkAndUpdate", durationFieldTypeType, intArrayType, intType);
        checkAndUpdateMethod.setAccessible(true);
        java.lang.Object[] checkAndUpdateMethodArguments = new java.lang.Object[3];
        checkAndUpdateMethodArguments[0] = ((Object) null);
        checkAndUpdateMethodArguments[1] = ((Object) intArray);
        checkAndUpdateMethodArguments[2] = -255;
        try {
            checkAndUpdateMethod.invoke(mutablePeriod, checkAndUpdateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)}
 * @utbot.executesCondition {@code (newValue != 0): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: "Period does not support field '" + type.getName() + "'"
 *  */
    @Test
    public void testCheckAndUpdate_ThrowNullPointerException() throws Throwable  {
        Period period = ((Period) createInstance("org.joda.time.Period"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(period, "org.joda.time.base.BasePeriod", "iType", iType);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.checkAndUpdate] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:400) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class durationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intArrayType = Class.forName("[I");
        Class intType = int.class;
        Method checkAndUpdateMethod = basePeriodClazz.getDeclaredMethod("checkAndUpdate", durationFieldTypeType, intArrayType, intType);
        checkAndUpdateMethod.setAccessible(true);
        java.lang.Object[] checkAndUpdateMethodArguments = new java.lang.Object[3];
        checkAndUpdateMethodArguments[0] = ((Object) null);
        checkAndUpdateMethodArguments[1] = ((Object) null);
        checkAndUpdateMethodArguments[2] = -255;
        try {
            checkAndUpdateMethod.invoke(period, checkAndUpdateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: values[index] = newValue;
 *  */
    @Test
    public void testCheckAndUpdate_ThrowNullPointerException_1() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        /* This test fails because method [org.joda.time.base.BasePeriod.checkAndUpdate] produces [java.lang.NullPointerException]
            org.joda.time.base.BasePeriod.checkAndUpdate(BasePeriod.java:403) */
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class durationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intArrayType = Class.forName("[I");
        Class intType = int.class;
        Method checkAndUpdateMethod = basePeriodClazz.getDeclaredMethod("checkAndUpdate", durationFieldTypeType, intArrayType, intType);
        checkAndUpdateMethod.setAccessible(true);
        java.lang.Object[] checkAndUpdateMethodArguments = new java.lang.Object[3];
        checkAndUpdateMethodArguments[0] = ((Object) null);
        checkAndUpdateMethodArguments[1] = ((Object) null);
        checkAndUpdateMethodArguments[2] = -255;
        try {
            checkAndUpdateMethod.invoke(mutablePeriod, checkAndUpdateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkAndUpdate(org.joda.time.DurationFieldType, [I, int)
    
    /**
    @utbot.classUnderTest {@link BasePeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BasePeriod#checkAndUpdate(org.joda.time.DurationFieldType,int[],int)}
 * @utbot.executesCondition {@code (newValue != 0): True}
 * @utbot.invokes {@link org.joda.time.base.BasePeriod#indexOf(org.joda.time.DurationFieldType)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: "Period does not support field '" + type.getName() + "'"
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckAndUpdate_ThrowIllegalArgumentException() throws Throwable  {
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {null};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        
        Class basePeriodClazz = Class.forName("org.joda.time.base.BasePeriod");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Class intArrayType = Class.forName("[I");
        Class intType = int.class;
        Method checkAndUpdateMethod = basePeriodClazz.getDeclaredMethod("checkAndUpdate", standardDurationFieldTypeType, intArrayType, intType);
        checkAndUpdateMethod.setAccessible(true);
        java.lang.Object[] checkAndUpdateMethodArguments = new java.lang.Object[3];
        checkAndUpdateMethodArguments[0] = standardDurationFieldType;
        checkAndUpdateMethodArguments[1] = ((Object) null);
        checkAndUpdateMethodArguments[2] = -255;
        try {
            checkAndUpdateMethod.invoke(mutablePeriod, checkAndUpdateMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1055347286743799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1055347286743799.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1055347286749600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1055347286743799.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1055347286749600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1055347287111100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1055347287111100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1055347287116700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1055347287111100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1055347287116700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1055347287704699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1055347287704699.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1055347287706099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1055347287704699.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1055347287706099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1055347288218000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1055347288218000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1055347288219500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1055347288218000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1055347288219500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

