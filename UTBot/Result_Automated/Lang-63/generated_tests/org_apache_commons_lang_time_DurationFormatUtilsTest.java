package org.apache.commons.lang.time;

import org.junit.Test;
import org.apache.commons.lang.time.DurationFormatUtils.Token;
import java.lang.reflect.Method;
import java.util.GregorianCalendar;
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
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_lang_time_DurationFormatUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.format
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method format([Lorg.apache.commons.lang.time.DurationFormatUtils$Token;, int, int, int, int, int, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#format(org.apache.commons.lang.time.DurationFormatUtils.Token[],int,int,int,int,int,int,int,boolean)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.returnsFrom {@code return buffer.toString();}
 *  */
    @Test
    public void testFormat_StringBufferToString() {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = {};
        
        String actual = DurationFormatUtils.format(tokenArray, -255, -255, -255, -255, -255, -255, -255, false);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method format([Lorg.apache.commons.lang.time.DurationFormatUtils$Token;, int, int, int, int, int, int, int, boolean)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#format(org.apache.commons.lang.time.DurationFormatUtils.Token[],int,int,int,int,int,int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = token.getValue();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_1() {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = {null};
        
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
        DurationFormatUtils.format(tokenArray, -255, -255, -255, -255, -255, -255, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#format(org.apache.commons.lang.time.DurationFormatUtils.Token[],int,int,int,int,int,int,int,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int sz = tokens.length;
 *  */
    @Test
    public void testFormat_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:382) */
        DurationFormatUtils.format(null, -255, -255, -255, -255, -255, -255, -255, false);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#format(org.apache.commons.lang.time.DurationFormatUtils.Token[],int,int,int,int,int,int,int,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object value = token.getValue();
 *  */
    @Test
    public void testFormat_ThrowNullPointerException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(null, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, -255, -255, -255, -255, -255, -255, -255, false);
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method format([Lorg.apache.commons.lang.time.DurationFormatUtils$Token;, int, int, int, int, int, int, int, boolean)
    
    @Test
    public void testFormatByFuzzer() {
        org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[3];
        Object object = new Object();
        DurationFormatUtils.Token token = new DurationFormatUtils.Token(object);
        tokenArray[0] = token;
        Object object1 = new Object();
        DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(object1, 1);
        tokenArray[1] = token1;
        Object object2 = new Object();
        DurationFormatUtils.Token token2 = new DurationFormatUtils.Token(object2);
        tokenArray[2] = token2;
        
        String actual = DurationFormatUtils.format(tokenArray, 48, 0, 5, 48, 0, 0, Integer.MIN_VALUE, true);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method format([Lorg.apache.commons.lang.time.DurationFormatUtils$Token;, int, int, int, int, int, int, int, boolean)
    
    @Test
    public void testFormat1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            Object object = new Object();
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(object, 0);
            tokenArray[0] = token;
            tokenArray[1] = token;
            tokenArray[2] = token;
            tokenArray[3] = token;
            tokenArray[4] = token;
            tokenArray[5] = token;
            tokenArray[6] = token;
            tokenArray[7] = token;
            tokenArray[8] = token;
            
            String actual = DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, false);
            
            String expected = "";
            
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
    public void testFormat2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[1];
            Object object = new Object();
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(object, 0);
            tokenArray[0] = token;
            
            String actual = DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, false);
            
            String expected = "";
            
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
    
    ///region OTHER: ERROR SUITE for method format([Lorg.apache.commons.lang.time.DurationFormatUtils$Token;, int, int, int, int, int, int, int, boolean)
    
    @Test(expected = OutOfMemoryError.class)
    public void testFormat3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, -2147483639);
            tokenArray[0] = token;
            
            DurationFormatUtils.format(tokenArray, Integer.MIN_VALUE, 0, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test(expected = OutOfMemoryError.class)
    public void testFormat4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, Integer.MIN_VALUE);
            tokenArray[0] = token;
            
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    @Test(expected = OutOfMemoryError.class)
    public void testFormat5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m1, -2147483639);
            tokenArray[0] = token;
            
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, Integer.MIN_VALUE, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
        }
    }
    
    @Test(expected = OutOfMemoryError.class)
    public void testFormat6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s1, Integer.MIN_VALUE);
            tokenArray[0] = token;
            
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, true);
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
    public void testFormat7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 1, 0, 0, 0, 0, 0, 0, false);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testFormat8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 1, 0, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testFormat9() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 12);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, Integer.MIN_VALUE, 0, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testFormat10() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 12);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, Integer.MIN_VALUE, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    @Test
    public void testFormat11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 17, 0, 0, 0, 0, 0, false);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    @Test
    public void testFormat12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[10];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 1, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    @Test
    public void testFormat13() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, Integer.MIN_VALUE, 0, 0, 0, 0, false);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormat14() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 1, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormat15() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 12);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, Integer.MIN_VALUE, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormat16() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 1, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormat17() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 12);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, Integer.MIN_VALUE, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormat18() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 17, 0, 0, 0, false);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormat19() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m1, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
        }
    }
    
    @Test
    public void testFormat20() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[10];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m1, 2);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
        }
    }
    
    @Test
    public void testFormat21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m1, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 1, 0, 0, false);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
        }
    }
    
    @Test
    public void testFormat22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 1, 0, false);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testFormat23() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 2);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testFormat24() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM1 = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 1, 0, true);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testFormat25() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s1, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 1, true);
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
    public void testFormat26() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s1, 2);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, 0, true);
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
    public void testFormat27() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            org.apache.commons.lang.time.DurationFormatUtils.Token[] tokenArray = new org.apache.commons.lang.time.DurationFormatUtils.Token[9];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s1, 0);
            tokenArray[0] = token;
            
            /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.format] produces [java.lang.NullPointerException]
                org.apache.commons.lang.time.DurationFormatUtils.format(DurationFormatUtils.java:385) */
            DurationFormatUtils.format(tokenArray, 0, 0, 0, 0, 0, 0, Integer.MIN_VALUE, false);
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
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatDurationWords(long, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDurationWords(long,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDurationWords_DurationFormatUtilsFormatDuration() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
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
            
            String actual = DurationFormatUtils.formatDurationWords(-255L, false, false);
            
            String expected = "0 days 0 hours 0 minutes 0 seconds";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method formatDurationWords(long, boolean, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDurationWords(long,boolean,boolean)}
     */
    @Test
    public void testFormatDurationWords() {
        String actual = DurationFormatUtils.formatDurationWords(-9223372036850581504L, true, false);
        
        String expected = "622191233 days 199591896 hours 22 minutes 50 seconds";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatDurationHMS(long)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDurationHMS(long)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDurationHMS_DurationFormatUtilsFormatDuration() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            
            String actual = DurationFormatUtils.formatDurationHMS(-255L);
            
            String expected = "0:00:00.45";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method formatDurationHMS(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDurationHMS(long)}
     */
    @Test
    public void testFormatDurationHMS() {
        String actual = DurationFormatUtils.formatDurationHMS(9223372036854775803L);
        
        String expected = "-2047687697:909387756:-55.87";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatDurationISO(long)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDurationISO(long)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String,boolean)}
 *  */
    @Test
    public void testFormatDurationISO_DurationFormatUtilsFormatDuration() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
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
            
            String actual = DurationFormatUtils.formatDurationISO(-255L);
            
            String expected = "P0Y0M0DT0H0M0.45S";
            
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
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatDuration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method formatDuration(long, java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True},
    ///     {@code (null): False}
    /// invoke:
    ///     {@link java.util.ArrayList#add(java.lang.Object)} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     {@link java.util.ArrayList#toArray(java.lang.Object[])} twice,
    ///     {@link org.apache.commons.lang.time.DurationFormatUtils#lexx(java.lang.String)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String string = "y";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String string = "M";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "d";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.S;
        try {
            String s = "S";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "S";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "-255";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "H";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.s;
        try {
            String s = "s";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "s";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "m";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method formatDuration(long, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_8() {
        String string = "' ";
        
        String actual = DurationFormatUtils.formatDuration(-255L, string);
        
        String expected = " ";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_9() {
        String string = "''";
        
        String actual = DurationFormatUtils.formatDuration(-255L, string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
 * @utbot.invokes {@link org.apache.commons.lang.time.DurationFormatUtils#lexx(java.lang.String)}
 *  */
    @Test
    public void testFormatDuration_7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String string = "MM";
            
            String actual = DurationFormatUtils.formatDuration(-255L, string);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method formatDuration(long, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatDuration(long,java.lang.String)}
     */
    @Test
    public void testFormatDurationWithNonEmptyString() {
        String actual = DurationFormatUtils.formatDuration(1L, "ZX");
        
        String expected = "ZX";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatDuration
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatDuration(long, java.lang.String, boolean)
    /// Actual number of generated tests (73) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testFormatDuration1() {
        String string = "\u0000\u0000";
        
        String actual = DurationFormatUtils.formatDuration(0L, string, false);
        
        String expected = "\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormatDuration2() {
        String string = "\u0000'";
        
        String actual = DurationFormatUtils.formatDuration(0L, string, false);
        
        String expected = "\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormatDuration3() {
        String string = "'\u0000'm";
        
        String actual = DurationFormatUtils.formatDuration(0L, string, false);
        
        String expected = "\u00000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormatDuration4() {
        String string = "'\u0000'd";
        
        String actual = DurationFormatUtils.formatDuration(0L, string, false);
        
        String expected = "\u00000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormatDuration5() {
        String string = "'\u0000'M";
        
        String actual = DurationFormatUtils.formatDuration(0L, string, false);
        
        String expected = "\u00000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormatDuration6() {
        String string = "'\u0000'\u0000";
        
        String actual = DurationFormatUtils.formatDuration(0L, string, false);
        
        String expected = "\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFormatDuration7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "\u0000m";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "\u00000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String string = "\u0000M";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "\u00000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    @Test
    public void testFormatDuration9() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "\u0000d";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "\u00000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormatDuration10() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String string = "\u0000y";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "\u00000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testFormatDuration11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "\u0000H";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "\u00000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.S;
        try {
            String s = "S";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "\u0000S";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "\u00000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration13() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String string = "''y";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testFormatDuration14() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "''H";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration15() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.S;
        try {
            String s = "S";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "''S";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration16() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.s;
        try {
            String s = "s";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "''s";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testFormatDuration17() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "mm\u0000";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration18() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "mm'";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration19() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "dd\u0000";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormatDuration20() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "dd'";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormatDuration21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.S;
        try {
            String s = "S";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "SS";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.S;
        try {
            String s = "S";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "S\u0000";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration23() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.S;
        try {
            String s = "S";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "S'";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration24() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "H\u0000";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0\u0000";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration25() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "H'";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration26() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String string = "y'";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "0";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testFormatDuration27() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevM1 = DurationFormatUtils.m;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String m1 = "m";
            setStaticField(durationFormatUtilsClazz, "m", m1);
            String string = "mM";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
        }
    }
    
    @Test
    public void testFormatDuration28() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.S;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "mmS";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration29() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.m;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "my";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration30() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "mmH";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration31() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "mms";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testFormatDuration32() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevM = DurationFormatUtils.m;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "mmd";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration33() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevS = DurationFormatUtils.S;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "dS";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration34() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevD = DurationFormatUtils.d;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "ddy";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormatDuration35() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "ddH";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration36() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "ddM";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testFormatDuration37() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevS = DurationFormatUtils.s;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "dds";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testFormatDuration38() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevM = DurationFormatUtils.m;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "ddm";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration39() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevS = DurationFormatUtils.S;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "SH";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration40() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevS = DurationFormatUtils.S;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "Sd";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration41() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.S;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "Sm";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration42() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevS = DurationFormatUtils.S;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "SM";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration43() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String s = "s";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            String string = "Ss";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    
    @Test
    public void testFormatDuration44() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevS = DurationFormatUtils.S;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "Sy";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testFormatDuration45() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "Hm";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testFormatDuration46() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevH = DurationFormatUtils.H;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "HM";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration47() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevS = DurationFormatUtils.s;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "HHs";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testFormatDuration48() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevH = DurationFormatUtils.H;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "HHy";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration49() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "HHd";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testFormatDuration50() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevS = DurationFormatUtils.S;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "HHS";
            
            String actual = DurationFormatUtils.formatDuration(0L, string, false);
            
            String expected = "00";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatPeriodISO(long, long)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatPeriodISO(long,long)}
 * @utbot.invokes {@link java.util.TimeZone#getDefault()}
 *  */
    @Test
    public void testFormatPeriodISO_TimeZoneGetDefault() {
        String actual = DurationFormatUtils.formatPeriodISO(-255L, -255L);
        
        String expected = "P0Y0M0DT0H0M0.000S";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.lexx
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method lexx(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#lexx(java.lang.String)}
 * @utbot.returnsFrom {@code return (Token[]) list.toArray(new Token[0]);}
 *  */
    @Test
    public void testLexx_ReturnListToArrayNewToken0() {
        String string = "";
        
        org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
        
        org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#lexx(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} twice
 * @utbot.returnsFrom {@code return (Token[]) list.toArray(new Token[0]);}
 *  */
    @Test
    public void testLexx_ValueEqualsNull() throws Exception  {
        String string = "' ";
        
        org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
        
        org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[1];
        StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
        expected[0] = token;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method lexx(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#lexx(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: char[] array = format.toCharArray();
 *  */
    @Test
    public void testLexx_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.lexx] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.DurationFormatUtils.lexx(DurationFormatUtils.java:460) */
        DurationFormatUtils.lexx(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method lexx(java.lang.String)
    /// Actual number of generated tests (71) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testLexx1() throws Exception  {
        String string = "\u0000\u0000";
        
        org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
        
        org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[1];
        StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
        DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
        expected[0] = token;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testLexx2() throws Exception  {
        Object prevS = DurationFormatUtils.s;
        try {
            String s = "s";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "\u0000s";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx3() throws Exception  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "\u0000H";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(h, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx4() throws Exception  {
        Object prevD = DurationFormatUtils.d;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "\u0000d";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(d, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testLexx5() throws Exception  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "\u0000m";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx6() throws Exception  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String string = "\u0000y";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(y, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testLexx7() throws Exception  {
        Object prevS = DurationFormatUtils.S;
        try {
            String s = "S";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "\u0000S";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[0] = token;
            String string1 = "S";
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(string1, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testLexx8() throws Exception  {
        Object prevM = DurationFormatUtils.M;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String string = "\u0000M";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[0] = token;
            String string1 = "M";
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(string1, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    @Test
    public void testLexx9() throws Exception  {
        Object prevS = DurationFormatUtils.s;
        try {
            String s = "s";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "s'";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 1);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx10() throws Exception  {
        Object prevS = DurationFormatUtils.s;
        try {
            String s = "s";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "ss\u0000";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            String string1 = "s";
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(string1, 2);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx11() throws Exception  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String string = "y\u0000";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 1);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testLexx12() throws Exception  {
        Object prevY = DurationFormatUtils.y;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String string = "yy'";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            String string1 = "y";
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(string1, 2);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
        }
    }
    
    @Test
    public void testLexx13() throws Exception  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "HH'";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 2);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx14() throws Exception  {
        Object prevH = DurationFormatUtils.H;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "HH\u0000";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 2);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx15() throws Exception  {
        Object prevD = DurationFormatUtils.d;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "d'";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 1);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testLexx16() throws Exception  {
        Object prevD = DurationFormatUtils.d;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "dd\u0000";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 2);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testLexx17() throws Exception  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "m'";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            String string1 = "m";
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(string1, 1);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx18() throws Exception  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "m\u0000";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            String string1 = "m";
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(string1, 1);
            expected[0] = token;
            StringBuffer stringBuffer = ((StringBuffer) createInstance("java.lang.StringBuffer"));
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(stringBuffer, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx19() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "mm";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[1];
            String string1 = "m";
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(string1, 2);
            expected[0] = token;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx20() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevS = DurationFormatUtils.s;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "sy";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(y, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevS = DurationFormatUtils.s;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "sH";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(h, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevS = DurationFormatUtils.s;
        Object prevS1 = DurationFormatUtils.S;
        try {
            String s = "s";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "s", s);
            String s1 = "S";
            setStaticField(durationFormatUtilsClazz, "S", s1);
            String string = "sS";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s1, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "s", prevS);
            setStaticField(DurationFormatUtils.class, "S", prevS1);
        }
    }
    
    @Test
    public void testLexx23() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevS = DurationFormatUtils.s;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "sd";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(d, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx24() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevS = DurationFormatUtils.s;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "ssM";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 2);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx25() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "sm";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(s, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx26() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.M;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "M";
            setStaticField(durationFormatUtilsClazz, "M", m);
            String string = "yM";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "M", prevM);
        }
    }
    
    @Test
    public void testLexx27() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevD = DurationFormatUtils.d;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "yyd";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 2);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(d, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testLexx28() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevH = DurationFormatUtils.H;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "yyH";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 2);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(h, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx29() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevS = DurationFormatUtils.s;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "ys";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx30() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevS = DurationFormatUtils.S;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "yS";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testLexx31() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.m;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "ym";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(y, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx32() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevS = DurationFormatUtils.s;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "Hs";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx33() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevH = DurationFormatUtils.H;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "Hy";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(y, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx34() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "Hm";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx35() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevH = DurationFormatUtils.H;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "HM";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx36() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "Hd";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(h, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(d, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx37() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "dM";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testLexx38() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevM = DurationFormatUtils.m;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "ddm";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 2);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx39() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevS = DurationFormatUtils.S;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "dS";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testLexx40() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevD = DurationFormatUtils.d;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "dy";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(y, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testLexx41() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevS = DurationFormatUtils.s;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "dds";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 2);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx42() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevH = DurationFormatUtils.H;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String h = "H";
            setStaticField(durationFormatUtilsClazz, "H", h);
            String string = "dH";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(d, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(h, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "H", prevH);
        }
    }
    
    @Test
    public void testLexx43() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevD = DurationFormatUtils.d;
        Object prevM = DurationFormatUtils.m;
        try {
            String d = "d";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "d", d);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "md";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(d, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "d", prevD);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx44() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevH = DurationFormatUtils.H;
        Object prevM = DurationFormatUtils.m;
        try {
            String h = "H";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "H", h);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "mH";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(h, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "H", prevH);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx45() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.S;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "mS";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    
    @Test
    public void testLexx46() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevM1 = DurationFormatUtils.m;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String m1 = "m";
            setStaticField(durationFormatUtilsClazz, "m", m1);
            String string = "mM";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m1, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(m, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "m", prevM1);
        }
    }
    
    @Test
    public void testLexx47() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.m;
        Object prevS = DurationFormatUtils.s;
        try {
            String m = "m";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "m", m);
            String s = "s";
            setStaticField(durationFormatUtilsClazz, "s", s);
            String string = "ms";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "m", prevM);
            setStaticField(DurationFormatUtils.class, "s", prevS);
        }
    }
    
    @Test
    public void testLexx48() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevY = DurationFormatUtils.y;
        Object prevM = DurationFormatUtils.m;
        try {
            String y = "y";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "y", y);
            String m = "m";
            setStaticField(durationFormatUtilsClazz, "m", m);
            String string = "my";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 1);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(y, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "y", prevY);
            setStaticField(DurationFormatUtils.class, "m", prevM);
        }
    }
    
    @Test
    public void testLexx49() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevD = DurationFormatUtils.d;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String d = "d";
            setStaticField(durationFormatUtilsClazz, "d", d);
            String string = "MMd";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 2);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(d, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "d", prevD);
        }
    }
    
    @Test
    public void testLexx50() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Object prevM = DurationFormatUtils.M;
        Object prevS = DurationFormatUtils.S;
        try {
            String m = "M";
            Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
            setStaticField(durationFormatUtilsClazz, "M", m);
            String s = "S";
            setStaticField(durationFormatUtilsClazz, "S", s);
            String string = "MMS";
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] actual = DurationFormatUtils.lexx(string);
            
            org.apache.commons.lang.time.DurationFormatUtils.Token[] expected = new org.apache.commons.lang.time.DurationFormatUtils.Token[2];
            DurationFormatUtils.Token token = new DurationFormatUtils.Token(m, 2);
            expected[0] = token;
            DurationFormatUtils.Token token1 = new DurationFormatUtils.Token(s, 1);
            expected[1] = token1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(DurationFormatUtils.class, "M", prevM);
            setStaticField(DurationFormatUtils.class, "S", prevS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatPeriod
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method formatPeriod(long, long, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatPeriod(long,long,java.lang.String)}
 * @utbot.invokes {@link java.util.TimeZone#getDefault()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return formatPeriod(startMillis, endMillis, format, true, TimeZone.getDefault());
 *  */
    @Test
    public void testFormatPeriod_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.formatPeriod] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.DurationFormatUtils.lexx(DurationFormatUtils.java:460)
            org.apache.commons.lang.time.DurationFormatUtils.formatDuration(DurationFormatUtils.java:128)
            org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(DurationFormatUtils.java:267)
            org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(DurationFormatUtils.java:247) */
        DurationFormatUtils.formatPeriod(-255L, -255L, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method formatPeriod(long, long, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#formatPeriod(long,long,java.lang.String)}
     */
    @Test
    public void testFormatPeriodWithNonEmptyString() {
        String actual = DurationFormatUtils.formatPeriod(16385L, -1L, "10");
        
        String expected = "10";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method formatPeriod(long, long, java.lang.String)
    
    @Test
    public void testFormatPeriod1() {
        String string = "";
        
        String actual = DurationFormatUtils.formatPeriod(0L, 0L, string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.formatPeriod
    
    ///region Errors report for formatPeriod
    
    public void testFormatPeriod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reduceAndCorrect(java.util.Calendar, java.util.Calendar, int, int)
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#reduceAndCorrect(java.util.Calendar,java.util.Calendar,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: end.add(field, -1 * difference);
 *  */
    @Test
    public void testReduceAndCorrect_ThrowIllegalArgumentException_1() throws Throwable  {
        Object japaneseImperialCalendar = createInstance("java.util.JapaneseImperialCalendar");
        
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect] produces [java.lang.IllegalArgumentException]
            java.base/java.util.JapaneseImperialCalendar.add(JapaneseImperialCalendar.java:435)
            org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(DurationFormatUtils.java:433) */
        Class durationFormatUtilsClazz = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class calendarType = Class.forName("java.util.Calendar");
        Class intType = int.class;
        Method reduceAndCorrectMethod = durationFormatUtilsClazz.getDeclaredMethod("reduceAndCorrect", calendarType, calendarType, intType, intType);
        reduceAndCorrectMethod.setAccessible(true);
        java.lang.Object[] reduceAndCorrectMethodArguments = new java.lang.Object[4];
        reduceAndCorrectMethodArguments[0] = ((Object) null);
        reduceAndCorrectMethodArguments[1] = japaneseImperialCalendar;
        reduceAndCorrectMethodArguments[2] = -1;
        reduceAndCorrectMethodArguments[3] = -255;
        try {
            reduceAndCorrectMethod.invoke(null, reduceAndCorrectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#reduceAndCorrect(java.util.Calendar,java.util.Calendar,int,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: end.add(field, -1 * difference);
 *  */
    @Test
    public void testReduceAndCorrect_ThrowIllegalArgumentException() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect] produces [java.lang.IllegalArgumentException]
            java.base/java.util.GregorianCalendar.add(GregorianCalendar.java:920)
            org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(DurationFormatUtils.java:433) */
        DurationFormatUtils.reduceAndCorrect(null, gregorianCalendar, 129, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#reduceAndCorrect(java.util.Calendar,java.util.Calendar,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: end.add(field, -1 * difference);
 *  */
    @Test
    public void testReduceAndCorrect_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            java.base/java.util.Calendar.internalGet(Calendar.java:1863)
            java.base/java.util.GregorianCalendar.add(GregorianCalendar.java:950)
            org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(DurationFormatUtils.java:433) */
        DurationFormatUtils.reduceAndCorrect(null, gregorianCalendar, 2, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#reduceAndCorrect(java.util.Calendar,java.util.Calendar,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testReduceAndCorrect_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] stamp = {0};
        setField(gregorianCalendar, "java.util.Calendar", "stamp", stamp);
        gregorianCalendar.setLenient(true);
        
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 1]
            java.base/java.util.Calendar.selectFields(Calendar.java:2462)
            java.base/java.util.GregorianCalendar.computeTime(GregorianCalendar.java:2618)
            java.base/java.util.Calendar.updateTime(Calendar.java:3411)
            java.base/java.util.Calendar.complete(Calendar.java:2279)
            java.base/java.util.GregorianCalendar.add(GregorianCalendar.java:924)
            org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(DurationFormatUtils.java:433) */
        DurationFormatUtils.reduceAndCorrect(null, gregorianCalendar, 0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#reduceAndCorrect(java.util.Calendar,java.util.Calendar,int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: end.add(field, -1 * difference);
 *  */
    @Test
    public void testReduceAndCorrect_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GregorianCalendar gregorianCalendar = ((GregorianCalendar) createInstance("java.util.GregorianCalendar"));
        int[] fields = {255};
        setField(gregorianCalendar, "java.util.Calendar", "fields", fields);
        boolean[] isSet = {};
        setField(gregorianCalendar, "java.util.Calendar", "isSet", isSet);
        setField(gregorianCalendar, "java.util.Calendar", "isTimeSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areFieldsSet", true);
        setField(gregorianCalendar, "java.util.Calendar", "areAllFieldsSet", true);
        
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.util.Calendar.set(Calendar.java:1907)
            java.base/java.util.GregorianCalendar.add(GregorianCalendar.java:1001)
            org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(DurationFormatUtils.java:433) */
        DurationFormatUtils.reduceAndCorrect(null, gregorianCalendar, 0, 256);
    }
    
    /**
    @utbot.classUnderTest {@link DurationFormatUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.time.DurationFormatUtils#reduceAndCorrect(java.util.Calendar,java.util.Calendar,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: end.add(field, -1 * difference);
 *  */
    @Test
    public void testReduceAndCorrect_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect] produces [java.lang.NullPointerException]
            org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(DurationFormatUtils.java:433) */
        DurationFormatUtils.reduceAndCorrect(null, null, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields672190212133100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields672190212133100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass672190212137400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields672190212133100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass672190212137400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields672190218355400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields672190218355400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass672190218357300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields672190218355400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass672190218357300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

