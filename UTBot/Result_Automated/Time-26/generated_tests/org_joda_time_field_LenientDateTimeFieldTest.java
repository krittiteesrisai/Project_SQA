package org.joda.time.field;

import org.junit.Test;
import org.joda.time.DateTimeField;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.DurationField;
import java.lang.reflect.Method;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.chrono.LenientChronology;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_joda_time_field_LenientDateTimeFieldTest {
    ///region Test suites for executable org.joda.time.field.LenientDateTimeField.getInstance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstance(org.joda.time.DateTimeField, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetInstance_FieldEqualsNull() {
        DateTimeField actual = LenientDateTimeField.getInstance(null, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (field instanceof StrictDateTimeField): True}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testGetInstance_FieldInstanceOfStrictDateTimeField_1() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        LenientDateTimeField iField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(strictDateTimeField, null));
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertNull(actualIField);
        
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIType);
        
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (field instanceof StrictDateTimeField): False}
 * @utbot.returnsFrom {@code return new LenientDateTimeField(field, base);}
 *  */
    @Test
    public void testGetInstance_NotFieldNotInstanceOfStrictDateTimeField_1() throws Exception  {
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", iType);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(unsupportedDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", unsupportedDateTimeField);
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeFieldType expectedIFieldIType = ((DateTimeFieldType) getFieldValue(expectedIField, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedIFieldITypeIOrdinal = ((Byte) getFieldValue(expectedIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIFieldITypeIOrdinal = ((Byte) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedIFieldITypeIOrdinal, actualIFieldITypeIOrdinal);
        
        DurationFieldType actualIFieldITypeIUnitType = ((DurationFieldType) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        assertNull(actualIFieldITypeIUnitType);
        
        DurationFieldType actualIFieldITypeIRangeType = ((DurationFieldType) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        assertNull(actualIFieldITypeIRangeType);
        
        String actualIFieldITypeIName = ((String) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertNull(actualIFieldITypeIName);
        
        DurationField actualIFieldIDurationField = ((DurationField) getFieldValue(actualIField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        assertNull(actualIFieldIDurationField);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertTrue(deepEquals(expectedIType, actualIType));
        assertTrue(deepEquals(expectedIType, actualIType));
        assertTrue(deepEquals(expectedIType, actualIType));
        assertTrue(deepEquals(expectedIType, actualIType));
        
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (field instanceof StrictDateTimeField): False}
 * @utbot.returnsFrom {@code return new LenientDateTimeField(field, base);}
 *  */
    @Test
    public void testGetInstance_NotFieldNotInstanceOfStrictDateTimeField() throws Exception  {
        DelegatedDateTimeField delegatedDateTimeField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        UnsupportedDateTimeField iField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(delegatedDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(delegatedDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", delegatedDateTimeField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeFieldType actualIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIField, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        assertNull(actualIFieldIFieldIType);
        
        DurationField actualIFieldIFieldIDurationField = ((DurationField) getFieldValue(actualIFieldIField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        assertNull(actualIFieldIFieldIDurationField);
        
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (field instanceof StrictDateTimeField): False}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testGetInstance_NotFieldNotInstanceOfStrictDateTimeField_2() throws Exception  {
        DelegatedDateTimeField delegatedDateTimeField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField1 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField2 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        LenientDateTimeField iField3 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(delegatedDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        DelegatedDateTimeField actual = ((DelegatedDateTimeField) LenientDateTimeField.getInstance(delegatedDateTimeField, null));
        
        DateTimeField delegatedDateTimeFieldIField = ((DateTimeField) getFieldValue(delegatedDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIChronology = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIFieldIChronology);
        
        int delegatedDateTimeFieldIFieldISkip = ((Integer) getFieldValue(delegatedDateTimeFieldIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldISkip = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(delegatedDateTimeFieldIFieldISkip, actualIFieldISkip);
        
        int delegatedDateTimeFieldIFieldIMinValue = ((Integer) getFieldValue(delegatedDateTimeFieldIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIMinValue = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(delegatedDateTimeFieldIFieldIMinValue, actualIFieldIMinValue);
        
        DateTimeField delegatedDateTimeFieldIFieldIField = ((DateTimeField) getFieldValue(delegatedDateTimeFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIField, actualIFieldIField));
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIField, actualIFieldIField));
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIField, actualIFieldIField));
        DateTimeField delegatedDateTimeFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(delegatedDateTimeFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIFieldIField, actualIFieldIFieldIField));
        DateTimeField delegatedDateTimeFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(delegatedDateTimeFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIFieldIFieldIFieldIBase = ((Chronology) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.LenientDateTimeField", "iBase"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIBase, actualIFieldIFieldIFieldIFieldIBase));
        
        DateTimeField actualIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIFieldIField));
        
        DateTimeFieldType actualIFieldIFieldIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIType, actualIFieldIFieldIFieldIFieldIType));
        
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIFieldIField, actualIFieldIFieldIField));
        
        assertTrue(deepEquals(delegatedDateTimeFieldIFieldIField, actualIFieldIField));
        
        assertTrue(deepEquals(delegatedDateTimeFieldIField, actualIField));
        
        assertTrue(deepEquals(delegatedDateTimeField, actual));
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (field instanceof StrictDateTimeField): True}
 * @utbot.returnsFrom {@code return new LenientDateTimeField(field, base);}
 *  */
    @Test
    public void testGetInstance_FieldInstanceOfStrictDateTimeField() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipDateTimeField iField1 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField2 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField3 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        UnsupportedDateTimeField iField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(iField3, "org.joda.time.field.DelegatedDateTimeField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(strictDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIFieldIChronology = ((Chronology) getFieldValue(actualIFieldIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIFieldIFieldIChronology);
        
        int expectedIFieldIFieldISkip = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldIFieldISkip = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(expectedIFieldIFieldISkip, actualIFieldIFieldISkip);
        
        int expectedIFieldIFieldIMinValue = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIFieldIMinValue = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIFieldIMinValue, actualIFieldIFieldIMinValue);
        
        DateTimeField expectedIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        DateTimeField expectedIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIField));
        DateTimeField expectedIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIFieldIField));
        
        DateTimeFieldType actualIFieldIFieldIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIType, actualIFieldIFieldIFieldIFieldIType));
        
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        
        DateTimeFieldType expectedIFieldIType = ((DateTimeFieldType) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        byte expectedIFieldITypeIOrdinal = ((Byte) getFieldValue(expectedIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIFieldITypeIOrdinal = ((Byte) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedIFieldITypeIOrdinal, actualIFieldITypeIOrdinal);
        
        DurationFieldType actualIFieldITypeIUnitType = ((DurationFieldType) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        assertNull(actualIFieldITypeIUnitType);
        
        DurationFieldType actualIFieldITypeIRangeType = ((DurationFieldType) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        assertNull(actualIFieldITypeIRangeType);
        
        String actualIFieldITypeIName = ((String) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertNull(actualIFieldITypeIName);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (field instanceof StrictDateTimeField): False}
 * @utbot.returnsFrom {@code return new LenientDateTimeField(field, base);}
 *  */
    @Test
    public void testGetInstance_NotFieldNotInstanceOfStrictDateTimeField_3() throws Exception  {
        SkipDateTimeField skipDateTimeField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField1 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField2 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField3 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField4 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField5 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField6 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField7 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        StrictDateTimeField iField8 = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(iField7, "org.joda.time.field.DelegatedDateTimeField", "iField", iField8);
        setField(iField6, "org.joda.time.field.DelegatedDateTimeField", "iField", iField7);
        setField(iField5, "org.joda.time.field.DelegatedDateTimeField", "iField", iField6);
        setField(iField4, "org.joda.time.field.DelegatedDateTimeField", "iField", iField5);
        setField(iField3, "org.joda.time.field.DelegatedDateTimeField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(skipDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", skipDateTimeField);
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIChronology = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldISkip = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldISkip = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(expectedIFieldISkip, actualIFieldISkip);
        
        int expectedIFieldIMinValue = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIMinValue = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIMinValue, actualIFieldIMinValue);
        
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        DateTimeField expectedIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        DateTimeField expectedIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIFieldIFieldIFieldIChronology = ((Chronology) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iChronology"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIChronology, actualIFieldIFieldIFieldIFieldIChronology));
        
        int expectedIFieldIFieldIFieldIFieldISkip = ((Integer) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        int actualIFieldIFieldIFieldIFieldISkip = ((Integer) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldISkip, actualIFieldIFieldIFieldIFieldISkip));
        
        int expectedIFieldIFieldIFieldIFieldIMinValue = ((Integer) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        int actualIFieldIFieldIFieldIFieldIMinValue = ((Integer) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIMinValue, actualIFieldIFieldIFieldIFieldIMinValue));
        
        DateTimeField expectedIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIFieldIField));
        
        DateTimeFieldType actualIFieldIFieldIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIType, actualIFieldIFieldIFieldIFieldIType));
        
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        
        DateTimeFieldType expectedIFieldIType = ((DateTimeFieldType) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        byte expectedIFieldITypeIOrdinal = ((Byte) getFieldValue(expectedIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIFieldITypeIOrdinal = ((Byte) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedIFieldITypeIOrdinal, actualIFieldITypeIOrdinal);
        
        DurationFieldType actualIFieldITypeIUnitType = ((DurationFieldType) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        assertNull(actualIFieldITypeIUnitType);
        
        DurationFieldType actualIFieldITypeIRangeType = ((DurationFieldType) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        assertNull(actualIFieldITypeIRangeType);
        
        String actualIFieldITypeIName = ((String) getFieldValue(actualIFieldIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertNull(actualIFieldITypeIName);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getInstance(org.joda.time.DateTimeField, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#getInstance(org.joda.time.DateTimeField,org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (field instanceof StrictDateTimeField): True}
 * @utbot.invokes {@link org.joda.time.field.StrictDateTimeField#getWrappedField()}
 * @utbot.invokes {@link org.joda.time.DateTimeField#isLenient()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: field.isLenient()
 *  */
    @Test
    public void testGetInstance_ThrowNullPointerException() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.getInstance] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.getInstance(LenientDateTimeField.java:50) */
        LenientDateTimeField.getInstance(strictDateTimeField, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance(org.joda.time.DateTimeField, org.joda.time.Chronology)
    
    @Test
    public void testGetInstance1() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        StrictDateTimeField iField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(strictDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertNull(actualIFieldIField);
        
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetInstance2() throws Exception  {
        Object basicMonthOfYearDateTimeField = createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        
        Class lenientDateTimeFieldClazz = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class basicMonthOfYearDateTimeFieldType = Class.forName("org.joda.time.DateTimeField");
        Class chronologyType = Class.forName("org.joda.time.Chronology");
        Method getInstanceMethod = lenientDateTimeFieldClazz.getDeclaredMethod("getInstance", basicMonthOfYearDateTimeFieldType, chronologyType);
        getInstanceMethod.setAccessible(true);
        java.lang.Object[] getInstanceMethodArguments = new java.lang.Object[2];
        getInstanceMethodArguments[0] = basicMonthOfYearDateTimeField;
        getInstanceMethodArguments[1] = ((Object) null);
        LenientDateTimeField actual = ((LenientDateTimeField) getInstanceMethod.invoke(null, getInstanceMethodArguments));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", basicMonthOfYearDateTimeField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Object actualIFieldIChronology = getFieldValue(actualIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology");
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldIMax = ((Integer) getFieldValue(expectedIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        int actualIFieldIMax = ((Integer) getFieldValue(actualIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        assertEquals(expectedIFieldIMax, actualIFieldIMax);
        
        int expectedIFieldILeapMonth = ((Integer) getFieldValue(expectedIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        int actualIFieldILeapMonth = ((Integer) getFieldValue(actualIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        assertEquals(expectedIFieldILeapMonth, actualIFieldILeapMonth);
        
        long expectedIFieldIUnitMillis = ((Long) getFieldValue(expectedIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        long actualIFieldIUnitMillis = ((Long) getFieldValue(actualIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        assertEquals(expectedIFieldIUnitMillis, actualIFieldIUnitMillis);
        
        DurationField actualIFieldIDurationField = ((DurationField) getFieldValue(actualIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        assertNull(actualIFieldIDurationField);
        
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIType);
        
    }
    
    @Test
    public void testGetInstance3() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        Object iField = createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(strictDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Object actualIFieldIChronology = getFieldValue(actualIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology");
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldIMax = ((Integer) getFieldValue(expectedIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        int actualIFieldIMax = ((Integer) getFieldValue(actualIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        assertEquals(expectedIFieldIMax, actualIFieldIMax);
        
        int expectedIFieldILeapMonth = ((Integer) getFieldValue(expectedIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        int actualIFieldILeapMonth = ((Integer) getFieldValue(actualIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        assertEquals(expectedIFieldILeapMonth, actualIFieldILeapMonth);
        
        long expectedIFieldIUnitMillis = ((Long) getFieldValue(expectedIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        long actualIFieldIUnitMillis = ((Long) getFieldValue(actualIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        assertEquals(expectedIFieldIUnitMillis, actualIFieldIUnitMillis);
        
        DurationField actualIFieldIDurationField = ((DurationField) getFieldValue(actualIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        assertNull(actualIFieldIDurationField);
        
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIType);
        
    }
    
    @Test
    public void testGetInstance4() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        Object iField1 = createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(strictDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Object actualIFieldIFieldIChronology = getFieldValue(actualIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology");
        assertNull(actualIFieldIFieldIChronology);
        
        int expectedIFieldIFieldIMax = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        int actualIFieldIFieldIMax = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        assertEquals(expectedIFieldIFieldIMax, actualIFieldIFieldIMax);
        
        int expectedIFieldIFieldILeapMonth = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        int actualIFieldIFieldILeapMonth = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        assertEquals(expectedIFieldIFieldILeapMonth, actualIFieldIFieldILeapMonth);
        
        long expectedIFieldIFieldIUnitMillis = ((Long) getFieldValue(expectedIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        long actualIFieldIFieldIUnitMillis = ((Long) getFieldValue(actualIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        assertEquals(expectedIFieldIFieldIUnitMillis, actualIFieldIFieldIUnitMillis);
        
        DurationField actualIFieldIFieldIDurationField = ((DurationField) getFieldValue(actualIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        assertNull(actualIFieldIFieldIDurationField);
        
        DateTimeFieldType actualIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        assertNull(actualIFieldIFieldIType);
        
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetInstance5() throws Exception  {
        SkipDateTimeField skipDateTimeField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        Object iField = createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        setField(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(skipDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", skipDateTimeField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIChronology = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldISkip = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldISkip = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(expectedIFieldISkip, actualIFieldISkip);
        
        int expectedIFieldIMinValue = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIMinValue = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIMinValue, actualIFieldIMinValue);
        
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Object actualIFieldIFieldIChronology = getFieldValue(actualIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology");
        assertNull(actualIFieldIFieldIChronology);
        
        int expectedIFieldIFieldIMax = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        int actualIFieldIFieldIMax = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax"));
        assertEquals(expectedIFieldIFieldIMax, actualIFieldIFieldIMax);
        
        int expectedIFieldIFieldILeapMonth = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        int actualIFieldIFieldILeapMonth = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iLeapMonth"));
        assertEquals(expectedIFieldIFieldILeapMonth, actualIFieldIFieldILeapMonth);
        
        long expectedIFieldIFieldIUnitMillis = ((Long) getFieldValue(expectedIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        long actualIFieldIFieldIUnitMillis = ((Long) getFieldValue(actualIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        assertEquals(expectedIFieldIFieldIUnitMillis, actualIFieldIFieldIUnitMillis);
        
        DurationField actualIFieldIFieldIDurationField = ((DurationField) getFieldValue(actualIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        assertNull(actualIFieldIFieldIDurationField);
        
        DateTimeFieldType actualIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        assertNull(actualIFieldIFieldIType);
        
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetInstance6() throws Exception  {
        SkipDateTimeField skipDateTimeField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        UnsupportedDateTimeField iField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(skipDateTimeField, anonymousBaseChronology));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.LenientDateTimeField", "iBase", anonymousBaseChronology);
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", skipDateTimeField);
        
        Chronology expectedIBase = ((Chronology) getFieldValue(expected, "org.joda.time.field.LenientDateTimeField", "iBase"));
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIChronology = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldISkip = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldISkip = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(expectedIFieldISkip, actualIFieldISkip);
        
        int expectedIFieldIMinValue = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIMinValue = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIMinValue, actualIFieldIMinValue);
        
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        DateTimeField expectedIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeFieldType actualIFieldIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        assertNull(actualIFieldIFieldIFieldIType);
        
        DurationField actualIFieldIFieldIFieldIDurationField = ((DurationField) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        assertNull(actualIFieldIFieldIFieldIDurationField);
        
        DateTimeFieldType actualIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIFieldIFieldIType);
        
        assertTrue(deepEquals(expectedIField, actualIField));
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetInstance7() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        SkipUndoDateTimeField iField = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField1 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField2 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipDateTimeField iField3 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField4 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField5 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField6 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField7 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField8 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField9 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField10 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField11 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField12 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField13 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField14 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField15 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField16 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField17 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField18 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField19 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField20 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField21 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField22 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField23 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField24 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField25 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField26 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField27 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField28 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField29 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField30 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField31 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField32 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField33 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField34 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField35 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField36 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField37 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField38 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField39 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField40 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField41 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField42 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField43 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField44 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField45 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        StrictDateTimeField iField46 = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(iField45, "org.joda.time.field.DelegatedDateTimeField", "iField", iField46);
        setField(iField44, "org.joda.time.field.DelegatedDateTimeField", "iField", iField45);
        setField(iField43, "org.joda.time.field.DelegatedDateTimeField", "iField", iField44);
        setField(iField42, "org.joda.time.field.DelegatedDateTimeField", "iField", iField43);
        setField(iField41, "org.joda.time.field.DelegatedDateTimeField", "iField", iField42);
        setField(iField40, "org.joda.time.field.DelegatedDateTimeField", "iField", iField41);
        setField(iField39, "org.joda.time.field.DelegatedDateTimeField", "iField", iField40);
        setField(iField38, "org.joda.time.field.DelegatedDateTimeField", "iField", iField39);
        setField(iField37, "org.joda.time.field.DelegatedDateTimeField", "iField", iField38);
        setField(iField36, "org.joda.time.field.DelegatedDateTimeField", "iField", iField37);
        setField(iField35, "org.joda.time.field.DelegatedDateTimeField", "iField", iField36);
        setField(iField34, "org.joda.time.field.DelegatedDateTimeField", "iField", iField35);
        setField(iField33, "org.joda.time.field.DelegatedDateTimeField", "iField", iField34);
        setField(iField32, "org.joda.time.field.DelegatedDateTimeField", "iField", iField33);
        setField(iField31, "org.joda.time.field.DelegatedDateTimeField", "iField", iField32);
        setField(iField30, "org.joda.time.field.DelegatedDateTimeField", "iField", iField31);
        setField(iField29, "org.joda.time.field.DelegatedDateTimeField", "iField", iField30);
        setField(iField28, "org.joda.time.field.DelegatedDateTimeField", "iField", iField29);
        setField(iField27, "org.joda.time.field.DelegatedDateTimeField", "iField", iField28);
        setField(iField26, "org.joda.time.field.DelegatedDateTimeField", "iField", iField27);
        setField(iField25, "org.joda.time.field.DelegatedDateTimeField", "iField", iField26);
        setField(iField24, "org.joda.time.field.DelegatedDateTimeField", "iField", iField25);
        setField(iField23, "org.joda.time.field.DelegatedDateTimeField", "iField", iField24);
        setField(iField22, "org.joda.time.field.DelegatedDateTimeField", "iField", iField23);
        setField(iField21, "org.joda.time.field.DelegatedDateTimeField", "iField", iField22);
        setField(iField20, "org.joda.time.field.DelegatedDateTimeField", "iField", iField21);
        setField(iField19, "org.joda.time.field.DelegatedDateTimeField", "iField", iField20);
        setField(iField18, "org.joda.time.field.DelegatedDateTimeField", "iField", iField19);
        setField(iField17, "org.joda.time.field.DelegatedDateTimeField", "iField", iField18);
        setField(iField16, "org.joda.time.field.DelegatedDateTimeField", "iField", iField17);
        setField(iField15, "org.joda.time.field.DelegatedDateTimeField", "iField", iField16);
        setField(iField14, "org.joda.time.field.DelegatedDateTimeField", "iField", iField15);
        setField(iField13, "org.joda.time.field.DelegatedDateTimeField", "iField", iField14);
        setField(iField12, "org.joda.time.field.DelegatedDateTimeField", "iField", iField13);
        setField(iField11, "org.joda.time.field.DelegatedDateTimeField", "iField", iField12);
        setField(iField10, "org.joda.time.field.DelegatedDateTimeField", "iField", iField11);
        setField(iField9, "org.joda.time.field.DelegatedDateTimeField", "iField", iField10);
        setField(iField8, "org.joda.time.field.DelegatedDateTimeField", "iField", iField9);
        setField(iField7, "org.joda.time.field.DelegatedDateTimeField", "iField", iField8);
        setField(iField6, "org.joda.time.field.DelegatedDateTimeField", "iField", iField7);
        setField(iField5, "org.joda.time.field.DelegatedDateTimeField", "iField", iField6);
        setField(iField4, "org.joda.time.field.DelegatedDateTimeField", "iField", iField5);
        setField(iField3, "org.joda.time.field.DelegatedDateTimeField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(strictDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIChronology = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.SkipUndoDateTimeField", "iChronology"));
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldISkip = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        int actualIFieldISkip = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        assertEquals(expectedIFieldISkip, actualIFieldISkip);
        
        int expectedIFieldIMinValue = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        int actualIFieldIMinValue = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIMinValue, actualIFieldIMinValue);
        
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField expectedIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField expectedIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIFieldIFieldIFieldIChronology = ((Chronology) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIChronology, actualIFieldIFieldIFieldIFieldIChronology));
        
        int expectedIFieldIFieldIFieldIFieldISkip = ((Integer) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldIFieldIFieldIFieldISkip = ((Integer) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldISkip, actualIFieldIFieldIFieldIFieldISkip));
        
        int expectedIFieldIFieldIFieldIFieldIMinValue = ((Integer) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIFieldIFieldIFieldIMinValue = ((Integer) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIMinValue, actualIFieldIFieldIFieldIFieldIMinValue));
        
        DateTimeField expectedIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIFieldIField));
        
        DateTimeFieldType actualIFieldIFieldIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIType, actualIFieldIFieldIFieldIFieldIType));
        
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        
        assertTrue(deepEquals(expectedIField, actualIField));
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetInstance8() throws Exception  {
        SkipDateTimeField skipDateTimeField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipDateTimeField iField1 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField2 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField3 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField4 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField5 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField6 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField7 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField8 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField9 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField10 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField11 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField12 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField13 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField14 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField15 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField16 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField17 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField18 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField19 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField20 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField21 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField22 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipDateTimeField iField23 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField24 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField25 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField26 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField27 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField28 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField29 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField30 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField31 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField32 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField33 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField34 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField35 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField36 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField37 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField38 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField39 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField40 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField41 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField42 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField43 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        Object iField44 = createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        setField(iField43, "org.joda.time.field.DelegatedDateTimeField", "iField", iField44);
        setField(iField42, "org.joda.time.field.DelegatedDateTimeField", "iField", iField43);
        setField(iField41, "org.joda.time.field.DelegatedDateTimeField", "iField", iField42);
        setField(iField40, "org.joda.time.field.DelegatedDateTimeField", "iField", iField41);
        setField(iField39, "org.joda.time.field.DelegatedDateTimeField", "iField", iField40);
        setField(iField38, "org.joda.time.field.DelegatedDateTimeField", "iField", iField39);
        setField(iField37, "org.joda.time.field.DelegatedDateTimeField", "iField", iField38);
        setField(iField36, "org.joda.time.field.DelegatedDateTimeField", "iField", iField37);
        setField(iField35, "org.joda.time.field.DelegatedDateTimeField", "iField", iField36);
        setField(iField34, "org.joda.time.field.DelegatedDateTimeField", "iField", iField35);
        setField(iField33, "org.joda.time.field.DelegatedDateTimeField", "iField", iField34);
        setField(iField32, "org.joda.time.field.DelegatedDateTimeField", "iField", iField33);
        setField(iField31, "org.joda.time.field.DelegatedDateTimeField", "iField", iField32);
        setField(iField30, "org.joda.time.field.DelegatedDateTimeField", "iField", iField31);
        setField(iField29, "org.joda.time.field.DelegatedDateTimeField", "iField", iField30);
        setField(iField28, "org.joda.time.field.DelegatedDateTimeField", "iField", iField29);
        setField(iField27, "org.joda.time.field.DelegatedDateTimeField", "iField", iField28);
        setField(iField26, "org.joda.time.field.DelegatedDateTimeField", "iField", iField27);
        setField(iField25, "org.joda.time.field.DelegatedDateTimeField", "iField", iField26);
        setField(iField24, "org.joda.time.field.DelegatedDateTimeField", "iField", iField25);
        setField(iField23, "org.joda.time.field.DelegatedDateTimeField", "iField", iField24);
        setField(iField22, "org.joda.time.field.DelegatedDateTimeField", "iField", iField23);
        setField(iField21, "org.joda.time.field.DelegatedDateTimeField", "iField", iField22);
        setField(iField20, "org.joda.time.field.DelegatedDateTimeField", "iField", iField21);
        setField(iField19, "org.joda.time.field.DelegatedDateTimeField", "iField", iField20);
        setField(iField18, "org.joda.time.field.DelegatedDateTimeField", "iField", iField19);
        setField(iField17, "org.joda.time.field.DelegatedDateTimeField", "iField", iField18);
        setField(iField16, "org.joda.time.field.DelegatedDateTimeField", "iField", iField17);
        setField(iField15, "org.joda.time.field.DelegatedDateTimeField", "iField", iField16);
        setField(iField14, "org.joda.time.field.DelegatedDateTimeField", "iField", iField15);
        setField(iField13, "org.joda.time.field.DelegatedDateTimeField", "iField", iField14);
        setField(iField12, "org.joda.time.field.DelegatedDateTimeField", "iField", iField13);
        setField(iField11, "org.joda.time.field.DelegatedDateTimeField", "iField", iField12);
        setField(iField10, "org.joda.time.field.DelegatedDateTimeField", "iField", iField11);
        setField(iField9, "org.joda.time.field.DelegatedDateTimeField", "iField", iField10);
        setField(iField8, "org.joda.time.field.DelegatedDateTimeField", "iField", iField9);
        setField(iField7, "org.joda.time.field.DelegatedDateTimeField", "iField", iField8);
        setField(iField6, "org.joda.time.field.DelegatedDateTimeField", "iField", iField7);
        setField(iField5, "org.joda.time.field.DelegatedDateTimeField", "iField", iField6);
        setField(iField4, "org.joda.time.field.DelegatedDateTimeField", "iField", iField5);
        setField(iField3, "org.joda.time.field.DelegatedDateTimeField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(skipDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", skipDateTimeField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIChronology = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldISkip = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldISkip = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(expectedIFieldISkip, actualIFieldISkip);
        
        int expectedIFieldIMinValue = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIMinValue = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIMinValue, actualIFieldIMinValue);
        
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField expectedIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        DateTimeField expectedIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIFieldIFieldIFieldIChronology = ((Chronology) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iChronology"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIChronology, actualIFieldIFieldIFieldIFieldIChronology));
        
        int expectedIFieldIFieldIFieldIFieldISkip = ((Integer) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        int actualIFieldIFieldIFieldIFieldISkip = ((Integer) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldISkip, actualIFieldIFieldIFieldIFieldISkip));
        
        int expectedIFieldIFieldIFieldIFieldIMinValue = ((Integer) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        int actualIFieldIFieldIFieldIFieldIMinValue = ((Integer) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIMinValue, actualIFieldIFieldIFieldIFieldIMinValue));
        
        DateTimeField expectedIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIFieldIField));
        
        DateTimeFieldType actualIFieldIFieldIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIType, actualIFieldIFieldIFieldIFieldIType));
        
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        
        assertTrue(deepEquals(expectedIField, actualIField));
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testGetInstance9() throws Exception  {
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        SkipUndoDateTimeField iField = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField1 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField2 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField3 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField4 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField5 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField6 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField7 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField8 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField9 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField10 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField11 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField12 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField13 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField14 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField15 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField16 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField17 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField18 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField19 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipUndoDateTimeField iField20 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField21 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField22 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField23 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipDateTimeField iField24 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField25 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField26 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField27 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField28 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField29 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField30 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipDateTimeField iField31 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField32 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField33 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField34 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField35 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField36 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField37 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField38 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField39 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField40 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField41 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField42 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField43 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        SkipUndoDateTimeField iField44 = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        DelegatedDateTimeField iField45 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        Object iField46 = createInstance("org.joda.time.chrono.GJMonthOfYearDateTimeField");
        setField(iField45, "org.joda.time.field.DelegatedDateTimeField", "iField", iField46);
        setField(iField44, "org.joda.time.field.DelegatedDateTimeField", "iField", iField45);
        setField(iField43, "org.joda.time.field.DelegatedDateTimeField", "iField", iField44);
        setField(iField42, "org.joda.time.field.DelegatedDateTimeField", "iField", iField43);
        setField(iField41, "org.joda.time.field.DelegatedDateTimeField", "iField", iField42);
        setField(iField40, "org.joda.time.field.DelegatedDateTimeField", "iField", iField41);
        setField(iField39, "org.joda.time.field.DelegatedDateTimeField", "iField", iField40);
        setField(iField38, "org.joda.time.field.DelegatedDateTimeField", "iField", iField39);
        setField(iField37, "org.joda.time.field.DelegatedDateTimeField", "iField", iField38);
        setField(iField36, "org.joda.time.field.DelegatedDateTimeField", "iField", iField37);
        setField(iField35, "org.joda.time.field.DelegatedDateTimeField", "iField", iField36);
        setField(iField34, "org.joda.time.field.DelegatedDateTimeField", "iField", iField35);
        setField(iField33, "org.joda.time.field.DelegatedDateTimeField", "iField", iField34);
        setField(iField32, "org.joda.time.field.DelegatedDateTimeField", "iField", iField33);
        setField(iField31, "org.joda.time.field.DelegatedDateTimeField", "iField", iField32);
        setField(iField30, "org.joda.time.field.DelegatedDateTimeField", "iField", iField31);
        setField(iField29, "org.joda.time.field.DelegatedDateTimeField", "iField", iField30);
        setField(iField28, "org.joda.time.field.DelegatedDateTimeField", "iField", iField29);
        setField(iField27, "org.joda.time.field.DelegatedDateTimeField", "iField", iField28);
        setField(iField26, "org.joda.time.field.DelegatedDateTimeField", "iField", iField27);
        setField(iField25, "org.joda.time.field.DelegatedDateTimeField", "iField", iField26);
        setField(iField24, "org.joda.time.field.DelegatedDateTimeField", "iField", iField25);
        setField(iField23, "org.joda.time.field.DelegatedDateTimeField", "iField", iField24);
        setField(iField22, "org.joda.time.field.DelegatedDateTimeField", "iField", iField23);
        setField(iField21, "org.joda.time.field.DelegatedDateTimeField", "iField", iField22);
        setField(iField20, "org.joda.time.field.DelegatedDateTimeField", "iField", iField21);
        setField(iField19, "org.joda.time.field.DelegatedDateTimeField", "iField", iField20);
        setField(iField18, "org.joda.time.field.DelegatedDateTimeField", "iField", iField19);
        setField(iField17, "org.joda.time.field.DelegatedDateTimeField", "iField", iField18);
        setField(iField16, "org.joda.time.field.DelegatedDateTimeField", "iField", iField17);
        setField(iField15, "org.joda.time.field.DelegatedDateTimeField", "iField", iField16);
        setField(iField14, "org.joda.time.field.DelegatedDateTimeField", "iField", iField15);
        setField(iField13, "org.joda.time.field.DelegatedDateTimeField", "iField", iField14);
        setField(iField12, "org.joda.time.field.DelegatedDateTimeField", "iField", iField13);
        setField(iField11, "org.joda.time.field.DelegatedDateTimeField", "iField", iField12);
        setField(iField10, "org.joda.time.field.DelegatedDateTimeField", "iField", iField11);
        setField(iField9, "org.joda.time.field.DelegatedDateTimeField", "iField", iField10);
        setField(iField8, "org.joda.time.field.DelegatedDateTimeField", "iField", iField9);
        setField(iField7, "org.joda.time.field.DelegatedDateTimeField", "iField", iField8);
        setField(iField6, "org.joda.time.field.DelegatedDateTimeField", "iField", iField7);
        setField(iField5, "org.joda.time.field.DelegatedDateTimeField", "iField", iField6);
        setField(iField4, "org.joda.time.field.DelegatedDateTimeField", "iField", iField5);
        setField(iField3, "org.joda.time.field.DelegatedDateTimeField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        LenientDateTimeField actual = ((LenientDateTimeField) LenientDateTimeField.getInstance(strictDateTimeField, null));
        
        LenientDateTimeField expected = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(expected, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        Chronology actualIBase = ((Chronology) getFieldValue(actual, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIBase);
        
        DateTimeField expectedIField = ((DateTimeField) getFieldValue(expected, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIChronology = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.SkipUndoDateTimeField", "iChronology"));
        assertNull(actualIFieldIChronology);
        
        int expectedIFieldISkip = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        int actualIFieldISkip = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipUndoDateTimeField", "iSkip"));
        assertEquals(expectedIFieldISkip, actualIFieldISkip);
        
        int expectedIFieldIMinValue = ((Integer) getFieldValue(expectedIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        int actualIFieldIMinValue = ((Integer) getFieldValue(actualIField, "org.joda.time.field.SkipUndoDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIMinValue, actualIFieldIMinValue);
        
        DateTimeField expectedIFieldIField = ((DateTimeField) getFieldValue(expectedIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIFieldIChronology = ((Chronology) getFieldValue(actualIFieldIField, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIFieldIFieldIChronology);
        
        int expectedIFieldIFieldISkip = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualIFieldIFieldISkip = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(expectedIFieldIFieldISkip, actualIFieldIFieldISkip);
        
        int expectedIFieldIFieldIMinValue = ((Integer) getFieldValue(expectedIFieldIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIFieldIFieldIMinValue = ((Integer) getFieldValue(actualIFieldIField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(expectedIFieldIFieldIMinValue, actualIFieldIFieldIMinValue);
        
        DateTimeField expectedIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        DateTimeField expectedIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIField));
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIField));
        DateTimeField expectedIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(expectedIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIFieldIFieldIFieldIField = ((DateTimeField) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedIFieldIFieldIFieldIFieldIField, actualIFieldIFieldIFieldIFieldIField));
        
        DateTimeFieldType actualIFieldIFieldIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIFieldIFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualIFieldIFieldIFieldIFieldIType, actualIFieldIFieldIFieldIFieldIType));
        
        assertTrue(deepEquals(expectedIFieldIFieldIField, actualIFieldIFieldIField));
        
        assertTrue(deepEquals(expectedIFieldIField, actualIFieldIField));
        
        assertTrue(deepEquals(expectedIField, actualIField));
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.LenientDateTimeField.set
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(long, int)
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: long localInstant = iBase.getZone().convertUTCToLocal(instant);
 *  */
    @Test
    public void testSet_ThrowClassCastException() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:72) */
        lenientDateTimeField.set(-255L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long difference = FieldUtils.safeSubtract(value, get(instant));
 *  */
    @Test
    public void testSet_ThrowArithmeticException() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -262146);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:80)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:96)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:73) */
        lenientDateTimeField.set(0L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long difference = FieldUtils.safeSubtract(value, get(instant));
 *  */
    @Test
    public void testSet_ThrowArithmeticException_1() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -262146);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:80)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:96)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:73) */
        lenientDateTimeField.set(0L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long difference = FieldUtils.safeSubtract(value, get(instant));
 *  */
    @Test
    public void testSet_ThrowArithmeticException_2() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 130);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:82)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:96)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:73) */
        lenientDateTimeField.set(-127L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long difference = FieldUtils.safeSubtract(value, get(instant));
 *  */
    @Test
    public void testSet_ThrowArithmeticException_3() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 130);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:82)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:96)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:73) */
        lenientDateTimeField.set(-127L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long localInstant = iBase.getZone().convertUTCToLocal(instant);
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:72) */
        lenientDateTimeField.set(-255L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long localInstant = iBase.getZone().convertUTCToLocal(instant);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_1() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:72) */
        lenientDateTimeField.set(-255L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long localInstant = iBase.getZone().convertUTCToLocal(instant);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_20() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:72) */
        lenientDateTimeField.set(-255L, -255);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_2() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_3() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_4() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_5() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_6() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_7() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_8() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_9() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_10() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_11() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_12() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_13() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_14() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_15() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_16() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_17() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_18() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_19() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5207580469166144L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 44);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(long, int)
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: long localInstant = iBase.getZone().convertUTCToLocal(instant);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSet_ThrowArithmeticException_4() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -442);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        
        lenientDateTimeField.set(-9223372036854775587L, 2);
    }
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#set(long,int)}
 * @utbot.invokes {@link org.joda.time.field.LenientDateTimeField#get(long)}
 * @utbot.invokes {@link org.joda.time.field.FieldUtils#safeSubtract(long,long)}
 * @utbot.invokes {@link org.joda.time.field.LenientDateTimeField#getType()}
 * @utbot.invokes {@link org.joda.time.Chronology#withUTC()}
 * @utbot.invokes {@link org.joda.time.DateTimeFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.InternalError} in: localInstant = getType().getField(iBase.withUTC()).add(localInstant, difference);
 *  */
    @Test(expected = InternalError.class)
    public void testSet_ThrowInternalError() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 766);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", -1796L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 0);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        lenientDateTimeField.set(-255L, 1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method set(long, int)
    
    @Test
    public void testSet1() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("java.lang.Object");
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.joda.time.DateTimeZone (java.lang.Object is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.GJChronology.getZone(GJChronology.java:294)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:72) */
        lenientDateTimeField.set(0L, 0);
    }
    
    @Test
    public void testSet2() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:151)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:111)
            org.joda.time.DateTimeZone.convertUTCToLocal(DateTimeZone.java:910)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:72) */
        lenientDateTimeField.set(0L, 0);
    }
    
    @Test
    public void testSet3() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -1878999050);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        LenientDateTimeField iField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        PreciseDateTimeField iField1 = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField1, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iField1, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(0L, 0);
    }
    
    @Test
    public void testSet4() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 134287521);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1370344964);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 2L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(4731735303077249024L, 331088376);
    }
    
    @Test
    public void testSet5() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        DelegatedDateTimeField iMillisOfSecond = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iMillisOfSecond, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 268435457);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField1 = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField1, "org.joda.time.field.PreciseDateTimeField", "iRange", 8192);
        setField(iField1, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 3L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.add(DelegatedDateTimeField.java:144)
            org.joda.time.field.DelegatedDateTimeField.add(DelegatedDateTimeField.java:144)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-2L, 1073758207);
    }
    
    @Test
    public void testSet6() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 4191230);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 95749);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-2095616L, 268435468);
    }
    
    @Test
    public void testSet7() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 5L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-1L, 536870914);
    }
    
    @Test
    public void testSet8() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 4191230);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 95749);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-2095616L, 268435468);
    }
    
    @Test
    public void testSet9() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        LenientChronology iBase1 = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        UnsupportedDateTimeField iDayOfWeek = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 2145451774);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", -64L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        /* This test fails because method [org.joda.time.field.LenientDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.field.UnsupportedDateTimeField.add(UnsupportedDateTimeField.java:234)
            org.joda.time.field.LenientDateTimeField.set(LenientDateTimeField.java:74) */
        lenientDateTimeField.set(-32640L, 4);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(long, int)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSet10() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase1 = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 134218098);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", -1048577L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        lenientDateTimeField.set(-67109050L, 1073741824);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSet11() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase1 = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 71356442);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 13133998);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", -2L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        lenientDateTimeField.set(-35678222L, 25165826);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSet12() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase1 = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 134218098);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 1);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", -1048577L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        lenientDateTimeField.set(-67109050L, 1073741824);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testSet13() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase1 = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", 71356442);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 13133998);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", -2L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        lenientDateTimeField.set(-35678222L, 25165826);
    }
    
    @Test(expected = InternalError.class)
    public void testSet14() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -830391014);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(lenientDateTimeField, "org.joda.time.field.LenientDateTimeField", "iBase", iBase);
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRange", 2);
        setField(iField, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 128L);
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        Object iType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(lenientDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iType", iType);
        
        lenientDateTimeField.set(244L, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.field.LenientDateTimeField.isLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLenient()
    
    /**
    @utbot.classUnderTest {@link LenientDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.field.LenientDateTimeField#isLenient()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsLenient_ReturnTrue() throws Exception  {
        LenientDateTimeField lenientDateTimeField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        
        boolean actual = lenientDateTimeField.isLenient();
        
        assertTrue(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1056437882480199 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1056437882480199.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1056437882485600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1056437882480199.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1056437882485600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1056437883196299 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1056437883196299.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1056437883202400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1056437883196299.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1056437883202400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

