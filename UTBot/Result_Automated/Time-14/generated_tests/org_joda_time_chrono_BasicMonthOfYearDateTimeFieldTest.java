package org.joda.time.chrono;

import org.junit.Test;
import org.joda.time.chrono.IslamicChronology.LeapYearPatternType;
import org.joda.time.LocalDateTime;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.LocalDate;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.YearMonthDay;
import org.joda.time.field.DelegatedDurationField;
import java.lang.reflect.Method;
import org.joda.time.DurationField;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_joda_time_chrono_BasicMonthOfYearDateTimeFieldTest {
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(long, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,int)}
 * @utbot.executesCondition {@code (months == 0): True}
 * @utbot.returnsFrom {@code return instant;}
 *  */
    @Test
    public void testAdd_MonthsEqualsZero() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        long actual = basicMonthOfYearDateTimeField.add(-255L, 0);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(long, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,int)}
 * @utbot.executesCondition {@code (monthToUse >= 0): False}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#getMillisOfDay(long)}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#getYear(long)}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#getMonthOfYear(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: yearToUse = thisYear + (monthToUse / iMax) - 1;
 *  */
    @Test
    public void testAdd_ThrowArithmeticException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 251658241);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 7705048257652451192L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:117) */
        basicMonthOfYearDateTimeField.add(7705048288292128258L, -12);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long timePart = iChronology.getMillisOfDay(instant);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:98) */
        basicMonthOfYearDateTimeField.add(-255L, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(long, int)
    
    @Test
    public void testAdd1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 20);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 687 out of bounds for length 20]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104) */
        basicMonthOfYearDateTimeField.add(950420667027976L, 4);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 33554434);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 40);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[27] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114) */
        basicMonthOfYearDateTimeField.add(73353530098328424L, 32);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 30);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 369 out of bounds for length 30]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104) */
        basicMonthOfYearDateTimeField.add(1500574060019118096L, 64);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:117) */
        basicMonthOfYearDateTimeField.add(7705048276934353573L, Integer.MIN_VALUE);
    }
    
    @Test
    public void testAdd5() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 22531);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -2968034139838541632L);
        iYearInfoCache[3] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114) */
        basicMonthOfYearDateTimeField.add(647285799776480L, 8192);
    }
    
    @Test
    public void testAdd6() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 33554442);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114) */
        basicMonthOfYearDateTimeField.add(-8668270485816605598L, 524288);
    }
    
    @Test
    public void testAdd7() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 131080);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 38);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114) */
        basicMonthOfYearDateTimeField.add(-3455951996248318975L, 524288);
    }
    
    @Test
    public void testAdd8() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 536870920);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 34);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -283453409);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 0L);
        iYearInfoCache[31] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114) */
        basicMonthOfYearDateTimeField.add(-8678614975072302079L, 32768);
    }
    
    @Test
    public void testAdd9() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 13);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114) */
        basicMonthOfYearDateTimeField.add(-42521591394304L, 32);
    }
    
    @Test
    public void testAdd10() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114) */
        basicMonthOfYearDateTimeField.add(-7288307033543572479L, 128);
    }
    
    @Test
    public void testAdd11() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 30);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -261380069);
        iYearInfoCache[27] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:117) */
        basicMonthOfYearDateTimeField.add(-8002790216586605567L, 512);
    }
    
    @Test
    public void testAdd12() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:103) */
        basicMonthOfYearDateTimeField.add(-9223372036854775807L, 64);
    }
    
    @Test
    public void testAdd13() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        CopticChronology iChronology = ((CopticChronology) createInstance("org.joda.time.chrono.CopticChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:103) */
        basicMonthOfYearDateTimeField.add(0L, 1);
    }
    
    @Test
    public void testAdd14() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        CopticChronology iChronology = ((CopticChronology) createInstance("org.joda.time.chrono.CopticChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:103) */
        basicMonthOfYearDateTimeField.add(-9223372036854775807L, 1);
    }
    
    @Test
    public void testAdd15() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104) */
        basicMonthOfYearDateTimeField.add(56526393483040768L, 1048576);
    }
    
    @Test
    public void testAdd16() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104) */
        basicMonthOfYearDateTimeField.add(0L, 1);
    }
    
    @Test
    public void testAdd17() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 33554442);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104) */
        basicMonthOfYearDateTimeField.add(-39582418599928L, 16384);
    }
    
    @Test
    public void testAdd18() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104) */
        basicMonthOfYearDateTimeField.add(-35180077121520L, 4096);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(long, int)
    
    @Test(expected = ArithmeticException.class)
    public void testAdd19() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 10);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 269895691);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 4923662791228243968L);
        iYearInfoCache[11] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        basicMonthOfYearDateTimeField.add(8263429391249772544L, 2147483636);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd20() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 10);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 34);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -301246439);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 6996843317479747072L);
        iYearInfoCache[25] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        basicMonthOfYearDateTimeField.add(9223354394324516872L, -12);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd21() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 29);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.add(9223354915139632418L, 256);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd22() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 29);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[25] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.add(9223354397815360789L, 536870912);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd23() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.add(8971234172486445313L, 134217728);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd24() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 26);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[0] = yearInfo;
        iYearInfoCache[1] = yearInfo;
        iYearInfoCache[2] = yearInfo;
        iYearInfoCache[3] = yearInfo;
        iYearInfoCache[4] = yearInfo;
        iYearInfoCache[5] = yearInfo;
        iYearInfoCache[6] = yearInfo;
        iYearInfoCache[7] = yearInfo;
        iYearInfoCache[8] = yearInfo;
        iYearInfoCache[9] = yearInfo;
        iYearInfoCache[10] = yearInfo;
        iYearInfoCache[11] = yearInfo;
        iYearInfoCache[12] = yearInfo;
        iYearInfoCache[13] = yearInfo;
        iYearInfoCache[14] = yearInfo;
        iYearInfoCache[15] = yearInfo;
        iYearInfoCache[16] = yearInfo;
        iYearInfoCache[17] = yearInfo;
        iYearInfoCache[18] = yearInfo;
        iYearInfoCache[19] = yearInfo;
        iYearInfoCache[20] = yearInfo;
        iYearInfoCache[21] = yearInfo;
        iYearInfoCache[22] = yearInfo;
        iYearInfoCache[23] = yearInfo;
        iYearInfoCache[24] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.add(9223354857986142208L, 1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd25() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 26);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[25] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.add(9223354242411274240L, 1073741824);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd26() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 30);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[25] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.add(8948755276967171593L, 512);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testAdd27() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 269895691);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 4923662791228243968L);
        iYearInfoCache[11] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        basicMonthOfYearDateTimeField.add(8263429391249772544L, 2147483636);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(long, long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,long)}
 * @utbot.executesCondition {@code (i_months == months): True}
 * @utbot.invokes {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,int)}
 * @utbot.returnsFrom {@code return add(instant, i_months);}
 *  */
    @Test
    public void testAdd_I_monthsEqualsMonths() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        long actual = basicMonthOfYearDateTimeField.add(1L, 0L);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(long, long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,long)}
 * @utbot.executesCondition {@code (i_months == months): True}
 * @utbot.invokes {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add(instant, i_months);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 2);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 197 out of bounds for length 2]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(-3386188651382288384L, 1L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(long,long)}
 * @utbot.executesCondition {@code (i_months == months): False}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#getMillisOfDay(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long timePart = iChronology.getMillisOfDay(instant);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:158) */
        basicMonthOfYearDateTimeField.add(0L, 2147483648L);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(long, long)
    
    @Test
    public void testAdd28() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 21);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -2211839);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -67763677817798788L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1024);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object initialBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        
        long actual = basicMonthOfYearDateTimeField.add(-67763647202836479L, -12L);
        
        assertEquals(-67760436233236479L, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology9 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology9, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache, 9);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology10 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology10, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10 = get(basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache, 10);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology11 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology11, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11 = get(basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache, 11);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology12 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology12, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12 = get(basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache, 12);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology13 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology13, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13 = get(basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache, 13);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology14 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology14, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14 = get(basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache, 14);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology15 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology15, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15 = get(basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache, 15);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology16 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology16, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16 = get(basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache, 16);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology17 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology17, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17 = get(basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache, 17);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology18 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology18, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18 = get(basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache, 18);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology19 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology19, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19 = get(basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache, 19);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology20 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology20, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20 = get(basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache, 20);
        
        assertFalse(initialBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 == finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(long, long)
    
    @Test
    public void testAdd29() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8714);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(-4460661819270363046L, 524288L);
    }
    
    @Test
    public void testAdd30() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2097162);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:117)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(-4950758257218728918L, 4L);
    }
    
    @Test
    public void testAdd31() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 21);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -2211839);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -67763677817798788L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:117)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(-67763647202836479L, -12L);
    }
    
    @Test
    public void testAdd32() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[3] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(41561797875664081L, 4L);
    }
    
    @Test
    public void testAdd33() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 14);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(1024669465686996318L, 536870912L);
    }
    
    @Test
    public void testAdd34() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 26);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -301246439);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 0L);
        iYearInfoCache[25] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:117)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(9223354388287213568L, 8192L);
    }
    
    @Test
    public void testAdd35() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 183290881);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -5413214916341571841L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:114)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(5611825700437787393L, 2048L);
    }
    
    @Test
    public void testAdd36() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 33);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[31] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:166) */
        basicMonthOfYearDateTimeField.add(-41601563078271L, 2147483648L);
    }
    
    @Test
    public void testAdd37() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 34);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:169) */
        basicMonthOfYearDateTimeField.add(-1570562084161844247L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd38() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:169) */
        basicMonthOfYearDateTimeField.add(-42564539040776L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd39() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 12);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:169) */
        basicMonthOfYearDateTimeField.add(963093838915132225L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd40() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", Integer.MIN_VALUE);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 22);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:169) */
        basicMonthOfYearDateTimeField.add(72506680614018629L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd41() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 38);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        iYearInfoCache[0] = yearInfo;
        iYearInfoCache[1] = yearInfo;
        iYearInfoCache[2] = yearInfo;
        iYearInfoCache[3] = yearInfo;
        iYearInfoCache[4] = yearInfo;
        iYearInfoCache[5] = yearInfo;
        iYearInfoCache[6] = yearInfo;
        iYearInfoCache[7] = yearInfo;
        iYearInfoCache[8] = yearInfo;
        iYearInfoCache[9] = yearInfo;
        iYearInfoCache[10] = yearInfo;
        iYearInfoCache[11] = yearInfo;
        iYearInfoCache[12] = yearInfo;
        iYearInfoCache[13] = yearInfo;
        iYearInfoCache[14] = yearInfo;
        iYearInfoCache[15] = yearInfo;
        iYearInfoCache[16] = yearInfo;
        iYearInfoCache[17] = yearInfo;
        iYearInfoCache[18] = yearInfo;
        iYearInfoCache[19] = yearInfo;
        iYearInfoCache[20] = yearInfo;
        iYearInfoCache[21] = yearInfo;
        iYearInfoCache[22] = yearInfo;
        iYearInfoCache[23] = yearInfo;
        iYearInfoCache[24] = yearInfo;
        iYearInfoCache[25] = yearInfo;
        iYearInfoCache[26] = yearInfo;
        iYearInfoCache[27] = yearInfo;
        iYearInfoCache[28] = yearInfo;
        Object yearInfo1 = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo1, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 8221);
        setField(yearInfo1, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 0L);
        iYearInfoCache[29] = yearInfo1;
        iYearInfoCache[30] = yearInfo;
        iYearInfoCache[31] = yearInfo;
        iYearInfoCache[32] = yearInfo;
        iYearInfoCache[33] = yearInfo;
        iYearInfoCache[34] = yearInfo;
        iYearInfoCache[35] = yearInfo;
        iYearInfoCache[36] = yearInfo;
        iYearInfoCache[37] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArithmeticException: / by zero]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:166) */
        basicMonthOfYearDateTimeField.add(209172086299829L, 2147483648L);
    }
    
    @Test
    public void testAdd42() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        CopticChronology iChronology = ((CopticChronology) createInstance("org.joda.time.chrono.CopticChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:160) */
        basicMonthOfYearDateTimeField.add(-9223372036854775807L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd43() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        CopticChronology iChronology = ((CopticChronology) createInstance("org.joda.time.chrono.CopticChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:160) */
        basicMonthOfYearDateTimeField.add(0L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd44() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        JulianChronology iChronology = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:103)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(-9223372036854775807L, 1L);
    }
    
    @Test
    public void testAdd45() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:103)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(0L, 1L);
    }
    
    @Test
    public void testAdd46() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(-27480583909375L, 8192L);
    }
    
    @Test
    public void testAdd47() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:104)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(428515932540932L, 64L);
    }
    
    @Test
    public void testAdd48() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:161) */
        basicMonthOfYearDateTimeField.add(-42424343271296L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd49() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:161) */
        basicMonthOfYearDateTimeField.add(271180350280667136L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd50() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:161) */
        basicMonthOfYearDateTimeField.add(0L, -9223372034707292160L);
    }
    
    @Test
    public void testAdd51() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:103)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:153) */
        basicMonthOfYearDateTimeField.add(-62167195439999L, 1L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.joda.time.ReadablePartial, int, [I, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(org.joda.time.ReadablePartial,int,int[],int)}
 * @utbot.executesCondition {@code (valueToAdd == 0): True}
 * @utbot.returnsFrom {@code return values;}
 *  */
    @Test
    public void testAdd_ValueToAddEqualsZero() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        int[] actual = basicMonthOfYearDateTimeField.add(null, -255, null, 0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.joda.time.ReadablePartial, int, [I, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(org.joda.time.ReadablePartial,int,int[],int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: DateTimeUtils.isContiguous(partial)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        basicMonthOfYearDateTimeField.add(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(org.joda.time.ReadablePartial,int,int[],int)}
 * @utbot.invokes {@link org.joda.time.field.ImpreciseDateTimeField#add(org.joda.time.ReadablePartial,int,int[],int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return super.add(partial, fieldIndex, values, valueToAdd);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        Object iMonthOfYear = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iMonthOfYear, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType1);
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {1, -255};
        
        basicMonthOfYearDateTimeField.add(localDateTime, 0, intArray, -1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.joda.time.ReadablePartial, int, [I, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(org.joda.time.ReadablePartial,int,int[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.add(partial, fieldIndex, values, valueToAdd);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", -252);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        DelegatedDateTimeField iMonthOfYear = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType1);
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {-255, -255};
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:308)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 129, intArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#add(org.joda.time.ReadablePartial,int,int[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.add(partial, fieldIndex, values, valueToAdd);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        DelegatedDateTimeField iMonthOfYear = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iRangeField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType1);
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {-255, -255};
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:329)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 129, intArray, -1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.joda.time.ReadablePartial, int, [I, int)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAdd52() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        Object iField1 = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        MillisDurationField iRangeField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField1, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        SkipDateTimeField iYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField2 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        UnsupportedDateTimeField iField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = new int[16];
        
        basicMonthOfYearDateTimeField.add(localDateTime, 0, intArray, 32768);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.joda.time.ReadablePartial, int, [I, int)
    
    @Test(expected = StackOverflowError.class)
    public void testAdd53() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipUndoDateTimeField iField = ((SkipUndoDateTimeField) createInstance("org.joda.time.field.SkipUndoDateTimeField"));
        SkipDateTimeField iField1 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        StrictDateTimeField iField2 = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        StrictDateTimeField iField3 = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        SkipDateTimeField iField4 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        LenientDateTimeField iField5 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        DelegatedDateTimeField iField6 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        setField(iField6, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iField5, "org.joda.time.field.DelegatedDateTimeField", "iField", iField6);
        setField(iField4, "org.joda.time.field.DelegatedDateTimeField", "iField", iField5);
        setField(iField3, "org.joda.time.field.DelegatedDateTimeField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        basicMonthOfYearDateTimeField.add(localDate, 0, intArray, 1);
    }
    
    @Test
    public void testAdd54() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        BaseChronology iChronology = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:341)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, intArray, 1);
    }
    
    @Test
    public void testAdd55() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        YearMonthDay yearMonthDay = ((YearMonthDay) createInstance("org.joda.time.YearMonthDay"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.YearMonthDay.getField(YearMonthDay.java:333)
            org.joda.time.base.AbstractPartial.getField(AbstractPartial.java:105)
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:339)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(yearMonthDay, 0, null, 1);
    }
    
    @Test
    public void testAdd56() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        UnsupportedDateTimeField iField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        MillisDurationField iDurationField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:341)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, null, 8);
    }
    
    @Test
    public void testAdd57() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        UnsupportedDateTimeField iField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iMonthOfYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:341)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, intArray, 33554432);
    }
    
    @Test
    public void testAdd58() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        PreciseDateTimeField iMonthOfYear = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iMonthOfYear, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iRangeField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {0};
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:345)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, intArray, 4);
    }
    
    @Test
    public void testAdd59() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField1 = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        UnsupportedDateTimeField iField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        MillisDurationField iDurationField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
        int[] intArray = new int[16];
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:341)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDate, 0, intArray, 67108864);
    }
    
    @Test
    public void testAdd60() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        LenientChronology iChronology = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        UnsupportedDateTimeField iField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iField1);
        setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:341)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDate, 0, intArray, 4);
    }
    
    @Test
    public void testAdd61() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        PreciseDateTimeField iMonthOfYear = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iMonthOfYear, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {
            4, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.IllegalFieldValueException.<init>(IllegalFieldValueException.java:108)
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:220)
            org.joda.time.field.BaseDateTimeField.set(BaseDateTimeField.java:585)
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:348)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, intArray, -3);
    }
    
    @Test
    public void testAdd62() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", Integer.MIN_VALUE);
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        ISOChronology iChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = new int[11];
        intArray[0] = 26;
        intArray[1] = 26;
        intArray[3] = 26;
        intArray[4] = 26;
        intArray[5] = 26;
        intArray[6] = 26;
        intArray[7] = 26;
        intArray[8] = 26;
        intArray[9] = 26;
        intArray[10] = 26;
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getRangeDurationField(BasicMonthOfYearDateTimeField.java:310)
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:319)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 2, intArray, 513);
    }
    
    @Test
    public void testAdd63() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = new int[11];
        intArray[0] = 26;
        intArray[1] = 26;
        intArray[2] = 4;
        intArray[3] = 26;
        intArray[4] = 26;
        intArray[5] = 26;
        intArray[6] = 26;
        intArray[7] = 26;
        intArray[8] = 26;
        intArray[9] = 26;
        intArray[10] = 26;
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getRangeDurationField(BasicMonthOfYearDateTimeField.java:310)
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:339)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 2, intArray, -2147483647);
    }
    
    @Test
    public void testAdd64() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        GJChronology iChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        PreciseDateTimeField iField1 = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField1, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iRangeField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:345)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDate, 0, null, 4);
    }
    
    @Test
    public void testAdd65() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        Object iField1 = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField1, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        DelegatedDateTimeField iYear = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        UnsupportedDateTimeField iField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(iField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iRangeField);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:345)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, null, 8192);
    }
    
    @Test
    public void testAdd66() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDate localDate = ((LocalDate) createInstance("org.joda.time.LocalDate"));
        GJChronology iChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        PreciseDateTimeField iField1 = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        MillisDurationField iRangeField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField1, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDate, "org.joda.time.LocalDate", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:308)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDate, 0, null, 8);
    }
    
    @Test
    public void testAdd67() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        PreciseDateTimeField iField = ((PreciseDateTimeField) createInstance("org.joda.time.field.PreciseDateTimeField"));
        MillisDurationField iRangeField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        SkipDateTimeField iYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField1 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        UnsupportedDateTimeField iField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:308)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, null, 16777216);
    }
    
    @Test
    public void testAdd68() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        EthiopicChronology iChronology = ((EthiopicChronology) createInstance("org.joda.time.chrono.EthiopicChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        StrictDateTimeField iField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        DelegatedDateTimeField iYear = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        DelegatedDateTimeField iField1 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        LenientDateTimeField iField2 = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        UnsupportedDateTimeField iField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        DelegatedDurationField iDurationField = ((DelegatedDurationField) createInstance("org.joda.time.field.DelegatedDurationField"));
        setField(iField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iField2, "org.joda.time.field.DelegatedDateTimeField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.field.DelegatedDateTimeField.getRangeDurationField(DelegatedDateTimeField.java:196)
            org.joda.time.field.DelegatedDateTimeField.getRangeDurationField(DelegatedDateTimeField.java:196)
            org.joda.time.DateTimeUtils.isContiguous(DateTimeUtils.java:341)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:210) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, null, 64);
    }
    
    @Test
    public void testAdd69() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        GJChronology iChronology = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        Object iField1 = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField1, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        UnsupportedDateTimeField iYear = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iYear, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:329)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, null, -2147483647);
    }
    
    @Test
    public void testAdd70() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        LocalDateTime localDateTime = ((LocalDateTime) createInstance("org.joda.time.LocalDateTime"));
        CopticChronology iChronology = ((CopticChronology) createInstance("org.joda.time.chrono.CopticChronology"));
        SkipDateTimeField iMonthOfYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        Object iField = createInstance("org.joda.time.chrono.BasicChronology$HalfdayField");
        UnsupportedDurationField iRangeField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField, "org.joda.time.field.PreciseDateTimeField", "iRangeField", iRangeField);
        setField(iMonthOfYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", iMonthOfYear);
        SkipDateTimeField iYear = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DelegatedDateTimeField iField1 = ((DelegatedDateTimeField) createInstance("org.joda.time.field.DelegatedDateTimeField"));
        UnsupportedDateTimeField iField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        UnsupportedDurationField iDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        Object iType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(iDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", iType);
        setField(iField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iDurationField);
        setField(iField1, "org.joda.time.field.DelegatedDateTimeField", "iField", iField2);
        setField(iYear, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(iChronology, "org.joda.time.chrono.AssembledChronology", "iYear", iYear);
        setField(localDateTime, "org.joda.time.LocalDateTime", "iChronology", iChronology);
        int[] intArray = {
            Integer.MIN_VALUE, 26, 26, 26, 26, 26, 26, 26,
            26
        };
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.add] produces [java.lang.NullPointerException]
            org.joda.time.IllegalFieldValueException.<init>(IllegalFieldValueException.java:108)
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:220)
            org.joda.time.field.BaseDateTimeField.set(BaseDateTimeField.java:585)
            org.joda.time.field.BaseDateTimeField.add(BaseDateTimeField.java:348)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.add(BasicMonthOfYearDateTimeField.java:218) */
        basicMonthOfYearDateTimeField.add(localDateTime, 0, intArray, 513);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.returnsFrom {@code return iChronology.getMonthOfYear(instant);}
 *  */
    @Test
    public void testGet_ReturnIChronologyGetMonthOfYear() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -42672448929792L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        int actual = basicMonthOfYearDateTimeField.get(-42641863323648L);
        
        assertEquals(12, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.returnsFrom {@code return iChronology.getMonthOfYear(instant);}
 *  */
    @Test
    public void testGet_ReturnIChronologyGetMonthOfYear_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 9);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -43361825041922L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        int actual = basicMonthOfYearDateTimeField.get(-43361825044479L);
        
        assertEquals(1, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.returnsFrom {@code return iChronology.getMonthOfYear(instant);}
 *  */
    @Test
    public void testGet_ReturnIChronologyGetMonthOfYear_2() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 40);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object initialBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache39 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 39);
        
        int actual = basicMonthOfYearDateTimeField.get(-3927894524971036672L);
        
        assertEquals(-13, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 1);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology9 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology9, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology10 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology10, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache, 9);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology11 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology11, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10 = get(basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache, 10);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology12 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology12, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11 = get(basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache, 11);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology13 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology13, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12 = get(basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache, 12);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology14 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology14, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13 = get(basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache, 13);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology15 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology15, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14 = get(basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache, 14);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology16 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology16, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15 = get(basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache, 15);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology17 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology17, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16 = get(basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache, 16);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology18 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology18, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17 = get(basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache, 17);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology19 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology19, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18 = get(basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache, 18);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology20 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology20, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19 = get(basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache, 19);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology21 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology21, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20 = get(basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache, 20);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology22 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology22, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21 = get(basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache, 21);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology23 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology23, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22 = get(basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache, 22);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology24 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology24, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23 = get(basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache, 23);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology25 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology25, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24 = get(basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache, 24);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology26 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology26, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25 = get(basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache, 25);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology27 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology27, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26 = get(basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache, 26);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology28 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology28IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology28, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27 = get(basicMonthOfYearDateTimeFieldIChronology28IChronologyIYearInfoCache, 27);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology29 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology29IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology29, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache28 = get(basicMonthOfYearDateTimeFieldIChronology29IChronologyIYearInfoCache, 28);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology30 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology30IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology30, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache29 = get(basicMonthOfYearDateTimeFieldIChronology30IChronologyIYearInfoCache, 29);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology31 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology31IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology31, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache30 = get(basicMonthOfYearDateTimeFieldIChronology31IChronologyIYearInfoCache, 30);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology32 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology32IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology32, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache31 = get(basicMonthOfYearDateTimeFieldIChronology32IChronologyIYearInfoCache, 31);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology33 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology33IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology33, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache32 = get(basicMonthOfYearDateTimeFieldIChronology33IChronologyIYearInfoCache, 32);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology34 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology34IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology34, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache33 = get(basicMonthOfYearDateTimeFieldIChronology34IChronologyIYearInfoCache, 33);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology35 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology35IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology35, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache34 = get(basicMonthOfYearDateTimeFieldIChronology35IChronologyIYearInfoCache, 34);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology36 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology36IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology36, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache35 = get(basicMonthOfYearDateTimeFieldIChronology36IChronologyIYearInfoCache, 35);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology37 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology37IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology37, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache36 = get(basicMonthOfYearDateTimeFieldIChronology37IChronologyIYearInfoCache, 36);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology38 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology38IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology38, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache37 = get(basicMonthOfYearDateTimeFieldIChronology38IChronologyIYearInfoCache, 37);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology39 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology39IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology39, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache38 = get(basicMonthOfYearDateTimeFieldIChronology39IChronologyIYearInfoCache, 38);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology40 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology40IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology40, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache39 = get(basicMonthOfYearDateTimeFieldIChronology40IChronologyIYearInfoCache, 39);
        
        assertFalse(initialBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache39 == finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache39);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache28);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache29);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache30);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache31);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache32);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache33);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache34);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache35);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache36);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache37);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache38);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return iChronology.getMonthOfYear(instant);
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index 905 out of bounds for length 1]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicChronology.getMonthOfYear(BasicChronology.java:435)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.get(BasicMonthOfYearDateTimeField.java:72) */
        basicMonthOfYearDateTimeField.get(-5778864569665159168L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iChronology.getMonthOfYear(instant);
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.get] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.get(BasicMonthOfYearDateTimeField.java:72) */
        basicMonthOfYearDateTimeField.get(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iChronology.getMonthOfYear(instant);
 *  */
    @Test
    public void testGet_ThrowNullPointerException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.get] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicChronology.getMonthOfYear(BasicChronology.java:435)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.get(BasicMonthOfYearDateTimeField.java:72) */
        basicMonthOfYearDateTimeField.get(-5778864569396610045L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return iChronology.getMonthOfYear(instant);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGet_ThrowArithmeticException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 2);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.get(-9163946408368305186L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return iChronology.getMonthOfYear(instant);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGet_ThrowArithmeticException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 326085570);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.get(-9180406652638499582L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.set
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(long, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int thisDom = iChronology.getDayOfMonth(instant, thisYear);
 *  */
    @Test
    public void testSet_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.set] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1019 out of bounds for length 1]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicChronology.getDayOfMonth(BasicChronology.java:458)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.set(BasicMonthOfYearDateTimeField.java:297) */
        basicMonthOfYearDateTimeField.set(-6265320502476562546L, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FieldUtils.verifyValueBounds(this, month, MIN, iMax);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.IllegalFieldValueException.<init>(IllegalFieldValueException.java:108)
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:220)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.set(BasicMonthOfYearDateTimeField.java:293) */
        basicMonthOfYearDateTimeField.set(-255L, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FieldUtils.verifyValueBounds(this, month, MIN, iMax);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_2() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", -255);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.IllegalFieldValueException.<init>(IllegalFieldValueException.java:108)
            org.joda.time.field.FieldUtils.verifyValueBounds(FieldUtils.java:220)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.set(BasicMonthOfYearDateTimeField.java:293) */
        basicMonthOfYearDateTimeField.set(-255L, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int thisYear = iChronology.getYear(instant);
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.set(BasicMonthOfYearDateTimeField.java:295) */
        basicMonthOfYearDateTimeField.set(-255L, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int thisDom = iChronology.getDayOfMonth(instant, thisYear);
 *  */
    @Test
    public void testSet_ThrowNullPointerException_3() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.set] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicChronology.getDayOfMonth(BasicChronology.java:458)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.set(BasicMonthOfYearDateTimeField.java:297) */
        basicMonthOfYearDateTimeField.set(-6265320502447497683L, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method set(long, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int thisDom = iChronology.getDayOfMonth(instant, thisYear);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSet_ThrowArithmeticException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 2);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        basicMonthOfYearDateTimeField.set(-9103280165656098557L, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int thisDom = iChronology.getDayOfMonth(instant, thisYear);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSet_ThrowArithmeticException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 292270048);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        basicMonthOfYearDateTimeField.set(-9157363169592195073L, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int thisDom = iChronology.getDayOfMonth(instant, thisYear);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSet_ThrowArithmeticException_2() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 292241378);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        basicMonthOfYearDateTimeField.set(-8987591331694621697L, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#set(long,int)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int thisDom = iChronology.getDayOfMonth(instant, thisYear);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testSet_ThrowArithmeticException_3() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 34);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", 1);
        
        basicMonthOfYearDateTimeField.set(9171731125485441044L, 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#readResolve()}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#monthOfYear()}
 * @utbot.returnsFrom {@code return iChronology.monthOfYear();}
 *  */
    @Test
    public void testReadResolve_BasicChronologyMonthOfYear() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        Class basicMonthOfYearDateTimeFieldClazz = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Method readResolveMethod = basicMonthOfYearDateTimeFieldClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        Object actual = readResolveMethod.invoke(basicMonthOfYearDateTimeField, readResolveMethodArguments);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readResolve()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#readResolve()}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#monthOfYear()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iChronology.monthOfYear();
 *  */
    @Test
    public void testReadResolve_ThrowNullPointerException() throws Throwable  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.readResolve] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.readResolve(BasicMonthOfYearDateTimeField.java:359) */
        Class basicMonthOfYearDateTimeFieldClazz = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Method readResolveMethod = basicMonthOfYearDateTimeFieldClazz.getDeclaredMethod("readResolve");
        readResolveMethod.setAccessible(true);
        java.lang.Object[] readResolveMethodArguments = new java.lang.Object[0];
        try {
            readResolveMethod.invoke(basicMonthOfYearDateTimeField, readResolveMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.remainder
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remainder(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#remainder(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return instant - roundFloor(instant);
 *  */
    @Test
    public void testRemainder_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.remainder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 905 out of bounds for length 1]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor(BasicMonthOfYearDateTimeField.java:345)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.remainder(BasicMonthOfYearDateTimeField.java:351) */
        basicMonthOfYearDateTimeField.remainder(-5778864569665314816L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#remainder(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return instant - roundFloor(instant);
 *  */
    @Test
    public void testRemainder_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.remainder] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor(BasicMonthOfYearDateTimeField.java:345)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.remainder(BasicMonthOfYearDateTimeField.java:351) */
        basicMonthOfYearDateTimeField.remainder(-5778864569396610015L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#remainder(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return instant - roundFloor(instant);
 *  */
    @Test
    public void testRemainder_ThrowNullPointerException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.remainder] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor(BasicMonthOfYearDateTimeField.java:345)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.remainder(BasicMonthOfYearDateTimeField.java:351) */
        basicMonthOfYearDateTimeField.remainder(-5778864569396610034L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remainder(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#remainder(long)}
 * @utbot.invokes {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#roundFloor(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return instant - roundFloor(instant);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testRemainder_ThrowArithmeticException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 2);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.remainder(-9164416568931652288L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLeap(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLeap(long)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLeap_ReturnFalse() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 26);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -275252199);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -5226869372515537808L);
        iYearInfoCache[25] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        boolean actual = basicMonthOfYearDateTimeField.isLeap(-8686182592304119748L);
        
        assertFalse(actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 1);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology9 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology9, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache, 9);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology10 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology10, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10 = get(basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache, 10);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology11 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology11, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11 = get(basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache, 11);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology12 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology12, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12 = get(basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache, 12);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology13 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology13, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13 = get(basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache, 13);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology14 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology14, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14 = get(basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache, 14);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology15 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology15, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15 = get(basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache, 15);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology16 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology16, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16 = get(basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache, 16);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology17 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology17, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17 = get(basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache, 17);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology18 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology18, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18 = get(basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache, 18);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology19 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology19, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19 = get(basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache, 19);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology20 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology20, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20 = get(basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache, 20);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology21 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology21, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21 = get(basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache, 21);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology22 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology22, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22 = get(basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache, 22);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology23 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology23, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23 = get(basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache, 23);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology24 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology24, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24 = get(basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache, 24);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLeap(long)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLeap_ReturnFalse_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 9);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 1024);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 8827055269405007933L);
        iYearInfoCache[0] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        boolean actual = basicMonthOfYearDateTimeField.isLeap(-29824252903344L);
        
        assertFalse(actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 1);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLeap(long)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLeap_ReturnFalse_2() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -7996415);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -252404642991731688L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        boolean actual = basicMonthOfYearDateTimeField.isLeap(-252404642991731688L);
        
        assertFalse(actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLeap(long)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLeap_ReturnFalse_3() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 12);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -100664319);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 6341048148134932649L);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        boolean actual = basicMonthOfYearDateTimeField.isLeap(-3176721223728781272L);
        
        assertFalse(actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 9);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology9 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology9, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10 = get(basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache, 10);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology10 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology10, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11 = get(basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache, 11);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLeap(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLeap(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testIsLeap_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 2);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap] produces [java.lang.ArrayIndexOutOfBoundsException: Index 258 out of bounds for length 2]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap(BasicMonthOfYearDateTimeField.java:315) */
        basicMonthOfYearDateTimeField.isLeap(-2870179489526596812L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLeap(long)}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#getYear(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int thisYear = iChronology.getYear(instant);
 *  */
    @Test
    public void testIsLeap_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap(BasicMonthOfYearDateTimeField.java:315) */
        basicMonthOfYearDateTimeField.isLeap(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLeap(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIsLeap_ThrowNullPointerException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap(BasicMonthOfYearDateTimeField.java:315) */
        basicMonthOfYearDateTimeField.isLeap(-26982823352062L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLenient
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isLenient()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#isLenient()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsLenient_ReturnFalse() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        boolean actual = basicMonthOfYearDateTimeField.isLenient();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.addWrapField
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addWrapField(long, int)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#addWrapField(long,int)}
 * @utbot.invokes {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#get(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return set(instant, FieldUtils.getWrappedValue(get(instant), months, MIN, iMax));
 *  */
    @Test(expected = ArithmeticException.class)
    public void testAddWrapField_ThrowArithmeticException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 298844130);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.addWrapField(-9149838277926860579L, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.getMinimumValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMinimumValue()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getMinimumValue()}
 * @utbot.returnsFrom {@code return MIN;}
 *  */
    @Test
    public void testGetMinimumValue_ReturnMIN() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        int actual = basicMonthOfYearDateTimeField.getMinimumValue();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.getMaximumValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaximumValue()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getMaximumValue()}
 * @utbot.returnsFrom {@code return iMax;}
 *  */
    @Test
    public void testGetMaximumValue_ReturnIMax() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iMax", -255);
        
        int actual = basicMonthOfYearDateTimeField.getMaximumValue();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method roundFloor(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#roundFloor(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int month = iChronology.getMonthOfYear(instant, year);
 *  */
    @Test
    public void testRoundFloor_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 905 out of bounds for length 1]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor(BasicMonthOfYearDateTimeField.java:345) */
        basicMonthOfYearDateTimeField.roundFloor(-5778864569665144827L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#roundFloor(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int year = iChronology.getYear(instant);
 *  */
    @Test
    public void testRoundFloor_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor(BasicMonthOfYearDateTimeField.java:344) */
        basicMonthOfYearDateTimeField.roundFloor(-255L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#roundFloor(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int month = iChronology.getMonthOfYear(instant, year);
 *  */
    @Test
    public void testRoundFloor_ThrowNullPointerException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.roundFloor(BasicMonthOfYearDateTimeField.java:345) */
        basicMonthOfYearDateTimeField.roundFloor(-5778864569396610041L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method roundFloor(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#roundFloor(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int month = iChronology.getMonthOfYear(instant, year);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testRoundFloor_ThrowArithmeticException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 293138370);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.roundFloor(-8974893156671325950L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#roundFloor(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int month = iChronology.getMonthOfYear(instant, year);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testRoundFloor_ThrowArithmeticException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 38);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.roundFloor(9112350748698027009L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#roundFloor(long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int month = iChronology.getMonthOfYear(instant, year);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testRoundFloor_ThrowArithmeticException_2() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 2);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -288357406);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.roundFloor(8954586011916199169L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapAmount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLeapAmount(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapAmount(long)}
 * @utbot.returnsFrom {@code return isLeap(instant) ? 1 : 0;}
 *  */
    @Test
    public void testGetLeapAmount_ReturnIsLeap() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 40);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 170942501);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 9223365815063921664L);
        iYearInfoCache[37] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        int actual = basicMonthOfYearDateTimeField.getLeapAmount(5394362142731190469L);
        
        assertEquals(0, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 1);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology9 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology9, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache, 9);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology10 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology10, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10 = get(basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache, 10);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology11 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology11, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11 = get(basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache, 11);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology12 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology12, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12 = get(basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache, 12);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology13 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology13, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13 = get(basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache, 13);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology14 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology14, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14 = get(basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache, 14);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology15 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology15, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15 = get(basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache, 15);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology16 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology16, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16 = get(basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache, 16);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology17 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology17, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17 = get(basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache, 17);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology18 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology18, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18 = get(basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache, 18);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology19 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology19, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19 = get(basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache, 19);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology20 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology20, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20 = get(basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache, 20);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology21 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology21, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21 = get(basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache, 21);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology22 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology22, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22 = get(basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache, 22);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology23 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology23, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23 = get(basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache, 23);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology24 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology24, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24 = get(basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache, 24);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology25 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology25, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25 = get(basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache, 25);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology26 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology26, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26 = get(basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache, 26);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology27 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology27, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27 = get(basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache, 27);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology28 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology28IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology28, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache28 = get(basicMonthOfYearDateTimeFieldIChronology28IChronologyIYearInfoCache, 28);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology29 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology29IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology29, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache29 = get(basicMonthOfYearDateTimeFieldIChronology29IChronologyIYearInfoCache, 29);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology30 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology30IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology30, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache30 = get(basicMonthOfYearDateTimeFieldIChronology30IChronologyIYearInfoCache, 30);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology31 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology31IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology31, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache31 = get(basicMonthOfYearDateTimeFieldIChronology31IChronologyIYearInfoCache, 31);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology32 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology32IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology32, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache32 = get(basicMonthOfYearDateTimeFieldIChronology32IChronologyIYearInfoCache, 32);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology33 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology33IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology33, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache33 = get(basicMonthOfYearDateTimeFieldIChronology33IChronologyIYearInfoCache, 33);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology34 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology34IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology34, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache34 = get(basicMonthOfYearDateTimeFieldIChronology34IChronologyIYearInfoCache, 34);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology35 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology35IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology35, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache35 = get(basicMonthOfYearDateTimeFieldIChronology35IChronologyIYearInfoCache, 35);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology36 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology36IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology36, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache36 = get(basicMonthOfYearDateTimeFieldIChronology36IChronologyIYearInfoCache, 36);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology37 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology37IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology37, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache38 = get(basicMonthOfYearDateTimeFieldIChronology37IChronologyIYearInfoCache, 38);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology38 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology38IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology38, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache39 = get(basicMonthOfYearDateTimeFieldIChronology38IChronologyIYearInfoCache, 39);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache28);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache29);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache30);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache31);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache32);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache33);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache34);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache35);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache36);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache38);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache39);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapAmount(long)}
 * @utbot.returnsFrom {@code return isLeap(instant) ? 1 : 0;}
 *  */
    @Test
    public void testGetLeapAmount_ReturnIsLeap_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 9);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -3145728);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", 6835685016566875836L);
        iYearInfoCache[0] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        int actual = basicMonthOfYearDateTimeField.getLeapAmount(-99331743921110472L);
        
        assertEquals(0, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 1);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapAmount(long)}
 * @utbot.returnsFrom {@code return isLeap(instant) ? 1 : 0;}
 *  */
    @Test
    public void testGetLeapAmount_ReturnIsLeap_2() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 29);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -167779300);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -5294665471626507202L);
        iYearInfoCache[28] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        int actual = basicMonthOfYearDateTimeField.getLeapAmount(-5294665471626507202L);
        
        assertEquals(0, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 1);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology9 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology9, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache, 9);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology10 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology10, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10 = get(basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache, 10);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology11 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology11, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11 = get(basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache, 11);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology12 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology12, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12 = get(basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache, 12);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology13 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology13, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13 = get(basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache, 13);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology14 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology14, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14 = get(basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache, 14);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology15 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology15, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15 = get(basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache, 15);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology16 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology16, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16 = get(basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache, 16);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology17 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology17, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17 = get(basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache, 17);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology18 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology18, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18 = get(basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache, 18);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology19 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology19, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19 = get(basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache, 19);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology20 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology20, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20 = get(basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache, 20);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology21 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology21, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21 = get(basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache, 21);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology22 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology22, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22 = get(basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache, 22);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology23 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology23, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23 = get(basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache, 23);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology24 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology24, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24 = get(basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache, 24);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology25 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology25, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25 = get(basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache, 25);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology26 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology26, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26 = get(basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache, 26);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology27 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology27, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27 = get(basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache, 27);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache24);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapAmount(long)}
 * @utbot.returnsFrom {@code return isLeap(instant) ? 1 : 0;}
 *  */
    @Test
    public void testGetLeapAmount_ReturnIsLeap_3() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 29);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", -268698600);
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iFirstDayMillis", -8479371012714081254L);
        iYearInfoCache[24] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        int actual = basicMonthOfYearDateTimeField.getLeapAmount(-8479370981178081254L);
        
        assertEquals(0, actual);
        
        BasicChronology basicMonthOfYearDateTimeFieldIChronology = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0 = get(basicMonthOfYearDateTimeFieldIChronologyIChronologyIYearInfoCache, 0);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology1 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology1, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1 = get(basicMonthOfYearDateTimeFieldIChronology1IChronologyIYearInfoCache, 1);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology2 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology2, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2 = get(basicMonthOfYearDateTimeFieldIChronology2IChronologyIYearInfoCache, 2);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology3 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology3, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3 = get(basicMonthOfYearDateTimeFieldIChronology3IChronologyIYearInfoCache, 3);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology4 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology4, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4 = get(basicMonthOfYearDateTimeFieldIChronology4IChronologyIYearInfoCache, 4);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology5 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology5, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5 = get(basicMonthOfYearDateTimeFieldIChronology5IChronologyIYearInfoCache, 5);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology6 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology6, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6 = get(basicMonthOfYearDateTimeFieldIChronology6IChronologyIYearInfoCache, 6);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology7 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology7, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7 = get(basicMonthOfYearDateTimeFieldIChronology7IChronologyIYearInfoCache, 7);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology8 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology8, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8 = get(basicMonthOfYearDateTimeFieldIChronology8IChronologyIYearInfoCache, 8);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology9 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology9, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9 = get(basicMonthOfYearDateTimeFieldIChronology9IChronologyIYearInfoCache, 9);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology10 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology10, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10 = get(basicMonthOfYearDateTimeFieldIChronology10IChronologyIYearInfoCache, 10);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology11 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology11, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11 = get(basicMonthOfYearDateTimeFieldIChronology11IChronologyIYearInfoCache, 11);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology12 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology12, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12 = get(basicMonthOfYearDateTimeFieldIChronology12IChronologyIYearInfoCache, 12);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology13 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology13, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13 = get(basicMonthOfYearDateTimeFieldIChronology13IChronologyIYearInfoCache, 13);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology14 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology14, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14 = get(basicMonthOfYearDateTimeFieldIChronology14IChronologyIYearInfoCache, 14);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology15 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology15, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15 = get(basicMonthOfYearDateTimeFieldIChronology15IChronologyIYearInfoCache, 15);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology16 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology16, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16 = get(basicMonthOfYearDateTimeFieldIChronology16IChronologyIYearInfoCache, 16);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology17 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology17, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17 = get(basicMonthOfYearDateTimeFieldIChronology17IChronologyIYearInfoCache, 17);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology18 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology18, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18 = get(basicMonthOfYearDateTimeFieldIChronology18IChronologyIYearInfoCache, 18);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology19 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology19, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19 = get(basicMonthOfYearDateTimeFieldIChronology19IChronologyIYearInfoCache, 19);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology20 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology20, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20 = get(basicMonthOfYearDateTimeFieldIChronology20IChronologyIYearInfoCache, 20);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology21 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology21, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21 = get(basicMonthOfYearDateTimeFieldIChronology21IChronologyIYearInfoCache, 21);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology22 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology22, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22 = get(basicMonthOfYearDateTimeFieldIChronology22IChronologyIYearInfoCache, 22);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology23 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology23, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23 = get(basicMonthOfYearDateTimeFieldIChronology23IChronologyIYearInfoCache, 23);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology24 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology24, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25 = get(basicMonthOfYearDateTimeFieldIChronology24IChronologyIYearInfoCache, 25);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology25 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology25, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26 = get(basicMonthOfYearDateTimeFieldIChronology25IChronologyIYearInfoCache, 26);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology26 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology26, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27 = get(basicMonthOfYearDateTimeFieldIChronology26IChronologyIYearInfoCache, 27);
        BasicChronology basicMonthOfYearDateTimeFieldIChronology27 = ((BasicChronology) getFieldValue(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology"));
        Object basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache = getFieldValue(basicMonthOfYearDateTimeFieldIChronology27, "org.joda.time.chrono.BasicChronology", "iYearInfoCache");
        Object finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache28 = get(basicMonthOfYearDateTimeFieldIChronology27IChronologyIYearInfoCache, 28);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache0);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache1);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache2);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache3);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache4);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache5);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache6);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache7);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache8);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache9);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache10);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache11);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache12);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache13);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache14);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache15);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache16);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache17);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache18);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache19);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache20);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache21);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache22);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache23);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache25);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache26);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache27);
        
        assertNull(finalBasicMonthOfYearDateTimeFieldIChronologyIYearInfoCache28);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLeapAmount(long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapAmount(long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: isLeap(instant)
 *  */
    @Test
    public void testGetLeapAmount_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapAmount] produces [java.lang.ArrayIndexOutOfBoundsException: Index 608 out of bounds for length 1]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap(BasicMonthOfYearDateTimeField.java:315)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapAmount(BasicMonthOfYearDateTimeField.java:324) */
        basicMonthOfYearDateTimeField.getLeapAmount(-5555843808776287300L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapAmount(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: isLeap(instant)
 *  */
    @Test
    public void testGetLeapAmount_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapAmount] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.BasicChronology.getYear(BasicChronology.java:406)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.isLeap(BasicMonthOfYearDateTimeField.java:315)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapAmount(BasicMonthOfYearDateTimeField.java:324) */
        basicMonthOfYearDateTimeField.getLeapAmount(-9223363921205393918L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.getRangeDurationField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRangeDurationField()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getRangeDurationField()}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#years()}
 * @utbot.returnsFrom {@code return iChronology.years();}
 *  */
    @Test
    public void testGetRangeDurationField_BasicChronologyYears() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        DurationField actual = basicMonthOfYearDateTimeField.getRangeDurationField();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRangeDurationField()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getRangeDurationField()}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#years()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iChronology.years();
 *  */
    @Test
    public void testGetRangeDurationField_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.getRangeDurationField] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getRangeDurationField(BasicMonthOfYearDateTimeField.java:310) */
        basicMonthOfYearDateTimeField.getRangeDurationField();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDifferenceAsLong(long, long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getDifferenceAsLong(long,long)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int minuendMonth = iChronology.getMonthOfYear(minuendInstant, minuendYear);
 *  */
    @Test
    public void testGetDifferenceAsLong_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iLeapYears, "org.joda.time.chrono.IslamicChronology$LeapYearPatternType", "pattern", 8);
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 1);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 293 out of bounds for length 1]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong(BasicMonthOfYearDateTimeField.java:243) */
        basicMonthOfYearDateTimeField.getDifferenceAsLong(-8742032539370762240L, -9223372036854644728L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getDifferenceAsLong(long,long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int minuendYear = iChronology.getYear(minuendInstant);
 *  */
    @Test
    public void testGetDifferenceAsLong_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong(BasicMonthOfYearDateTimeField.java:242) */
        basicMonthOfYearDateTimeField.getDifferenceAsLong(-255L, -255L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getDifferenceAsLong(long,long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int minuendMonth = iChronology.getMonthOfYear(minuendInstant, minuendYear);
 *  */
    @Test
    public void testGetDifferenceAsLong_ThrowNullPointerException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicChronology.getYearInfo(BasicChronology.java:738)
            org.joda.time.chrono.BasicChronology.getYearMillis(BasicChronology.java:360)
            org.joda.time.chrono.IslamicChronology.getMonthOfYear(IslamicChronology.java:398)
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getDifferenceAsLong(BasicMonthOfYearDateTimeField.java:243) */
        basicMonthOfYearDateTimeField.getDifferenceAsLong(-5857930661558075392L, -9223372036854775551L);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDifferenceAsLong(long, long)
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getDifferenceAsLong(long,long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int minuendMonth = iChronology.getMonthOfYear(minuendInstant, minuendYear);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetDifferenceAsLong_ThrowArithmeticException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 2);
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.getDifferenceAsLong(-9217088343939175425L, -9223372036854775550L);
    }
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getDifferenceAsLong(long,long)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: int minuendMonth = iChronology.getMonthOfYear(minuendInstant, minuendYear);
 *  */
    @Test(expected = ArithmeticException.class)
    public void testGetDifferenceAsLong_ThrowArithmeticException_1() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        IslamicChronology iChronology = ((IslamicChronology) createInstance("org.joda.time.chrono.IslamicChronology"));
        IslamicChronology.LeapYearPatternType iLeapYears = ((IslamicChronology.LeapYearPatternType) createInstance("org.joda.time.chrono.IslamicChronology$LeapYearPatternType"));
        setField(iChronology, "org.joda.time.chrono.IslamicChronology", "iLeapYears", iLeapYears);
        java.lang.Object[] iYearInfoCache = createArray("org.joda.time.chrono.BasicChronology$YearInfo", 10);
        Object yearInfo = createInstance("org.joda.time.chrono.BasicChronology$YearInfo");
        setField(yearInfo, "org.joda.time.chrono.BasicChronology$YearInfo", "iYear", 294619104);
        iYearInfoCache[1] = yearInfo;
        setField(iChronology, "org.joda.time.chrono.BasicChronology", "iYearInfoCache", iYearInfoCache);
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        basicMonthOfYearDateTimeField.getDifferenceAsLong(-9004051314922607477L, -9223372036854774776L);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapDurationField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLeapDurationField()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapDurationField()}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#days()}
 * @utbot.returnsFrom {@code return iChronology.days();}
 *  */
    @Test
    public void testGetLeapDurationField_BasicChronologyDays() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        GregorianChronology iChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(basicMonthOfYearDateTimeField, "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "iChronology", iChronology);
        
        DurationField actual = basicMonthOfYearDateTimeField.getLeapDurationField();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLeapDurationField()
    
    /**
    @utbot.classUnderTest {@link BasicMonthOfYearDateTimeField}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.BasicMonthOfYearDateTimeField#getLeapDurationField()}
 * @utbot.invokes {@link org.joda.time.chrono.BasicChronology#days()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iChronology.days();
 *  */
    @Test
    public void testGetLeapDurationField_ThrowNullPointerException() throws Exception  {
        BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = ((BasicMonthOfYearDateTimeField) createInstance("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        
        /* This test fails because method [org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapDurationField] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BasicMonthOfYearDateTimeField.getLeapDurationField(BasicMonthOfYearDateTimeField.java:329) */
        basicMonthOfYearDateTimeField.getLeapDurationField();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1053253512655200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1053253512655200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1053253512667100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1053253512655200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1053253512667100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1053253514827500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1053253514827500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1053253514830099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1053253514827500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1053253514830099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

