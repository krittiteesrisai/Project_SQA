package org.joda.time;

import org.junit.Test;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.reflect.InvocationTargetException;
import org.joda.time.field.UnsupportedDateTimeField;
import java.util.HashMap;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.Partial.Property;
import java.lang.reflect.Method;
import org.joda.time.base.AbstractPeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.CopticChronology;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_joda_time_PartialTest {
    ///region Test suites for executable org.joda.time.Partial.isMatch
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isMatch(org.joda.time.ReadableInstant)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Partial}
     * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadableInstant)}
     */
    @Test
    public void testIsMatchReturnsTrue() {
        Partial partial = new Partial();
        int[] intArray = {0, Integer.MAX_VALUE, 1, Integer.MAX_VALUE};
        Partial partial1 = new Partial(partial, intArray);
        int[] intArray1 = {Integer.MIN_VALUE, Integer.MIN_VALUE, 1, Integer.MAX_VALUE, Integer.MIN_VALUE};
        Partial partial2 = new Partial(partial1, intArray1);
        
        boolean actual = partial2.isMatch(((ReadableInstant) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.isMatch
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMatch(org.joda.time.ReadablePartial)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMatch_ReturnTrue() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        boolean actual = partial.isMatch(localDate);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 *  */
    @Test
    public void testIsMatch_ValueNotEqualsIOfIValues() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iCenturyOfEra = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDateTimeField", "iRange", -2);
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 490402587607040L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        boolean actual = partial.isMatch(localDateTime);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isMatch(org.joda.time.ReadablePartial)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (partial == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: partial == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_ThrowIllegalArgumentException() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        partial.isMatch(((ReadablePartial) null));
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (partial == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int value = partial.get(iTypes[i]);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch_ThrowIllegalArgumentException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        
        partial.isMatch(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.executesCondition {@code (partial == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.InternalError} in: int value = partial.get(iTypes[i]);
 *  */
    @Test(expected = InternalError.class)
    public void testIsMatch_ThrowInternalError() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        partial.isMatch(localDateTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isMatch(org.joda.time.ReadablePartial)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: value != iValues[i]
 *  */
    @Test
    public void testIsMatch_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.isMatch(Partial.java:685) */
        partial.isMatch(localDateTime);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < iTypes.length; i++)
 *  */
    @Test
    public void testIsMatch_ThrowNullPointerException() throws Exception  {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.Partial.isMatch(Partial.java:683) */
        partial.isMatch(localDate);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#isMatch(org.joda.time.ReadablePartial)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < iTypes.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: value != iValues[i]
 *  */
    @Test
    public void testIsMatch_ThrowNullPointerException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ZonedChronology iChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.Partial.isMatch(Partial.java:685) */
        partial.isMatch(localDateTime);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isMatch(org.joda.time.ReadablePartial)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsMatch1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        partial.isMatch(localDateTime);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsMatch2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {
            0, 56, 56, 56, 56, 56, 56, 56,
            56
        };
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 145277268787200L);
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDateTimeField", "iRange", -1);
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", -18159710138007553L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        partial.isMatch(localDateTime);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsMatch3() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        partial.isMatch(localDateTime);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsMatch4() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        partial.isMatch(localDateTime);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsMatch5() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        partial.isMatch(localDateTime);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isMatch(org.joda.time.ReadablePartial)
    
    @Test
    public void testIsMatch6() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch7() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", -9223372036854775807L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iCenturyOfEra = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:83)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch8() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", -9223372036854775807L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iMillisOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iMillisOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:83)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch9() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iMillisOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iMillisOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch10() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iClockhourOfDay = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch11() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iDayOfYear = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch12() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iWeekyearOfCentury = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iWeekyearOfCentury, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch13() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iHourOfHalfday = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch14() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", -9223372036854775804L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iWeekyearOfCentury = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iWeekyearOfCentury, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:83)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch15() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", -9223372036854775807L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iHourOfHalfday = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 0L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:83)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch16() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iDayOfWeek = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iDayOfWeek, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:81)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch17() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", -9223372036854759424L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iDayOfWeek = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iDayOfWeek, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", iDayOfWeek);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.field.PreciseDateTimeField.get(PreciseDateTimeField.java:83)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch18() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[9] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iWeekyearOfCentury = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iWeekyearOfCentury, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iWeekyearOfCentury, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.Partial.isMatch(Partial.java:685) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch19() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[9] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        PreciseDateTimeField iHourOfHalfday = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRange", Integer.MIN_VALUE);
        setField(iHourOfHalfday, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis", 1L);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.Partial.isMatch(Partial.java:685) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch20() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        BuddhistChronology iChronology = ((BuddhistChronology) createInstance("org.joda.time.chrono.BuddhistChronology"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch21() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch22() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[10];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch23() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        BuddhistChronology iChronology = ((BuddhistChronology) createInstance("org.joda.time.chrono.BuddhistChronology"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch24() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iHalfdayOfDay = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        LenientDateTimeField iField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iHalfdayOfDay, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", iHalfdayOfDay);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch25() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iDayOfYear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iDayOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", iDayOfYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch26() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iHourOfDay = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iHourOfDay, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", iHourOfDay);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch27() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iMillisOfDay = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        StrictDateTimeField iField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(iMillisOfDay, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", iMillisOfDay);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch28() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iYear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        StrictDateTimeField iField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch29() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iCenturyOfEra = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iCenturyOfEra, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", iCenturyOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch30() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iHourOfHalfday = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        StrictDateTimeField iField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(iHourOfHalfday, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", iHourOfHalfday);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch31() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iYearOfEra = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iYearOfEra, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", iYearOfEra);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch32() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iWeekyearOfCentury = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        LenientDateTimeField iField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iWeekyearOfCentury, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", iWeekyearOfCentury);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch33() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iYearOfCentury = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iYearOfCentury, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", iYearOfCentury);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch34() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iDayOfMonth = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        DelegatedDateTimeField iField = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iDayOfMonth, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", iDayOfMonth);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch35() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iWeekyear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear", iWeekyear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch36() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iWeekOfWeekyear = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        LenientDateTimeField iField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        LenientDateTimeField iField1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iWeekOfWeekyear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", iWeekOfWeekyear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    
    @Test
    public void testIsMatch37() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iLocalMillis", 0L);
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientDateTimeField iClockhourOfDay = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        StrictDateTimeField iField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        LenientDateTimeField iField1 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iClockhourOfDay, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", iClockhourOfDay);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.Partial.isMatch] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.field.DelegatedDateTimeField.get(DelegatedDateTimeField.java:110)
            org.joda.time.LocalDateTime.get(LocalDateTime.java:610)
            org.joda.time.Partial.isMatch(Partial.java:684) */
        partial.isMatch(localDateTime);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.toString
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return toString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToString_ThrowUnsupportedOperationException() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        partial.toString(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
 * @utbot.executesCondition {@code (pattern == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormat#forPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToString_ThrowIllegalArgumentException() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        String string = "";
        
        partial.toString(string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(java.lang.String, java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return toString();
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.joda.time.Partial.toString(Partial.java:746)
            org.joda.time.Partial.toString(Partial.java:802) */
        partial.toString(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString(java.lang.String, java.util.Locale)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Partial}
     * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String,java.util.Locale)}
     */
    @Test
    public void testToStringWithNonEmptyString() {
        Partial partial = new Partial();
        int[] intArray = {1, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Partial partial1 = new Partial(partial, intArray);
        Locale locale = new Locale("", "#$\\\"'", "");
        
        String actual = partial1.toString("C\n\t\r", locale);
        
        String expected = "\uFFFD\n\t\r";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString(java.lang.String, java.util.Locale)
    
    @Test
    public void testToString1() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null, null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[18];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 8);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        String actual = partial.toString(null, locale);
        
        String expected = "\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD";
        
        assertEquals(expected, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes1 = ((DateTimeFieldType) get(partialITypes1, 1));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter1 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter2 = ((DateTimeFormatter) get(partialIFormatter1, 2));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter2 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter3 = ((DateTimeFormatter) get(partialIFormatter2, 3));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter3 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter4 = ((DateTimeFormatter) get(partialIFormatter3, 4));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter4 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter5 = ((DateTimeFormatter) get(partialIFormatter4, 5));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter5 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter6 = ((DateTimeFormatter) get(partialIFormatter5, 6));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter6 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter7 = ((DateTimeFormatter) get(partialIFormatter6, 7));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter7 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter8 = ((DateTimeFormatter) get(partialIFormatter7, 8));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter8 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter9 = ((DateTimeFormatter) get(partialIFormatter8, 9));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter9 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter10 = ((DateTimeFormatter) get(partialIFormatter9, 10));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter10 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter11 = ((DateTimeFormatter) get(partialIFormatter10, 11));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter11 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter12 = ((DateTimeFormatter) get(partialIFormatter11, 12));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter12 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter13 = ((DateTimeFormatter) get(partialIFormatter12, 13));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter13 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter14 = ((DateTimeFormatter) get(partialIFormatter13, 14));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter14 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter15 = ((DateTimeFormatter) get(partialIFormatter14, 15));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter15 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter16 = ((DateTimeFormatter) get(partialIFormatter15, 16));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter16 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter17 = ((DateTimeFormatter) get(partialIFormatter16, 17));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialITypes1);
        
        assertNull(finalPartialIFormatter0);
        
        assertNull(finalPartialIFormatter2);
        
        assertNull(finalPartialIFormatter3);
        
        assertNull(finalPartialIFormatter4);
        
        assertNull(finalPartialIFormatter5);
        
        assertNull(finalPartialIFormatter6);
        
        assertNull(finalPartialIFormatter7);
        
        assertNull(finalPartialIFormatter8);
        
        assertNull(finalPartialIFormatter9);
        
        assertNull(finalPartialIFormatter10);
        
        assertNull(finalPartialIFormatter11);
        
        assertNull(finalPartialIFormatter12);
        
        assertNull(finalPartialIFormatter13);
        
        assertNull(finalPartialIFormatter14);
        
        assertNull(finalPartialIFormatter15);
        
        assertNull(finalPartialIFormatter16);
        
        assertNull(finalPartialIFormatter17);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString(java.lang.String, java.util.Locale)
    
    @Test
    public void testToString2() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormat$StyleFormatter");
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        Locale iLocale = ((Locale) createInstance("java.util.Locale"));
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iLocale", iLocale);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.toString(Locale.java:1438)
            org.joda.time.format.DateTimeFormat$StyleFormatter.getFormatter(DateTimeFormat.java:849)
            org.joda.time.format.DateTimeFormat$StyleFormatter.printTo(DateTimeFormat.java:829)
            org.joda.time.format.DateTimeFormatter.printTo(DateTimeFormatter.java:547)
            org.joda.time.format.DateTimeFormatter.print(DateTimeFormatter.java:623)
            org.joda.time.Partial.toString(Partial.java:750)
            org.joda.time.Partial.toString(Partial.java:802) */
        partial.toString(null, null);
    }
    
    @Test
    public void testToString3() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormat$StyleFormatter");
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.size(Partial.java:309)
            org.joda.time.base.AbstractPartial.indexOf(AbstractPartial.java:170)
            org.joda.time.base.AbstractPartial.isSupported(AbstractPartial.java:160)
            org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber.printTo(DateTimeFormatterBuilder.java:1431)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.printTo(DateTimeFormatterBuilder.java:2708)
            org.joda.time.format.DateTimeFormat$StyleFormatter.printTo(DateTimeFormat.java:830)
            org.joda.time.format.DateTimeFormatter.printTo(DateTimeFormatter.java:547)
            org.joda.time.format.DateTimeFormatter.print(DateTimeFormatter.java:623)
            org.joda.time.Partial.toString(Partial.java:750)
            org.joda.time.Partial.toString(Partial.java:802) */
        partial.toString(null, null);
    }
    
    @Test
    public void testToString4() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null, null, null, null, null, null, null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:770)
            org.joda.time.Partial.toString(Partial.java:748)
            org.joda.time.Partial.toString(Partial.java:802) */
        partial.toString(null, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method toString(java.lang.String, java.util.Locale)
    
    @Test(timeout = 1000L)
    public void testToString5() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", Integer.MIN_VALUE);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        partial.toString(null, locale);
    }
    
    @Test(timeout = 1000L)
    public void testToString6() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[18];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", Integer.MIN_VALUE);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        partial.toString(null, locale);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f1 == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormatter#print(org.joda.time.ReadablePartial)}
 * @utbot.returnsFrom {@code return f1.print(this);}
 *  */
    @Test
    public void testToString_F1NotEqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", 1);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString();
        
        String expected = "\uFFFD";
        
        assertEquals(expected, actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        
        assertNull(finalPartialIFormatter0);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f1 == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toStringList()}
 * @utbot.returnsFrom {@code return toStringList();}
 *  */
    @Test
    public void testToString_F1EqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = {null, null};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString();
        
        String expected = "[]";
        
        assertEquals(expected, actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        org.joda.time.format.DateTimeFormatter[] partialIFormatter1 = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter1 = ((DateTimeFormatter) get(partialIFormatter1, 1));
        
        assertNull(finalPartialIFormatter0);
        
        assertNull(finalPartialIFormatter1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: DateTimeFormatter f1 = f[1];
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {null};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.joda.time.Partial.toString(Partial.java:746) */
        partial.toString();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.executesCondition {@code (f1 == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormatter#print(org.joda.time.ReadablePartial)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return f1.print(this);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToString_ThrowUnsupportedOperationException1() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        partial.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString7() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = new org.joda.time.DateTimeFieldType[11];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        iTypes[2] = ((DateTimeFieldType) standardDateTimeFieldType);
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", standardDateTimeFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[0] = dateTimeFormatter;
        iFormatter[1] = dateTimeFormatter;
        iFormatter[2] = dateTimeFormatter;
        iFormatter[3] = dateTimeFormatter;
        iFormatter[4] = dateTimeFormatter;
        iFormatter[5] = dateTimeFormatter;
        iFormatter[6] = dateTimeFormatter;
        iFormatter[7] = dateTimeFormatter;
        iFormatter[8] = dateTimeFormatter;
        iFormatter[9] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes1 = ((DateTimeFieldType) get(partialITypes1, 1));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes2, 3));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes3, 4));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes4, 5));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes5, 6));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes6, 7));
        org.joda.time.DateTimeFieldType[] partialITypes7 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes7, 8));
        org.joda.time.DateTimeFieldType[] partialITypes8 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes9 = ((DateTimeFieldType) get(partialITypes8, 9));
        org.joda.time.DateTimeFieldType[] partialITypes9 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes10 = ((DateTimeFieldType) get(partialITypes9, 10));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialITypes1);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
        
        assertNull(finalPartialITypes9);
        
        assertNull(finalPartialITypes10);
    }
    
    @Test
    public void testToString8() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        String actual = partial.toString();
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString9() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[13];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormat$StyleFormatter");
        setField(iPrinter, "org.joda.time.format.DateTimeFormat$StyleFormatter", "iDateStyle", 260046845);
        setField(iPrinter, "org.joda.time.format.DateTimeFormat$StyleFormatter", "iTimeStyle", 4194304);
        setField(iPrinter, "org.joda.time.format.DateTimeFormat$StyleFormatter", "iType", 1207959609);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        Locale iLocale = ((Locale) createInstance("java.util.Locale"));
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iLocale", iLocale);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            java.base/java.util.Locale.toString(Locale.java:1438)
            org.joda.time.format.DateTimeFormat$StyleFormatter.getFormatter(DateTimeFormat.java:849)
            org.joda.time.format.DateTimeFormat$StyleFormatter.printTo(DateTimeFormat.java:829)
            org.joda.time.format.DateTimeFormatter.printTo(DateTimeFormatter.java:547)
            org.joda.time.format.DateTimeFormatter.print(DateTimeFormatter.java:623)
            org.joda.time.Partial.toString(Partial.java:750) */
        partial.toString();
    }
    
    @Test
    public void testToString10() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormat$StyleFormatter");
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.size(Partial.java:309)
            org.joda.time.base.AbstractPartial.indexOf(AbstractPartial.java:170)
            org.joda.time.base.AbstractPartial.isSupported(AbstractPartial.java:160)
            org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber.printTo(DateTimeFormatterBuilder.java:1431)
            org.joda.time.format.DateTimeFormatterBuilder$Composite.printTo(DateTimeFormatterBuilder.java:2708)
            org.joda.time.format.DateTimeFormat$StyleFormatter.printTo(DateTimeFormat.java:830)
            org.joda.time.format.DateTimeFormatter.printTo(DateTimeFormatter.java:547)
            org.joda.time.format.DateTimeFormatter.print(DateTimeFormatter.java:623)
            org.joda.time.Partial.toString(Partial.java:750) */
        partial.toString();
    }
    
    @Test
    public void testToString11() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        String iName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType", "iName", iName);
        iTypes[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[16];
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:772)
            org.joda.time.Partial.toString(Partial.java:748) */
        partial.toString();
    }
    
    @Test
    public void testToString12() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:770)
            org.joda.time.Partial.toString(Partial.java:748) */
        partial.toString();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method toString()
    
    @Test(timeout = 1000L)
    public void testToString13() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", Integer.MIN_VALUE);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        partial.toString();
    }
    
    @Test(timeout = 1000L)
    public void testToString14() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {null, null};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[10];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber", "iMinPrintedDigits", Integer.MIN_VALUE);
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[0] = dateTimeFormatter;
        iFormatter[1] = dateTimeFormatter;
        iFormatter[2] = dateTimeFormatter;
        iFormatter[3] = dateTimeFormatter;
        iFormatter[4] = dateTimeFormatter;
        iFormatter[5] = dateTimeFormatter;
        iFormatter[6] = dateTimeFormatter;
        iFormatter[7] = dateTimeFormatter;
        iFormatter[8] = dateTimeFormatter;
        iFormatter[9] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        partial.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.returnsFrom {@code return toString();}
 *  */
    @Test
    public void testToString_PatternEqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.DateTimeFieldType[] iTypes = {};
        setField(partial, "org.joda.time.Partial", "iTypes", iTypes);
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        Object iPrinter = createInstance("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber");
        Object iFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(iPrinter, "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", "iFieldType", iFieldType);
        setField(dateTimeFormatter, "org.joda.time.format.DateTimeFormatter", "iPrinter", iPrinter);
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        String actual = partial.toString(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        
        assertNull(finalPartialIFormatter0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return toString();
 *  */
    @Test
    public void testToString_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.joda.time.Partial.toString(Partial.java:746)
            org.joda.time.Partial.toString(Partial.java:787) */
        partial.toString(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String)}
 * @utbot.executesCondition {@code (pattern == null): True}
 * @utbot.invokes {@link org.joda.time.Partial#toString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return toString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testToString_ThrowUnsupportedOperationException2() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = new org.joda.time.format.DateTimeFormatter[2];
        DateTimeFormatter dateTimeFormatter = ((DateTimeFormatter) createInstance("org.joda.time.format.DateTimeFormatter"));
        iFormatter[1] = dateTimeFormatter;
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        partial.toString(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toString(java.lang.String)}
 * @utbot.executesCondition {@code (pattern == null): False}
 * @utbot.invokes {@link org.joda.time.format.DateTimeFormat#forPattern(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return DateTimeFormat.forPattern(pattern).print(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testToString_ThrowIllegalArgumentException1() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        String string = "";
        
        partial.toString(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString(java.lang.String)
    
    @Test
    public void testToString15() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null, null, null, null, null, null, null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toString] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:770)
            org.joda.time.Partial.toString(Partial.java:748)
            org.joda.time.Partial.toString(Partial.java:787) */
        partial.toString(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValue(int)}
 * @utbot.returnsFrom {@code return iValues[index];}
 *  */
    @Test
    public void testGetValue_ReturnIndexOfIValues() {
        int[] intArray = {-255, -255};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        
        int actual = partial.getValue(1);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iValues[index];
 *  */
    @Test
    public void testGetValue_ThrowArrayIndexOutOfBoundsException() {
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        
        /* This test fails because method [org.joda.time.Partial.getValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.Partial.getValue(Partial.java:368) */
        partial.getValue(-256);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValue(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iValues[index];
 *  */
    @Test
    public void testGetValue_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getValue] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getValue(Partial.java:368) */
        partial.getValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#size()}
 * @utbot.returnsFrom {@code return iTypes.length;}
 *  */
    @Test
    public void testSize_ReturnITypesLength() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        int actual = partial.size();
        
        assertEquals(1, actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes.length;
 *  */
    @Test
    public void testSize_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.size] produces [java.lang.NullPointerException]
            org.joda.time.Partial.size(Partial.java:309) */
        partial.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getField(int, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_3() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_4() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_5() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_6() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_7() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_8() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_9() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_10() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_11() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_12() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_13() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_14() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_15() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_16() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_17() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_18() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_19() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_20() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_21() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.returnsFrom {@code return iTypes[index].getField(chrono);}
 *  */
    @Test
    public void testGetField_ReturnITypesindexGetField_22() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        DateTimeField actual = partial.getField(0, iSOChronology);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes2 = ((DateTimeFieldType) get(partialITypes, 2));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes3 = ((DateTimeFieldType) get(partialITypes1, 3));
        org.joda.time.DateTimeFieldType[] partialITypes2 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes4 = ((DateTimeFieldType) get(partialITypes2, 4));
        org.joda.time.DateTimeFieldType[] partialITypes3 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes5 = ((DateTimeFieldType) get(partialITypes3, 5));
        org.joda.time.DateTimeFieldType[] partialITypes4 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes6 = ((DateTimeFieldType) get(partialITypes4, 6));
        org.joda.time.DateTimeFieldType[] partialITypes5 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes7 = ((DateTimeFieldType) get(partialITypes5, 7));
        org.joda.time.DateTimeFieldType[] partialITypes6 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes8 = ((DateTimeFieldType) get(partialITypes6, 8));
        
        assertNull(finalPartialITypes2);
        
        assertNull(finalPartialITypes3);
        
        assertNull(finalPartialITypes4);
        
        assertNull(finalPartialITypes5);
        
        assertNull(finalPartialITypes6);
        
        assertNull(finalPartialITypes7);
        
        assertNull(finalPartialITypes8);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getField(int, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iTypes[index].getField(chrono);
 *  */
    @Test
    public void testGetField_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getField] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.Partial.getField(Partial.java:333) */
        partial.getField(-256, null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.DateTimeFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes[index].getField(chrono);
 *  */
    @Test
    public void testGetField_ThrowNullPointerException_1() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getField(Partial.java:333) */
        partial.getField(1, null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes[index].getField(chrono);
 *  */
    @Test
    public void testGetField_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getField(Partial.java:333) */
        partial.getField(-255, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getField(int, org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getField(int,org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.DateTimeFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.InternalError} in: return iTypes[index].getField(chrono);
 *  */
    @Test(expected = InternalError.class)
    public void testGetField_ThrowInternalError() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        partial.getField(0, iSOChronology);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getField(int, org.joda.time.Chronology)
    
    @Test
    public void testGetField1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        cCache.put(standardDateTimeFieldType2, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName3 = "eras";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName3 = "eras";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName4 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName4);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName5 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName5);
        cCache.put(standardDateTimeFieldType3, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField3() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName4 = "eras";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName5 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName5);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName6 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName6);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName7 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName7);
        cCache.put(standardDateTimeFieldType4, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField4() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName5 = "eras";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName6 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName6);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName7 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName7);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName8 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName8);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName9 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName9);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName10 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName10);
        cCache.put(standardDateTimeFieldType5, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField5() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName6 = "eras";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName7);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName8 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName8);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName9 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName10 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName10);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName11 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName11);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName12 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName12);
        cCache.put(standardDateTimeFieldType6, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField6() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName7 = "eras";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName8 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName8);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        cCache.put(standardDateTimeFieldType7, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField7() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName7 = "eras";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName8 = "days";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName8);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName15 = "hourOfDay";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName15);
        cCache.put(standardDateTimeFieldType8, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField8() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName15 = "weeks";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName15);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName16 = "dayOfWeek";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        cCache.put(standardDateTimeFieldType8, expected);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName17 = "hourOfDay";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField6);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField9() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName15 = "weeks";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName15);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName16 = "dayOfWeek";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType8, unsupportedDateTimeField6);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName17 = "hourOfHalfday";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        cCache.put(standardDateTimeFieldType9, expected);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName18 = "hourOfDay";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField7);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField10() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "secondOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName11 = "centuries";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName11);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName12 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName13 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName14 = "millisOfSecond";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName15 = "weeks";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName15);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName16 = "dayOfWeek";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType8, unsupportedDateTimeField6);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName17 = "hourOfHalfday";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField7);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName18 = "hourOfDay";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField8 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField8);
        Object standardDateTimeFieldType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName19 = "yearOfEra";
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType", "iName", iName19);
        cCache.put(standardDateTimeFieldType11, expected);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType11);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField11() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName9 = "halfdayOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName9);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName10 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName11 = "millisOfSecond";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName11);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName12 = "weeks";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName12);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName13 = "dayOfWeek";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName14 = "hourOfHalfday";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType1);
        String iName15 = "dayOfYear";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName15);
        cCache.put(standardDateTimeFieldType8, expected);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName16 = "hourOfDay";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField6);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName17 = "yearOfEra";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField7);
        Object standardDateTimeFieldType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName18 = "secondOfDay";
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField8 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType11);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType11, unsupportedDateTimeField8);
        Object standardDateTimeFieldType12 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        Object iRangeType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName19 = "centuries";
        setField(iRangeType2, "org.joda.time.DurationFieldType", "iName", iName19);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType2);
        String iName20 = "yearOfCentury";
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType", "iName", iName20);
        UnsupportedDateTimeField unsupportedDateTimeField9 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType12);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType12, unsupportedDateTimeField9);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    
    @Test
    public void testGetField12() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[1] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[2] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[3] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[4] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[5] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[6] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[7] = ((DateTimeFieldType) standardDateTimeFieldType1);
        dateTimeFieldTypeArray[8] = ((DateTimeFieldType) standardDateTimeFieldType1);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        BaseChronology anonymousBaseChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) partial.getField(0, anonymousBaseChronology));
        
        UnsupportedDateTimeField expected = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache = new HashMap();
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName = "seconds";
        setField(iUnitType, "org.joda.time.DurationFieldType", "iName", iName);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        Object iRangeType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName1 = "minutes";
        setField(iRangeType, "org.joda.time.DurationFieldType", "iName", iName1);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType);
        String iName2 = "secondOfMinute";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName2);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache1 = new HashMap();
        cCache1.put(iUnitType, iDurationField);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName3 = "halfdays";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache1.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName4 = "years";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache1.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName5 = "hours";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache1.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName6 = "millis";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache1.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName7 = "days";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache1.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName8 = "eras";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache1.put(standardDurationFieldType5, unsupportedDurationField5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName9 = "centuries";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName9);
        UnsupportedDurationField unsupportedDurationField6 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField6, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(unsupportedDurationField6, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType6);
        cCache1.put(standardDurationFieldType6, unsupportedDurationField6);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache1);
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iUnitType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType2, unsupportedDateTimeField);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName10 = "halfdayOfDay";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName10);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache.put(standardDateTimeFieldType3, unsupportedDateTimeField1);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName11 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName11);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType4, unsupportedDateTimeField2);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iUnitType);
        String iName12 = "millisOfSecond";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache.put(standardDateTimeFieldType5, unsupportedDateTimeField3);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        Object iRangeType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName13 = "weeks";
        setField(iRangeType1, "org.joda.time.DurationFieldType", "iName", iName13);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", iRangeType1);
        String iName14 = "dayOfWeek";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType6, unsupportedDateTimeField4);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName15 = "hourOfHalfday";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName15);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType7, unsupportedDateTimeField5);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType1);
        String iName16 = "dayOfYear";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache.put(standardDateTimeFieldType8, unsupportedDateTimeField6);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName17 = "hourOfDay";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache.put(standardDateTimeFieldType9, unsupportedDateTimeField7);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName18 = "yearOfEra";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField8 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType10, unsupportedDateTimeField8);
        Object standardDateTimeFieldType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType6);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName19 = "centuryOfEra";
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType", "iName", iName19);
        cCache.put(standardDateTimeFieldType11, expected);
        Object standardDateTimeFieldType12 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName20 = "secondOfDay";
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType", "iName", iName20);
        UnsupportedDateTimeField unsupportedDateTimeField9 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType12);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        cCache.put(standardDateTimeFieldType12, unsupportedDateTimeField9);
        Object standardDateTimeFieldType13 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType6);
        String iName21 = "yearOfCentury";
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType", "iName", iName21);
        UnsupportedDateTimeField unsupportedDateTimeField10 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType13);
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache.put(standardDateTimeFieldType13, unsupportedDateTimeField10);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType11);
        setField(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField6);
        
        DateTimeFieldType expectedIType = ((DateTimeFieldType) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        byte expectedITypeIOrdinal = ((Byte) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualITypeIOrdinal = ((Byte) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(expectedITypeIOrdinal, actualITypeIOrdinal);
        
        DurationFieldType expectedITypeIUnitType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualITypeIUnitType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        byte expectedITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIUnitTypeIOrdinal = ((Byte) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIUnitTypeIOrdinal, actualITypeIUnitTypeIOrdinal);
        
        String expectedITypeIUnitTypeIName = ((String) getFieldValue(expectedITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIUnitTypeIName = ((String) getFieldValue(actualITypeIUnitType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIUnitTypeIName, actualITypeIUnitTypeIName);
        
        DurationFieldType expectedITypeIRangeType = ((DurationFieldType) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualITypeIRangeType = ((DurationFieldType) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        byte expectedITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualITypeIRangeTypeIOrdinal = ((Byte) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        assertEquals(expectedITypeIRangeTypeIOrdinal, actualITypeIRangeTypeIOrdinal);
        
        String expectedITypeIRangeTypeIName = ((String) getFieldValue(expectedITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        String actualITypeIRangeTypeIName = ((String) getFieldValue(actualITypeIRangeType, "org.joda.time.DurationFieldType", "iName"));
        assertEquals(expectedITypeIRangeTypeIName, actualITypeIRangeTypeIName);
        
        String expectedITypeIName = ((String) getFieldValue(expectedIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualITypeIName = ((String) getFieldValue(actualIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(expectedITypeIName, actualITypeIName);
        
        DurationField expectedIDurationField = ((DurationField) getFieldValue(expected, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        DurationFieldType expectedIDurationFieldIType = ((DurationFieldType) getFieldValue(expectedIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIDurationFieldIType = ((DurationFieldType) getFieldValue(actualIDurationField, "org.joda.time.field.UnsupportedDurationField", "iType"));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        assertTrue(deepEquals(expectedIDurationFieldIType, actualIDurationFieldIType));
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getField(int, org.joda.time.Chronology)
    
    @Test(expected = InternalError.class)
    public void testGetField13() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[9];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.getField(0, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getFieldType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldType(int)}
 * @utbot.returnsFrom {@code return iTypes[index];}
 *  */
    @Test
    public void testGetFieldType_ReturnIndexOfITypes() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null, null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        DateTimeFieldType actual = partial.getFieldType(1);
        
        assertNull(actual);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes1 = ((DateTimeFieldType) get(partialITypes1, 1));
        
        assertNull(finalPartialITypes0);
        
        assertNull(finalPartialITypes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldType(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iTypes[index];
 *  */
    @Test
    public void testGetFieldType_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getFieldType] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.joda.time.Partial.getFieldType(Partial.java:344) */
        partial.getFieldType(-256);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldType(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iTypes[index];
 *  */
    @Test
    public void testGetFieldType_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getFieldType] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getFieldType(Partial.java:344) */
        partial.getFieldType(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getFormatter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFormatter()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFormatter()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.returnsFrom {@code return f[0];}
 *  */
    @Test
    public void testGetFormatter_FNotEqualsNull() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {null};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        DateTimeFormatter actual = partial.getFormatter();
        
        assertNull(actual);
        
        org.joda.time.format.DateTimeFormatter[] partialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(partial, "org.joda.time.Partial", "iFormatter"));
        DateTimeFormatter finalPartialIFormatter0 = ((DateTimeFormatter) get(partialIFormatter, 0));
        
        assertNull(finalPartialIFormatter0);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFormatter()}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (size() == 0): True}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetFormatter_SizeEqualsZero() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        DateTimeFormatter actual = partial.getFormatter();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFormatter()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFormatter()}
 * @utbot.executesCondition {@code (f == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return f[0];
 *  */
    @Test
    public void testGetFormatter_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Partial partial = ((Partial) createInstance("org.joda.time.Partial"));
        org.joda.time.format.DateTimeFormatter[] iFormatter = {};
        setField(partial, "org.joda.time.Partial", "iFormatter", iFormatter);
        
        /* This test fails because method [org.joda.time.Partial.getFormatter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.getFormatter(Partial.java:722) */
        partial.getFormatter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.property
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method property(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#property(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DateTimeFieldType)}
 * @utbot.returnsFrom {@code return new Property(this, indexOfSupported(type));}
 *  */
    @Test
    public void testProperty_PartialIndexOfSupported() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial.Property actual = partial.property(null);
        
        Partial.Property expected = new Partial.Property(partial, 0);
        
        Partial expectedIPartial = ((Partial) getFieldValue(expected, "org.joda.time.Partial$Property", "iPartial"));
        Partial actualIPartial = ((Partial) getFieldValue(actual, "org.joda.time.Partial$Property", "iPartial"));
        Chronology actualIPartialIChronology = ((Chronology) getFieldValue(actualIPartial, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIPartialIChronology);
        
        org.joda.time.DateTimeFieldType[] expectedIPartialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(expectedIPartial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualIPartialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actualIPartial, "org.joda.time.Partial", "iTypes"));
        int expectedIPartialITypesSize = expectedIPartialITypes.length;
        assertEquals(expectedIPartialITypesSize, actualIPartialITypes.length);
        assertTrue(deepEquals(expectedIPartialITypes, actualIPartialITypes));
        
        int[] actualIPartialIValues = ((int[]) getFieldValue(actualIPartial, "org.joda.time.Partial", "iValues"));
        assertNull(actualIPartialIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIPartialIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actualIPartial, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIPartialIFormatter);
        
        int expectedIFieldIndex = ((Integer) getFieldValue(expected, "org.joda.time.Partial$Property", "iFieldIndex"));
        int actualIFieldIndex = ((Integer) getFieldValue(actual, "org.joda.time.Partial$Property", "iFieldIndex"));
        assertEquals(expectedIFieldIndex, actualIFieldIndex);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method property(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#property(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Property(this, indexOfSupported(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProperty_ThrowIllegalArgumentException_1() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldType1Type = Class.forName("org.joda.time.DateTimeFieldType");
        Method propertyMethod = partialClazz.getDeclaredMethod("property", standardDateTimeFieldType1Type);
        propertyMethod.setAccessible(true);
        java.lang.Object[] propertyMethodArguments = new java.lang.Object[1];
        propertyMethodArguments[0] = standardDateTimeFieldType1;
        try {
            propertyMethod.invoke(partial, propertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#property(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Property(this, indexOfSupported(type));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProperty_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.property(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getChronology
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChronology()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getChronology()}
 * @utbot.returnsFrom {@code return iChronology;}
 *  */
    @Test
    public void testGetChronology_ReturnIChronology() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        Chronology actual = partial.getChronology();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.with
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method with(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes {@link org.joda.time.Partial#indexOf(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Partial#getValue(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWith_FieldTypeNotEqualsNull() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        Partial actual = ((Partial) withMethod.invoke(partial, withMethodArguments));
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] partialIValues = ((int[]) getFieldValue(partial, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int partialIValuesSize = partialIValues.length;
        assertEquals(partialIValuesSize, actualIValues.length);
        assertArrayEquals(partialIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method with(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: fieldType == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWith_ThrowIllegalArgumentException() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        partial.with(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.executesCondition {@code (fieldType == null): False}
 * @utbot.invokes {@link org.joda.time.Partial#indexOf(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.DateTimeFieldType#getDurationType()}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.InternalError} in: DurationField unitField = fieldType.getDurationType().getField(iChronology);
 *  */
    @Test(expected = InternalError.class)
    public void testWith_ThrowInternalError() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method with(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: value == getValue(index)
 *  */
    @Test
    public void testWith_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.getValue(Partial.java:368)
            org.joda.time.Partial.with(Partial.java:468) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWith_ThrowNullPointerException_14() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-199};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:472) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -58;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWith_ThrowNullPointerException_15() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-199};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:472) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -58;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DurationField unitField = fieldType.getDurationType().getField(iChronology);
 *  */
    @Test
    public void testWith_ThrowNullPointerException_13() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(zonedChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:437) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DurationField unitField = fieldType.getDurationType().getField(iChronology);
 *  */
    @Test
    public void testWith_ThrowNullPointerException() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:437) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_1() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_2() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_3() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_4() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_5() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_6() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_7() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_8() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_9() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_10() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_11() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#with(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: unitField.isSupported()
 *  */
    @Test
    public void testWith_ThrowNullPointerException_12() throws Throwable  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iUnitType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        
        /* This test fails because method [org.joda.time.Partial.with] produces [java.lang.NullPointerException]
            org.joda.time.Partial.with(Partial.java:438) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withMethod = partialClazz.getDeclaredMethod("with", standardDateTimeFieldTypeType, intType);
        withMethod.setAccessible(true);
        java.lang.Object[] withMethodArguments = new java.lang.Object[2];
        withMethodArguments[0] = standardDateTimeFieldType;
        withMethodArguments[1] = -255;
        try {
            withMethod.invoke(partial, withMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.plus
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method plus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#plus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, 1);}
 *  */
    @Test
    public void testPlus_ReturnWithPeriodAdded() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        Partial actual = partial.plus(null);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#plus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, 1);}
 *  */
    @Test
    public void testPlus_ReturnWithPeriodAdded_1() throws Exception  {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        Partial actual = partial.plus(mutablePeriod);
        
        int[] intArray1 = {};
        Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#plus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, 1);}
 *  */
    @Test
    public void testPlus_ReturnWithPeriodAdded_2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCTime = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cTime"));
        try {
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {};
            PeriodType cTime = new PeriodType(null, durationFieldTypeArray, null);
            setStaticField(periodTypeClazz, "cTime", cTime);
            int[] intArray = {};
            Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
            AbstractPeriod anonymousAbstractPeriod = ((AbstractPeriod) createInstance("org.joda.time.base.BasePeriod$1"));
            
            Partial actual = partial.plus(anonymousAbstractPeriod);
            
            int[] intArray1 = {};
            Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
            
            Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
            assertNull(actualIChronology);
            
            org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
            assertNull(actualITypes);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
            assertNull(actualIFormatter);
            
        } finally {
            setStaticField(PeriodType.class, "cTime", prevCTime);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.minus
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method minus(org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#minus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, -1);}
 *  */
    @Test
    public void testMinus_ReturnWithPeriodAdded() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        Partial actual = partial.minus(null);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#minus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, -1);}
 *  */
    @Test
    public void testMinus_ReturnWithPeriodAdded_1() throws Exception  {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        Partial actual = partial.minus(mutablePeriod);
        
        int[] intArray1 = {};
        Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#minus(org.joda.time.ReadablePeriod)}
 * @utbot.returnsFrom {@code return withPeriodAdded(period, -1);}
 *  */
    @Test
    public void testMinus_ReturnWithPeriodAdded_2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCTime = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cTime"));
        try {
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {};
            PeriodType cTime = new PeriodType(null, durationFieldTypeArray, null);
            setStaticField(periodTypeClazz, "cTime", cTime);
            int[] intArray = {};
            Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
            AbstractPeriod anonymousAbstractPeriod = ((AbstractPeriod) createInstance("org.joda.time.base.BasePeriod$1"));
            
            Partial actual = partial.minus(anonymousAbstractPeriod);
            
            int[] intArray1 = {};
            Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
            
            Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
            assertNull(actualIChronology);
            
            org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
            assertNull(actualITypes);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
            assertNull(actualIFormatter);
            
        } finally {
            setStaticField(PeriodType.class, "cTime", prevCTime);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.without
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method without(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (index != -1): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithout_IndexEqualsNegative1_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldType1Type = Class.forName("org.joda.time.DateTimeFieldType");
        Method withoutMethod = partialClazz.getDeclaredMethod("without", standardDateTimeFieldType1Type);
        withoutMethod.setAccessible(true);
        java.lang.Object[] withoutMethodArguments = new java.lang.Object[1];
        withoutMethodArguments[0] = standardDateTimeFieldType1;
        Partial actual = ((Partial) withoutMethod.invoke(partial, withoutMethodArguments));
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (index != -1): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithout_IndexEqualsNegative1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial actual = partial.without(null);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.executesCondition {@code (index != -1): True}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.returnsFrom {@code return newPartial;}
 *  */
    @Test
    public void testWithout_IndexNotEqualsNegative1() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {-255, -255};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        Partial actual = partial.without(null);
        
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = {};
        int[] intArray1 = {};
        Partial expected = new Partial(iSOChronology, dateTimeFieldTypeArray1, intArray1);
        
        Chronology expectedIChronology = ((Chronology) getFieldValue(expected, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronologyIBase = ((Chronology) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        assertNull(actualIChronologyIBase);
        
        Object actualIChronologyIParam = getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iParam");
        assertNull(actualIChronologyIParam);
        
        DurationField actualIChronologyIMillis = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        assertNull(actualIChronologyIMillis);
        
        DurationField actualIChronologyISeconds = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        assertNull(actualIChronologyISeconds);
        
        DurationField actualIChronologyIMinutes = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        assertNull(actualIChronologyIMinutes);
        
        DurationField actualIChronologyIHours = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHours"));
        assertNull(actualIChronologyIHours);
        
        DurationField actualIChronologyIHalfdays = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        assertNull(actualIChronologyIHalfdays);
        
        DurationField actualIChronologyIDays = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDays"));
        assertNull(actualIChronologyIDays);
        
        DurationField actualIChronologyIWeeks = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        assertNull(actualIChronologyIWeeks);
        
        DurationField actualIChronologyIWeekyears = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        assertNull(actualIChronologyIWeekyears);
        
        DurationField actualIChronologyIMonths = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        assertNull(actualIChronologyIMonths);
        
        DurationField actualIChronologyIYears = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYears"));
        assertNull(actualIChronologyIYears);
        
        DurationField actualIChronologyICenturies = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        assertNull(actualIChronologyICenturies);
        
        DurationField actualIChronologyIEras = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iEras"));
        assertNull(actualIChronologyIEras);
        
        DateTimeField actualIChronologyIMillisOfSecond = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        assertNull(actualIChronologyIMillisOfSecond);
        
        DateTimeField actualIChronologyIMillisOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        assertNull(actualIChronologyIMillisOfDay);
        
        DateTimeField actualIChronologyISecondOfMinute = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        assertNull(actualIChronologyISecondOfMinute);
        
        DateTimeField actualIChronologyISecondOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        assertNull(actualIChronologyISecondOfDay);
        
        DateTimeField actualIChronologyIMinuteOfHour = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        assertNull(actualIChronologyIMinuteOfHour);
        
        DateTimeField actualIChronologyIMinuteOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        assertNull(actualIChronologyIMinuteOfDay);
        
        DateTimeField actualIChronologyIHourOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        assertNull(actualIChronologyIHourOfDay);
        
        DateTimeField actualIChronologyIClockhourOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        assertNull(actualIChronologyIClockhourOfDay);
        
        DateTimeField actualIChronologyIHourOfHalfday = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        assertNull(actualIChronologyIHourOfHalfday);
        
        DateTimeField actualIChronologyIClockhourOfHalfday = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        assertNull(actualIChronologyIClockhourOfHalfday);
        
        DateTimeField actualIChronologyIHalfdayOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        assertNull(actualIChronologyIHalfdayOfDay);
        
        DateTimeField actualIChronologyIDayOfWeek = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        assertNull(actualIChronologyIDayOfWeek);
        
        DateTimeField actualIChronologyIDayOfMonth = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        assertNull(actualIChronologyIDayOfMonth);
        
        DateTimeField actualIChronologyIDayOfYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        assertNull(actualIChronologyIDayOfYear);
        
        DateTimeField actualIChronologyIWeekOfWeekyear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        assertNull(actualIChronologyIWeekOfWeekyear);
        
        DateTimeField actualIChronologyIWeekyear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        assertNull(actualIChronologyIWeekyear);
        
        DateTimeField actualIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        assertNull(actualIChronologyIWeekyearOfCentury);
        
        DateTimeField actualIChronologyIMonthOfYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        assertNull(actualIChronologyIMonthOfYear);
        
        DateTimeField actualIChronologyIYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYear"));
        assertNull(actualIChronologyIYear);
        
        DateTimeField actualIChronologyIYearOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        assertNull(actualIChronologyIYearOfEra);
        
        DateTimeField actualIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        assertNull(actualIChronologyIYearOfCentury);
        
        DateTimeField actualIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        assertNull(actualIChronologyICenturyOfEra);
        
        DateTimeField actualIChronologyIEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iEra"));
        assertNull(actualIChronologyIEra);
        
        int expectedIChronologyIBaseFlags = ((Integer) getFieldValue(expectedIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseFlags = ((Integer) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        assertEquals(expectedIChronologyIBaseFlags, actualIChronologyIBaseFlags);
        
        org.joda.time.DateTimeFieldType[] expectedITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(expected, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int expectedITypesSize = expectedITypes.length;
        assertEquals(expectedITypesSize, actualITypes.length);
        assertTrue(deepEquals(expectedITypes, actualITypes));
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method without(org.joda.time.DateTimeFieldType)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(iValues, index + 1, newValues, index, newValues.length - index);
 *  */
    @Test
    public void testWithout_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.without] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.joda.time.Partial.without(Partial.java:492) */
        partial.without(null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iChronology.validate(newPartial, newValues);
 *  */
    @Test
    public void testWithout_ThrowNullPointerException_1() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {-255, 1};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.without] produces [java.lang.NullPointerException]
            org.joda.time.Partial.without(Partial.java:494) */
        partial.without(null);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#without(org.joda.time.DateTimeFieldType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(iValues, 0, newValues, 0, index);
 *  */
    @Test
    public void testWithout_ThrowNullPointerException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.without] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.joda.time.Partial.without(Partial.java:491) */
        partial.without(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValues()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return (int[]) iValues.clone();}
 *  */
    @Test
    public void testGetValues_ObjectClone() {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        
        int[] actual = partial.getValues();
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValues()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (int[]) iValues.clone();
 *  */
    @Test
    public void testGetValues_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getValues] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getValues(Partial.java:381) */
        partial.getValues();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withField(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DateTimeFieldType)}
 * @utbot.invokes {@link org.joda.time.Partial#getValue(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithField_PartialGetValue() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {-255};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        Partial actual = partial.withField(null, -255);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] partialIValues = ((int[]) getFieldValue(partial, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int partialIValuesSize = partialIValues.length;
        assertEquals(partialIValuesSize, actualIValues.length);
        assertArrayEquals(partialIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
        org.joda.time.DateTimeFieldType[] partialITypes1 = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        DateTimeFieldType finalPartialITypes0 = ((DateTimeFieldType) get(partialITypes1, 0));
        
        assertNull(finalPartialITypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withField(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValue(int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link org.joda.time.Partial#getField(int)}
 * @utbot.throwsException {@link java.lang.InternalError} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test(expected = InternalError.class)
    public void testWithField_ThrowInternalError() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_ThrowIllegalArgumentException_1() throws Throwable  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldType1Type = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldType1Type, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType1;
        withFieldMethodArguments[1] = -255;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithField_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withField(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withField(org.joda.time.DateTimeFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: value == getValue(index)
 *  */
    @Test
    public void testWithField_ThrowArrayIndexOutOfBoundsException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.getValue(Partial.java:368)
            org.joda.time.Partial.withField(Partial.java:517) */
        partial.withField(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_1() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_2() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_3() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_4() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_5() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_6() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_7() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_8() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_9() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_10() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_11() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_12() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withField(org.joda.time.DateTimeFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).set(this, index, newValues, value);
 *  */
    @Test
    public void testWithField_ThrowNullPointerException_13() throws Throwable  {
        GJChronology gJChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {-183};
        Partial partial = new Partial(gJChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withField] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withField(Partial.java:521) */
        Class partialClazz = Class.forName("org.joda.time.Partial");
        Class standardDateTimeFieldTypeType = Class.forName("org.joda.time.DateTimeFieldType");
        Class intType = int.class;
        Method withFieldMethod = partialClazz.getDeclaredMethod("withField", standardDateTimeFieldTypeType, intType);
        withFieldMethod.setAccessible(true);
        java.lang.Object[] withFieldMethodArguments = new java.lang.Object[2];
        withFieldMethodArguments[0] = standardDateTimeFieldType;
        withFieldMethodArguments[1] = -74;
        try {
            withFieldMethod.invoke(partial, withFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withPeriodAdded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withPeriodAdded(org.joda.time.ReadablePeriod, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): False}
 * @utbot.executesCondition {@code (scalar == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithPeriodAdded_ScalarEqualsZero() throws Exception  {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        
        Partial actual = partial.withPeriodAdded(mutablePeriod, 0);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithPeriodAdded_PeriodEqualsNull() {
        Partial partial = new Partial(((Partial) null), ((int[]) null));
        
        Partial actual = partial.withPeriodAdded(null, -255);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): False}
 * @utbot.executesCondition {@code (scalar == 0): False}
 * @utbot.returnsFrom {@code return new Partial(this, newValues);}
 *  */
    @Test
    public void testWithPeriodAdded_ScalarNotEqualsZero_1() throws Exception  {
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
        MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
        PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
        org.joda.time.DurationFieldType[] iTypes = {};
        setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes);
        setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
        
        Partial actual = partial.withPeriodAdded(mutablePeriod, -255);
        
        int[] intArray1 = {};
        Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int expectedIValuesSize = expectedIValues.length;
        assertEquals(expectedIValuesSize, actualIValues.length);
        assertArrayEquals(expectedIValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
 * @utbot.executesCondition {@code (period == null): False}
 * @utbot.executesCondition {@code (scalar == 0): False}
 * @utbot.returnsFrom {@code return new Partial(this, newValues);}
 *  */
    @Test
    public void testWithPeriodAdded_ScalarNotEqualsZero() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCTime = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cTime"));
        try {
            org.joda.time.DurationFieldType[] durationFieldTypeArray = {};
            PeriodType cTime = new PeriodType(null, durationFieldTypeArray, null);
            setStaticField(periodTypeClazz, "cTime", cTime);
            int[] intArray = {};
            Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray);
            AbstractPeriod anonymousAbstractPeriod = ((AbstractPeriod) createInstance("org.joda.time.base.BasePeriod$1"));
            
            Partial actual = partial.withPeriodAdded(anonymousAbstractPeriod, -255);
            
            int[] intArray1 = {};
            Partial expected = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), intArray1);
            
            Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
            assertNull(actualIChronology);
            
            org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
            assertNull(actualITypes);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.Partial", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
            org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
            assertNull(actualIFormatter);
            
        } finally {
            setStaticField(PeriodType.class, "cTime", prevCTime);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withPeriodAdded(org.joda.time.ReadablePeriod, int)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Partial}
     * @utbot.methodUnderTest {@link org.joda.time.Partial#withPeriodAdded(org.joda.time.ReadablePeriod,int)}
     */
    @Test
    public void testWithPeriodAdded() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Partial partial = new Partial();
        int[] intArray = {0, -1, Integer.MAX_VALUE, 0};
        Partial partial1 = new Partial(partial, intArray);
        
        Partial actual = partial1.withPeriodAdded(null, 3);
        
        Chronology partial1IChronology = ((Chronology) getFieldValue(partial1, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        Chronology partial1IChronologyIBase = ((Chronology) getFieldValue(partial1IChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        Chronology actualIChronologyIBase = ((Chronology) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        Object partial1IChronologyIBaseIYearInfoCache = getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object actualIChronologyIBaseIYearInfoCache = getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        int partial1IChronologyIBaseIYearInfoCacheSize = getArrayLength(partial1IChronologyIBaseIYearInfoCache);
        assertEquals(partial1IChronologyIBaseIYearInfoCacheSize, getArrayLength(actualIChronologyIBaseIYearInfoCache));
        assertTrue(deepEquals(partial1IChronologyIBaseIYearInfoCache, actualIChronologyIBaseIYearInfoCache));
        
        int partial1IChronologyIBaseIMinDaysInFirstWeek = ((Integer) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.BasicChronology", "iMinDaysInFirstWeek"));
        int actualIChronologyIBaseIMinDaysInFirstWeek = ((Integer) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.BasicChronology", "iMinDaysInFirstWeek"));
        assertEquals(partial1IChronologyIBaseIMinDaysInFirstWeek, actualIChronologyIBaseIMinDaysInFirstWeek);
        
        Chronology actualIChronologyIBaseIBase = ((Chronology) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iBase"));
        assertNull(actualIChronologyIBaseIBase);
        
        Object actualIChronologyIBaseIParam = getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iParam");
        assertNull(actualIChronologyIBaseIParam);
        
        DurationField partial1IChronologyIBaseIMillis = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        DurationField actualIChronologyIBaseIMillis = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        
        DurationField partial1IChronologyIBaseISeconds = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        DurationField actualIChronologyIBaseISeconds = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        long partial1IChronologyIBaseISecondsIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseISeconds, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseISecondsIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseISeconds, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseISecondsIUnitMillis, actualIChronologyIBaseISecondsIUnitMillis);
        
        DurationFieldType partial1IChronologyIBaseISecondsIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseISeconds, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseISecondsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseISeconds, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseISecondsITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseISecondsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondsITypeIOrdinal, actualIChronologyIBaseISecondsITypeIOrdinal));
        
        String partial1IChronologyIBaseISecondsITypeIName = ((String) getFieldValue(partial1IChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseISecondsITypeIName = ((String) getFieldValue(actualIChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondsITypeIName, actualIChronologyIBaseISecondsITypeIName));
        
        DurationField partial1IChronologyIBaseIMinutes = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        DurationField actualIChronologyIBaseIMinutes = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        long partial1IChronologyIBaseIMinutesIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIMinutes, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIMinutesIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIMinutes, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIMinutesIUnitMillis, actualIChronologyIBaseIMinutesIUnitMillis);
        
        DurationFieldType partial1IChronologyIBaseIMinutesIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIMinutes, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIMinutesIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMinutes, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIMinutesITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMinutesITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinutesITypeIOrdinal, actualIChronologyIBaseIMinutesITypeIOrdinal));
        
        String partial1IChronologyIBaseIMinutesITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIMinutesITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinutesITypeIName, actualIChronologyIBaseIMinutesITypeIName));
        
        DurationField partial1IChronologyIBaseIHours = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHours"));
        DurationField actualIChronologyIBaseIHours = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHours"));
        long partial1IChronologyIBaseIHoursIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIHours, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIHoursIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHours, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIHoursIUnitMillis, actualIChronologyIBaseIHoursIUnitMillis);
        
        DurationFieldType partial1IChronologyIBaseIHoursIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIHours, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIHoursIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHours, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIHoursITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHoursITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHoursITypeIOrdinal, actualIChronologyIBaseIHoursITypeIOrdinal));
        
        String partial1IChronologyIBaseIHoursITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIHoursITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHoursITypeIName, actualIChronologyIBaseIHoursITypeIName));
        
        DurationField partial1IChronologyIBaseIHalfdays = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        DurationField actualIChronologyIBaseIHalfdays = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        long partial1IChronologyIBaseIHalfdaysIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIHalfdays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIHalfdaysIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHalfdays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIHalfdaysIUnitMillis, actualIChronologyIBaseIHalfdaysIUnitMillis);
        
        DurationFieldType partial1IChronologyIBaseIHalfdaysIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIHalfdays, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIHalfdaysIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHalfdays, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIHalfdaysITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHalfdaysITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdaysITypeIOrdinal, actualIChronologyIBaseIHalfdaysITypeIOrdinal));
        
        String partial1IChronologyIBaseIHalfdaysITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIHalfdaysITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdaysITypeIName, actualIChronologyIBaseIHalfdaysITypeIName));
        
        DurationField partial1IChronologyIBaseIDays = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDays"));
        DurationField actualIChronologyIBaseIDays = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDays"));
        long partial1IChronologyIBaseIDaysIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIDays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIDaysIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIDays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIDaysIUnitMillis, actualIChronologyIBaseIDaysIUnitMillis);
        
        DurationFieldType partial1IChronologyIBaseIDaysIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIDays, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIDaysIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIDays, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIDaysITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIDaysITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDaysITypeIOrdinal, actualIChronologyIBaseIDaysITypeIOrdinal));
        
        String partial1IChronologyIBaseIDaysITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIDaysITypeIName = ((String) getFieldValue(actualIChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDaysITypeIName, actualIChronologyIBaseIDaysITypeIName));
        
        DurationField partial1IChronologyIBaseIWeeks = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        DurationField actualIChronologyIBaseIWeeks = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        long partial1IChronologyIBaseIWeeksIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIWeeks, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIWeeksIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIWeeks, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIWeeksIUnitMillis, actualIChronologyIBaseIWeeksIUnitMillis);
        
        DurationFieldType partial1IChronologyIBaseIWeeksIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIWeeks, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIWeeksIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIWeeks, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIWeeksITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIWeeksITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIWeeksITypeIOrdinal, actualIChronologyIBaseIWeeksITypeIOrdinal));
        
        String partial1IChronologyIBaseIWeeksITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIWeeksITypeIName = ((String) getFieldValue(actualIChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIWeeksITypeIName, actualIChronologyIBaseIWeeksITypeIName));
        
        DurationField partial1IChronologyIBaseIWeekyears = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        DurationField actualIChronologyIBaseIWeekyears = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        DurationFieldType partial1IChronologyIBaseIWeekyearsIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIWeekyears, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIWeekyearsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIWeekyears, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIWeekyearsITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIWeekyearsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIWeekyearsITypeIOrdinal, actualIChronologyIBaseIWeekyearsITypeIOrdinal));
        
        String partial1IChronologyIBaseIWeekyearsITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIWeekyearsITypeIName = ((String) getFieldValue(actualIChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIWeekyearsITypeIName, actualIChronologyIBaseIWeekyearsITypeIName));
        
        DurationField partial1IChronologyIBaseIMonths = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        DurationField actualIChronologyIBaseIMonths = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        DurationFieldType partial1IChronologyIBaseIMonthsIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIMonths, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIMonthsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMonths, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIMonthsITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMonthsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMonthsITypeIOrdinal, actualIChronologyIBaseIMonthsITypeIOrdinal));
        
        String partial1IChronologyIBaseIMonthsITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIMonthsITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMonthsITypeIName, actualIChronologyIBaseIMonthsITypeIName));
        
        DurationField partial1IChronologyIBaseIYears = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYears"));
        DurationField actualIChronologyIBaseIYears = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYears"));
        DurationFieldType partial1IChronologyIBaseIYearsIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIYears, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIYearsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIYears, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseIYearsITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIYearsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIYearsITypeIOrdinal, actualIChronologyIBaseIYearsITypeIOrdinal));
        
        String partial1IChronologyIBaseIYearsITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIYearsITypeIName = ((String) getFieldValue(actualIChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIYearsITypeIName, actualIChronologyIBaseIYearsITypeIName));
        
        DurationField partial1IChronologyIBaseICenturies = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        DurationField actualIChronologyIBaseICenturies = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        int partial1IChronologyIBaseICenturiesIScalar = ((Integer) getFieldValue(partial1IChronologyIBaseICenturies, "org.joda.time.field.ScaledDurationField", "iScalar"));
        int actualIChronologyIBaseICenturiesIScalar = ((Integer) getFieldValue(actualIChronologyIBaseICenturies, "org.joda.time.field.ScaledDurationField", "iScalar"));
        assertEquals(partial1IChronologyIBaseICenturiesIScalar, actualIChronologyIBaseICenturiesIScalar);
        
        DurationField partial1IChronologyIBaseICenturiesIField = ((DurationField) getFieldValue(partial1IChronologyIBaseICenturies, "org.joda.time.field.DecoratedDurationField", "iField"));
        DurationField actualIChronologyIBaseICenturiesIField = ((DurationField) getFieldValue(actualIChronologyIBaseICenturies, "org.joda.time.field.DecoratedDurationField", "iField"));
        assertTrue(deepEquals(partial1IChronologyIBaseICenturiesIField, actualIChronologyIBaseICenturiesIField));
        
        DurationFieldType partial1IChronologyIBaseICenturiesIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseICenturies, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseICenturiesIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseICenturies, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial1IChronologyIBaseICenturiesITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseICenturiesITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseICenturiesITypeIOrdinal, actualIChronologyIBaseICenturiesITypeIOrdinal));
        
        String partial1IChronologyIBaseICenturiesITypeIName = ((String) getFieldValue(partial1IChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseICenturiesITypeIName = ((String) getFieldValue(actualIChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseICenturiesITypeIName, actualIChronologyIBaseICenturiesITypeIName));
        
        DurationField partial1IChronologyIBaseIEras = ((DurationField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iEras"));
        DurationField actualIChronologyIBaseIEras = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iEras"));
        DurationFieldType partial1IChronologyIBaseIErasIType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIEras, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIErasIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIEras, "org.joda.time.field.UnsupportedDurationField", "iType"));
        byte partial1IChronologyIBaseIErasITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIErasIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIErasITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIErasIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIErasITypeIOrdinal, actualIChronologyIBaseIErasITypeIOrdinal));
        
        String partial1IChronologyIBaseIErasITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIErasIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIErasITypeIName = ((String) getFieldValue(actualIChronologyIBaseIErasIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIErasITypeIName, actualIChronologyIBaseIErasITypeIName));
        
        DateTimeField partial1IChronologyIBaseIMillisOfSecond = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        DateTimeField actualIChronologyIBaseIMillisOfSecond = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        int partial1IChronologyIBaseIMillisOfSecondIRange = ((Integer) getFieldValue(partial1IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIMillisOfSecondIRange = ((Integer) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseIMillisOfSecondIRange, actualIChronologyIBaseIMillisOfSecondIRange);
        
        DurationField partial1IChronologyIBaseIMillisOfSecondIRangeField = ((DurationField) getFieldValue(partial1IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIMillisOfSecondIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfSecondIRangeField, actualIChronologyIBaseIMillisOfSecondIRangeField));
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfSecondIRangeField, actualIChronologyIBaseIMillisOfSecondIRangeField));
        
        long partial1IChronologyIBaseIMillisOfSecondIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIMillisOfSecondIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIMillisOfSecondIUnitMillis, actualIChronologyIBaseIMillisOfSecondIUnitMillis);
        
        DurationField partial1IChronologyIBaseIMillisOfSecondIUnitField = ((DurationField) getFieldValue(partial1IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIMillisOfSecondIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        
        DateTimeFieldType partial1IChronologyIBaseIMillisOfSecondIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIMillisOfSecond, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMillisOfSecondIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIMillisOfSecondITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMillisOfSecondITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfSecondITypeIOrdinal, actualIChronologyIBaseIMillisOfSecondITypeIOrdinal));
        
        DurationFieldType partial1IChronologyIBaseIMillisOfSecondITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIMillisOfSecondITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfSecondITypeIUnitType, actualIChronologyIBaseIMillisOfSecondITypeIUnitType));
        
        DurationFieldType partial1IChronologyIBaseIMillisOfSecondITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIMillisOfSecondITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfSecondITypeIRangeType, actualIChronologyIBaseIMillisOfSecondITypeIRangeType));
        
        String partial1IChronologyIBaseIMillisOfSecondITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMillisOfSecondITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfSecondITypeIName, actualIChronologyIBaseIMillisOfSecondITypeIName));
        
        DateTimeField partial1IChronologyIBaseIMillisOfDay = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        DateTimeField actualIChronologyIBaseIMillisOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        int partial1IChronologyIBaseIMillisOfDayIRange = ((Integer) getFieldValue(partial1IChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIMillisOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseIMillisOfDayIRange, actualIChronologyIBaseIMillisOfDayIRange);
        
        DurationField partial1IChronologyIBaseIMillisOfDayIRangeField = ((DurationField) getFieldValue(partial1IChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIMillisOfDayIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDayIRangeField, actualIChronologyIBaseIMillisOfDayIRangeField));
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDayIRangeField, actualIChronologyIBaseIMillisOfDayIRangeField));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDay, actualIChronologyIBaseIMillisOfDay));
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDay, actualIChronologyIBaseIMillisOfDay));
        DateTimeFieldType partial1IChronologyIBaseIMillisOfDayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIMillisOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMillisOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMillisOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIMillisOfDayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMillisOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDayITypeIOrdinal, actualIChronologyIBaseIMillisOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDayIType, actualIChronologyIBaseIMillisOfDayIType));
        DurationFieldType partial1IChronologyIBaseIMillisOfDayITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIMillisOfDayITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDayITypeIRangeType, actualIChronologyIBaseIMillisOfDayITypeIRangeType));
        
        String partial1IChronologyIBaseIMillisOfDayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMillisOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMillisOfDayITypeIName, actualIChronologyIBaseIMillisOfDayITypeIName));
        
        DateTimeField partial1IChronologyIBaseISecondOfMinute = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        DateTimeField actualIChronologyIBaseISecondOfMinute = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        int partial1IChronologyIBaseISecondOfMinuteIRange = ((Integer) getFieldValue(partial1IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseISecondOfMinuteIRange = ((Integer) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseISecondOfMinuteIRange, actualIChronologyIBaseISecondOfMinuteIRange);
        
        DurationField partial1IChronologyIBaseISecondOfMinuteIRangeField = ((DurationField) getFieldValue(partial1IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseISecondOfMinuteIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteIRangeField, actualIChronologyIBaseISecondOfMinuteIRangeField));
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteIRangeField, actualIChronologyIBaseISecondOfMinuteIRangeField));
        
        long partial1IChronologyIBaseISecondOfMinuteIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseISecondOfMinuteIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseISecondOfMinuteIUnitMillis, actualIChronologyIBaseISecondOfMinuteIUnitMillis);
        
        DurationField partial1IChronologyIBaseISecondOfMinuteIUnitField = ((DurationField) getFieldValue(partial1IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseISecondOfMinuteIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteIUnitField, actualIChronologyIBaseISecondOfMinuteIUnitField));
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteIUnitField, actualIChronologyIBaseISecondOfMinuteIUnitField));
        
        DateTimeFieldType partial1IChronologyIBaseISecondOfMinuteIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseISecondOfMinute, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseISecondOfMinuteIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseISecondOfMinuteITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseISecondOfMinuteITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteITypeIOrdinal, actualIChronologyIBaseISecondOfMinuteITypeIOrdinal));
        
        DurationFieldType partial1IChronologyIBaseISecondOfMinuteITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseISecondOfMinuteITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteITypeIUnitType, actualIChronologyIBaseISecondOfMinuteITypeIUnitType));
        
        DurationFieldType partial1IChronologyIBaseISecondOfMinuteITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseISecondOfMinuteITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteITypeIRangeType, actualIChronologyIBaseISecondOfMinuteITypeIRangeType));
        
        String partial1IChronologyIBaseISecondOfMinuteITypeIName = ((String) getFieldValue(partial1IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseISecondOfMinuteITypeIName = ((String) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfMinuteITypeIName, actualIChronologyIBaseISecondOfMinuteITypeIName));
        
        DateTimeField partial1IChronologyIBaseISecondOfDay = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        DateTimeField actualIChronologyIBaseISecondOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        int partial1IChronologyIBaseISecondOfDayIRange = ((Integer) getFieldValue(partial1IChronologyIBaseISecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseISecondOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseISecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseISecondOfDayIRange, actualIChronologyIBaseISecondOfDayIRange);
        
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfDay, actualIChronologyIBaseISecondOfDay));
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfDay, actualIChronologyIBaseISecondOfDay));
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfDay, actualIChronologyIBaseISecondOfDay));
        DateTimeFieldType partial1IChronologyIBaseISecondOfDayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseISecondOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseISecondOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseISecondOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseISecondOfDayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseISecondOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfDayITypeIOrdinal, actualIChronologyIBaseISecondOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfDayIType, actualIChronologyIBaseISecondOfDayIType));
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfDayIType, actualIChronologyIBaseISecondOfDayIType));
        String partial1IChronologyIBaseISecondOfDayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseISecondOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseISecondOfDayITypeIName, actualIChronologyIBaseISecondOfDayITypeIName));
        
        DateTimeField partial1IChronologyIBaseIMinuteOfHour = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        DateTimeField actualIChronologyIBaseIMinuteOfHour = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHour, actualIChronologyIBaseIMinuteOfHour));
        DurationField partial1IChronologyIBaseIMinuteOfHourIRangeField = ((DurationField) getFieldValue(partial1IChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIMinuteOfHourIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourIRangeField, actualIChronologyIBaseIMinuteOfHourIRangeField));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourIRangeField, actualIChronologyIBaseIMinuteOfHourIRangeField));
        
        long partial1IChronologyIBaseIMinuteOfHourIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIMinuteOfHourIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIMinuteOfHourIUnitMillis, actualIChronologyIBaseIMinuteOfHourIUnitMillis);
        
        DurationField partial1IChronologyIBaseIMinuteOfHourIUnitField = ((DurationField) getFieldValue(partial1IChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIMinuteOfHourIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourIUnitField, actualIChronologyIBaseIMinuteOfHourIUnitField));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourIUnitField, actualIChronologyIBaseIMinuteOfHourIUnitField));
        
        DateTimeFieldType partial1IChronologyIBaseIMinuteOfHourIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIMinuteOfHour, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMinuteOfHourIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIMinuteOfHourITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMinuteOfHourITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourITypeIOrdinal, actualIChronologyIBaseIMinuteOfHourITypeIOrdinal));
        
        DurationFieldType partial1IChronologyIBaseIMinuteOfHourITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIMinuteOfHourITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourITypeIUnitType, actualIChronologyIBaseIMinuteOfHourITypeIUnitType));
        
        DurationFieldType partial1IChronologyIBaseIMinuteOfHourITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIMinuteOfHourITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourITypeIRangeType, actualIChronologyIBaseIMinuteOfHourITypeIRangeType));
        
        String partial1IChronologyIBaseIMinuteOfHourITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMinuteOfHourITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfHourITypeIName, actualIChronologyIBaseIMinuteOfHourITypeIName));
        
        DateTimeField partial1IChronologyIBaseIMinuteOfDay = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        DateTimeField actualIChronologyIBaseIMinuteOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        int partial1IChronologyIBaseIMinuteOfDayIRange = ((Integer) getFieldValue(partial1IChronologyIBaseIMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIMinuteOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseIMinuteOfDayIRange, actualIChronologyIBaseIMinuteOfDayIRange);
        
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfDay, actualIChronologyIBaseIMinuteOfDay));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfDay, actualIChronologyIBaseIMinuteOfDay));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfDay, actualIChronologyIBaseIMinuteOfDay));
        DateTimeFieldType partial1IChronologyIBaseIMinuteOfDayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIMinuteOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMinuteOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIMinuteOfDayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMinuteOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfDayITypeIOrdinal, actualIChronologyIBaseIMinuteOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfDayIType, actualIChronologyIBaseIMinuteOfDayIType));
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfDayIType, actualIChronologyIBaseIMinuteOfDayIType));
        String partial1IChronologyIBaseIMinuteOfDayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMinuteOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIMinuteOfDayITypeIName, actualIChronologyIBaseIMinuteOfDayITypeIName));
        
        DateTimeField partial1IChronologyIBaseIHourOfDay = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        DateTimeField actualIChronologyIBaseIHourOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        int partial1IChronologyIBaseIHourOfDayIRange = ((Integer) getFieldValue(partial1IChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIHourOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseIHourOfDayIRange, actualIChronologyIBaseIHourOfDayIRange);
        
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfDay, actualIChronologyIBaseIHourOfDay));
        long partial1IChronologyIBaseIHourOfDayIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIHourOfDayIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIHourOfDayIUnitMillis, actualIChronologyIBaseIHourOfDayIUnitMillis);
        
        DurationField partial1IChronologyIBaseIHourOfDayIUnitField = ((DurationField) getFieldValue(partial1IChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIHourOfDayIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfDayIUnitField, actualIChronologyIBaseIHourOfDayIUnitField));
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfDayIUnitField, actualIChronologyIBaseIHourOfDayIUnitField));
        
        DateTimeFieldType partial1IChronologyIBaseIHourOfDayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIHourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIHourOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIHourOfDayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHourOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfDayITypeIOrdinal, actualIChronologyIBaseIHourOfDayITypeIOrdinal));
        
        DurationFieldType partial1IChronologyIBaseIHourOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIHourOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfDayITypeIUnitType, actualIChronologyIBaseIHourOfDayITypeIUnitType));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfDayIType, actualIChronologyIBaseIHourOfDayIType));
        String partial1IChronologyIBaseIHourOfDayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIHourOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfDayITypeIName, actualIChronologyIBaseIHourOfDayITypeIName));
        
        DateTimeField partial1IChronologyIBaseIClockhourOfDay = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        DateTimeField actualIChronologyIBaseIClockhourOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        DateTimeField partial1IChronologyIBaseIClockhourOfDayIField = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIClockhourOfDay, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIBaseIClockhourOfDayIField = ((DateTimeField) getFieldValue(actualIChronologyIBaseIClockhourOfDay, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        
        DateTimeFieldType partial1IChronologyIBaseIClockhourOfDayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIClockhourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIClockhourOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIClockhourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIClockhourOfDayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIClockhourOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayITypeIOrdinal, actualIChronologyIBaseIClockhourOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayIType, actualIChronologyIBaseIClockhourOfDayIType));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayIType, actualIChronologyIBaseIClockhourOfDayIType));
        String partial1IChronologyIBaseIClockhourOfDayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIClockhourOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfDayITypeIName, actualIChronologyIBaseIClockhourOfDayITypeIName));
        
        DateTimeField partial1IChronologyIBaseIHourOfHalfday = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        DateTimeField actualIChronologyIBaseIHourOfHalfday = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        int partial1IChronologyIBaseIHourOfHalfdayIRange = ((Integer) getFieldValue(partial1IChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIHourOfHalfdayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseIHourOfHalfdayIRange, actualIChronologyIBaseIHourOfHalfdayIRange);
        
        DurationField partial1IChronologyIBaseIHourOfHalfdayIRangeField = ((DurationField) getFieldValue(partial1IChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIHourOfHalfdayIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfdayIRangeField, actualIChronologyIBaseIHourOfHalfdayIRangeField));
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfdayIRangeField, actualIChronologyIBaseIHourOfHalfdayIRangeField));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfday, actualIChronologyIBaseIHourOfHalfday));
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfday, actualIChronologyIBaseIHourOfHalfday));
        DateTimeFieldType partial1IChronologyIBaseIHourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIHourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIHourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIHourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIHourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfdayITypeIOrdinal, actualIChronologyIBaseIHourOfHalfdayITypeIOrdinal));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfdayIType, actualIChronologyIBaseIHourOfHalfdayIType));
        DurationFieldType partial1IChronologyIBaseIHourOfHalfdayITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIHourOfHalfdayITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfdayITypeIRangeType, actualIChronologyIBaseIHourOfHalfdayITypeIRangeType));
        
        String partial1IChronologyIBaseIHourOfHalfdayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIHourOfHalfdayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHourOfHalfdayITypeIName, actualIChronologyIBaseIHourOfHalfdayITypeIName));
        
        DateTimeField partial1IChronologyIBaseIClockhourOfHalfday = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        DateTimeField actualIChronologyIBaseIClockhourOfHalfday = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        DateTimeField partial1IChronologyIBaseIClockhourOfHalfdayIField = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIBaseIClockhourOfHalfdayIField = ((DateTimeField) getFieldValue(actualIChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        
        DateTimeFieldType partial1IChronologyIBaseIClockhourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIClockhourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIClockhourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIClockhourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayITypeIOrdinal, actualIChronologyIBaseIClockhourOfHalfdayITypeIOrdinal));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayIType, actualIChronologyIBaseIClockhourOfHalfdayIType));
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayIType, actualIChronologyIBaseIClockhourOfHalfdayIType));
        String partial1IChronologyIBaseIClockhourOfHalfdayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIClockhourOfHalfdayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIClockhourOfHalfdayITypeIName, actualIChronologyIBaseIClockhourOfHalfdayITypeIName));
        
        DateTimeField partial1IChronologyIBaseIHalfdayOfDay = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        DateTimeField actualIChronologyIBaseIHalfdayOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        int partial1IChronologyIBaseIHalfdayOfDayIRange = ((Integer) getFieldValue(partial1IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIHalfdayOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial1IChronologyIBaseIHalfdayOfDayIRange, actualIChronologyIBaseIHalfdayOfDayIRange);
        
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdayOfDay, actualIChronologyIBaseIHalfdayOfDay));
        long partial1IChronologyIBaseIHalfdayOfDayIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIHalfdayOfDayIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIHalfdayOfDayIUnitMillis, actualIChronologyIBaseIHalfdayOfDayIUnitMillis);
        
        DurationField partial1IChronologyIBaseIHalfdayOfDayIUnitField = ((DurationField) getFieldValue(partial1IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIHalfdayOfDayIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdayOfDayIUnitField, actualIChronologyIBaseIHalfdayOfDayIUnitField));
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdayOfDayIUnitField, actualIChronologyIBaseIHalfdayOfDayIUnitField));
        
        DateTimeFieldType partial1IChronologyIBaseIHalfdayOfDayIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIHalfdayOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIHalfdayOfDayITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHalfdayOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdayOfDayITypeIOrdinal, actualIChronologyIBaseIHalfdayOfDayITypeIOrdinal));
        
        DurationFieldType partial1IChronologyIBaseIHalfdayOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIHalfdayOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdayOfDayITypeIUnitType, actualIChronologyIBaseIHalfdayOfDayITypeIUnitType));
        
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdayOfDayIType, actualIChronologyIBaseIHalfdayOfDayIType));
        String partial1IChronologyIBaseIHalfdayOfDayITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIHalfdayOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIHalfdayOfDayITypeIName, actualIChronologyIBaseIHalfdayOfDayITypeIName));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeek = ((DateTimeField) getFieldValue(partial1IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        DateTimeField actualIChronologyIBaseIDayOfWeek = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        Object partial1IChronologyIBaseIDayOfWeekIChronology = getFieldValue(partial1IChronologyIBaseIDayOfWeek, "org.joda.time.chrono.GJDayOfWeekDateTimeField", "iChronology");
        Object actualIChronologyIBaseIDayOfWeekIChronology = getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.chrono.GJDayOfWeekDateTimeField", "iChronology");
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIDayOfMonth = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIDayOfMonth = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIDayOfMonth, actualIChronologyIBaseIDayOfWeekIChronologyIDayOfMonth));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIDayOfYear = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIDayOfYear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIDayOfYear, actualIChronologyIBaseIDayOfWeekIChronologyIDayOfYear));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear, actualIChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIWeekyear = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIWeekyear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIWeekyear, actualIChronologyIBaseIDayOfWeekIChronologyIWeekyear));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury, actualIChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIMonthOfYear = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIMonthOfYear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIMonthOfYear, actualIChronologyIBaseIDayOfWeekIChronologyIMonthOfYear));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIYear = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIYear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIYear, actualIChronologyIBaseIDayOfWeekIChronologyIYear));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIYearOfEra = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIYearOfEra = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIYearOfEra, actualIChronologyIBaseIDayOfWeekIChronologyIYearOfEra));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIYearOfCentury, actualIChronologyIBaseIDayOfWeekIChronologyIYearOfCentury));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyICenturyOfEra, actualIChronologyIBaseIDayOfWeekIChronologyICenturyOfEra));
        
        DateTimeField partial1IChronologyIBaseIDayOfWeekIChronologyIEra = ((DateTimeField) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iEra"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIEra = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iEra"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIEra, actualIChronologyIBaseIDayOfWeekIChronologyIEra));
        
        int partial1IChronologyIBaseIDayOfWeekIChronologyIBaseFlags = ((Integer) getFieldValue(partial1IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseIDayOfWeekIChronologyIBaseFlags = ((Integer) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIChronologyIBaseFlags, actualIChronologyIBaseIDayOfWeekIChronologyIBaseFlags));
        
        long partial1IChronologyIBaseIDayOfWeekIUnitMillis = ((Long) getFieldValue(partial1IChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIDayOfWeekIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial1IChronologyIBaseIDayOfWeekIUnitMillis, actualIChronologyIBaseIDayOfWeekIUnitMillis);
        
        DurationField partial1IChronologyIBaseIDayOfWeekIUnitField = ((DurationField) getFieldValue(partial1IChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIDayOfWeekIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIUnitField, actualIChronologyIBaseIDayOfWeekIUnitField));
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekIUnitField, actualIChronologyIBaseIDayOfWeekIUnitField));
        
        DateTimeFieldType partial1IChronologyIBaseIDayOfWeekIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIBaseIDayOfWeek, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIDayOfWeekIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIBaseIDayOfWeekITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIDayOfWeekITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekITypeIOrdinal, actualIChronologyIBaseIDayOfWeekITypeIOrdinal));
        
        DurationFieldType partial1IChronologyIBaseIDayOfWeekITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIDayOfWeekITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekITypeIUnitType, actualIChronologyIBaseIDayOfWeekITypeIUnitType));
        
        DurationFieldType partial1IChronologyIBaseIDayOfWeekITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIDayOfWeekITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekITypeIRangeType, actualIChronologyIBaseIDayOfWeekITypeIRangeType));
        
        String partial1IChronologyIBaseIDayOfWeekITypeIName = ((String) getFieldValue(partial1IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIDayOfWeekITypeIName = ((String) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIBaseIDayOfWeekITypeIName, actualIChronologyIBaseIDayOfWeekITypeIName));
        
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial1IChronologyIBase, actualIChronologyIBase));
        
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        DurationField partial1IChronologyICenturies = ((DurationField) getFieldValue(partial1IChronology, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        DurationField actualIChronologyICenturies = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        assertTrue(deepEquals(partial1IChronologyICenturies, actualIChronologyICenturies));
        assertTrue(deepEquals(partial1IChronologyICenturies, actualIChronologyICenturies));
        assertTrue(deepEquals(partial1IChronologyICenturies, actualIChronologyICenturies));
        
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        DateTimeField partial1IChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(partial1IChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        DateTimeField actualIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        int partial1IChronologyIWeekyearOfCenturyIDivisor = ((Integer) getFieldValue(partial1IChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDivisor"));
        int actualIChronologyIWeekyearOfCenturyIDivisor = ((Integer) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDivisor"));
        assertEquals(partial1IChronologyIWeekyearOfCenturyIDivisor, actualIChronologyIWeekyearOfCenturyIDivisor);
        
        DurationField partial1IChronologyIWeekyearOfCenturyIDurationField = ((DurationField) getFieldValue(partial1IChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        DurationField actualIChronologyIWeekyearOfCenturyIDurationField = ((DurationField) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIDurationField, actualIChronologyIWeekyearOfCenturyIDurationField));
        
        DurationField partial1IChronologyIWeekyearOfCenturyIRangeField = ((DurationField) getFieldValue(partial1IChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iRangeField"));
        DurationField actualIChronologyIWeekyearOfCenturyIRangeField = ((DurationField) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIRangeField, actualIChronologyIWeekyearOfCenturyIRangeField));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIRangeField, actualIChronologyIWeekyearOfCenturyIRangeField));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIRangeField, actualIChronologyIWeekyearOfCenturyIRangeField));
        
        DateTimeField partial1IChronologyIWeekyearOfCenturyIField = ((DateTimeField) getFieldValue(partial1IChronologyIWeekyearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIWeekyearOfCenturyIField = ((DateTimeField) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField partial1IChronologyIWeekyearOfCenturyIFieldIField = ((DateTimeField) getFieldValue(partial1IChronologyIWeekyearOfCenturyIField, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIWeekyearOfCenturyIFieldIField = ((DateTimeField) getFieldValue(actualIChronologyIWeekyearOfCenturyIField, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        Object partial1IChronologyIWeekyearOfCenturyIFieldIFieldIChronology = getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.chrono.BasicYearDateTimeField", "iChronology");
        Object actualIChronologyIWeekyearOfCenturyIFieldIFieldIChronology = getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.chrono.BasicYearDateTimeField", "iChronology");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldIFieldIChronology, actualIChronologyIWeekyearOfCenturyIFieldIFieldIChronology));
        
        long partial1IChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis = ((Long) getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        long actualIChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis = ((Long) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis, actualIChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis));
        
        DurationField partial1IChronologyIWeekyearOfCenturyIFieldIFieldIDurationField = ((DurationField) getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        DurationField actualIChronologyIWeekyearOfCenturyIFieldIFieldIDurationField = ((DurationField) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldIFieldIDurationField, actualIChronologyIWeekyearOfCenturyIFieldIFieldIDurationField));
        
        DateTimeFieldType partial1IChronologyIWeekyearOfCenturyIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIWeekyearOfCenturyIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldIFieldIType, actualIChronologyIWeekyearOfCenturyIFieldIFieldIType));
        
        DateTimeFieldType partial1IChronologyIWeekyearOfCenturyIFieldIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIWeekyearOfCenturyIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIWeekyearOfCenturyIFieldIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIWeekyearOfCenturyIFieldITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIWeekyearOfCenturyIFieldITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldITypeIOrdinal, actualIChronologyIWeekyearOfCenturyIFieldITypeIOrdinal));
        
        DurationFieldType partial1IChronologyIWeekyearOfCenturyIFieldITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyIFieldITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldITypeIUnitType, actualIChronologyIWeekyearOfCenturyIFieldITypeIUnitType));
        
        DurationFieldType partial1IChronologyIWeekyearOfCenturyIFieldITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyIFieldITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldITypeIRangeType, actualIChronologyIWeekyearOfCenturyIFieldITypeIRangeType));
        
        String partial1IChronologyIWeekyearOfCenturyIFieldITypeIName = ((String) getFieldValue(partial1IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIWeekyearOfCenturyIFieldITypeIName = ((String) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyIFieldITypeIName, actualIChronologyIWeekyearOfCenturyIFieldITypeIName));
        
        DateTimeFieldType partial1IChronologyIWeekyearOfCenturyIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIWeekyearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIWeekyearOfCenturyIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIWeekyearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIWeekyearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(partial1IChronologyIWeekyearOfCenturyITypeIOrdinal, actualIChronologyIWeekyearOfCenturyITypeIOrdinal);
        
        DurationFieldType partial1IChronologyIWeekyearOfCenturyITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyITypeIUnitType, actualIChronologyIWeekyearOfCenturyITypeIUnitType));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyITypeIUnitType, actualIChronologyIWeekyearOfCenturyITypeIUnitType));
        
        DurationFieldType partial1IChronologyIWeekyearOfCenturyITypeIRangeType = ((DurationFieldType) getFieldValue(partial1IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyITypeIRangeType, actualIChronologyIWeekyearOfCenturyITypeIRangeType));
        assertTrue(deepEquals(partial1IChronologyIWeekyearOfCenturyITypeIRangeType, actualIChronologyIWeekyearOfCenturyITypeIRangeType));
        
        String partial1IChronologyIWeekyearOfCenturyITypeIName = ((String) getFieldValue(partial1IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIWeekyearOfCenturyITypeIName = ((String) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(partial1IChronologyIWeekyearOfCenturyITypeIName, actualIChronologyIWeekyearOfCenturyITypeIName);
        
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        DateTimeField partial1IChronologyIYearOfCentury = ((DateTimeField) getFieldValue(partial1IChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        DateTimeField actualIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        assertTrue(deepEquals(partial1IChronologyIYearOfCentury, actualIChronologyIYearOfCentury));
        DurationField partial1IChronologyIYearOfCenturyIDurationField = ((DurationField) getFieldValue(partial1IChronologyIYearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        DurationField actualIChronologyIYearOfCenturyIDurationField = ((DurationField) getFieldValue(actualIChronologyIYearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        assertTrue(deepEquals(partial1IChronologyIYearOfCenturyIDurationField, actualIChronologyIYearOfCenturyIDurationField));
        
        assertTrue(deepEquals(partial1IChronologyIYearOfCentury, actualIChronologyIYearOfCentury));
        assertTrue(deepEquals(partial1IChronologyIYearOfCentury, actualIChronologyIYearOfCentury));
        DateTimeFieldType partial1IChronologyIYearOfCenturyIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyIYearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIYearOfCenturyIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIYearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyIYearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIYearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(partial1IChronologyIYearOfCenturyITypeIOrdinal, actualIChronologyIYearOfCenturyITypeIOrdinal);
        
        assertTrue(deepEquals(partial1IChronologyIYearOfCenturyIType, actualIChronologyIYearOfCenturyIType));
        assertTrue(deepEquals(partial1IChronologyIYearOfCenturyIType, actualIChronologyIYearOfCenturyIType));
        String partial1IChronologyIYearOfCenturyITypeIName = ((String) getFieldValue(partial1IChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIYearOfCenturyITypeIName = ((String) getFieldValue(actualIChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(partial1IChronologyIYearOfCenturyITypeIName, actualIChronologyIYearOfCenturyITypeIName);
        
        DateTimeField partial1IChronologyICenturyOfEra = ((DateTimeField) getFieldValue(partial1IChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        DateTimeField actualIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        int partial1IChronologyICenturyOfEraIDivisor = ((Integer) getFieldValue(partial1IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDivisor"));
        int actualIChronologyICenturyOfEraIDivisor = ((Integer) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDivisor"));
        assertEquals(partial1IChronologyICenturyOfEraIDivisor, actualIChronologyICenturyOfEraIDivisor);
        
        DurationField partial1IChronologyICenturyOfEraIDurationField = ((DurationField) getFieldValue(partial1IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDurationField"));
        DurationField actualIChronologyICenturyOfEraIDurationField = ((DurationField) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDurationField"));
        assertTrue(deepEquals(partial1IChronologyICenturyOfEraIDurationField, actualIChronologyICenturyOfEraIDurationField));
        assertTrue(deepEquals(partial1IChronologyICenturyOfEraIDurationField, actualIChronologyICenturyOfEraIDurationField));
        assertTrue(deepEquals(partial1IChronologyICenturyOfEraIDurationField, actualIChronologyICenturyOfEraIDurationField));
        
        DurationField partial1IChronologyICenturyOfEraIRangeDurationField = ((DurationField) getFieldValue(partial1IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iRangeDurationField"));
        DurationField actualIChronologyICenturyOfEraIRangeDurationField = ((DurationField) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iRangeDurationField"));
        assertTrue(deepEquals(partial1IChronologyICenturyOfEraIRangeDurationField, actualIChronologyICenturyOfEraIRangeDurationField));
        
        int partial1IChronologyICenturyOfEraIMin = ((Integer) getFieldValue(partial1IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMin"));
        int actualIChronologyICenturyOfEraIMin = ((Integer) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMin"));
        assertEquals(partial1IChronologyICenturyOfEraIMin, actualIChronologyICenturyOfEraIMin);
        
        int partial1IChronologyICenturyOfEraIMax = ((Integer) getFieldValue(partial1IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMax"));
        int actualIChronologyICenturyOfEraIMax = ((Integer) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMax"));
        assertEquals(partial1IChronologyICenturyOfEraIMax, actualIChronologyICenturyOfEraIMax);
        
        assertTrue(deepEquals(partial1IChronologyICenturyOfEra, actualIChronologyICenturyOfEra));
        DateTimeFieldType partial1IChronologyICenturyOfEraIType = ((DateTimeFieldType) getFieldValue(partial1IChronologyICenturyOfEra, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyICenturyOfEraIType = ((DateTimeFieldType) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial1IChronologyICenturyOfEraITypeIOrdinal = ((Byte) getFieldValue(partial1IChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyICenturyOfEraITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(partial1IChronologyICenturyOfEraITypeIOrdinal, actualIChronologyICenturyOfEraITypeIOrdinal);
        
        DurationFieldType partial1IChronologyICenturyOfEraITypeIUnitType = ((DurationFieldType) getFieldValue(partial1IChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyICenturyOfEraITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        assertTrue(deepEquals(partial1IChronologyICenturyOfEraITypeIUnitType, actualIChronologyICenturyOfEraITypeIUnitType));
        assertTrue(deepEquals(partial1IChronologyICenturyOfEraITypeIUnitType, actualIChronologyICenturyOfEraITypeIUnitType));
        
        assertTrue(deepEquals(partial1IChronologyICenturyOfEraIType, actualIChronologyICenturyOfEraIType));
        String partial1IChronologyICenturyOfEraITypeIName = ((String) getFieldValue(partial1IChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyICenturyOfEraITypeIName = ((String) getFieldValue(actualIChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(partial1IChronologyICenturyOfEraITypeIName, actualIChronologyICenturyOfEraITypeIName);
        
        assertTrue(deepEquals(partial1IChronology, actualIChronology));
        int partial1IChronologyIBaseFlags = ((Integer) getFieldValue(partial1IChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseFlags = ((Integer) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        assertEquals(partial1IChronologyIBaseFlags, actualIChronologyIBaseFlags);
        
        org.joda.time.DateTimeFieldType[] partial1ITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial1, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partial1ITypesSize = partial1ITypes.length;
        assertEquals(partial1ITypesSize, actualITypes.length);
        assertTrue(deepEquals(partial1ITypes, actualITypes));
        
        int[] partial1IValues = ((int[]) getFieldValue(partial1, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int partial1IValuesSize = partial1IValues.length;
        assertEquals(partial1IValuesSize, actualIValues.length);
        assertArrayEquals(partial1IValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.getFieldTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldTypes()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldTypes()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return (DateTimeFieldType[]) iTypes.clone();}
 *  */
    @Test
    public void testGetFieldTypes_ObjectClone() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        org.joda.time.DateTimeFieldType[] actual = partial.getFieldTypes();
        
        org.joda.time.DateTimeFieldType[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFieldTypes()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#getFieldTypes()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (DateTimeFieldType[]) iTypes.clone();
 *  */
    @Test
    public void testGetFieldTypes_ThrowNullPointerException() {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.getFieldTypes] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getFieldTypes(Partial.java:356) */
        partial.getFieldTypes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withFieldAdded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithFieldAdded_PartialIndexOfSupported() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial actual = partial.withFieldAdded(null, 0);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link org.joda.time.Partial#getField(int)}
 * @utbot.throwsException {@link java.lang.InternalError} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test(expected = InternalError.class)
    public void testWithFieldAdded_ThrowInternalError() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAdded_ThrowIllegalArgumentException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAdded(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withFieldAdded(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_1() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_2() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_3() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_4() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_5() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_6() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_7() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_8() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_9() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_10() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_11() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_12() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_13() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAdded(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).add(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAdded_ThrowNullPointerException_14() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAdded] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAdded(Partial.java:545) */
        partial.withFieldAdded(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.toStringList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toStringList()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.invokes {@link org.joda.time.Partial#size()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return buf.toString();}
 *  */
    @Test
    public void testToStringList_StringBuilderToString() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        String actual = partial.toStringList();
        
        String expected = "[]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toStringList()
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buf.append(iValues[i]);
 *  */
    @Test
    public void testToStringList_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.toStringList] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.Partial.toStringList(Partial.java:772) */
        partial.toStringList();
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf.append(iTypes[i].getName());
 *  */
    @Test
    public void testToStringList_ThrowNullPointerException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toStringList] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:770) */
        partial.toStringList();
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#toStringList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: buf.append(iValues[i]);
 *  */
    @Test
    public void testToStringList_ThrowNullPointerException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        /* This test fails because method [org.joda.time.Partial.toStringList] produces [java.lang.NullPointerException]
            org.joda.time.Partial.toStringList(Partial.java:772) */
        partial.toStringList();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withFieldAddWrapped
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withFieldAddWrapped(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#indexOfSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithFieldAddWrapped_PartialIndexOfSupported() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        Partial actual = partial.withFieldAddWrapped(null, 0);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] partialITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partialITypesSize = partialITypes.length;
        assertEquals(partialITypesSize, actualITypes.length);
        assertTrue(deepEquals(partialITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withFieldAddWrapped(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.invokes {@link org.joda.time.Partial#getValues()}
 * @utbot.invokes {@link org.joda.time.Partial#getField(int)}
 * @utbot.throwsException {@link java.lang.InternalError} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test(expected = InternalError.class)
    public void testWithFieldAddWrapped_ThrowInternalError() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 24);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_ThrowIllegalArgumentException() {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int index = indexOfSupported(fieldType);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithFieldAddWrapped_ThrowIllegalArgumentException_1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        Object iUnitType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", iUnitType);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        
        partial.withFieldAddWrapped(null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withFieldAddWrapped(org.joda.time.DurationFieldType, int)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_1() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_2() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_3() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_4() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_5() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_6() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_7() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_8() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_9() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_10() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_11() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_12() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_13() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withFieldAddWrapped(org.joda.time.DurationFieldType,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newValues = getField(index).addWrapPartial(this, index, newValues, amount);
 *  */
    @Test
    public void testWithFieldAddWrapped_ThrowNullPointerException_14() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = new org.joda.time.DateTimeFieldType[1];
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        dateTimeFieldTypeArray[0] = ((DateTimeFieldType) standardDateTimeFieldType);
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        
        /* This test fails because method [org.joda.time.Partial.withFieldAddWrapped] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withFieldAddWrapped(Partial.java:569) */
        partial.withFieldAddWrapped(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.Partial.withChronologyRetainFields
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withChronologyRetainFields(org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withChronologyRetainFields(org.joda.time.Chronology)}
 * @utbot.executesCondition {@code (newChronology == getChronology()): True}
 * @utbot.invokes {@link org.joda.time.DateTimeUtils#getChronology(org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.Chronology#withUTC()}
 * @utbot.invokes {@link org.joda.time.Partial#getChronology()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithChronologyRetainFields_NewChronologyEqualsGetChronology() throws Exception  {
        Partial partial = new Partial(((Chronology) null), ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        Partial actual = partial.withChronologyRetainFields(zonedChronology);
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        assertNull(actualIChronology);
        
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        assertNull(actualITypes);
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withChronologyRetainFields(org.joda.time.Chronology)
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withChronologyRetainFields(org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: newChronology.validate(newPartial, iValues);
 *  */
    @Test
    public void testWithChronologyRetainFields_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {};
        Partial partial = new Partial(iSOChronology, dateTimeFieldTypeArray, intArray);
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.Partial.withChronologyRetainFields] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.joda.time.chrono.BaseChronology.validate(BaseChronology.java:185)
            org.joda.time.Partial.withChronologyRetainFields(Partial.java:406) */
        partial.withChronologyRetainFields(zonedChronology);
    }
    
    /**
    @utbot.classUnderTest {@link Partial}
 * @utbot.methodUnderTest {@link org.joda.time.Partial#withChronologyRetainFields(org.joda.time.Chronology)}
 * @utbot.invokes {@link org.joda.time.Chronology#validate(org.joda.time.ReadablePartial,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: newChronology.validate(newPartial, iValues);
 *  */
    @Test
    public void testWithChronologyRetainFields_ThrowNullPointerException() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        Partial partial = new Partial(iSOChronology, ((org.joda.time.DateTimeFieldType[]) null), ((int[]) null));
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.Partial.withChronologyRetainFields] produces [java.lang.NullPointerException]
            org.joda.time.Partial.withChronologyRetainFields(Partial.java:406) */
        partial.withChronologyRetainFields(zonedChronology);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method withChronologyRetainFields(org.joda.time.Chronology)
    
    /**
     * @utbot.classUnderTest {@link org.joda.time.Partial}
     * @utbot.methodUnderTest {@link org.joda.time.Partial#withChronologyRetainFields(org.joda.time.Chronology)}
     */
    @Test
    public void testWithChronologyRetainFields() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        Partial partial = new Partial();
        int[] intArray = {1, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Partial partial1 = new Partial(partial, intArray);
        int[] intArray1 = {-1, Integer.MIN_VALUE, -1, 0, 1};
        Partial partial2 = new Partial(partial1, intArray1);
        
        Partial actual = partial2.withChronologyRetainFields(null);
        
        Chronology partial2IChronology = ((Chronology) getFieldValue(partial2, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        Chronology partial2IChronologyIBase = ((Chronology) getFieldValue(partial2IChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        Chronology actualIChronologyIBase = ((Chronology) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        Object partial2IChronologyIBaseIYearInfoCache = getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object actualIChronologyIBaseIYearInfoCache = getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        int partial2IChronologyIBaseIYearInfoCacheSize = getArrayLength(partial2IChronologyIBaseIYearInfoCache);
        assertEquals(partial2IChronologyIBaseIYearInfoCacheSize, getArrayLength(actualIChronologyIBaseIYearInfoCache));
        assertTrue(deepEquals(partial2IChronologyIBaseIYearInfoCache, actualIChronologyIBaseIYearInfoCache));
        
        int partial2IChronologyIBaseIMinDaysInFirstWeek = ((Integer) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.BasicChronology", "iMinDaysInFirstWeek"));
        int actualIChronologyIBaseIMinDaysInFirstWeek = ((Integer) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.BasicChronology", "iMinDaysInFirstWeek"));
        assertEquals(partial2IChronologyIBaseIMinDaysInFirstWeek, actualIChronologyIBaseIMinDaysInFirstWeek);
        
        Chronology actualIChronologyIBaseIBase = ((Chronology) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iBase"));
        assertNull(actualIChronologyIBaseIBase);
        
        Object actualIChronologyIBaseIParam = getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iParam");
        assertNull(actualIChronologyIBaseIParam);
        
        DurationField partial2IChronologyIBaseIMillis = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        DurationField actualIChronologyIBaseIMillis = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        
        DurationField partial2IChronologyIBaseISeconds = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        DurationField actualIChronologyIBaseISeconds = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        long partial2IChronologyIBaseISecondsIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseISeconds, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseISecondsIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseISeconds, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseISecondsIUnitMillis, actualIChronologyIBaseISecondsIUnitMillis);
        
        DurationFieldType partial2IChronologyIBaseISecondsIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseISeconds, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseISecondsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseISeconds, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseISecondsITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseISecondsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondsITypeIOrdinal, actualIChronologyIBaseISecondsITypeIOrdinal));
        
        String partial2IChronologyIBaseISecondsITypeIName = ((String) getFieldValue(partial2IChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseISecondsITypeIName = ((String) getFieldValue(actualIChronologyIBaseISecondsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondsITypeIName, actualIChronologyIBaseISecondsITypeIName));
        
        DurationField partial2IChronologyIBaseIMinutes = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        DurationField actualIChronologyIBaseIMinutes = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        long partial2IChronologyIBaseIMinutesIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIMinutes, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIMinutesIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIMinutes, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIMinutesIUnitMillis, actualIChronologyIBaseIMinutesIUnitMillis);
        
        DurationFieldType partial2IChronologyIBaseIMinutesIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIMinutes, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIMinutesIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMinutes, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIMinutesITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMinutesITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinutesITypeIOrdinal, actualIChronologyIBaseIMinutesITypeIOrdinal));
        
        String partial2IChronologyIBaseIMinutesITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIMinutesITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMinutesIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinutesITypeIName, actualIChronologyIBaseIMinutesITypeIName));
        
        DurationField partial2IChronologyIBaseIHours = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHours"));
        DurationField actualIChronologyIBaseIHours = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHours"));
        long partial2IChronologyIBaseIHoursIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIHours, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIHoursIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHours, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIHoursIUnitMillis, actualIChronologyIBaseIHoursIUnitMillis);
        
        DurationFieldType partial2IChronologyIBaseIHoursIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIHours, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIHoursIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHours, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIHoursITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHoursITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHoursITypeIOrdinal, actualIChronologyIBaseIHoursITypeIOrdinal));
        
        String partial2IChronologyIBaseIHoursITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIHoursITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHoursIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHoursITypeIName, actualIChronologyIBaseIHoursITypeIName));
        
        DurationField partial2IChronologyIBaseIHalfdays = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        DurationField actualIChronologyIBaseIHalfdays = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        long partial2IChronologyIBaseIHalfdaysIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIHalfdays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIHalfdaysIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHalfdays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIHalfdaysIUnitMillis, actualIChronologyIBaseIHalfdaysIUnitMillis);
        
        DurationFieldType partial2IChronologyIBaseIHalfdaysIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIHalfdays, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIHalfdaysIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHalfdays, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIHalfdaysITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHalfdaysITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdaysITypeIOrdinal, actualIChronologyIBaseIHalfdaysITypeIOrdinal));
        
        String partial2IChronologyIBaseIHalfdaysITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIHalfdaysITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHalfdaysIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdaysITypeIName, actualIChronologyIBaseIHalfdaysITypeIName));
        
        DurationField partial2IChronologyIBaseIDays = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDays"));
        DurationField actualIChronologyIBaseIDays = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDays"));
        long partial2IChronologyIBaseIDaysIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIDays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIDaysIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIDays, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIDaysIUnitMillis, actualIChronologyIBaseIDaysIUnitMillis);
        
        DurationFieldType partial2IChronologyIBaseIDaysIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIDays, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIDaysIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIDays, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIDaysITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIDaysITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDaysITypeIOrdinal, actualIChronologyIBaseIDaysITypeIOrdinal));
        
        String partial2IChronologyIBaseIDaysITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIDaysITypeIName = ((String) getFieldValue(actualIChronologyIBaseIDaysIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDaysITypeIName, actualIChronologyIBaseIDaysITypeIName));
        
        DurationField partial2IChronologyIBaseIWeeks = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        DurationField actualIChronologyIBaseIWeeks = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        long partial2IChronologyIBaseIWeeksIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIWeeks, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        long actualIChronologyIBaseIWeeksIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIWeeks, "org.joda.time.field.PreciseDurationField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIWeeksIUnitMillis, actualIChronologyIBaseIWeeksIUnitMillis);
        
        DurationFieldType partial2IChronologyIBaseIWeeksIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIWeeks, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIWeeksIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIWeeks, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIWeeksITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIWeeksITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIWeeksITypeIOrdinal, actualIChronologyIBaseIWeeksITypeIOrdinal));
        
        String partial2IChronologyIBaseIWeeksITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIWeeksITypeIName = ((String) getFieldValue(actualIChronologyIBaseIWeeksIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIWeeksITypeIName, actualIChronologyIBaseIWeeksITypeIName));
        
        DurationField partial2IChronologyIBaseIWeekyears = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        DurationField actualIChronologyIBaseIWeekyears = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        DurationFieldType partial2IChronologyIBaseIWeekyearsIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIWeekyears, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIWeekyearsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIWeekyears, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIWeekyearsITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIWeekyearsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIWeekyearsITypeIOrdinal, actualIChronologyIBaseIWeekyearsITypeIOrdinal));
        
        String partial2IChronologyIBaseIWeekyearsITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIWeekyearsITypeIName = ((String) getFieldValue(actualIChronologyIBaseIWeekyearsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIWeekyearsITypeIName, actualIChronologyIBaseIWeekyearsITypeIName));
        
        DurationField partial2IChronologyIBaseIMonths = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        DurationField actualIChronologyIBaseIMonths = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        DurationFieldType partial2IChronologyIBaseIMonthsIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIMonths, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIMonthsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMonths, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIMonthsITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMonthsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMonthsITypeIOrdinal, actualIChronologyIBaseIMonthsITypeIOrdinal));
        
        String partial2IChronologyIBaseIMonthsITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIMonthsITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMonthsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMonthsITypeIName, actualIChronologyIBaseIMonthsITypeIName));
        
        DurationField partial2IChronologyIBaseIYears = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYears"));
        DurationField actualIChronologyIBaseIYears = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iYears"));
        DurationFieldType partial2IChronologyIBaseIYearsIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIYears, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIYearsIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIYears, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseIYearsITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIYearsITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIYearsITypeIOrdinal, actualIChronologyIBaseIYearsITypeIOrdinal));
        
        String partial2IChronologyIBaseIYearsITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIYearsITypeIName = ((String) getFieldValue(actualIChronologyIBaseIYearsIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIYearsITypeIName, actualIChronologyIBaseIYearsITypeIName));
        
        DurationField partial2IChronologyIBaseICenturies = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        DurationField actualIChronologyIBaseICenturies = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        int partial2IChronologyIBaseICenturiesIScalar = ((Integer) getFieldValue(partial2IChronologyIBaseICenturies, "org.joda.time.field.ScaledDurationField", "iScalar"));
        int actualIChronologyIBaseICenturiesIScalar = ((Integer) getFieldValue(actualIChronologyIBaseICenturies, "org.joda.time.field.ScaledDurationField", "iScalar"));
        assertEquals(partial2IChronologyIBaseICenturiesIScalar, actualIChronologyIBaseICenturiesIScalar);
        
        DurationField partial2IChronologyIBaseICenturiesIField = ((DurationField) getFieldValue(partial2IChronologyIBaseICenturies, "org.joda.time.field.DecoratedDurationField", "iField"));
        DurationField actualIChronologyIBaseICenturiesIField = ((DurationField) getFieldValue(actualIChronologyIBaseICenturies, "org.joda.time.field.DecoratedDurationField", "iField"));
        assertTrue(deepEquals(partial2IChronologyIBaseICenturiesIField, actualIChronologyIBaseICenturiesIField));
        
        DurationFieldType partial2IChronologyIBaseICenturiesIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseICenturies, "org.joda.time.field.BaseDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseICenturiesIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseICenturies, "org.joda.time.field.BaseDurationField", "iType"));
        byte partial2IChronologyIBaseICenturiesITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseICenturiesITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseICenturiesITypeIOrdinal, actualIChronologyIBaseICenturiesITypeIOrdinal));
        
        String partial2IChronologyIBaseICenturiesITypeIName = ((String) getFieldValue(partial2IChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseICenturiesITypeIName = ((String) getFieldValue(actualIChronologyIBaseICenturiesIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseICenturiesITypeIName, actualIChronologyIBaseICenturiesITypeIName));
        
        DurationField partial2IChronologyIBaseIEras = ((DurationField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iEras"));
        DurationField actualIChronologyIBaseIEras = ((DurationField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iEras"));
        DurationFieldType partial2IChronologyIBaseIErasIType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIEras, "org.joda.time.field.UnsupportedDurationField", "iType"));
        DurationFieldType actualIChronologyIBaseIErasIType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIEras, "org.joda.time.field.UnsupportedDurationField", "iType"));
        byte partial2IChronologyIBaseIErasITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIErasIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIErasITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIErasIType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIErasITypeIOrdinal, actualIChronologyIBaseIErasITypeIOrdinal));
        
        String partial2IChronologyIBaseIErasITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIErasIType, "org.joda.time.DurationFieldType", "iName"));
        String actualIChronologyIBaseIErasITypeIName = ((String) getFieldValue(actualIChronologyIBaseIErasIType, "org.joda.time.DurationFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIErasITypeIName, actualIChronologyIBaseIErasITypeIName));
        
        DateTimeField partial2IChronologyIBaseIMillisOfSecond = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        DateTimeField actualIChronologyIBaseIMillisOfSecond = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        int partial2IChronologyIBaseIMillisOfSecondIRange = ((Integer) getFieldValue(partial2IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIMillisOfSecondIRange = ((Integer) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseIMillisOfSecondIRange, actualIChronologyIBaseIMillisOfSecondIRange);
        
        DurationField partial2IChronologyIBaseIMillisOfSecondIRangeField = ((DurationField) getFieldValue(partial2IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIMillisOfSecondIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfSecondIRangeField, actualIChronologyIBaseIMillisOfSecondIRangeField));
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfSecondIRangeField, actualIChronologyIBaseIMillisOfSecondIRangeField));
        
        long partial2IChronologyIBaseIMillisOfSecondIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIMillisOfSecondIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIMillisOfSecondIUnitMillis, actualIChronologyIBaseIMillisOfSecondIUnitMillis);
        
        DurationField partial2IChronologyIBaseIMillisOfSecondIUnitField = ((DurationField) getFieldValue(partial2IChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIMillisOfSecondIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        
        DateTimeFieldType partial2IChronologyIBaseIMillisOfSecondIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIMillisOfSecond, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMillisOfSecondIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMillisOfSecond, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIMillisOfSecondITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMillisOfSecondITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfSecondITypeIOrdinal, actualIChronologyIBaseIMillisOfSecondITypeIOrdinal));
        
        DurationFieldType partial2IChronologyIBaseIMillisOfSecondITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIMillisOfSecondITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfSecondITypeIUnitType, actualIChronologyIBaseIMillisOfSecondITypeIUnitType));
        
        DurationFieldType partial2IChronologyIBaseIMillisOfSecondITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIMillisOfSecondITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfSecondITypeIRangeType, actualIChronologyIBaseIMillisOfSecondITypeIRangeType));
        
        String partial2IChronologyIBaseIMillisOfSecondITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMillisOfSecondITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMillisOfSecondIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfSecondITypeIName, actualIChronologyIBaseIMillisOfSecondITypeIName));
        
        DateTimeField partial2IChronologyIBaseIMillisOfDay = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        DateTimeField actualIChronologyIBaseIMillisOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        int partial2IChronologyIBaseIMillisOfDayIRange = ((Integer) getFieldValue(partial2IChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIMillisOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseIMillisOfDayIRange, actualIChronologyIBaseIMillisOfDayIRange);
        
        DurationField partial2IChronologyIBaseIMillisOfDayIRangeField = ((DurationField) getFieldValue(partial2IChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIMillisOfDayIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIMillisOfDay, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDayIRangeField, actualIChronologyIBaseIMillisOfDayIRangeField));
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDayIRangeField, actualIChronologyIBaseIMillisOfDayIRangeField));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDay, actualIChronologyIBaseIMillisOfDay));
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDay, actualIChronologyIBaseIMillisOfDay));
        DateTimeFieldType partial2IChronologyIBaseIMillisOfDayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIMillisOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMillisOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMillisOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIMillisOfDayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMillisOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDayITypeIOrdinal, actualIChronologyIBaseIMillisOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDayIType, actualIChronologyIBaseIMillisOfDayIType));
        DurationFieldType partial2IChronologyIBaseIMillisOfDayITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIMillisOfDayITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDayITypeIRangeType, actualIChronologyIBaseIMillisOfDayITypeIRangeType));
        
        String partial2IChronologyIBaseIMillisOfDayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMillisOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMillisOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMillisOfDayITypeIName, actualIChronologyIBaseIMillisOfDayITypeIName));
        
        DateTimeField partial2IChronologyIBaseISecondOfMinute = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        DateTimeField actualIChronologyIBaseISecondOfMinute = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        int partial2IChronologyIBaseISecondOfMinuteIRange = ((Integer) getFieldValue(partial2IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseISecondOfMinuteIRange = ((Integer) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseISecondOfMinuteIRange, actualIChronologyIBaseISecondOfMinuteIRange);
        
        DurationField partial2IChronologyIBaseISecondOfMinuteIRangeField = ((DurationField) getFieldValue(partial2IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseISecondOfMinuteIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteIRangeField, actualIChronologyIBaseISecondOfMinuteIRangeField));
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteIRangeField, actualIChronologyIBaseISecondOfMinuteIRangeField));
        
        long partial2IChronologyIBaseISecondOfMinuteIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseISecondOfMinuteIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseISecondOfMinuteIUnitMillis, actualIChronologyIBaseISecondOfMinuteIUnitMillis);
        
        DurationField partial2IChronologyIBaseISecondOfMinuteIUnitField = ((DurationField) getFieldValue(partial2IChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseISecondOfMinuteIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteIUnitField, actualIChronologyIBaseISecondOfMinuteIUnitField));
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteIUnitField, actualIChronologyIBaseISecondOfMinuteIUnitField));
        
        DateTimeFieldType partial2IChronologyIBaseISecondOfMinuteIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseISecondOfMinute, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseISecondOfMinuteIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseISecondOfMinute, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseISecondOfMinuteITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseISecondOfMinuteITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteITypeIOrdinal, actualIChronologyIBaseISecondOfMinuteITypeIOrdinal));
        
        DurationFieldType partial2IChronologyIBaseISecondOfMinuteITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseISecondOfMinuteITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteITypeIUnitType, actualIChronologyIBaseISecondOfMinuteITypeIUnitType));
        
        DurationFieldType partial2IChronologyIBaseISecondOfMinuteITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseISecondOfMinuteITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteITypeIRangeType, actualIChronologyIBaseISecondOfMinuteITypeIRangeType));
        
        String partial2IChronologyIBaseISecondOfMinuteITypeIName = ((String) getFieldValue(partial2IChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseISecondOfMinuteITypeIName = ((String) getFieldValue(actualIChronologyIBaseISecondOfMinuteIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfMinuteITypeIName, actualIChronologyIBaseISecondOfMinuteITypeIName));
        
        DateTimeField partial2IChronologyIBaseISecondOfDay = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        DateTimeField actualIChronologyIBaseISecondOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        int partial2IChronologyIBaseISecondOfDayIRange = ((Integer) getFieldValue(partial2IChronologyIBaseISecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseISecondOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseISecondOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseISecondOfDayIRange, actualIChronologyIBaseISecondOfDayIRange);
        
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfDay, actualIChronologyIBaseISecondOfDay));
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfDay, actualIChronologyIBaseISecondOfDay));
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfDay, actualIChronologyIBaseISecondOfDay));
        DateTimeFieldType partial2IChronologyIBaseISecondOfDayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseISecondOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseISecondOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseISecondOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseISecondOfDayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseISecondOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfDayITypeIOrdinal, actualIChronologyIBaseISecondOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfDayIType, actualIChronologyIBaseISecondOfDayIType));
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfDayIType, actualIChronologyIBaseISecondOfDayIType));
        String partial2IChronologyIBaseISecondOfDayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseISecondOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseISecondOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseISecondOfDayITypeIName, actualIChronologyIBaseISecondOfDayITypeIName));
        
        DateTimeField partial2IChronologyIBaseIMinuteOfHour = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        DateTimeField actualIChronologyIBaseIMinuteOfHour = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHour, actualIChronologyIBaseIMinuteOfHour));
        DurationField partial2IChronologyIBaseIMinuteOfHourIRangeField = ((DurationField) getFieldValue(partial2IChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIMinuteOfHourIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourIRangeField, actualIChronologyIBaseIMinuteOfHourIRangeField));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourIRangeField, actualIChronologyIBaseIMinuteOfHourIRangeField));
        
        long partial2IChronologyIBaseIMinuteOfHourIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIMinuteOfHourIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIMinuteOfHourIUnitMillis, actualIChronologyIBaseIMinuteOfHourIUnitMillis);
        
        DurationField partial2IChronologyIBaseIMinuteOfHourIUnitField = ((DurationField) getFieldValue(partial2IChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIMinuteOfHourIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourIUnitField, actualIChronologyIBaseIMinuteOfHourIUnitField));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourIUnitField, actualIChronologyIBaseIMinuteOfHourIUnitField));
        
        DateTimeFieldType partial2IChronologyIBaseIMinuteOfHourIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIMinuteOfHour, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMinuteOfHourIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfHour, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIMinuteOfHourITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMinuteOfHourITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourITypeIOrdinal, actualIChronologyIBaseIMinuteOfHourITypeIOrdinal));
        
        DurationFieldType partial2IChronologyIBaseIMinuteOfHourITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIMinuteOfHourITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourITypeIUnitType, actualIChronologyIBaseIMinuteOfHourITypeIUnitType));
        
        DurationFieldType partial2IChronologyIBaseIMinuteOfHourITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIMinuteOfHourITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourITypeIRangeType, actualIChronologyIBaseIMinuteOfHourITypeIRangeType));
        
        String partial2IChronologyIBaseIMinuteOfHourITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMinuteOfHourITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMinuteOfHourIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfHourITypeIName, actualIChronologyIBaseIMinuteOfHourITypeIName));
        
        DateTimeField partial2IChronologyIBaseIMinuteOfDay = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        DateTimeField actualIChronologyIBaseIMinuteOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        int partial2IChronologyIBaseIMinuteOfDayIRange = ((Integer) getFieldValue(partial2IChronologyIBaseIMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIMinuteOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIMinuteOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseIMinuteOfDayIRange, actualIChronologyIBaseIMinuteOfDayIRange);
        
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfDay, actualIChronologyIBaseIMinuteOfDay));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfDay, actualIChronologyIBaseIMinuteOfDay));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfDay, actualIChronologyIBaseIMinuteOfDay));
        DateTimeFieldType partial2IChronologyIBaseIMinuteOfDayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIMinuteOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIMinuteOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIMinuteOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIMinuteOfDayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIMinuteOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfDayITypeIOrdinal, actualIChronologyIBaseIMinuteOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfDayIType, actualIChronologyIBaseIMinuteOfDayIType));
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfDayIType, actualIChronologyIBaseIMinuteOfDayIType));
        String partial2IChronologyIBaseIMinuteOfDayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIMinuteOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIMinuteOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIMinuteOfDayITypeIName, actualIChronologyIBaseIMinuteOfDayITypeIName));
        
        DateTimeField partial2IChronologyIBaseIHourOfDay = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        DateTimeField actualIChronologyIBaseIHourOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        int partial2IChronologyIBaseIHourOfDayIRange = ((Integer) getFieldValue(partial2IChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIHourOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseIHourOfDayIRange, actualIChronologyIBaseIHourOfDayIRange);
        
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfDay, actualIChronologyIBaseIHourOfDay));
        long partial2IChronologyIBaseIHourOfDayIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIHourOfDayIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIHourOfDayIUnitMillis, actualIChronologyIBaseIHourOfDayIUnitMillis);
        
        DurationField partial2IChronologyIBaseIHourOfDayIUnitField = ((DurationField) getFieldValue(partial2IChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIHourOfDayIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfDayIUnitField, actualIChronologyIBaseIHourOfDayIUnitField));
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfDayIUnitField, actualIChronologyIBaseIHourOfDayIUnitField));
        
        DateTimeFieldType partial2IChronologyIBaseIHourOfDayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIHourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIHourOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIHourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIHourOfDayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHourOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfDayITypeIOrdinal, actualIChronologyIBaseIHourOfDayITypeIOrdinal));
        
        DurationFieldType partial2IChronologyIBaseIHourOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIHourOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfDayITypeIUnitType, actualIChronologyIBaseIHourOfDayITypeIUnitType));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfDayIType, actualIChronologyIBaseIHourOfDayIType));
        String partial2IChronologyIBaseIHourOfDayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIHourOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfDayITypeIName, actualIChronologyIBaseIHourOfDayITypeIName));
        
        DateTimeField partial2IChronologyIBaseIClockhourOfDay = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        DateTimeField actualIChronologyIBaseIClockhourOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        DateTimeField partial2IChronologyIBaseIClockhourOfDayIField = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIClockhourOfDay, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIBaseIClockhourOfDayIField = ((DateTimeField) getFieldValue(actualIChronologyIBaseIClockhourOfDay, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayIField, actualIChronologyIBaseIClockhourOfDayIField));
        
        DateTimeFieldType partial2IChronologyIBaseIClockhourOfDayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIClockhourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIClockhourOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIClockhourOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIClockhourOfDayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIClockhourOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayITypeIOrdinal, actualIChronologyIBaseIClockhourOfDayITypeIOrdinal));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayIType, actualIChronologyIBaseIClockhourOfDayIType));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayIType, actualIChronologyIBaseIClockhourOfDayIType));
        String partial2IChronologyIBaseIClockhourOfDayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIClockhourOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIClockhourOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfDayITypeIName, actualIChronologyIBaseIClockhourOfDayITypeIName));
        
        DateTimeField partial2IChronologyIBaseIHourOfHalfday = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        DateTimeField actualIChronologyIBaseIHourOfHalfday = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        int partial2IChronologyIBaseIHourOfHalfdayIRange = ((Integer) getFieldValue(partial2IChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIHourOfHalfdayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseIHourOfHalfdayIRange, actualIChronologyIBaseIHourOfHalfdayIRange);
        
        DurationField partial2IChronologyIBaseIHourOfHalfdayIRangeField = ((DurationField) getFieldValue(partial2IChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        DurationField actualIChronologyIBaseIHourOfHalfdayIRangeField = ((DurationField) getFieldValue(actualIChronologyIBaseIHourOfHalfday, "org.joda.time.field.PreciseDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfdayIRangeField, actualIChronologyIBaseIHourOfHalfdayIRangeField));
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfdayIRangeField, actualIChronologyIBaseIHourOfHalfdayIRangeField));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfday, actualIChronologyIBaseIHourOfHalfday));
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfday, actualIChronologyIBaseIHourOfHalfday));
        DateTimeFieldType partial2IChronologyIBaseIHourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIHourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIHourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIHourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIHourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfdayITypeIOrdinal, actualIChronologyIBaseIHourOfHalfdayITypeIOrdinal));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfdayIType, actualIChronologyIBaseIHourOfHalfdayIType));
        DurationFieldType partial2IChronologyIBaseIHourOfHalfdayITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIHourOfHalfdayITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfdayITypeIRangeType, actualIChronologyIBaseIHourOfHalfdayITypeIRangeType));
        
        String partial2IChronologyIBaseIHourOfHalfdayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIHourOfHalfdayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHourOfHalfdayITypeIName, actualIChronologyIBaseIHourOfHalfdayITypeIName));
        
        DateTimeField partial2IChronologyIBaseIClockhourOfHalfday = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        DateTimeField actualIChronologyIBaseIClockhourOfHalfday = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        DateTimeField partial2IChronologyIBaseIClockhourOfHalfdayIField = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIBaseIClockhourOfHalfdayIField = ((DateTimeField) getFieldValue(actualIChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayIField, actualIChronologyIBaseIClockhourOfHalfdayIField));
        
        DateTimeFieldType partial2IChronologyIBaseIClockhourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIClockhourOfHalfdayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIClockhourOfHalfday, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIClockhourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIClockhourOfHalfdayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayITypeIOrdinal, actualIChronologyIBaseIClockhourOfHalfdayITypeIOrdinal));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayIType, actualIChronologyIBaseIClockhourOfHalfdayIType));
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayIType, actualIChronologyIBaseIClockhourOfHalfdayIType));
        String partial2IChronologyIBaseIClockhourOfHalfdayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIClockhourOfHalfdayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIClockhourOfHalfdayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIClockhourOfHalfdayITypeIName, actualIChronologyIBaseIClockhourOfHalfdayITypeIName));
        
        DateTimeField partial2IChronologyIBaseIHalfdayOfDay = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        DateTimeField actualIChronologyIBaseIHalfdayOfDay = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        int partial2IChronologyIBaseIHalfdayOfDayIRange = ((Integer) getFieldValue(partial2IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        int actualIChronologyIBaseIHalfdayOfDayIRange = ((Integer) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDateTimeField", "iRange"));
        assertEquals(partial2IChronologyIBaseIHalfdayOfDayIRange, actualIChronologyIBaseIHalfdayOfDayIRange);
        
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdayOfDay, actualIChronologyIBaseIHalfdayOfDay));
        long partial2IChronologyIBaseIHalfdayOfDayIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIHalfdayOfDayIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIHalfdayOfDayIUnitMillis, actualIChronologyIBaseIHalfdayOfDayIUnitMillis);
        
        DurationField partial2IChronologyIBaseIHalfdayOfDayIUnitField = ((DurationField) getFieldValue(partial2IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIHalfdayOfDayIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdayOfDayIUnitField, actualIChronologyIBaseIHalfdayOfDayIUnitField));
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdayOfDayIUnitField, actualIChronologyIBaseIHalfdayOfDayIUnitField));
        
        DateTimeFieldType partial2IChronologyIBaseIHalfdayOfDayIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIHalfdayOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIHalfdayOfDayIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIHalfdayOfDay, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIHalfdayOfDayITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIHalfdayOfDayITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdayOfDayITypeIOrdinal, actualIChronologyIBaseIHalfdayOfDayITypeIOrdinal));
        
        DurationFieldType partial2IChronologyIBaseIHalfdayOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIHalfdayOfDayITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdayOfDayITypeIUnitType, actualIChronologyIBaseIHalfdayOfDayITypeIUnitType));
        
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdayOfDayIType, actualIChronologyIBaseIHalfdayOfDayIType));
        String partial2IChronologyIBaseIHalfdayOfDayITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIHalfdayOfDayITypeIName = ((String) getFieldValue(actualIChronologyIBaseIHalfdayOfDayIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIHalfdayOfDayITypeIName, actualIChronologyIBaseIHalfdayOfDayITypeIName));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeek = ((DateTimeField) getFieldValue(partial2IChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        DateTimeField actualIChronologyIBaseIDayOfWeek = ((DateTimeField) getFieldValue(actualIChronologyIBase, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        Object partial2IChronologyIBaseIDayOfWeekIChronology = getFieldValue(partial2IChronologyIBaseIDayOfWeek, "org.joda.time.chrono.GJDayOfWeekDateTimeField", "iChronology");
        Object actualIChronologyIBaseIDayOfWeekIChronology = getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.chrono.GJDayOfWeekDateTimeField", "iChronology");
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronology, actualIChronologyIBaseIDayOfWeekIChronology));
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIDayOfMonth = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIDayOfMonth = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIDayOfMonth, actualIChronologyIBaseIDayOfWeekIChronologyIDayOfMonth));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIDayOfYear = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIDayOfYear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIDayOfYear, actualIChronologyIBaseIDayOfWeekIChronologyIDayOfYear));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear, actualIChronologyIBaseIDayOfWeekIChronologyIWeekOfWeekyear));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIWeekyear = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIWeekyear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIWeekyear, actualIChronologyIBaseIDayOfWeekIChronologyIWeekyear));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury, actualIChronologyIBaseIDayOfWeekIChronologyIWeekyearOfCentury));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIMonthOfYear = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIMonthOfYear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIMonthOfYear, actualIChronologyIBaseIDayOfWeekIChronologyIMonthOfYear));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIYear = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYear"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIYear = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYear"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIYear, actualIChronologyIBaseIDayOfWeekIChronologyIYear));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIYearOfEra = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIYearOfEra = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIYearOfEra, actualIChronologyIBaseIDayOfWeekIChronologyIYearOfEra));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIYearOfCentury, actualIChronologyIBaseIDayOfWeekIChronologyIYearOfCentury));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyICenturyOfEra, actualIChronologyIBaseIDayOfWeekIChronologyICenturyOfEra));
        
        DateTimeField partial2IChronologyIBaseIDayOfWeekIChronologyIEra = ((DateTimeField) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iEra"));
        DateTimeField actualIChronologyIBaseIDayOfWeekIChronologyIEra = ((DateTimeField) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iEra"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIEra, actualIChronologyIBaseIDayOfWeekIChronologyIEra));
        
        int partial2IChronologyIBaseIDayOfWeekIChronologyIBaseFlags = ((Integer) getFieldValue(partial2IChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseIDayOfWeekIChronologyIBaseFlags = ((Integer) getFieldValue(actualIChronologyIBaseIDayOfWeekIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIChronologyIBaseFlags, actualIChronologyIBaseIDayOfWeekIChronologyIBaseFlags));
        
        long partial2IChronologyIBaseIDayOfWeekIUnitMillis = ((Long) getFieldValue(partial2IChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        long actualIChronologyIBaseIDayOfWeekIUnitMillis = ((Long) getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitMillis"));
        assertEquals(partial2IChronologyIBaseIDayOfWeekIUnitMillis, actualIChronologyIBaseIDayOfWeekIUnitMillis);
        
        DurationField partial2IChronologyIBaseIDayOfWeekIUnitField = ((DurationField) getFieldValue(partial2IChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        DurationField actualIChronologyIBaseIDayOfWeekIUnitField = ((DurationField) getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.field.PreciseDurationDateTimeField", "iUnitField"));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIUnitField, actualIChronologyIBaseIDayOfWeekIUnitField));
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekIUnitField, actualIChronologyIBaseIDayOfWeekIUnitField));
        
        DateTimeFieldType partial2IChronologyIBaseIDayOfWeekIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIBaseIDayOfWeek, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIBaseIDayOfWeekIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIBaseIDayOfWeek, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIBaseIDayOfWeekITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIBaseIDayOfWeekITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekITypeIOrdinal, actualIChronologyIBaseIDayOfWeekITypeIOrdinal));
        
        DurationFieldType partial2IChronologyIBaseIDayOfWeekITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIBaseIDayOfWeekITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekITypeIUnitType, actualIChronologyIBaseIDayOfWeekITypeIUnitType));
        
        DurationFieldType partial2IChronologyIBaseIDayOfWeekITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIBaseIDayOfWeekITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekITypeIRangeType, actualIChronologyIBaseIDayOfWeekITypeIRangeType));
        
        String partial2IChronologyIBaseIDayOfWeekITypeIName = ((String) getFieldValue(partial2IChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIBaseIDayOfWeekITypeIName = ((String) getFieldValue(actualIChronologyIBaseIDayOfWeekIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIBaseIDayOfWeekITypeIName, actualIChronologyIBaseIDayOfWeekITypeIName));
        
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        assertTrue(deepEquals(partial2IChronologyIBase, actualIChronologyIBase));
        
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        DurationField partial2IChronologyICenturies = ((DurationField) getFieldValue(partial2IChronology, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        DurationField actualIChronologyICenturies = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        assertTrue(deepEquals(partial2IChronologyICenturies, actualIChronologyICenturies));
        assertTrue(deepEquals(partial2IChronologyICenturies, actualIChronologyICenturies));
        assertTrue(deepEquals(partial2IChronologyICenturies, actualIChronologyICenturies));
        
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        DateTimeField partial2IChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(partial2IChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        DateTimeField actualIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        int partial2IChronologyIWeekyearOfCenturyIDivisor = ((Integer) getFieldValue(partial2IChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDivisor"));
        int actualIChronologyIWeekyearOfCenturyIDivisor = ((Integer) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDivisor"));
        assertEquals(partial2IChronologyIWeekyearOfCenturyIDivisor, actualIChronologyIWeekyearOfCenturyIDivisor);
        
        DurationField partial2IChronologyIWeekyearOfCenturyIDurationField = ((DurationField) getFieldValue(partial2IChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        DurationField actualIChronologyIWeekyearOfCenturyIDurationField = ((DurationField) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIDurationField, actualIChronologyIWeekyearOfCenturyIDurationField));
        
        DurationField partial2IChronologyIWeekyearOfCenturyIRangeField = ((DurationField) getFieldValue(partial2IChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iRangeField"));
        DurationField actualIChronologyIWeekyearOfCenturyIRangeField = ((DurationField) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iRangeField"));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIRangeField, actualIChronologyIWeekyearOfCenturyIRangeField));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIRangeField, actualIChronologyIWeekyearOfCenturyIRangeField));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIRangeField, actualIChronologyIWeekyearOfCenturyIRangeField));
        
        DateTimeField partial2IChronologyIWeekyearOfCenturyIField = ((DateTimeField) getFieldValue(partial2IChronologyIWeekyearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIWeekyearOfCenturyIField = ((DateTimeField) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField partial2IChronologyIWeekyearOfCenturyIFieldIField = ((DateTimeField) getFieldValue(partial2IChronologyIWeekyearOfCenturyIField, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        DateTimeField actualIChronologyIWeekyearOfCenturyIFieldIField = ((DateTimeField) getFieldValue(actualIChronologyIWeekyearOfCenturyIField, "org.joda.time.field.DecoratedDateTimeField", "iField"));
        Object partial2IChronologyIWeekyearOfCenturyIFieldIFieldIChronology = getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.chrono.BasicYearDateTimeField", "iChronology");
        Object actualIChronologyIWeekyearOfCenturyIFieldIFieldIChronology = getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.chrono.BasicYearDateTimeField", "iChronology");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldIFieldIChronology, actualIChronologyIWeekyearOfCenturyIFieldIFieldIChronology));
        
        long partial2IChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis = ((Long) getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        long actualIChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis = ((Long) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iUnitMillis"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis, actualIChronologyIWeekyearOfCenturyIFieldIFieldIUnitMillis));
        
        DurationField partial2IChronologyIWeekyearOfCenturyIFieldIFieldIDurationField = ((DurationField) getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        DurationField actualIChronologyIWeekyearOfCenturyIFieldIFieldIDurationField = ((DurationField) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.ImpreciseDateTimeField", "iDurationField"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldIFieldIDurationField, actualIChronologyIWeekyearOfCenturyIFieldIFieldIDurationField));
        
        DateTimeFieldType partial2IChronologyIWeekyearOfCenturyIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIWeekyearOfCenturyIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldIFieldIType, actualIChronologyIWeekyearOfCenturyIFieldIFieldIType));
        
        DateTimeFieldType partial2IChronologyIWeekyearOfCenturyIFieldIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIWeekyearOfCenturyIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIWeekyearOfCenturyIFieldIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIField, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIWeekyearOfCenturyIFieldITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIWeekyearOfCenturyIFieldITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldITypeIOrdinal, actualIChronologyIWeekyearOfCenturyIFieldITypeIOrdinal));
        
        DurationFieldType partial2IChronologyIWeekyearOfCenturyIFieldITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyIFieldITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldITypeIUnitType, actualIChronologyIWeekyearOfCenturyIFieldITypeIUnitType));
        
        DurationFieldType partial2IChronologyIWeekyearOfCenturyIFieldITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyIFieldITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldITypeIRangeType, actualIChronologyIWeekyearOfCenturyIFieldITypeIRangeType));
        
        String partial2IChronologyIWeekyearOfCenturyIFieldITypeIName = ((String) getFieldValue(partial2IChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIWeekyearOfCenturyIFieldITypeIName = ((String) getFieldValue(actualIChronologyIWeekyearOfCenturyIFieldIType, "org.joda.time.DateTimeFieldType", "iName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyIFieldITypeIName, actualIChronologyIWeekyearOfCenturyIFieldITypeIName));
        
        DateTimeFieldType partial2IChronologyIWeekyearOfCenturyIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIWeekyearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIWeekyearOfCenturyIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIWeekyearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIWeekyearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIWeekyearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(partial2IChronologyIWeekyearOfCenturyITypeIOrdinal, actualIChronologyIWeekyearOfCenturyITypeIOrdinal);
        
        DurationFieldType partial2IChronologyIWeekyearOfCenturyITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyITypeIUnitType, actualIChronologyIWeekyearOfCenturyITypeIUnitType));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyITypeIUnitType, actualIChronologyIWeekyearOfCenturyITypeIUnitType));
        
        DurationFieldType partial2IChronologyIWeekyearOfCenturyITypeIRangeType = ((DurationFieldType) getFieldValue(partial2IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        DurationFieldType actualIChronologyIWeekyearOfCenturyITypeIRangeType = ((DurationFieldType) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType"));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyITypeIRangeType, actualIChronologyIWeekyearOfCenturyITypeIRangeType));
        assertTrue(deepEquals(partial2IChronologyIWeekyearOfCenturyITypeIRangeType, actualIChronologyIWeekyearOfCenturyITypeIRangeType));
        
        String partial2IChronologyIWeekyearOfCenturyITypeIName = ((String) getFieldValue(partial2IChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIWeekyearOfCenturyITypeIName = ((String) getFieldValue(actualIChronologyIWeekyearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(partial2IChronologyIWeekyearOfCenturyITypeIName, actualIChronologyIWeekyearOfCenturyITypeIName);
        
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        DateTimeField partial2IChronologyIYearOfCentury = ((DateTimeField) getFieldValue(partial2IChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        DateTimeField actualIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        assertTrue(deepEquals(partial2IChronologyIYearOfCentury, actualIChronologyIYearOfCentury));
        DurationField partial2IChronologyIYearOfCenturyIDurationField = ((DurationField) getFieldValue(partial2IChronologyIYearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        DurationField actualIChronologyIYearOfCenturyIDurationField = ((DurationField) getFieldValue(actualIChronologyIYearOfCentury, "org.joda.time.field.RemainderDateTimeField", "iDurationField"));
        assertTrue(deepEquals(partial2IChronologyIYearOfCenturyIDurationField, actualIChronologyIYearOfCenturyIDurationField));
        
        assertTrue(deepEquals(partial2IChronologyIYearOfCentury, actualIChronologyIYearOfCentury));
        assertTrue(deepEquals(partial2IChronologyIYearOfCentury, actualIChronologyIYearOfCentury));
        DateTimeFieldType partial2IChronologyIYearOfCenturyIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyIYearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyIYearOfCenturyIType = ((DateTimeFieldType) getFieldValue(actualIChronologyIYearOfCentury, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyIYearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyIYearOfCenturyITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(partial2IChronologyIYearOfCenturyITypeIOrdinal, actualIChronologyIYearOfCenturyITypeIOrdinal);
        
        assertTrue(deepEquals(partial2IChronologyIYearOfCenturyIType, actualIChronologyIYearOfCenturyIType));
        assertTrue(deepEquals(partial2IChronologyIYearOfCenturyIType, actualIChronologyIYearOfCenturyIType));
        String partial2IChronologyIYearOfCenturyITypeIName = ((String) getFieldValue(partial2IChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyIYearOfCenturyITypeIName = ((String) getFieldValue(actualIChronologyIYearOfCenturyIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(partial2IChronologyIYearOfCenturyITypeIName, actualIChronologyIYearOfCenturyITypeIName);
        
        DateTimeField partial2IChronologyICenturyOfEra = ((DateTimeField) getFieldValue(partial2IChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        DateTimeField actualIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        int partial2IChronologyICenturyOfEraIDivisor = ((Integer) getFieldValue(partial2IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDivisor"));
        int actualIChronologyICenturyOfEraIDivisor = ((Integer) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDivisor"));
        assertEquals(partial2IChronologyICenturyOfEraIDivisor, actualIChronologyICenturyOfEraIDivisor);
        
        DurationField partial2IChronologyICenturyOfEraIDurationField = ((DurationField) getFieldValue(partial2IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDurationField"));
        DurationField actualIChronologyICenturyOfEraIDurationField = ((DurationField) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iDurationField"));
        assertTrue(deepEquals(partial2IChronologyICenturyOfEraIDurationField, actualIChronologyICenturyOfEraIDurationField));
        assertTrue(deepEquals(partial2IChronologyICenturyOfEraIDurationField, actualIChronologyICenturyOfEraIDurationField));
        assertTrue(deepEquals(partial2IChronologyICenturyOfEraIDurationField, actualIChronologyICenturyOfEraIDurationField));
        
        DurationField partial2IChronologyICenturyOfEraIRangeDurationField = ((DurationField) getFieldValue(partial2IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iRangeDurationField"));
        DurationField actualIChronologyICenturyOfEraIRangeDurationField = ((DurationField) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iRangeDurationField"));
        assertTrue(deepEquals(partial2IChronologyICenturyOfEraIRangeDurationField, actualIChronologyICenturyOfEraIRangeDurationField));
        
        int partial2IChronologyICenturyOfEraIMin = ((Integer) getFieldValue(partial2IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMin"));
        int actualIChronologyICenturyOfEraIMin = ((Integer) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMin"));
        assertEquals(partial2IChronologyICenturyOfEraIMin, actualIChronologyICenturyOfEraIMin);
        
        int partial2IChronologyICenturyOfEraIMax = ((Integer) getFieldValue(partial2IChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMax"));
        int actualIChronologyICenturyOfEraIMax = ((Integer) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.DividedDateTimeField", "iMax"));
        assertEquals(partial2IChronologyICenturyOfEraIMax, actualIChronologyICenturyOfEraIMax);
        
        assertTrue(deepEquals(partial2IChronologyICenturyOfEra, actualIChronologyICenturyOfEra));
        DateTimeFieldType partial2IChronologyICenturyOfEraIType = ((DateTimeFieldType) getFieldValue(partial2IChronologyICenturyOfEra, "org.joda.time.field.BaseDateTimeField", "iType"));
        DateTimeFieldType actualIChronologyICenturyOfEraIType = ((DateTimeFieldType) getFieldValue(actualIChronologyICenturyOfEra, "org.joda.time.field.BaseDateTimeField", "iType"));
        byte partial2IChronologyICenturyOfEraITypeIOrdinal = ((Byte) getFieldValue(partial2IChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        byte actualIChronologyICenturyOfEraITypeIOrdinal = ((Byte) getFieldValue(actualIChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal"));
        assertEquals(partial2IChronologyICenturyOfEraITypeIOrdinal, actualIChronologyICenturyOfEraITypeIOrdinal);
        
        DurationFieldType partial2IChronologyICenturyOfEraITypeIUnitType = ((DurationFieldType) getFieldValue(partial2IChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        DurationFieldType actualIChronologyICenturyOfEraITypeIUnitType = ((DurationFieldType) getFieldValue(actualIChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType"));
        assertTrue(deepEquals(partial2IChronologyICenturyOfEraITypeIUnitType, actualIChronologyICenturyOfEraITypeIUnitType));
        assertTrue(deepEquals(partial2IChronologyICenturyOfEraITypeIUnitType, actualIChronologyICenturyOfEraITypeIUnitType));
        
        assertTrue(deepEquals(partial2IChronologyICenturyOfEraIType, actualIChronologyICenturyOfEraIType));
        String partial2IChronologyICenturyOfEraITypeIName = ((String) getFieldValue(partial2IChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType", "iName"));
        String actualIChronologyICenturyOfEraITypeIName = ((String) getFieldValue(actualIChronologyICenturyOfEraIType, "org.joda.time.DateTimeFieldType", "iName"));
        assertEquals(partial2IChronologyICenturyOfEraITypeIName, actualIChronologyICenturyOfEraITypeIName);
        
        assertTrue(deepEquals(partial2IChronology, actualIChronology));
        int partial2IChronologyIBaseFlags = ((Integer) getFieldValue(partial2IChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseFlags = ((Integer) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        assertEquals(partial2IChronologyIBaseFlags, actualIChronologyIBaseFlags);
        
        org.joda.time.DateTimeFieldType[] partial2ITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(partial2, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int partial2ITypesSize = partial2ITypes.length;
        assertEquals(partial2ITypesSize, actualITypes.length);
        assertTrue(deepEquals(partial2ITypes, actualITypes));
        
        int[] partial2IValues = ((int[]) getFieldValue(partial2, "org.joda.time.Partial", "iValues"));
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        int partial2IValuesSize = partial2IValues.length;
        assertEquals(partial2IValuesSize, actualIValues.length);
        assertArrayEquals(partial2IValues, actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withChronologyRetainFields(org.joda.time.Chronology)
    
    @Test
    public void testWithChronologyRetainFields1() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, ((int[]) null));
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        LenientChronology iBase = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        Partial actual = partial.withChronologyRetainFields(zonedChronology);
        
        Partial expected = new Partial(iBase, dateTimeFieldTypeArray, ((int[]) null));
        
        Chronology expectedIChronology = ((Chronology) getFieldValue(expected, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.Partial", "iChronology"));
        Chronology actualIChronologyIWithUTC = ((Chronology) getFieldValue(actualIChronology, "org.joda.time.chrono.LenientChronology", "iWithUTC"));
        assertNull(actualIChronologyIWithUTC);
        
        Chronology actualIChronologyIBase = ((Chronology) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBase"));
        assertNull(actualIChronologyIBase);
        
        Object actualIChronologyIParam = getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iParam");
        assertNull(actualIChronologyIParam);
        
        DurationField actualIChronologyIMillis = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillis"));
        assertNull(actualIChronologyIMillis);
        
        DurationField actualIChronologyISeconds = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSeconds"));
        assertNull(actualIChronologyISeconds);
        
        DurationField actualIChronologyIMinutes = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinutes"));
        assertNull(actualIChronologyIMinutes);
        
        DurationField actualIChronologyIHours = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHours"));
        assertNull(actualIChronologyIHours);
        
        DurationField actualIChronologyIHalfdays = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHalfdays"));
        assertNull(actualIChronologyIHalfdays);
        
        DurationField actualIChronologyIDays = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDays"));
        assertNull(actualIChronologyIDays);
        
        DurationField actualIChronologyIWeeks = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeeks"));
        assertNull(actualIChronologyIWeeks);
        
        DurationField actualIChronologyIWeekyears = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyears"));
        assertNull(actualIChronologyIWeekyears);
        
        DurationField actualIChronologyIMonths = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMonths"));
        assertNull(actualIChronologyIMonths);
        
        DurationField actualIChronologyIYears = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYears"));
        assertNull(actualIChronologyIYears);
        
        DurationField actualIChronologyICenturies = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturies"));
        assertNull(actualIChronologyICenturies);
        
        DurationField actualIChronologyIEras = ((DurationField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iEras"));
        assertNull(actualIChronologyIEras);
        
        DateTimeField actualIChronologyIMillisOfSecond = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond"));
        assertNull(actualIChronologyIMillisOfSecond);
        
        DateTimeField actualIChronologyIMillisOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay"));
        assertNull(actualIChronologyIMillisOfDay);
        
        DateTimeField actualIChronologyISecondOfMinute = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute"));
        assertNull(actualIChronologyISecondOfMinute);
        
        DateTimeField actualIChronologyISecondOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay"));
        assertNull(actualIChronologyISecondOfDay);
        
        DateTimeField actualIChronologyIMinuteOfHour = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour"));
        assertNull(actualIChronologyIMinuteOfHour);
        
        DateTimeField actualIChronologyIMinuteOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay"));
        assertNull(actualIChronologyIMinuteOfDay);
        
        DateTimeField actualIChronologyIHourOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfDay"));
        assertNull(actualIChronologyIHourOfDay);
        
        DateTimeField actualIChronologyIClockhourOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay"));
        assertNull(actualIChronologyIClockhourOfDay);
        
        DateTimeField actualIChronologyIHourOfHalfday = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday"));
        assertNull(actualIChronologyIHourOfHalfday);
        
        DateTimeField actualIChronologyIClockhourOfHalfday = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday"));
        assertNull(actualIChronologyIClockhourOfHalfday);
        
        DateTimeField actualIChronologyIHalfdayOfDay = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay"));
        assertNull(actualIChronologyIHalfdayOfDay);
        
        DateTimeField actualIChronologyIDayOfWeek = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek"));
        assertNull(actualIChronologyIDayOfWeek);
        
        DateTimeField actualIChronologyIDayOfMonth = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth"));
        assertNull(actualIChronologyIDayOfMonth);
        
        DateTimeField actualIChronologyIDayOfYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iDayOfYear"));
        assertNull(actualIChronologyIDayOfYear);
        
        DateTimeField actualIChronologyIWeekOfWeekyear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear"));
        assertNull(actualIChronologyIWeekOfWeekyear);
        
        DateTimeField actualIChronologyIWeekyear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyear"));
        assertNull(actualIChronologyIWeekyear);
        
        DateTimeField actualIChronologyIWeekyearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury"));
        assertNull(actualIChronologyIWeekyearOfCentury);
        
        DateTimeField actualIChronologyIMonthOfYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear"));
        assertNull(actualIChronologyIMonthOfYear);
        
        DateTimeField actualIChronologyIYear = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYear"));
        assertNull(actualIChronologyIYear);
        
        DateTimeField actualIChronologyIYearOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfEra"));
        assertNull(actualIChronologyIYearOfEra);
        
        DateTimeField actualIChronologyIYearOfCentury = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury"));
        assertNull(actualIChronologyIYearOfCentury);
        
        DateTimeField actualIChronologyICenturyOfEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra"));
        assertNull(actualIChronologyICenturyOfEra);
        
        DateTimeField actualIChronologyIEra = ((DateTimeField) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iEra"));
        assertNull(actualIChronologyIEra);
        
        int expectedIChronologyIBaseFlags = ((Integer) getFieldValue(expectedIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        int actualIChronologyIBaseFlags = ((Integer) getFieldValue(actualIChronology, "org.joda.time.chrono.AssembledChronology", "iBaseFlags"));
        assertEquals(expectedIChronologyIBaseFlags, actualIChronologyIBaseFlags);
        
        org.joda.time.DateTimeFieldType[] expectedITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(expected, "org.joda.time.Partial", "iTypes"));
        org.joda.time.DateTimeFieldType[] actualITypes = ((org.joda.time.DateTimeFieldType[]) getFieldValue(actual, "org.joda.time.Partial", "iTypes"));
        int expectedITypesSize = expectedITypes.length;
        assertEquals(expectedITypesSize, actualITypes.length);
        assertTrue(deepEquals(expectedITypes, actualITypes));
        
        int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.Partial", "iValues"));
        assertNull(actualIValues);
        
        org.joda.time.format.DateTimeFormatter[] actualIFormatter = ((org.joda.time.format.DateTimeFormatter[]) getFieldValue(actual, "org.joda.time.Partial", "iFormatter"));
        assertNull(actualIFormatter);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withChronologyRetainFields(org.joda.time.Chronology)
    
    @Test
    public void testWithChronologyRetainFields2() throws Exception  {
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray = {null};
        int[] intArray = {0};
        Partial partial = new Partial(((Chronology) null), dateTimeFieldTypeArray, intArray);
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        CopticChronology iBase = ((CopticChronology) createInstance("org.joda.time.chrono.CopticChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.Partial.withChronologyRetainFields] produces [java.lang.NullPointerException]
            org.joda.time.Partial.getField(Partial.java:333)
            org.joda.time.base.AbstractPartial.getField(AbstractPartial.java:105)
            org.joda.time.chrono.BaseChronology.validate(BaseChronology.java:186)
            org.joda.time.Partial.withChronologyRetainFields(Partial.java:406) */
        partial.withChronologyRetainFields(zonedChronology);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1050828954731900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1050828954731900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1050828954745300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050828954731900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050828954745300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1050828955914200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050828955914200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050828955917900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050828955914200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050828955917900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1050828960970300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050828960970300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050828960974599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050828960970300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050828960974599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1050828962263100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1050828962263100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1050828962267000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1050828962263100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1050828962267000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

