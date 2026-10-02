package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Date;
import sun.util.calendar.LocalGregorianCalendar;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.ZipException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_compress_archivers_zip_X5455_ExtendedTimestampTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_FlagsBitwiseAnd0x07NotEqualsXfFlagsBitwiseAnd0x07AndModifyTimeNotEqualsXfModifyTimeOrModifyTimeNotEqualsNullAndModifyTimeEqualsAndAccessTimeNotEqualsXfAccessTimeOrAccessTimeNotEqualsNullAndAccessTimeEqualsAndCreateTimeNotEqualsXfCreateTimeOrCreateTimeNotEqualsNullAndCreateTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new X5455_ExtendedTimestamp();
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotONotInstanceOfX5455_ExtendedTimestamp() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        boolean actual = x5455_ExtendedTimestamp.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.executesCondition {@code ((modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime)))): False}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_ModifyTimeEqualsXfModifyTimeOrModifyTimeEqualsNullAndModifyTimeEquals_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        ZipLong modifyTime1 = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime1, "org.apache.commons.compress.archivers.zip.ZipLong", "value", java.lang.Long.MIN_VALUE);
        x5455_ExtendedTimestamp1.setModifyTime(modifyTime1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_FlagsBitwiseAnd0x07EqualsXfFlagsBitwiseAnd0x07AndModifyTimeEqualsXfModifyTimeOrModifyTimeEqualsNullAndModifyTimeEqualsAndAccessTimeEqualsXfAccessTimeOrAccessTimeEqualsNullAndAccessTimeEqualsAndCreateTimeEqualsXfCreateTimeOrCreateTimeEqualsNullAndCreateTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) 1);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp1.setModifyTime(modifyTime);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.executesCondition {@code ((modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime)))): False}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_ModifyTimeEqualsXfModifyTimeOrModifyTimeEqualsNullAndModifyTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.executesCondition {@code ((modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime)))): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_ModifyTimeNotEqualsXfModifyTimeOrModifyTimeNotEqualsNullAndModifyTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        ZipLong modifyTime1 = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime1, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        x5455_ExtendedTimestamp1.setModifyTime(modifyTime1);
        x5455_ExtendedTimestamp1.setAccessTime(modifyTime1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.executesCondition {@code ((accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime)))): False}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_AccessTimeEqualsXfAccessTimeOrAccessTimeEqualsNullAndAccessTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        ZipLong accessTime1 = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime1, "org.apache.commons.compress.archivers.zip.ZipLong", "value", java.lang.Long.MIN_VALUE);
        x5455_ExtendedTimestamp1.setAccessTime(accessTime1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_FlagsBitwiseAnd0x07EqualsXfFlagsBitwiseAnd0x07AndModifyTimeEqualsXfModifyTimeOrModifyTimeEqualsNullAndModifyTimeEqualsAndAccessTimeEqualsXfAccessTimeOrAccessTimeEqualsNullAndAccessTimeEqualsAndCreateTimeEqualsXfCreateTimeOrCreateTimeEqualsNullAndCreateTimeEquals_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 0);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp1.setCreateTime(createTime);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_FlagsBitwiseAnd0x07EqualsXfFlagsBitwiseAnd0x07AndModifyTimeEqualsXfModifyTimeOrModifyTimeEqualsNullAndModifyTimeEqualsAndAccessTimeEqualsXfAccessTimeOrAccessTimeEqualsNullAndAccessTimeEqualsAndCreateTimeEqualsXfCreateTimeOrCreateTimeEqualsNullAndCreateTimeEquals_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp1.setAccessTime(accessTime);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.executesCondition {@code ((accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime)))): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_AccessTimeNotEqualsXfAccessTimeOrAccessTimeNotEqualsNullAndAccessTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        ZipLong accessTime1 = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime1, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp1.setAccessTime(accessTime1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.executesCondition {@code ((createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)))): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_CreateTimeNotEqualsXfCreateTimeOrCreateTimeNotEqualsNullAndCreateTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(createTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        ZipLong createTime1 = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(createTime1, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp1.setCreateTime(createTime1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.executesCondition {@code ((createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)))): False}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_CreateTimeEqualsXfCreateTimeOrCreateTimeEqualsNullAndCreateTimeEquals() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o instanceof X5455_ExtendedTimestamp): True}
 * @utbot.returnsFrom {@code return ((flags & 0x07) == (xf.flags & 0x07)) && (modifyTime == xf.modifyTime || (modifyTime != null && modifyTime.equals(xf.modifyTime))) && (accessTime == xf.accessTime || (accessTime != null && accessTime.equals(xf.accessTime))) && (createTime == xf.createTime || (createTime != null && createTime.equals(xf.createTime)));}
 *  */
    @Test
    public void testEquals_FlagsBitwiseAnd0x07EqualsXfFlagsBitwiseAnd0x07AndModifyTimeEqualsXfModifyTimeOrModifyTimeEqualsNullAndModifyTimeEqualsAndAccessTimeEqualsXfAccessTimeOrAccessTimeEqualsNullAndAccessTimeEqualsAndCreateTimeEqualsXfCreateTimeOrCreateTimeEqualsNullAndCreateTimeEquals_3() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp1.setFlags((byte) 1);
        
        boolean actual = x5455_ExtendedTimestamp.equals(x5455_ExtendedTimestamp1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#toString()}
     */
    @Test
    public void testToString() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(-1);
        x5455_ExtendedTimestamp.setAccessTime(zipLong);
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) 1, (byte) -1, (byte) 1, (byte) 1};
        ZipLong zipLong1 = new ZipLong(byteArray, -1);
        x5455_ExtendedTimestamp.setCreateTime(zipLong1);
        x5455_ExtendedTimestamp.setFlags((byte) 1);
        byte[] byteArray1 = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        ZipLong zipLong2 = new ZipLong(byteArray1, -1);
        x5455_ExtendedTimestamp.setModifyTime(zipLong2);
        
        String actual = x5455_ExtendedTimestamp.toString();
        
        String expected = "0x5455 Zip Extra Field: Flags=1 ";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#toString()}
     */
    @Test
    public void testToString1() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(-1);
        x5455_ExtendedTimestamp.setAccessTime(zipLong);
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) 1, (byte) -1, (byte) 1, (byte) 1};
        ZipLong zipLong1 = new ZipLong(byteArray, -1);
        x5455_ExtendedTimestamp.setCreateTime(zipLong1);
        x5455_ExtendedTimestamp.setFlags((byte) 1);
        byte[] byteArray1 = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        ZipLong zipLong2 = new ZipLong(byteArray1, -1);
        x5455_ExtendedTimestamp.setModifyTime(zipLong2);
        
        String actual = x5455_ExtendedTimestamp.toString();
        
        String expected = "0x5455 Zip Extra Field: Flags=1 ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#hashCode()}
 * @utbot.executesCondition {@code (modifyTime != null): False}
 * @utbot.executesCondition {@code (accessTime != null): True}
 * @utbot.executesCondition {@code (createTime != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#hashCode()}
 * @utbot.invokes {@link java.lang.Integer#rotateLeft(int,int)}
 * @utbot.returnsFrom {@code return hc;}
 *  */
    @Test
    public void testHashCode_AccessTimeNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        
        int actual = x5455_ExtendedTimestamp.hashCode();
        
        assertEquals(520314, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#hashCode()}
 * @utbot.executesCondition {@code (modifyTime != null): True}
 * @utbot.executesCondition {@code (accessTime != null): False}
 * @utbot.executesCondition {@code (createTime != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#hashCode()}
 * @utbot.returnsFrom {@code return hc;}
 *  */
    @Test
    public void testHashCode_ModifyTimeNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        
        int actual = x5455_ExtendedTimestamp.hashCode();
        
        assertEquals(132, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#hashCode()}
 * @utbot.executesCondition {@code (modifyTime != null): False}
 * @utbot.executesCondition {@code (accessTime != null): False}
 * @utbot.executesCondition {@code (createTime != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#hashCode()}
 * @utbot.invokes {@link java.lang.Integer#rotateLeft(int,int)}
 * @utbot.returnsFrom {@code return hc;}
 *  */
    @Test
    public void testHashCode_CreateTimeNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(createTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        
        int actual = x5455_ExtendedTimestamp.hashCode();
        
        assertEquals(1065353338, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#hashCode()}
 * @utbot.executesCondition {@code (modifyTime != null): False}
 * @utbot.executesCondition {@code (accessTime != null): False}
 * @utbot.executesCondition {@code (createTime != null): False}
 * @utbot.returnsFrom {@code return hc;}
 *  */
    @Test
    public void testHashCode_CreateTimeEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        int actual = x5455_ExtendedTimestamp.hashCode();
        
        assertEquals(-123, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return super.clone();}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        X5455_ExtendedTimestamp actual = ((X5455_ExtendedTimestamp) x5455_ExtendedTimestamp.clone());
        
        X5455_ExtendedTimestamp expected = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        expected.setFlags((byte) 0);
        
        // org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#reset()}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setFlags(byte)}
 *  */
    @Test
    public void testReset_X5455_ExtendedTimestampSetFlags() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Method resetMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("reset");
        resetMethod.setAccessible(true);
        java.lang.Object[] resetMethodArguments = new java.lang.Object[0];
        resetMethod.invoke(x5455_ExtendedTimestamp, resetMethodArguments);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        
        assertEquals((byte) 0, finalX5455_ExtendedTimestampFlags);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getFlags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFlags()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getFlags()}
 * @utbot.returnsFrom {@code return flags;}
 *  */
    @Test
    public void testGetFlags_ReturnFlags() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        byte actual = x5455_ExtendedTimestamp.getFlags();
        
        assertEquals((byte) -127, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setFlags
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setFlags(byte)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setFlags(byte)}
 * @utbot.executesCondition {@code (this.bit0_modifyTimePresent = (flags & MODIFY_TIME_BIT) == MODIFY_TIME_BIT;): True}
 * @utbot.executesCondition {@code (this.bit1_accessTimePresent = (flags & ACCESS_TIME_BIT) == ACCESS_TIME_BIT;): False}
 * @utbot.executesCondition {@code (this.bit2_createTimePresent = (flags & CREATE_TIME_BIT) == CREATE_TIME_BIT;): True}
 *  */
    @Test
    public void testSetFlags() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        x5455_ExtendedTimestamp.setFlags((byte) -123);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit0_modifyTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        
        assertEquals((byte) -123, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit0_modifyTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setFlags(byte)}
 * @utbot.executesCondition {@code (this.bit0_modifyTimePresent = (flags & MODIFY_TIME_BIT) == MODIFY_TIME_BIT;): True}
 * @utbot.executesCondition {@code (this.bit1_accessTimePresent = (flags & ACCESS_TIME_BIT) == ACCESS_TIME_BIT;): False}
 * @utbot.executesCondition {@code (this.bit2_createTimePresent = (flags & CREATE_TIME_BIT) == CREATE_TIME_BIT;): False}
 *  */
    @Test
    public void testSetFlags_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        boolean finalX5455_ExtendedTimestampBit0_modifyTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent"));
        
        assertTrue(finalX5455_ExtendedTimestampBit0_modifyTimePresent);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setFlags(byte)}
 * @utbot.executesCondition {@code (this.bit0_modifyTimePresent = (flags & MODIFY_TIME_BIT) == MODIFY_TIME_BIT;): True}
 * @utbot.executesCondition {@code (this.bit1_accessTimePresent = (flags & ACCESS_TIME_BIT) == ACCESS_TIME_BIT;): True}
 * @utbot.executesCondition {@code (this.bit2_createTimePresent = (flags & CREATE_TIME_BIT) == CREATE_TIME_BIT;): True}
 *  */
    @Test
    public void testSetFlags_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        x5455_ExtendedTimestamp.setFlags((byte) -121);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit0_modifyTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent"));
        boolean finalX5455_ExtendedTimestampBit1_accessTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        
        assertEquals((byte) -121, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit0_modifyTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit1_accessTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setFlags(byte)}
 * @utbot.executesCondition {@code (this.bit0_modifyTimePresent = (flags & MODIFY_TIME_BIT) == MODIFY_TIME_BIT;): False}
 * @utbot.executesCondition {@code (this.bit1_accessTimePresent = (flags & ACCESS_TIME_BIT) == ACCESS_TIME_BIT;): False}
 * @utbot.executesCondition {@code (this.bit2_createTimePresent = (flags & CREATE_TIME_BIT) == CREATE_TIME_BIT;): False}
 *  */
    @Test
    public void testSetFlags_3() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        x5455_ExtendedTimestamp.setFlags((byte) -120);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        
        assertEquals((byte) -120, finalX5455_ExtendedTimestampFlags);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFlags(byte)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setFlags(byte)}
     */
    @Test
    public void testSetFlags1() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        x5455_ExtendedTimestamp.setFlags((byte) 2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getHeaderId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeaderId()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getHeaderId()}
 * @utbot.returnsFrom {@code return HEADER_ID;}
 *  */
    @Test
    public void testGetHeaderId_ReturnHEADER_ID() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        ZipShort prevHEADER_ID = ((ZipShort) getStaticFieldValue(x5455ExtendedTimestampClazz, "HEADER_ID"));
        try {
            ZipShort headerId = new ZipShort(21589);
            setStaticField(x5455ExtendedTimestampClazz, "HEADER_ID", headerId);
            X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
            
            ZipShort actual = x5455_ExtendedTimestamp.getHeaderId();
            
            // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
            assertEquals(headerId, actual);
        } finally {
            setStaticField(X5455_ExtendedTimestamp.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAccessTime(org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setAccessTime(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (bit1_accessTimePresent = l != null;): True}
 * @utbot.executesCondition {@code (l != null): True}
 *  */
    @Test
    public void testSetAccessTime_LNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong zipLong = new ZipLong(0);
        
        ZipLong initialX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        x5455_ExtendedTimestamp.setAccessTime(zipLong);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit1_accessTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent"));
        ZipLong finalX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        assertFalse(initialX5455_ExtendedTimestampAccessTime == finalX5455_ExtendedTimestampAccessTime);
        
        assertEquals((byte) -125, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit1_accessTimePresent);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setAccessTime(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (bit1_accessTimePresent = l != null;): False}
 * @utbot.executesCondition {@code (l != null): False}
 *  */
    @Test
    public void testSetAccessTime_LEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) 0);
        
        x5455_ExtendedTimestamp.setAccessTime(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModifyTime()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getModifyTime()}
 * @utbot.returnsFrom {@code return modifyTime;}
 *  */
    @Test
    public void testGetModifyTime_ReturnModifyTime() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        ZipLong actual = x5455_ExtendedTimestamp.getModifyTime();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateJavaTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreateJavaTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setCreateJavaTime(java.util.Date)}
 * @utbot.returnsFrom {@code /**
 *  * <p>
 *  * Sets the create time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d create time as java.util.Date
 *  */
 * public void setCreateJavaTime(final Date d) {
 *     setCreateTime(dateToZipLong(d));
 * }}
 *  */
    @Test
    public void testSetCreateJavaTime_Return() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        x5455_ExtendedTimestamp.setCreateJavaTime(null);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setCreateJavaTime(java.util.Date)}
 * @utbot.returnsFrom {@code /**
 *  * <p>
 *  * Sets the create time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d create time as java.util.Date
 *  */
 * public void setCreateJavaTime(final Date d) {
 *     setCreateTime(dateToZipLong(d));
 * }}
 *  */
    @Test
    public void testSetCreateJavaTime_Return_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) 0);
        Date date = new Date(-7L);
        
        ZipLong initialX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        x5455_ExtendedTimestamp.setCreateJavaTime(date);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        assertFalse(initialX5455_ExtendedTimestampCreateTime == finalX5455_ExtendedTimestampCreateTime);
        
        assertEquals((byte) 4, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setCreateJavaTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setCreateJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the create time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d create time as java.util.Date
 *  */
 * public void setCreateJavaTime(final Date d) {
 *     setCreateTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCreateJavaTime_ThrowIllegalArgumentException() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = new Date(8590983169024L);
        
        x5455_ExtendedTimestamp.setCreateJavaTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setCreateJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the create time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d create time as java.util.Date
 *  */
 * public void setCreateJavaTime(final Date d) {
 *     setCreateTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCreateJavaTime_ThrowIllegalArgumentException_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        
        x5455_ExtendedTimestamp.setCreateJavaTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setCreateJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the create time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d create time as java.util.Date
 *  */
 * public void setCreateJavaTime(final Date d) {
 *     setCreateTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCreateJavaTime_ThrowIllegalArgumentException_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date2 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date2, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date1, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        x5455_ExtendedTimestamp.setCreateJavaTime(date);
    }
    ///endregion
    
    ///region Errors report for setCreateJavaTime
    
    public void testSetCreateJavaTime_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.unixTimeToZipLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unixTimeToZipLong(long)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#unixTimeToZipLong(long)}
 * @utbot.executesCondition {@code (l >= TWO_TO_32): False}
 * @utbot.returnsFrom {@code return new ZipLong(l);}
 *  */
    @Test
    public void testUnixTimeToZipLong_LLessThanTWO_TO_32() throws Exception  {
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class longType = long.class;
        Method unixTimeToZipLongMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("unixTimeToZipLong", longType);
        unixTimeToZipLongMethod.setAccessible(true);
        java.lang.Object[] unixTimeToZipLongMethodArguments = new java.lang.Object[1];
        unixTimeToZipLongMethodArguments[0] = 0L;
        ZipLong actual = ((ZipLong) unixTimeToZipLongMethod.invoke(null, unixTimeToZipLongMethodArguments));
        
        ZipLong expected = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(expected, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        
        // org.apache.commons.compress.archivers.zip.ZipLong has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unixTimeToZipLong(long)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#unixTimeToZipLong(long)}
 * @utbot.executesCondition {@code (l >= TWO_TO_32): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(long)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: l >= TWO_TO_32
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUnixTimeToZipLong_ThrowIllegalArgumentException() throws Throwable  {
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class longType = long.class;
        Method unixTimeToZipLongMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("unixTimeToZipLong", longType);
        unixTimeToZipLongMethod.setAccessible(true);
        java.lang.Object[] unixTimeToZipLongMethodArguments = new java.lang.Object[1];
        unixTimeToZipLongMethodArguments[0] = 4294967304L;
        try {
            unixTimeToZipLongMethod.invoke(null, unixTimeToZipLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreateTime()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCreateTime()}
 * @utbot.returnsFrom {@code return createTime;}
 *  */
    @Test
    public void testGetCreateTime_ReturnCreateTime() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        ZipLong actual = x5455_ExtendedTimestamp.getCreateTime();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreateTime(org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setCreateTime(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (bit2_createTimePresent = l != null;): True}
 * @utbot.executesCondition {@code (l != null): True}
 *  */
    @Test
    public void testSetCreateTime_LNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong zipLong = new ZipLong(0);
        
        ZipLong initialX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        x5455_ExtendedTimestamp.setCreateTime(zipLong);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        assertFalse(initialX5455_ExtendedTimestampCreateTime == finalX5455_ExtendedTimestampCreateTime);
        
        assertEquals((byte) -123, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setCreateTime(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (bit2_createTimePresent = l != null;): False}
 * @utbot.executesCondition {@code (l != null): False}
 *  */
    @Test
    public void testSetCreateTime_LEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) 0);
        
        x5455_ExtendedTimestamp.setCreateTime(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAccessTime()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getAccessTime()}
 * @utbot.returnsFrom {@code return accessTime;}
 *  */
    @Test
    public void testGetAccessTime_ReturnAccessTime() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        ZipLong actual = x5455_ExtendedTimestamp.getAccessTime();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateJavaTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreateJavaTime()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCreateJavaTime()}
 * @utbot.returnsFrom {@code return zipLongToDate(createTime);}
 *  */
    @Test
    public void testGetCreateJavaTime_ReturnZipLongToDate() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        Date actual = x5455_ExtendedTimestamp.getCreateJavaTime();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCreateJavaTime()}
 * @utbot.returnsFrom {@code return zipLongToDate(createTime);}
 *  */
    @Test
    public void testGetCreateJavaTime_ReturnZipLongToDate_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(createTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        
        Date actual = x5455_ExtendedTimestamp.getCreateJavaTime();
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyJavaTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setModifyJavaTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setModifyJavaTime(java.util.Date)}
 * @utbot.returnsFrom {@code /**
 *  * <p>
 *  * Sets the modify time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d modify time as java.util.Date
 *  */
 * public void setModifyJavaTime(final Date d) {
 *     setModifyTime(dateToZipLong(d));
 * }}
 *  */
    @Test
    public void testSetModifyJavaTime_Return() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        x5455_ExtendedTimestamp.setModifyJavaTime(null);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        
        assertEquals(java.lang.Byte.MIN_VALUE, finalX5455_ExtendedTimestampFlags);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setModifyJavaTime(java.util.Date)}
 * @utbot.returnsFrom {@code /**
 *  * <p>
 *  * Sets the modify time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d modify time as java.util.Date
 *  */
 * public void setModifyJavaTime(final Date d) {
 *     setModifyTime(dateToZipLong(d));
 * }}
 *  */
    @Test
    public void testSetModifyJavaTime_Return_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) 0);
        Date date = new Date(-7L);
        
        ZipLong initialX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        
        x5455_ExtendedTimestamp.setModifyJavaTime(date);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit0_modifyTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent"));
        ZipLong finalX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        
        assertFalse(initialX5455_ExtendedTimestampModifyTime == finalX5455_ExtendedTimestampModifyTime);
        
        assertEquals((byte) 1, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit0_modifyTimePresent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setModifyJavaTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setModifyJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the modify time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d modify time as java.util.Date
 *  */
 * public void setModifyJavaTime(final Date d) {
 *     setModifyTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetModifyJavaTime_ThrowIllegalArgumentException() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = new Date(8590983169024L);
        
        x5455_ExtendedTimestamp.setModifyJavaTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setModifyJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the modify time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d modify time as java.util.Date
 *  */
 * public void setModifyJavaTime(final Date d) {
 *     setModifyTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetModifyJavaTime_ThrowIllegalArgumentException_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        
        x5455_ExtendedTimestamp.setModifyJavaTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setModifyJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the modify time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d modify time as java.util.Date
 *  */
 * public void setModifyJavaTime(final Date d) {
 *     setModifyTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetModifyJavaTime_ThrowIllegalArgumentException_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date2 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date2, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date1, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        x5455_ExtendedTimestamp.setModifyJavaTime(date);
    }
    ///endregion
    
    ///region Errors report for setModifyJavaTime
    
    public void testSetModifyJavaTime_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessJavaTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setAccessJavaTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setAccessJavaTime(java.util.Date)}
 * @utbot.returnsFrom {@code /**
 *  * <p>
 *  * Sets the access time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d access time as java.util.Date
 *  */
 * public void setAccessJavaTime(final Date d) {
 *     setAccessTime(dateToZipLong(d));
 * }}
 *  */
    @Test
    public void testSetAccessJavaTime_Return() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        x5455_ExtendedTimestamp.setAccessJavaTime(null);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setAccessJavaTime(java.util.Date)}
 * @utbot.returnsFrom {@code /**
 *  * <p>
 *  * Sets the access time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d access time as java.util.Date
 *  */
 * public void setAccessJavaTime(final Date d) {
 *     setAccessTime(dateToZipLong(d));
 * }}
 *  */
    @Test
    public void testSetAccessJavaTime_Return_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) 0);
        Date date = new Date(-7L);
        
        ZipLong initialX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        x5455_ExtendedTimestamp.setAccessJavaTime(date);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit1_accessTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent"));
        ZipLong finalX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        assertFalse(initialX5455_ExtendedTimestampAccessTime == finalX5455_ExtendedTimestampAccessTime);
        
        assertEquals((byte) 2, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit1_accessTimePresent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setAccessJavaTime(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setAccessJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the access time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d access time as java.util.Date
 *  */
 * public void setAccessJavaTime(final Date d) {
 *     setAccessTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAccessJavaTime_ThrowIllegalArgumentException() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = new Date(8590983169024L);
        
        x5455_ExtendedTimestamp.setAccessJavaTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setAccessJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the access time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d access time as java.util.Date
 *  */
 * public void setAccessJavaTime(final Date d) {
 *     setAccessTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAccessJavaTime_ThrowIllegalArgumentException_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        sun.util.calendar.LocalGregorianCalendar.Date cdate = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        
        x5455_ExtendedTimestamp.setAccessJavaTime(date);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setAccessJavaTime(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  * Sets the access time as a java.util.Date
 *  * of this zip entry.  Supplied value is truncated to per-second
 *  * precision (milliseconds zeroed-out).
 *  * </p><p>
 *  * Note: the setters for flags and timestamps are decoupled.
 *  * Even if the timestamp is not-null, it will only be written
 *  * out if the corresponding bit in the flags is also set.
 *  * </p>
 *  *
 *  * @param d access time as java.util.Date
 *  */
 * public void setAccessJavaTime(final Date d) {
 *     setAccessTime(dateToZipLong(d));
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAccessJavaTime_ThrowIllegalArgumentException_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date2 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date2, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date1, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        x5455_ExtendedTimestamp.setAccessJavaTime(date);
    }
    ///endregion
    
    ///region Errors report for setAccessJavaTime
    
    public void testSetAccessJavaTime_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setModifyTime(org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setModifyTime(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent = l != null;): True}
 * @utbot.executesCondition {@code (l != null): True}
 *  */
    @Test
    public void testSetModifyTime_LNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong zipLong = new ZipLong(0);
        
        ZipLong initialX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        
        x5455_ExtendedTimestamp.setModifyTime(zipLong);
        
        boolean finalX5455_ExtendedTimestampBit0_modifyTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent"));
        ZipLong finalX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        
        assertFalse(initialX5455_ExtendedTimestampModifyTime == finalX5455_ExtendedTimestampModifyTime);
        
        assertTrue(finalX5455_ExtendedTimestampBit0_modifyTimePresent);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#setModifyTime(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent = l != null;): False}
 * @utbot.executesCondition {@code (l != null): False}
 *  */
    @Test
    public void testSetModifyTime_LEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) 0);
        
        x5455_ExtendedTimestamp.setModifyTime(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.zipLongToDate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zipLongToDate(org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#zipLongToDate(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (unixTime != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getIntValue()}
 * @utbot.returnsFrom {@code return unixTime != null ? new Date(unixTime.getIntValue() * 1000L) : null;}
 *  */
    @Test
    public void testZipLongToDate_UnixTimeNotEqualsNull() throws Exception  {
        ZipLong zipLong = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(zipLong, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class zipLongType = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Method zipLongToDateMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("zipLongToDate", zipLongType);
        zipLongToDateMethod.setAccessible(true);
        java.lang.Object[] zipLongToDateMethodArguments = new java.lang.Object[1];
        zipLongToDateMethodArguments[0] = zipLong;
        Date actual = ((Date) zipLongToDateMethod.invoke(null, zipLongToDateMethodArguments));
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#zipLongToDate(org.apache.commons.compress.archivers.zip.ZipLong)}
 * @utbot.executesCondition {@code (unixTime != null): False}
 * @utbot.returnsFrom {@code return unixTime != null ? new Date(unixTime.getIntValue() * 1000L) : null;}
 *  */
    @Test
    public void testZipLongToDate_UnixTimeEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class zipLongType = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Method zipLongToDateMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("zipLongToDate", zipLongType);
        zipLongToDateMethod.setAccessible(true);
        java.lang.Object[] zipLongToDateMethodArguments = new java.lang.Object[1];
        zipLongToDateMethodArguments[0] = ((Object) null);
        Date actual = ((Date) zipLongToDateMethod.invoke(null, zipLongToDateMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.dateToZipLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dateToZipLong(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#dateToZipLong(java.util.Date)}
 * @utbot.executesCondition {@code (d == null): False}
 * @utbot.invokes {@link java.util.Date#getTime()}
 * @utbot.invokes org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#unixTimeToZipLong(long)
 * @utbot.returnsFrom {@code return unixTimeToZipLong(d.getTime() / 1000);}
 *  */
    @Test
    public void testDateToZipLong_DNotEqualsNull() throws Exception  {
        Date date = new Date(-7L);
        
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class dateType = Class.forName("java.util.Date");
        Method dateToZipLongMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("dateToZipLong", dateType);
        dateToZipLongMethod.setAccessible(true);
        java.lang.Object[] dateToZipLongMethodArguments = new java.lang.Object[1];
        dateToZipLongMethodArguments[0] = date;
        ZipLong actual = ((ZipLong) dateToZipLongMethod.invoke(null, dateToZipLongMethodArguments));
        
        ZipLong expected = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(expected, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        
        // org.apache.commons.compress.archivers.zip.ZipLong has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#dateToZipLong(java.util.Date)}
 * @utbot.executesCondition {@code (d == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testDateToZipLong_DEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class dateType = Class.forName("java.util.Date");
        Method dateToZipLongMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("dateToZipLong", dateType);
        dateToZipLongMethod.setAccessible(true);
        java.lang.Object[] dateToZipLongMethodArguments = new java.lang.Object[1];
        dateToZipLongMethodArguments[0] = ((Object) null);
        ZipLong actual = ((ZipLong) dateToZipLongMethod.invoke(null, dateToZipLongMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dateToZipLong(java.util.Date)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#dateToZipLong(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return unixTimeToZipLong(d.getTime() / 1000);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDateToZipLong_ThrowIllegalArgumentException() throws Throwable  {
        Date date = new Date(1099512275017280L);
        
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class dateType = Class.forName("java.util.Date");
        Method dateToZipLongMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("dateToZipLong", dateType);
        dateToZipLongMethod.setAccessible(true);
        java.lang.Object[] dateToZipLongMethodArguments = new java.lang.Object[1];
        dateToZipLongMethodArguments[0] = date;
        try {
            dateToZipLongMethod.invoke(null, dateToZipLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#dateToZipLong(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return unixTimeToZipLong(d.getTime() / 1000);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDateToZipLong_ThrowIllegalArgumentException_1() throws Throwable  {
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        Object cdate = createInstance("sun.util.calendar.JulianCalendar$Date");
        setField(cdate, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date, "java.util.Date", "cdate", cdate);
        
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class dateType = Class.forName("java.util.Date");
        Method dateToZipLongMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("dateToZipLong", dateType);
        dateToZipLongMethod.setAccessible(true);
        java.lang.Object[] dateToZipLongMethodArguments = new java.lang.Object[1];
        dateToZipLongMethodArguments[0] = date;
        try {
            dateToZipLongMethod.invoke(null, dateToZipLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#dateToZipLong(java.util.Date)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return unixTimeToZipLong(d.getTime() / 1000);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDateToZipLong_ThrowIllegalArgumentException_2() throws Throwable  {
        Date date = ((Date) createInstance("java.util.Date"));
        setField(date, "java.util.Date", "fastTime", 4294967296000L);
        Object cdate = createInstance("sun.util.calendar.ImmutableGregorianDate");
        Object date1 = createInstance("sun.util.calendar.ImmutableGregorianDate");
        sun.util.calendar.LocalGregorianCalendar.Date date2 = ((sun.util.calendar.LocalGregorianCalendar.Date) createInstance("sun.util.calendar.LocalGregorianCalendar$Date"));
        setField(date2, "sun.util.calendar.CalendarDate", "normalized", true);
        setField(date1, "sun.util.calendar.ImmutableGregorianDate", "date", date2);
        setField(cdate, "sun.util.calendar.ImmutableGregorianDate", "date", date1);
        setField(date, "java.util.Date", "cdate", cdate);
        
        Class x5455ExtendedTimestampClazz = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class dateType = Class.forName("java.util.Date");
        Method dateToZipLongMethod = x5455ExtendedTimestampClazz.getDeclaredMethod("dateToZipLong", dateType);
        dateToZipLongMethod.setAccessible(true);
        java.lang.Object[] dateToZipLongMethodArguments = new java.lang.Object[1];
        dateToZipLongMethodArguments[0] = date;
        try {
            dateToZipLongMethod.invoke(null, dateToZipLongMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for dateToZipLong
    
    public void testDateToZipLong_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        /* Unable to make field private static final java.util.Map sun.util.calendar.ZoneInfoFile.zones accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static volatile boolean sun.util.calendar.CalendarSystem.initialized accessible:
        module java.base does not "opens sun.util.calendar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyJavaTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModifyJavaTime()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getModifyJavaTime()}
 * @utbot.returnsFrom {@code return zipLongToDate(modifyTime);}
 *  */
    @Test
    public void testGetModifyJavaTime_ReturnZipLongToDate() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        Date actual = x5455_ExtendedTimestamp.getModifyJavaTime();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getModifyJavaTime()}
 * @utbot.returnsFrom {@code return zipLongToDate(modifyTime);}
 *  */
    @Test
    public void testGetModifyJavaTime_ReturnZipLongToDate_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        
        Date actual = x5455_ExtendedTimestamp.getModifyJavaTime();
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessJavaTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAccessJavaTime()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getAccessJavaTime()}
 * @utbot.returnsFrom {@code return zipLongToDate(accessTime);}
 *  */
    @Test
    public void testGetAccessJavaTime_ReturnZipLongToDate() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        
        Date actual = x5455_ExtendedTimestamp.getAccessJavaTime();
        
        Date expected = new Date();
        
        // java.util.Date has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getAccessJavaTime()}
 * @utbot.returnsFrom {@code return zipLongToDate(accessTime);}
 *  */
    @Test
    public void testGetAccessJavaTime_ReturnZipLongToDate_1() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        
        Date actual = x5455_ExtendedTimestamp.getAccessJavaTime();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getLocalFileDataLength()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0) + (bit1_accessTimePresent && accessTime != null ? 4 : 0) + (bit2_createTimePresent && createTime != null ? 4 : 0));}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): True}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): False}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0) + (bit1_accessTimePresent && accessTime != null ? 4 : 0) + (bit2_createTimePresent && createTime != null ? 4 : 0));}
 *  */
    @Test
    public void testGetLocalFileDataLength_Bit2_createTimePresentAndCreateTimeEqualsNull_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        
        ZipShort actual = x5455_ExtendedTimestamp.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(5);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): True}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0) + (bit1_accessTimePresent && accessTime != null ? 4 : 0) + (bit2_createTimePresent && createTime != null ? 4 : 0));}
 *  */
    @Test
    public void testGetLocalFileDataLength_Bit2_createTimePresentAndCreateTimeNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        
        ZipShort actual = x5455_ExtendedTimestamp.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(5);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): True}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): False}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0) + (bit1_accessTimePresent && accessTime != null ? 4 : 0) + (bit2_createTimePresent && createTime != null ? 4 : 0));}
 *  */
    @Test
    public void testGetLocalFileDataLength_Bit2_createTimePresentAndCreateTimeEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        
        ZipShort actual = x5455_ExtendedTimestamp.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(5);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): False}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0) + (bit1_accessTimePresent && accessTime != null ? 4 : 0) + (bit2_createTimePresent && createTime != null ? 4 : 0));}
 *  */
    @Test
    public void testGetLocalFileDataLength_Bit2_createTimePresentAndCreateTimeEqualsNull_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        
        ZipShort actual = x5455_ExtendedTimestamp.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(1);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): True}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): False}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0) + (bit1_accessTimePresent && accessTime != null ? 4 : 0) + (bit2_createTimePresent && createTime != null ? 4 : 0));}
 *  */
    @Test
    public void testGetLocalFileDataLength_Bit1_accessTimePresentAndAccessTimeEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        
        ZipShort actual = x5455_ExtendedTimestamp.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(1);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getLocalFileDataLength()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): True}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): True}
 * @utbot.executesCondition {@code (bit1_accessTimePresent && accessTime != null): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent && createTime != null): False}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0) + (bit1_accessTimePresent && accessTime != null ? 4 : 0) + (bit2_createTimePresent && createTime != null ? 4 : 0));}
 *  */
    @Test
    public void testGetLocalFileDataLength_Bit2_createTimePresentAndCreateTimeEqualsNull_3() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        
        ZipShort actual = x5455_ExtendedTimestamp.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(9);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLocalFileDataLength()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataLength()}
     */
    @Test
    public void testGetLocalFileDataLength() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(4);
        x5455_ExtendedTimestamp.setAccessTime(zipLong);
        byte[] byteArray = {(byte) 0, java.lang.Byte.MIN_VALUE, (byte) 4, (byte) -1, (byte) 1};
        ZipLong zipLong1 = new ZipLong(byteArray, -1);
        x5455_ExtendedTimestamp.setCreateTime(zipLong1);
        x5455_ExtendedTimestamp.setFlags((byte) 0);
        byte[] byteArray1 = {(byte) 4, (byte) 0, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 4};
        ZipLong zipLong2 = new ZipLong(byteArray1, 4);
        x5455_ExtendedTimestamp.setModifyTime(zipLong2);
        
        ZipShort actual = x5455_ExtendedTimestamp.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(1);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCentralDirectoryLength()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): True}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0));}
 *  */
    @Test
    public void testGetCentralDirectoryLength_Bit0_modifyTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        
        ZipShort actual = x5455_ExtendedTimestamp.getCentralDirectoryLength();
        
        ZipShort expected = new ZipShort(5);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryLength()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.returnsFrom {@code return new ZipShort(1 + (bit0_modifyTimePresent ? 4 : 0));}
 *  */
    @Test
    public void testGetCentralDirectoryLength_NotBit0_modifyTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        
        ZipShort actual = x5455_ExtendedTimestamp.getCentralDirectoryLength();
        
        ZipShort expected = new ZipShort(1);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalFileDataData()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): False}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetLocalFileDataData_NotBit1_accessTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        
        byte[] actual = x5455_ExtendedTimestamp.getLocalFileDataData();
        
        byte[] expected = {(byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): True}
 * @utbot.executesCondition {@code (accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): True}
 * @utbot.executesCondition {@code (createTime != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetLocalFileDataData_CreateTimeNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(createTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        
        byte[] actual = x5455_ExtendedTimestamp.getLocalFileDataData();
        
        byte[] expected = {(byte) 4, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): True}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): True}
 * @utbot.executesCondition {@code (accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetLocalFileDataData_Bit0_modifyTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        
        byte[] actual = x5455_ExtendedTimestamp.getLocalFileDataData();
        
        byte[] expected = {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): True}
 * @utbot.executesCondition {@code (accessTime != null): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent): True}
 * @utbot.executesCondition {@code (createTime != null): False}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetLocalFileDataData_AccessTimeNotEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        
        byte[] actual = x5455_ExtendedTimestamp.getLocalFileDataData();
        
        byte[] expected = {(byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): True}
 * @utbot.executesCondition {@code (accessTime != null): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): True}
 * @utbot.executesCondition {@code (createTime != null): False}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetLocalFileDataData_CreateTimeEqualsNull() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        
        byte[] actual = x5455_ExtendedTimestamp.getLocalFileDataData();
        
        byte[] expected = {(byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLocalFileDataData()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(modifyTime.getBytes(), 0, data, pos, 4);
 *  */
    @Test
    public void testGetLocalFileDataData_ThrowNullPointerException() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData(X5455_ExtendedTimestamp.java:179) */
        x5455_ExtendedTimestamp.getLocalFileDataData();
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(modifyTime.getBytes(), 0, data, pos, 4);
 *  */
    @Test
    public void testGetLocalFileDataData_ThrowNullPointerException_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData(X5455_ExtendedTimestamp.java:179) */
        x5455_ExtendedTimestamp.getLocalFileDataData();
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(modifyTime.getBytes(), 0, data, pos, 4);
 *  */
    @Test
    public void testGetLocalFileDataData_ThrowNullPointerException_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData(X5455_ExtendedTimestamp.java:179) */
        x5455_ExtendedTimestamp.getLocalFileDataData();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLocalFileDataData()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getLocalFileDataData()}
     */
    @Test
    public void testGetLocalFileDataData() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(5);
        x5455_ExtendedTimestamp.setAccessTime(zipLong);
        byte[] byteArray = {(byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0};
        ZipLong zipLong1 = new ZipLong(byteArray, -1);
        x5455_ExtendedTimestamp.setCreateTime(zipLong1);
        x5455_ExtendedTimestamp.setFlags((byte) 2);
        byte[] byteArray1 = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1, (byte) 1, java.lang.Byte.MIN_VALUE};
        ZipLong zipLong2 = new ZipLong(byteArray1, 2);
        x5455_ExtendedTimestamp.setModifyTime(zipLong2);
        
        byte[] actual = x5455_ExtendedTimestamp.getLocalFileDataData();
        
        byte[] expected = {(byte) 2, (byte) 5, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCentralDirectoryData()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryData()}
 * @utbot.returnsFrom {@code return centralData;}
 *  */
    @Test
    public void testGetCentralDirectoryData_ReturnCentralData() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        
        byte[] actual = x5455_ExtendedTimestamp.getCentralDirectoryData();
        
        byte[] expected = {(byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryData()}
 * @utbot.returnsFrom {@code return centralData;}
 *  */
    @Test
    public void testGetCentralDirectoryData_ReturnCentralData_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        
        byte[] actual = x5455_ExtendedTimestamp.getCentralDirectoryData();
        
        byte[] expected = {(byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryData()}
 * @utbot.returnsFrom {@code return centralData;}
 *  */
    @Test
    public void testGetCentralDirectoryData_ReturnCentralData_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(accessTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        
        byte[] actual = x5455_ExtendedTimestamp.getCentralDirectoryData();
        
        byte[] expected = {(byte) 2};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryData()}
 * @utbot.returnsFrom {@code return centralData;}
 *  */
    @Test
    public void testGetCentralDirectoryData_ReturnCentralData_3() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(createTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", -255L);
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        
        byte[] actual = x5455_ExtendedTimestamp.getCentralDirectoryData();
        
        byte[] expected = {(byte) 4};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryData()}
 * @utbot.returnsFrom {@code return centralData;}
 *  */
    @Test
    public void testGetCentralDirectoryData_ReturnCentralData_4() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent", true);
        setField(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent", true);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        setField(modifyTime, "org.apache.commons.compress.archivers.zip.ZipLong", "value", 0L);
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        
        byte[] actual = x5455_ExtendedTimestamp.getCentralDirectoryData();
        
        byte[] expected = {(byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCentralDirectoryData()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#getCentralDirectoryData()}
     */
    @Test
    public void testGetCentralDirectoryDataThrowsNPE() {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(Integer.MAX_VALUE);
        x5455_ExtendedTimestamp.setAccessTime(zipLong);
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 1, java.lang.Byte.MAX_VALUE, (byte) 1};
        ZipLong zipLong1 = new ZipLong(byteArray, -2147483647);
        x5455_ExtendedTimestamp.setCreateTime(zipLong1);
        x5455_ExtendedTimestamp.setFlags(java.lang.Byte.MAX_VALUE);
        byte[] byteArray1 = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) -1, java.lang.Byte.MAX_VALUE, (byte) 0};
        ZipLong zipLong2 = new ZipLong(byteArray1, -1);
        x5455_ExtendedTimestamp.setModifyTime(zipLong2);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData(X5455_ExtendedTimestamp.java:179)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryData(X5455_ExtendedTimestamp.java:204) */
        x5455_ExtendedTimestamp.getCentralDirectoryData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseFromLocalFileData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): True}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): False}
 *  */
    @Test
    public void testParseFromLocalFileData_NotBit2_createTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        byte[] byteArray = new byte[13];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -126;
        byteArray[9] = (byte) -126;
        byteArray[10] = (byte) -126;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        
        ZipLong initialX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, 7, -255);
        
        boolean finalX5455_ExtendedTimestampBit0_modifyTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent"));
        ZipLong finalX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        ZipLong finalX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        assertFalse(initialX5455_ExtendedTimestampModifyTime == finalX5455_ExtendedTimestampModifyTime);
        
        assertTrue(finalX5455_ExtendedTimestampBit0_modifyTimePresent);
        
        assertNull(finalX5455_ExtendedTimestampAccessTime);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): True}
 * @utbot.executesCondition {@code (offset + 4 <= len): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): True}
 * @utbot.executesCondition {@code (offset + 4 <= len): False}
 *  */
    @Test
    public void testParseFromLocalFileData_OffsetPlus4GreaterThanLen() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        byte[] byteArray = {(byte) -127, (byte) -122};
        
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, 1, 4);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit1_accessTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        
        assertEquals((byte) -122, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit1_accessTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
        
        assertNull(finalX5455_ExtendedTimestampModifyTime);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): True}
 * @utbot.executesCondition {@code (offset + 4 <= len): True}
 *  */
    @Test
    public void testParseFromLocalFileData_OffsetPlus4LessOrEqualLen_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        byte[] byteArray = new byte[31];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -124;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        
        ZipLong initialX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, 26, 5);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        ZipLong finalX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        assertFalse(initialX5455_ExtendedTimestampCreateTime == finalX5455_ExtendedTimestampCreateTime);
        
        assertEquals((byte) -124, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
        
        assertNull(finalX5455_ExtendedTimestampAccessTime);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): True}
 * @utbot.executesCondition {@code (offset + 4 <= len): True}
 * @utbot.executesCondition {@code (bit2_createTimePresent): True}
 * @utbot.executesCondition {@code (offset + 4 <= len): False}
 *  */
    @Test
    public void testParseFromLocalFileData_OffsetPlus4LessOrEqualLen() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -122;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -124;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        
        ZipLong initialX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, 8, 8);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit1_accessTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        assertFalse(initialX5455_ExtendedTimestampAccessTime == finalX5455_ExtendedTimestampAccessTime);
        
        assertEquals((byte) -122, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit1_accessTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseFromLocalFileData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): False}
 * @utbot.executesCondition {@code (bit2_createTimePresent): True}
 * @utbot.executesCondition {@code (offset + 4 <= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: createTime = new ZipLong(data, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        byte[] byteArray = {(byte) -124};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(ByteUtils.java:83)
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:166)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:106)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:239) */
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, 0, 5);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: modifyTime = new ZipLong(data, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(ByteUtils.java:83)
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:166)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:106)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:228) */
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, 0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (bit0_modifyTimePresent): False}
 * @utbot.executesCondition {@code (bit1_accessTimePresent): True}
 * @utbot.executesCondition {@code (offset + 4 <= len): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: accessTime = new ZipLong(data, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        byte[] byteArray = {(byte) -122};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(ByteUtils.java:83)
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:166)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:106)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:235) */
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, 0, 5);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setFlags(data[offset++]);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:226) */
        x5455_ExtendedTimestamp.parseFromLocalFileData(byteArray, -256, -255);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setFlags(data[offset++]);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowNullPointerException() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:226) */
        x5455_ExtendedTimestamp.parseFromLocalFileData(null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseFromCentralDirectoryData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromCentralDirectoryData(byte[],int,int)}
 *  */
    @Test
    public void testParseFromCentralDirectoryData_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong modifyTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setModifyTime(modifyTime);
        ZipLong accessTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setAccessTime(accessTime);
        byte[] byteArray = new byte[31];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -124;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        
        ZipLong initialX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        x5455_ExtendedTimestamp.parseFromCentralDirectoryData(byteArray, 26, 5);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        ZipLong finalX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        ZipLong finalX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        assertFalse(initialX5455_ExtendedTimestampCreateTime == finalX5455_ExtendedTimestampCreateTime);
        
        assertEquals((byte) -124, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
        
        assertNull(finalX5455_ExtendedTimestampModifyTime);
        
        assertNull(finalX5455_ExtendedTimestampAccessTime);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromCentralDirectoryData(byte[],int,int)}
 *  */
    @Test
    public void testParseFromCentralDirectoryData_3() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        ZipLong createTime = ((ZipLong) createInstance("org.apache.commons.compress.archivers.zip.ZipLong"));
        x5455_ExtendedTimestamp.setCreateTime(createTime);
        byte[] byteArray = {
            (byte) -121, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127, (byte) -127,
            (byte) -127
        };
        
        ZipLong initialX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        
        x5455_ExtendedTimestamp.parseFromCentralDirectoryData(byteArray, 0, 8);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit0_modifyTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit0_modifyTimePresent"));
        boolean finalX5455_ExtendedTimestampBit1_accessTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampModifyTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "modifyTime"));
        ZipLong finalX5455_ExtendedTimestampCreateTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "createTime"));
        
        assertFalse(initialX5455_ExtendedTimestampModifyTime == finalX5455_ExtendedTimestampModifyTime);
        
        assertEquals((byte) -121, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit0_modifyTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit1_accessTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
        
        assertNull(finalX5455_ExtendedTimestampCreateTime);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromCentralDirectoryData(byte[],int,int)}
 *  */
    @Test
    public void testParseFromCentralDirectoryData() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -120};
        
        x5455_ExtendedTimestamp.parseFromCentralDirectoryData(byteArray, 1, -255);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        
        assertEquals((byte) -120, finalX5455_ExtendedTimestampFlags);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromCentralDirectoryData(byte[],int,int)}
 *  */
    @Test
    public void testParseFromCentralDirectoryData_2() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) -122;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        
        ZipLong initialX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        x5455_ExtendedTimestamp.parseFromCentralDirectoryData(byteArray, 0, 6);
        
        byte finalX5455_ExtendedTimestampFlags = ((Byte) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "flags"));
        boolean finalX5455_ExtendedTimestampBit1_accessTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit1_accessTimePresent"));
        boolean finalX5455_ExtendedTimestampBit2_createTimePresent = ((Boolean) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "bit2_createTimePresent"));
        ZipLong finalX5455_ExtendedTimestampAccessTime = ((ZipLong) getFieldValue(x5455_ExtendedTimestamp, "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", "accessTime"));
        
        assertFalse(initialX5455_ExtendedTimestampAccessTime == finalX5455_ExtendedTimestampAccessTime);
        
        assertEquals((byte) -122, finalX5455_ExtendedTimestampFlags);
        
        assertTrue(finalX5455_ExtendedTimestampBit1_accessTimePresent);
        
        assertTrue(finalX5455_ExtendedTimestampBit2_createTimePresent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseFromCentralDirectoryData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromCentralDirectoryData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: parseFromLocalFileData(buffer, offset, length);
 *  */
    @Test
    public void testParseFromCentralDirectoryData_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:226)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData(X5455_ExtendedTimestamp.java:253) */
        x5455_ExtendedTimestamp.parseFromCentralDirectoryData(byteArray, 129, -255);
    }
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromCentralDirectoryData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testParseFromCentralDirectoryData_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        x5455_ExtendedTimestamp.setFlags((byte) -127);
        byte[] byteArray = {(byte) -124};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(ByteUtils.java:83)
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:166)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:106)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:239)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData(X5455_ExtendedTimestamp.java:253) */
        x5455_ExtendedTimestamp.parseFromCentralDirectoryData(byteArray, 0, 5);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method parseFromCentralDirectoryData([B, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp}
     * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#parseFromCentralDirectoryData(byte[],int,int)}
     */
    @Test
    public void testParseFromCentralDirectoryDataThrowsAIOOBEWithNonEmptyPrimitiveArrayAndCornerCases() throws ZipException  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = new X5455_ExtendedTimestamp();
        ZipLong zipLong = new ZipLong(-1);
        x5455_ExtendedTimestamp.setAccessTime(zipLong);
        byte[] byteArray = {java.lang.Byte.MAX_VALUE, (byte) 1, (byte) -1, (byte) 1, (byte) 1};
        ZipLong zipLong1 = new ZipLong(byteArray, Integer.MAX_VALUE);
        x5455_ExtendedTimestamp.setCreateTime(zipLong1);
        x5455_ExtendedTimestamp.setFlags((byte) 1);
        byte[] byteArray1 = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        ZipLong zipLong2 = new ZipLong(byteArray1, -1);
        x5455_ExtendedTimestamp.setModifyTime(zipLong2);
        byte[] byteArray2 = {java.lang.Byte.MAX_VALUE, java.lang.Byte.MAX_VALUE, (byte) 0, (byte) -1, (byte) 0};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5]
            org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(ByteUtils.java:83)
            org.apache.commons.compress.archivers.zip.ZipLong.getValue(ZipLong.java:166)
            org.apache.commons.compress.archivers.zip.ZipLong.<init>(ZipLong.java:106)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(X5455_ExtendedTimestamp.java:235)
            org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData(X5455_ExtendedTimestamp.java:253) */
        x5455_ExtendedTimestamp.parseFromCentralDirectoryData(byteArray2, 0, Integer.MAX_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit1_accessTimePresent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBit1_accessTimePresent()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#isBit1_accessTimePresent()}
 * @utbot.returnsFrom {@code return bit1_accessTimePresent;}
 *  */
    @Test
    public void testIsBit1_accessTimePresent_ReturnBit1_accessTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        
        boolean actual = x5455_ExtendedTimestamp.isBit1_accessTimePresent();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit0_modifyTimePresent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBit0_modifyTimePresent()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#isBit0_modifyTimePresent()}
 * @utbot.returnsFrom {@code return bit0_modifyTimePresent;}
 *  */
    @Test
    public void testIsBit0_modifyTimePresent_ReturnBit0_modifyTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        
        boolean actual = x5455_ExtendedTimestamp.isBit0_modifyTimePresent();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit2_createTimePresent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBit2_createTimePresent()
    
    /**
    @utbot.classUnderTest {@link X5455_ExtendedTimestamp}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp#isBit2_createTimePresent()}
 * @utbot.returnsFrom {@code return bit2_createTimePresent;}
 *  */
    @Test
    public void testIsBit2_createTimePresent_ReturnBit2_createTimePresent() throws Exception  {
        X5455_ExtendedTimestamp x5455_ExtendedTimestamp = ((X5455_ExtendedTimestamp) createInstance("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        
        boolean actual = x5455_ExtendedTimestamp.isBit2_createTimePresent();
        
        assertFalse(actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields977339295691100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields977339295691100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass977339295696300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields977339295691100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass977339295696300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields977339296290300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields977339296290300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass977339296291800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields977339296290300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass977339296291800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields977339296792600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields977339296792600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass977339296794200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields977339296792600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass977339296794200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields977339297708000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields977339297708000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass977339297709600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields977339297708000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass977339297709600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

