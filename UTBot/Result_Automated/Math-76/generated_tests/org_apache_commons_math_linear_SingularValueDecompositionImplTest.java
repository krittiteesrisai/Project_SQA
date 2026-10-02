package org.apache.commons.math.linear;

import org.junit.Test;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_linear_SingularValueDecompositionImplTest {
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getU
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getU()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (cachedU == null): False}
 * @utbot.returnsFrom {@code return cachedU;}
 *  */
    @Test
    public void testGetU_CachedUNotEqualsNull() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        OpenMapRealMatrix cachedU = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedU", cachedU);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) singularValueDecompositionImpl.getU());
        
        int cachedURows = ((Integer) getFieldValue(cachedU, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(cachedURows, actualRows);
        
        int cachedUColumns = ((Integer) getFieldValue(cachedU, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(cachedUColumns, actualColumns);
        
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        assertNull(actualEntries);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getU()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowNegativeArraySizeException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, m - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 14);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 14);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0, 0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, m - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = new double[12];
        realEigenvalues[0] = -0.0;
        realEigenvalues[5] = -0.0;
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int p = singularValues.length;
 *  */
    @Test
    public void testGetU_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:158) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowNullPointerException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, m - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowNullPointerException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, m - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowNullPointerException_3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowNullPointerException_4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getU()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetU_ThrowNullPointerException_5() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -246);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -246);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.0000000000000004};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getU()
    
    @Test
    public void testGetU1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[33];
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 9]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 268435456);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {java.lang.Double.NaN};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] realEigenvalues = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU5() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU6() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] realEigenvalues = {
            3.337610787760802E-308, -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU7() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU8() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {4.452320640704351E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU9() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.2250759805029923E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU10() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU11() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 536870912);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162) */
        singularValueDecompositionImpl.getU();
    }
    
    @Test
    public void testGetU12() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000002328306, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getU] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189) */
        singularValueDecompositionImpl.getU();
    }
    ///endregion
    
    ///region Errors report for getU
    
    public void testGetU_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUT()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getUT()}
 * @utbot.executesCondition {@code (cachedUt == null): False}
 * @utbot.returnsFrom {@code return cachedUt;}
 *  */
    @Test
    public void testGetUT_CachedUtNotEqualsNull() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        OpenMapRealMatrix cachedUt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedUt", cachedUt);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) singularValueDecompositionImpl.getUT());
        
        int cachedUtRows = ((Integer) getFieldValue(cachedUt, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(cachedUtRows, actualRows);
        
        int cachedUtColumns = ((Integer) getFieldValue(cachedUt, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(cachedUtColumns, actualColumns);
        
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        assertNull(actualEntries);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getUT()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getUT()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: cachedUt = getU().transpose();
 *  */
    @Test
    public void testGetUT_ThrowNegativeArraySizeException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getUT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedUt = getU().transpose();
 *  */
    @Test
    public void testGetUT_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getUT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedUt = getU().transpose();
 *  */
    @Test
    public void testGetUT_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getUT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cachedUt = getU().transpose();
 *  */
    @Test
    public void testGetUT_ThrowNullPointerException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getUT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cachedUt = getU().transpose();
 *  */
    @Test
    public void testGetUT_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getUT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cachedUt = getU().transpose();
 *  */
    @Test
    public void testGetUT_ThrowNullPointerException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 8);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 8);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 3.337610787760802E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getUT()
    
    @Test
    public void testGetUT1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[33];
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 9]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", main);
        double[] realEigenvalues = {
            3.337610787760802E-308, -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1840)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT5() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[11];
        main[0] = java.lang.Double.NaN;
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = new double[12];
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT6() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {4.450147717014403E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            2.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0, 0.0, 0.0, 0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT7() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT8() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT9() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {java.lang.Double.NaN};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = new double[20];
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT10() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", secondary);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT11() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] work = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        double[] realEigenvalues = {
            0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT12() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT13() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[32];
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT14() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            3.337610787760802E-308, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT15() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = new double[11];
        main[10] = 3.337610787760802E-308;
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = new double[12];
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT16() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", realEigenvalues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT17() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-1.1553244005534914E-274};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = new double[12];
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    
    @Test
    public void testGetUT18() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -2147483647);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = {
            java.lang.Double.NaN, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205) */
        singularValueDecompositionImpl.getUT();
    }
    ///endregion
    
    ///region Errors report for getUT
    
    public void testGetUT_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCovariance(double)
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.executesCondition {@code (dimension == 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while((dimension < p) && (singularValues[dimension] >= minSingularValue))
 *  */
    @Test
    public void testGetCovariance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:305) */
        singularValueDecompositionImpl.getCovariance(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.executesCondition {@code (dimension == 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code while((dimension < p) && (singularValues[dimension] >= minSingularValue))} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: getVT().walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
 * 
 *     @Override
 *     public void visit(final int row, final int column, final double value) {
 *         data[row][column] = value / singularValues[row];
 *     }
 * }, 0, dimension - 1, 0, p - 1);
 *  */
    @Test
    public void testGetCovariance_ThrowNegativeArraySizeException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {4.9E-324};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:309) */
        singularValueDecompositionImpl.getCovariance(4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.executesCondition {@code (dimension == 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code while((dimension < p) && (singularValues[dimension] >= minSingularValue))} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getVT().walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
 * 
 *     @Override
 *     public void visit(final int row, final int column, final double value) {
 *         data[row][column] = value / singularValues[row];
 *     }
 * }, 0, dimension - 1, 0, p - 1);
 *  */
    @Test
    public void testGetCovariance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.225073858507202E-308, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {2.0522762294318444E-289};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:309) */
        singularValueDecompositionImpl.getCovariance(2.0522762294318444E-289);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int p = singularValues.length;
 *  */
    @Test
    public void testGetCovariance_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:296) */
        singularValueDecompositionImpl.getCovariance(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.executesCondition {@code (dimension == 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code while((dimension < p) && (singularValues[dimension] >= minSingularValue))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getVT().walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
 * 
 *     @Override
 *     public void visit(final int row, final int column, final double value) {
 *         data[row][column] = value / singularValues[row];
 *     }
 * }, 0, dimension - 1, 0, p - 1);
 *  */
    @Test
    public void testGetCovariance_ThrowNullPointerException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {4.9E-324};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:309) */
        singularValueDecompositionImpl.getCovariance(4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.executesCondition {@code (dimension == 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code while((dimension < p) && (singularValues[dimension] >= minSingularValue))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getVT().walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
 * 
 *     @Override
 *     public void visit(final int row, final int column, final double value) {
 *         data[row][column] = value / singularValues[row];
 *     }
 * }, 0, dimension - 1, 0, p - 1);
 *  */
    @Test
    public void testGetCovariance_ThrowNullPointerException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {-2.22724678219715E-308};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:309) */
        singularValueDecompositionImpl.getCovariance(-2.22724678219715E-308);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.executesCondition {@code (dimension == 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code while((dimension < p) && (singularValues[dimension] >= minSingularValue))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getVT().walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
 * 
 *     @Override
 *     public void visit(final int row, final int column, final double value) {
 *         data[row][column] = value / singularValues[row];
 *     }
 * }, 0, dimension - 1, 0, p - 1);
 *  */
    @Test
    public void testGetCovariance_ThrowNullPointerException_3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.2250781024987833E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {-2.652514976E-315};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:309) */
        singularValueDecompositionImpl.getCovariance(-2.652514976E-315);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getCovariance(double)}
 * @utbot.executesCondition {@code (dimension == 0): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code while((dimension < p) && (singularValues[dimension] >= minSingularValue))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getVT().walkInOptimizedOrder(new DefaultRealMatrixPreservingVisitor() {
 * 
 *     @Override
 *     public void visit(final int row, final int column, final double value) {
 *         data[row][column] = value / singularValues[row];
 *     }
 * }, 0, dimension - 1, 0, p - 1);
 *  */
    @Test
    public void testGetCovariance_ThrowNullPointerException_4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {-8.741391586283328E-257};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(SingularValueDecompositionImpl.java:309) */
        singularValueDecompositionImpl.getCovariance(-8.741391586283328E-257);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNorm()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getNorm()}
 * @utbot.returnsFrom {@code return singularValues[0];}
 *  */
    @Test
    public void testGetNorm_Return0OfSingularValues() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        double actual = singularValueDecompositionImpl.getNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNorm()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getNorm()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return singularValues[0];
 *  */
    @Test
    public void testGetNorm_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm(SingularValueDecompositionImpl.java:325) */
        singularValueDecompositionImpl.getNorm();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getNorm()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return singularValues[0];
 *  */
    @Test
    public void testGetNorm_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm(SingularValueDecompositionImpl.java:325) */
        singularValueDecompositionImpl.getNorm();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSingularValues()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSingularValues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.returnsFrom {@code return singularValues.clone();}
 *  */
    @Test
    public void testGetSingularValues_ObjectClone() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {1.265E-321};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        double[] actual = singularValueDecompositionImpl.getSingularValues();
        
        double[] expected = {1.265E-321};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSingularValues()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSingularValues()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return singularValues.clone();
 *  */
    @Test
    public void testGetSingularValues_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues(SingularValueDecompositionImpl.java:229) */
        singularValueDecompositionImpl.getSingularValues();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRank()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getRank()}
 * @utbot.iterates iterate the loop {@code for(int i = singularValues.length - 1; i >= 0; --i)} once
 *  */
    @Test
    public void testGetRank_IOfSingularValuesGreaterThanThreshold() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {2.2774956425272075E-308};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        int actual = singularValueDecompositionImpl.getRank();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getRank()}
 * @utbot.iterates iterate the loop {@code for(int i = singularValues.length - 1; i >= 0; --i)} once
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetRank_IOfSingularValuesLessOrEqualThreshold() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {-0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        int actual = singularValueDecompositionImpl.getRank();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRank()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getRank()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double threshold = Math.max(m, n) * Math.ulp(singularValues[0]);
 *  */
    @Test
    public void testGetRank_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank(SingularValueDecompositionImpl.java:338) */
        singularValueDecompositionImpl.getRank();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getRank()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double threshold = Math.max(m, n) * Math.ulp(singularValues[0]);
 *  */
    @Test
    public void testGetRank_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank(SingularValueDecompositionImpl.java:338) */
        singularValueDecompositionImpl.getRank();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getV
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getV()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (cachedV == null): False}
 * @utbot.returnsFrom {@code return cachedV;}
 *  */
    @Test
    public void testGetV_CachedVNotEqualsNull() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        OpenMapRealMatrix cachedV = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedV", cachedV);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) singularValueDecompositionImpl.getV());
        
        int cachedVRows = ((Integer) getFieldValue(cachedV, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(cachedVRows, actualRows);
        
        int cachedVColumns = ((Integer) getFieldValue(cachedV, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(cachedVColumns, actualColumns);
        
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        assertNull(actualEntries);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getV()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNegativeArraySizeException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {3.337610787760802E-308, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] work = {-0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", work);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", work);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 14);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 14);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "work", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1839)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = new double[12];
        realEigenvalues[0] = -0.0;
        realEigenvalues[5] = -0.0;
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int p = singularValues.length;
 *  */
    @Test
    public void testGetV_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:238) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_5() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_6() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_7() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -252);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -252);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.0000000000000004};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 16);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 17);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.2250738585072014E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {java.lang.Double.NaN, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_8() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -254);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -254);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {4.9E-324};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {-0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (m >= n): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: eigenDecomposition.getV().getSubMatrix(0, n - 1, 0, p - 1)
 *  */
    @Test
    public void testGetV_ThrowNullPointerException_9() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 1);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getV] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1838)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242) */
        singularValueDecompositionImpl.getV();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getV()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getV()}
 * @utbot.executesCondition {@code (cachedV == null): True}
 * @utbot.executesCondition {@code (m >= n): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.EigenDecomposition#getV()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getSubMatrix(int,int,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: eigenDecomposition.getV().getSubMatrix(0, p - 1, 0, p - 1)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetV_ThrowMatrixIndexException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        BlockRealMatrix cachedV = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(cachedV, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "cachedV", cachedV);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        singularValueDecompositionImpl.getV();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSolver()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.invokes {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getRank()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getRank() == Math.max(m, n)
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        OpenMapRealMatrix cachedUt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedUt", cachedUt);
        OpenMapRealMatrix cachedV = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedV", cachedV);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank(SingularValueDecompositionImpl.java:338)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:352) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowNegativeArraySizeException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 1073741823);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1073741824);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        OpenMapRealMatrix cachedUt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedUt", cachedUt);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 1073741823);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 1073741824);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.0000000000000004};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        BlockRealMatrix cachedUt = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedUt", cachedUt);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.225073858507202E-308, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 2);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 2);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0, 0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        OpenMapRealMatrix cachedUt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedUt", cachedUt);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:162)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getSolver()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new Solver(singularValues, getUT(), getV(), getRank() == Math.max(m, n));
 *  */
    @Test
    public void testGetSolver_ThrowNullPointerException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 2.2250738585072014E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getU(SingularValueDecompositionImpl.java:189)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT(SingularValueDecompositionImpl.java:205)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver(SingularValueDecompositionImpl.java:351) */
        singularValueDecompositionImpl.getSolver();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getS()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getS()}
 * @utbot.executesCondition {@code (cachedS == null): False}
 * @utbot.returnsFrom {@code return cachedS;}
 *  */
    @Test
    public void testGetS_CachedSNotEqualsNull() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        OpenMapRealMatrix cachedS = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedS", cachedS);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) singularValueDecompositionImpl.getS());
        
        int cachedSRows = ((Integer) getFieldValue(cachedS, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(cachedSRows, actualRows);
        
        int cachedSColumns = ((Integer) getFieldValue(cachedS, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(cachedSColumns, actualColumns);
        
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        assertNull(actualEntries);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region Errors report for getS
    
    public void testGetS_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVT()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.executesCondition {@code (cachedVt == null): False}
 * @utbot.returnsFrom {@code return cachedVt;}
 *  */
    @Test
    public void testGetVT_CachedVtNotEqualsNull() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        OpenMapRealMatrix cachedVt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "cachedVt", cachedVt);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) singularValueDecompositionImpl.getVT());
        
        int cachedVtRows = ((Integer) getFieldValue(cachedVt, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(cachedVtRows, actualRows);
        
        int cachedVtColumns = ((Integer) getFieldValue(cachedVt, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(cachedVtColumns, actualColumns);
        
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        assertNull(actualEntries);
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getVT()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowNegativeArraySizeException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1737)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -252);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -252);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {-0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0, 0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] secondary = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "secondary", secondary);
        double[] realEigenvalues = new double[12];
        realEigenvalues[0] = 2.2250738586367177E-308;
        realEigenvalues[5] = -0.0;
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_4() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1732)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 2);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 2);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 3.337610787760802E-308};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0, 0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_1() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {2.225073858507202E-308, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1743)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_2() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", 255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", 256);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {java.lang.Double.NaN};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        double[] realEigenvalues = {0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "realEigenvalues", realEigenvalues);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", main);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.stationaryQuotientDifferenceWithShift(EigenDecompositionImpl.java:1864)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenvector(EigenDecompositionImpl.java:1772)
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1752)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:248)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getVT()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cachedVt = getV().transpose();
 *  */
    @Test
    public void testGetVT_ThrowNullPointerException_3() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "m", -255);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "n", -255);
        EigenDecompositionImpl eigenDecomposition = ((EigenDecompositionImpl) createInstance("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] main = {0.0, 0.0};
        setField(eigenDecomposition, "org.apache.commons.math.linear.EigenDecompositionImpl", "main", main);
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "eigenDecomposition", eigenDecomposition);
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.EigenDecompositionImpl.findEigenVectors(EigenDecompositionImpl.java:1739)
            org.apache.commons.math.linear.EigenDecompositionImpl.getV(EigenDecompositionImpl.java:260)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getV(SingularValueDecompositionImpl.java:242)
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT(SingularValueDecompositionImpl.java:284) */
        singularValueDecompositionImpl.getVT();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConditionNumber()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getConditionNumber()}
 * @utbot.returnsFrom {@code return singularValues[0] / singularValues[singularValues.length - 1];}
 *  */
    @Test
    public void testGetConditionNumber_Return0OfSingularValuesDivideSingularValuesLength1OfSingularValues() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {0.0};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        double actual = singularValueDecompositionImpl.getConditionNumber();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getConditionNumber()
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getConditionNumber()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return singularValues[0] / singularValues[singularValues.length - 1];
 *  */
    @Test
    public void testGetConditionNumber_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] singularValues = {};
        setField(singularValueDecompositionImpl, "org.apache.commons.math.linear.SingularValueDecompositionImpl", "singularValues", singularValues);
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber(SingularValueDecompositionImpl.java:331) */
        singularValueDecompositionImpl.getConditionNumber();
    }
    
    /**
    @utbot.classUnderTest {@link SingularValueDecompositionImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.SingularValueDecompositionImpl#getConditionNumber()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return singularValues[0] / singularValues[singularValues.length - 1];
 *  */
    @Test
    public void testGetConditionNumber_ThrowNullPointerException() throws Exception  {
        SingularValueDecompositionImpl singularValueDecompositionImpl = ((SingularValueDecompositionImpl) createInstance("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        
        /* This test fails because method [org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber(SingularValueDecompositionImpl.java:331) */
        singularValueDecompositionImpl.getConditionNumber();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields740163219463900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields740163219463900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass740163219495300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields740163219463900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass740163219495300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields740163220083000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields740163220083000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass740163220086900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields740163220083000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass740163220086900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

