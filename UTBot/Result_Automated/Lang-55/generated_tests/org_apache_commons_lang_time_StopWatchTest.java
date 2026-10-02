package org.apache.commons.lang.time;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_lang_time_StopWatchTest {
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.toSplitString
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toSplitString()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#toSplitString()}
 * @utbot.invokes {@link org.apache.commons.lang.time.StopWatch#getSplitTime()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return DurationFormatUtils.formatDurationHMS(getSplitTime());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testToSplitString_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", -255);
        
        stopWatch.toSplitString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toSplitString()
    
    @Test
    public void testToSplitString1() throws Exception  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m1 = "m";
            setStaticField(durationFormatUtilsClazz, "m", m1);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", 11);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", 1499802552537964544L);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", 2264915968L);
            
            String actual = stopWatch.toSplitString();
            
            String expected = "8192:-17:-28.24";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    
    @Test
    public void testToSplitString2() throws Exception  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m1 = "m";
            setStaticField(durationFormatUtilsClazz, "m", m1);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", 11);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", -494545597794304L);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", 0L);
            
            String actual = stopWatch.toSplitString();
            
            String expected = "137373777:09:54.304";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.unsplit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unsplit()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#unsplit()}
 * @utbot.executesCondition {@code (this.splitState != STATE_SPLIT): False}
 *  */
    @Test
    public void testUnsplit_ThisSplitStateEqualsSTATE_SPLIT() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", 11);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        stopWatch.unsplit();
        
        int finalStopWatchSplitState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(10, finalStopWatchSplitState);
        
        assertEquals(-1L, finalStopWatchStopTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unsplit()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#unsplit()}
 * @utbot.executesCondition {@code (this.splitState != STATE_SPLIT): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.splitState != STATE_SPLIT
 *  */
    @Test(expected = IllegalStateException.class)
    public void testUnsplit_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", -255);
        
        stopWatch.unsplit();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.getSplitTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSplitTime()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#getSplitTime()}
 * @utbot.executesCondition {@code (this.splitState != STATE_SPLIT): False}
 * @utbot.returnsFrom {@code return this.stopTime - this.startTime;}
 *  */
    @Test
    public void testGetSplitTime_ThisSplitStateEqualsSTATE_SPLIT() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", 11);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", -255L);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        long actual = stopWatch.getSplitTime();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSplitTime()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#getSplitTime()}
 * @utbot.executesCondition {@code (this.splitState != STATE_SPLIT): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.splitState != STATE_SPLIT
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetSplitTime_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", -255);
        
        stopWatch.getSplitTime();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.toString
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#toString()}
 * @utbot.invokes {@link org.apache.commons.lang.time.StopWatch#getTime()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: return DurationFormatUtils.formatDurationHMS(getTime());
 *  */
    @Test(expected = RuntimeException.class)
    public void testToString_ThrowRuntimeException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", -255);
        
        stopWatch.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
            
            String actual = stopWatch.toString();
            
            String expected = "0:00:00.000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    
    @Test
    public void testToString2() throws Exception  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 1);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", 0L);
            
            String actual = stopWatch.toString();
            
            String expected = "497336:08:15.065";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    
    @Test
    public void testToString3() throws Exception  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 2);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", 0L);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", 0L);
            
            String actual = stopWatch.toString();
            
            String expected = "0:00:00.000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    
    @Test
    public void testToString4() throws Exception  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 3);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", 0L);
            setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", 0L);
            
            String actual = stopWatch.toString();
            
            String expected = "0:00:00.000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.split
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method split()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#split()}
 * @utbot.executesCondition {@code (this.runningState != STATE_RUNNING): False}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 *  */
    @Test
    public void testSplit_ThisRunningStateEqualsSTATE_RUNNING() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 1);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", -255);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        stopWatch.split();
        
        int finalStopWatchSplitState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(11, finalStopWatchSplitState);
        
        assertEquals(1790410054127L, finalStopWatchStopTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method split()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#split()}
 * @utbot.executesCondition {@code (this.runningState != STATE_RUNNING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.runningState != STATE_RUNNING
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSplit_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", -255);
        
        stopWatch.split();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.start
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method start()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#start()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): False}
 * @utbot.executesCondition {@code (this.runningState != STATE_UNSTARTED): False}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 *  */
    @Test
    public void testStart_ThisRunningStateEqualsSTATE_UNSTARTED() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", -255L);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        stopWatch.start();
        
        int finalStopWatchRunningState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState"));
        long finalStopWatchStartTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(1, finalStopWatchRunningState);
        
        assertEquals(1790410054531L, finalStopWatchStartTime);
        
        assertEquals(-1L, finalStopWatchStopTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method start()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#start()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.runningState == STATE_STOPPED
 *  */
    @Test(expected = IllegalStateException.class)
    public void testStart_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 2);
        
        stopWatch.start();
    }
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#start()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): False}
 * @utbot.executesCondition {@code (this.runningState != STATE_UNSTARTED): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.runningState != STATE_UNSTARTED
 *  */
    @Test(expected = IllegalStateException.class)
    public void testStart_ThrowIllegalStateException_1() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", -255);
        
        stopWatch.start();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.resume
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resume()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#resume()}
 * @utbot.executesCondition {@code (this.runningState != STATE_SUSPENDED): False}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 *  */
    @Test
    public void testResume_ThisRunningStateEqualsSTATE_SUSPENDED() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 3);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", -255L);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        stopWatch.resume();
        
        int finalStopWatchRunningState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState"));
        long finalStopWatchStartTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(1, finalStopWatchRunningState);
        
        assertEquals(1790410054728L, finalStopWatchStartTime);
        
        assertEquals(-1L, finalStopWatchStopTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method resume()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#resume()}
 * @utbot.executesCondition {@code (this.runningState != STATE_SUSPENDED): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.runningState != STATE_SUSPENDED
 *  */
    @Test(expected = IllegalStateException.class)
    public void testResume_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", -255);
        
        stopWatch.resume();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.stop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stop()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#stop()}
 * @utbot.executesCondition {@code (this.runningState != STATE_RUNNING): False}
 *  */
    @Test
    public void testStop_ThisRunningStateEqualsSTATE_RUNNING() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 1);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        stopWatch.stop();
        
        int finalStopWatchRunningState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(2, finalStopWatchRunningState);
        
        assertEquals(1790410054926L, finalStopWatchStopTime);
    }
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#stop()}
 * @utbot.executesCondition {@code (this.runningState != STATE_RUNNING): True}
 * @utbot.executesCondition {@code (this.runningState != STATE_SUSPENDED): False}
 *  */
    @Test
    public void testStop_ThisRunningStateEqualsSTATE_SUSPENDED() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 3);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", 0L);
        
        stopWatch.stop();
        
        int finalStopWatchRunningState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(2, finalStopWatchRunningState);
        
        assertEquals(1790410055107L, finalStopWatchStopTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method stop()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#stop()}
 * @utbot.executesCondition {@code (this.runningState != STATE_RUNNING): True}
 * @utbot.executesCondition {@code (this.runningState != STATE_SUSPENDED): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.runningState != STATE_RUNNING && this.runningState != STATE_SUSPENDED
 *  */
    @Test(expected = IllegalStateException.class)
    public void testStop_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", -255);
        
        stopWatch.stop();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.suspend
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method suspend()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#suspend()}
 * @utbot.executesCondition {@code (this.runningState != STATE_RUNNING): False}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 *  */
    @Test
    public void testSuspend_ThisRunningStateEqualsSTATE_RUNNING() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 1);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        stopWatch.suspend();
        
        int finalStopWatchRunningState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(3, finalStopWatchRunningState);
        
        assertEquals(1790410055304L, finalStopWatchStopTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method suspend()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#suspend()}
 * @utbot.executesCondition {@code (this.runningState != STATE_RUNNING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: this.runningState != STATE_RUNNING
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSuspend_ThrowIllegalStateException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", -255);
        
        stopWatch.suspend();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#reset()}
 *  */
    @Test
    public void testReset() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", -255);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState", -255);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", -255L);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        stopWatch.reset();
        
        int finalStopWatchRunningState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState"));
        int finalStopWatchSplitState = ((Integer) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "splitState"));
        long finalStopWatchStartTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime"));
        long finalStopWatchStopTime = ((Long) getFieldValue(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime"));
        
        assertEquals(0, finalStopWatchRunningState);
        
        assertEquals(10, finalStopWatchSplitState);
        
        assertEquals(-1L, finalStopWatchStartTime);
        
        assertEquals(-1L, finalStopWatchStopTime);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.StopWatch.getTime
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTime()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#getTime()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_SUSPENDED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_UNSTARTED): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetTime_ThisRunningStateEqualsSTATE_UNSTARTED() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        
        long actual = stopWatch.getTime();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#getTime()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): True}
 * @utbot.returnsFrom {@code return this.stopTime - this.startTime;}
 *  */
    @Test
    public void testGetTime_ThisRunningStateEqualsSTATE_STOPPED() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 2);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", -255L);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", -255L);
        
        long actual = stopWatch.getTime();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#getTime()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_SUSPENDED): True}
 * @utbot.returnsFrom {@code return this.stopTime - this.startTime;}
 *  */
    @Test
    public void testGetTime_ThisRunningStateEqualsSTATE_SUSPENDED() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 3);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", 0L);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "stopTime", 0L);
        
        long actual = stopWatch.getTime();
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#getTime()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_SUSPENDED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_UNSTARTED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_RUNNING): True}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 * @utbot.returnsFrom {@code return System.currentTimeMillis() - this.startTime;}
 *  */
    @Test
    public void testGetTime_ThisRunningStateEqualsSTATE_RUNNING() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 1);
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "startTime", 0L);
        
        long actual = stopWatch.getTime();
        
        assertEquals(1790410055841L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTime()
    
    /**
    @utbot.classUnderTest {@link StopWatch}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.StopWatch#getTime()}
 * @utbot.executesCondition {@code (this.runningState == STATE_STOPPED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_SUSPENDED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_UNSTARTED): False}
 * @utbot.executesCondition {@code (this.runningState == STATE_RUNNING): False}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: throw new RuntimeException("Illegal running state has occured. ");
 *  */
    @Test(expected = RuntimeException.class)
    public void testGetTime_ThrowRuntimeException() throws Exception  {
        StopWatch stopWatch = ((StopWatch) createInstance("org.apache.commons.lang.time.StopWatch"));
        setField(stopWatch, "org.apache.commons.lang.time.StopWatch", "runningState", 4);
        
        stopWatch.getTime();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields670952814696000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields670952814696000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass670952814702100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670952814696000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670952814702100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields670952815086300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670952815086300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670952815091000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670952815086300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670952815091000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields670952815749400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields670952815749400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass670952815753000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields670952815749400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass670952815753000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

