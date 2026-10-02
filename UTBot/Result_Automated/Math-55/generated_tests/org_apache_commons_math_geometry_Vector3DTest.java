package org.apache.commons.math.geometry;

import org.junit.Test;
import org.apache.commons.math.exception.MathArithmeticException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math_geometry_Vector3DTest {
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.distance1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distance1(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distance1(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.returnsFrom {@code return dx + dy + dz;}
 *  */
    @Test
    public void testDistance1_FastMathAbs() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -3.6994223988987234E83);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.POSITIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 4.9E-324);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", 7.6435669405839735E84);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "y", -2.225073859025267E-308);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "z", -4.458839411774197E-308);
        
        double actual = Vector3D.distance1(vector3D, vector3D1);
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance1(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distance1(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = FastMath.abs(v2.x - v1.x);
 *  */
    @Test
    public void testDistance1_ThrowNullPointerException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distance1] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distance1(Vector3D.java:486) */
        Vector3D.distance1(null, vector3D);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distance1(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = FastMath.abs(v2.x - v1.x);
 *  */
    @Test
    public void testDistance1_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distance1] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distance1(Vector3D.java:486) */
        Vector3D.distance1(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.angle
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method angle(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#angle(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.geometry.Vector3D#getNorm()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double normProduct = v1.getNorm() * v2.getNorm();
 *  */
    @Test
    public void testAngle_ThrowNullPointerException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.angle] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.angle(Vector3D.java:337) */
        Vector3D.angle(vector3D, null);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#angle(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.geometry.Vector3D#getNorm()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double normProduct = v1.getNorm() * v2.getNorm();
 *  */
    @Test
    public void testAngle_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.angle] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.angle(Vector3D.java:337) */
        Vector3D.angle(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getNorm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNorm()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNorm()}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.sqrt(x * x + y * y + z * z);}
 *  */
    @Test
    public void testGetNorm_FastMathSqrt() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        double actual = vector3D.getNorm();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNorm()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNorm()}
     */
    @Test
    public void testGetNormReturnsInfinity() {
        Vector3D vector3D = new Vector3D(0.0, -1.0, -1.1235582092889474E307);
        
        double actual = vector3D.getNorm();
        
        assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getY
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getY()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getY()}
 * @utbot.returnsFrom {@code return y;}
 *  */
    @Test
    public void testGetY_ReturnY() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        
        double actual = vector3D.getY();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getZ
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getZ()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getZ()}
 * @utbot.returnsFrom {@code return z;}
 *  */
    @Test
    public void testGetZ_ReturnZ() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        double actual = vector3D.getZ();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getNormInf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNormInf()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNormInf()}
 * @utbot.returnsFrom {@code return FastMath.max(FastMath.max(FastMath.abs(x), FastMath.abs(y)), FastMath.abs(z));}
 *  */
    @Test
    public void testGetNormInf_ReturnFastMathMax() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 8.606711808E9);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -2.229419705887099E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", -0.0);
        
        double actual = vector3D.getNormInf();
        
        assertEquals(8.606711808E9, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNormInf()}
 * @utbot.returnsFrom {@code return FastMath.max(FastMath.max(FastMath.abs(x), FastMath.abs(y)), FastMath.abs(z));}
 *  */
    @Test
    public void testGetNormInf_ReturnFastMathMax_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 4.4729378033498695E-19);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -4.4729378033498695E-19);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", -8.328207931905574E-17);
        
        double actual = vector3D.getNormInf();
        
        assertEquals(8.328207931905574E-17, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNormInf()}
 * @utbot.returnsFrom {@code return FastMath.max(FastMath.max(FastMath.abs(x), FastMath.abs(y)), FastMath.abs(z));}
 *  */
    @Test
    public void testGetNormInf_ReturnFastMathMax_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -4.3462452541077E-311);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        double actual = vector3D.getNormInf();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNormInf()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNormInf()}
     */
    @Test
    public void testGetNormInf() {
        Vector3D vector3D = new Vector3D(0.0, -1.0, -1.1235582092889474E307);
        
        double actual = vector3D.getNormInf();
        
        assertEquals(1.1235582092889474E307, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getX
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getX()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getX()}
 * @utbot.returnsFrom {@code return x;}
 *  */
    @Test
    public void testGetX_ReturnX() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        double actual = vector3D.getX();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getNormSq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNormSq()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNormSq()}
 * @utbot.returnsFrom {@code return x * x + y * y + z * z;}
 *  */
    @Test
    public void testGetNormSq_ReturnXMultiplyXPlusYMultiplyYPlusZMultiplyZ() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        double actual = vector3D.getNormSq();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.distanceSq
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distanceSq(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distanceSq(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.returnsFrom {@code return dx * dx + dy * dy + dz * dz;}
 *  */
    @Test
    public void testDistanceSq_ReturnDxMultiplyDxPlusDyMultiplyDyPlusDzMultiplyDz() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        double actual = Vector3D.distanceSq(vector3D, vector3D);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distanceSq(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distanceSq(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = v2.x - v1.x;
 *  */
    @Test
    public void testDistanceSq_ThrowNullPointerException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distanceSq] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distanceSq(Vector3D.java:531) */
        Vector3D.distanceSq(null, vector3D);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distanceSq(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = v2.x - v1.x;
 *  */
    @Test
    public void testDistanceSq_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distanceSq] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distanceSq(Vector3D.java:531) */
        Vector3D.distanceSq(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getAlpha
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAlpha()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.POSITIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(-0.7853981633974483, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NEGATIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 3.337610787760802E-308);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_3() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.POSITIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 3.337610787760802E-308);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_4() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NEGATIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(-2.356194490192345, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_5() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NEGATIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -1.0);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(-3.141592653589793, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_6() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 3.337610787760802E-308);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_7() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NEGATIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(2.356194490192345, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_8() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_9() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.POSITIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(0.7853981633974483, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_10() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_11() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_12() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
 * @utbot.returnsFrom {@code return FastMath.atan2(y, x);}
 *  */
    @Test
    public void testGetAlpha_ReturnFastMathAtan2_13() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -0.0);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(-3.141592653589793, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getAlpha()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getAlpha()}
     */
    @Test
    public void testGetAlpha() {
        Vector3D vector3D = new Vector3D(0.0, -1.0, -1.1235582092889474E307);
        
        double actual = vector3D.getAlpha();
        
        assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.scalarMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scalarMultiply(double)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#scalarMultiply(double)}
 * @utbot.returnsFrom {@code return new Vector3D(a * x, a * y, a * z);}
 *  */
    @Test
    public void testScalarMultiply_Return() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        Vector3D actual = vector3D.scalarMultiply(java.lang.Double.NaN);
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.distanceInf
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distanceInf(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distanceInf(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = FastMath.abs(v2.x - v1.x);
 *  */
    @Test
    public void testDistanceInf_ThrowNullPointerException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distanceInf] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distanceInf(Vector3D.java:516) */
        Vector3D.distanceInf(null, vector3D);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distanceInf(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = FastMath.abs(v2.x - v1.x);
 *  */
    @Test
    public void testDistanceInf_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distanceInf] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distanceInf(Vector3D.java:516) */
        Vector3D.distanceInf(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getDelta
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelta()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getDelta()}
 * @utbot.invokes {@link org.apache.commons.math.geometry.Vector3D#getNorm()}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#asin(double)}
 * @utbot.returnsFrom {@code return FastMath.asin(z / getNorm());}
 *  */
    @Test
    public void testGetDelta_FastMathAsin() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        double actual = vector3D.getDelta();
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getDelta()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getDelta()}
     */
    @Test
    public void testGetDeltaReturnsZero() {
        Vector3D vector3D = new Vector3D(0.0, -1.0, -1.1235582092889474E307);
        
        double actual = vector3D.getDelta();
        
        assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.orthogonal
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method orthogonal()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#orthogonal()}
     */
    @Test
    public void testOrthogonal() throws Exception  {
        Vector3D vector3D = new Vector3D(0.0, -1.0, 0.0625);
        
        Vector3D actual = vector3D.orthogonal();
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", 0.06237828615518053);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", 0.9980525784828885);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#dotProduct(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.returnsFrom {@code return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;}
 *  */
    @Test
    public void testDotProduct_ReturnV1XMultiplyV2XPlusV1YMultiplyV2YPlusV1ZMultiplyV2Z() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        double actual = Vector3D.dotProduct(vector3D, vector3D);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#dotProduct(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.dotProduct(Vector3D.java:449) */
        Vector3D.dotProduct(vector3D, null);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#dotProduct(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.dotProduct(Vector3D.java:449) */
        Vector3D.dotProduct(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.crossProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method crossProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#crossProduct(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.returnsFrom {@code return new Vector3D(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);}
 *  */
    @Test
    public void testCrossProduct_Return() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        Vector3D actual = Vector3D.crossProduct(vector3D, vector3D);
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method crossProduct(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#crossProduct(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Vector3D(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
 *  */
    @Test
    public void testCrossProduct_ThrowNullPointerException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.crossProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.crossProduct(Vector3D.java:473) */
        Vector3D.crossProduct(vector3D, null);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#crossProduct(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Vector3D(v1.y * v2.z - v1.z * v2.y, v1.z * v2.x - v1.x * v2.z, v1.x * v2.y - v1.y * v2.x);
 *  */
    @Test
    public void testCrossProduct_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.crossProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.crossProduct(Vector3D.java:473) */
        Vector3D.crossProduct(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.getNorm1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNorm1()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNorm1()}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(x) + FastMath.abs(y) + FastMath.abs(z);}
 *  */
    @Test
    public void testGetNorm1_FastMathAbs() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", -0.0);
        
        double actual = vector3D.getNorm1();
        
        assertEquals(4.450147717014403E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNorm1()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#getNorm1()}
     */
    @Test
    public void testGetNorm1() {
        Vector3D vector3D = new Vector3D(0.0, -1.0, -1.1235582092889474E307);
        
        double actual = vector3D.getNorm1();
        
        assertEquals(1.1235582092889474E307, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#add(org.apache.commons.math.geometry.Vector3D)}
 * @utbot.returnsFrom {@code return new Vector3D(x + v.x, y + v.y, z + v.z);}
 *  */
    @Test
    public void testAdd_Return() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        Vector3D actual = vector3D.add(vector3D);
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#add(org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Vector3D(x + v.x, y + v.y, z + v.z);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.add(Vector3D.java:249) */
        vector3D.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(double, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#add(double,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.returnsFrom {@code return new Vector3D(x + factor * v.x, y + factor * v.y, z + factor * v.z);}
 *  */
    @Test
    public void testAdd_Return1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        Vector3D actual = vector3D.add(java.lang.Double.NaN, vector3D);
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(double, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#add(double,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Vector3D(x + factor * v.x, y + factor * v.y, z + factor * v.z);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.add(Vector3D.java:258) */
        vector3D.add(java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): True}
 * @utbot.executesCondition {@code (rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return (x == rhs.x) && (y == rhs.y) && (z == rhs.z);}
 *  */
    @Test
    public void testEquals_XNotEqualsRhsXAndYNotEqualsRhsYAndZNotEqualsRhsZ() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 3.689348821721259E19);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", 4.0000000151340505);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "y", -2.2250738667962474E-308);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "z", -2.0);
        
        boolean actual = vector3D.equals(vector3D1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): True}
 * @utbot.executesCondition {@code (rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return (x == rhs.x) && (y == rhs.y) && (z == rhs.z);}
 *  */
    @Test
    public void testEquals_XNotEqualsRhsXAndYNotEqualsRhsYAndZNotEqualsRhsZ_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -4.9E-324);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 8.000000000349246);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", -4.9E-324);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "y", -2.983336292610323E-154);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "z", -2.5);
        
        boolean actual = vector3D.equals(vector3D1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): True}
 * @utbot.executesCondition {@code (rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return (x == rhs.x) && (y == rhs.y) && (z == rhs.z);}
 *  */
    @Test
    public void testEquals_XEqualsRhsXAndYEqualsRhsYAndZEqualsRhsZ() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 3.785767033341859E-270);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 2.22507392481957E-308);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", -0.0);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "y", 3.785767033341859E-270);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "z", 2.22507392481957E-308);
        
        boolean actual = vector3D.equals(vector3D1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): True}
 * @utbot.executesCondition {@code (rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return (x == rhs.x) && (y == rhs.y) && (z == rhs.z);}
 *  */
    @Test
    public void testEquals_XNotEqualsRhsXAndYNotEqualsRhsYAndZNotEqualsRhsZ_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 5.247683084077167E-116);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -4.392200264243784E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 2.0000076293945312);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", 5.247683084077167E-116);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "y", -4.392200264243784E-308);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "z", -2.225073858507202E-308);
        
        boolean actual = vector3D.equals(vector3D1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): True}
 * @utbot.executesCondition {@code (rhs.isNaN()): True}
 * @utbot.returnsFrom {@code return this.isNaN();}
 *  */
    @Test
    public void testEquals_RhsIsNaN() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        
        boolean actual = vector3D.equals(vector3D1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): True}
 * @utbot.executesCondition {@code (rhs.isNaN()): True}
 * @utbot.returnsFrom {@code return this.isNaN();}
 *  */
    @Test
    public void testEquals_RhsIsNaN_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", 3.39519326554E-313);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        
        boolean actual = vector3D.equals(vector3D1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): True}
 * @utbot.executesCondition {@code (rhs.isNaN()): True}
 * @utbot.returnsFrom {@code return this.isNaN();}
 *  */
    @Test
    public void testEquals_RhsIsNaN_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        Vector3D vector3D1 = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "x", -7.291122019558055E-304);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "y", -2.0000000000000004);
        setField(vector3D1, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        boolean actual = vector3D.equals(vector3D1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Vector3D): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfVector3D() {
        Vector3D vector3D = new Vector3D(0.0, ((Vector3D) null));
        
        boolean actual = vector3D.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Other() {
        Vector3D vector3D = new Vector3D(0.0, ((Vector3D) null));
        
        boolean actual = vector3D.equals(vector3D);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#equals(java.lang.Object)}
     */
    @Test
    public void testEqualsReturnsFalse() {
        Vector3D vector3D = new Vector3D(1.112570881186256E-308, -1.0, java.lang.Double.NEGATIVE_INFINITY);
        Object object = new Object();
        
        boolean actual = vector3D.equals(object);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#toString()}
     */
    @Test
    public void testToString() {
        Vector3D vector3D = new Vector3D(0.0, -1.0, -1.1235582092889474E307);
        
        String actual = vector3D.toString();
        
        String expected = "{0; -1; -11,235,582,092,889,474,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000}";
        
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static final java.util.concurrent.ConcurrentMap sun.util.locale.provider.LocaleProviderAdapter.adapterCache accessible:
        module java.base does not "opens sun.util.locale.provider" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#hashCode()}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#hash(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#hash(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#hash(double)}
 * @utbot.returnsFrom {@code return 31 * (23 * MathUtils.hash(x) + 19 * MathUtils.hash(y) + MathUtils.hash(z));}
 *  */
    @Test
    public void testHashCode_MathUtilsHash() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 4.9E-324);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 2.2250738585072014E-308);
        
        int actual = vector3D.hashCode();
        
        org.junit.Assert.assertEquals(-1041235255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#hashCode()}
 * @utbot.returnsFrom {@code return 8;}
 *  */
    @Test
    public void testHashCode_Return8() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        
        int actual = vector3D.hashCode();
        
        org.junit.Assert.assertEquals(8, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#hashCode()}
 * @utbot.returnsFrom {@code return 8;}
 *  */
    @Test
    public void testHashCode_Return8_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        
        int actual = vector3D.hashCode();
        
        org.junit.Assert.assertEquals(8, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#hashCode()}
 * @utbot.returnsFrom {@code return 8;}
 *  */
    @Test
    public void testHashCode_Return8_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        int actual = vector3D.hashCode();
        
        org.junit.Assert.assertEquals(8, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsNaNOrDoubleIsNaN() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 5.562684646268003E-309);
        
        boolean actual = vector3D.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsNaNOrDoubleIsNaN_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        
        boolean actual = vector3D.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsNaNOrDoubleIsNaN_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        
        boolean actual = vector3D.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(x) || Double.isNaN(y) || Double.isNaN(z);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsNaNOrDoubleIsNaN_3() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        boolean actual = vector3D.isNaN();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.normalize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method normalize()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#normalize()}
 * @utbot.executesCondition {@code (s == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathArithmeticException} when: s == 0
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNormalize_ThrowMathArithmeticException() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        vector3D.normalize();
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#normalize()}
 * @utbot.executesCondition {@code (s == 0): False}
 * @utbot.invokes {@link org.apache.commons.math.geometry.Vector3D#scalarMultiply(double)}
 * @utbot.returnsFrom {@code return scalarMultiply(1 / s);}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathArithmeticException} in: return scalarMultiply(1 / s);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNormalize_ThrowMathArithmeticException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        vector3D.normalize();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method normalize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.geometry.Vector3D}
     * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#normalize()}
     */
    @Test
    public void testNormalize() throws Exception  {
        Vector3D vector3D = new Vector3D(0.0, -1.0, 1.7800590868057611E-307);
        
        Vector3D actual = vector3D.normalize();
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", -1.0);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", 1.7800590868057611E-307);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.isInfinite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isInfinite()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.Double#isInfinite(double)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));}
 *  */
    @Test
    public void testIsInfinite_NotIsNaNAndDoubleIsInfiniteOrDoubleIsInfiniteOrDoubleIsInfinite() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.POSITIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", -2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 2.2250738585072014E-308);
        
        boolean actual = vector3D.isInfinite();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));}
 *  */
    @Test
    public void testIsInfinite_NotIsNaNAndDoubleIsInfiniteOrDoubleIsInfiniteOrDoubleIsInfinite_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 3.337610787760802E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.POSITIVE_INFINITY);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", -2.0);
        
        boolean actual = vector3D.isInfinite();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));}
 *  */
    @Test
    public void testIsInfinite_NotIsNaNAndDoubleIsInfiniteOrDoubleIsInfiniteOrDoubleIsInfinite_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", -2.0);
        
        boolean actual = vector3D.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));}
 *  */
    @Test
    public void testIsInfinite_NotIsNaNAndDoubleIsInfiniteOrDoubleIsInfiniteOrDoubleIsInfinite_3() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 2.2250738585072014E-308);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.POSITIVE_INFINITY);
        
        boolean actual = vector3D.isInfinite();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));}
 *  */
    @Test
    public void testIsInfinite_ReturnNotIsNaNAndDoubleIsInfiniteOrDoubleIsInfiniteOrDoubleIsInfinite() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        
        boolean actual = vector3D.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));}
 *  */
    @Test
    public void testIsInfinite_ReturnNotIsNaNAndDoubleIsInfiniteOrDoubleIsInfiniteOrDoubleIsInfinite_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        
        boolean actual = vector3D.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(x) || Double.isInfinite(y) || Double.isInfinite(z));}
 *  */
    @Test
    public void testIsInfinite_ReturnNotIsNaNAndDoubleIsInfiniteOrDoubleIsInfiniteOrDoubleIsInfinite_2() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", -2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 2.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        boolean actual = vector3D.isInfinite();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distance(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distance(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.sqrt(dx * dx + dy * dy + dz * dz);}
 *  */
    @Test
    public void testDistance_FastMathSqrt() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", 0.0);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", 0.0);
        
        double actual = Vector3D.distance(vector3D, vector3D);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance(org.apache.commons.math.geometry.Vector3D, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distance(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = v2.x - v1.x;
 *  */
    @Test
    public void testDistance_ThrowNullPointerException_1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distance(Vector3D.java:501) */
        Vector3D.distance(null, vector3D);
    }
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#distance(org.apache.commons.math.geometry.Vector3D,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dx = v2.x - v1.x;
 *  */
    @Test
    public void testDistance_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.distance(Vector3D.java:501) */
        Vector3D.distance(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#negate()}
 * @utbot.returnsFrom {@code return new Vector3D(-x, -y, -z);}
 *  */
    @Test
    public void testNegate_Return() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        Vector3D actual = vector3D.negate();
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#subtract(org.apache.commons.math.geometry.Vector3D)}
 * @utbot.returnsFrom {@code return new Vector3D(x - v.x, y - v.y, z - v.z);}
 *  */
    @Test
    public void testSubtract_Return() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        Vector3D actual = vector3D.subtract(vector3D);
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#subtract(org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Vector3D(x - v.x, y - v.y, z - v.z);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.subtract(Vector3D.java:266) */
        vector3D.subtract(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.geometry.Vector3D.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(double, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#subtract(double,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.returnsFrom {@code return new Vector3D(x - factor * v.x, y - factor * v.y, z - factor * v.z);}
 *  */
    @Test
    public void testSubtract_Return1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        Vector3D actual = vector3D.subtract(java.lang.Double.NaN, vector3D);
        
        Vector3D expected = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "x", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "y", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.geometry.Vector3D", "z", java.lang.Double.NaN);
        
        // org.apache.commons.math.geometry.Vector3D has overridden equals method
        org.junit.Assert.assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(double, org.apache.commons.math.geometry.Vector3D)
    
    /**
    @utbot.classUnderTest {@link Vector3D}
 * @utbot.methodUnderTest {@link org.apache.commons.math.geometry.Vector3D#subtract(double,org.apache.commons.math.geometry.Vector3D)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Vector3D(x - factor * v.x, y - factor * v.y, z - factor * v.z);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() throws Exception  {
        Vector3D vector3D = ((Vector3D) createInstance("org.apache.commons.math.geometry.Vector3D"));
        setField(vector3D, "org.apache.commons.math.geometry.Vector3D", "x", 0.0);
        
        /* This test fails because method [org.apache.commons.math.geometry.Vector3D.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.geometry.Vector3D.subtract(Vector3D.java:275) */
        vector3D.subtract(java.lang.Double.NaN, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields733510182684200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields733510182684200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass733510182691000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields733510182684200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass733510182691000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

