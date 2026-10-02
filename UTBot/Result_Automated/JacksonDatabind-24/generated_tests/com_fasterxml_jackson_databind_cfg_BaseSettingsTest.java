package com.fasterxml.jackson.databind.cfg;

import org.junit.Test;
import java.util.Locale;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.text.DateFormat;
import java.util.Calendar;
import sun.util.calendar.BaseCalendar.Date;
import sun.util.calendar.BaseCalendar;
import java.util.TimeZone;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.core.Base64Variant;
import sun.util.calendar.LocalGregorianCalendar;
import java.lang.reflect.Method;
import sun.util.calendar.ZoneInfo;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.time.ZoneId;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseStrategy;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import sun.util.BuddhistCalendar;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_cfg_BaseSettingsTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getLocale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocale()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getLocale()}
 * @utbot.returnsFrom {@code return _locale;}
 *  */
    @Test
    public void testGetLocale_Return_locale() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        Locale actual = baseSettings.getLocale();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.with
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method with(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWith_NotDfNotInstanceOfStdDateFormat() throws Exception  {
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        SimpleTimeZone zoneinfo = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(gdate, "sun.util.calendar.CalendarDate", "zoneinfo", zoneinfo);
        setField(calendar, "java.util.GregorianCalendar", "gdate", gdate);
        setField(calendar, "java.util.GregorianCalendar", "cdate", gdate);
        iSO8601DateFormat.setCalendar(calendar);
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        DateFormat dateFormat = baseSettings._dateFormat;
        Calendar dateFormat_dateFormatCalendar = ((Calendar) getFieldValue(dateFormat, "java.text.DateFormat", "calendar"));
        BaseCalendar.Date dateFormat_dateFormatCalendar_dateFormatCalendarGdate = ((BaseCalendar.Date) getFieldValue(dateFormat_dateFormatCalendar, "java.util.GregorianCalendar", "gdate"));
        TimeZone initialBaseSettings_dateFormatCalendarGdateZoneinfo = ((TimeZone) getFieldValue(dateFormat_dateFormatCalendar_dateFormatCalendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        BaseSettings actual = baseSettings.with(simpleTimeZone);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, simpleTimeZone, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
        DateFormat dateFormat1 = baseSettings._dateFormat;
        Calendar dateFormat1_dateFormatCalendar = ((Calendar) getFieldValue(dateFormat1, "java.text.DateFormat", "calendar"));
        BaseCalendar.Date dateFormat1_dateFormatCalendar_dateFormatCalendarGdate = ((BaseCalendar.Date) getFieldValue(dateFormat1_dateFormatCalendar, "java.util.GregorianCalendar", "gdate"));
        TimeZone finalBaseSettings_dateFormatCalendarGdateZoneinfo = ((TimeZone) getFieldValue(dateFormat1_dateFormatCalendar_dateFormatCalendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        assertFalse(initialBaseSettings_dateFormatCalendarGdateZoneinfo == finalBaseSettings_dateFormatCalendarGdateZoneinfo);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWith_NotDfNotInstanceOfStdDateFormat_1() throws Exception  {
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(iSO8601DateFormat, setCalendarMethodArguments);
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        DateFormat dateFormat = baseSettings._dateFormat;
        Calendar dateFormat_dateFormatCalendar = ((Calendar) getFieldValue(dateFormat, "java.text.DateFormat", "calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date dateFormat_dateFormatCalendar_dateFormatCalendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(dateFormat_dateFormatCalendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone initialBaseSettings_dateFormatCalendarJdateZoneinfo = ((TimeZone) getFieldValue(dateFormat_dateFormatCalendar_dateFormatCalendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        BaseSettings actual = baseSettings.with(simpleTimeZone);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, simpleTimeZone, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
        DateFormat dateFormat1 = baseSettings._dateFormat;
        Calendar dateFormat1_dateFormatCalendar = ((Calendar) getFieldValue(dateFormat1, "java.text.DateFormat", "calendar"));
        sun.util.calendar.LocalGregorianCalendar.Date dateFormat1_dateFormatCalendar_dateFormatCalendarJdate = ((sun.util.calendar.LocalGregorianCalendar.Date) getFieldValue(dateFormat1_dateFormatCalendar, "java.util.JapaneseImperialCalendar", "jdate"));
        TimeZone finalBaseSettings_dateFormatCalendarJdateZoneinfo = ((TimeZone) getFieldValue(dateFormat1_dateFormatCalendar_dateFormatCalendarJdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        assertFalse(initialBaseSettings_dateFormatCalendarJdateZoneinfo == finalBaseSettings_dateFormatCalendarJdateZoneinfo);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWith_NotDfNotInstanceOfStdDateFormat_2() throws Exception  {
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        SimpleTimeZone zoneinfo = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(gdate, "sun.util.calendar.CalendarDate", "zoneinfo", zoneinfo);
        setField(calendar, "java.util.GregorianCalendar", "gdate", gdate);
        Object cdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(calendar, "java.util.GregorianCalendar", "cdate", cdate);
        ZoneInfo zone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(calendar, "java.util.Calendar", "zone", zone);
        iSO8601DateFormat.setCalendar(calendar);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, null, base64Variant);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        DateFormat dateFormat = baseSettings._dateFormat;
        Calendar dateFormat_dateFormatCalendar = ((Calendar) getFieldValue(dateFormat, "java.text.DateFormat", "calendar"));
        BaseCalendar.Date dateFormat_dateFormatCalendar_dateFormatCalendarGdate = ((BaseCalendar.Date) getFieldValue(dateFormat_dateFormatCalendar, "java.util.GregorianCalendar", "gdate"));
        TimeZone initialBaseSettings_dateFormatCalendarGdateZoneinfo = ((TimeZone) getFieldValue(dateFormat_dateFormatCalendar_dateFormatCalendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        BaseSettings actual = baseSettings.with(simpleTimeZone);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, simpleTimeZone, base64Variant);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        
        Base64Variant expected_defaultBase64 = expected._defaultBase64;
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        // com.fasterxml.jackson.core.Base64Variant has overridden equals method
        assertEquals(expected_defaultBase64, actual_defaultBase64);
        
        DateFormat dateFormat1 = baseSettings._dateFormat;
        Calendar dateFormat1_dateFormatCalendar = ((Calendar) getFieldValue(dateFormat1, "java.text.DateFormat", "calendar"));
        BaseCalendar.Date dateFormat1_dateFormatCalendar_dateFormatCalendarGdate = ((BaseCalendar.Date) getFieldValue(dateFormat1_dateFormatCalendar, "java.util.GregorianCalendar", "gdate"));
        TimeZone finalBaseSettings_dateFormatCalendarGdateZoneinfo = ((TimeZone) getFieldValue(dateFormat1_dateFormatCalendar_dateFormatCalendarGdate, "sun.util.calendar.CalendarDate", "zoneinfo"));
        
        assertFalse(initialBaseSettings_dateFormatCalendarGdateZoneinfo == finalBaseSettings_dateFormatCalendarGdateZoneinfo);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): True}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWith_DfInstanceOfStdDateFormat_2() {
        ZoneInfo zoneInfo = new ZoneInfo();
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null);
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, null, null);
        
        BaseSettings actual = baseSettings.with(zoneInfo);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, zoneInfo, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): True}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWith_DfInstanceOfStdDateFormat_3() throws Exception  {
        ZoneInfo zoneInfo = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo.setRawOffset(1);
        String id = "";
        zoneInfo.setID(id);
        StdDateFormat stdDateFormat = new StdDateFormat(zoneInfo, null);
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, null, null);
        ZoneInfo zoneInfo1 = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        zoneInfo1.setRawOffset(1);
        zoneInfo1.setID(id);
        
        BaseSettings actual = baseSettings.with(zoneInfo1);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, zoneInfo1, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        int expected_timeZoneRawOffset = (((ZoneInfo) expected_timeZone)).getRawOffset();
        int actual_timeZoneRawOffset = (((ZoneInfo) actual_timeZone)).getRawOffset();
        assertEquals(expected_timeZoneRawOffset, actual_timeZoneRawOffset);
        
        int expected_timeZoneRawOffsetDiff = ((Integer) getFieldValue(expected_timeZone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff"));
        int actual_timeZoneRawOffsetDiff = ((Integer) getFieldValue(actual_timeZone, "sun.util.calendar.ZoneInfo", "rawOffsetDiff"));
        assertEquals(expected_timeZoneRawOffsetDiff, actual_timeZoneRawOffsetDiff);
        
        int expected_timeZoneChecksum = ((Integer) getFieldValue(expected_timeZone, "sun.util.calendar.ZoneInfo", "checksum"));
        int actual_timeZoneChecksum = ((Integer) getFieldValue(actual_timeZone, "sun.util.calendar.ZoneInfo", "checksum"));
        assertEquals(expected_timeZoneChecksum, actual_timeZoneChecksum);
        
        String expected_timeZoneID = expected_timeZone.getID();
        String actual_timeZoneID = actual_timeZone.getID();
        assertEquals(expected_timeZoneID, actual_timeZoneID);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): True}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWith_DfInstanceOfStdDateFormat() throws Exception  {
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        StdDateFormat stdDateFormat = new StdDateFormat(simpleTimeZone, null);
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, null, null);
        
        BaseSettings actual = baseSettings.with(simpleTimeZone);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, simpleTimeZone, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        int expected_timeZoneStartMonth = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startMonth"));
        int actual_timeZoneStartMonth = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startMonth"));
        assertEquals(expected_timeZoneStartMonth, actual_timeZoneStartMonth);
        
        int expected_timeZoneStartDay = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startDay"));
        int actual_timeZoneStartDay = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startDay"));
        assertEquals(expected_timeZoneStartDay, actual_timeZoneStartDay);
        
        int expected_timeZoneStartDayOfWeek = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        int actual_timeZoneStartDayOfWeek = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        assertEquals(expected_timeZoneStartDayOfWeek, actual_timeZoneStartDayOfWeek);
        
        int expected_timeZoneStartTime = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startTime"));
        int actual_timeZoneStartTime = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startTime"));
        assertEquals(expected_timeZoneStartTime, actual_timeZoneStartTime);
        
        int expected_timeZoneStartTimeMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startTimeMode"));
        int actual_timeZoneStartTimeMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startTimeMode"));
        assertEquals(expected_timeZoneStartTimeMode, actual_timeZoneStartTimeMode);
        
        int expected_timeZoneEndMonth = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endMonth"));
        int actual_timeZoneEndMonth = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endMonth"));
        assertEquals(expected_timeZoneEndMonth, actual_timeZoneEndMonth);
        
        int expected_timeZoneEndDay = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endDay"));
        int actual_timeZoneEndDay = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endDay"));
        assertEquals(expected_timeZoneEndDay, actual_timeZoneEndDay);
        
        int expected_timeZoneEndDayOfWeek = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        int actual_timeZoneEndDayOfWeek = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        assertEquals(expected_timeZoneEndDayOfWeek, actual_timeZoneEndDayOfWeek);
        
        int expected_timeZoneEndTime = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endTime"));
        int actual_timeZoneEndTime = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endTime"));
        assertEquals(expected_timeZoneEndTime, actual_timeZoneEndTime);
        
        int expected_timeZoneEndTimeMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endTimeMode"));
        int actual_timeZoneEndTimeMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endTimeMode"));
        assertEquals(expected_timeZoneEndTimeMode, actual_timeZoneEndTimeMode);
        
        int expected_timeZoneStartYear = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startYear"));
        int actual_timeZoneStartYear = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startYear"));
        assertEquals(expected_timeZoneStartYear, actual_timeZoneStartYear);
        
        int expected_timeZoneRawOffset = (((SimpleTimeZone) expected_timeZone)).getRawOffset();
        int actual_timeZoneRawOffset = (((SimpleTimeZone) actual_timeZone)).getRawOffset();
        assertEquals(expected_timeZoneRawOffset, actual_timeZoneRawOffset);
        
        boolean actual_timeZoneUseDaylight = ((Boolean) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "useDaylight"));
        assertFalse(actual_timeZoneUseDaylight);
        
        byte[] actual_timeZoneMonthLength = ((byte[]) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "monthLength"));
        assertNull(actual_timeZoneMonthLength);
        
        int expected_timeZoneStartMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startMode"));
        int actual_timeZoneStartMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startMode"));
        assertEquals(expected_timeZoneStartMode, actual_timeZoneStartMode);
        
        int expected_timeZoneEndMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endMode"));
        int actual_timeZoneEndMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endMode"));
        assertEquals(expected_timeZoneEndMode, actual_timeZoneEndMode);
        
        int expected_timeZoneDstSavings = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "dstSavings"));
        int actual_timeZoneDstSavings = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "dstSavings"));
        assertEquals(expected_timeZoneDstSavings, actual_timeZoneDstSavings);
        
        Object actual_timeZoneCache = getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "cache");
        assertNull(actual_timeZoneCache);
        
        int expected_timeZoneSerialVersionOnStream = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        int actual_timeZoneSerialVersionOnStream = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        assertEquals(expected_timeZoneSerialVersionOnStream, actual_timeZoneSerialVersionOnStream);
        
        String actual_timeZoneID = actual_timeZone.getID();
        assertNull(actual_timeZoneID);
        
        ZoneId actual_timeZoneZoneId = ((ZoneId) getFieldValue(actual_timeZone, "java.util.TimeZone", "zoneId"));
        assertNull(actual_timeZoneZoneId);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): True}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWith_DfInstanceOfStdDateFormat_1() throws Exception  {
        StdDateFormat stdDateFormat = new StdDateFormat(null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        BaseSettings actual = baseSettings.with(simpleTimeZone);
        
        StdDateFormat stdDateFormat1 = new StdDateFormat(simpleTimeZone, null);
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, stdDateFormat1, null, null, simpleTimeZone, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        int expected_timeZoneStartMonth = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startMonth"));
        int actual_timeZoneStartMonth = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startMonth"));
        assertEquals(expected_timeZoneStartMonth, actual_timeZoneStartMonth);
        
        int expected_timeZoneStartDay = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startDay"));
        int actual_timeZoneStartDay = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startDay"));
        assertEquals(expected_timeZoneStartDay, actual_timeZoneStartDay);
        
        int expected_timeZoneStartDayOfWeek = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        int actual_timeZoneStartDayOfWeek = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startDayOfWeek"));
        assertEquals(expected_timeZoneStartDayOfWeek, actual_timeZoneStartDayOfWeek);
        
        int expected_timeZoneStartTime = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startTime"));
        int actual_timeZoneStartTime = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startTime"));
        assertEquals(expected_timeZoneStartTime, actual_timeZoneStartTime);
        
        int expected_timeZoneStartTimeMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startTimeMode"));
        int actual_timeZoneStartTimeMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startTimeMode"));
        assertEquals(expected_timeZoneStartTimeMode, actual_timeZoneStartTimeMode);
        
        int expected_timeZoneEndMonth = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endMonth"));
        int actual_timeZoneEndMonth = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endMonth"));
        assertEquals(expected_timeZoneEndMonth, actual_timeZoneEndMonth);
        
        int expected_timeZoneEndDay = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endDay"));
        int actual_timeZoneEndDay = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endDay"));
        assertEquals(expected_timeZoneEndDay, actual_timeZoneEndDay);
        
        int expected_timeZoneEndDayOfWeek = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        int actual_timeZoneEndDayOfWeek = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endDayOfWeek"));
        assertEquals(expected_timeZoneEndDayOfWeek, actual_timeZoneEndDayOfWeek);
        
        int expected_timeZoneEndTime = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endTime"));
        int actual_timeZoneEndTime = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endTime"));
        assertEquals(expected_timeZoneEndTime, actual_timeZoneEndTime);
        
        int expected_timeZoneEndTimeMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endTimeMode"));
        int actual_timeZoneEndTimeMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endTimeMode"));
        assertEquals(expected_timeZoneEndTimeMode, actual_timeZoneEndTimeMode);
        
        int expected_timeZoneStartYear = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startYear"));
        int actual_timeZoneStartYear = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startYear"));
        assertEquals(expected_timeZoneStartYear, actual_timeZoneStartYear);
        
        int expected_timeZoneRawOffset = (((SimpleTimeZone) expected_timeZone)).getRawOffset();
        int actual_timeZoneRawOffset = (((SimpleTimeZone) actual_timeZone)).getRawOffset();
        assertEquals(expected_timeZoneRawOffset, actual_timeZoneRawOffset);
        
        boolean actual_timeZoneUseDaylight = ((Boolean) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "useDaylight"));
        assertFalse(actual_timeZoneUseDaylight);
        
        byte[] actual_timeZoneMonthLength = ((byte[]) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "monthLength"));
        assertNull(actual_timeZoneMonthLength);
        
        int expected_timeZoneStartMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "startMode"));
        int actual_timeZoneStartMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "startMode"));
        assertEquals(expected_timeZoneStartMode, actual_timeZoneStartMode);
        
        int expected_timeZoneEndMode = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "endMode"));
        int actual_timeZoneEndMode = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "endMode"));
        assertEquals(expected_timeZoneEndMode, actual_timeZoneEndMode);
        
        int expected_timeZoneDstSavings = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "dstSavings"));
        int actual_timeZoneDstSavings = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "dstSavings"));
        assertEquals(expected_timeZoneDstSavings, actual_timeZoneDstSavings);
        
        Object actual_timeZoneCache = getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "cache");
        assertNull(actual_timeZoneCache);
        
        int expected_timeZoneSerialVersionOnStream = ((Integer) getFieldValue(expected_timeZone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        int actual_timeZoneSerialVersionOnStream = ((Integer) getFieldValue(actual_timeZone, "java.util.SimpleTimeZone", "serialVersionOnStream"));
        assertEquals(expected_timeZoneSerialVersionOnStream, actual_timeZoneSerialVersionOnStream);
        
        String actual_timeZoneID = actual_timeZone.getID();
        assertNull(actual_timeZoneID);
        
        ZoneId actual_timeZoneZoneId = ((ZoneId) getFieldValue(actual_timeZone, "java.util.TimeZone", "zoneId"));
        assertNull(actual_timeZoneZoneId);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method with(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: tz == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWith_ThrowIllegalArgumentException() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        baseSettings.with(((TimeZone) null));
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.executesCondition {@code (tz == null): False}
 * @utbot.executesCondition {@code (df instanceof StdDateFormat): False}
 * @utbot.invokes {@link java.text.DateFormat#clone()}
 * @utbot.invokes {@link java.text.DateFormat#setTimeZone(java.util.TimeZone)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: df.setTimeZone(tz);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWith_ThrowUnsupportedOperationException() throws Exception  {
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(calendar, "java.util.GregorianCalendar", "gdate", gdate);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        setField(calendar, "java.util.GregorianCalendar", "cdate", cdate);
        iSO8601DateFormat.setCalendar(calendar);
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        baseSettings.with(simpleTimeZone);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method with(java.util.TimeZone)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.invokes {@link java.text.DateFormat#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: df = (DateFormat) df.clone();
 *  */
    @Test
    public void testWith_ThrowNullPointerException_1() throws Exception  {
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, simpleDateFormat, null, null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.cfg.BaseSettings.with] produces [java.lang.NullPointerException]
            java.base/java.text.DateFormat.clone(DateFormat.java:797)
            java.base/java.text.SimpleDateFormat.clone(SimpleDateFormat.java:2406)
            com.fasterxml.jackson.databind.cfg.BaseSettings.with(BaseSettings.java:273) */
        baseSettings.with(simpleTimeZone);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.TimeZone)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: df = (DateFormat) df.clone();
 *  */
    @Test
    public void testWith_ThrowNullPointerException() throws Exception  {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        SimpleTimeZone simpleTimeZone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.cfg.BaseSettings.with] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.BaseSettings.with(BaseSettings.java:273) */
        baseSettings.with(simpleTimeZone);
    }
    ///endregion
    
    ///region Errors report for with
    
    public void testWith_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.with
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method with(java.util.Locale)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.Locale)}
 * @utbot.executesCondition {@code (_locale == l): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWith__localeEqualsL() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.with(((Locale) null));
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(java.util.Locale)}
 * @utbot.executesCondition {@code (_locale == l): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, l, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWith__localeNotEqualsL() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, locale, null, null);
        
        BaseSettings actual = baseSettings.with(((Locale) null));
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.with
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method with(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.executesCondition {@code (base64 == _defaultBase64): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWith_Base64Equals_defaultBase64() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.with(((Base64Variant) null));
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#with(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.executesCondition {@code (base64 == _defaultBase64): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, base64);}
 *  */
    @Test
    public void testWith_Base64NotEquals_defaultBase64() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, null, null, base64Variant);
        
        BaseSettings actual = baseSettings.with(((Base64Variant) null));
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getTimeZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getTimeZone()}
 * @utbot.returnsFrom {@code return _timeZone;}
 *  */
    @Test
    public void testGetTimeZone_Return_timeZone() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        TimeZone actual = baseSettings.getTimeZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getTypeFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeFactory()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getTypeFactory()}
 * @utbot.returnsFrom {@code return _typeFactory;}
 *  */
    @Test
    public void testGetTypeFactory_Return_typeFactory() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        TypeFactory actual = baseSettings.getTypeFactory();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getDateFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDateFormat()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getDateFormat()}
 * @utbot.returnsFrom {@code return _dateFormat;}
 *  */
    @Test
    public void testGetDateFormat_Return_dateFormat() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        DateFormat actual = baseSettings.getDateFormat();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withVisibility
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_5() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy lowerCaseWithUnderscoresStrategy = new PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        ISO8601DateFormat iSO8601DateFormat = new ISO8601DateFormat();
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        ZoneInfo zoneInfo = new ZoneInfo();
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, jacksonAnnotationIntrospector, std, lowerCaseWithUnderscoresStrategy, typeFactory, null, iSO8601DateFormat, null, locale, zoneInfo, base64Variant);
        PropertyAccessor propertyAccessor = PropertyAccessor.NONE;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, jacksonAnnotationIntrospector, std, lowerCaseWithUnderscoresStrategy, typeFactory, null, iSO8601DateFormat, null, locale, zoneInfo, base64Variant);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        
        PropertyNamingStrategy expected_propertyNamingStrategy = expected._propertyNamingStrategy;
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        
        TypeFactory expected_typeFactory = expected._typeFactory;
        TypeFactory actual_typeFactory = actual._typeFactory;
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale expected_locale = expected._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(expected_locale, actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        
        Base64Variant expected_defaultBase64 = expected._defaultBase64;
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        // com.fasterxml.jackson.core.Base64Variant has overridden equals method
        assertEquals(expected_defaultBase64, actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.DEFAULT;
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, visibility, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.SETTER;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        VisibilityChecker.Std std1 = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings expected = new BaseSettings(null, null, std1, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.DEFAULT;
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, visibility);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.FIELD;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        VisibilityChecker.Std std1 = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings expected = new BaseSettings(null, null, std1, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.DEFAULT;
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, visibility, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.IS_GETTER;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        VisibilityChecker.Std std1 = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings expected = new BaseSettings(null, null, std1, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_9() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.DEFAULT;
        VisibilityChecker.Std std = new VisibilityChecker.Std(visibility, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.GETTER;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        VisibilityChecker.Std std1 = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings expected = new BaseSettings(null, null, std1, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.DEFAULT;
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, visibility, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.CREATOR;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        VisibilityChecker.Std std1 = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings expected = new BaseSettings(null, null, std1, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.GETTER;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        BaseSettings expected = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.FIELD;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        BaseSettings expected = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.SETTER;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        BaseSettings expected = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.CREATOR;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        BaseSettings expected = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.IS_GETTER;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        BaseSettings expected = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(forMethod, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibility_Return_10() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        PropertyAccessor propertyAccessor = PropertyAccessor.ALL;
        
        BaseSettings actual = baseSettings.withVisibility(propertyAccessor, null);
        
        VisibilityChecker.Std std1 = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings expected = new BaseSettings(null, null, std1, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.VisibilityChecker#withVisibility(com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _visibilityChecker.withVisibility(forMethod, visibility)
 *  */
    @Test
    public void testWithVisibility_ThrowNullPointerException() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.cfg.BaseSettings.withVisibility] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.cfg.BaseSettings.withVisibility(BaseSettings.java:197) */
        baseSettings.withVisibility(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getVisibilityChecker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVisibilityChecker()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getVisibilityChecker()}
 * @utbot.returnsFrom {@code return _visibilityChecker;}
 *  */
    @Test
    public void testGetVisibilityChecker_Return_visibilityChecker() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException  {
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(null, null, std, null, null, null, null, null, null, null, null);
        
        VisibilityChecker.Std actual = ((VisibilityChecker.Std) baseSettings.getVisibilityChecker());
        
        JsonAutoDetect.Visibility actual_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_fieldMinLevel);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getPropertyNamingStrategy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyNamingStrategy()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getPropertyNamingStrategy()}
 * @utbot.returnsFrom {@code return _propertyNamingStrategy;}
 *  */
    @Test
    public void testGetPropertyNamingStrategy_Return_propertyNamingStrategy() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        PropertyNamingStrategy actual = baseSettings.getPropertyNamingStrategy();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withClassIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withClassIntrospector(com.fasterxml.jackson.databind.introspect.ClassIntrospector)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withClassIntrospector(com.fasterxml.jackson.databind.introspect.ClassIntrospector)}
 * @utbot.executesCondition {@code (_classIntrospector == ci): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithClassIntrospector__classIntrospectorEqualsCi() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withClassIntrospector(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withClassIntrospector(com.fasterxml.jackson.databind.introspect.ClassIntrospector)}
 * @utbot.executesCondition {@code (_classIntrospector == ci): False}
 * @utbot.returnsFrom {@code return new BaseSettings(ci, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithClassIntrospector__classIntrospectorNotEqualsCi() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        PropertyNamingStrategy.PascalCaseStrategy pascalCaseStrategy = new PropertyNamingStrategy.PascalCaseStrategy();
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, std, pascalCaseStrategy, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withClassIntrospector(null);
        
        BaseSettings expected = new BaseSettings(null, null, std, pascalCaseStrategy, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy expected_propertyNamingStrategy = expected._propertyNamingStrategy;
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withAppendedAnnotationIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withAppendedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withAppendedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return withAnnotationIntrospector(AnnotationIntrospectorPair.create(_annotationIntrospector, ai));}
 *  */
    @Test
    public void testWithAppendedAnnotationIntrospector_ReturnWithAnnotationIntrospector_2() throws Exception  {
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        ZoneInfo zoneInfo = new ZoneInfo();
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, locale, zoneInfo, base64Variant);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        BaseSettings actual = baseSettings.withAppendedAnnotationIntrospector(anonymousNopAnnotationIntrospector);
        
        BaseSettings expected = new BaseSettings(null, anonymousNopAnnotationIntrospector, null, null, null, null, null, null, locale, zoneInfo, base64Variant);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale expected_locale = expected._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(expected_locale, actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        
        Base64Variant expected_defaultBase64 = expected._defaultBase64;
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        // com.fasterxml.jackson.core.Base64Variant has overridden equals method
        assertEquals(expected_defaultBase64, actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withAppendedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return withAnnotationIntrospector(AnnotationIntrospectorPair.create(_annotationIntrospector, ai));}
 *  */
    @Test
    public void testWithAppendedAnnotationIntrospector_ReturnWithAnnotationIntrospector_1() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        BaseSettings baseSettings = new BaseSettings(null, anonymousNopAnnotationIntrospector, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withAppendedAnnotationIntrospector(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector baseSettings_annotationIntrospector = baseSettings._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withAppendedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return withAnnotationIntrospector(AnnotationIntrospectorPair.create(_annotationIntrospector, ai));}
 *  */
    @Test
    public void testWithAppendedAnnotationIntrospector_ReturnWithAnnotationIntrospector() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withAppendedAnnotationIntrospector(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withAppendedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return withAnnotationIntrospector(AnnotationIntrospectorPair.create(_annotationIntrospector, ai));}
 *  */
    @Test
    public void testWithAppendedAnnotationIntrospector_ReturnWithAnnotationIntrospector_3() throws Exception  {
        AnnotationIntrospectorPair annotationIntrospectorPair = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", annotationIntrospectorPair);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, _secondary);
        BaseSettings baseSettings = new BaseSettings(null, annotationIntrospectorPair1, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withAppendedAnnotationIntrospector(_secondary);
        
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(annotationIntrospectorPair1, _secondary);
        BaseSettings expected = new BaseSettings(null, annotationIntrospectorPair2, null, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        AnnotationIntrospector expected_annotationIntrospector_primary = ((AnnotationIntrospector) getFieldValue(expected_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary"));
        AnnotationIntrospector actual_annotationIntrospector_primary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary"));
        assertTrue(deepEquals(expected_annotationIntrospector_primary, actual_annotationIntrospector_primary));
        AnnotationIntrospector expected_annotationIntrospector_primary_secondary = ((AnnotationIntrospector) getFieldValue(expected_annotationIntrospector_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary"));
        AnnotationIntrospector actual_annotationIntrospector_primary_secondary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary"));
        
        assertTrue(deepEquals(expected_annotationIntrospector, actual_annotationIntrospector));
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getAnnotationIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotationIntrospector()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getAnnotationIntrospector()}
 * @utbot.returnsFrom {@code return _annotationIntrospector;}
 *  */
    @Test
    public void testGetAnnotationIntrospector_Return_annotationIntrospector() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        AnnotationIntrospector actual = baseSettings.getAnnotationIntrospector();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withAnnotationIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (_annotationIntrospector == ai): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithAnnotationIntrospector__annotationIntrospectorEqualsAi() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withAnnotationIntrospector(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (_annotationIntrospector == ai): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, ai, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithAnnotationIntrospector__annotationIntrospectorNotEqualsAi() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, anonymousNopAnnotationIntrospector, std, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withAnnotationIntrospector(null);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withInsertedAnnotationIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withInsertedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withInsertedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return withAnnotationIntrospector(AnnotationIntrospectorPair.create(ai, _annotationIntrospector));}
 *  */
    @Test
    public void testWithInsertedAnnotationIntrospector_ReturnWithAnnotationIntrospector_2() throws Exception  {
        Locale locale = ((Locale) createInstance("java.util.Locale"));
        ZoneInfo zoneInfo = new ZoneInfo();
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, locale, zoneInfo, base64Variant);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        
        BaseSettings actual = baseSettings.withInsertedAnnotationIntrospector(anonymousNopAnnotationIntrospector);
        
        BaseSettings expected = new BaseSettings(null, anonymousNopAnnotationIntrospector, null, null, null, null, null, null, locale, zoneInfo, base64Variant);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale expected_locale = expected._locale;
        Locale actual_locale = actual._locale;
        // java.util.Locale has overridden equals method
        assertEquals(expected_locale, actual_locale);
        
        TimeZone expected_timeZone = expected._timeZone;
        TimeZone actual_timeZone = actual._timeZone;
        
        Base64Variant expected_defaultBase64 = expected._defaultBase64;
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        // com.fasterxml.jackson.core.Base64Variant has overridden equals method
        assertEquals(expected_defaultBase64, actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withInsertedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return withAnnotationIntrospector(AnnotationIntrospectorPair.create(ai, _annotationIntrospector));}
 *  */
    @Test
    public void testWithInsertedAnnotationIntrospector_ReturnWithAnnotationIntrospector() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withInsertedAnnotationIntrospector(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withInsertedAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return withAnnotationIntrospector(AnnotationIntrospectorPair.create(ai, _annotationIntrospector));}
 *  */
    @Test
    public void testWithInsertedAnnotationIntrospector_ReturnWithAnnotationIntrospector_1() throws Exception  {
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", anonymousNopAnnotationIntrospector);
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", annotationIntrospectorPair);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair);
        BaseSettings baseSettings = new BaseSettings(null, annotationIntrospectorPair1, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withInsertedAnnotationIntrospector(anonymousNopAnnotationIntrospector);
        
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair1);
        BaseSettings expected = new BaseSettings(null, annotationIntrospectorPair2, null, null, null, null, null, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector expected_annotationIntrospector = expected._annotationIntrospector;
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        AnnotationIntrospector expected_annotationIntrospector_primary = ((AnnotationIntrospector) getFieldValue(expected_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary"));
        AnnotationIntrospector actual_annotationIntrospector_primary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary"));
        
        AnnotationIntrospector expected_annotationIntrospector_secondary = ((AnnotationIntrospector) getFieldValue(expected_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary"));
        AnnotationIntrospector actual_annotationIntrospector_secondary = ((AnnotationIntrospector) getFieldValue(actual_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary"));
        assertTrue(deepEquals(expected_annotationIntrospector_secondary, actual_annotationIntrospector_secondary));
        assertTrue(deepEquals(expected_annotationIntrospector_secondary, actual_annotationIntrospector_secondary));
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withVisibilityChecker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withVisibilityChecker(com.fasterxml.jackson.databind.introspect.VisibilityChecker)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibilityChecker(com.fasterxml.jackson.databind.introspect.VisibilityChecker)}
 * @utbot.executesCondition {@code (_visibilityChecker == vc): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithVisibilityChecker__visibilityCheckerEqualsVc() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withVisibilityChecker(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withVisibilityChecker(com.fasterxml.jackson.databind.introspect.VisibilityChecker)}
 * @utbot.executesCondition {@code (_visibilityChecker == vc): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, vc, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithVisibilityChecker__visibilityCheckerNotEqualsVc() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        PropertyNamingStrategy.LowerCaseStrategy lowerCaseStrategy = new PropertyNamingStrategy.LowerCaseStrategy();
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, std, lowerCaseStrategy, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withVisibilityChecker(null);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, null, lowerCaseStrategy, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy expected_propertyNamingStrategy = expected._propertyNamingStrategy;
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withPropertyNamingStrategy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withPropertyNamingStrategy(com.fasterxml.jackson.databind.PropertyNamingStrategy)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withPropertyNamingStrategy(com.fasterxml.jackson.databind.PropertyNamingStrategy)}
 * @utbot.executesCondition {@code (_propertyNamingStrategy == pns): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithPropertyNamingStrategy__propertyNamingStrategyEqualsPns() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withPropertyNamingStrategy(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withPropertyNamingStrategy(com.fasterxml.jackson.databind.PropertyNamingStrategy)}
 * @utbot.executesCondition {@code (_propertyNamingStrategy == pns): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, pns, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithPropertyNamingStrategy__propertyNamingStrategyNotEqualsPns() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy lowerCaseWithUnderscoresStrategy = new PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy();
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, std, lowerCaseWithUnderscoresStrategy, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withPropertyNamingStrategy(null);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withTypeResolverBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeResolverBuilder(com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withTypeResolverBuilder(com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)}
 * @utbot.executesCondition {@code (_typeResolverBuilder == typer): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTypeResolverBuilder__typeResolverBuilderEqualsTyper() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withTypeResolverBuilder(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withTypeResolverBuilder(com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)}
 * @utbot.executesCondition {@code (_typeResolverBuilder == typer): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, typer, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithTypeResolverBuilder__typeResolverBuilderNotEqualsTyper() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, std, null, null, stdTypeResolverBuilder, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withTypeResolverBuilder(null);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getClassIntrospector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassIntrospector()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getClassIntrospector()}
 * @utbot.returnsFrom {@code return _classIntrospector;}
 *  */
    @Test
    public void testGetClassIntrospector_Return_classIntrospector() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, null, null, null, null, null, null, null, null, null);
        
        BasicClassIntrospector actual = ((BasicClassIntrospector) baseSettings.getClassIntrospector());
        
        LRUMap actual_cachedFCA = ((LRUMap) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_cachedFCA);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getTypeResolverBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeResolverBuilder()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getTypeResolverBuilder()}
 * @utbot.returnsFrom {@code return _typeResolverBuilder;}
 *  */
    @Test
    public void testGetTypeResolverBuilder_Return_typeResolverBuilder() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        TypeResolverBuilder actual = baseSettings.getTypeResolverBuilder();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withHandlerInstantiator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withHandlerInstantiator(com.fasterxml.jackson.databind.cfg.HandlerInstantiator)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withHandlerInstantiator(com.fasterxml.jackson.databind.cfg.HandlerInstantiator)}
 * @utbot.executesCondition {@code (_handlerInstantiator == hi): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithHandlerInstantiator__handlerInstantiatorEqualsHi() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withHandlerInstantiator(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getHandlerInstantiator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHandlerInstantiator()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getHandlerInstantiator()}
 * @utbot.returnsFrom {@code return _handlerInstantiator;}
 *  */
    @Test
    public void testGetHandlerInstantiator_Return_handlerInstantiator() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        HandlerInstantiator actual = baseSettings.getHandlerInstantiator();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withDateFormat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withDateFormat(java.text.DateFormat)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.executesCondition {@code (_dateFormat == df): False}
 * @utbot.executesCondition {@code ((df == null)): True}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWithDateFormat_DfEqualsNull() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        SimpleDateFormat simpleDateFormat = ((SimpleDateFormat) createInstance("java.text.SimpleDateFormat"));
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, null, null, null, null, simpleDateFormat, null, null, null, null);
        
        BaseSettings actual = baseSettings.withDateFormat(null);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, null, null, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.executesCondition {@code (_dateFormat == df): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithDateFormat__dateFormatEqualsDf() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withDateFormat(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.executesCondition {@code (_dateFormat == df): False}
 * @utbot.executesCondition {@code ((df == null)): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWithDateFormat_DfNotEqualsNull() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        StdDateFormat stdDateFormat = new StdDateFormat(null, null);
        
        BaseSettings actual = baseSettings.withDateFormat(stdDateFormat);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, stdDateFormat, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.executesCondition {@code (_dateFormat == df): False}
 * @utbot.executesCondition {@code ((df == null)): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWithDateFormat_DfNotEqualsNull_1() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, null, null, null, null, null, null, null, null, null);
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        BuddhistCalendar calendar = ((BuddhistCalendar) createInstance("sun.util.BuddhistCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(calendar, "java.util.GregorianCalendar", "gdate", gdate);
        setField(calendar, "java.util.GregorianCalendar", "cdate", gdate);
        iSO8601DateFormat.setCalendar(calendar);
        
        BaseSettings actual = baseSettings.withDateFormat(iSO8601DateFormat);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, null, null, null, null, iSO8601DateFormat, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.executesCondition {@code (_dateFormat == df): False}
 * @utbot.executesCondition {@code ((df == null)): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWithDateFormat_DfNotEqualsNull_2() throws Exception  {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        sun.util.calendar.LocalGregorianCalendar.Date jdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(calendar, "java.util.JapaneseImperialCalendar", "jdate", jdate);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(iSO8601DateFormat, setCalendarMethodArguments);
        
        BaseSettings actual = baseSettings.withDateFormat(iSO8601DateFormat);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.executesCondition {@code (_dateFormat == df): False}
 * @utbot.executesCondition {@code ((df == null)): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, df, _handlerInstantiator, _locale, tz, _defaultBase64);}
 *  */
    @Test
    public void testWithDateFormat_DfNotEqualsNull_3() throws Exception  {
        ISO8601DateFormat iSO8601DateFormat = new ISO8601DateFormat();
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat, null, null, null, null);
        ISO8601DateFormat iSO8601DateFormat1 = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(calendar, "java.util.GregorianCalendar", "gdate", gdate);
        Object cdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(calendar, "java.util.GregorianCalendar", "cdate", cdate);
        iSO8601DateFormat1.setCalendar(calendar);
        
        BaseSettings actual = baseSettings.withDateFormat(iSO8601DateFormat1);
        
        BaseSettings expected = new BaseSettings(null, null, null, null, null, null, iSO8601DateFormat1, null, null, null, null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat expected_dateFormat = expected._dateFormat;
        DateFormat actual_dateFormat = actual._dateFormat;
        // java.text.DateFormat has overridden equals method
        assertEquals(expected_dateFormat, actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withDateFormat(java.text.DateFormat)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: df.getTimeZone()
 *  */
    @Test
    public void testWithDateFormat_ThrowNullPointerException() throws Exception  {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        ZoneInfo zone = ((ZoneInfo) createInstance("sun.util.calendar.ZoneInfo"));
        setField(calendar, "java.util.Calendar", "zone", zone);
        setField(calendar, "java.util.Calendar", "sharedZone", true);
        iSO8601DateFormat.setCalendar(calendar);
        
        /* This test fails because method [com.fasterxml.jackson.databind.cfg.BaseSettings.withDateFormat] produces [java.lang.NullPointerException]
            java.base/java.util.GregorianCalendar.getTimeZone(GregorianCalendar.java:1983)
            java.base/java.text.DateFormat.getTimeZone(DateFormat.java:727)
            com.fasterxml.jackson.databind.cfg.BaseSettings.withDateFormat(BaseSettings.java:234) */
        baseSettings.withDateFormat(iSO8601DateFormat);
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: df.getTimeZone()
 *  */
    @Test
    public void testWithDateFormat_ThrowNullPointerException_1() throws Exception  {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        Object calendar = createInstance("java.util.JapaneseImperialCalendar");
        SimpleTimeZone zone = ((SimpleTimeZone) createInstance("java.util.SimpleTimeZone"));
        setField(calendar, "java.util.Calendar", "zone", zone);
        setField(calendar, "java.util.Calendar", "sharedZone", true);
        Class dateFormatClazz = Class.forName("java.text.DateFormat");
        Class calendarType = Class.forName("java.util.Calendar");
        Method setCalendarMethod = dateFormatClazz.getDeclaredMethod("setCalendar", calendarType);
        setCalendarMethod.setAccessible(true);
        java.lang.Object[] setCalendarMethodArguments = new java.lang.Object[1];
        setCalendarMethodArguments[0] = calendar;
        setCalendarMethod.invoke(iSO8601DateFormat, setCalendarMethodArguments);
        
        /* This test fails because method [com.fasterxml.jackson.databind.cfg.BaseSettings.withDateFormat] produces [java.lang.NullPointerException]
            java.base/java.util.JapaneseImperialCalendar.getTimeZone(JapaneseImperialCalendar.java:1518)
            java.base/java.text.DateFormat.getTimeZone(DateFormat.java:727)
            com.fasterxml.jackson.databind.cfg.BaseSettings.withDateFormat(BaseSettings.java:234) */
        baseSettings.withDateFormat(iSO8601DateFormat);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withDateFormat(java.text.DateFormat)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withDateFormat(java.text.DateFormat)}
 * @utbot.executesCondition {@code (_dateFormat == df): False}
 * @utbot.executesCondition {@code ((df == null)): False}
 * @utbot.invokes {@link java.text.DateFormat#getTimeZone()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: df.getTimeZone()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testWithDateFormat_ThrowUnsupportedOperationException() throws Exception  {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        ISO8601DateFormat iSO8601DateFormat = ((ISO8601DateFormat) createInstance("com.fasterxml.jackson.databind.util.ISO8601DateFormat"));
        GregorianCalendar calendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        Object gdate = createInstance("sun.util.calendar.Gregorian$Date");
        setField(calendar, "java.util.GregorianCalendar", "gdate", gdate);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        setField(calendar, "java.util.GregorianCalendar", "cdate", cdate);
        iSO8601DateFormat.setCalendar(calendar);
        
        baseSettings.withDateFormat(iSO8601DateFormat);
    }
    ///endregion
    
    ///region Errors report for withDateFormat
    
    public void testWithDateFormat_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.getBase64Variant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBase64Variant()
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#getBase64Variant()}
 * @utbot.returnsFrom {@code return _defaultBase64;}
 *  */
    @Test
    public void testGetBase64Variant_Return_defaultBase64() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        Base64Variant actual = baseSettings.getBase64Variant();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.cfg.BaseSettings.withTypeFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeFactory(com.fasterxml.jackson.databind.type.TypeFactory)
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withTypeFactory(com.fasterxml.jackson.databind.type.TypeFactory)}
 * @utbot.executesCondition {@code (_typeFactory == tf): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTypeFactory__typeFactoryEqualsTf() {
        BaseSettings baseSettings = new BaseSettings(null, null, null, null, null, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withTypeFactory(null);
        
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        assertNull(actual_classIntrospector);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        assertNull(actual_visibilityChecker);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
    }
    
    /**
    @utbot.classUnderTest {@link BaseSettings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.cfg.BaseSettings#withTypeFactory(com.fasterxml.jackson.databind.type.TypeFactory)}
 * @utbot.executesCondition {@code (_typeFactory == tf): False}
 * @utbot.returnsFrom {@code return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, tf, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);}
 *  */
    @Test
    public void testWithTypeFactory__typeFactoryNotEqualsTf() throws Exception  {
        BasicClassIntrospector basicClassIntrospector = ((BasicClassIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.BasicClassIntrospector"));
        VisibilityChecker.Std std = new VisibilityChecker.Std(null, null, null, null, null);
        TypeFactory typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        BaseSettings baseSettings = new BaseSettings(basicClassIntrospector, null, std, null, typeFactory, null, null, null, null, null, null);
        
        BaseSettings actual = baseSettings.withTypeFactory(null);
        
        BaseSettings expected = new BaseSettings(basicClassIntrospector, null, std, null, null, null, null, null, null, null, null);
        
        ClassIntrospector expected_classIntrospector = expected._classIntrospector;
        ClassIntrospector actual_classIntrospector = actual._classIntrospector;
        LRUMap actual_classIntrospector_cachedFCA = ((LRUMap) getFieldValue(actual_classIntrospector, "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector", "_cachedFCA"));
        assertNull(actual_classIntrospector_cachedFCA);
        
        AnnotationIntrospector actual_annotationIntrospector = actual._annotationIntrospector;
        assertNull(actual_annotationIntrospector);
        
        VisibilityChecker expected_visibilityChecker = expected._visibilityChecker;
        VisibilityChecker actual_visibilityChecker = actual._visibilityChecker;
        JsonAutoDetect.Visibility actual_visibilityChecker_getterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_getterMinLevel"));
        assertNull(actual_visibilityChecker_getterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_isGetterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_isGetterMinLevel"));
        assertNull(actual_visibilityChecker_isGetterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_setterMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_setterMinLevel"));
        assertNull(actual_visibilityChecker_setterMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_creatorMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_creatorMinLevel"));
        assertNull(actual_visibilityChecker_creatorMinLevel);
        
        JsonAutoDetect.Visibility actual_visibilityChecker_fieldMinLevel = ((JsonAutoDetect.Visibility) getFieldValue(actual_visibilityChecker, "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", "_fieldMinLevel"));
        assertNull(actual_visibilityChecker_fieldMinLevel);
        
        PropertyNamingStrategy actual_propertyNamingStrategy = actual._propertyNamingStrategy;
        assertNull(actual_propertyNamingStrategy);
        
        TypeFactory actual_typeFactory = actual._typeFactory;
        assertNull(actual_typeFactory);
        
        TypeResolverBuilder actual_typeResolverBuilder = actual._typeResolverBuilder;
        assertNull(actual_typeResolverBuilder);
        
        DateFormat actual_dateFormat = actual._dateFormat;
        assertNull(actual_dateFormat);
        
        HandlerInstantiator actual_handlerInstantiator = actual._handlerInstantiator;
        assertNull(actual_handlerInstantiator);
        
        Locale actual_locale = actual._locale;
        assertNull(actual_locale);
        
        TimeZone actual_timeZone = actual._timeZone;
        assertNull(actual_timeZone);
        
        Base64Variant actual_defaultBase64 = actual._defaultBase64;
        assertNull(actual_defaultBase64);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1069024012337100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1069024012337100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1069024012350500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069024012337100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069024012350500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1069024013049000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069024013049000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069024013052900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069024013049000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069024013052900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

