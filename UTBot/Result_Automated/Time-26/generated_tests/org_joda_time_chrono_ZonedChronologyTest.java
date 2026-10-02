package org.joda.time.chrono;

import org.junit.Test;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.field.UnsupportedDurationField;
import java.util.HashMap;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.DateTimeZone;
import java.lang.reflect.Method;
import org.joda.time.Chronology;
import org.joda.time.chrono.AssembledChronology.Fields;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.DelegatedDurationField;
import org.joda.time.DurationField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.ScaledDurationField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.DividedDateTimeField;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_joda_time_chrono_ZonedChronologyTest {
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        boolean actual = zonedChronology.equals(zonedChronology);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_ObjInstanceOfZonedChronologyEqualsFalse() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        boolean actual = zonedChronology.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_6() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_7() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_9() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iZone);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_8() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iStandardOffset", -1);
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_4() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.FixedDateTimeZone", "iWallOffset", -1);
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iParam1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj instanceof ZonedChronology == false): False}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfZonedChronologyNotEqualsFalse_5() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (obj): False},
    ///     {@code (obj instanceof ZonedChronology == false): False}
    /// invoke:
    ///     {@link org.joda.time.chrono.ZonedChronology#getBase()} 4 times,
    ///     {@link java.lang.Object#equals(java.lang.Object)} twice,
    ///     {@link org.joda.time.chrono.ZonedChronology#getZone()} 4 times,
    ///     {@link org.joda.time.DateTimeZone#equals(java.lang.Object)} twice
    /// return from: {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        String iID = "";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_4() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStandardOffset", -1);
        String iID = "";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_5() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iSaveMillis", -1);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        String iID = "";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_6() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iStartRecurrence);
        String iID = "";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iStartRecurrence);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        String iID = "";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_7() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\uFFFF');
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_8() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_10() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMonthOfYear", -1);
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_11() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iDayOfWeek", -1);
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_12() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iDayOfMonth", -1);
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_13() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iAdvance", true);
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_14() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMillisOfDay", -1);
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone());}
 *  */
    @Test
    public void testEquals_ReturnGetBaseEqualsAndGetZoneEquals_9() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getZone().equals(chrono.getZone())
 *  */
    @Test
    public void testEquals_ThrowClassCastException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: getZone().equals(chrono.getZone())
 *  */
    @Test
    public void testEquals_ThrowClassCastException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        short[] iParam = {};
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.ClassCastException: class [S cannot be cast to class org.joda.time.DateTimeZone ([S is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBase().equals(chrono.getBase()) && getZone().equals(chrono.getZone())
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:245) */
        zonedChronology.equals(zonedChronology1);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#equals(java.lang.Object)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getZone().equals(chrono.getZone())
 *  */
    @Test
    public void testEquals_ThrowNullPointerException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone3 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID1 = "";
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iID1);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iStartRecurrence);
        String iID = "";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        String iID1 = "";
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iID1);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone3 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone4 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone5 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iZone4, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone5);
        setField(iZone3, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone4);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iZone1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone6 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone7 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone8 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone9 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone10 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iZone10, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone5);
        setField(iZone9, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone10);
        setField(iZone8, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone9);
        setField(iZone7, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone8);
        setField(iZone6, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone7);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone6);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testEquals4() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone3 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone4 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iZone3, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone4);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iZone1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iZone);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertFalse(actual);
    }
    
    @Test
    public void testEquals5() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        Object iEndRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iEndRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        setField(iEndRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iEndRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iEndRecurrence);
        Object iEndRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iEndRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        setField(iEndRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iEndRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        boolean actual = zonedChronology.equals(zonedChronology1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test(expected = StackOverflowError.class)
    public void testEquals6() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iParam);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iParam1);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        zonedChronology.equals(zonedChronology1);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testEquals7() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iParam);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iParam1);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        zonedChronology.equals(zonedChronology1);
    }
    
    @Test
    public void testEquals8() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        String iID = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        String iID1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iID1);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.equals(DateTimeZoneBuilder.java:1291)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    
    @Test
    public void testEquals9() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        String iNameKey = "\u0000\u0000";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        String iNameKey1 = "\u0000\u0000";
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey1);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$Recurrence.equals(DateTimeZoneBuilder.java:788)
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.equals(DateTimeZoneBuilder.java:1291)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    
    @Test
    public void testEquals10() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        BaseChronology iBase = ((BaseChronology) createInstance("org.joda.time.DateTimeZone$1"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone3 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone4 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone5 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iZone4, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone5);
        setField(iZone3, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone4);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iZone1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone6 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone7 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone8 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone9 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone10 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone11 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iZone10, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone11);
        setField(iZone9, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone10);
        setField(iZone8, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone9);
        setField(iZone7, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone8);
        setField(iZone6, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone7);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone6);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.tz.FixedDateTimeZone.equals(FixedDateTimeZone.java:94)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    
    @Test
    public void testEquals11() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "\u0000";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear1, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear1);
        String iNameKey1 = "\u0000";
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey1);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.equals(DateTimeZoneBuilder.java:1292)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    
    @Test
    public void testEquals12() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey = "\u0000";
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey);
        setField(iZone1, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone1, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone2 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone3 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence1 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        String iNameKey1 = "\u0000";
        setField(iStartRecurrence1, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iNameKey", iNameKey1);
        setField(iZone3, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence1);
        setField(iZone3, "org.joda.time.DateTimeZone", "iID", iNameKey);
        setField(iZone2, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.equals(DateTimeZoneBuilder.java:1292)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    
    @Test
    public void testEquals13() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone2 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iZone2, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        Object iEndRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iZone2, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iEndRecurrence);
        String iID = "";
        setField(iZone2, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone2);
        setField(iZone, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone1);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        ZonedChronology zonedChronology1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone3 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        CachedDateTimeZone iZone4 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        Object iZone5 = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(iZone5, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iZone5, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iStartRecurrence);
        setField(iZone5, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iZone4, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone5);
        setField(iZone3, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone4);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone3);
        setField(zonedChronology1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.equals] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$Recurrence.equals(DateTimeZoneBuilder.java:787)
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.equals(DateTimeZoneBuilder.java:1292)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.tz.CachedDateTimeZone.equals(CachedDateTimeZone.java:139)
            org.joda.time.chrono.ZonedChronology.equals(ZonedChronology.java:246) */
        zonedChronology.equals(zonedChronology1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.AssembledChronology.getZone(AssembledChronology.java:108)
            org.joda.time.chrono.ISOChronology.toString(ISOChronology.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        int[] iParam = {};
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.ClassCastException: class [I cannot be cast to class org.joda.time.DateTimeZone ([I is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.GJChronology.getZone(GJChronology.java:294)
            org.joda.time.chrono.AssembledChronology.getZone(AssembledChronology.java:108)
            org.joda.time.chrono.ISOChronology.toString(ISOChronology.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.toString();
    }
    
    @Test
    public void testToString2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        LenientChronology iBase1 = ((LenientChronology) createInstance("org.joda.time.chrono.LenientChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString4() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        StrictChronology iBase2 = ((StrictChronology) createInstance("org.joda.time.chrono.StrictChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString5() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString6() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString7() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString8() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString9() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    
    @Test
    public void testToString10() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.toString] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.toString(ZonedChronology.java:265) */
        zonedChronology.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.hashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#hashCode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return 326565 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
 *  */
    @Test
    public void testHashCode_ThrowClassCastException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#hashCode()}
 * @utbot.invokes {@link java.lang.Object#hashCode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return 326565 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
 *  */
    @Test
    public void testHashCode_ThrowClassCastException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        short[] iParam = {};
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam1 = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iZone, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iParam1, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.ClassCastException: class [S cannot be cast to class org.joda.time.DateTimeZone ([S is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 326565 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 326565 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 326565 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iZone, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        int actual = zonedChronology.hashCode();
        
        assertEquals(6523042, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        int actual = zonedChronology.hashCode();
        
        assertEquals(6523042, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test(expected = StackOverflowError.class)
    public void testHashCode3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode4() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("java.lang.Object");
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.joda.time.DateTimeZone (java.lang.Object is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.AssembledChronology.getZone(AssembledChronology.java:108)
            org.joda.time.chrono.ISOChronology.hashCode(ISOChronology.java:200)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode5() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        StrictChronology iBase1 = ((StrictChronology) createInstance("org.joda.time.chrono.StrictChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ISOChronology.hashCode(ISOChronology.java:200)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode6() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.tz.FixedDateTimeZone.hashCode(FixedDateTimeZone.java:102)
            org.joda.time.chrono.ISOChronology.hashCode(ISOChronology.java:200)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode7() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam1 = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam1, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam1);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.tz.FixedDateTimeZone.hashCode(FixedDateTimeZone.java:102)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode8() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iParam, "org.joda.time.DateTimeZone", "iID", iID);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ISOChronology.hashCode(ISOChronology.java:200)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode9() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        StrictChronology iBase2 = ((StrictChronology) createInstance("org.joda.time.chrono.StrictChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iZone, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ISOChronology.hashCode(ISOChronology.java:200)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode10() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iZone, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ISOChronology.hashCode(ISOChronology.java:200)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    
    @Test
    public void testHashCode11() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        FixedDateTimeZone iZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        String iID = "";
        setField(iZone, "org.joda.time.DateTimeZone", "iID", iID);
        setField(iParam, "org.joda.time.tz.CachedDateTimeZone", "iZone", iZone);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.hashCode] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ISOChronology.hashCode(ISOChronology.java:200)
            org.joda.time.chrono.ZonedChronology.hashCode(ZonedChronology.java:256) */
        zonedChronology.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.getInstance
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstance(org.joda.time.Chronology, org.joda.time.DateTimeZone)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getInstance(org.joda.time.Chronology,org.joda.time.DateTimeZone)}
 * @utbot.executesCondition {@code (base == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: base == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_ThrowIllegalArgumentException() {
        ZonedChronology.getInstance(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getInstance(org.joda.time.Chronology,org.joda.time.DateTimeZone)}
 * @utbot.executesCondition {@code (base == null): False}
 * @utbot.executesCondition {@code (base == null): False}
 * @utbot.executesCondition {@code (zone == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: zone == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_ThrowIllegalArgumentException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        ZonedChronology.getInstance(zonedChronology, null);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getInstance(org.joda.time.Chronology,org.joda.time.DateTimeZone)}
 * @utbot.executesCondition {@code (base == null): False}
 * @utbot.executesCondition {@code (base == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: base == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance_ThrowIllegalArgumentException_2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        ZonedChronology.getInstance(zonedChronology, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstance(org.joda.time.Chronology, org.joda.time.DateTimeZone)
    
    @Test
    public void testGetInstance1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone fixedDateTimeZone = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        
        ZonedChronology actual = ZonedChronology.getInstance(zonedChronology, fixedDateTimeZone);
        
        ZonedChronology expected = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iParam", fixedDateTimeZone);
        UnsupportedDurationField iMillis = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        HashMap cCache = new HashMap();
        Object standardDurationFieldType = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 1);
        String iName = "eras";
        setField(standardDurationFieldType, "org.joda.time.DurationFieldType", "iName", iName);
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType);
        cCache.put(standardDurationFieldType, unsupportedDurationField);
        Object standardDurationFieldType1 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 5);
        String iName1 = "months";
        setField(standardDurationFieldType1, "org.joda.time.DurationFieldType", "iName", iName1);
        UnsupportedDurationField unsupportedDurationField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField1, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType1);
        cCache.put(standardDurationFieldType1, unsupportedDurationField1);
        Object standardDurationFieldType2 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 7);
        String iName2 = "days";
        setField(standardDurationFieldType2, "org.joda.time.DurationFieldType", "iName", iName2);
        UnsupportedDurationField unsupportedDurationField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField2, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType2);
        cCache.put(standardDurationFieldType2, unsupportedDurationField2);
        Object standardDurationFieldType3 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 11);
        String iName3 = "seconds";
        setField(standardDurationFieldType3, "org.joda.time.DurationFieldType", "iName", iName3);
        UnsupportedDurationField unsupportedDurationField3 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField3, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType3);
        cCache.put(standardDurationFieldType3, unsupportedDurationField3);
        Object standardDurationFieldType4 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 3);
        String iName4 = "weekyears";
        setField(standardDurationFieldType4, "org.joda.time.DurationFieldType", "iName", iName4);
        UnsupportedDurationField unsupportedDurationField4 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField4, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType4);
        cCache.put(standardDurationFieldType4, unsupportedDurationField4);
        Object standardDurationFieldType5 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 4);
        String iName5 = "years";
        setField(standardDurationFieldType5, "org.joda.time.DurationFieldType", "iName", iName5);
        UnsupportedDurationField unsupportedDurationField5 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField5, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType5);
        cCache.put(standardDurationFieldType5, unsupportedDurationField5);
        Object standardDurationFieldType6 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 9);
        String iName6 = "hours";
        setField(standardDurationFieldType6, "org.joda.time.DurationFieldType", "iName", iName6);
        UnsupportedDurationField unsupportedDurationField6 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField6, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField6, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType6);
        cCache.put(standardDurationFieldType6, unsupportedDurationField6);
        Object standardDurationFieldType7 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 2);
        String iName7 = "centuries";
        setField(standardDurationFieldType7, "org.joda.time.DurationFieldType", "iName", iName7);
        UnsupportedDurationField unsupportedDurationField7 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField7, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField7, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType7);
        cCache.put(standardDurationFieldType7, unsupportedDurationField7);
        Object standardDurationFieldType8 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType8, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 10);
        String iName8 = "minutes";
        setField(standardDurationFieldType8, "org.joda.time.DurationFieldType", "iName", iName8);
        UnsupportedDurationField unsupportedDurationField8 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField8, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField8, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType8);
        cCache.put(standardDurationFieldType8, unsupportedDurationField8);
        Object standardDurationFieldType9 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType9, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 8);
        String iName9 = "halfdays";
        setField(standardDurationFieldType9, "org.joda.time.DurationFieldType", "iName", iName9);
        UnsupportedDurationField unsupportedDurationField9 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField9, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField9, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType9);
        cCache.put(standardDurationFieldType9, unsupportedDurationField9);
        Object standardDurationFieldType10 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType10, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 6);
        String iName10 = "weeks";
        setField(standardDurationFieldType10, "org.joda.time.DurationFieldType", "iName", iName10);
        UnsupportedDurationField unsupportedDurationField10 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(unsupportedDurationField10, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(unsupportedDurationField10, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType10);
        cCache.put(standardDurationFieldType10, unsupportedDurationField10);
        Object standardDurationFieldType11 = createInstance("org.joda.time.DurationFieldType$StandardDurationFieldType");
        setField(standardDurationFieldType11, "org.joda.time.DurationFieldType$StandardDurationFieldType", "iOrdinal", (byte) 12);
        String iName11 = "millis";
        setField(standardDurationFieldType11, "org.joda.time.DurationFieldType", "iName", iName11);
        cCache.put(standardDurationFieldType11, iMillis);
        setField(iMillis, "org.joda.time.field.UnsupportedDurationField", "cCache", cCache);
        setField(iMillis, "org.joda.time.field.UnsupportedDurationField", "iType", standardDurationFieldType11);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillis", iMillis);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iSeconds", unsupportedDurationField3);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinutes", unsupportedDurationField8);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHours", unsupportedDurationField6);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHalfdays", unsupportedDurationField9);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDays", unsupportedDurationField2);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeeks", unsupportedDurationField10);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyears", unsupportedDurationField4);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMonths", unsupportedDurationField1);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYears", unsupportedDurationField5);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iCenturies", unsupportedDurationField7);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iEras", unsupportedDurationField);
        UnsupportedDateTimeField iMillisOfSecond = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        HashMap cCache1 = new HashMap();
        Object standardDateTimeFieldType = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 5);
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType5);
        String iName12 = "year";
        setField(standardDateTimeFieldType, "org.joda.time.DateTimeFieldType", "iName", iName12);
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType);
        setField(unsupportedDateTimeField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField5);
        cCache1.put(standardDateTimeFieldType, unsupportedDateTimeField);
        Object standardDateTimeFieldType1 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType1, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 1);
        setField(standardDateTimeFieldType1, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType);
        String iName13 = "era";
        setField(standardDateTimeFieldType1, "org.joda.time.DateTimeFieldType", "iName", iName13);
        UnsupportedDateTimeField unsupportedDateTimeField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType1);
        setField(unsupportedDateTimeField1, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField);
        cCache1.put(standardDateTimeFieldType1, unsupportedDateTimeField1);
        Object standardDateTimeFieldType2 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 12);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType10);
        String iName14 = "dayOfWeek";
        setField(standardDateTimeFieldType2, "org.joda.time.DateTimeFieldType", "iName", iName14);
        UnsupportedDateTimeField unsupportedDateTimeField2 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType2);
        setField(unsupportedDateTimeField2, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache1.put(standardDateTimeFieldType2, unsupportedDateTimeField2);
        Object standardDateTimeFieldType3 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 6);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName15 = "dayOfYear";
        setField(standardDateTimeFieldType3, "org.joda.time.DateTimeFieldType", "iName", iName15);
        UnsupportedDateTimeField unsupportedDateTimeField3 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType3);
        setField(unsupportedDateTimeField3, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache1.put(standardDateTimeFieldType3, unsupportedDateTimeField3);
        Object standardDateTimeFieldType4 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 22);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType11);
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType2);
        String iName16 = "millisOfDay";
        setField(standardDateTimeFieldType4, "org.joda.time.DateTimeFieldType", "iName", iName16);
        UnsupportedDateTimeField unsupportedDateTimeField4 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType4);
        setField(unsupportedDateTimeField4, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iMillis);
        cCache1.put(standardDateTimeFieldType4, unsupportedDateTimeField4);
        Object standardDateTimeFieldType5 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 4);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType5);
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType7);
        String iName17 = "yearOfCentury";
        setField(standardDateTimeFieldType5, "org.joda.time.DateTimeFieldType", "iName", iName17);
        UnsupportedDateTimeField unsupportedDateTimeField5 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType5);
        setField(unsupportedDateTimeField5, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField5);
        cCache1.put(standardDateTimeFieldType5, unsupportedDateTimeField5);
        Object standardDateTimeFieldType6 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 18);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType8);
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType2);
        String iName18 = "minuteOfDay";
        setField(standardDateTimeFieldType6, "org.joda.time.DateTimeFieldType", "iName", iName18);
        UnsupportedDateTimeField unsupportedDateTimeField6 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType6);
        setField(unsupportedDateTimeField6, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField8);
        cCache1.put(standardDateTimeFieldType6, unsupportedDateTimeField6);
        Object standardDateTimeFieldType7 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 14);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType6);
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType9);
        String iName19 = "hourOfHalfday";
        setField(standardDateTimeFieldType7, "org.joda.time.DateTimeFieldType", "iName", iName19);
        UnsupportedDateTimeField unsupportedDateTimeField7 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType7);
        setField(unsupportedDateTimeField7, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField6);
        cCache1.put(standardDateTimeFieldType7, unsupportedDateTimeField7);
        Object standardDateTimeFieldType8 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 20);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType2);
        String iName20 = "secondOfDay";
        setField(standardDateTimeFieldType8, "org.joda.time.DateTimeFieldType", "iName", iName20);
        UnsupportedDateTimeField unsupportedDateTimeField8 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType8);
        setField(unsupportedDateTimeField8, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache1.put(standardDateTimeFieldType8, unsupportedDateTimeField8);
        Object standardDateTimeFieldType9 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 16);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType6);
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType2);
        String iName21 = "clockhourOfDay";
        setField(standardDateTimeFieldType9, "org.joda.time.DateTimeFieldType", "iName", iName21);
        UnsupportedDateTimeField unsupportedDateTimeField9 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType9);
        setField(unsupportedDateTimeField9, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField6);
        cCache1.put(standardDateTimeFieldType9, unsupportedDateTimeField9);
        Object standardDateTimeFieldType10 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 9);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType7);
        String iName22 = "weekyearOfCentury";
        setField(standardDateTimeFieldType10, "org.joda.time.DateTimeFieldType", "iName", iName22);
        UnsupportedDateTimeField unsupportedDateTimeField10 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType10);
        setField(unsupportedDateTimeField10, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache1.put(standardDateTimeFieldType10, unsupportedDateTimeField10);
        Object standardDateTimeFieldType11 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 11);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType10);
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType4);
        String iName23 = "weekOfWeekyear";
        setField(standardDateTimeFieldType11, "org.joda.time.DateTimeFieldType", "iName", iName23);
        UnsupportedDateTimeField unsupportedDateTimeField11 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField11, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField11, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType11);
        setField(unsupportedDateTimeField11, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField10);
        cCache1.put(standardDateTimeFieldType11, unsupportedDateTimeField11);
        Object standardDateTimeFieldType12 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 3);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType7);
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName24 = "centuryOfEra";
        setField(standardDateTimeFieldType12, "org.joda.time.DateTimeFieldType", "iName", iName24);
        UnsupportedDateTimeField unsupportedDateTimeField12 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField12, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField12, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType12);
        setField(unsupportedDateTimeField12, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField7);
        cCache1.put(standardDateTimeFieldType12, unsupportedDateTimeField12);
        Object standardDateTimeFieldType13 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 19);
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType8);
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType6);
        String iName25 = "minuteOfHour";
        setField(standardDateTimeFieldType13, "org.joda.time.DateTimeFieldType", "iName", iName25);
        UnsupportedDateTimeField unsupportedDateTimeField13 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField13, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField13, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType13);
        setField(unsupportedDateTimeField13, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField8);
        cCache1.put(standardDateTimeFieldType13, unsupportedDateTimeField13);
        Object standardDateTimeFieldType14 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 15);
        setField(standardDateTimeFieldType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType6);
        setField(standardDateTimeFieldType14, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType9);
        String iName26 = "clockhourOfHalfday";
        setField(standardDateTimeFieldType14, "org.joda.time.DateTimeFieldType", "iName", iName26);
        UnsupportedDateTimeField unsupportedDateTimeField14 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField14, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField14, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType14);
        setField(unsupportedDateTimeField14, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField6);
        cCache1.put(standardDateTimeFieldType14, unsupportedDateTimeField14);
        Object standardDateTimeFieldType15 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 21);
        setField(standardDateTimeFieldType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType3);
        setField(standardDateTimeFieldType15, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType8);
        String iName27 = "secondOfMinute";
        setField(standardDateTimeFieldType15, "org.joda.time.DateTimeFieldType", "iName", iName27);
        UnsupportedDateTimeField unsupportedDateTimeField15 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField15, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField15, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType15);
        setField(unsupportedDateTimeField15, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField3);
        cCache1.put(standardDateTimeFieldType15, unsupportedDateTimeField15);
        Object standardDateTimeFieldType16 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 17);
        setField(standardDateTimeFieldType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType6);
        setField(standardDateTimeFieldType16, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType2);
        String iName28 = "hourOfDay";
        setField(standardDateTimeFieldType16, "org.joda.time.DateTimeFieldType", "iName", iName28);
        UnsupportedDateTimeField unsupportedDateTimeField16 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField16, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField16, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType16);
        setField(unsupportedDateTimeField16, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField6);
        cCache1.put(standardDateTimeFieldType16, unsupportedDateTimeField16);
        Object standardDateTimeFieldType17 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 13);
        setField(standardDateTimeFieldType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType9);
        setField(standardDateTimeFieldType17, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType2);
        String iName29 = "halfdayOfDay";
        setField(standardDateTimeFieldType17, "org.joda.time.DateTimeFieldType", "iName", iName29);
        UnsupportedDateTimeField unsupportedDateTimeField17 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField17, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField17, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType17);
        setField(unsupportedDateTimeField17, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField9);
        cCache1.put(standardDateTimeFieldType17, unsupportedDateTimeField17);
        Object standardDateTimeFieldType18 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 2);
        setField(standardDateTimeFieldType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType5);
        setField(standardDateTimeFieldType18, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType);
        String iName30 = "yearOfEra";
        setField(standardDateTimeFieldType18, "org.joda.time.DateTimeFieldType", "iName", iName30);
        UnsupportedDateTimeField unsupportedDateTimeField18 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField18, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField18, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType18);
        setField(unsupportedDateTimeField18, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField5);
        cCache1.put(standardDateTimeFieldType18, unsupportedDateTimeField18);
        Object standardDateTimeFieldType19 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 8);
        setField(standardDateTimeFieldType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType2);
        setField(standardDateTimeFieldType19, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType1);
        String iName31 = "dayOfMonth";
        setField(standardDateTimeFieldType19, "org.joda.time.DateTimeFieldType", "iName", iName31);
        UnsupportedDateTimeField unsupportedDateTimeField19 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField19, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField19, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType19);
        setField(unsupportedDateTimeField19, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField2);
        cCache1.put(standardDateTimeFieldType19, unsupportedDateTimeField19);
        Object standardDateTimeFieldType20 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 7);
        setField(standardDateTimeFieldType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType1);
        setField(standardDateTimeFieldType20, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType5);
        String iName32 = "monthOfYear";
        setField(standardDateTimeFieldType20, "org.joda.time.DateTimeFieldType", "iName", iName32);
        UnsupportedDateTimeField unsupportedDateTimeField20 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField20, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField20, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType20);
        setField(unsupportedDateTimeField20, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField1);
        cCache1.put(standardDateTimeFieldType20, unsupportedDateTimeField20);
        Object standardDateTimeFieldType21 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 23);
        setField(standardDateTimeFieldType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType11);
        setField(standardDateTimeFieldType21, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iRangeType", standardDurationFieldType3);
        String iName33 = "millisOfSecond";
        setField(standardDateTimeFieldType21, "org.joda.time.DateTimeFieldType", "iName", iName33);
        cCache1.put(standardDateTimeFieldType21, iMillisOfSecond);
        Object standardDateTimeFieldType22 = createInstance("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        setField(standardDateTimeFieldType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iOrdinal", (byte) 10);
        setField(standardDateTimeFieldType22, "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", "iUnitType", standardDurationFieldType4);
        String iName34 = "weekyear";
        setField(standardDateTimeFieldType22, "org.joda.time.DateTimeFieldType", "iName", iName34);
        UnsupportedDateTimeField unsupportedDateTimeField21 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(unsupportedDateTimeField21, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(unsupportedDateTimeField21, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType22);
        setField(unsupportedDateTimeField21, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", unsupportedDurationField4);
        cCache1.put(standardDateTimeFieldType22, unsupportedDateTimeField21);
        setField(iMillisOfSecond, "org.joda.time.field.UnsupportedDateTimeField", "cCache", cCache1);
        setField(iMillisOfSecond, "org.joda.time.field.UnsupportedDateTimeField", "iType", standardDateTimeFieldType21);
        setField(iMillisOfSecond, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField", iMillis);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillisOfSecond", iMillisOfSecond);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMillisOfDay", unsupportedDateTimeField4);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iSecondOfMinute", unsupportedDateTimeField15);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iSecondOfDay", unsupportedDateTimeField8);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinuteOfHour", unsupportedDateTimeField13);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMinuteOfDay", unsupportedDateTimeField6);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHourOfDay", unsupportedDateTimeField16);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iClockhourOfDay", unsupportedDateTimeField9);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHourOfHalfday", unsupportedDateTimeField7);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iClockhourOfHalfday", unsupportedDateTimeField14);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iHalfdayOfDay", unsupportedDateTimeField17);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfWeek", unsupportedDateTimeField2);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfMonth", unsupportedDateTimeField19);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iDayOfYear", unsupportedDateTimeField3);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekOfWeekyear", unsupportedDateTimeField11);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyear", unsupportedDateTimeField21);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iWeekyearOfCentury", unsupportedDateTimeField10);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iMonthOfYear", unsupportedDateTimeField20);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYear", unsupportedDateTimeField);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYearOfEra", unsupportedDateTimeField18);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iYearOfCentury", unsupportedDateTimeField5);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iCenturyOfEra", unsupportedDateTimeField12);
        setField(expected, "org.joda.time.chrono.AssembledChronology", "iEra", unsupportedDateTimeField1);
        
        // org.joda.time.chrono.ZonedChronology has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstance(org.joda.time.Chronology, org.joda.time.DateTimeZone)
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstance2() throws Exception  {
        ISOChronology iSOChronology = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        
        ZonedChronology.getInstance(iSOChronology, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.getZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getZone()
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getZone()}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getParam()}
 * @utbot.returnsFrom {@code return (DateTimeZone) getParam();}
 *  */
    @Test
    public void testGetZone_ZonedChronologyGetParam() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        DateTimeZone actual = zonedChronology.getZone();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getZone()
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getZone()}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getParam()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (DateTimeZone) getParam();
 *  */
    @Test
    public void testGetZone_ThrowClassCastException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getZone] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86) */
        zonedChronology.getZone();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.withZone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withZone(org.joda.time.DateTimeZone)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#withZone(org.joda.time.DateTimeZone)}
 * @utbot.executesCondition {@code (zone == null): False}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getParam()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithZone_ZoneNotEqualsNull() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone");
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class iParamType = Class.forName("org.joda.time.DateTimeZone");
        Method withZoneMethod = zonedChronologyClazz.getDeclaredMethod("withZone", iParamType);
        withZoneMethod.setAccessible(true);
        java.lang.Object[] withZoneMethodArguments = new java.lang.Object[1];
        withZoneMethodArguments[0] = iParam;
        ZonedChronology actual = ((ZonedChronology) withZoneMethod.invoke(zonedChronology, withZoneMethodArguments));
        
        // org.joda.time.chrono.ZonedChronology has overridden equals method
        assertEquals(zonedChronology, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withZone(org.joda.time.DateTimeZone)
    
    @Test
    public void testWithZone1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        Chronology actual = zonedChronology.withZone(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testWithZone2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        Chronology actual = zonedChronology.withZone(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.withUTC
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withUTC()
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#withUTC()}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getBase()}
 * @utbot.returnsFrom {@code return getBase();}
 *  */
    @Test
    public void testWithUTC_ZonedChronologyGetBase() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        Chronology actual = zonedChronology.withUTC();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.assemble
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method assemble(org.joda.time.chrono.AssembledChronology$Fields)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#assemble(org.joda.time.chrono.AssembledChronology.Fields)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fields.eras = convertField(fields.eras, converted);
 *  */
    @Test
    public void testAssemble_ThrowClassCastException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField eras = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.eras = eras;
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.assemble] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:206)
            org.joda.time.chrono.ZonedChronology.assemble(ZonedChronology.java:157) */
        zonedChronology.assemble(fields);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#assemble(org.joda.time.chrono.AssembledChronology.Fields)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fields.centuries = convertField(fields.centuries, converted);
 *  */
    @Test
    public void testAssemble_ThrowClassCastException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField centuries = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.centuries = centuries;
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.assemble] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:206)
            org.joda.time.chrono.ZonedChronology.assemble(ZonedChronology.java:158) */
        zonedChronology.assemble(fields);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#assemble(org.joda.time.chrono.AssembledChronology.Fields)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fields.weeks = convertField(fields.weeks, converted);
 *  */
    @Test
    public void testAssemble_ThrowClassCastException_2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        int[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        DelegatedDurationField weeks = ((DelegatedDurationField) createInstance("org.joda.time.field.DelegatedDurationField"));
        MillisDurationField iField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(weeks, "org.joda.time.field.DelegatedDurationField", "iField", iField);
        fields.weeks = weeks;
        UnsupportedDurationField weekyears = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.weekyears = weekyears;
        fields.months = weekyears;
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.assemble] produces [java.lang.ClassCastException: class [I cannot be cast to class org.joda.time.DateTimeZone ([I is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:206)
            org.joda.time.chrono.ZonedChronology.assemble(ZonedChronology.java:162) */
        zonedChronology.assemble(fields);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#assemble(org.joda.time.chrono.AssembledChronology.Fields)}
 * @utbot.invokes org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DurationField,java.util.HashMap)
 * @utbot.invokes org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DurationField,java.util.HashMap)
 * @utbot.invokes org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DurationField,java.util.HashMap)
 * @utbot.throwsException {@link java.lang.ClassCastException} in: fields.hours = convertField(fields.hours, converted);
 *  */
    @Test
    public void testAssemble_ThrowClassCastException_3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField hours = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.hours = hours;
        UnsupportedDurationField halfdays = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.halfdays = halfdays;
        UnsupportedDurationField eras = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.eras = eras;
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.assemble] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:206)
            org.joda.time.chrono.ZonedChronology.assemble(ZonedChronology.java:166) */
        zonedChronology.assemble(fields);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#assemble(org.joda.time.chrono.AssembledChronology.Fields)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: fields.eras = convertField(fields.eras, converted);
 *  */
    @Test
    public void testAssemble_ThrowNullPointerException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.assemble] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.assemble(ZonedChronology.java:157) */
        zonedChronology.assemble(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method assemble(org.joda.time.chrono.AssembledChronology$Fields)
    
    @Test
    public void testAssemble1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField weekyears = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.weekyears = weekyears;
        
        DurationField initialFieldsWeekyears = fields.weekyears;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsWeekyears = fields.weekyears;
        
        assertFalse(initialFieldsWeekyears == finalFieldsWeekyears);
    }
    
    @Test
    public void testAssemble2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField weeks = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.weeks = weeks;
        UnsupportedDurationField centuries = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.centuries = centuries;
        
        DurationField initialFieldsWeeks = fields.weeks;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsWeeks = fields.weeks;
        
        assertFalse(initialFieldsWeeks == finalFieldsWeeks);
    }
    
    @Test
    public void testAssemble3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField halfdays = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.halfdays = halfdays;
        UnsupportedDurationField centuries = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.centuries = centuries;
        
        DurationField initialFieldsHalfdays = fields.halfdays;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsHalfdays = fields.halfdays;
        
        assertFalse(initialFieldsHalfdays == finalFieldsHalfdays);
    }
    
    @Test
    public void testAssemble4() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField halfdays = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.halfdays = halfdays;
        UnsupportedDurationField weeks = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.weeks = weeks;
        fields.weekyears = weeks;
        
        DurationField initialFieldsHalfdays = fields.halfdays;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsHalfdays = fields.halfdays;
        
        assertFalse(initialFieldsHalfdays == finalFieldsHalfdays);
    }
    
    @Test
    public void testAssemble5() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField weeks = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.weeks = weeks;
        UnsupportedDurationField months = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.months = months;
        fields.years = months;
        
        DurationField initialFieldsWeeks = fields.weeks;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsWeeks = fields.weeks;
        
        assertFalse(initialFieldsWeeks == finalFieldsWeeks);
    }
    
    @Test
    public void testAssemble6() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField hours = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.hours = hours;
        UnsupportedDurationField days = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.days = days;
        fields.months = days;
        
        DurationField initialFieldsHours = fields.hours;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsHours = fields.hours;
        
        assertFalse(initialFieldsHours == finalFieldsHours);
    }
    
    @Test
    public void testAssemble7() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField minutes = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.minutes = minutes;
        UnsupportedDurationField days = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.days = days;
        fields.months = days;
        
        DurationField initialFieldsMinutes = fields.minutes;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsMinutes = fields.minutes;
        
        assertFalse(initialFieldsMinutes == finalFieldsMinutes);
    }
    
    @Test
    public void testAssemble8() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField halfdays = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.halfdays = halfdays;
        UnsupportedDurationField weeks = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.weeks = weeks;
        fields.eras = weeks;
        
        DurationField initialFieldsHalfdays = fields.halfdays;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsHalfdays = fields.halfdays;
        
        assertFalse(initialFieldsHalfdays == finalFieldsHalfdays);
    }
    
    @Test
    public void testAssemble9() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField days = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.days = days;
        UnsupportedDurationField weeks = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.weeks = weeks;
        fields.centuries = weeks;
        
        DurationField initialFieldsDays = fields.days;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsDays = fields.days;
        
        assertFalse(initialFieldsDays == finalFieldsDays);
    }
    
    @Test
    public void testAssemble10() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField months = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.months = months;
        UnsupportedDurationField years = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.years = years;
        fields.centuries = years;
        
        DurationField initialFieldsMonths = fields.months;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsMonths = fields.months;
        
        assertFalse(initialFieldsMonths == finalFieldsMonths);
    }
    
    @Test
    public void testAssemble11() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField weekyears = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.weekyears = weekyears;
        UnsupportedDurationField months = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.months = months;
        fields.centuries = months;
        
        DurationField initialFieldsWeekyears = fields.weekyears;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsWeekyears = fields.weekyears;
        
        assertFalse(initialFieldsWeekyears == finalFieldsWeekyears);
    }
    
    @Test
    public void testAssemble12() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField months = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.months = months;
        UnsupportedDurationField years = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.years = years;
        
        DurationField initialFieldsMonths = fields.months;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsMonths = fields.months;
        
        assertFalse(initialFieldsMonths == finalFieldsMonths);
    }
    
    @Test
    public void testAssemble13() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField months = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.months = months;
        UnsupportedDurationField years = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.years = years;
        fields.centuries = years;
        fields.eras = years;
        
        DurationField initialFieldsMonths = fields.months;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsMonths = fields.months;
        
        assertFalse(initialFieldsMonths == finalFieldsMonths);
    }
    
    @Test
    public void testAssemble14() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField days = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.days = days;
        UnsupportedDurationField years = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.years = years;
        fields.centuries = years;
        fields.eras = years;
        
        DurationField initialFieldsDays = fields.days;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsDays = fields.days;
        
        assertFalse(initialFieldsDays == finalFieldsDays);
    }
    
    @Test
    public void testAssemble15() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField weeks = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.weeks = weeks;
        UnsupportedDurationField weekyears = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.weekyears = weekyears;
        fields.months = weekyears;
        fields.eras = weekyears;
        
        DurationField initialFieldsWeeks = fields.weeks;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsWeeks = fields.weeks;
        
        assertFalse(initialFieldsWeeks == finalFieldsWeeks);
    }
    
    @Test
    public void testAssemble16() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField years = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.years = years;
        UnsupportedDurationField centuries = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.centuries = centuries;
        
        DurationField initialFieldsYears = fields.years;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsYears = fields.years;
        
        assertFalse(initialFieldsYears == finalFieldsYears);
    }
    
    @Test
    public void testAssemble17() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField hours = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.hours = hours;
        UnsupportedDurationField halfdays = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.halfdays = halfdays;
        fields.eras = halfdays;
        
        DurationField initialFieldsHours = fields.hours;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsHours = fields.hours;
        
        assertFalse(initialFieldsHours == finalFieldsHours);
    }
    
    @Test
    public void testAssemble18() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField weekyears = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.weekyears = weekyears;
        UnsupportedDurationField months = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.months = months;
        fields.eras = months;
        
        DurationField initialFieldsWeekyears = fields.weekyears;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsWeekyears = fields.weekyears;
        
        assertFalse(initialFieldsWeekyears == finalFieldsWeekyears);
    }
    
    @Test
    public void testAssemble19() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField years = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.years = years;
        UnsupportedDurationField centuries = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.centuries = centuries;
        fields.eras = centuries;
        
        DurationField initialFieldsYears = fields.years;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsYears = fields.years;
        
        assertFalse(initialFieldsYears == finalFieldsYears);
    }
    
    @Test
    public void testAssemble20() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField days = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.days = days;
        DelegatedDurationField weeks = ((DelegatedDurationField) createInstance("org.joda.time.field.DelegatedDurationField"));
        UnsupportedDurationField iField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(weeks, "org.joda.time.field.DelegatedDurationField", "iField", iField);
        fields.weeks = weeks;
        fields.weekyears = iField;
        fields.months = iField;
        
        DurationField initialFieldsDays = fields.days;
        
        zonedChronology.assemble(fields);
        
        DurationField finalFieldsDays = fields.days;
        
        assertFalse(initialFieldsDays == finalFieldsDays);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method assemble(org.joda.time.chrono.AssembledChronology$Fields)
    
    @Test
    public void testAssemble21() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("java.lang.Object");
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        MillisDurationField days = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        fields.days = days;
        DelegatedDurationField weeks = ((DelegatedDurationField) createInstance("org.joda.time.field.DelegatedDurationField"));
        UnsupportedDurationField iField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(weeks, "org.joda.time.field.DelegatedDurationField", "iField", iField);
        fields.weeks = weeks;
        fields.weekyears = iField;
        fields.months = iField;
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.assemble] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class org.joda.time.DateTimeZone (java.lang.Object is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:206)
            org.joda.time.chrono.ZonedChronology.assemble(ZonedChronology.java:163) */
        zonedChronology.assemble(fields);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assemble(org.joda.time.chrono.AssembledChronology$Fields)
    
    @Test(expected = IllegalArgumentException.class)
    public void testAssemble22() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        AssembledChronology.Fields fields = new AssembledChronology.Fields();
        DelegatedDurationField days = ((DelegatedDurationField) createInstance("org.joda.time.field.DelegatedDurationField"));
        MillisDurationField iField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(days, "org.joda.time.field.DelegatedDurationField", "iField", iField);
        fields.days = days;
        UnsupportedDurationField weekyears = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        fields.weekyears = weekyears;
        fields.years = weekyears;
        
        zonedChronology.assemble(fields);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.useTimeArithmetic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method useTimeArithmetic(org.joda.time.DurationField)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_FieldEqualsNullAndFieldGetUnitMillisGreaterOrEqualDateTimeConstantsMILLIS_PER_HOURMultiply12() {
        boolean actual = ZonedChronology.useTimeArithmetic(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method useTimeArithmetic(org.joda.time.DurationField)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_ReturnFieldEqualsNullAndFieldGetUnitMillisGreaterOrEqualDateTimeConstantsMILLIS_PER_HOURMultiply12_1() throws Exception  {
        MillisDurationField millisDurationField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        
        boolean actual = ZonedChronology.useTimeArithmetic(millisDurationField);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_ReturnFieldEqualsNullAndFieldGetUnitMillisGreaterOrEqualDateTimeConstantsMILLIS_PER_HOURMultiply12_2() throws Exception  {
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        boolean actual = ZonedChronology.useTimeArithmetic(unsupportedDurationField);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_ReturnFieldEqualsNullAndFieldGetUnitMillisGreaterOrEqualDateTimeConstantsMILLIS_PER_HOURMultiply12() throws Exception  {
        Object linkedDurationField = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        MillisDurationField iField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(linkedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class linkedDurationFieldType = Class.forName("org.joda.time.DurationField");
        Method useTimeArithmeticMethod = zonedChronologyClazz.getDeclaredMethod("useTimeArithmetic", linkedDurationFieldType);
        useTimeArithmeticMethod.setAccessible(true);
        java.lang.Object[] useTimeArithmeticMethodArguments = new java.lang.Object[1];
        useTimeArithmeticMethodArguments[0] = linkedDurationField;
        boolean actual = ((Boolean) useTimeArithmeticMethod.invoke(null, useTimeArithmeticMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method useTimeArithmetic(org.joda.time.DurationField)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.joda.time.DurationField#getUnitMillis()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_FieldNotEqualsNullAndFieldGetUnitMillisLessThanDateTimeConstantsMILLIS_PER_HOURMultiply12() throws Exception  {
        DecoratedDurationField decoratedDurationField = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        MillisDurationField iField1 = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField, "org.joda.time.field.DecoratedDurationField", "iField", iField1);
        setField(decoratedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        boolean actual = ZonedChronology.useTimeArithmetic(decoratedDurationField);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_FieldNotEqualsNullAndFieldGetUnitMillisLessThanDateTimeConstantsMILLIS_PER_HOURMultiply12_1() throws Exception  {
        DecoratedDurationField decoratedDurationField = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        UnsupportedDurationField iField1 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField, "org.joda.time.field.DecoratedDurationField", "iField", iField1);
        setField(decoratedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        boolean actual = ZonedChronology.useTimeArithmetic(decoratedDurationField);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_FieldEqualsNullAndFieldGetUnitMillisGreaterOrEqualDateTimeConstantsMILLIS_PER_HOURMultiply12_1() throws Exception  {
        Object linkedDurationField = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        ScaledDurationField iField1 = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        setField(iField1, "org.joda.time.field.ScaledDurationField", "iScalar", 43200000);
        MillisDurationField iField2 = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField1, "org.joda.time.field.DecoratedDurationField", "iField", iField2);
        setField(iField, "org.joda.time.field.DecoratedDurationField", "iField", iField1);
        setField(linkedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class linkedDurationFieldType = Class.forName("org.joda.time.DurationField");
        Method useTimeArithmeticMethod = zonedChronologyClazz.getDeclaredMethod("useTimeArithmetic", linkedDurationFieldType);
        useTimeArithmeticMethod.setAccessible(true);
        java.lang.Object[] useTimeArithmeticMethodArguments = new java.lang.Object[1];
        useTimeArithmeticMethodArguments[0] = linkedDurationField;
        boolean actual = ((Boolean) useTimeArithmeticMethod.invoke(null, useTimeArithmeticMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_FieldNotEqualsNullAndFieldGetUnitMillisLessThanDateTimeConstantsMILLIS_PER_HOURMultiply12_2() throws Exception  {
        Object linkedDurationField = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        ScaledDurationField iField1 = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        UnsupportedDurationField iField2 = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        setField(iField1, "org.joda.time.field.DecoratedDurationField", "iField", iField2);
        setField(iField, "org.joda.time.field.DecoratedDurationField", "iField", iField1);
        setField(linkedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class linkedDurationFieldType = Class.forName("org.joda.time.DurationField");
        Method useTimeArithmeticMethod = zonedChronologyClazz.getDeclaredMethod("useTimeArithmetic", linkedDurationFieldType);
        useTimeArithmeticMethod.setAccessible(true);
        java.lang.Object[] useTimeArithmeticMethodArguments = new java.lang.Object[1];
        useTimeArithmeticMethodArguments[0] = linkedDurationField;
        boolean actual = ((Boolean) useTimeArithmeticMethod.invoke(null, useTimeArithmeticMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#useTimeArithmetic(org.joda.time.DurationField)}
 * @utbot.returnsFrom {@code return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;}
 *  */
    @Test
    public void testUseTimeArithmetic_FieldEqualsNullAndFieldGetUnitMillisGreaterOrEqualDateTimeConstantsMILLIS_PER_HOURMultiply12_2() throws Exception  {
        Object linkedDurationField = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        ScaledDurationField iField1 = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        setField(iField1, "org.joda.time.field.ScaledDurationField", "iScalar", 43200000);
        Object iField2 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        MillisDurationField iField3 = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        setField(iField2, "org.joda.time.field.DecoratedDurationField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DecoratedDurationField", "iField", iField2);
        setField(iField, "org.joda.time.field.DecoratedDurationField", "iField", iField1);
        setField(linkedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class linkedDurationFieldType = Class.forName("org.joda.time.DurationField");
        Method useTimeArithmeticMethod = zonedChronologyClazz.getDeclaredMethod("useTimeArithmetic", linkedDurationFieldType);
        useTimeArithmeticMethod.setAccessible(true);
        java.lang.Object[] useTimeArithmeticMethodArguments = new java.lang.Object[1];
        useTimeArithmeticMethodArguments[0] = linkedDurationField;
        boolean actual = ((Boolean) useTimeArithmeticMethod.invoke(null, useTimeArithmeticMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method useTimeArithmetic(org.joda.time.DurationField)
    
    @Test
    public void testUseTimeArithmetic1() throws Exception  {
        DecoratedDurationField decoratedDurationField = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField1 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField2 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField3 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField4 = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        DecoratedDurationField iField5 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField6 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField7 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField8 = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        DecoratedDurationField iField9 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField10 = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        DecoratedDurationField iField11 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField12 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField13 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        ScaledDurationField iField14 = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        DecoratedDurationField iField15 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField16 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField17 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField18 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField19 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField20 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField21 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField22 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField23 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField24 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField25 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        PreciseDurationField iField26 = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iField25, "org.joda.time.field.DecoratedDurationField", "iField", iField26);
        setField(iField24, "org.joda.time.field.DecoratedDurationField", "iField", iField25);
        setField(iField23, "org.joda.time.field.DecoratedDurationField", "iField", iField24);
        setField(iField22, "org.joda.time.field.DecoratedDurationField", "iField", iField23);
        setField(iField21, "org.joda.time.field.DecoratedDurationField", "iField", iField22);
        setField(iField20, "org.joda.time.field.DecoratedDurationField", "iField", iField21);
        setField(iField19, "org.joda.time.field.DecoratedDurationField", "iField", iField20);
        setField(iField18, "org.joda.time.field.DecoratedDurationField", "iField", iField19);
        setField(iField17, "org.joda.time.field.DecoratedDurationField", "iField", iField18);
        setField(iField16, "org.joda.time.field.DecoratedDurationField", "iField", iField17);
        setField(iField15, "org.joda.time.field.DecoratedDurationField", "iField", iField16);
        setField(iField14, "org.joda.time.field.DecoratedDurationField", "iField", iField15);
        setField(iField13, "org.joda.time.field.DecoratedDurationField", "iField", iField14);
        setField(iField12, "org.joda.time.field.DecoratedDurationField", "iField", iField13);
        setField(iField11, "org.joda.time.field.DecoratedDurationField", "iField", iField12);
        setField(iField10, "org.joda.time.field.DecoratedDurationField", "iField", iField11);
        setField(iField9, "org.joda.time.field.DecoratedDurationField", "iField", iField10);
        setField(iField8, "org.joda.time.field.DecoratedDurationField", "iField", iField9);
        setField(iField7, "org.joda.time.field.DecoratedDurationField", "iField", iField8);
        setField(iField6, "org.joda.time.field.DecoratedDurationField", "iField", iField7);
        setField(iField5, "org.joda.time.field.DecoratedDurationField", "iField", iField6);
        setField(iField4, "org.joda.time.field.DecoratedDurationField", "iField", iField5);
        setField(iField3, "org.joda.time.field.DecoratedDurationField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DecoratedDurationField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DecoratedDurationField", "iField", iField2);
        setField(iField, "org.joda.time.field.DecoratedDurationField", "iField", iField1);
        setField(decoratedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        boolean actual = ZonedChronology.useTimeArithmetic(decoratedDurationField);
        
        assertTrue(actual);
    }
    
    @Test
    public void testUseTimeArithmetic2() throws Exception  {
        Object linkedDurationField = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        ScaledDurationField iField1 = ((ScaledDurationField) createInstance("org.joda.time.field.ScaledDurationField"));
        Object iField2 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField3 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField4 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField5 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField6 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField7 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField8 = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        Object iField9 = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        DecoratedDurationField iField10 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField11 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField12 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField13 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField14 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField15 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField16 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField17 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField18 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        Object iField19 = createInstance("org.joda.time.chrono.LimitChronology$LimitDurationField");
        DecoratedDurationField iField20 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField21 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField22 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        Object iField23 = createInstance("org.joda.time.chrono.GJChronology$LinkedDurationField");
        DecoratedDurationField iField24 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField25 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        DecoratedDurationField iField26 = ((DecoratedDurationField) createInstance("org.joda.time.field.DecoratedDurationField"));
        PreciseDurationField iField27 = ((PreciseDurationField) createInstance("org.joda.time.field.PreciseDurationField"));
        setField(iField26, "org.joda.time.field.DecoratedDurationField", "iField", iField27);
        setField(iField25, "org.joda.time.field.DecoratedDurationField", "iField", iField26);
        setField(iField24, "org.joda.time.field.DecoratedDurationField", "iField", iField25);
        setField(iField23, "org.joda.time.field.DecoratedDurationField", "iField", iField24);
        setField(iField22, "org.joda.time.field.DecoratedDurationField", "iField", iField23);
        setField(iField21, "org.joda.time.field.DecoratedDurationField", "iField", iField22);
        setField(iField20, "org.joda.time.field.DecoratedDurationField", "iField", iField21);
        setField(iField19, "org.joda.time.field.DecoratedDurationField", "iField", iField20);
        setField(iField18, "org.joda.time.field.DecoratedDurationField", "iField", iField19);
        setField(iField17, "org.joda.time.field.DecoratedDurationField", "iField", iField18);
        setField(iField16, "org.joda.time.field.DecoratedDurationField", "iField", iField17);
        setField(iField15, "org.joda.time.field.DecoratedDurationField", "iField", iField16);
        setField(iField14, "org.joda.time.field.DecoratedDurationField", "iField", iField15);
        setField(iField13, "org.joda.time.field.DecoratedDurationField", "iField", iField14);
        setField(iField12, "org.joda.time.field.DecoratedDurationField", "iField", iField13);
        setField(iField11, "org.joda.time.field.DecoratedDurationField", "iField", iField12);
        setField(iField10, "org.joda.time.field.DecoratedDurationField", "iField", iField11);
        setField(iField9, "org.joda.time.field.DecoratedDurationField", "iField", iField10);
        setField(iField8, "org.joda.time.field.DecoratedDurationField", "iField", iField9);
        setField(iField7, "org.joda.time.field.DecoratedDurationField", "iField", iField8);
        setField(iField6, "org.joda.time.field.DecoratedDurationField", "iField", iField7);
        setField(iField5, "org.joda.time.field.DecoratedDurationField", "iField", iField6);
        setField(iField4, "org.joda.time.field.DecoratedDurationField", "iField", iField5);
        setField(iField3, "org.joda.time.field.DecoratedDurationField", "iField", iField4);
        setField(iField2, "org.joda.time.field.DecoratedDurationField", "iField", iField3);
        setField(iField1, "org.joda.time.field.DecoratedDurationField", "iField", iField2);
        setField(iField, "org.joda.time.field.DecoratedDurationField", "iField", iField1);
        setField(linkedDurationField, "org.joda.time.field.DecoratedDurationField", "iField", iField);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class linkedDurationFieldType = Class.forName("org.joda.time.DurationField");
        Method useTimeArithmeticMethod = zonedChronologyClazz.getDeclaredMethod("useTimeArithmetic", linkedDurationFieldType);
        useTimeArithmeticMethod.setAccessible(true);
        java.lang.Object[] useTimeArithmeticMethodArguments = new java.lang.Object[1];
        useTimeArithmeticMethodArguments[0] = linkedDurationField;
        boolean actual = ((Boolean) useTimeArithmeticMethod.invoke(null, useTimeArithmeticMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.getDateTimeMillis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateTimeMillis(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getDateTimeMillis(int,int,int,int)}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getBase()}
 * @utbot.invokes {@link org.joda.time.Chronology#getDateTimeMillis(int,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: year
 *  */
    @Test
    public void testGetDateTimeMillis_ThrowNullPointerException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDateTimeMillis(int, int, int, int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase4, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis4() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis5() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis6() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis7() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis8() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis9() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis10() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis11() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis12() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis13() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis14() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis15() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis16() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase2 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis17() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis18() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase2 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis19() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase3 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis20() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis21() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis22() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:332)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis23() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase4 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:102)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:122)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:154)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:337)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:111) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDateTimeMillis(int, int, int, int)
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis24() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis25() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis26() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iBase1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis27() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase1 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis28() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis29() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase2 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis30() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iBase2 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis31() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase3 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis32() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iBase3 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis33() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase1 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis34() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis35() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis36() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase2 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis37() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase3 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis38() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase3 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis39() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase3 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis40() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis41() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis42() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis43() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis44() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase5 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis45() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iBase5 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis46() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.getDateTimeMillis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateTimeMillis(long, int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getDateTimeMillis(long,int,int,int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: instant + getZone().getOffset(instant)
 *  */
    @Test
    public void testGetDateTimeMillis_ThrowClassCastException() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:130) */
        zonedChronology.getDateTimeMillis(-255L, -255, -255, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getDateTimeMillis(long,int,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: instant + getZone().getOffset(instant)
 *  */
    @Test
    public void testGetDateTimeMillis_ThrowNullPointerException1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:130) */
        zonedChronology.getDateTimeMillis(-255L, -255, -255, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getDateTimeMillis(long,int,int,int,int)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 * @utbot.invokes {@link org.joda.time.Chronology#getDateTimeMillis(long,int,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: instant + getZone().getOffset(instant)
 *  */
    @Test
    public void testGetDateTimeMillis_ThrowNullPointerException_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:130) */
        zonedChronology.getDateTimeMillis(-255L, -255, -255, -255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDateTimeMillis(long, int, int, int, int)
    
    @Test
    public void testGetDateTimeMillis47() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:151)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:111)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:130) */
        zonedChronology.getDateTimeMillis(0L, 0, 0, 0, 0);
    }
    
    @Test
    public void testGetDateTimeMillis48() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:130)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:130) */
        zonedChronology.getDateTimeMillis(0L, 0, 0, 0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.getDateTimeMillis
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDateTimeMillis(int, int, int, int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#getDateTimeMillis(int,int,int,int,int,int,int)}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getBase()}
 * @utbot.invokes {@link org.joda.time.Chronology#getDateTimeMillis(int,int,int,int,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: year
 *  */
    @Test
    public void testGetDateTimeMillis_ThrowNullPointerException2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDateTimeMillis(int, int, int, int, int, int, int)
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis49() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase2 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis50() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis51() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis52() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis53() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis54() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis55() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis56() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis57() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis58() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis59() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis60() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase4, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis61() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis62() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis63() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis64() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis65() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis66() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis67() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis68() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis69() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetDateTimeMillis70() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iGregorianChronology1);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis71() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis72() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase1 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis73() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase3 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis74() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase4 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis75() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase4 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis76() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis77() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis78() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis79() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase4 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:168)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:364)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis80() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase4 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:168)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:364)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis81() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ISOChronology iBase4 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:168)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:364)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis82() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase4 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:168)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:364)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis83() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ISOChronology iBase5 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:168)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:364)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test
    public void testGetDateTimeMillis84() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ISOChronology iBase3 = ((ISOChronology) createInstance("org.joda.time.chrono.ISOChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.getDateTimeMillis] produces [java.lang.NullPointerException]
            org.joda.time.chrono.BaseChronology.getDateTimeMillis(BaseChronology.java:132)
            org.joda.time.chrono.AssembledChronology.getDateTimeMillis(AssembledChronology.java:136)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:168)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:364)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:358)
            org.joda.time.chrono.BasicChronology.getDateTimeMillis(BasicChronology.java:168)
            org.joda.time.chrono.GregorianChronology.getDateTimeMillis(GregorianChronology.java:45)
            org.joda.time.chrono.GJChronology.getDateTimeMillis(GJChronology.java:364)
            org.joda.time.chrono.ZonedChronology.getDateTimeMillis(ZonedChronology.java:120) */
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDateTimeMillis(int, int, int, int, int, int, int)
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis85() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis86() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis87() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase1 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis88() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase3 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis89() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iBase3 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis90() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iBase3 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis91() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase3 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis92() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iBase3 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis93() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase2 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis94() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis95() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase4 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis96() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase3 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis97() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase3 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis98() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis99() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis100() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis101() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis102() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase3, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis103() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis104() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase1 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase3 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GregorianChronology iBase5 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis105() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase4 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase5 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase4, "org.joda.time.chrono.AssembledChronology", "iBase", iBase5);
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis106() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GJChronology iBase2 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        JulianChronology iBase3 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iBase2, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iBase1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    
    @Test(expected = IllegalFieldValueException.class)
    public void testGetDateTimeMillis107() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        GJChronology iBase = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        GJChronology iBase1 = ((GJChronology) createInstance("org.joda.time.chrono.GJChronology"));
        GregorianChronology iGregorianChronology1 = ((GregorianChronology) createInstance("org.joda.time.chrono.GregorianChronology"));
        ZonedChronology iBase2 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        ZonedChronology iBase3 = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        JulianChronology iBase4 = ((JulianChronology) createInstance("org.joda.time.chrono.JulianChronology"));
        setField(iBase3, "org.joda.time.chrono.AssembledChronology", "iBase", iBase4);
        setField(iBase2, "org.joda.time.chrono.AssembledChronology", "iBase", iBase3);
        setField(iGregorianChronology1, "org.joda.time.chrono.AssembledChronology", "iBase", iBase2);
        setField(iBase1, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology1);
        setField(iGregorianChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase1);
        setField(iBase, "org.joda.time.chrono.GJChronology", "iGregorianChronology", iGregorianChronology);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iBase", iBase);
        
        zonedChronology.getDateTimeMillis(-255, -255, -255, -255, -255, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.localToUTC
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method localToUTC(long)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#localToUTC(long)}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getZone()}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffsetFromLocal(long)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffset(long)}
 * @utbot.returnsFrom {@code return instant;}
 *  */
    @Test
    public void testLocalToUTC_DateTimeZoneGetOffset() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        FixedDateTimeZone iParam = ((FixedDateTimeZone) createInstance("org.joda.time.tz.FixedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = -255L;
        long actual = ((Long) localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments));
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method localToUTC(long)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#localToUTC(long)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: DateTimeZone zone = getZone();
 *  */
    @Test
    public void testLocalToUTC_ThrowClassCastException() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        int[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.localToUTC] produces [java.lang.ClassCastException: class [I cannot be cast to class org.joda.time.DateTimeZone ([I is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.localToUTC(ZonedChronology.java:139) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = -255L;
        try {
            localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#localToUTC(long)}
 * @utbot.invokes {@link org.joda.time.DateTimeZone#getOffsetFromLocal(long)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int offset = zone.getOffsetFromLocal(instant);
 *  */
    @Test
    public void testLocalToUTC_ThrowNullPointerException() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.localToUTC] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.localToUTC(ZonedChronology.java:140) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = -255L;
        try {
            localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method localToUTC(long)
    
    @Test
    public void testLocalToUTC1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", '\u0000');
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        setField(iParam, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iParam, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iStartRecurrence);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = 0L;
        long actual = ((Long) localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments));
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testLocalToUTC2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", 'w');
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        setField(iParam, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iParam, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iStartRecurrence);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = 0L;
        long actual = ((Long) localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments));
        
        assertEquals(0L, actual);
    }
    
    @Test
    public void testLocalToUTC3() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iStartRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        Object iOfYear = createInstance("org.joda.time.tz.DateTimeZoneBuilder$OfYear");
        setField(iOfYear, "org.joda.time.tz.DateTimeZoneBuilder$OfYear", "iMode", 's');
        setField(iStartRecurrence, "org.joda.time.tz.DateTimeZoneBuilder$Recurrence", "iOfYear", iOfYear);
        setField(iParam, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iStartRecurrence", iStartRecurrence);
        setField(iParam, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iStartRecurrence);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = 0L;
        long actual = ((Long) localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments));
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method localToUTC(long)
    
    @Test
    public void testLocalToUTC4() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        CachedDateTimeZone iParam = ((CachedDateTimeZone) createInstance("org.joda.time.tz.CachedDateTimeZone"));
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.localToUTC] produces [java.lang.NullPointerException]
            org.joda.time.tz.CachedDateTimeZone.getInfo(CachedDateTimeZone.java:151)
            org.joda.time.tz.CachedDateTimeZone.getOffset(CachedDateTimeZone.java:111)
            org.joda.time.DateTimeZone.getOffsetFromLocal(DateTimeZone.java:878)
            org.joda.time.chrono.ZonedChronology.localToUTC(ZonedChronology.java:140) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = 0L;
        try {
            localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testLocalToUTC5() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        Object iEndRecurrence = createInstance("org.joda.time.tz.DateTimeZoneBuilder$Recurrence");
        setField(iParam, "org.joda.time.tz.DateTimeZoneBuilder$DSTZone", "iEndRecurrence", iEndRecurrence);
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.localToUTC] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.findMatchingRecurrence(DateTimeZoneBuilder.java:1312)
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.getOffset(DateTimeZoneBuilder.java:1187)
            org.joda.time.DateTimeZone.getOffsetFromLocal(DateTimeZone.java:878)
            org.joda.time.chrono.ZonedChronology.localToUTC(ZonedChronology.java:140) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = 0L;
        try {
            localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testLocalToUTC6() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        Object iParam = createInstance("org.joda.time.tz.DateTimeZoneBuilder$DSTZone");
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.localToUTC] produces [java.lang.NullPointerException]
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.findMatchingRecurrence(DateTimeZoneBuilder.java:1312)
            org.joda.time.tz.DateTimeZoneBuilder$DSTZone.getOffset(DateTimeZoneBuilder.java:1187)
            org.joda.time.DateTimeZone.getOffsetFromLocal(DateTimeZone.java:878)
            org.joda.time.chrono.ZonedChronology.localToUTC(ZonedChronology.java:140) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class longType = long.class;
        Method localToUTCMethod = zonedChronologyClazz.getDeclaredMethod("localToUTC", longType);
        localToUTCMethod.setAccessible(true);
        java.lang.Object[] localToUTCMethodArguments = new java.lang.Object[1];
        localToUTCMethodArguments[0] = 0L;
        try {
            localToUTCMethod.invoke(zonedChronology, localToUTCMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.convertField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertField(org.joda.time.DurationField, java.util.HashMap)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DurationField,java.util.HashMap)}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testConvertField_FieldEqualsNull() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class durationFieldType = Class.forName("org.joda.time.DurationField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", durationFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = ((Object) null);
        convertFieldMethodArguments[1] = ((Object) null);
        DurationField actual = ((DurationField) convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DurationField,java.util.HashMap)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (!field.isSupported()): True}
 * @utbot.invokes {@link org.joda.time.DurationField#isSupported()}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testConvertField_NotFieldIsSupported() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        UnsupportedDurationField unsupportedDurationField = ((UnsupportedDurationField) createInstance("org.joda.time.field.UnsupportedDurationField"));
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class unsupportedDurationFieldType = Class.forName("org.joda.time.DurationField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", unsupportedDurationFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = unsupportedDurationField;
        convertFieldMethodArguments[1] = ((Object) null);
        UnsupportedDurationField actual = ((UnsupportedDurationField) convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments));
        
        // org.joda.time.field.UnsupportedDurationField has overridden equals method
        assertEquals(unsupportedDurationField, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertField(org.joda.time.DurationField, java.util.HashMap)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DurationField,java.util.HashMap)}
 * @utbot.executesCondition {@code (converted.containsKey(field)): False}
 * @utbot.invokes {@link java.util.HashMap#containsKey(java.lang.Object)}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getZone()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ZonedDurationField zonedField = new ZonedDurationField(field, getZone());
 *  */
    @Test
    public void testConvertField_ThrowClassCastException() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        byte[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        MillisDurationField millisDurationField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        HashMap hashMap = new HashMap();
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.convertField] produces [java.lang.ClassCastException: class [B cannot be cast to class org.joda.time.DateTimeZone ([B is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:206) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class millisDurationFieldType = Class.forName("org.joda.time.DurationField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", millisDurationFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = millisDurationField;
        convertFieldMethodArguments[1] = hashMap;
        try {
            convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DurationField,java.util.HashMap)}
 * @utbot.invokes {@link java.util.HashMap#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: converted.containsKey(field)
 *  */
    @Test
    public void testConvertField_ThrowNullPointerException() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        MillisDurationField millisDurationField = ((MillisDurationField) createInstance("org.joda.time.field.MillisDurationField"));
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.convertField] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:203) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class millisDurationFieldType = Class.forName("org.joda.time.DurationField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", millisDurationFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = millisDurationField;
        convertFieldMethodArguments[1] = ((Object) null);
        try {
            convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.joda.time.chrono.ZonedChronology.convertField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertField(org.joda.time.DateTimeField, java.util.HashMap)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DateTimeField,java.util.HashMap)}
 * @utbot.executesCondition {@code (field == null): True}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testConvertField_FieldEqualsNull1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class dateTimeFieldType = Class.forName("org.joda.time.DateTimeField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", dateTimeFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = ((Object) null);
        convertFieldMethodArguments[1] = ((Object) null);
        DateTimeField actual = ((DateTimeField) convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DateTimeField,java.util.HashMap)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (!field.isSupported()): True}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testConvertField_NotFieldIsSupported_1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        UnsupportedDateTimeField unsupportedDateTimeField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class unsupportedDateTimeFieldType = Class.forName("org.joda.time.DateTimeField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", unsupportedDateTimeFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = unsupportedDateTimeField;
        convertFieldMethodArguments[1] = ((Object) null);
        UnsupportedDateTimeField actual = ((UnsupportedDateTimeField) convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments));
        
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        assertNull(actualIType);
        
        DurationField actualIDurationField = ((DurationField) getFieldValue(actual, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        assertNull(actualIDurationField);
        
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DateTimeField,java.util.HashMap)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (!field.isSupported()): True}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testConvertField_NotFieldIsSupported1() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        SkipDateTimeField skipDateTimeField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        UnsupportedDateTimeField iField = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class skipDateTimeFieldType = Class.forName("org.joda.time.DateTimeField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", skipDateTimeFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = skipDateTimeField;
        convertFieldMethodArguments[1] = ((Object) null);
        SkipDateTimeField actual = ((SkipDateTimeField) convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments));
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIChronology);
        
        int skipDateTimeFieldISkip = ((Integer) getFieldValue(skipDateTimeField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualISkip = ((Integer) getFieldValue(actual, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(skipDateTimeFieldISkip, actualISkip);
        
        int skipDateTimeFieldIMinValue = ((Integer) getFieldValue(skipDateTimeField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIMinValue = ((Integer) getFieldValue(actual, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(skipDateTimeFieldIMinValue, actualIMinValue);
        
        DateTimeField skipDateTimeFieldIField = ((DateTimeField) getFieldValue(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        DurationField actualIFieldIDurationField = ((DurationField) getFieldValue(actualIField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        assertNull(actualIFieldIDurationField);
        
        DateTimeFieldType actualIType = ((DateTimeFieldType) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIType);
        
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DateTimeField,java.util.HashMap)}
 * @utbot.executesCondition {@code (field == null): False}
 * @utbot.executesCondition {@code (!field.isSupported()): True}
 * @utbot.returnsFrom {@code return field;}
 *  */
    @Test
    public void testConvertField_NotFieldIsSupported_2() throws Exception  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        SkipDateTimeField skipDateTimeField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        LenientDateTimeField iField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        UnsupportedDateTimeField iField1 = ((UnsupportedDateTimeField) createInstance("org.joda.time.field.UnsupportedDateTimeField"));
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class skipDateTimeFieldType = Class.forName("org.joda.time.DateTimeField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", skipDateTimeFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = skipDateTimeField;
        convertFieldMethodArguments[1] = ((Object) null);
        SkipDateTimeField actual = ((SkipDateTimeField) convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments));
        
        Chronology actualIChronology = ((Chronology) getFieldValue(actual, "org.joda.time.field.SkipDateTimeField", "iChronology"));
        assertNull(actualIChronology);
        
        int skipDateTimeFieldISkip = ((Integer) getFieldValue(skipDateTimeField, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        int actualISkip = ((Integer) getFieldValue(actual, "org.joda.time.field.SkipDateTimeField", "iSkip"));
        assertEquals(skipDateTimeFieldISkip, actualISkip);
        
        int skipDateTimeFieldIMinValue = ((Integer) getFieldValue(skipDateTimeField, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        int actualIMinValue = ((Integer) getFieldValue(actual, "org.joda.time.field.SkipDateTimeField", "iMinValue"));
        assertEquals(skipDateTimeFieldIMinValue, actualIMinValue);
        
        DateTimeField skipDateTimeFieldIField = ((DateTimeField) getFieldValue(skipDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIField = ((DateTimeField) getFieldValue(actual, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        Chronology actualIFieldIBase = ((Chronology) getFieldValue(actualIField, "org.joda.time.field.LenientDateTimeField", "iBase"));
        assertNull(actualIFieldIBase);
        
        DateTimeField skipDateTimeFieldIFieldIField = ((DateTimeField) getFieldValue(skipDateTimeFieldIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeField actualIFieldIField = ((DateTimeField) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iField"));
        DateTimeFieldType actualIFieldIFieldIType = ((DateTimeFieldType) getFieldValue(actualIFieldIField, "org.joda.time.field.UnsupportedDateTimeField", "iType"));
        assertNull(actualIFieldIFieldIType);
        
        DurationField actualIFieldIFieldIDurationField = ((DurationField) getFieldValue(actualIFieldIField, "org.joda.time.field.UnsupportedDateTimeField", "iDurationField"));
        assertNull(actualIFieldIFieldIDurationField);
        
        DateTimeFieldType actualIFieldIType = ((DateTimeFieldType) getFieldValue(actualIField, "org.joda.time.field.DelegatedDateTimeField", "iType"));
        assertNull(actualIFieldIType);
        
        assertTrue(deepEquals(skipDateTimeField, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertField(org.joda.time.DateTimeField, java.util.HashMap)
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DateTimeField,java.util.HashMap)}
 * @utbot.executesCondition {@code (converted.containsKey(field)): False}
 * @utbot.invokes {@link java.util.HashMap#containsKey(java.lang.Object)}
 * @utbot.invokes {@link org.joda.time.chrono.ZonedChronology#getZone()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: new ZonedDateTimeField(field, getZone(), convertField(field.getDurationField(), converted), convertField(field.getRangeDurationField(), converted), convertField(field.getLeapDurationField(), converted))
 *  */
    @Test
    public void testConvertField_ThrowClassCastException1() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        short[] iParam = {};
        setField(zonedChronology, "org.joda.time.chrono.AssembledChronology", "iParam", iParam);
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        LenientDateTimeField iField = ((LenientDateTimeField) createInstance("org.joda.time.field.LenientDateTimeField"));
        OffsetDateTimeField iField1 = ((OffsetDateTimeField) createInstance("org.joda.time.field.OffsetDateTimeField"));
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        HashMap hashMap = new HashMap();
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.convertField] produces [java.lang.ClassCastException: class [S cannot be cast to class org.joda.time.DateTimeZone ([S is in module java.base of loader 'bootstrap'; org.joda.time.DateTimeZone is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39e28726)]
            org.joda.time.chrono.ZonedChronology.getZone(ZonedChronology.java:86)
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:219) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class strictDateTimeFieldType = Class.forName("org.joda.time.DateTimeField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", strictDateTimeFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = strictDateTimeField;
        convertFieldMethodArguments[1] = hashMap;
        try {
            convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ZonedChronology}
 * @utbot.methodUnderTest {@link org.joda.time.chrono.ZonedChronology#convertField(org.joda.time.DateTimeField,java.util.HashMap)}
 * @utbot.invokes {@link java.util.HashMap#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: converted.containsKey(field)
 *  */
    @Test
    public void testConvertField_ThrowNullPointerException1() throws Throwable  {
        ZonedChronology zonedChronology = ((ZonedChronology) createInstance("org.joda.time.chrono.ZonedChronology"));
        StrictDateTimeField strictDateTimeField = ((StrictDateTimeField) createInstance("org.joda.time.field.StrictDateTimeField"));
        SkipDateTimeField iField = ((SkipDateTimeField) createInstance("org.joda.time.field.SkipDateTimeField"));
        DividedDateTimeField iField1 = ((DividedDateTimeField) createInstance("org.joda.time.field.DividedDateTimeField"));
        setField(iField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField1);
        setField(strictDateTimeField, "org.joda.time.field.DelegatedDateTimeField", "iField", iField);
        
        /* This test fails because method [org.joda.time.chrono.ZonedChronology.convertField] produces [java.lang.NullPointerException]
            org.joda.time.chrono.ZonedChronology.convertField(ZonedChronology.java:215) */
        Class zonedChronologyClazz = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class strictDateTimeFieldType = Class.forName("org.joda.time.DateTimeField");
        Class hashMapType = Class.forName("java.util.HashMap");
        Method convertFieldMethod = zonedChronologyClazz.getDeclaredMethod("convertField", strictDateTimeFieldType, hashMapType);
        convertFieldMethod.setAccessible(true);
        java.lang.Object[] convertFieldMethodArguments = new java.lang.Object[2];
        convertFieldMethodArguments[0] = strictDateTimeField;
        convertFieldMethodArguments[1] = ((Object) null);
        try {
            convertFieldMethod.invoke(zonedChronology, convertFieldMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1056188742498599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1056188742498599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1056188742509400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1056188742498599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1056188742509400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1056188742812200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1056188742812200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1056188742818299 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1056188742812200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1056188742818299).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

