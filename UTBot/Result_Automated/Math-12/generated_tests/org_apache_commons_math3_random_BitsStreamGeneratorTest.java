package org.apache.commons.math3.random;

import org.junit.Test;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math3_random_BitsStreamGeneratorTest {
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.clear
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clear()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#clear()}
 *  */
    @Test
    public void testClear() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        setField(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", 0.0);
        
        mersenneTwister.clear();
        
        double finalMersenneTwisterNextGaussian = ((Double) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        assertEquals(java.lang.Double.NaN, finalMersenneTwisterNextGaussian, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextDouble()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.returnsFrom {@code return (high | low) * 0x1.0p-52d;}
 *  */
    @Test
    public void testNextDouble_ReturnHighBitwiseOrLowMultiply0d() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        double actual = mersenneTwister.nextDouble();
        
        assertEquals(0.0, actual, 1.0E-6);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(2, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.returnsFrom {@code return (high | low) * 0x1.0p-52d;}
 *  */
    @Test
    public void testNextDouble_ReturnHighBitwiseOrLowMultiply0d_1() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {-1440202624, 248186440};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        int[] i1 = {1, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        int[] i2 = {1, 1};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        int[] i3 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        double actual = well44497a.nextDouble();
        
        assertEquals(0.23236132343434202, actual, 1.0E-6);
        
        int finalWell44497aV0 = well44497a.v[0];
        int finalWell44497aV1 = well44497a.v[1];
        
        org.junit.Assert.assertEquals(1946517504, finalWell44497aV0);
        
        org.junit.Assert.assertEquals(-653149184, finalWell44497aV1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextDouble()
    /// Actual number of generated tests (50) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        mersenneTwister.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        mersenneTwister.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        mersenneTwister.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        mersenneTwister.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int low = next(26);
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:88) */
        mersenneTwister.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1073741824;
        int[] iRm1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_43() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_44() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_45() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_46() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_47() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(26)) << 26;
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_49() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87) */
        well44497a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int low = next(26);
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:88) */
        well19937c.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int low = next(26);
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:88) */
        well1024a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int low = next(26);
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:88) */
        well19937a.nextDouble();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int low = next(26);
 *  */
    @Test
    public void testNextDouble_ThrowArrayIndexOutOfBoundsException_48() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {128, 3};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextDouble] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:88) */
        well44497a.nextDouble();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextDouble()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
     */
    @Test
    public void testNextDouble() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        double actual = iSAACRandom.nextDouble();
        
        assertEquals(0.9622133273292672, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
     */
    @Test
    public void testNextDouble1() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        double actual = mersenneTwister.nextDouble();
        
        assertEquals(0.4326757344147678, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextInt(int)
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.executesCondition {@code (bits - val + (n - 1) < 0): False}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testNextInt_BitsMinusValPlusNMinus1GreaterOrEqualZero() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = new int[17];
        mt[0] = -835636569;
        mt[1] = 10881;
        mt[2] = 10881;
        mt[3] = 10881;
        mt[4] = 10881;
        mt[5] = 10881;
        mt[6] = 10881;
        mt[7] = 10881;
        mt[8] = 10881;
        mt[9] = 10881;
        mt[10] = 10881;
        mt[11] = 10881;
        mt[12] = 10881;
        mt[13] = 10881;
        mt[14] = 10881;
        mt[15] = 10881;
        mt[16] = 10881;
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        int actual = mersenneTwister.nextInt(131074);
        
        org.junit.Assert.assertEquals(0, actual);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.returnsFrom {@code return (int) ((n * (long) next(31)) >> 31);}
 *  */
    @Test
    public void testNextInt_NBitwiseAndNegativeNEqualsN() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        int actual = mersenneTwister.nextInt(1);
        
        org.junit.Assert.assertEquals(0, actual);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.returnsFrom {@code return (int) ((n * (long) next(31)) >> 31);}
 *  */
    @Test
    public void testNextInt_NBitwiseAndNegativeNEqualsN_1() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        int actual = well19937c.nextInt(1);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.executesCondition {@code (bits - val + (n - 1) < 0): False}
 * @utbot.returnsFrom {@code return val;}
 *  */
    @Test
    public void testNextInt_BitsMinusValPlusNMinus1GreaterOrEqualZero_1() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1233954882};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        int actual = well1024a.nextInt(47190);
        
        org.junit.Assert.assertEquals(6355, actual);
        
        int finalWell1024aV0 = well1024a.v[0];
        
        org.junit.Assert.assertEquals(1883365610, finalWell1024aV0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextInt(int)
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code (n > 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: throw new NotStrictlyPositiveException(n);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextInt_ThrowNotStrictlyPositiveException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        
        mersenneTwister.nextInt(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextInt(int)
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        mersenneTwister.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        mersenneTwister.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        mersenneTwister.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        mersenneTwister.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.executesCondition {@code (bits - val + (n - 1) < 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {10881, 1676044243};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        mersenneTwister.nextInt(134901808);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1073741824;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well19937c.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {268435456};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 268435456 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well1024a.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(671088643);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {10881, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {10881, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (int) ((n * (long) next(31)) >> 31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:142) */
        well19937c.nextInt(1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(3);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {10881, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(1879048195);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
 * @utbot.executesCondition {@code ((n & -n) == n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bits = next(31);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {10881, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:147) */
        well1024a.nextInt(67108867);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextInt(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
     */
    @Test
    public void testNextIntReturns4() {
        ISAACRandom iSAACRandom = new ISAACRandom(0L);
        
        int actual = iSAACRandom.nextInt(5);
        
        org.junit.Assert.assertEquals(4, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
     */
    @Test
    public void testNextIntReturns2545() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        int actual = mersenneTwister.nextInt(4097);
        
        org.junit.Assert.assertEquals(2545, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
     */
    @Test
    public void testNextIntReturnsZero() {
        int[] intArray = {Integer.MIN_VALUE, -1, 1};
        ISAACRandom iSAACRandom = new ISAACRandom(intArray);
        
        int actual = iSAACRandom.nextInt(1);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextInt(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt(int)}
     */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testNextIntThrowsNSPE() {
        int[] intArray = {Integer.MIN_VALUE, -1, 1};
        ISAACRandom iSAACRandom = new ISAACRandom(intArray);
        
        iSAACRandom.nextInt(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextInt()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.returnsFrom {@code return next(32);}
 *  */
    @Test
    public void testNextInt_ReturnNext() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        int actual = mersenneTwister.nextInt();
        
        org.junit.Assert.assertEquals(0, actual);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.returnsFrom {@code return next(32);}
 *  */
    @Test
    public void testNextInt_ReturnNext_1() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        int actual = well19937c.nextInt();
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.returnsFrom {@code return next(32);}
 *  */
    @Test
    public void testNextInt_ReturnNext_2() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        int actual = well1024a.nextInt();
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.returnsFrom {@code return next(32);}
 *  */
    @Test
    public void testNextInt_ReturnNext_3() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        int actual = well19937a.nextInt();
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.returnsFrom {@code return next(32);}
 *  */
    @Test
    public void testNextInt_ReturnNext_4() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        int actual = well44497a.nextInt();
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.returnsFrom {@code return next(32);}
 *  */
    @Test
    public void testNextInt_ReturnNext_5() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {128};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm1);
        
        int actual = well44497a.nextInt();
        
        org.junit.Assert.assertEquals(-1221921556, actual);
        
        int finalWell44497aV0 = well44497a.v[0];
        
        org.junit.Assert.assertEquals(-1221951488, finalWell44497aV0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextInt()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        mersenneTwister.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_110() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        mersenneTwister.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        mersenneTwister.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        mersenneTwister.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_91() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_151() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1073741824;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_181() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_241() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1073741824;
        int[] iRm1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_271() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_51() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_61() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_71() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_81() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_101() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_111() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_121() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_131() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_141() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937c.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_161() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_171() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_191() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_201() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_211() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_221() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_231() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well1024a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_251() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_261() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_311() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well19937a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_411() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_43() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_44() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(32);
 *  */
    @Test
    public void testNextInt_ThrowArrayIndexOutOfBoundsException_45() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextInt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextInt(BitsStreamGenerator.java:121) */
        well44497a.nextInt();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextInt()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
     */
    @Test
    public void testNextInt() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        int actual = iSAACRandom.nextInt();
        
        org.junit.Assert.assertEquals(196562602, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextInt()}
     */
    @Test
    public void testNextInt1() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        int actual = mersenneTwister.nextInt();
        
        org.junit.Assert.assertEquals(751433465, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextLong()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.returnsFrom {@code return high | low;}
 *  */
    @Test
    public void testNextLong_ReturnHighBitwiseOrLow() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        long actual = mersenneTwister.nextLong();
        
        org.junit.Assert.assertEquals(0L, actual);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(2, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.returnsFrom {@code return high | low;}
 *  */
    @Test
    public void testNextLong_ReturnHighBitwiseOrLow_1() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {-1872750590, 1080035376};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        int[] i1 = {1, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        int[] i2 = {0, 1};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        int[] i3 = {1, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        long actual = well44497a.nextLong();
        
        org.junit.Assert.assertEquals(-8052435581207380888L, actual);
        
        int finalWell44497aV0 = well44497a.v[0];
        int finalWell44497aV1 = well44497a.v[1];
        
        org.junit.Assert.assertEquals(-1519747072, finalWell44497aV0);
        
        org.junit.Assert.assertEquals(-2113798144, finalWell44497aV1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextLong()
    /// Actual number of generated tests (50) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        mersenneTwister.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        mersenneTwister.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        mersenneTwister.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        mersenneTwister.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long low = ((long) next(32)) & 0xffffffffL;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:158) */
        mersenneTwister.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1073741824;
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_43() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_44() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_45() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_46() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_47() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long high = ((long) next(32)) << 32;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_49() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:157) */
        well44497a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long low = ((long) next(32)) & 0xffffffffL;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:158) */
        well19937c.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long low = ((long) next(32)) & 0xffffffffL;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:158) */
        well1024a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long low = ((long) next(32)) & 0xffffffffL;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:158) */
        well19937a.nextLong();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final long low = ((long) next(32)) & 0xffffffffL;
 *  */
    @Test
    public void testNextLong_ThrowArrayIndexOutOfBoundsException_48() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0, 3};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextLong] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextLong(BitsStreamGenerator.java:158) */
        well44497a.nextLong();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextLong()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
     */
    @Test
    public void testNextLong() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        long actual = iSAACRandom.nextLong();
        
        org.junit.Assert.assertEquals(-3281563211205741744L, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextLong()}
     */
    @Test
    public void testNextLong1() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        long actual = mersenneTwister.nextLong();
        
        org.junit.Assert.assertEquals(-5758214154001723499L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextBoolean()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.returnsFrom {@code return next(1) != 0;}
 *  */
    @Test
    public void testNextBoolean_ReturnNextEqualsZero() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            16842752, 10881, 10881, 10881, 10881, 10881, 10881, 10881,
            10881
        };
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        boolean actual = mersenneTwister.nextBoolean();
        
        assertFalse(actual);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.returnsFrom {@code return next(1) != 0;}
 *  */
    @Test
    public void testNextBoolean_ReturnNextEqualsZero_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            16777216, 10881, 10881, 10881, 10881, 10881, 10881, 10881,
            10881
        };
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        boolean actual = mersenneTwister.nextBoolean();
        
        assertTrue(actual);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.returnsFrom {@code return next(1) != 0;}
 *  */
    @Test
    public void testNextBoolean_ReturnNextEqualsZero_3() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {18092032};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm1);
        
        boolean actual = well1024a.nextBoolean();
        
        assertFalse(actual);
        
        int finalWell1024aV0 = well1024a.v[0];
        
        org.junit.Assert.assertEquals(622791696, finalWell1024aV0);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.returnsFrom {@code return next(1) != 0;}
 *  */
    @Test
    public void testNextBoolean_ReturnNextEqualsZero_6() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {2097184};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm1);
        
        boolean actual = well44497a.nextBoolean();
        
        assertFalse(actual);
        
        int finalWell44497aV0 = well44497a.v[0];
        
        org.junit.Assert.assertEquals(1090551808, finalWell44497aV0);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.returnsFrom {@code return next(1) != 0;}
 *  */
    @Test
    public void testNextBoolean_ReturnNextEqualsZero_2() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {4227072, 7176};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        int[] i2 = {1};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i2);
        
        boolean actual = well19937c.nextBoolean();
        
        assertFalse(actual);
        
        int finalWell19937cV0 = well19937c.v[0];
        
        org.junit.Assert.assertEquals(0, finalWell19937cV0);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.returnsFrom {@code return next(1) != 0;}
 *  */
    @Test
    public void testNextBoolean_ReturnNextEqualsZero_4() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {4721664, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        int[] i1 = {1};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        
        boolean actual = well19937a.nextBoolean();
        
        assertFalse(actual);
        
        int finalWell19937aIndex = well19937a.index;
        int finalWell19937aV0 = well19937a.v[0];
        int finalWell19937aV1 = well19937a.v[1];
        
        org.junit.Assert.assertEquals(1, finalWell19937aIndex);
        
        org.junit.Assert.assertEquals(0, finalWell19937aV0);
        
        org.junit.Assert.assertEquals(1351617537, finalWell19937aV1);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.returnsFrom {@code return next(1) != 0;}
 *  */
    @Test
    public void testNextBoolean_ReturnNextEqualsZero_5() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {4224};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        int[] i2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        int[] i3 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        boolean actual = well44497a.nextBoolean();
        
        assertFalse(actual);
        
        int finalWell44497aV0 = well44497a.v[0];
        
        org.junit.Assert.assertEquals(927629312, finalWell44497aV0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextBoolean()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 623);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 623 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        mersenneTwister.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        mersenneTwister.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        mersenneTwister.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        mersenneTwister.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 536870912;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 536870912;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 536870912;
        int[] iRm1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_43() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 536870912;
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937c.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well1024a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well19937a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_44() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(1) != 0;
 *  */
    @Test
    public void testNextBoolean_ThrowArrayIndexOutOfBoundsException_45() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBoolean(BitsStreamGenerator.java:63) */
        well44497a.nextBoolean();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextBoolean()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
     */
    @Test
    public void testNextBooleanReturnsTrue() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        boolean actual = iSAACRandom.nextBoolean();
        
        assertTrue(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
     */
    @Test
    public void testNextBooleanReturnsFalse() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        boolean actual = iSAACRandom.nextBoolean();
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
     */
    @Test
    public void testNextBooleanReturnsFalse1() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        boolean actual = mersenneTwister.nextBoolean();
        
        assertFalse(actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBoolean()}
     */
    @Test
    public void testNextBooleanReturnsTrue1() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        boolean actual = mersenneTwister.nextBoolean();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextBytes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextBytes([B)
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 *  */
    @Test
    public void testNextBytes() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        byte[] byteArray = {};
        
        mersenneTwister.nextBytes(byteArray);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 *  */
    @Test
    public void testNextBytes_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        byte[] byteArray = {(byte) -127};
        
        mersenneTwister.nextBytes(byteArray);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        byte finalByteArray0 = byteArray[0];
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
        
        org.junit.Assert.assertEquals((byte) 0, finalByteArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextBytes([B)
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:78) */
        mersenneTwister.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 623);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 623 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:78) */
        mersenneTwister.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        mersenneTwister.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        mersenneTwister.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 268435456;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 268435456 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:78) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:78) */
        mersenneTwister.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 268435456;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 268435456 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {10881, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {10881, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {10881, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {10881, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        byte[] byteArray = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:78) */
        well19937c.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.iterates iterate the loop {@code while(i < iEnd)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int random = next(32);
 *  */
    @Test
    public void testNextBytes_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i1);
        byte[] byteArray = new byte[33];
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
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        byteArray[28] = (byte) -127;
        byteArray[29] = (byte) -127;
        byteArray[30] = (byte) -127;
        byteArray[31] = (byte) -127;
        byteArray[32] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:71) */
        well1024a.nextBytes(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int iEnd = bytes.length - 3;
 *  */
    @Test
    public void testNextBytes_ThrowNullPointerException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextBytes] produces [java.lang.NullPointerException]
            org.apache.commons.math3.random.BitsStreamGenerator.nextBytes(BitsStreamGenerator.java:69) */
        mersenneTwister.nextBytes(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextBytes([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
     */
    @Test
    public void testNextBytesWithNonEmptyPrimitiveArray() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        byte[] byteArray = {java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE};
        
        iSAACRandom.nextBytes(byteArray);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        
        org.junit.Assert.assertEquals((byte) -27, finalByteArray0);
        
        org.junit.Assert.assertEquals((byte) -32, finalByteArray1);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
     */
    @Test
    public void testNextBytesWithNonEmptyPrimitiveArray1() {
        MersenneTwister mersenneTwister = new MersenneTwister(4);
        byte[] byteArray = {(byte) 0};
        
        mersenneTwister.nextBytes(byteArray);
        
        byte finalByteArray0 = byteArray[0];
        
        org.junit.Assert.assertEquals((byte) 122, finalByteArray0);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextBytes(byte[])}
     */
    @Test
    public void testNextBytesWithNonEmptyPrimitiveArray2() {
        int[] intArray = {16, 0, Integer.MAX_VALUE};
        ISAACRandom iSAACRandom = new ISAACRandom(intArray);
        byte[] byteArray = {(byte) 2, (byte) 2, (byte) 4, (byte) 1};
        
        iSAACRandom.nextBytes(byteArray);
        
        byte finalByteArray0 = byteArray[0];
        byte finalByteArray1 = byteArray[1];
        byte finalByteArray2 = byteArray[2];
        byte finalByteArray3 = byteArray[3];
        
        org.junit.Assert.assertEquals((byte) -110, finalByteArray0);
        
        org.junit.Assert.assertEquals((byte) -64, finalByteArray1);
        
        org.junit.Assert.assertEquals((byte) -115, finalByteArray2);
        
        org.junit.Assert.assertEquals((byte) -100, finalByteArray3);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextFloat()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.returnsFrom {@code return next(23) * 0x1.0p-23f;}
 *  */
    @Test
    public void testNextFloat_ReturnNextMultiply0d() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        
        float actual = mersenneTwister.nextFloat();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
        
        int finalMersenneTwisterMti = ((Integer) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti"));
        
        org.junit.Assert.assertEquals(1, finalMersenneTwisterMti);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.returnsFrom {@code return next(23) * 0x1.0p-23f;}
 *  */
    @Test
    public void testNextFloat_ReturnNextMultiply0d_1() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        float actual = well19937c.nextFloat();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.returnsFrom {@code return next(23) * 0x1.0p-23f;}
 *  */
    @Test
    public void testNextFloat_ReturnNextMultiply0d_2() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        float actual = well1024a.nextFloat();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.returnsFrom {@code return next(23) * 0x1.0p-23f;}
 *  */
    @Test
    public void testNextFloat_ReturnNextMultiply0d_3() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        float actual = well19937a.nextFloat();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.returnsFrom {@code return next(23) * 0x1.0p-23f;}
 *  */
    @Test
    public void testNextFloat_ReturnNextMultiply0d_5() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        float actual = well44497a.nextFloat();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.returnsFrom {@code return next(23) * 0x1.0p-23f;}
 *  */
    @Test
    public void testNextFloat_ReturnNextMultiply0d_4() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {128};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", iRm1);
        
        float actual = well44497a.nextFloat();
        
        org.junit.Assert.assertEquals(0.71549916f, actual, 1.0E-6f);
        
        int finalWell44497aV0 = well44497a.v[0];
        
        org.junit.Assert.assertEquals(-1221951488, finalWell44497aV0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextFloat()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        mersenneTwister.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 623);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 623 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        mersenneTwister.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        mersenneTwister.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        mersenneTwister.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_24() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1073741824;
        int[] iRm1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_27() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_35() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_44() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = Integer.MIN_VALUE;
        int[] iRm1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937c.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_19() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_20() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_23() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] i1 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well1024a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_25() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_26() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_28() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_29() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_30() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        int[] v = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {1073741824};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_33() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] v = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_34() throws Exception  {
        Well19937a well19937a = ((Well19937a) createInstance("org.apache.commons.math3.random.Well19937a"));
        well19937a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937a.next(Well19937a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well19937a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_36() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_37() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_38() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_39() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_40() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:95)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_43() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return next(23) * 0x1.0p-23f;
 *  */
    @Test
    public void testNextFloat_ThrowArrayIndexOutOfBoundsException_45() throws Exception  {
        Well44497a well44497a = ((Well44497a) createInstance("org.apache.commons.math3.random.Well44497a"));
        well44497a.index = 1;
        int[] v = {0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well44497a, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextFloat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well44497a.next(Well44497a.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextFloat(BitsStreamGenerator.java:94) */
        well44497a.nextFloat();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextFloat()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
     */
    @Test
    public void testNextFloat() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        float actual = iSAACRandom.nextFloat();
        
        org.junit.Assert.assertEquals(0.89727724f, actual, 1.0E-6f);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextFloat()}
     */
    @Test
    public void testNextFloat1() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        float actual = mersenneTwister.nextFloat();
        
        org.junit.Assert.assertEquals(0.6057229f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextGaussian()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.returnsFrom {@code return random;}
 *  */
    @Test
    public void testNextGaussian_DoubleIsNaN() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        setField(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", -2.0000000000000004);
        
        double actual = mersenneTwister.nextGaussian();
        
        assertEquals(-2.0000000000000004, actual, 1.0E-6);
        
        double finalMersenneTwisterNextGaussian = ((Double) getFieldValue(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        assertEquals(java.lang.Double.NaN, finalMersenneTwisterNextGaussian, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextGaussian()
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        mersenneTwister.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        mersenneTwister.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 623);
        setField(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 623 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        mersenneTwister.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        mersenneTwister.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.invokes {@link org.apache.commons.math3.random.BitsStreamGenerator#nextDouble()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double y = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        MersenneTwister mersenneTwister = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = new int[15];
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(mersenneTwister, "org.apache.commons.math3.random.MersenneTwister", "mti", 13);
        setField(mersenneTwister, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:104) */
        mersenneTwister.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1073741824;
        int[] iRm1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {10881, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_13() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {10881, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_15() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_16() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        well19937c.index = 1;
        int[] v = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_18() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        int[] v = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1073741824};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(well1024a, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:93)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well1024a.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_14() throws Exception  {
        Well19937c well19937c = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0, 0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(well19937c, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:88)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well19937c.nextGaussian();
    }
    
    /**
    @utbot.classUnderTest {@link BitsStreamGenerator}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = nextDouble();
 *  */
    @Test
    public void testNextGaussian_ThrowArrayIndexOutOfBoundsException_17() throws Exception  {
        Well1024a well1024a = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        well1024a.index = 1;
        int[] v = {10881, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(well1024a, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(well1024a, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well1024a.next(Well1024a.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:103) */
        well1024a.nextGaussian();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextGaussian()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
     */
    @Test
    public void testNextGaussian() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        double actual = iSAACRandom.nextGaussian();
        
        assertEquals(0.17340884159099423, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
     */
    @Test
    public void testNextGaussian1() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        double actual = iSAACRandom.nextGaussian();
        
        assertEquals(0.11718354213663044, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
     */
    @Test
    public void testNextGaussian2() {
        ISAACRandom iSAACRandom = new ISAACRandom();
        
        double actual = iSAACRandom.nextGaussian();
        
        assertEquals(-0.9724462007449353, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
     */
    @Test
    public void testNextGaussian3() {
        MersenneTwister mersenneTwister = new MersenneTwister();
        
        double actual = mersenneTwister.nextGaussian();
        
        assertEquals(1.0917949887983833, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
     */
    @Test
    public void testNextGaussian4() {
        int[] intArray = {-1, Integer.MAX_VALUE, Integer.MAX_VALUE};
        ISAACRandom iSAACRandom = new ISAACRandom(intArray);
        
        double actual = iSAACRandom.nextGaussian();
        
        assertEquals(-0.4790777255585844, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.random.BitsStreamGenerator#nextGaussian()}
     */
    @Test
    public void testNextGaussian5() {
        int[] intArray = {-2147483647, Integer.MAX_VALUE, 0};
        MersenneTwister mersenneTwister = new MersenneTwister(intArray);
        
        double actual = mersenneTwister.nextGaussian();
        
        assertEquals(-0.19607300431485433, actual, 1.0E-6);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields717749908340900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields717749908340900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass717749908346200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields717749908340900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass717749908346200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields717749908944600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields717749908944600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass717749908946500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields717749908944600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass717749908946500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

