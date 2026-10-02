package org.joda.time.base;

import org.junit.Test;
import org.joda.time.DurationFieldType;
import org.joda.time.Days;
import org.joda.time.Weeks;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import java.lang.reflect.Method;
import org.joda.time.PeriodType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePeriod;
import org.joda.time.LocalTime;
import org.joda.time.YearMonthDay;
import org.joda.time.TimeOfDay;
import org.joda.time.ReadablePartial;
import org.joda.time.DateTimeFieldType;
import java.util.HashMap;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.DateMidnight;
import org.joda.time.ReadableInstant;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.Instant;
import org.joda.time.Years;
import org.joda.time.Months;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

public final class org_joda_time_base_BaseSingleFieldPeriodTest {
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(org.joda.time.DurationFieldType)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#get(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGet_ReturnZero() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            int actual = days.get(null);
            
            assertEquals(0, actual);
        } finally {
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#get(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGet_ReturnZero_1() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            int actual = weeks.get(null);
            
            assertEquals(0, actual);
        } finally {
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#get(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGet_ReturnZero_2() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            
            int actual = hours.get(null);
            
            assertEquals(0, actual);
        } finally {
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#get(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGet_ReturnZero_3() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        try {
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
            
            int actual = minutes.get(null);
            
            assertEquals(0, actual);
        } finally {
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#get(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGet_ReturnZero_4() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        try {
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
            
            int actual = seconds.get(null);
            
            assertEquals(0, actual);
        } finally {
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#get(org.joda.time.DurationFieldType)}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.returnsFrom {@code return getValue();}
 *  */
    @Test
    public void testGet_BaseSingleFieldPeriodGetValue() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            setField(days, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
            
            Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
            Method getMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("get", durationFieldTypeClazz);
            getMethod.setAccessible(true);
            java.lang.Object[] getMethodArguments = new java.lang.Object[1];
            getMethodArguments[0] = daysType;
            int actual = ((Integer) getMethod.invoke(days, getMethodArguments));
            
            assertEquals(-255, actual);
        } finally {
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Period() throws Exception  {
        Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
        
        boolean actual = seconds.equals(seconds);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_PeriodInstanceOfReadablePeriodEqualsFalse() throws Exception  {
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        
        boolean actual = hours.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        try {
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            setStaticField(periodTypeClazz, "cDays", cWeeks);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            setField(weeks, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", 1);
            
            boolean actual = days.equals(weeks);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
            setStaticField(PeriodType.class, "cDays", prevCDays);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_3() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            boolean actual = weeks.equals(days);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_4() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        PeriodType prevCHours = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cHours"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            PeriodType cHours = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cHours", cHours);
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            boolean actual = hours.equals(days);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(PeriodType.class, "cHours", prevCHours);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_6() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        PeriodType prevCMinutes = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cMinutes"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            PeriodType cMinutes = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cMinutes", cMinutes);
            Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            boolean actual = minutes.equals(days);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(PeriodType.class, "cMinutes", prevCMinutes);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_13() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCHours = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cHours"));
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        try {
            PeriodType cHours = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cHours", cHours);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            
            boolean actual = weeks.equals(hours);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cHours", prevCHours);
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_14() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCMinutes = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cMinutes"));
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        try {
            PeriodType cMinutes = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cMinutes", cMinutes);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
            
            boolean actual = weeks.equals(minutes);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cMinutes", prevCMinutes);
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_15() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        try {
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", iType);
            
            boolean actual = weeks.equals(mutablePeriod);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_16() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            Period period = ((Period) createInstance("org.joda.time.Period"));
            setField(period, "org.joda.time.base.BasePeriod", "iType", cDays);
            int[] iValues = {1};
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            boolean actual = days.equals(period);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            setStaticField(periodTypeClazz, "cDays", null);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            boolean actual = days.equals(weeks);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        PeriodType prevCSeconds = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cSeconds"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        try {
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            setStaticField(periodTypeClazz, "cSeconds", null);
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            boolean actual = seconds.equals(weeks);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
            setStaticField(PeriodType.class, "cSeconds", prevCSeconds);
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_5() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        PeriodType prevCHours = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cHours"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            setStaticField(periodTypeClazz, "cHours", null);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            boolean actual = hours.equals(days);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(PeriodType.class, "cHours", prevCHours);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_7() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        PeriodType prevCMinutes = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cMinutes"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            setStaticField(periodTypeClazz, "cMinutes", null);
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            boolean actual = minutes.equals(days);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(PeriodType.class, "cMinutes", prevCMinutes);
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_8() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        try {
            setStaticField(periodTypeClazz, "cWeeks", null);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            boolean actual = days.equals(weeks);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(PeriodType.class, "cDays", prevCDays);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_10() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        PeriodType prevCSeconds = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cSeconds"));
        try {
            setStaticField(periodTypeClazz, "cWeeks", null);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            PeriodType cSeconds = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cSeconds", cSeconds);
            Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            boolean actual = seconds.equals(weeks);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(PeriodType.class, "cSeconds", prevCSeconds);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_9() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            setStaticField(periodTypeClazz, "cWeeks", null);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            setStaticField(periodTypeClazz, "cDays", null);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName1 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            boolean actual = days.equals(weeks);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_11() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        PeriodType prevCSeconds = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cSeconds"));
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        try {
            setStaticField(periodTypeClazz, "cWeeks", null);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            setStaticField(periodTypeClazz, "cSeconds", null);
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName1 = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            boolean actual = seconds.equals(weeks);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(PeriodType.class, "cSeconds", prevCSeconds);
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());}
 *  */
    @Test
    public void testEquals_PeriodNotInstanceOfReadablePeriodNotEqualsFalse_12() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        PeriodType prevCHours = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cHours"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            setStaticField(periodTypeClazz, "cDays", null);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            setStaticField(periodTypeClazz, "cHours", null);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName1 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            boolean actual = hours.equals(days);
            
            assertFalse(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(PeriodType.class, "cHours", prevCHours);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (period): False}
 * @utbot.executesCondition {@code (period instanceof ReadablePeriod == false): False}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getPeriodType()}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.invokes {@link org.joda.time.ReadablePeriod#getValue(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iType", cDays);
            int[] iValues = {};
            setField(mutablePeriod, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.joda.time.base.BasePeriod.getValue(BasePeriod.java:329)
                org.joda.time.base.BaseSingleFieldPeriod.equals(BaseSingleFieldPeriod.java:307) */
            days.equals(mutablePeriod);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCWeeks = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cWeeks"));
        try {
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cWeeks", cWeeks);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            Weeks weeks1 = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            boolean actual = weeks.equals(weeks1);
            
            assertTrue(actual);
        } finally {
            setStaticField(PeriodType.class, "cWeeks", prevCWeeks);
        }
    }
    
    @Test
    public void testEquals2() throws Exception  {
        Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
        Period period = ((Period) createInstance("org.joda.time.Period"));
        
        boolean actual = minutes.equals(period);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCDays = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cDays"));
        try {
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cDays", cDays);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            Period period = ((Period) createInstance("org.joda.time.Period"));
            setField(period, "org.joda.time.base.BasePeriod", "iType", cDays);
            int[] iValues = {
                0, 0, 0, 0, 0, 0, 0, 0,
                0
            };
            setField(period, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            boolean actual = days.equals(period);
            
            assertTrue(actual);
        } finally {
            setStaticField(PeriodType.class, "cDays", prevCDays);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_ReturnTotal() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            setField(days, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
            
            int actual = days.hashCode();
            
            assertEquals(5636, actual);
        } finally {
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_ReturnTotal_1() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            setField(weeks, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
            
            int actual = weeks.hashCode();
            
            assertEquals(5572, actual);
        } finally {
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_ReturnTotal_2() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            setField(hours, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
            
            int actual = hours.hashCode();
            
            assertEquals(6020, actual);
        } finally {
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_ReturnTotal_3() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        try {
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
            setField(minutes, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
            
            int actual = minutes.hashCode();
            
            assertEquals(6532, actual);
        } finally {
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#hashCode()}
 * @utbot.returnsFrom {@code return total;}
 *  */
    @Test
    public void testHashCode_ReturnTotal_4() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        try {
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
            setField(seconds, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
            
            int actual = seconds.hashCode();
            
            assertEquals(7556, actual);
        } finally {
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.compareTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareTo(org.joda.time.base.BaseSingleFieldPeriod)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#compareTo(org.joda.time.base.BaseSingleFieldPeriod)}
 * @utbot.executesCondition {@code (other.getClass() != getClass()): False}
 * @utbot.executesCondition {@code (thisValue > otherValue): True}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testCompareTo_ThisValueGreaterThanOtherValue() throws Exception  {
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        setField(weeks, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -1);
        Weeks weeks1 = ((Weeks) createInstance("org.joda.time.Weeks"));
        setField(weeks1, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -2);
        
        int actual = weeks.compareTo(((BaseSingleFieldPeriod) weeks1));
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareTo(org.joda.time.base.BaseSingleFieldPeriod)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#compareTo(org.joda.time.base.BaseSingleFieldPeriod)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: other.getClass() != getClass()
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException() throws Exception  {
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.compareTo] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.compareTo(BaseSingleFieldPeriod.java:331) */
        weeks.compareTo(((BaseSingleFieldPeriod) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareTo(org.joda.time.base.BaseSingleFieldPeriod)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#compareTo(org.joda.time.base.BaseSingleFieldPeriod)}
 * @utbot.executesCondition {@code (other.getClass() != getClass()): False}
 * @utbot.executesCondition {@code (thisValue > otherValue): False}
 * @utbot.executesCondition {@code (thisValue < otherValue): True}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.returnsFrom {@code return -1;}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return -1;
 *  */
    @Test(expected = ClassCastException.class)
    public void testCompareTo_ThrowClassCastException() throws Exception  {
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        Days days = ((Days) createInstance("org.joda.time.Days"));
        setField(days, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", 1);
        
        hours.compareTo(((BaseSingleFieldPeriod) days));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getValue(int)}
 * @utbot.executesCondition {@code (index != 0): False}
 * @utbot.invokes {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.returnsFrom {@code return getValue();}
 *  */
    @Test
    public void testGetValue_IndexEqualsZero() throws Exception  {
        Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
        setField(hours, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", 1);
        
        int actual = hours.getValue(0);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValue(int)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getValue(int)}
 * @utbot.executesCondition {@code (index != 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index != 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValue_ThrowIndexOutOfBoundsException() throws Exception  {
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        weeks.getValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getValue()}
 * @utbot.returnsFrom {@code return iPeriod;}
 *  */
    @Test
    public void testGetValue_ReturnIPeriod() throws Exception  {
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        setField(weeks, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
        
        int actual = weeks.getValue();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#size()}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testSize_Return1() throws Exception  {
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        int actual = weeks.size();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(int)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#setValue(int)}
 *  */
    @Test
    public void testSetValue() throws Exception  {
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        setField(weeks, "org.joda.time.base.BaseSingleFieldPeriod", "iPeriod", -255);
        
        weeks.setValue(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.getFieldType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getFieldType(int)}
 * @utbot.returnsFrom {@code return getFieldType();}
 *  */
    @Test
    public void testGetFieldType_ReturnGetFieldType() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            Object actual = weeks.getFieldType(0);
            
            byte weeksTypeIOrdinal = ((Byte) getFieldValue(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            byte actualIOrdinal = ((Byte) getFieldValue(actual, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            assertEquals(weeksTypeIOrdinal, actualIOrdinal);
            
            String weeksTypeIName = ((String) getFieldValue(weeksType, "org.joda.time.DurationFieldType", "iName"));
            String actualIName = ((String) getFieldValue(actual, "org.joda.time.DurationFieldType", "iName"));
            assertEquals(weeksTypeIName, actualIName);
            
        } finally {
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getFieldType(int)}
 * @utbot.returnsFrom {@code return getFieldType();}
 *  */
    @Test
    public void testGetFieldType_ReturnGetFieldType_1() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            Object actual = days.getFieldType(0);
            
            byte daysTypeIOrdinal = ((Byte) getFieldValue(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            byte actualIOrdinal = ((Byte) getFieldValue(actual, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            assertEquals(daysTypeIOrdinal, actualIOrdinal);
            
            String daysTypeIName = ((String) getFieldValue(daysType, "org.joda.time.DurationFieldType", "iName"));
            String actualIName = ((String) getFieldValue(actual, "org.joda.time.DurationFieldType", "iName"));
            assertEquals(daysTypeIName, actualIName);
            
        } finally {
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getFieldType(int)}
 * @utbot.returnsFrom {@code return getFieldType();}
 *  */
    @Test
    public void testGetFieldType_ReturnGetFieldType_2() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            
            Object actual = hours.getFieldType(0);
            
            byte hoursTypeIOrdinal = ((Byte) getFieldValue(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            byte actualIOrdinal = ((Byte) getFieldValue(actual, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            assertEquals(hoursTypeIOrdinal, actualIOrdinal);
            
            String hoursTypeIName = ((String) getFieldValue(hoursType, "org.joda.time.DurationFieldType", "iName"));
            String actualIName = ((String) getFieldValue(actual, "org.joda.time.DurationFieldType", "iName"));
            assertEquals(hoursTypeIName, actualIName);
            
        } finally {
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getFieldType(int)}
 * @utbot.returnsFrom {@code return getFieldType();}
 *  */
    @Test
    public void testGetFieldType_ReturnGetFieldType_3() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        try {
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
            
            Object actual = minutes.getFieldType(0);
            
            byte minutesTypeIOrdinal = ((Byte) getFieldValue(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            byte actualIOrdinal = ((Byte) getFieldValue(actual, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            assertEquals(minutesTypeIOrdinal, actualIOrdinal);
            
            String minutesTypeIName = ((String) getFieldValue(minutesType, "org.joda.time.DurationFieldType", "iName"));
            String actualIName = ((String) getFieldValue(actual, "org.joda.time.DurationFieldType", "iName"));
            assertEquals(minutesTypeIName, actualIName);
            
        } finally {
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getFieldType(int)}
 * @utbot.returnsFrom {@code return getFieldType();}
 *  */
    @Test
    public void testGetFieldType_ReturnGetFieldType_4() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        try {
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
            
            Object actual = seconds.getFieldType(0);
            
            byte secondsTypeIOrdinal = ((Byte) getFieldValue(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            byte actualIOrdinal = ((Byte) getFieldValue(actual, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal"));
            assertEquals(secondsTypeIOrdinal, actualIOrdinal);
            
            String secondsTypeIName = ((String) getFieldValue(secondsType, "org.joda.time.DurationFieldType", "iName"));
            String actualIName = ((String) getFieldValue(actual, "org.joda.time.DurationFieldType", "iName"));
            assertEquals(secondsTypeIName, actualIName);
            
        } finally {
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFieldType(int)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#getFieldType(int)}
 * @utbot.executesCondition {@code (index != 0): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} when: index != 0
 *  */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetFieldType_ThrowIndexOutOfBoundsException() throws Exception  {
        Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
        
        weeks.getFieldType(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.isSupported
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSupported(org.joda.time.DurationFieldType)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#isSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return (type == getFieldType());}
 *  */
    @Test
    public void testIsSupported_ReturnTypeNotEqualsGetFieldType_1() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            boolean actual = days.isSupported(null);
            
            assertFalse(actual);
        } finally {
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#isSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return (type == getFieldType());}
 *  */
    @Test
    public void testIsSupported_ReturnTypeNotEqualsGetFieldType_5() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        try {
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Seconds seconds = ((Seconds) createInstance("org.joda.time.Seconds"));
            
            boolean actual = seconds.isSupported(null);
            
            assertFalse(actual);
        } finally {
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#isSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return (type == getFieldType());}
 *  */
    @Test
    public void testIsSupported_ReturnTypeNotEqualsGetFieldType() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        try {
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName = "";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Days days = ((Days) createInstance("org.joda.time.Days"));
            
            Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
            Method isSupportedMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("isSupported", durationFieldTypeClazz);
            isSupportedMethod.setAccessible(true);
            java.lang.Object[] isSupportedMethodArguments = new java.lang.Object[1];
            isSupportedMethodArguments[0] = daysType;
            boolean actual = ((Boolean) isSupportedMethod.invoke(days, isSupportedMethodArguments));
            
            assertTrue(actual);
        } finally {
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#isSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return (type == getFieldType());}
 *  */
    @Test
    public void testIsSupported_ReturnTypeNotEqualsGetFieldType_2() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        try {
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName = "";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Weeks weeks = ((Weeks) createInstance("org.joda.time.Weeks"));
            
            Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
            Method isSupportedMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("isSupported", durationFieldTypeClazz);
            isSupportedMethod.setAccessible(true);
            java.lang.Object[] isSupportedMethodArguments = new java.lang.Object[1];
            isSupportedMethodArguments[0] = weeksType;
            boolean actual = ((Boolean) isSupportedMethod.invoke(weeks, isSupportedMethodArguments));
            
            assertTrue(actual);
        } finally {
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#isSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return (type == getFieldType());}
 *  */
    @Test
    public void testIsSupported_ReturnTypeNotEqualsGetFieldType_3() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        try {
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName = "";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Hours hours = ((Hours) createInstance("org.joda.time.Hours"));
            
            Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
            Method isSupportedMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("isSupported", durationFieldTypeClazz);
            isSupportedMethod.setAccessible(true);
            java.lang.Object[] isSupportedMethodArguments = new java.lang.Object[1];
            isSupportedMethodArguments[0] = hoursType;
            boolean actual = ((Boolean) isSupportedMethod.invoke(hours, isSupportedMethodArguments));
            
            assertTrue(actual);
        } finally {
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#isSupported(org.joda.time.DurationFieldType)}
 * @utbot.returnsFrom {@code return (type == getFieldType());}
 *  */
    @Test
    public void testIsSupported_ReturnTypeNotEqualsGetFieldType_4() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        try {
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName = "";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Minutes minutes = ((Minutes) createInstance("org.joda.time.Minutes"));
            
            Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
            Method isSupportedMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("isSupported", durationFieldTypeClazz);
            isSupportedMethod.setAccessible(true);
            java.lang.Object[] isSupportedMethodArguments = new java.lang.Object[1];
            isSupportedMethodArguments[0] = minutesType;
            boolean actual = ((Boolean) isSupportedMethod.invoke(minutes, isSupportedMethodArguments));
            
            assertTrue(actual);
        } finally {
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.between
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method between(org.joda.time.ReadablePartial, org.joda.time.ReadablePartial, org.joda.time.ReadablePeriod)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_2() throws Exception  {
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        
        BaseSingleFieldPeriod.between(localDate, localDateTime, ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_3() throws Exception  {
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        
        BaseSingleFieldPeriod.between(localDate, localTime, ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_4() throws Exception  {
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        BaseSingleFieldPeriod.between(localDateTime, localDate, ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_5() throws Exception  {
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        YearMonthDay yearMonthDay = ((YearMonthDay) createInstance("org.joda.time.YearMonthDay"));
        
        BaseSingleFieldPeriod.between(localDateTime, yearMonthDay, ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_6() throws Exception  {
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        BaseSingleFieldPeriod.between(localTime, localDate, ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_7() throws Exception  {
        YearMonthDay yearMonthDay = ((YearMonthDay) createInstance("org.joda.time.YearMonthDay"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        
        BaseSingleFieldPeriod.between(yearMonthDay, localDateTime, ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start.size() != end.size()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_8() throws Exception  {
        TimeOfDay timeOfDay = ((TimeOfDay) createInstance("org.joda.time.TimeOfDay"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        
        BaseSingleFieldPeriod.between(timeOfDay, localDate, ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start == null || end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_1() throws Exception  {
        LocalTime localTime = ((LocalTime) createInstance("org.joda.time.LocalTime"));
        
        BaseSingleFieldPeriod.between(localTime, ((ReadablePartial) null), ((ReadablePeriod) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadablePartial,org.joda.time.ReadablePartial,org.joda.time.ReadablePeriod)}
 * @utbot.executesCondition {@code (start == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start == null || end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException() {
        BaseSingleFieldPeriod.between(((ReadablePartial) null), ((ReadablePartial) null), ((ReadablePeriod) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method between(org.joda.time.ReadablePartial, org.joda.time.ReadablePartial, org.joda.time.ReadablePeriod)
    
    @Test
    public void testBetween1() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMILLIS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MILLIS_TYPE"));
        DurationFieldType prevERAS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "ERAS_TYPE"));
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevCENTURIES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "CENTURIES_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKYEARS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevHALFDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HALFDAYS_TYPE"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        Class dateTimeFieldTypeClazz = Class.forName("org.joda.time.DateTimeFieldType");
        DateTimeFieldType prevYEAR_TYPE = ((DateTimeFieldType) getStaticFieldValue(dateTimeFieldTypeClazz, "YEAR_TYPE"));
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            Object millisType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(millisType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName = "millis";
            setField(millisType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MILLIS_TYPE", millisType);
            Object erasType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(erasType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
            String iName1 = "eras";
            setField(erasType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "ERAS_TYPE", erasType);
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName2 = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object centuriesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(centuriesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
            String iName3 = "centuries";
            setField(centuriesType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "CENTURIES_TYPE", centuriesType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName4 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName4);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName5 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName5);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weekyearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weekyearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
            String iName6 = "weekyears";
            setField(weekyearsType, "org.joda.time.DurationFieldType", "iName", iName6);
            setStaticField(durationFieldTypeClazz, "WEEKYEARS_TYPE", weekyearsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName7 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName7);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object halfdaysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(halfdaysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
            String iName8 = "halfdays";
            setField(halfdaysType, "org.joda.time.DurationFieldType", "iName", iName8);
            setStaticField(durationFieldTypeClazz, "HALFDAYS_TYPE", halfdaysType);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName9 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName9);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName10 = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName10);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName11 = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName11);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Object yearType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(yearType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
            setField(yearType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", yearsType);
            String iName12 = "year";
            setField(yearType, "org.joda.time.DateTimeFieldType", "iName", iName12);
            setStaticField(dateTimeFieldTypeClazz, "YEAR_TYPE", yearType);
            HashMap cCache = new HashMap();
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            cCache.put(standardDurationFieldType, null);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
            BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
            setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
            LocalDate localDate1 = ((LocalDate) createInstance("org.joda.time.LocalDate"));
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
                org.joda.time.LocalDate.getField(LocalDate.java:501)
                org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
                org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:96) */
            BaseSingleFieldPeriod.between(localDate, localDate1, mutablePeriod);
        } finally {
            setStaticField(DurationFieldType.class, "MILLIS_TYPE", prevMILLIS_TYPE);
            setStaticField(DurationFieldType.class, "ERAS_TYPE", prevERAS_TYPE);
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "CENTURIES_TYPE", prevCENTURIES_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKYEARS_TYPE", prevWEEKYEARS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "HALFDAYS_TYPE", prevHALFDAYS_TYPE);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
            setStaticField(DateTimeFieldType.class, "YEAR_TYPE", prevYEAR_TYPE);
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    
    @Test
    public void testBetween2() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMILLIS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MILLIS_TYPE"));
        DurationFieldType prevERAS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "ERAS_TYPE"));
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevCENTURIES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "CENTURIES_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKYEARS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevHALFDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HALFDAYS_TYPE"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        Class dateTimeFieldTypeClazz = Class.forName("org.joda.time.DateTimeFieldType");
        DateTimeFieldType prevYEAR_TYPE = ((DateTimeFieldType) getStaticFieldValue(dateTimeFieldTypeClazz, "YEAR_TYPE"));
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        Class unsupportedDateTimeFieldClazz = Class.forName("org.joda.time.field.UnsupportedDateTimeField");
        HashMap prevCCache1 = ((HashMap) getStaticFieldValue(unsupportedDateTimeFieldClazz, "cCache"));
        try {
            Object millisType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(millisType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName = "millis";
            setField(millisType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MILLIS_TYPE", millisType);
            Object erasType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(erasType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
            String iName1 = "eras";
            setField(erasType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "ERAS_TYPE", erasType);
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName2 = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object centuriesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(centuriesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
            String iName3 = "centuries";
            setField(centuriesType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "CENTURIES_TYPE", centuriesType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName4 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName4);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName5 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName5);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weekyearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weekyearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
            String iName6 = "weekyears";
            setField(weekyearsType, "org.joda.time.DurationFieldType", "iName", iName6);
            setStaticField(durationFieldTypeClazz, "WEEKYEARS_TYPE", weekyearsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName7 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName7);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object halfdaysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(halfdaysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
            String iName8 = "halfdays";
            setField(halfdaysType, "org.joda.time.DurationFieldType", "iName", iName8);
            setStaticField(durationFieldTypeClazz, "HALFDAYS_TYPE", halfdaysType);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName9 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName9);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName10 = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName10);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName11 = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName11);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Object yearType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(yearType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
            setField(yearType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", yearsType);
            String iName12 = "year";
            setField(yearType, "org.joda.time.DateTimeFieldType", "iName", iName12);
            setStaticField(dateTimeFieldTypeClazz, "YEAR_TYPE", yearType);
            HashMap cCache = new HashMap();
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(yearsType, unsupportedDurationField);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            HashMap cCache1 = new HashMap();
            setStaticField(unsupportedDateTimeFieldClazz, "cCache", cCache1);
            LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
            BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
            setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
            LocalDate localDate1 = ((LocalDate) createInstance("org.joda.time.LocalDate"));
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
                org.joda.time.LocalDate.getField(LocalDate.java:501)
                org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
                org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:96) */
            BaseSingleFieldPeriod.between(localDate, localDate1, mutablePeriod);
        } finally {
            setStaticField(DurationFieldType.class, "MILLIS_TYPE", prevMILLIS_TYPE);
            setStaticField(DurationFieldType.class, "ERAS_TYPE", prevERAS_TYPE);
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "CENTURIES_TYPE", prevCENTURIES_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKYEARS_TYPE", prevWEEKYEARS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "HALFDAYS_TYPE", prevHALFDAYS_TYPE);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
            setStaticField(DateTimeFieldType.class, "YEAR_TYPE", prevYEAR_TYPE);
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
            setStaticField(org.joda.time.field.UnsupportedDateTimeField.class, "cCache", prevCCache1);
        }
    }
    
    @Test
    public void testBetween3() throws Exception  {
        Class durationFieldTypeClazz = Class.forName("org.joda.time.DurationFieldType");
        DurationFieldType prevMILLIS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MILLIS_TYPE"));
        DurationFieldType prevERAS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "ERAS_TYPE"));
        DurationFieldType prevYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "YEARS_TYPE"));
        DurationFieldType prevCENTURIES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "CENTURIES_TYPE"));
        DurationFieldType prevDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "DAYS_TYPE"));
        DurationFieldType prevMONTHS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MONTHS_TYPE"));
        DurationFieldType prevWEEKYEARS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKYEARS_TYPE"));
        DurationFieldType prevWEEKS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "WEEKS_TYPE"));
        DurationFieldType prevHALFDAYS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HALFDAYS_TYPE"));
        DurationFieldType prevHOURS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "HOURS_TYPE"));
        DurationFieldType prevMINUTES_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "MINUTES_TYPE"));
        DurationFieldType prevSECONDS_TYPE = ((DurationFieldType) getStaticFieldValue(durationFieldTypeClazz, "SECONDS_TYPE"));
        Class dateTimeFieldTypeClazz = Class.forName("org.joda.time.DateTimeFieldType");
        DateTimeFieldType prevYEAR_TYPE = ((DateTimeFieldType) getStaticFieldValue(dateTimeFieldTypeClazz, "YEAR_TYPE"));
        Class unsupportedDurationFieldClazz = Class.forName("org.joda.time.field.UnsupportedDurationField");
        HashMap prevCCache = ((HashMap) getStaticFieldValue(unsupportedDurationFieldClazz, "cCache"));
        try {
            Object millisType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(millisType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName = "millis";
            setField(millisType, "org.joda.time.DurationFieldType", "iName", iName);
            setStaticField(durationFieldTypeClazz, "MILLIS_TYPE", millisType);
            Object erasType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(erasType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
            String iName1 = "eras";
            setField(erasType, "org.joda.time.DurationFieldType", "iName", iName1);
            setStaticField(durationFieldTypeClazz, "ERAS_TYPE", erasType);
            Object yearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(yearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName2 = "years";
            setField(yearsType, "org.joda.time.DurationFieldType", "iName", iName2);
            setStaticField(durationFieldTypeClazz, "YEARS_TYPE", yearsType);
            Object centuriesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(centuriesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
            String iName3 = "centuries";
            setField(centuriesType, "org.joda.time.DurationFieldType", "iName", iName3);
            setStaticField(durationFieldTypeClazz, "CENTURIES_TYPE", centuriesType);
            Object daysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(daysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName4 = "days";
            setField(daysType, "org.joda.time.DurationFieldType", "iName", iName4);
            setStaticField(durationFieldTypeClazz, "DAYS_TYPE", daysType);
            Object monthsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(monthsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName5 = "months";
            setField(monthsType, "org.joda.time.DurationFieldType", "iName", iName5);
            setStaticField(durationFieldTypeClazz, "MONTHS_TYPE", monthsType);
            Object weekyearsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weekyearsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
            String iName6 = "weekyears";
            setField(weekyearsType, "org.joda.time.DurationFieldType", "iName", iName6);
            setStaticField(durationFieldTypeClazz, "WEEKYEARS_TYPE", weekyearsType);
            Object weeksType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(weeksType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName7 = "weeks";
            setField(weeksType, "org.joda.time.DurationFieldType", "iName", iName7);
            setStaticField(durationFieldTypeClazz, "WEEKS_TYPE", weeksType);
            Object halfdaysType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(halfdaysType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
            String iName8 = "halfdays";
            setField(halfdaysType, "org.joda.time.DurationFieldType", "iName", iName8);
            setStaticField(durationFieldTypeClazz, "HALFDAYS_TYPE", halfdaysType);
            Object hoursType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(hoursType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName9 = "hours";
            setField(hoursType, "org.joda.time.DurationFieldType", "iName", iName9);
            setStaticField(durationFieldTypeClazz, "HOURS_TYPE", hoursType);
            Object minutesType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(minutesType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName10 = "minutes";
            setField(minutesType, "org.joda.time.DurationFieldType", "iName", iName10);
            setStaticField(durationFieldTypeClazz, "MINUTES_TYPE", minutesType);
            Object secondsType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(secondsType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName11 = "seconds";
            setField(secondsType, "org.joda.time.DurationFieldType", "iName", iName11);
            setStaticField(durationFieldTypeClazz, "SECONDS_TYPE", secondsType);
            Object yearType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
            setField(yearType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
            setField(yearType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", yearsType);
            String iName12 = "year";
            setField(yearType, "org.joda.time.DateTimeFieldType", "iName", iName12);
            setStaticField(dateTimeFieldTypeClazz, "YEAR_TYPE", yearType);
            HashMap cCache = new HashMap();
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 0);
            UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(standardDurationFieldType, unsupportedDurationField);
            UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
            cCache.put(null, unsupportedDurationField1);
            setStaticField(unsupportedDurationFieldClazz, "cCache", cCache);
            LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
            BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
            setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
            LocalDate localDate1 = ((LocalDate) createInstance("org.joda.time.LocalDate"));
            MutablePeriod mutablePeriod = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            
            /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
                org.joda.time.LocalDate.getField(LocalDate.java:501)
                org.joda.time.base.AbstractPartial.getFieldType(AbstractPartial.java:79)
                org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:96) */
            BaseSingleFieldPeriod.between(localDate, localDate1, mutablePeriod);
        } finally {
            setStaticField(DurationFieldType.class, "MILLIS_TYPE", prevMILLIS_TYPE);
            setStaticField(DurationFieldType.class, "ERAS_TYPE", prevERAS_TYPE);
            setStaticField(DurationFieldType.class, "YEARS_TYPE", prevYEARS_TYPE);
            setStaticField(DurationFieldType.class, "CENTURIES_TYPE", prevCENTURIES_TYPE);
            setStaticField(DurationFieldType.class, "DAYS_TYPE", prevDAYS_TYPE);
            setStaticField(DurationFieldType.class, "MONTHS_TYPE", prevMONTHS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKYEARS_TYPE", prevWEEKYEARS_TYPE);
            setStaticField(DurationFieldType.class, "WEEKS_TYPE", prevWEEKS_TYPE);
            setStaticField(DurationFieldType.class, "HALFDAYS_TYPE", prevHALFDAYS_TYPE);
            setStaticField(DurationFieldType.class, "HOURS_TYPE", prevHOURS_TYPE);
            setStaticField(DurationFieldType.class, "MINUTES_TYPE", prevMINUTES_TYPE);
            setStaticField(DurationFieldType.class, "SECONDS_TYPE", prevSECONDS_TYPE);
            setStaticField(DateTimeFieldType.class, "YEAR_TYPE", prevYEAR_TYPE);
            setStaticField(UnsupportedDurationField.class, "cCache", prevCCache);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.between
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method between(org.joda.time.ReadableInstant, org.joda.time.ReadableInstant, org.joda.time.DurationFieldType)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadableInstant,org.joda.time.ReadableInstant,org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.invokes {@link org.joda.time.DateTimeUtils#getInstantChronology(org.joda.time.ReadableInstant)}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.InternalError} in: int amount = field.getField(chrono).getDifference(end.getMillis(), start.getMillis());
 *  */
    @Test(expected = InternalError.class)
    public void testBetween_ThrowInternalError() throws Throwable  {
        DateTime dateTime = ((DateTime) createInstance("org.joda.time.DateTime"));
        GJChronology iChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(dateTime, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 13);
        
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateTimeType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateTimeType, dateTimeType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateTime;
        betweenMethodArguments[1] = dateMidnight;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadableInstant,org.joda.time.ReadableInstant,org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start == null || end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException_11() throws Exception  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        
        BaseSingleFieldPeriod.between(dateMidnight, ((ReadableInstant) null), ((DurationFieldType) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadableInstant,org.joda.time.ReadableInstant,org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (start == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: start == null || end == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBetween_ThrowIllegalArgumentException1() {
        BaseSingleFieldPeriod.between(((ReadableInstant) null), ((ReadableInstant) null), ((DurationFieldType) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method between(org.joda.time.ReadableInstant, org.joda.time.ReadableInstant, org.joda.time.DurationFieldType)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#between(org.joda.time.ReadableInstant,org.joda.time.ReadableInstant,org.joda.time.DurationFieldType)}
 * @utbot.executesCondition {@code (start == null): False}
 * @utbot.executesCondition {@code (end == null): False}
 * @utbot.invokes {@link org.joda.time.DateTimeUtils#getInstantChronology(org.joda.time.ReadableInstant)}
 * @utbot.invokes {@link org.joda.time.DurationFieldType#getField(org.joda.time.Chronology)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int amount = field.getField(chrono).getDifference(end.getMillis(), start.getMillis());
 *  */
    @Test
    public void testBetween_ThrowNullPointerException() throws Exception  {
        MutableDateTime mutableDateTime = ((MutableDateTime) createInstance("org.joda.time.MutableDateTime"));
        GJChronology iChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(mutableDateTime, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        BaseSingleFieldPeriod.between(mutableDateTime, dateMidnight, ((DurationFieldType) null));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method between(org.joda.time.ReadableInstant, org.joda.time.ReadableInstant, org.joda.time.DurationFieldType)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testBetween4() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testBetween5() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method between(org.joda.time.ReadableInstant, org.joda.time.ReadableInstant, org.joda.time.DurationFieldType)
    
    @Test
    public void testBetween6() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween7() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween8() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween9() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween10() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween11() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween12() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween13() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        setField(dateMidnight1, "org.joda.time.base.BaseDateTime", "iMillis", 0L);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween14() {
        Instant instant = new Instant(0L);
        Instant instant1 = new Instant(0L);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        BaseSingleFieldPeriod.between(instant, instant1, ((DurationFieldType) null));
    }
    
    @Test
    public void testBetween15() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween16() throws Exception  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        BaseSingleFieldPeriod.between(dateMidnight, dateMidnight1, ((DurationFieldType) null));
    }
    
    @Test
    public void testBetween17() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween18() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        DateMidnight dateMidnight1 = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = dateMidnight1;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween19() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        Instant instant = new Instant(0L);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = instant;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween20() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        Instant instant = new Instant(0L);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = instant;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBetween21() throws Throwable  {
        DateMidnight dateMidnight = ((DateMidnight) createInstance("org.joda.time.DateMidnight"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(dateMidnight, "org.joda.time.base.BaseDateTime", "iChronology", iChronology);
        Instant instant = new Instant(0L);
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.between] produces [java.lang.NullPointerException]
            org.joda.time.base.BaseSingleFieldPeriod.between(BaseSingleFieldPeriod.java:71) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class dateMidnightType = Class.forName("org.joda.time.ReadableInstant");
        Class standardDurationFieldTypeType = Class.forName("org.joda.time.DurationFieldType");
        Method betweenMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("between", dateMidnightType, dateMidnightType, standardDurationFieldTypeType);
        betweenMethod.setAccessible(true);
        java.lang.Object[] betweenMethodArguments = new java.lang.Object[3];
        betweenMethodArguments[0] = dateMidnight;
        betweenMethodArguments[1] = instant;
        betweenMethodArguments[2] = standardDurationFieldType;
        try {
            betweenMethod.invoke(null, betweenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.toMutablePeriod
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toMutablePeriod()
    
    @Test
    public void testToMutablePeriod1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            setStaticField(periodTypeClazz, "cStandard", null);
            Years years = ((Years) createInstance("org.joda.time.Years"));
            
            MutablePeriod actual = years.toMutablePeriod();
            
            MutablePeriod expected = ((MutablePeriod) createInstance("org.joda.time.MutablePeriod"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(iType, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(iType, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(iType, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(iType, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(iType, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(iType, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(iType, "org.joda.time.PeriodType", "cStandard", iType);
            PeriodType cYears = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cYears, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cYears, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cYears, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cYears, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cYears, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cYears, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cYears, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cYears, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cYears, "org.joda.time.PeriodType", "cYears", cYears);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cWeeks, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cWeeks, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cWeeks, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cWeeks, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cWeeks, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cWeeks, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cWeeks, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cWeeks, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cDays, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cDays, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cDays, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cDays, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cDays, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cDays, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cDays, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cDays, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cDays, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cDays, "org.joda.time.PeriodType", "cDays", cDays);
            PeriodType cHours = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cHours, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cHours, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cHours, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cHours, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cHours, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cHours, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cHours, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cHours, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cHours, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cHours, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cHours, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cHours, "org.joda.time.PeriodType", "cHours", cHours);
            PeriodType cMinutes = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMinutes, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cMinutes, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cMinutes, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cMinutes, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cMinutes, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cMinutes, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cMinutes, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cMinutes, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cMinutes, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cMinutes, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cMinutes, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cMinutes, "org.joda.time.PeriodType", "cHours", cHours);
            setField(cMinutes, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            PeriodType cSeconds = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMinutes, "org.joda.time.PeriodType", "cSeconds", cSeconds);
            String iName = "Minutes";
            setField(cMinutes, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cMinutes, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, -1, -1, -1, 0, -1, -1};
            setField(cMinutes, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(cHours, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            PeriodType cSeconds1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cSeconds1, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cSeconds1, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cSeconds1, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cSeconds1, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cSeconds1, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cSeconds1, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cSeconds1, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cSeconds1, "org.joda.time.PeriodType", "cStandard", iType);
            setField(cSeconds1, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cSeconds1, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cSeconds1, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cSeconds1, "org.joda.time.PeriodType", "cHours", cHours);
            setField(cSeconds1, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            setField(cSeconds1, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName1 = "Seconds";
            setField(cSeconds1, "org.joda.time.PeriodType", "iName", iName1);
            org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
            setField(cSeconds1, "org.joda.time.PeriodType", "iTypes", iTypes1);
            int[] iIndices1 = {-1, -1, -1, -1, -1, -1, 0, -1};
            setField(cSeconds1, "org.joda.time.PeriodType", "iIndices", iIndices1);
            setField(cHours, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName2 = "Hours";
            setField(cHours, "org.joda.time.PeriodType", "iName", iName2);
            org.joda.time.DurationFieldType[] iTypes2 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes2[0] = ((DurationFieldType) standardDurationFieldType2);
            setField(cHours, "org.joda.time.PeriodType", "iTypes", iTypes2);
            int[] iIndices2 = {-1, -1, -1, -1, 0, -1, -1, -1};
            setField(cHours, "org.joda.time.PeriodType", "iIndices", iIndices2);
            setField(cDays, "org.joda.time.PeriodType", "cHours", cHours);
            setField(cDays, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            setField(cDays, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName3 = "Days";
            setField(cDays, "org.joda.time.PeriodType", "iName", iName3);
            org.joda.time.DurationFieldType[] iTypes3 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName4 = "days";
            setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName4);
            iTypes3[0] = ((DurationFieldType) standardDurationFieldType3);
            setField(cDays, "org.joda.time.PeriodType", "iTypes", iTypes3);
            int[] iIndices3 = {-1, -1, -1, 0, -1, -1, -1, -1};
            setField(cDays, "org.joda.time.PeriodType", "iIndices", iIndices3);
            setField(cWeeks, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cWeeks, "org.joda.time.PeriodType", "cHours", cHours);
            setField(cWeeks, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            setField(cWeeks, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName5 = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName5);
            org.joda.time.DurationFieldType[] iTypes4 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName6 = "weeks";
            setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName6);
            iTypes4[0] = ((DurationFieldType) standardDurationFieldType4);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes4);
            int[] iIndices4 = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices4);
            setField(cYears, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cYears, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cYears, "org.joda.time.PeriodType", "cHours", cHours);
            setField(cYears, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            setField(cYears, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName7 = "Years";
            setField(cYears, "org.joda.time.PeriodType", "iName", iName7);
            org.joda.time.DurationFieldType[] iTypes5 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName8 = "years";
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName8);
            iTypes5[0] = ((DurationFieldType) standardDurationFieldType5);
            setField(cYears, "org.joda.time.PeriodType", "iTypes", iTypes5);
            int[] iIndices5 = {0, -1, -1, -1, -1, -1, -1, -1};
            setField(cYears, "org.joda.time.PeriodType", "iIndices", iIndices5);
            setField(iType, "org.joda.time.PeriodType", "cYears", cYears);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(iType, "org.joda.time.PeriodType", "cDays", cDays);
            setField(iType, "org.joda.time.PeriodType", "cHours", cHours);
            setField(iType, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            setField(iType, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName9 = "Standard";
            setField(iType, "org.joda.time.PeriodType", "iName", iName9);
            org.joda.time.DurationFieldType[] iTypes6 = new org.joda.time.DurationFieldType[8];
            iTypes6[0] = ((DurationFieldType) standardDurationFieldType5);
            Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName10 = "months";
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName10);
            iTypes6[1] = ((DurationFieldType) standardDurationFieldType6);
            iTypes6[2] = ((DurationFieldType) standardDurationFieldType4);
            iTypes6[3] = ((DurationFieldType) standardDurationFieldType3);
            Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName11 = "hours";
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName11);
            iTypes6[4] = ((DurationFieldType) standardDurationFieldType7);
            Object standardDurationFieldType8 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType8, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName12 = "minutes";
            setField(standardDurationFieldType8, "org.joda.time.DurationFieldType", "iName", iName12);
            iTypes6[5] = ((DurationFieldType) standardDurationFieldType8);
            Object standardDurationFieldType9 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType9, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName13 = "seconds";
            setField(standardDurationFieldType9, "org.joda.time.DurationFieldType", "iName", iName13);
            iTypes6[6] = ((DurationFieldType) standardDurationFieldType9);
            Object standardDurationFieldType10 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType10, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName14 = "millis";
            setField(standardDurationFieldType10, "org.joda.time.DurationFieldType", "iName", iName14);
            iTypes6[7] = ((DurationFieldType) standardDurationFieldType10);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes6);
            int[] iIndices6 = {0, 1, 2, 3, 4, 5, 6, 7};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices6);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toMutablePeriod()
    
    @Test
    public void testToMutablePeriod2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Years years = ((Years) createInstance("org.joda.time.Years"));
            
            /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.toMutablePeriod] produces [java.lang.NullPointerException]
                org.joda.time.PeriodType.size(PeriodType.java:617)
                org.joda.time.base.AbstractPeriod.size(AbstractPeriod.java:56)
                org.joda.time.chrono.BaseChronology.get(BaseChronology.java:276)
                org.joda.time.base.BasePeriod.<init>(BasePeriod.java:258)
                org.joda.time.MutablePeriod.<init>(MutablePeriod.java:93)
                org.joda.time.base.BaseSingleFieldPeriod.toMutablePeriod(BaseSingleFieldPeriod.java:284) */
            years.toMutablePeriod();
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.toPeriod
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toPeriod()
    
    @Test
    public void testToPeriod1() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Years years = ((Years) createInstance("org.joda.time.Years"));
            
            Period actual = years.toPeriod();
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(iType, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(iType, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(iType, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(iType, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(iType, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(iType, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(iType, "org.joda.time.PeriodType", "cStandard", cStandard);
            PeriodType cYears = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cYears, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cYears, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cYears, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cYears, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cYears, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cYears, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cYears, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cYears, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cYears, "org.joda.time.PeriodType", "cYears", cYears);
            PeriodType cMonths = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMonths, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cMonths, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cMonths, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cMonths, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cMonths, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cMonths, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cMonths, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cMonths, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cMonths, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cMonths, "org.joda.time.PeriodType", "cMonths", cMonths);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cWeeks, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cWeeks, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cWeeks, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cWeeks, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cWeeks, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cWeeks, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cWeeks, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cWeeks, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cWeeks, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cDays, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cDays, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cDays, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cDays, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cDays, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cDays, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cDays, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cDays, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cDays, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cDays, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cDays, "org.joda.time.PeriodType", "cDays", cDays);
            PeriodType cHours = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "cHours", cHours);
            PeriodType cMinutes = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            PeriodType cSeconds = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "cSeconds", cSeconds);
            String iName = "Days";
            setField(cDays, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cDays, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, -1, 0, -1, -1, -1, -1};
            setField(cDays, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(cWeeks, "org.joda.time.PeriodType", "cDays", cDays);
            PeriodType cHours1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cHours1, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cHours1, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cHours1, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cHours1, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cHours1, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cHours1, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cHours1, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cHours1, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cHours1, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cHours1, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cHours1, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cHours1, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cHours1, "org.joda.time.PeriodType", "cHours", cHours1);
            PeriodType cMinutes1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cHours1, "org.joda.time.PeriodType", "cMinutes", cMinutes1);
            PeriodType cSeconds1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cHours1, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName1 = "Hours";
            setField(cHours1, "org.joda.time.PeriodType", "iName", iName1);
            org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
            setField(cHours1, "org.joda.time.PeriodType", "iTypes", iTypes1);
            int[] iIndices1 = {-1, -1, -1, -1, 0, -1, -1, -1};
            setField(cHours1, "org.joda.time.PeriodType", "iIndices", iIndices1);
            setField(cWeeks, "org.joda.time.PeriodType", "cHours", cHours1);
            PeriodType cMinutes2 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMinutes2, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cMinutes2, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cMinutes2, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cMinutes2, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cMinutes2, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cMinutes2, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cMinutes2, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cMinutes2, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cMinutes2, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cMinutes2, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cMinutes2, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cMinutes2, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cMinutes2, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cMinutes2, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            PeriodType cSeconds2 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMinutes2, "org.joda.time.PeriodType", "cSeconds", cSeconds2);
            String iName2 = "Minutes";
            setField(cMinutes2, "org.joda.time.PeriodType", "iName", iName2);
            org.joda.time.DurationFieldType[] iTypes2 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes2[0] = ((DurationFieldType) standardDurationFieldType2);
            setField(cMinutes2, "org.joda.time.PeriodType", "iTypes", iTypes2);
            int[] iIndices2 = {-1, -1, -1, -1, -1, 0, -1, -1};
            setField(cMinutes2, "org.joda.time.PeriodType", "iIndices", iIndices2);
            setField(cWeeks, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            PeriodType cSeconds3 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cSeconds3, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cSeconds3, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cSeconds3, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cSeconds3, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cSeconds3, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cSeconds3, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cSeconds3, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cSeconds3, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cSeconds3, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cSeconds3, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cSeconds3, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cSeconds3, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cSeconds3, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cSeconds3, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(cSeconds3, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName3 = "Seconds";
            setField(cSeconds3, "org.joda.time.PeriodType", "iName", iName3);
            org.joda.time.DurationFieldType[] iTypes3 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes3[0] = ((DurationFieldType) standardDurationFieldType3);
            setField(cSeconds3, "org.joda.time.PeriodType", "iTypes", iTypes3);
            int[] iIndices3 = {-1, -1, -1, -1, -1, -1, 0, -1};
            setField(cSeconds3, "org.joda.time.PeriodType", "iIndices", iIndices3);
            setField(cWeeks, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName4 = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName4);
            org.joda.time.DurationFieldType[] iTypes4 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes4[0] = ((DurationFieldType) standardDurationFieldType4);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes4);
            int[] iIndices4 = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices4);
            setField(cMonths, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cMonths, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cMonths, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cMonths, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(cMonths, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName5 = "Months";
            setField(cMonths, "org.joda.time.PeriodType", "iName", iName5);
            org.joda.time.DurationFieldType[] iTypes5 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName6 = "months";
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
            iTypes5[0] = ((DurationFieldType) standardDurationFieldType5);
            setField(cMonths, "org.joda.time.PeriodType", "iTypes", iTypes5);
            int[] iIndices5 = {-1, 0, -1, -1, -1, -1, -1, -1};
            setField(cMonths, "org.joda.time.PeriodType", "iIndices", iIndices5);
            setField(cYears, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cYears, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cYears, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cYears, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cYears, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(cYears, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName7 = "Years";
            setField(cYears, "org.joda.time.PeriodType", "iName", iName7);
            org.joda.time.DurationFieldType[] iTypes6 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName8 = "years";
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName8);
            iTypes6[0] = ((DurationFieldType) standardDurationFieldType6);
            setField(cYears, "org.joda.time.PeriodType", "iTypes", iTypes6);
            int[] iIndices6 = {0, -1, -1, -1, -1, -1, -1, -1};
            setField(cYears, "org.joda.time.PeriodType", "iIndices", iIndices6);
            setField(iType, "org.joda.time.PeriodType", "cYears", cYears);
            setField(iType, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(iType, "org.joda.time.PeriodType", "cDays", cDays);
            setField(iType, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(iType, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(iType, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName9 = "Standard";
            setField(iType, "org.joda.time.PeriodType", "iName", iName9);
            org.joda.time.DurationFieldType[] iTypes7 = new org.joda.time.DurationFieldType[8];
            iTypes7[0] = ((DurationFieldType) standardDurationFieldType6);
            iTypes7[1] = ((DurationFieldType) standardDurationFieldType5);
            Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName10 = "weeks";
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName10);
            iTypes7[2] = ((DurationFieldType) standardDurationFieldType7);
            Object standardDurationFieldType8 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType8, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName11 = "days";
            setField(standardDurationFieldType8, "org.joda.time.DurationFieldType", "iName", iName11);
            iTypes7[3] = ((DurationFieldType) standardDurationFieldType8);
            Object standardDurationFieldType9 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType9, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName12 = "hours";
            setField(standardDurationFieldType9, "org.joda.time.DurationFieldType", "iName", iName12);
            iTypes7[4] = ((DurationFieldType) standardDurationFieldType9);
            Object standardDurationFieldType10 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType10, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName13 = "minutes";
            setField(standardDurationFieldType10, "org.joda.time.DurationFieldType", "iName", iName13);
            iTypes7[5] = ((DurationFieldType) standardDurationFieldType10);
            Object standardDurationFieldType11 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType11, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName14 = "seconds";
            setField(standardDurationFieldType11, "org.joda.time.DurationFieldType", "iName", iName14);
            iTypes7[6] = ((DurationFieldType) standardDurationFieldType11);
            Object standardDurationFieldType12 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType12, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName15 = "millis";
            setField(standardDurationFieldType12, "org.joda.time.DurationFieldType", "iName", iName15);
            iTypes7[7] = ((DurationFieldType) standardDurationFieldType12);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes7);
            int[] iIndices7 = {0, 1, 2, 3, 4, 5, 6, 7};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices7);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    
    @Test
    public void testToPeriod2() throws Exception  {
        Class periodTypeClazz = Class.forName("org.joda.time.PeriodType");
        PeriodType prevCStandard = ((PeriodType) getStaticFieldValue(periodTypeClazz, "cStandard"));
        try {
            PeriodType cStandard = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setStaticField(periodTypeClazz, "cStandard", cStandard);
            Months months = ((Months) createInstance("org.joda.time.Months"));
            
            Period actual = months.toPeriod();
            
            Period expected = ((Period) createInstance("org.joda.time.Period"));
            PeriodType iType = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(iType, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(iType, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(iType, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(iType, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(iType, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(iType, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(iType, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(iType, "org.joda.time.PeriodType", "cStandard", cStandard);
            PeriodType cYears = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cYears, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cYears, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cYears, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cYears, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cYears, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cYears, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cYears, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cYears, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cYears, "org.joda.time.PeriodType", "cYears", cYears);
            PeriodType cMonths = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMonths, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cMonths, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cMonths, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cMonths, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cMonths, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cMonths, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cMonths, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cMonths, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cMonths, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cMonths, "org.joda.time.PeriodType", "cMonths", cMonths);
            PeriodType cWeeks = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cWeeks, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cWeeks, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cWeeks, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cWeeks, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cWeeks, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cWeeks, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cWeeks, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cWeeks, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cWeeks, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cWeeks, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cWeeks, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            PeriodType cDays = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cDays, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cDays, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cDays, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cDays, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cDays, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cDays, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cDays, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cDays, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cDays, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cDays, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cDays, "org.joda.time.PeriodType", "cDays", cDays);
            PeriodType cHours = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "cHours", cHours);
            PeriodType cMinutes = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "cMinutes", cMinutes);
            PeriodType cSeconds = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cDays, "org.joda.time.PeriodType", "cSeconds", cSeconds);
            String iName = "Days";
            setField(cDays, "org.joda.time.PeriodType", "iName", iName);
            org.joda.time.DurationFieldType[] iTypes = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes[0] = ((DurationFieldType) standardDurationFieldType);
            setField(cDays, "org.joda.time.PeriodType", "iTypes", iTypes);
            int[] iIndices = {-1, -1, -1, 0, -1, -1, -1, -1};
            setField(cDays, "org.joda.time.PeriodType", "iIndices", iIndices);
            setField(cWeeks, "org.joda.time.PeriodType", "cDays", cDays);
            PeriodType cHours1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cHours1, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cHours1, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cHours1, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cHours1, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cHours1, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cHours1, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cHours1, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cHours1, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cHours1, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cHours1, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cHours1, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cHours1, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cHours1, "org.joda.time.PeriodType", "cHours", cHours1);
            PeriodType cMinutes1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cHours1, "org.joda.time.PeriodType", "cMinutes", cMinutes1);
            PeriodType cSeconds1 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cHours1, "org.joda.time.PeriodType", "cSeconds", cSeconds1);
            String iName1 = "Hours";
            setField(cHours1, "org.joda.time.PeriodType", "iName", iName1);
            org.joda.time.DurationFieldType[] iTypes1 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes1[0] = ((DurationFieldType) standardDurationFieldType1);
            setField(cHours1, "org.joda.time.PeriodType", "iTypes", iTypes1);
            int[] iIndices1 = {-1, -1, -1, -1, 0, -1, -1, -1};
            setField(cHours1, "org.joda.time.PeriodType", "iIndices", iIndices1);
            setField(cWeeks, "org.joda.time.PeriodType", "cHours", cHours1);
            PeriodType cMinutes2 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMinutes2, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cMinutes2, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cMinutes2, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cMinutes2, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cMinutes2, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cMinutes2, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cMinutes2, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cMinutes2, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cMinutes2, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cMinutes2, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cMinutes2, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cMinutes2, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cMinutes2, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cMinutes2, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            PeriodType cSeconds2 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cMinutes2, "org.joda.time.PeriodType", "cSeconds", cSeconds2);
            String iName2 = "Minutes";
            setField(cMinutes2, "org.joda.time.PeriodType", "iName", iName2);
            org.joda.time.DurationFieldType[] iTypes2 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes2[0] = ((DurationFieldType) standardDurationFieldType2);
            setField(cMinutes2, "org.joda.time.PeriodType", "iTypes", iTypes2);
            int[] iIndices2 = {-1, -1, -1, -1, -1, 0, -1, -1};
            setField(cMinutes2, "org.joda.time.PeriodType", "iIndices", iIndices2);
            setField(cWeeks, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            PeriodType cSeconds3 = ((PeriodType) createInstance("org.joda.time.PeriodType"));
            setField(cSeconds3, "org.joda.time.PeriodType", "MONTH_INDEX", 1);
            setField(cSeconds3, "org.joda.time.PeriodType", "WEEK_INDEX", 2);
            setField(cSeconds3, "org.joda.time.PeriodType", "DAY_INDEX", 3);
            setField(cSeconds3, "org.joda.time.PeriodType", "HOUR_INDEX", 4);
            setField(cSeconds3, "org.joda.time.PeriodType", "MINUTE_INDEX", 5);
            setField(cSeconds3, "org.joda.time.PeriodType", "SECOND_INDEX", 6);
            setField(cSeconds3, "org.joda.time.PeriodType", "MILLI_INDEX", 7);
            setField(cSeconds3, "org.joda.time.PeriodType", "cStandard", cStandard);
            setField(cSeconds3, "org.joda.time.PeriodType", "cYears", cYears);
            setField(cSeconds3, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cSeconds3, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cSeconds3, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cSeconds3, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cSeconds3, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(cSeconds3, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName3 = "Seconds";
            setField(cSeconds3, "org.joda.time.PeriodType", "iName", iName3);
            org.joda.time.DurationFieldType[] iTypes3 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes3[0] = ((DurationFieldType) standardDurationFieldType3);
            setField(cSeconds3, "org.joda.time.PeriodType", "iTypes", iTypes3);
            int[] iIndices3 = {-1, -1, -1, -1, -1, -1, 0, -1};
            setField(cSeconds3, "org.joda.time.PeriodType", "iIndices", iIndices3);
            setField(cWeeks, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName4 = "Weeks";
            setField(cWeeks, "org.joda.time.PeriodType", "iName", iName4);
            org.joda.time.DurationFieldType[] iTypes4 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            iTypes4[0] = ((DurationFieldType) standardDurationFieldType4);
            setField(cWeeks, "org.joda.time.PeriodType", "iTypes", iTypes4);
            int[] iIndices4 = {-1, -1, 0, -1, -1, -1, -1, -1};
            setField(cWeeks, "org.joda.time.PeriodType", "iIndices", iIndices4);
            setField(cMonths, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cMonths, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cMonths, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cMonths, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(cMonths, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName5 = "Months";
            setField(cMonths, "org.joda.time.PeriodType", "iName", iName5);
            org.joda.time.DurationFieldType[] iTypes5 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
            String iName6 = "months";
            setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName6);
            iTypes5[0] = ((DurationFieldType) standardDurationFieldType5);
            setField(cMonths, "org.joda.time.PeriodType", "iTypes", iTypes5);
            int[] iIndices5 = {-1, 0, -1, -1, -1, -1, -1, -1};
            setField(cMonths, "org.joda.time.PeriodType", "iIndices", iIndices5);
            setField(cYears, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(cYears, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(cYears, "org.joda.time.PeriodType", "cDays", cDays);
            setField(cYears, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(cYears, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(cYears, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName7 = "Years";
            setField(cYears, "org.joda.time.PeriodType", "iName", iName7);
            org.joda.time.DurationFieldType[] iTypes6 = new org.joda.time.DurationFieldType[1];
            Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
            String iName8 = "years";
            setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName8);
            iTypes6[0] = ((DurationFieldType) standardDurationFieldType6);
            setField(cYears, "org.joda.time.PeriodType", "iTypes", iTypes6);
            int[] iIndices6 = {0, -1, -1, -1, -1, -1, -1, -1};
            setField(cYears, "org.joda.time.PeriodType", "iIndices", iIndices6);
            setField(iType, "org.joda.time.PeriodType", "cYears", cYears);
            setField(iType, "org.joda.time.PeriodType", "cMonths", cMonths);
            setField(iType, "org.joda.time.PeriodType", "cWeeks", cWeeks);
            setField(iType, "org.joda.time.PeriodType", "cDays", cDays);
            setField(iType, "org.joda.time.PeriodType", "cHours", cHours1);
            setField(iType, "org.joda.time.PeriodType", "cMinutes", cMinutes2);
            setField(iType, "org.joda.time.PeriodType", "cSeconds", cSeconds3);
            String iName9 = "Standard";
            setField(iType, "org.joda.time.PeriodType", "iName", iName9);
            org.joda.time.DurationFieldType[] iTypes7 = new org.joda.time.DurationFieldType[8];
            iTypes7[0] = ((DurationFieldType) standardDurationFieldType6);
            iTypes7[1] = ((DurationFieldType) standardDurationFieldType5);
            Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
            String iName10 = "weeks";
            setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName10);
            iTypes7[2] = ((DurationFieldType) standardDurationFieldType7);
            Object standardDurationFieldType8 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType8, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
            String iName11 = "days";
            setField(standardDurationFieldType8, "org.joda.time.DurationFieldType", "iName", iName11);
            iTypes7[3] = ((DurationFieldType) standardDurationFieldType8);
            Object standardDurationFieldType9 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType9, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
            String iName12 = "hours";
            setField(standardDurationFieldType9, "org.joda.time.DurationFieldType", "iName", iName12);
            iTypes7[4] = ((DurationFieldType) standardDurationFieldType9);
            Object standardDurationFieldType10 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType10, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
            String iName13 = "minutes";
            setField(standardDurationFieldType10, "org.joda.time.DurationFieldType", "iName", iName13);
            iTypes7[5] = ((DurationFieldType) standardDurationFieldType10);
            Object standardDurationFieldType11 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType11, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
            String iName14 = "seconds";
            setField(standardDurationFieldType11, "org.joda.time.DurationFieldType", "iName", iName14);
            iTypes7[6] = ((DurationFieldType) standardDurationFieldType11);
            Object standardDurationFieldType12 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
            setField(standardDurationFieldType12, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
            String iName15 = "millis";
            setField(standardDurationFieldType12, "org.joda.time.DurationFieldType", "iName", iName15);
            iTypes7[7] = ((DurationFieldType) standardDurationFieldType12);
            setField(iType, "org.joda.time.PeriodType", "iTypes", iTypes7);
            int[] iIndices7 = {0, 1, 2, 3, 4, 5, 6, 7};
            setField(iType, "org.joda.time.PeriodType", "iIndices", iIndices7);
            setField(expected, "org.joda.time.base.BasePeriod", "iType", iType);
            int[] iValues = {0, 0, 0, 0, 0, 0, 0, 0};
            setField(expected, "org.joda.time.base.BasePeriod", "iValues", iValues);
            
            PeriodType expectedIType = ((PeriodType) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iType"));
            PeriodType actualIType = ((PeriodType) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iType"));
            // org.joda.time.PeriodType has overridden equals method
            assertEquals(expectedIType, actualIType);
            
            int[] expectedIValues = ((int[]) getFieldValue(expected, "org.joda.time.base.BasePeriod", "iValues"));
            int[] actualIValues = ((int[]) getFieldValue(actual, "org.joda.time.base.BasePeriod", "iValues"));
            int expectedIValuesSize = expectedIValues.length;
            assertEquals(expectedIValuesSize, actualIValues.length);
            assertArrayEquals(expectedIValues, actualIValues);
            
        } finally {
            setStaticField(PeriodType.class, "cStandard", prevCStandard);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method standardPeriodIn(org.joda.time.ReadablePeriod, long)
    
    /**
    @utbot.classUnderTest {@link BaseSingleFieldPeriod}
 * @utbot.methodUnderTest {@link org.joda.time.base.BaseSingleFieldPeriod#standardPeriodIn(org.joda.time.ReadablePeriod,long)}
 * @utbot.executesCondition {@code (period == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testStandardPeriodIn_PeriodEqualsNull() {
        int actual = BaseSingleFieldPeriod.standardPeriodIn(null, -255L);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method standardPeriodIn(org.joda.time.ReadablePeriod, long)
    
    @Test
    public void testStandardPeriodIn1() throws Throwable  {
        Years years = ((Years) createInstance("org.joda.time.Years"));
        
        /* This test fails because method [org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(BaseSingleFieldPeriod.java:146) */
        Class baseSingleFieldPeriodClazz = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class yearsType = Class.forName("org.joda.time.ReadablePeriod");
        Class longType = long.class;
        Method standardPeriodInMethod = baseSingleFieldPeriodClazz.getDeclaredMethod("standardPeriodIn", yearsType, longType);
        standardPeriodInMethod.setAccessible(true);
        java.lang.Object[] standardPeriodInMethodArguments = new java.lang.Object[2];
        standardPeriodInMethodArguments[0] = years;
        standardPeriodInMethodArguments[1] = 0L;
        try {
            standardPeriodInMethod.invoke(null, standardPeriodInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1052099641719700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1052099641719700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1052099641727899 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1052099641719700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1052099641727899).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1052099644372799 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1052099644372799.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1052099644375999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1052099644372799.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1052099644375999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1052099644638200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1052099644638200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1052099644641700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1052099644638200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1052099644641700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1052099645452900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1052099645452900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1052099645458200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1052099645452900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1052099645458200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

